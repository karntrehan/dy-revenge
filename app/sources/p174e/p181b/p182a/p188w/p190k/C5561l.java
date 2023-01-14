package p174e.p181b.p182a.p188w.p190k;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p174e.p181b.p182a.p188w.C5523a;
import p174e.p181b.p182a.p195z.C5643d;
import p174e.p181b.p182a.p195z.C5646g;

/* renamed from: e.b.a.w.k.l */
public class C5561l {

    /* renamed from: a */
    private final List<C5523a> f15719a;

    /* renamed from: b */
    private PointF f15720b;

    /* renamed from: c */
    private boolean f15721c;

    public C5561l() {
        this.f15719a = new ArrayList();
    }

    public C5561l(PointF pointF, boolean z, List<C5523a> list) {
        this.f15720b = pointF;
        this.f15721c = z;
        this.f15719a = new ArrayList(list);
    }

    /* renamed from: e */
    private void m20721e(float f, float f2) {
        if (this.f15720b == null) {
            this.f15720b = new PointF();
        }
        this.f15720b.set(f, f2);
    }

    /* renamed from: a */
    public List<C5523a> mo16768a() {
        return this.f15719a;
    }

    /* renamed from: b */
    public PointF mo16769b() {
        return this.f15720b;
    }

    /* renamed from: c */
    public void mo16770c(C5561l lVar, C5561l lVar2, float f) {
        if (this.f15720b == null) {
            this.f15720b = new PointF();
        }
        this.f15721c = lVar.mo16771d() || lVar2.mo16771d();
        if (lVar.mo16768a().size() != lVar2.mo16768a().size()) {
            C5643d.m21027c("Curves must have the same number of control points. Shape 1: " + lVar.mo16768a().size() + "\tShape 2: " + lVar2.mo16768a().size());
        }
        int min = Math.min(lVar.mo16768a().size(), lVar2.mo16768a().size());
        if (this.f15719a.size() < min) {
            for (int size = this.f15719a.size(); size < min; size++) {
                this.f15719a.add(new C5523a());
            }
        } else if (this.f15719a.size() > min) {
            for (int size2 = this.f15719a.size() - 1; size2 >= min; size2--) {
                List<C5523a> list = this.f15719a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = lVar.mo16769b();
        PointF b2 = lVar2.mo16769b();
        m20721e(C5646g.m21063k(b.x, b2.x, f), C5646g.m21063k(b.y, b2.y, f));
        for (int size3 = this.f15719a.size() - 1; size3 >= 0; size3--) {
            C5523a aVar = lVar.mo16768a().get(size3);
            C5523a aVar2 = lVar2.mo16768a().get(size3);
            PointF a = aVar.mo16664a();
            PointF b3 = aVar.mo16665b();
            PointF c = aVar.mo16666c();
            PointF a2 = aVar2.mo16664a();
            PointF b4 = aVar2.mo16665b();
            PointF c2 = aVar2.mo16666c();
            this.f15719a.get(size3).mo16667d(C5646g.m21063k(a.x, a2.x, f), C5646g.m21063k(a.y, a2.y, f));
            this.f15719a.get(size3).mo16668e(C5646g.m21063k(b3.x, b4.x, f), C5646g.m21063k(b3.y, b4.y, f));
            this.f15719a.get(size3).mo16669f(C5646g.m21063k(c.x, c2.x, f), C5646g.m21063k(c.y, c2.y, f));
        }
    }

    /* renamed from: d */
    public boolean mo16771d() {
        return this.f15721c;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f15719a.size() + "closed=" + this.f15721c + '}';
    }
}
