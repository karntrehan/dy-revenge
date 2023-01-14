package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ArrayList;
import java.util.List;

/* renamed from: e.f.a.c.f.g.x */
public abstract class C7066x {

    /* renamed from: a */
    final List f19041a = new ArrayList();

    protected C7066x() {
    }

    /* renamed from: a */
    public abstract C6954q mo19484a(String str, C6991s4 s4Var, List list);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6954q mo20424b(String str) {
        if (this.f19041a.contains(C7008t5.m26535e(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
