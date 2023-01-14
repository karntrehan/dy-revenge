package p174e.p181b.p182a.p188w.p190k;

import android.graphics.PointF;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.p184u.p185b.C5480c;
import p174e.p181b.p182a.p184u.p185b.C5494o;
import p174e.p181b.p182a.p188w.p189j.C5534b;
import p174e.p181b.p182a.p188w.p189j.C5545m;
import p174e.p181b.p182a.p188w.p191l.C5571a;

/* renamed from: e.b.a.w.k.j */
public class C5559j implements C5548b {

    /* renamed from: a */
    private final String f15709a;

    /* renamed from: b */
    private final C5545m<PointF, PointF> f15710b;

    /* renamed from: c */
    private final C5545m<PointF, PointF> f15711c;

    /* renamed from: d */
    private final C5534b f15712d;

    /* renamed from: e */
    private final boolean f15713e;

    public C5559j(String str, C5545m<PointF, PointF> mVar, C5545m<PointF, PointF> mVar2, C5534b bVar, boolean z) {
        this.f15709a = str;
        this.f15710b = mVar;
        this.f15711c = mVar2;
        this.f15712d = bVar;
        this.f15713e = z;
    }

    /* renamed from: a */
    public C5480c mo16698a(C5442g gVar, C5571a aVar) {
        return new C5494o(gVar, aVar, this);
    }

    /* renamed from: b */
    public C5534b mo16757b() {
        return this.f15712d;
    }

    /* renamed from: c */
    public String mo16758c() {
        return this.f15709a;
    }

    /* renamed from: d */
    public C5545m<PointF, PointF> mo16759d() {
        return this.f15710b;
    }

    /* renamed from: e */
    public C5545m<PointF, PointF> mo16760e() {
        return this.f15711c;
    }

    /* renamed from: f */
    public boolean mo16761f() {
        return this.f15713e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f15710b + ", size=" + this.f15711c + '}';
    }
}
