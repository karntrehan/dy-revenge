package com.facebook.react.bridge.queue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public interface MessageQueueThread {
    @C6410a
    void assertIsOnThread();

    @C6410a
    void assertIsOnThread(String str);

    @C6410a
    <T> Future<T> callOnQueue(Callable<T> callable);

    @C6410a
    MessageQueueThreadPerfStats getPerfStats();

    @C6410a
    boolean isOnThread();

    @C6410a
    void quitSynchronous();

    @C6410a
    void resetPerfStats();

    @C6410a
    void runOnQueue(Runnable runnable);
}
