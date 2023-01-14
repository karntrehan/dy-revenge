package okhttp3;

import p493i.C10615h;

public final class ResponseBody$Companion$asResponseBody$1 extends ResponseBody {
    final /* synthetic */ long $contentLength;
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ C10615h $this_asResponseBody;

    ResponseBody$Companion$asResponseBody$1(C10615h hVar, MediaType mediaType, long j) {
        this.$this_asResponseBody = hVar;
        this.$contentType = mediaType;
        this.$contentLength = j;
    }

    public long contentLength() {
        return this.$contentLength;
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    public C10615h source() {
        return this.$this_asResponseBody;
    }
}
