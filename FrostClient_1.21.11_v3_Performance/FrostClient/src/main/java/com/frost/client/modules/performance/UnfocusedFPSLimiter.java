package com.frost.client.modules.performance;
import com.frost.client.module.Category;
import com.frost.client.module.Module;

public class UnfocusedFPSLimiter extends Module {
    public UnfocusedFPSLimiter() {
        super("Unfocused FPS Reducer", "Drops FPS to 15 when game window is alt-tabbed to free CPU/RAM.", Category.PERFORMANCE);
    }
}