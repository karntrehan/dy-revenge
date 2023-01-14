package com.facebook.react.modules.network;

import java.io.OutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import p493i.C10590b0;
import p493i.C10608g;
import p493i.C10625q;

/* renamed from: com.facebook.react.modules.network.i */
public class C2850i extends RequestBody {

    /* renamed from: a */
    private final RequestBody f8018a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2849h f8019b;

    /* renamed from: c */
    private long f8020c = 0;

    /* renamed from: com.facebook.react.modules.network.i$a */
    class C2851a extends C2838b {
        C2851a(OutputStream outputStream) {
            super(outputStream);
        }

        /* renamed from: b */
        private void m11307b() {
            long a = mo9209a();
            long contentLength = C2850i.this.contentLength();
            C2850i.this.f8019b.mo9204a(a, contentLength, a == contentLength);
        }

        public void write(int i) {
            super.write(i);
            m11307b();
        }

        public void write(byte[] bArr, int i, int i2) {
            super.write(bArr, i, i2);
            m11307b();
        }
    }

    public C2850i(RequestBody requestBody, C2849h hVar) {
        this.f8018a = requestBody;
        this.f8019b = hVar;
    }

    /* renamed from: b */
    private C10590b0 m11306b(C10608g gVar) {
        return C10625q.m36159g(new C2851a(gVar.mo26362o0()));
    }

    public long contentLength() {
        if (this.f8020c == 0) {
            this.f8020c = this.f8018a.contentLength();
        }
        return this.f8020c;
    }

    public MediaType contentType() {
        return this.f8018a.contentType();
    }

    public void writeTo(C10608g gVar) {
        C10608g c = C10625q.m36155c(m11306b(gVar));
        contentLength();
        this.f8018a.writeTo(c);
        c.flush();
    }
}
