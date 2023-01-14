package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: e.f.a.c.f.g.r8 */
final class C6979r8 {

    /* renamed from: a */
    private static final C6979r8 f18847a = new C6979r8(true);

    /* renamed from: b */
    final C6789fb f18848b = new C7029ua(16);

    /* renamed from: c */
    private boolean f18849c;

    /* renamed from: d */
    private boolean f18850d;

    private C6979r8() {
    }

    private C6979r8(boolean z) {
        mo20133b();
        mo20133b();
    }

    /* renamed from: a */
    public static C6979r8 m26436a() {
        throw null;
    }

    /* renamed from: d */
    private static final void m26437d(C6963q8 q8Var, Object obj) {
        boolean z;
        C6705ac zzb = q8Var.zzb();
        C6820h9.m25836e(obj);
        C6705ac acVar = C6705ac.DOUBLE;
        C6722bc bcVar = C6722bc.INT;
        switch (zzb.mo19538e().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof C7106z7) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if (obj instanceof Integer) {
                    return;
                }
                break;
            case 8:
                if (obj instanceof C6805ga) {
                    return;
                }
                break;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(q8Var.zza()), q8Var.zzb().mo19538e(), obj.getClass().getName()}));
    }

    /* renamed from: b */
    public final void mo20133b() {
        if (!this.f18849c) {
            this.f18848b.mo19769a();
            this.f18849c = true;
        }
    }

    /* renamed from: c */
    public final void mo20134c(C6963q8 q8Var, Object obj) {
        if (!q8Var.mo20102a()) {
            m26437d(q8Var, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m26437d(q8Var, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        this.f18848b.put(q8Var, obj);
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C6979r8 r8Var = new C6979r8();
        for (int i = 0; i < this.f18848b.mo19770b(); i++) {
            Map.Entry g = this.f18848b.mo19777g(i);
            r8Var.mo20134c((C6963q8) g.getKey(), g.getValue());
        }
        for (Map.Entry entry : this.f18848b.mo19771c()) {
            r8Var.mo20134c((C6963q8) entry.getKey(), entry.getValue());
        }
        r8Var.f18850d = this.f18850d;
        return r8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6979r8)) {
            return false;
        }
        return this.f18848b.equals(((C6979r8) obj).f18848b);
    }

    public final int hashCode() {
        return this.f18848b.hashCode();
    }
}
