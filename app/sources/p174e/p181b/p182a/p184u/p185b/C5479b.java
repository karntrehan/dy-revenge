package p174e.p181b.p182a.p184u.p185b;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p174e.p181b.p182a.p195z.C5647h;

/* renamed from: e.b.a.u.b.b */
public class C5479b {

    /* renamed from: a */
    private List<C5498s> f15406a = new ArrayList();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16593a(C5498s sVar) {
        this.f15406a.add(sVar);
    }

    /* renamed from: b */
    public void mo16594b(Path path) {
        for (int size = this.f15406a.size() - 1; size >= 0; size--) {
            C5647h.m21067b(path, this.f15406a.get(size));
        }
    }
}
