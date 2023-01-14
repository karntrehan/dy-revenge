package p027c.p064i.p065d;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: c.i.d.b */
public final class C1828b {

    /* renamed from: a */
    public static final C1828b f5454a = new C1828b(0, 0, 0, 0);

    /* renamed from: b */
    public final int f5455b;

    /* renamed from: c */
    public final int f5456c;

    /* renamed from: d */
    public final int f5457d;

    /* renamed from: e */
    public final int f5458e;

    private C1828b(int i, int i2, int i3, int i4) {
        this.f5455b = i;
        this.f5456c = i2;
        this.f5457d = i3;
        this.f5458e = i4;
    }

    /* renamed from: a */
    public static C1828b m7760a(C1828b bVar, C1828b bVar2) {
        return m7761b(Math.max(bVar.f5455b, bVar2.f5455b), Math.max(bVar.f5456c, bVar2.f5456c), Math.max(bVar.f5457d, bVar2.f5457d), Math.max(bVar.f5458e, bVar2.f5458e));
    }

    /* renamed from: b */
    public static C1828b m7761b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f5454a : new C1828b(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static C1828b m7762c(Rect rect) {
        return m7761b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C1828b m7763d(Insets insets) {
        return m7761b(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: e */
    public Insets mo6322e() {
        return Insets.of(this.f5455b, this.f5456c, this.f5457d, this.f5458e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1828b.class != obj.getClass()) {
            return false;
        }
        C1828b bVar = (C1828b) obj;
        return this.f5458e == bVar.f5458e && this.f5455b == bVar.f5455b && this.f5457d == bVar.f5457d && this.f5456c == bVar.f5456c;
    }

    public int hashCode() {
        return (((((this.f5455b * 31) + this.f5456c) * 31) + this.f5457d) * 31) + this.f5458e;
    }

    public String toString() {
        return "Insets{left=" + this.f5455b + ", top=" + this.f5456c + ", right=" + this.f5457d + ", bottom=" + this.f5458e + '}';
    }
}
