"""
run_gen.py — Master driver for new-wood resource generation.

Run from repo root:
    python scripts/run_gen.py

Runs all generation scripts in dependency order. Safe to re-run (all scripts
overwrite their outputs deterministically).
"""

import subprocess
import sys
from pathlib import Path

SCRIPTS = [
    "scripts/copy_assets.py",
    "scripts/gen_blockstates.py",
    "scripts/gen_block_models.py",
    "scripts/gen_item_models.py",
    "scripts/gen_recipes.py",
    "scripts/gen_loot_tables.py",
    "scripts/gen_lang.py",
    "scripts/gen_tags.py",
    "scripts/gen_worldgen.py",
]


def main():
    root = Path(__file__).parent.parent
    python = sys.executable
    failed = []

    for script in SCRIPTS:
        path = root / script
        if not path.exists():
            print(f"[SKIP] {script} (not found)")
            continue
        print(f"[RUN]  {script}")
        result = subprocess.run([python, str(path)], cwd=str(root))
        if result.returncode != 0:
            print(f"[FAIL] {script} exited with code {result.returncode}")
            failed.append(script)

    if failed:
        print(f"\n{len(failed)} script(s) failed: {', '.join(failed)}")
        sys.exit(1)
    else:
        print(f"\nAll {len(SCRIPTS)} scripts completed successfully.")


if __name__ == "__main__":
    main()
