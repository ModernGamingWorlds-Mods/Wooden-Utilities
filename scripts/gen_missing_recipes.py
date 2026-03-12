"""Generate missing recipes for the 14 new wood types."""
import json
import os

WOODS = [
    "african_blackwood", "banyan", "black_walnut", "bloodwood",
    "bristlecone_pine", "cork_oak", "dragon_blood", "kapok",
    "larch", "sandalwood", "sycamore", "teak", "wenge", "zebrawood",
]

RECIPE_DIR = os.path.join(os.path.dirname(__file__), "..",
    "src", "main", "resources", "data", "woodenutilities", "recipes")
ANVIL_DIR = os.path.join(RECIPE_DIR, "wooden_anvil")

MOD = "woodenutilities"

def write_json(path, data):
    os.makedirs(os.path.dirname(path), exist_ok=True)
    with open(path, "w") as f:
        json.dump(data, f, indent=2)
        f.write("\n")
    print(f"  Created: {os.path.basename(path)}")

def gen_wood_recipe(wood):
    """4 logs → 3 wood blocks."""
    return {
        "type": "minecraft:crafting_shaped",
        "pattern": ["##", "##"],
        "key": {"#": {"item": f"{MOD}:{wood}_log"}},
        "result": {"item": f"{MOD}:{wood}_wood", "count": 3}
    }

def gen_stripped_wood_recipe(wood):
    """4 stripped logs → 3 stripped wood blocks."""
    return {
        "type": "minecraft:crafting_shaped",
        "pattern": ["##", "##"],
        "key": {"#": {"item": f"{MOD}:stripped_{wood}_log"}},
        "result": {"item": f"{MOD}:stripped_{wood}_wood", "count": 3}
    }

def gen_cauldron_recipe(wood):
    """Plates + planks → cauldron."""
    return {
        "type": "minecraft:crafting_shaped",
        "pattern": ["P P", "P P", "LLL"],
        "key": {
            "P": {"item": f"{MOD}:{wood}_wooden_plate"},
            "L": {"item": f"{MOD}:{wood}_planks"}
        },
        "result": {"item": f"{MOD}:{wood}_wooden_cauldron"}
    }

def gen_hopper_recipe(wood):
    """Plates + chest → hopper."""
    return {
        "type": "minecraft:crafting_shaped",
        "pattern": ["P P", "PCP", " P "],
        "key": {
            "P": {"item": f"{MOD}:{wood}_wooden_plate"},
            "C": {"item": "minecraft:chest"}
        },
        "result": {"item": f"{MOD}:{wood}_wooden_hopper"}
    }

def gen_crafting_table_recipe(wood):
    """4 planks → crafting table."""
    return {
        "type": "minecraft:crafting_shaped",
        "pattern": ["PP", "PP"],
        "key": {"P": {"item": f"{MOD}:{wood}_planks"}},
        "result": {"item": f"{MOD}:{wood}_wooden_crafting_table"}
    }

def gen_anvil_plate_recipe(wood):
    """Planks → 2 plates (via wooden anvil)."""
    return {
        "type": "woodenutilities:wooden_anvil",
        "input": {"item": f"{MOD}:{wood}_planks"},
        "result": {"item": f"{MOD}:{wood}_wooden_plate", "count": 2}
    }

def main():
    count = 0
    for wood in WOODS:
        print(f"\n{wood}:")

        # Wood block recipe
        path = os.path.join(RECIPE_DIR, f"{wood}_wood.json")
        if not os.path.exists(path):
            write_json(path, gen_wood_recipe(wood))
            count += 1

        # Stripped wood recipe
        path = os.path.join(RECIPE_DIR, f"stripped_{wood}_wood.json")
        if not os.path.exists(path):
            write_json(path, gen_stripped_wood_recipe(wood))
            count += 1

        # Cauldron recipe
        path = os.path.join(RECIPE_DIR, f"{wood}_wooden_cauldron.json")
        if not os.path.exists(path):
            write_json(path, gen_cauldron_recipe(wood))
            count += 1

        # Hopper recipe
        path = os.path.join(RECIPE_DIR, f"{wood}_wooden_hopper.json")
        if not os.path.exists(path):
            write_json(path, gen_hopper_recipe(wood))
            count += 1

        # Crafting table recipe
        path = os.path.join(RECIPE_DIR, f"{wood}_wooden_crafting_table.json")
        if not os.path.exists(path):
            write_json(path, gen_crafting_table_recipe(wood))
            count += 1

        # Wooden anvil plate recipe
        path = os.path.join(ANVIL_DIR, f"{wood}.json")
        if not os.path.exists(path):
            write_json(path, gen_anvil_plate_recipe(wood))
            count += 1

    print(f"\nDone! Created {count} recipe files.")

if __name__ == "__main__":
    main()
