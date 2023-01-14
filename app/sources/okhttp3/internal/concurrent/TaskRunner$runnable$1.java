package okhttp3.internal.concurrent;

import java.util.logging.Level;
import p455g.C10323s;
import p455g.p470y.p472d.C10457l;

public final class TaskRunner$runnable$1 implements Runnable {
    final /* synthetic */ TaskRunner this$0;

    TaskRunner$runnable$1(TaskRunner taskRunner) {
        this.this$0 = taskRunner;
    }

    public void run() {
        Task awaitTaskToRun;
        while (true) {
            synchronized (this.this$0) {
                awaitTaskToRun = this.this$0.awaitTaskToRun();
            }
            if (awaitTaskToRun != null) {
                TaskQueue queue$okhttp = awaitTaskToRun.getQueue$okhttp();
                C10457l.m35317b(queue$okhttp);
                long j = -1;
                boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
                if (isLoggable) {
                    j = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime();
                    TaskLoggerKt.log(awaitTaskToRun, queue$okhttp, "starting");
                }
                try {
                    this.this$0.runTask(awaitTaskToRun);
                    C10323s sVar = C10323s.f27547a;
                    if (isLoggable) {
                        long nanoTime = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - j;
                        TaskLoggerKt.log(awaitTaskToRun, queue$okhttp, "finished run in " + TaskLoggerKt.formatDuration(nanoTime));
                    }
                } catch (Throwable th) {
                    if (isLoggable) {
                        long nanoTime2 = queue$okhttp.getTaskRunner$okhttp().getBackend().nanoTime() - j;
                        TaskLoggerKt.log(awaitTaskToRun, queue$okhttp, "failed a run in " + TaskLoggerKt.formatDuration(nanoTime2));
                    }
                    throw th;
                }
            } else {
                return;
            }
        }
    }
}
