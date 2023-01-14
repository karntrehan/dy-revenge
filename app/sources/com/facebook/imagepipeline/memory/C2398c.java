package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.imageutils.C2567a;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p261h.C6098h;

/* renamed from: com.facebook.imagepipeline.memory.c */
public class C2398c {

    /* renamed from: a */
    private int f7128a;

    /* renamed from: b */
    private long f7129b;

    /* renamed from: c */
    private final int f7130c;

    /* renamed from: d */
    private final int f7131d;

    /* renamed from: e */
    private final C6098h<Bitmap> f7132e;

    /* renamed from: com.facebook.imagepipeline.memory.c$a */
    class C2399a implements C6098h<Bitmap> {
        C2399a() {
        }

        /* renamed from: b */
        public void mo8068a(Bitmap bitmap) {
            try {
                C2398c.this.mo8087a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public C2398c(int i, int i2) {
        boolean z = true;
        C6062k.m22834b(Boolean.valueOf(i > 0));
        C6062k.m22834b(Boolean.valueOf(i2 <= 0 ? false : z));
        this.f7130c = i;
        this.f7131d = i2;
        this.f7132e = new C2399a();
    }

    /* renamed from: a */
    public synchronized void mo8087a(Bitmap bitmap) {
        int e = C2567a.m10705e(bitmap);
        C6062k.m22835c(this.f7128a > 0, "No bitmaps registered.");
        long j = (long) e;
        C6062k.m22836d(j <= this.f7129b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(e), Long.valueOf(this.f7129b));
        this.f7129b -= j;
        this.f7128a--;
    }

    /* renamed from: b */
    public synchronized int mo8088b() {
        return this.f7128a;
    }

    /* renamed from: c */
    public synchronized int mo8089c() {
        return this.f7130c;
    }

    /* renamed from: d */
    public synchronized int mo8090d() {
        return this.f7131d;
    }

    /* renamed from: e */
    public C6098h<Bitmap> mo8091e() {
        return this.f7132e;
    }

    /* renamed from: f */
    public synchronized long mo8092f() {
        return this.f7129b;
    }

    /* renamed from: g */
    public synchronized boolean mo8093g(Bitmap bitmap) {
        int e = C2567a.m10705e(bitmap);
        int i = this.f7128a;
        if (i < this.f7130c) {
            long j = this.f7129b;
            long j2 = (long) e;
            if (j + j2 <= ((long) this.f7131d)) {
                this.f7128a = i + 1;
                this.f7129b = j + j2;
                return true;
            }
        }
        return false;
    }
}
