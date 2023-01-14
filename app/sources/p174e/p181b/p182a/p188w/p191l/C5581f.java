package p174e.p181b.p182a.p188w.p191l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
import p174e.p181b.p182a.C5442g;
import p174e.p181b.p182a.p184u.p185b.C5481d;
import p174e.p181b.p182a.p188w.C5528e;
import p174e.p181b.p182a.p188w.p190k.C5563n;

/* renamed from: e.b.a.w.l.f */
public class C5581f extends C5571a {

    /* renamed from: z */
    private final C5481d f15840z;

    C5581f(C5442g gVar, C5577d dVar) {
        super(gVar, dVar);
        C5481d dVar2 = new C5481d(gVar, this, new C5563n("__container", dVar.mo16828l(), false));
        this.f15840z = dVar2;
        dVar2.mo16588c(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo16807E(C5528e eVar, int i, List<C5528e> list, C5528e eVar2) {
        this.f15840z.mo16589d(eVar, i, list, eVar2);
    }

    /* renamed from: e */
    public void mo16590e(RectF rectF, Matrix matrix, boolean z) {
        super.mo16590e(rectF, matrix, z);
        this.f15840z.mo16590e(rectF, this.f15776m, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo16813u(Canvas canvas, Matrix matrix, int i) {
        this.f15840z.mo16591g(canvas, matrix, i);
    }
}
