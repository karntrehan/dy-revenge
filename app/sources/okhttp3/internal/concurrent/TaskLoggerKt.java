package okhttp3.internal.concurrent;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.Http2Connection;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p472d.C10456k;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10471z;

public final class TaskLoggerKt {
    public static final String formatDuration(long j) {
        StringBuilder sb;
        long j2;
        long j3;
        StringBuilder sb2;
        long j4;
        if (j <= ((long) -999500000)) {
            sb = new StringBuilder();
            j2 = j - ((long) 500000000);
        } else {
            if (j <= ((long) -999500)) {
                sb = new StringBuilder();
                j3 = j - ((long) 500000);
            } else {
                if (j <= 0) {
                    sb2 = new StringBuilder();
                    j4 = j - ((long) 500);
                } else if (j < ((long) 999500)) {
                    sb2 = new StringBuilder();
                    j4 = j + ((long) 500);
                } else if (j < ((long) 999500000)) {
                    j3 = j + ((long) 500000);
                } else {
                    sb = new StringBuilder();
                    j2 = j + ((long) 500000000);
                }
                sb2.append(j4 / ((long) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
                sb2.append(" µs");
                String sb3 = sb2.toString();
                C10471z zVar = C10471z.f27629a;
                String format = String.format("%6s", Arrays.copyOf(new Object[]{sb3}, 1));
                C10457l.m35319d(format, "java.lang.String.format(format, *args)");
                return format;
            }
            sb2.append(j3 / ((long) 1000000));
            sb2.append(" ms");
            String sb32 = sb2.toString();
            C10471z zVar2 = C10471z.f27629a;
            String format2 = String.format("%6s", Arrays.copyOf(new Object[]{sb32}, 1));
            C10457l.m35319d(format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        sb2.append(j2 / ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
        sb2.append(" s ");
        String sb322 = sb2.toString();
        C10471z zVar22 = C10471z.f27629a;
        String format22 = String.format("%6s", Arrays.copyOf(new Object[]{sb322}, 1));
        C10457l.m35319d(format22, "java.lang.String.format(format, *args)");
        return format22;
    }

    /* access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.Companion.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName$okhttp());
        sb.append(' ');
        C10471z zVar = C10471z.f27629a;
        String format = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        C10457l.m35319d(format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, C10419a<? extends T> aVar) {
        long j;
        C10457l.m35320e(task, "task");
        C10457l.m35320e(taskQueue, "queue");
        C10457l.m35320e(aVar, "block");
        boolean isLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (isLoggable) {
            j = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            j = -1;
        }
        try {
            T invoke = aVar.invoke();
            C10456k.m35315b(1);
            if (isLoggable) {
                log(task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            C10456k.m35314a(1);
            return invoke;
        } catch (Throwable th) {
            C10456k.m35315b(1);
            if (isLoggable) {
                log(task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - j));
            }
            C10456k.m35314a(1);
            throw th;
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, C10419a<String> aVar) {
        C10457l.m35320e(task, "task");
        C10457l.m35320e(taskQueue, "queue");
        C10457l.m35320e(aVar, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, aVar.invoke());
        }
    }
}
