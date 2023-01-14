package p027c.p100v;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import p027c.p100v.C2214x;

/* renamed from: c.v.b0 */
public class C2127b0 extends C2214x {

    /* renamed from: X */
    private ArrayList<C2214x> f6239X = new ArrayList<>();

    /* renamed from: Y */
    private boolean f6240Y = true;

    /* renamed from: Z */
    int f6241Z;

    /* renamed from: a0 */
    boolean f6242a0 = false;

    /* renamed from: b0 */
    private int f6243b0 = 0;

    /* renamed from: c.v.b0$a */
    class C2128a extends C2222y {

        /* renamed from: a */
        final /* synthetic */ C2214x f6244a;

        C2128a(C2214x xVar) {
            this.f6244a = xVar;
        }

        /* renamed from: c */
        public void mo7207c(C2214x xVar) {
            this.f6244a.mo7183d0();
            xVar.mo7177Z(this);
        }
    }

    /* renamed from: c.v.b0$b */
    static class C2129b extends C2222y {

        /* renamed from: a */
        C2127b0 f6246a;

        C2129b(C2127b0 b0Var) {
            this.f6246a = b0Var;
        }

        /* renamed from: a */
        public void mo7208a(C2214x xVar) {
            C2127b0 b0Var = this.f6246a;
            if (!b0Var.f6242a0) {
                b0Var.mo7385m0();
                this.f6246a.f6242a0 = true;
            }
        }

        /* renamed from: c */
        public void mo7207c(C2214x xVar) {
            C2127b0 b0Var = this.f6246a;
            int i = b0Var.f6241Z - 1;
            b0Var.f6241Z = i;
            if (i == 0) {
                b0Var.f6242a0 = false;
                b0Var.mo7387s();
            }
            xVar.mo7177Z(this);
        }
    }

    /* renamed from: A0 */
    private void m9070A0() {
        C2129b bVar = new C2129b(this);
        Iterator<C2214x> it = this.f6239X.iterator();
        while (it.hasNext()) {
            it.next().mo7180c(bVar);
        }
        this.f6241Z = this.f6239X.size();
    }

    /* renamed from: r0 */
    private void m9071r0(C2214x xVar) {
        this.f6239X.add(xVar);
        xVar.f6453H = this;
    }

    /* renamed from: V */
    public void mo7176V(View view) {
        super.mo7176V(view);
        int size = this.f6239X.size();
        for (int i = 0; i < size; i++) {
            this.f6239X.get(i).mo7176V(view);
        }
    }

    /* renamed from: b0 */
    public void mo7179b0(View view) {
        super.mo7179b0(view);
        int size = this.f6239X.size();
        for (int i = 0; i < size; i++) {
            this.f6239X.get(i).mo7179b0(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo7183d0() {
        if (this.f6239X.isEmpty()) {
            mo7385m0();
            mo7387s();
            return;
        }
        m9070A0();
        if (!this.f6240Y) {
            for (int i = 1; i < this.f6239X.size(); i++) {
                this.f6239X.get(i - 1).mo7180c(new C2128a(this.f6239X.get(i)));
            }
            C2214x xVar = this.f6239X.get(0);
            if (xVar != null) {
                xVar.mo7183d0();
                return;
            }
            return;
        }
        Iterator<C2214x> it = this.f6239X.iterator();
        while (it.hasNext()) {
            it.next().mo7183d0();
        }
    }

    /* renamed from: g0 */
    public void mo7185g0(C2214x.C2219e eVar) {
        super.mo7185g0(eVar);
        this.f6243b0 |= 8;
        int size = this.f6239X.size();
        for (int i = 0; i < size; i++) {
            this.f6239X.get(i).mo7185g0(eVar);
        }
    }

    /* renamed from: i */
    public void mo7187i(C2144d0 d0Var) {
        if (mo7380O(d0Var.f6291b)) {
            Iterator<C2214x> it = this.f6239X.iterator();
            while (it.hasNext()) {
                C2214x next = it.next();
                if (next.mo7380O(d0Var.f6291b)) {
                    next.mo7187i(d0Var);
                    d0Var.f6292c.add(next);
                }
            }
        }
    }

    /* renamed from: j0 */
    public void mo7188j0(C2186p pVar) {
        super.mo7188j0(pVar);
        this.f6243b0 |= 4;
        if (this.f6239X != null) {
            for (int i = 0; i < this.f6239X.size(); i++) {
                this.f6239X.get(i).mo7188j0(pVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo7189k(C2144d0 d0Var) {
        super.mo7189k(d0Var);
        int size = this.f6239X.size();
        for (int i = 0; i < size; i++) {
            this.f6239X.get(i).mo7189k(d0Var);
        }
    }

    /* renamed from: k0 */
    public void mo7190k0(C2125a0 a0Var) {
        super.mo7190k0(a0Var);
        this.f6243b0 |= 2;
        int size = this.f6239X.size();
        for (int i = 0; i < size; i++) {
            this.f6239X.get(i).mo7190k0(a0Var);
        }
    }

    /* renamed from: l */
    public void mo7191l(C2144d0 d0Var) {
        if (mo7380O(d0Var.f6291b)) {
            Iterator<C2214x> it = this.f6239X.iterator();
            while (it.hasNext()) {
                C2214x next = it.next();
                if (next.mo7380O(d0Var.f6291b)) {
                    next.mo7191l(d0Var);
                    d0Var.f6292c.add(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public String mo7193n0(String str) {
        String n0 = super.mo7193n0(str);
        for (int i = 0; i < this.f6239X.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(n0);
            sb.append("\n");
            sb.append(this.f6239X.get(i).mo7193n0(str + "  "));
            n0 = sb.toString();
        }
        return n0;
    }

    /* renamed from: o0 */
    public C2127b0 mo7180c(C2214x.C2220f fVar) {
        return (C2127b0) super.mo7180c(fVar);
    }

    /* renamed from: p */
    public C2214x clone() {
        C2127b0 b0Var = (C2127b0) super.clone();
        b0Var.f6239X = new ArrayList<>();
        int size = this.f6239X.size();
        for (int i = 0; i < size; i++) {
            b0Var.m9071r0(this.f6239X.get(i).clone());
        }
        return b0Var;
    }

    /* renamed from: p0 */
    public C2127b0 mo7182d(View view) {
        for (int i = 0; i < this.f6239X.size(); i++) {
            this.f6239X.get(i).mo7182d(view);
        }
        return (C2127b0) super.mo7182d(view);
    }

    /* renamed from: q0 */
    public C2127b0 mo7197q0(C2214x xVar) {
        m9071r0(xVar);
        long j = this.f6471s;
        if (j >= 0) {
            xVar.mo7184f0(j);
        }
        if ((this.f6243b0 & 1) != 0) {
            xVar.mo7186h0(mo7392w());
        }
        if ((this.f6243b0 & 2) != 0) {
            xVar.mo7190k0(mo7373B());
        }
        if ((this.f6243b0 & 4) != 0) {
            xVar.mo7188j0(mo7395z());
        }
        if ((this.f6243b0 & 8) != 0) {
            xVar.mo7185g0(mo7391v());
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo7198r(ViewGroup viewGroup, C2152e0 e0Var, C2152e0 e0Var2, ArrayList<C2144d0> arrayList, ArrayList<C2144d0> arrayList2) {
        long D = mo7374D();
        int size = this.f6239X.size();
        for (int i = 0; i < size; i++) {
            C2214x xVar = this.f6239X.get(i);
            if (D > 0 && (this.f6240Y || i == 0)) {
                long D2 = xVar.mo7374D();
                if (D2 > 0) {
                    xVar.mo7192l0(D2 + D);
                } else {
                    xVar.mo7192l0(D);
                }
            }
            xVar.mo7198r(viewGroup, e0Var, e0Var2, arrayList, arrayList2);
        }
    }

    /* renamed from: s0 */
    public C2214x mo7199s0(int i) {
        if (i < 0 || i >= this.f6239X.size()) {
            return null;
        }
        return this.f6239X.get(i);
    }

    /* renamed from: t0 */
    public int mo7200t0() {
        return this.f6239X.size();
    }

    /* renamed from: u0 */
    public C2127b0 mo7177Z(C2214x.C2220f fVar) {
        return (C2127b0) super.mo7177Z(fVar);
    }

    /* renamed from: v0 */
    public C2127b0 mo7178a0(View view) {
        for (int i = 0; i < this.f6239X.size(); i++) {
            this.f6239X.get(i).mo7178a0(view);
        }
        return (C2127b0) super.mo7178a0(view);
    }

    /* renamed from: w0 */
    public C2127b0 mo7184f0(long j) {
        ArrayList<C2214x> arrayList;
        super.mo7184f0(j);
        if (this.f6471s >= 0 && (arrayList = this.f6239X) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f6239X.get(i).mo7184f0(j);
            }
        }
        return this;
    }

    /* renamed from: x0 */
    public C2127b0 mo7186h0(TimeInterpolator timeInterpolator) {
        this.f6243b0 |= 1;
        ArrayList<C2214x> arrayList = this.f6239X;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f6239X.get(i).mo7186h0(timeInterpolator);
            }
        }
        return (C2127b0) super.mo7186h0(timeInterpolator);
    }

    /* renamed from: y0 */
    public C2127b0 mo7205y0(int i) {
        if (i == 0) {
            this.f6240Y = true;
        } else if (i == 1) {
            this.f6240Y = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }

    /* renamed from: z0 */
    public C2127b0 mo7192l0(long j) {
        return (C2127b0) super.mo7192l0(j);
    }
}
