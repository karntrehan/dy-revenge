package okhttp3.internal.http;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import p455g.p470y.p472d.C10457l;
import p493i.C10615h;

public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final C10615h source;

    public RealResponseBody(String str, long j, C10615h hVar) {
        C10457l.m35320e(hVar, "source");
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = hVar;
    }

    public long contentLength() {
        return this.contentLength;
    }

    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    public C10615h source() {
        return this.source;
    }
}
