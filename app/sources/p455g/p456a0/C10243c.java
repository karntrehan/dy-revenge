package p455g.p456a0;

import p455g.p470y.p472d.C10452g;

/* renamed from: g.a0.c */
public final class C10243c extends C10240a {

    /* renamed from: r */
    public static final C10244a f27486r = new C10244a((C10452g) null);
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final C10243c f27487s = new C10243c(1, 0);

    /* renamed from: g.a0.c$a */
    public static final class C10244a {
        private C10244a() {
        }

        public /* synthetic */ C10244a(C10452g gVar) {
            this();
        }

        /* renamed from: a */
        public final C10243c mo25562a() {
            return C10243c.f27487s;
        }
    }

    public C10243c(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10243c) {
            if (!isEmpty() || !((C10243c) obj).isEmpty()) {
                C10243c cVar = (C10243c) obj;
                if (!(mo25547b() == cVar.mo25547b() && mo25549g() == cVar.mo25549g())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo25547b() * 31) + mo25549g();
    }

    public boolean isEmpty() {
        return mo25547b() > mo25549g();
    }

    /* renamed from: o */
    public boolean mo25559o(int i) {
        return mo25547b() <= i && i <= mo25549g();
    }

    /* renamed from: p */
    public Integer mo25560p() {
        return Integer.valueOf(mo25549g());
    }

    /* renamed from: r */
    public Integer mo25561r() {
        return Integer.valueOf(mo25547b());
    }

    public String toString() {
        return mo25547b() + ".." + mo25549g();
    }
}
