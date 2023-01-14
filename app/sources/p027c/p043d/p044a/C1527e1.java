package p027c.p043d.p044a;

import android.util.Size;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0957q1;
import androidx.camera.core.impl.C0711a0;
import androidx.camera.core.impl.C0888u0;
import androidx.camera.core.impl.C0919z;
import androidx.camera.core.impl.p014a3.C0721d;
import androidx.core.util.C1177h;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p027c.p043d.p044a.C1727y0;
import p027c.p043d.p044a.p046l1.p047m.p048f.C1594a;
import p027c.p043d.p044a.p046l1.p047m.p048f.C1597d;
import p027c.p043d.p044a.p046l1.p047m.p048f.C1602i;

/* renamed from: c.d.a.e1 */
public final class C1527e1 {

    /* renamed from: a */
    private final Map<C1727y0, C0711a0> f4779a = new LinkedHashMap();

    /* renamed from: b */
    private final TreeMap<Size, C1727y0> f4780b = new TreeMap<>(new C0721d());

    /* renamed from: c */
    private final C0711a0 f4781c;

    /* renamed from: d */
    private final C0711a0 f4782d;

    C1527e1(C0888u0 u0Var) {
        C0919z f = u0Var.mo2458f();
        for (C1727y0 next : C1727y0.m7381b()) {
            C1177h.m4586h(next instanceof C1727y0.C1729b, "Currently only support ConstantQuality");
            int d = ((C1727y0.C1729b) next).mo5725d();
            if (f.mo2291a(d) && m6825f(next)) {
                C0711a0 a0Var = (C0711a0) C1177h.m4583e(f.get(d));
                Size size = new Size(a0Var.mo2811p(), a0Var.mo2809n());
                C0949o2.m3688a("VideoCapabilities", "profile = " + a0Var);
                this.f4779a.put(next, a0Var);
                this.f4780b.put(size, next);
            }
        }
        if (this.f4779a.isEmpty()) {
            C0949o2.m3690c("VideoCapabilities", "No supported CamcorderProfile");
            this.f4782d = null;
            this.f4781c = null;
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque(this.f4779a.values());
        this.f4781c = (C0711a0) arrayDeque.peekFirst();
        this.f4782d = (C0711a0) arrayDeque.peekLast();
    }

    /* renamed from: a */
    private static void m6823a(C1727y0 y0Var) {
        boolean a = C1727y0.m7380a(y0Var);
        C1177h.m4580b(a, "Unknown quality: " + y0Var);
    }

    /* renamed from: c */
    public static C1527e1 m6824c(C0957q1 q1Var) {
        return new C1527e1((C0888u0) q1Var);
    }

    /* renamed from: f */
    private boolean m6825f(C1727y0 y0Var) {
        C1602i iVar = (C1602i) C1597d.m7053a(C1602i.class);
        boolean z = iVar == null || !iVar.mo5769c(y0Var);
        C1594a aVar = (C1594a) C1597d.m7053a(C1594a.class);
        return z && (aVar == null || !aVar.mo5767b(y0Var));
    }

    /* renamed from: b */
    public C1727y0 mo5649b(Size size) {
        Object value;
        Map.Entry ceilingEntry = this.f4780b.ceilingEntry(size);
        if (ceilingEntry != null) {
            value = ceilingEntry.getValue();
        } else {
            Map.Entry floorEntry = this.f4780b.floorEntry(size);
            if (floorEntry == null) {
                return C1727y0.f5146g;
            }
            value = floorEntry.getValue();
        }
        return (C1727y0) value;
    }

    /* renamed from: d */
    public C0711a0 mo5650d(C1727y0 y0Var) {
        m6823a(y0Var);
        return y0Var == C1727y0.f5145f ? this.f4781c : y0Var == C1727y0.f5144e ? this.f4782d : this.f4779a.get(y0Var);
    }

    /* renamed from: e */
    public List<C1727y0> mo5651e() {
        return new ArrayList(this.f4779a.keySet());
    }
}
