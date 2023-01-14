package com.facebook.imagepipeline.producers;

import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.imagepipeline.producers.b */
public abstract class C2459b<T> implements C2505l<T> {

    /* renamed from: a */
    private boolean f7267a = false;

    /* renamed from: e */
    public static boolean m10210e(int i) {
        return (i & 1) == 1;
    }

    /* renamed from: f */
    public static boolean m10211f(int i) {
        return !m10210e(i);
    }

    /* renamed from: l */
    public static int m10212l(boolean z) {
        return z ? 1 : 0;
    }

    /* renamed from: m */
    public static boolean m10213m(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: n */
    public static boolean m10214n(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: o */
    public static int m10215o(int i, int i2) {
        return i & (~i2);
    }

    /* renamed from: a */
    public synchronized void mo8220a() {
        if (!this.f7267a) {
            this.f7267a = true;
            try {
                mo8224g();
            } catch (Exception e) {
                mo8227k(e);
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: b */
    public synchronized void mo8221b(Throwable th) {
        if (!this.f7267a) {
            this.f7267a = true;
            try {
                mo8225h(th);
            } catch (Exception e) {
                mo8227k(e);
            }
        } else {
            return;
        }
        return;
    }

    /* renamed from: c */
    public synchronized void mo8222c(float f) {
        if (!this.f7267a) {
            try {
                mo8226j(f);
            } catch (Exception e) {
                mo8227k(e);
            }
        } else {
            return;
        }
    }

    /* renamed from: d */
    public synchronized void mo8223d(T t, int i) {
        if (!this.f7267a) {
            this.f7267a = m10210e(i);
            try {
                mo8209i(t, i);
            } catch (Exception e) {
                mo8227k(e);
            }
        } else {
            return;
        }
        return;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo8224g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo8225h(Throwable th);

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract void mo8209i(T t, int i);

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo8226j(float f);

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo8227k(Exception exc) {
        C6071a.m22863K(getClass(), "unhandled exception", exc);
    }
}
