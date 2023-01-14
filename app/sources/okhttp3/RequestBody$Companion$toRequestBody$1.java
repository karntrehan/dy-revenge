package okhttp3;

import p455g.p470y.p472d.C10457l;
import p493i.C10608g;
import p493i.C10616i;

public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
    final /* synthetic */ MediaType $contentType;
    final /* synthetic */ C10616i $this_toRequestBody;

    RequestBody$Companion$toRequestBody$1(C10616i iVar, MediaType mediaType) {
        this.$this_toRequestBody = iVar;
        this.$contentType = mediaType;
    }

    public long contentLength() {
        return (long) this.$this_toRequestBody.mo26420Y();
    }

    public MediaType contentType() {
        return this.$contentType;
    }

    public void writeTo(C10608g gVar) {
        C10457l.m35320e(gVar, "sink");
        gVar.mo26351d0(this.$this_toRequestBody);
    }
}
