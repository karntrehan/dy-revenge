package androidx.camera.core;

import android.util.Rational;
import androidx.core.util.C1177h;

/* renamed from: androidx.camera.core.c3 */
public final class C0629c3 {

    /* renamed from: a */
    private int f2046a;

    /* renamed from: b */
    private Rational f2047b;

    /* renamed from: c */
    private int f2048c;

    /* renamed from: d */
    private int f2049d;

    /* renamed from: androidx.camera.core.c3$a */
    public static final class C0630a {

        /* renamed from: a */
        private int f2050a = 1;

        /* renamed from: b */
        private final Rational f2051b;

        /* renamed from: c */
        private final int f2052c;

        /* renamed from: d */
        private int f2053d = 0;

        public C0630a(Rational rational, int i) {
            this.f2051b = rational;
            this.f2052c = i;
        }

        /* renamed from: a */
        public C0629c3 mo2630a() {
            C1177h.m4584f(this.f2051b, "The crop aspect ratio must be set.");
            return new C0629c3(this.f2050a, this.f2051b, this.f2052c, this.f2053d);
        }

        /* renamed from: b */
        public C0630a mo2631b(int i) {
            this.f2053d = i;
            return this;
        }

        /* renamed from: c */
        public C0630a mo2632c(int i) {
            this.f2050a = i;
            return this;
        }
    }

    C0629c3(int i, Rational rational, int i2, int i3) {
        this.f2046a = i;
        this.f2047b = rational;
        this.f2048c = i2;
        this.f2049d = i3;
    }

    /* renamed from: a */
    public Rational mo2626a() {
        return this.f2047b;
    }

    /* renamed from: b */
    public int mo2627b() {
        return this.f2049d;
    }

    /* renamed from: c */
    public int mo2628c() {
        return this.f2048c;
    }

    /* renamed from: d */
    public int mo2629d() {
        return this.f2046a;
    }
}
