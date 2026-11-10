package com.frost.client;

import com.frost.client.module.ModuleManager;
import com.frost.client.engine.PerformanceEngine;
import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FrostClient implements ClientModInitializer {
    public static final String NAME = "Frost Client";
    public static final String VERSION = "1.2.0-PERFORMANCE";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    private static FrostClient INSTANCE;
    private ModuleManager moduleManager;

    @Override
    public void onInitializeClient() {
        INSTANCE = this;
        LOGGER.info("Initializing {} v{} for Minecraft 1.21.11", NAME, VERSION);
        
        // Initialize Low-End Performance Engine (Thread Offloader & Object Pool)
        PerformanceEngine.init();
        
        this.moduleManager = new ModuleManager();
        this.moduleManager.init();
    }

    public static FrostClient getInstance() {
        return INSTANCE;
    }

    public ModuleManager getModuleManager() {
        return moduleManager;
    }
}
