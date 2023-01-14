package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.http2.Http2Connection;
import p455g.p470y.p472d.C10457l;

public final class Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 extends Http2Connection.Listener {
    Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1() {
    }

    public void onStream(Http2Stream http2Stream) {
        C10457l.m35320e(http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, (IOException) null);
    }
}
