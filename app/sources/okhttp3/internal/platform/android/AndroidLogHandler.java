package okhttp3.internal.platform.android;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import p455g.p470y.p472d.C10457l;

public final class AndroidLogHandler extends Handler {
    public static final AndroidLogHandler INSTANCE = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        C10457l.m35320e(logRecord, "record");
        AndroidLog androidLog = AndroidLog.INSTANCE;
        String loggerName = logRecord.getLoggerName();
        C10457l.m35319d(loggerName, "record.loggerName");
        int access$getAndroidLevel$p = AndroidLogKt.getAndroidLevel(logRecord);
        String message = logRecord.getMessage();
        C10457l.m35319d(message, "record.message");
        androidLog.androidLog$okhttp(loggerName, access$getAndroidLevel$p, message, logRecord.getThrown());
    }
}
