package p455g.p462v;

import java.io.Serializable;
import okhttp3.HttpUrl;
import p455g.p462v.C10381g;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10458m;

/* renamed from: g.v.c */
public final class C10374c implements C10381g, Serializable {

    /* renamed from: f */
    private final C10381g f27568f;

    /* renamed from: o */
    private final C10381g.C10384b f27569o;

    /* renamed from: g.v.c$a */
    static final class C10375a extends C10458m implements C10434p<String, C10381g.C10384b, String> {

        /* renamed from: f */
        public static final C10375a f27570f = new C10375a();

        C10375a() {
            super(2);
        }

        /* renamed from: a */
        public final String mo15709j(String str, C10381g.C10384b bVar) {
            C10457l.m35320e(str, "acc");
            C10457l.m35320e(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public C10374c(C10381g gVar, C10381g.C10384b bVar) {
        C10457l.m35320e(gVar, "left");
        C10457l.m35320e(bVar, "element");
        this.f27568f = gVar;
        this.f27569o = bVar;
    }

    /* renamed from: a */
    private final boolean m35212a(C10381g.C10384b bVar) {
        return C10457l.m35316a(get(bVar.getKey()), bVar);
    }

    /* renamed from: c */
    private final boolean m35213c(C10374c cVar) {
        while (m35212a(cVar.f27569o)) {
            C10381g gVar = cVar.f27568f;
            if (gVar instanceof C10374c) {
                cVar = (C10374c) gVar;
            } else {
                C10457l.m35318c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m35212a((C10381g.C10384b) gVar);
            }
        }
        return false;
    }

    /* renamed from: d */
    private final int m35214d() {
        int i = 2;
        C10374c cVar = this;
        while (true) {
            C10381g gVar = cVar.f27568f;
            cVar = gVar instanceof C10374c ? (C10374c) gVar : null;
            if (cVar == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10374c) {
                C10374c cVar = (C10374c) obj;
                if (cVar.m35214d() != m35214d() || !cVar.m35213c(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, C10434p<? super R, ? super C10381g.C10384b, ? extends R> pVar) {
        C10457l.m35320e(pVar, "operation");
        return pVar.mo15709j(this.f27568f.fold(r, pVar), this.f27569o);
    }

    public <E extends C10381g.C10384b> E get(C10381g.C10386c<E> cVar) {
        C10457l.m35320e(cVar, "key");
        C10374c cVar2 = this;
        while (true) {
            E e = cVar2.f27569o.get(cVar);
            if (e != null) {
                return e;
            }
            C10381g gVar = cVar2.f27568f;
            if (!(gVar instanceof C10374c)) {
                return gVar.get(cVar);
            }
            cVar2 = (C10374c) gVar;
        }
    }

    public int hashCode() {
        return this.f27568f.hashCode() + this.f27569o.hashCode();
    }

    public C10381g minusKey(C10381g.C10386c<?> cVar) {
        C10457l.m35320e(cVar, "key");
        if (this.f27569o.get(cVar) != null) {
            return this.f27568f;
        }
        C10381g minusKey = this.f27568f.minusKey(cVar);
        return minusKey == this.f27568f ? this : minusKey == C10387h.f27574f ? this.f27569o : new C10374c(minusKey, this.f27569o);
    }

    public C10381g plus(C10381g gVar) {
        return C10381g.C10382a.m35224a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold(HttpUrl.FRAGMENT_ENCODE_SET, C10375a.f27570f)) + ']';
    }
}
