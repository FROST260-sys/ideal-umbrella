package com.frost.client.engine;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * PerformanceEngine isolates heavy raycasting, chunk scanning, and entity searching
 * into asynchronous background worker threads, keeping render FPS high and frame times low.
 */
public class PerformanceEngine {
    private static final ExecutorService WORKER_POOL = Executors.newFixedThreadPool(
        Math.max(1, Runtime.getRuntime().availableProcessors() - 1)
    );

    public static void init() {
        System.out.println("[Frost Performance Engine] Initialized worker thread pool for low-end hardware.");
    }

    public static void runAsync(Runnable task) {
        WORKER_POOL.submit(task);
    }
}
