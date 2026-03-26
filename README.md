<p align="center">
<a href="https://www.curseforge.com/minecraft/mc-mods/wooden-utilities">
  <img src="http://cf.way2muchnoise.eu/409871.svg" alt="Curseforge">
</a>
<a href="https://www.twitch.tv/moderngamingworld">
  <img src="https://img.shields.io/twitch/status/ModernGamingWorld?label=ModernGamingWorld&style=social" alt="Twitch Status">
</a>
<a href="https://discord.gg/EVA2pznvjb">
  <img src="https://img.shields.io/discord/912551516592816170?logo=Discord&label=Everlasting%20Creativity" alt="Discord">
</a>
</p>

<p align="center">
# Wooden Utilities
</p>

<p align="center">
Wooden Utilities adds wood-themed utility blocks to Minecraft — cauldrons, barrels, hoppers, chests, crafting slabs, anvils, and more — across 70+ wood types from vanilla, Twilight Forest, Biomes O' Plenty, Deep Aether, Aether, and Biomes We've Gone. All barrels and chests are GeckoLib-animated with open/close animations.
</p>

<p align="center">
## Features
</p>

<p align="center">
- <strong>Wooden Plates</strong> — 57+ variants across all supported mod ecosystems<br>
- <strong>Wooden Cauldrons</strong> — fluid processing (two 1000 mB tanks + item slot); KubeJS recipe support<br>
- <strong>Wooden Barrels</strong> — GeckoLib-animated; Sophisticated Storage compat (per-tier animated textures)<br>
- <strong>Wooden Chests</strong> — GeckoLib-animated single and double chests; Sophisticated Storage compat<br>
- <strong>Wooden Hoppers</strong> — item transport for all wood types<br>
- <strong>Wooden Crafting Table Slabs</strong> — opens a full crafting grid in slab form<br>
- <strong>Wooden Anvil</strong> — custom recipe type, KubeJS-compatible<br>
- <strong>Wooden Tools & Bucket</strong> — shears, wrench, hammer, and a fluid-carrying bucket<br>
- <strong>Sawdust</strong> — crafting ingredient
</p>

<p align="center">
## Mod Compatibility
</p>

<p align="center">
| Mod | Status |<br>
|-----|--------|<br>
| Twilight Forest | Hard support (6 wood types) |<br>
| Biomes O' Plenty | Hard support (13 wood types) |<br>
| Deep Aether | Hard support (5 wood types) |<br>
| Aether | Hard support (Skyroot) |<br>
| Biomes We've Gone | Hard support (25 wood types) |<br>
| Sophisticated Storage | Soft dependency — animated barrel/chest textures per SS upgrade tier |<br>
| JEI | Integration for cauldron and anvil recipe categories |
</p>

<p align="center">
## KubeJS Recipes
</p>

<p align="center">
See <strong>`wooden_anvil_kubejs_example.txt`</strong> at the repo root for anvil recipe examples.<br>
Cauldron recipe type: <strong>`woodenutilities:wooden_cauldron`</strong><br>
Anvil recipe type: <strong>`woodenutilities:wooden_anvil`</strong>
</p>

<p align="center">
## Development
</p>

<p align="center">
Multi-version via <a href="https://stonecutter.kikugie.dev/">Stonecutter 0.5.1</a>. Targets: <strong>Forge 1.20.1</strong> and <strong>NeoForge 1.21.1</strong>.
</p>

<p align="center">
<strong>Build all versions:</strong><br>
<pre>
gradle chiseledBuild
</pre>
</p>

<p align="center">
<strong>Build a single version:</strong><br>
<pre>
gradle "Set active project to 1.20.1-forge"
gradle clean build
# JARs at versions/1.20.1-forge/build/libs/
</pre>
</p>

<p align="center">
No Gradle wrapper is committed. Requires global Gradle installation (see <strong>`CLAUDE.md`</strong>).<br>
<strong>Asset generation:</strong> See <strong>`scripts/README.md`</strong> for the generation pipeline used when adding new wood types.
</p>

<p align="center">
  <a href="https://bisecthosting.com/ModernGamingWorld">
    <img width="1124" height="200" src="https://bisecthosting.com/images/CF/Wooden_Utilities/BH_WU_PromoCard.png">
  </a>
</p>

<p align="center">
Use code <strong>ModernGamingWorld</strong> for 25% off your first month at BisectHosting.
</p>
