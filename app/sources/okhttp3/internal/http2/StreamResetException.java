package okhttp3.internal.http2;

import java.io.IOException;
import p455g.p470y.p472d.C10457l;

public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode2) {
        super("stream was reset: " + errorCode2);
        C10457l.m35320e(errorCode2, "errorCode");
        this.errorCode = errorCode2;
    }
}
