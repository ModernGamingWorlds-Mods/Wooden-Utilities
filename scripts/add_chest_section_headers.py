"""Add ecosystem section headers to chest block registrations."""
import os
ROOT = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
path = os.path.join(ROOT, "src", "main", "java", "com", "moderngamingworld",
                    "woodenutilities", "registry", "ModBlocks.java")
with open(path, encoding="utf-8") as f:
    src = f.read()

TF_H  = "    // \u2500\u2500 Twilight Forest \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n"
BOP_H = "    // \u2500\u2500 Biomes O'Plenty \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n"
DA_H  = "    // \u2500\u2500 Deep Aether \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n"
AE_H  = "    // \u2500\u2500 Aether \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n"
BWG_H = "    // \u2500\u2500 Biomes We've Gone \u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2500\n"

for holder_type in ["DeferredHolder<Block, Block>", "RegistryObject<Block>"]:
    prefix = f"    public static final {holder_type} "
    transitions = [
        ("TWILIGHT_OAK_WOODEN_CHEST", TF_H),
        ("FIR_WOODEN_CHEST", BOP_H),
        ("ROSEROOT_WOODEN_CHEST", DA_H),
        ("SKYROOT_WOODEN_CHEST", AE_H),
        ("ASPEN_WOODEN_CHEST", BWG_H),
    ]
    for field_name, header in transitions:
        anchor = prefix + field_name + " = BLOCKS.register"
        if anchor in src:
            src = src.replace(anchor, "\n" + header + anchor, 1)
            print(f"OK: Before {field_name} ({holder_type[:15]})")
        else:
            print(f"MISSING: {field_name} ({holder_type[:15]})")

with open(path, "w", encoding="utf-8") as f:
    f.write(src)
print("Done")
