package com.frost.client.modules.performance;
import com.frost.client.module.Category;
import com.frost.client.module.Module;

public class ParticleLimiter extends Module {
    public ParticleLimiter() {
        super("Particle Limiter", "Suppresses excessive particle rendering during combat explosions.", Category.PERFORMANCE);
    }
}