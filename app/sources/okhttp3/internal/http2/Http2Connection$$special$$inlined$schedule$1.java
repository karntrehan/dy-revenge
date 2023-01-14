package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;
import p455g.p470y.p472d.C10452g;

public final class Http2Connection$$special$$inlined$schedule$1 extends Task {
    final /* synthetic */ String $name;
    final /* synthetic */ long $pingIntervalNanos$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Http2Connection$$special$$inlined$schedule$1(String str, String str2, Http2Connection http2Connection, long j) {
        super(str2, false, 2, (C10452g) null);
        this.$name = str;
        this.this$0 = http2Connection;
        this.$pingIntervalNanos$inlined = j;
    }

    public long runOnce() {
        boolean z;
        synchronized (this.this$0) {
            if (this.this$0.intervalPongsReceived < this.this$0.intervalPingsSent) {
                z = true;
            } else {
                Http2Connection http2Connection = this.this$0;
                http2Connection.intervalPingsSent = http2Connection.intervalPingsSent + 1;
                z = false;
            }
        }
        Http2Connection http2Connection2 = this.this$0;
        if (z) {
            http2Connection2.failConnection((IOException) null);
            return -1;
        }
        http2Connection2.writePing(false, 1, 0);
        return this.$pingIntervalNanos$inlined;
    }
}
