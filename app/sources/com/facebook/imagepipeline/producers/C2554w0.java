package com.facebook.imagepipeline.producers;

import java.util.Map;
import p174e.p247e.p253d.p255b.C6040e;

/* renamed from: com.facebook.imagepipeline.producers.w0 */
public abstract class C2554w0<T> extends C6040e<T> {

    /* renamed from: o */
    private final C2505l<T> f7525o;

    /* renamed from: p */
    private final C2539r0 f7526p;

    /* renamed from: q */
    private final String f7527q;

    /* renamed from: r */
    private final C2531p0 f7528r;

    public C2554w0(C2505l<T> lVar, C2539r0 r0Var, C2531p0 p0Var, String str) {
        this.f7525o = lVar;
        this.f7526p = r0Var;
        this.f7527q = str;
        this.f7528r = p0Var;
        r0Var.mo8326e(p0Var, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo8267d() {
        C2539r0 r0Var = this.f7526p;
        C2531p0 p0Var = this.f7528r;
        String str = this.f7527q;
        r0Var.mo8325d(p0Var, str, r0Var.mo8327g(p0Var, str) ? mo8353g() : null);
        this.f7525o.mo8220a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo8268e(Exception exc) {
        C2539r0 r0Var = this.f7526p;
        C2531p0 p0Var = this.f7528r;
        String str = this.f7527q;
        r0Var.mo8329k(p0Var, str, exc, r0Var.mo8327g(p0Var, str) ? mo8354h(exc) : null);
        this.f7525o.mo8221b(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo8269f(T t) {
        C2539r0 r0Var = this.f7526p;
        C2531p0 p0Var = this.f7528r;
        String str = this.f7527q;
        r0Var.mo8328j(p0Var, str, r0Var.mo8327g(p0Var, str) ? mo8204i(t) : null);
        this.f7525o.mo8223d(t, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Map<String, String> mo8353g() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Map<String, String> mo8354h(Exception exc) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Map<String, String> mo8204i(T t) {
        return null;
    }
}
