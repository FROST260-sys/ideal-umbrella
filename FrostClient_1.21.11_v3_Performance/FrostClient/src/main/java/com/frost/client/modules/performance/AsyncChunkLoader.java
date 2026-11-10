package com.frost.client.modules.performance;
import com.frost.client.module.Category;
import com.frost.client.module.Module;

public class AsyncChunkLoader extends Module {
    public AsyncChunkLoader() {
        super("Async Chunk Loader", "Offloads chunk mesh building to background threads to prevent micro-stutters.", Category.PERFORMANCE);
    }
}