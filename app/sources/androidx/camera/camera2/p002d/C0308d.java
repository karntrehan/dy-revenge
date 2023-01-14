package androidx.camera.camera2.p002d;

import androidx.camera.core.impl.C0788c1;
import androidx.camera.core.impl.C0914y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.camera.camera2.d.d */
public final class C0308d extends C0914y1<C0307c> {

    /* renamed from: androidx.camera.camera2.d.d$a */
    public static final class C0309a {

        /* renamed from: a */
        private final List<C0307c> f1304a = new ArrayList();

        C0309a(List<C0307c> list) {
            for (C0307c add : list) {
                this.f1304a.add(add);
            }
        }

        /* renamed from: a */
        public List<C0788c1> mo1898a() {
            ArrayList arrayList = new ArrayList();
            for (C0307c d : this.f1304a) {
                C0788c1 d2 = d.mo1891d();
                if (d2 != null) {
                    arrayList.add(d2);
                }
            }
            return arrayList;
        }

        /* renamed from: b */
        public List<C0788c1> mo1899b() {
            ArrayList arrayList = new ArrayList();
            for (C0307c e : this.f1304a) {
                C0788c1 e2 = e.mo1892e();
                if (e2 != null) {
                    arrayList.add(e2);
                }
            }
            return arrayList;
        }

        /* renamed from: c */
        public List<C0788c1> mo1900c() {
            ArrayList arrayList = new ArrayList();
            for (C0307c f : this.f1304a) {
                C0788c1 f2 = f.mo1893f();
                if (f2 != null) {
                    arrayList.add(f2);
                }
            }
            return arrayList;
        }

        /* renamed from: d */
        public List<C0788c1> mo1901d() {
            ArrayList arrayList = new ArrayList();
            for (C0307c g : this.f1304a) {
                C0788c1 g2 = g.mo1894g();
                if (g2 != null) {
                    arrayList.add(g2);
                }
            }
            return arrayList;
        }
    }

    public C0308d(C0307c... cVarArr) {
        mo3169a(Arrays.asList(cVarArr));
    }

    /* renamed from: e */
    public static C0308d m1523e() {
        return new C0308d(new C0307c[0]);
    }

    /* renamed from: b */
    public C0914y1<C0307c> clone() {
        C0308d e = m1523e();
        e.mo3169a(mo3170c());
        return e;
    }

    /* renamed from: d */
    public C0309a mo1897d() {
        return new C0309a(mo3170c());
    }
}
