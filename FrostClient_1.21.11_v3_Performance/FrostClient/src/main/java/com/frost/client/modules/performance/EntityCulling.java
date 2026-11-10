package com.frost.client.modules.performance;
import com.frost.client.module.Category;
import com.frost.client.module.Module;

public class EntityCulling extends Module {
    public EntityCulling() {
        super("Entity Culling", "Skips rendering entities occluded by walls to boost FPS on low-end GPUs.", Category.PERFORMANCE);
    }
}