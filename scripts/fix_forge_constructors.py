"""
Fix constructor argument order in the Forge section of ModBlocks.java.
Forge 1.20.1 uses (Properties, BlockSetType/WoodType) order (Properties first).
NeoForge 1.21.1 uses (BlockSetType/WoodType, Properties) order.
The agent wrote the Forge section with NeoForge order - this script fixes it.
Also replaces WoodButtonBlock with ButtonBlock for Forge.
"""

import re
from pathlib import Path

REPO_ROOT = Path(__file__).parent.parent
FILE = REPO_ROOT / "src" / "main" / "java" / "com" / "moderngamingworld" / "woodenutilities" / "registry" / "ModBlocks.java"

content = FILE.read_text(encoding="utf-8")

# Track changes
changes = []

# ── 1. Fix the import: remove WoodButtonBlock conditional, add ButtonBlock unconditionally
# Current:
# //? if neoforge {
# /*import net.minecraft.world.level.block.ButtonBlock;
# *///?} else {
# import net.minecraft.world.level.block.WoodButtonBlock;
# //?}
OLD_IMPORT = (
    "//? if neoforge {\n"
    "/*import net.minecraft.world.level.block.ButtonBlock;\n"
    "*///?} else {\n"
    "import net.minecraft.world.level.block.WoodButtonBlock;\n"
    "//?}"
)
NEW_IMPORT = "import net.minecraft.world.level.block.ButtonBlock;"

if OLD_IMPORT in content:
    content = content.replace(OLD_IMPORT, NEW_IMPORT)
    changes.append("Fixed ButtonBlock import (removed WoodButtonBlock conditional)")
else:
    print("WARNING: ButtonBlock import pattern not found")

# Helper: in Forge section, lines use BlockBehaviour.Properties.copy(...)
# In NeoForge section, they use BlockBehaviour.Properties.ofFullCopy(...)
# We only want to change the .copy() variants (Forge section).

PROPS = r"BlockBehaviour\.Properties\.copy\([^)]+\)"

# ── 2. FenceGateBlock: (WoodType, Props) → (Props, WoodType)
# Pattern: new FenceGateBlock(ModWoodTypes.XXXX, BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE))
def fix_fence_gate(m):
    wood_type = m.group(1)
    props = m.group(2)
    return f"new FenceGateBlock({props}, {wood_type})"

old_count = content.count("new FenceGateBlock(ModWoodTypes.")
pattern_fg = re.compile(
    r"new FenceGateBlock\((ModWoodTypes\.\w+),\s*(BlockBehaviour\.Properties\.copy\([^)]+\))\)"
)
content = pattern_fg.sub(fix_fence_gate, content)
new_count = sum(1 for _ in pattern_fg.finditer(content))
changes.append(f"FenceGateBlock: fixed {old_count - new_count} instances (Forge section)")

# ── 3. WoodButtonBlock → ButtonBlock with reordered args
# Pattern: new WoodButtonBlock(BlockSetType.OAK, BlockBehaviour.Properties.copy(...))
# → new ButtonBlock(BlockBehaviour.Properties.copy(...), BlockSetType.OAK, 30, true)
def fix_button(m):
    props = m.group(1)
    return f"new ButtonBlock({props}, BlockSetType.OAK, 30, true)"

old_count = content.count("new WoodButtonBlock(")
pattern_btn = re.compile(
    r"new WoodButtonBlock\(BlockSetType\.OAK,\s*(BlockBehaviour\.Properties\.copy\([^)]+\))\)"
)
content = pattern_btn.sub(fix_button, content)
new_count = content.count("new WoodButtonBlock(")
changes.append(f"WoodButtonBlock→ButtonBlock: fixed {old_count - new_count} instances (Forge section)")

# ── 4. DoorBlock: (BlockSetType, Props) → (Props, BlockSetType)
# Pattern: new DoorBlock(BlockSetType.OAK, BlockBehaviour.Properties.copy(Blocks.OAK_DOOR))
def fix_door(m):
    props = m.group(1)
    return f"new DoorBlock({props}, BlockSetType.OAK)"

old_count = content.count("new DoorBlock(BlockSetType.OAK,")
pattern_door = re.compile(
    r"new DoorBlock\(BlockSetType\.OAK,\s*(BlockBehaviour\.Properties\.copy\([^)]+\))\)"
)
content = pattern_door.sub(fix_door, content)
new_count = content.count("new DoorBlock(BlockSetType.OAK,")
changes.append(f"DoorBlock: fixed {old_count - new_count} instances (Forge section)")

# ── 5. TrapDoorBlock: (BlockSetType, Props) → (Props, BlockSetType)
def fix_trapdoor(m):
    props = m.group(1)
    return f"new TrapDoorBlock({props}, BlockSetType.OAK)"

old_count = content.count("new TrapDoorBlock(BlockSetType.OAK,")
pattern_trap = re.compile(
    r"new TrapDoorBlock\(BlockSetType\.OAK,\s*(BlockBehaviour\.Properties\.copy\([^)]+\))\)"
)
content = pattern_trap.sub(fix_trapdoor, content)
new_count = content.count("new TrapDoorBlock(BlockSetType.OAK,")
changes.append(f"TrapDoorBlock: fixed {old_count - new_count} instances (Forge section)")

# ── 6. CeilingHangingSignBlock: (WoodType, Props) → (Props, WoodType)
def fix_ceiling_sign(m):
    wood_type = m.group(1)
    props = m.group(2)
    return f"new CeilingHangingSignBlock({props}, {wood_type})"

old_count = content.count("new CeilingHangingSignBlock(ModWoodTypes.")
pattern_cs = re.compile(
    r"new CeilingHangingSignBlock\((ModWoodTypes\.\w+),\s*(BlockBehaviour\.Properties\.copy\([^)]+\))\)"
)
content = pattern_cs.sub(fix_ceiling_sign, content)
new_count = sum(1 for _ in pattern_cs.finditer(content))
changes.append(f"CeilingHangingSignBlock: fixed {old_count - new_count} instances (Forge section)")

# ── 7. WallHangingSignBlock: (WoodType, Props) → (Props, WoodType)
def fix_wall_hanging_sign(m):
    wood_type = m.group(1)
    props = m.group(2)
    return f"new WallHangingSignBlock({props}, {wood_type})"

old_count = content.count("new WallHangingSignBlock(ModWoodTypes.")
pattern_whs = re.compile(
    r"new WallHangingSignBlock\((ModWoodTypes\.\w+),\s*(BlockBehaviour\.Properties\.copy\([^)]+\))\)"
)
content = pattern_whs.sub(fix_wall_hanging_sign, content)
new_count = sum(1 for _ in pattern_whs.finditer(content))
changes.append(f"WallHangingSignBlock: fixed {old_count - new_count} instances (Forge section)")

# Write back
FILE.write_text(content, encoding="utf-8")
print("Fixed ModBlocks.java:")
for c in changes:
    print(f"  {c}")
print("Done.")
