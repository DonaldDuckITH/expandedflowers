package com.donaldduckith.expandedflowers.registry;

import com.donaldduckith.expandedflowers.ExpandedFlowers;
import com.donaldduckith.expandedflowers.registry.services.CommonRegistryHelper;

import java.util.ServiceLoader;

public class ModServices {
    public static final CommonRegistryHelper REGISTRY = load(CommonRegistryHelper.class);

    public static <T> T load(Class<T> clazz) {
        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        ExpandedFlowers.LOGGER.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}
