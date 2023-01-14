package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import p174e.p247e.p253d.p260g.C6078c;

/* renamed from: com.facebook.imagepipeline.memory.s */
public class C2426s implements C2405e {

    /* renamed from: a */
    protected final C2400c0<Bitmap> f7201a = new C2407f();

    /* renamed from: b */
    private final int f7202b;

    /* renamed from: c */
    private int f7203c;

    /* renamed from: d */
    private final C2410g0 f7204d;

    /* renamed from: e */
    private int f7205e;

    public C2426s(int i, int i2, C2410g0 g0Var, C6078c cVar) {
        this.f7202b = i;
        this.f7203c = i2;
        this.f7204d = g0Var;
        if (cVar != null) {
            cVar.mo18061a(this);
        }
    }

    /* renamed from: f */
    private Bitmap m10083f(int i) {
        this.f7204d.mo8061a(i);
        return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
    }

    /* renamed from: i */
    private synchronized void m10084i(int i) {
        while (true) {
            if (this.f7205e <= i) {
                break;
            }
            Bitmap b = this.f7201a.mo8096b();
            if (b == null) {
                break;
            }
            int a = this.f7201a.mo8095a(b);
            this.f7205e -= a;
            this.f7204d.mo8065e(a);
        }
    }

    /* renamed from: g */
    public synchronized Bitmap get(int i) {
        int i2 = this.f7205e;
        int i3 = this.f7202b;
        if (i2 > i3) {
            m10084i(i3);
        }
        Bitmap bitmap = this.f7201a.get(i);
        if (bitmap != null) {
            int a = this.f7201a.mo8095a(bitmap);
            this.f7205e -= a;
            this.f7204d.mo8062b(a);
            return bitmap;
        }
        return m10083f(i);
    }

    /* renamed from: h */
    public void mo8068a(Bitmap bitmap) {
        int a = this.f7201a.mo8095a(bitmap);
        if (a <= this.f7203c) {
            this.f7204d.mo8067g(a);
            this.f7201a.mo8097c(bitmap);
            synchronized (this) {
                this.f7205e += a;
            }
        }
    }
}
