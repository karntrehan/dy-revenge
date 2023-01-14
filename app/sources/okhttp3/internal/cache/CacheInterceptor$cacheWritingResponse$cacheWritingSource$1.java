package okhttp3.internal.cache;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import p455g.p470y.p472d.C10457l;
import p493i.C10598d0;
import p493i.C10600e0;
import p493i.C10603f;
import p493i.C10608g;
import p493i.C10615h;

public final class CacheInterceptor$cacheWritingResponse$cacheWritingSource$1 implements C10598d0 {
    final /* synthetic */ C10608g $cacheBody;
    final /* synthetic */ CacheRequest $cacheRequest;
    final /* synthetic */ C10615h $source;
    private boolean cacheRequestClosed;

    CacheInterceptor$cacheWritingResponse$cacheWritingSource$1(C10615h hVar, CacheRequest cacheRequest, C10608g gVar) {
        this.$source = hVar;
        this.$cacheRequest = cacheRequest;
        this.$cacheBody = gVar;
    }

    public void close() {
        if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            this.$cacheRequest.abort();
        }
        this.$source.close();
    }

    public long read(C10603f fVar, long j) {
        C10457l.m35320e(fVar, "sink");
        try {
            long read = this.$source.read(fVar, j);
            if (read == -1) {
                if (!this.cacheRequestClosed) {
                    this.cacheRequestClosed = true;
                    this.$cacheBody.close();
                }
                return -1;
            }
            fVar.mo26381v0(this.$cacheBody.mo26350d(), fVar.size() - read, read);
            this.$cacheBody.mo26310C();
            return read;
        } catch (IOException e) {
            if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                this.$cacheRequest.abort();
            }
            throw e;
        }
    }

    public C10600e0 timeout() {
        return this.$source.timeout();
    }
}
