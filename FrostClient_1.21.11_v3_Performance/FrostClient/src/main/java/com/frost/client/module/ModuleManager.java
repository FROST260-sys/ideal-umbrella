package com.frost.client.module;

import com.frost.client.modules.performance.*;
import com.frost.client.modules.anarchy.*;
import com.frost.client.modules.combat.*;
import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    private final List<Module> modules = new ArrayList<>();

    public void init() {
        // Performance & Low-End Anti-Lag
        modules.add(new EntityCulling());
        modules.add(new AsyncChunkLoader());
        modules.add(new ParticleLimiter());
        modules.add(new UnfocusedFPSLimiter());

        // Anarchy & CPvP (Rusherhack / Meteor Features)
        modules.add(new HoleESP());
        modules.add(new AutoWaypoints());
        modules.add(new OffhandManager());

        // Combat & Ghost PVP (Vape / Krypton Features)
        modules.add(new Backtrack());
        modules.add(new Hitboxes());
    }

    public List<Module> getModules() {
        return modules;
    }
}
