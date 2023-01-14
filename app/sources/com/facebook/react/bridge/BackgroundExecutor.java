package com.facebook.react.bridge;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class BackgroundExecutor {
    private static final String TAG = "FabricBackgroundExecutor";
    private final ExecutorService mExecutorService = Executors.newFixedThreadPool(1);

    @C6410a
    private BackgroundExecutor() {
    }

    @C6410a
    private void queueRunnable(Runnable runnable) {
        ReactNoCrashSoftException reactNoCrashSoftException;
        if (runnable == null) {
            reactNoCrashSoftException = new ReactNoCrashSoftException("runnable is null");
        } else {
            ExecutorService executorService = this.mExecutorService;
            if (executorService == null) {
                reactNoCrashSoftException = new ReactNoCrashSoftException("executorService is null");
            } else {
                executorService.execute(runnable);
                return;
            }
        }
        ReactSoftExceptionLogger.logSoftException(TAG, reactNoCrashSoftException);
    }
}
