package p455g.p462v.p464k.p465a;

import java.io.Serializable;
import p455g.C10315m;
import p455g.C10318n;
import p455g.C10323s;
import p455g.p462v.C10376d;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.v.k.a.a */
public abstract class C10396a implements C10376d<Object>, C10400e, Serializable {

    /* renamed from: f */
    private final C10376d<Object> f27588f;

    public C10396a(C10376d<Object> dVar) {
        this.f27588f = dVar;
    }

    /* renamed from: b */
    public C10376d<C10323s> mo15708b(Object obj, C10376d<?> dVar) {
        C10457l.m35320e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* renamed from: c */
    public C10400e mo25789c() {
        C10376d<Object> dVar = this.f27588f;
        if (dVar instanceof C10400e) {
            return (C10400e) dVar;
        }
        return null;
    }

    /* renamed from: d */
    public final void mo25782d(Object obj) {
        C10376d dVar = this;
        while (true) {
            C10403h.m35273b(dVar);
            C10396a aVar = (C10396a) dVar;
            C10376d dVar2 = aVar.f27588f;
            C10457l.m35317b(dVar2);
            try {
                Object n = aVar.mo15707n(obj);
                if (n != C10395d.m35244c()) {
                    C10315m.C10316a aVar2 = C10315m.f27541f;
                    obj = C10315m.m35012a(n);
                    aVar.mo25793o();
                    if (dVar2 instanceof C10396a) {
                        dVar = dVar2;
                    } else {
                        dVar2.mo25782d(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                C10315m.C10316a aVar3 = C10315m.f27541f;
                obj = C10315m.m35012a(C10318n.m35016a(th));
            }
        }
    }

    /* renamed from: g */
    public StackTraceElement mo25790g() {
        return C10402g.m35271d(this);
    }

    /* renamed from: h */
    public final C10376d<Object> mo25792h() {
        return this.f27588f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract Object mo15707n(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo25793o() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object g = mo25790g();
        if (g == null) {
            g = getClass().getName();
        }
        sb.append(g);
        return sb.toString();
    }
}
