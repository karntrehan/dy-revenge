package p174e.p319f.p406d.p411b.p414c;

import android.graphics.PointF;
import androidx.annotation.RecentlyNonNull;
import p174e.p319f.p320a.p335c.p345f.p356k.C8054vb;
import p174e.p319f.p320a.p335c.p345f.p356k.C8067wb;

/* renamed from: e.f.d.b.c.f */
public class C9639f {

    /* renamed from: a */
    private final int f25779a;

    /* renamed from: b */
    private final PointF f25780b;

    C9639f(int i, PointF pointF) {
        this.f25779a = i;
        this.f25780b = pointF;
    }

    /* renamed from: a */
    public int mo24173a() {
        return this.f25779a;
    }

    /* renamed from: b */
    public PointF mo24174b() {
        return this.f25780b;
    }

    @RecentlyNonNull
    public String toString() {
        C8054vb a = C8067wb.m28281a("FaceLandmark");
        a.mo21626b("type", this.f25779a);
        a.mo21627c("position", this.f25780b);
        return a.toString();
    }
}
