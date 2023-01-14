package com.facebook.imagepipeline.memory;

import java.io.IOException;
import java.io.InputStream;
import p174e.p247e.p253d.p257d.C6070p;
import p174e.p247e.p253d.p260g.C6084h;
import p174e.p247e.p253d.p260g.C6087k;

/* renamed from: com.facebook.imagepipeline.memory.y */
public class C2432y implements C6084h {

    /* renamed from: a */
    private final C6087k f7211a;

    /* renamed from: b */
    private final C2429v f7212b;

    public C2432y(C2429v vVar, C6087k kVar) {
        this.f7212b = vVar;
        this.f7211a = kVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C2431x mo8168f(InputStream inputStream, C2433z zVar) {
        this.f7211a.mo18076a(inputStream, zVar);
        return zVar.mo8174a();
    }

    /* renamed from: g */
    public C2431x mo8165c(InputStream inputStream) {
        C2433z zVar = new C2433z(this.f7212b);
        try {
            return mo8168f(inputStream, zVar);
        } finally {
            zVar.close();
        }
    }

    /* renamed from: h */
    public C2431x mo8166d(InputStream inputStream, int i) {
        C2433z zVar = new C2433z(this.f7212b, i);
        try {
            return mo8168f(inputStream, zVar);
        } finally {
            zVar.close();
        }
    }

    /* renamed from: i */
    public C2431x mo8164b(byte[] bArr) {
        C2433z zVar = new C2433z(this.f7212b, bArr.length);
        try {
            zVar.write(bArr, 0, bArr.length);
            C2431x o = zVar.mo8174a();
            zVar.close();
            return o;
        } catch (IOException e) {
            throw C6070p.m22850a(e);
        } catch (Throwable th) {
            zVar.close();
            throw th;
        }
    }

    /* renamed from: j */
    public C2433z mo8163a() {
        return new C2433z(this.f7212b);
    }

    /* renamed from: k */
    public C2433z mo8167e(int i) {
        return new C2433z(this.f7212b, i);
    }
}
