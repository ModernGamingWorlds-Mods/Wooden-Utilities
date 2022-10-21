package io.github.moderngamingworlds_mods.woodenutilities.common.util;

import io.github.moderngamingworlds_mods.woodenutilities.common.init.ModWoodType;
import net.minecraftforge.registries.RegistryObject;

import java.util.*;

public final class WoodTypeObjectMap<T> {

    private final Map<ModWoodType, RegistryObject<T>> map;

    public WoodTypeObjectMap(Map<ModWoodType, RegistryObject<T>> map) {
        this.map = map;
    }

    public RegistryObject<T> get(ModWoodType type) {
        return map.get(type);
    }

    public T getRaw(ModWoodType type) {
        return map.get(type).get();
    }

    public Collection<RegistryObject<T>> getAll() {
        return Collections.unmodifiableCollection(map.values());
    }
}
