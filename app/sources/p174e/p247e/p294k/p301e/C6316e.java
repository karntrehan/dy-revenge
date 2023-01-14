package p174e.p247e.p294k.p301e;

import java.util.Locale;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p264k.C6106b;

/* renamed from: e.e.k.e.e */
public class C6316e {

    /* renamed from: a */
    public final int f17470a;

    /* renamed from: b */
    public final int f17471b;

    /* renamed from: c */
    public final float f17472c;

    /* renamed from: d */
    public final float f17473d;

    public C6316e(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    public C6316e(int i, int i2, float f) {
        this(i, i2, f, 0.6666667f);
    }

    public C6316e(int i, int i2, float f, float f2) {
        boolean z = true;
        C6062k.m22834b(Boolean.valueOf(i > 0));
        C6062k.m22834b(Boolean.valueOf(i2 <= 0 ? false : z));
        this.f17470a = i;
        this.f17471b = i2;
        this.f17472c = f;
        this.f17473d = f2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6316e)) {
            return false;
        }
        C6316e eVar = (C6316e) obj;
        return this.f17470a == eVar.f17470a && this.f17471b == eVar.f17471b;
    }

    public int hashCode() {
        return C6106b.m22988a(this.f17470a, this.f17471b);
    }

    public String toString() {
        return String.format((Locale) null, "%dx%d", new Object[]{Integer.valueOf(this.f17470a), Integer.valueOf(this.f17471b)});
    }
}
