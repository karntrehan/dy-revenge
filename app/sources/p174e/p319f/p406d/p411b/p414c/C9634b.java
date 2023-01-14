package p174e.p319f.p406d.p411b.p414c;

import android.graphics.PointF;
import androidx.annotation.RecentlyNonNull;
import java.util.List;
import p174e.p319f.p320a.p335c.p345f.p356k.C8054vb;
import p174e.p319f.p320a.p335c.p345f.p356k.C8067wb;

/* renamed from: e.f.d.b.c.b */
public class C9634b {

    /* renamed from: a */
    private final int f25763a;

    /* renamed from: b */
    private final List<PointF> f25764b;

    public C9634b(int i, @RecentlyNonNull List<PointF> list) {
        this.f25763a = i;
        this.f25764b = list;
    }

    /* renamed from: a */
    public int mo24152a() {
        return this.f25763a;
    }

    /* renamed from: b */
    public List<PointF> mo24153b() {
        return this.f25764b;
    }

    @RecentlyNonNull
    public String toString() {
        C8054vb a = C8067wb.m28281a("FaceContour");
        a.mo21626b("type", this.f25763a);
        a.mo21627c("points", this.f25764b.toArray());
        return a.toString();
    }
}
