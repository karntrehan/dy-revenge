package com.facebook.imagepipeline.producers;

import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.y */
public class C2561y implements C2539r0 {

    /* renamed from: a */
    private final C2541s0 f7545a;

    /* renamed from: b */
    private final C2539r0 f7546b;

    public C2561y(C2541s0 s0Var, C2539r0 r0Var) {
        this.f7545a = s0Var;
        this.f7546b = r0Var;
    }

    /* renamed from: a */
    public void mo8323a(C2531p0 p0Var, String str, String str2) {
        C2541s0 s0Var = this.f7545a;
        if (s0Var != null) {
            s0Var.mo8336h(p0Var.mo8235a(), str, str2);
        }
        C2539r0 r0Var = this.f7546b;
        if (r0Var != null) {
            r0Var.mo8323a(p0Var, str, str2);
        }
    }

    /* renamed from: c */
    public void mo8324c(C2531p0 p0Var, String str, boolean z) {
        C2541s0 s0Var = this.f7545a;
        if (s0Var != null) {
            s0Var.mo8334e(p0Var.mo8235a(), str, z);
        }
        C2539r0 r0Var = this.f7546b;
        if (r0Var != null) {
            r0Var.mo8324c(p0Var, str, z);
        }
    }

    /* renamed from: d */
    public void mo8325d(C2531p0 p0Var, String str, Map<String, String> map) {
        C2541s0 s0Var = this.f7545a;
        if (s0Var != null) {
            s0Var.mo8333d(p0Var.mo8235a(), str, map);
        }
        C2539r0 r0Var = this.f7546b;
        if (r0Var != null) {
            r0Var.mo8325d(p0Var, str, map);
        }
    }

    /* renamed from: e */
    public void mo8326e(C2531p0 p0Var, String str) {
        C2541s0 s0Var = this.f7545a;
        if (s0Var != null) {
            s0Var.mo8332b(p0Var.mo8235a(), str);
        }
        C2539r0 r0Var = this.f7546b;
        if (r0Var != null) {
            r0Var.mo8326e(p0Var, str);
        }
    }

    /* renamed from: g */
    public boolean mo8327g(C2531p0 p0Var, String str) {
        C2539r0 r0Var;
        C2541s0 s0Var = this.f7545a;
        boolean f = s0Var != null ? s0Var.mo8335f(p0Var.mo8235a()) : false;
        return (f || (r0Var = this.f7546b) == null) ? f : r0Var.mo8327g(p0Var, str);
    }

    /* renamed from: j */
    public void mo8328j(C2531p0 p0Var, String str, Map<String, String> map) {
        C2541s0 s0Var = this.f7545a;
        if (s0Var != null) {
            s0Var.mo8337i(p0Var.mo8235a(), str, map);
        }
        C2539r0 r0Var = this.f7546b;
        if (r0Var != null) {
            r0Var.mo8328j(p0Var, str, map);
        }
    }

    /* renamed from: k */
    public void mo8329k(C2531p0 p0Var, String str, Throwable th, Map<String, String> map) {
        C2541s0 s0Var = this.f7545a;
        if (s0Var != null) {
            s0Var.mo8338j(p0Var.mo8235a(), str, th, map);
        }
        C2539r0 r0Var = this.f7546b;
        if (r0Var != null) {
            r0Var.mo8329k(p0Var, str, th, map);
        }
    }
}
