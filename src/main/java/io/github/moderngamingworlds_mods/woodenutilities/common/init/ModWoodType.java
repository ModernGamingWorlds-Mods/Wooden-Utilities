package io.github.moderngamingworlds_mods.woodenutilities.common.init;

import io.github.moderngamingworlds_mods.woodenutilities.common.util.WoodItemSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.fml.ModList;

import java.util.ArrayList;
import java.util.List;

public enum ModWoodType {

    // VANILLA
    MC_OAK      ("oak",      Items.OAK_PLANKS),
    MC_SPRUCE   ("spruce",   Items.SPRUCE_PLANKS),
    MC_BIRCH    ("birch",    Items.BIRCH_PLANKS),
    MC_ACACIA   ("acacia",   Items.ACACIA_PLANKS),
    MC_JUNGLE   ("jungle",   Items.JUNGLE_PLANKS),
    MC_DARK_OAK ("dark_oak", Items.DARK_OAK_PLANKS),
    MC_CRIMSON  ("crimson",  Items.CRIMSON_PLANKS),
    MC_WARPED   ("warped",   Items.WARPED_PLANKS),

    // HEXEREI
    //HEX_WILLOW  ("willow",   "hexerei", "willow_planks"),
    //HEX_MAHOGANY("mahogany", "hexerei", "mahogany_planks"),

    // UNDERGARDEN
    //UG_GRONGLE      ("grongle",    "undergarden", "grongle_planks"),
    //UG_WIGGLEWOOD   ("wigglewood", "undergarden", "wigglewood_planks"),
    //UG_SMOGSTEM     ("smogstem",   "undergarden", "smogstem_planks"),

    // FORBIDDEN AND ARCANUS
    //FA_EDELWOOD ("edelwood", "forbidden_arcanus", "edelwood_planks"),
    //FA_AURUM    ("aurum",    "forbidden_arcanus", "aurum_planks"),
    //FA_CHERRY   ("cherry",   "forbidden_arcanus", "cherry_planks"),
    //FA_FUNGYSS  ("fungyss",  "forbidden_arcanus", "fungyss_planks"),

    // ENGINEER'S DECOR
    //ED_OLD_INDUSTRIAL_WOOD("old_industrial_wood", "engineersdecor", "old_industrial_wood_planks"),

    // NATURE'S AURA
    //NA_ANCIENT("ancient", "naturesaura", "ancient_planks"),

    // TWILIGHT_FOREST
    //TF_TOWERWOOD    ("towerwood",    "twilightforest", "towerwood"),
    //TF_TWILIGHT_OAK ("twilight_oak", "twilightforest", "twilight_oak_planks"),
    //TF_CANOPY       ("canopy",       "twilightforest", "canopy_planks"),
    //TF_MANGROVE     ("mangrove",     "twilightforest", "mangrove_planks"),
    //TF_DARK         ("dark",         "twilightforest", "dark_planks"),

    // QUARK
    //QUARK_BLOSSOM("blossom", "quark", "blossom_planks"),

    // BIOMES O PLENTY
    //BOP_HELLBARK    ("hellbark",  "biomesoplenty", "hellbark_planks"),
    //BOP_UMBRAN      ("umbran",    "biomesoplenty", "umbran_planks"),
    //BOP_MAGIC       ("magic",     "biomesoplenty", "magic_planks"),
    //BOP_DEAD        ("dead",      "biomesoplenty", "dead_planks"),
    //BOP_WILLOW      ("willow",    "biomesoplenty", "willow_planks"),
    //BOP_PALM        ("palm",      "biomesoplenty", "palm_planks"),
    //BOP_JACARANDA   ("jacaranda", "biomesoplenty", "jacaranda_planks"),
    //BOP_MAHOGANY    ("mahogany",  "biomesoplenty", "mahogany_planks"),
    //BOP_CHERRY      ("cherry",    "biomesoplenty", "cherry_planks"),
    //BOP_REDWOOD     ("redwood",   "biomesoplenty", "redwood_planks"),
    //BOP_FIR         ("fir",       "biomesoplenty", "fir_planks"),

    // IMMERSIVE ENGINEERING
    //IE_TREATED_WOOD("treated_wood", "immersiveengineering", "treated_wood_horizontal")

    // BIOMES YOU'LL GO
    //BYG_ASPEN               ("aspen",              "byg", "aspen_planks"),
    //BYG_BAOBAB              ("baobab",             "byg", "baobab_planks"),
    //BYG_BLUE_ENCHANTED      ("blue_enchanted",     "byg", "blue_enchanted_planks"),
    //BYG_BULBIS              ("bulbis",             "byg", "bulbis_planks"),
    //BYG_CHERRY              ("cherry",             "byg", "cherry_planks"),
    //BYG_CIKA                ("cika",               "byg", "cika_planks"),
    //BYG_CYPRESS             ("cypress",            "byg", "cypress_planks"),
    //BYG_EBONY               ("ebony",              "byg", "ebony_planks"),
    //BYG_EMBUR               ("embur",              "byg", "embur_planks"),
    //BYG_ETHER               ("ether",              "byg", "ether_planks"),
    //BYG_FIR                 ("fir",                "byg", "fir_planks"),
    //BYG_GREEN_ENCHANTED     ("green_enchanted",    "byg", "green_enchanted_planks"),
    //BYG_HOLLY               ("holly",              "byg", "holly_planks"),
    //BYG_IMPARIUS            ("imparius",           "byg", "imparius_planks"),
    //BYG_JACARANDA           ("jacaranda",          "byg", "jacaranda_planks"),
    //BYG_LAMENT              ("lament",             "byg", "lament_planks"),
    //BYG_MAHOGANY            ("mahogany",           "byg", "mahogany_planks"),
    //BYG_MAPLE               ("maple",              "byg", "maple_planks"),
    //BYG_NIGHTSHADE          ("nightshade",         "byg", "nightshade_planks"),
    //BYG_PALM                ("palm",               "byg", "palm_planks"),
    //BYG_PINE                ("pine",               "byg", "pine_planks"),
    //BYG_RAINBOW_EUCALYPTUS  ("rainbow_eucalyptus", "byg", "rainbow_eucalyptus_planks"),
    //BYG_REDWOOD             ("redwood",            "byg", "redwood_planks"),
    //BYG_SKYRIS              ("skyris",             "byg", "skyris_planks"),
    //BYG_SYTHIAN             ("sythian",            "byg", "sythian_planks"),
    //BYG_WHITE_MANGROVE      ("white_mangrove",     "byg", "white_mangrove_planks"),
    //BYG_WILLOW              ("willow",             "byg", "willow_planks"),
    //BYG_WITCH_HAZEL         ("witch_hazel",        "byg", "witch_hazel_planks"),
    //BYG_ZELKOVA             ("zelkova",            "byg", "zelkova_planks"),
    ;

    private final String name;
    private final String uniqueName;
    private final String mod;
    private final boolean vanilla;
    private final List<ModWoodType> duplicatedBy = new ArrayList<>();
    private final WoodItemSet planksSet;
    private Boolean available = null;

    ModWoodType(String name, Item planksItem) {
        this.name = name;
        this.uniqueName = name;
        this.mod = "minecraft";
        this.vanilla = true;
        this.planksSet = new WoodItemSet(this, "planks", planksItem);
        this.available = true;
    }

    ModWoodType(String name, String mod, String planksItem) {
        this.name = name;
        this.uniqueName = mod + "_" + name;
        this.mod = mod;
        this.vanilla = false;
        this.planksSet = new WoodItemSet(this, "planks", mod, planksItem);
    }

    public String getSharedName() {
        return name;
    }

    public String getName() {
        return uniqueName;
    }

    public WoodItemSet getPlanksItem() {
        return planksSet;
    }

    public boolean isVanilla() {
        return vanilla;
    }

    public boolean isAvailable() {
        if (this.available == null) {
            this.available = ModList.get().isLoaded(mod);

            if (this.available && !this.duplicatedBy.isEmpty()) {
                for (ModWoodType type : this.duplicatedBy) {
                    if (type.ordinal() < this.ordinal() && type.isAvailable()) {
                        this.available = false;
                    }
                }
            }
        }
        return this.available;
    }



    static {
        ModWoodType[] types = values();
        for (ModWoodType type : types) {
            for (ModWoodType otherType : types) {
                if (type == otherType) {
                    continue;
                }

                if (type.name.equals(otherType.name)) {
                    type.duplicatedBy.add(otherType);
                    type.planksSet.add(otherType.planksSet);
                }
            }
        }
    }
}
