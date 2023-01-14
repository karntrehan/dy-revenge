package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: e.f.a.c.f.l.qc */
public final class C8419qc {

    /* renamed from: a */
    private static volatile C8419qc f22957a;

    /* renamed from: b */
    static final C8419qc f22958b = new C8419qc(true);

    /* renamed from: c */
    private final Map<C8401pc, C8178dd<?, ?>> f22959c;

    C8419qc() {
        this.f22959c = new HashMap();
    }

    C8419qc(boolean z) {
        this.f22959c = Collections.emptyMap();
    }

    /* renamed from: a */
    public static C8419qc m28962a() {
        C8419qc qcVar = f22957a;
        if (qcVar == null) {
            synchronized (C8419qc.class) {
                qcVar = f22957a;
                if (qcVar == null) {
                    qcVar = f22958b;
                    f22957a = qcVar;
                }
            }
        }
        return qcVar;
    }

    /* renamed from: b */
    public static C8419qc m28963b() {
        return new C8419qc();
    }

    /* renamed from: c */
    public final <ContainingType extends C8274ie> C8178dd<ContainingType, ?> mo22101c(ContainingType containingtype, int i) {
        return this.f22959c.get(new C8401pc(containingtype, i));
    }

    /* renamed from: d */
    public final void mo22102d(C8178dd<?, ?> ddVar) {
        this.f22959c.put(new C8401pc(ddVar.f22203a, 202056002), ddVar);
    }
}
