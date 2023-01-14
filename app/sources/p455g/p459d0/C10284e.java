package p455g.p459d0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p455g.C10314l;
import p455g.p456a0.C10243c;
import p455g.p458c0.C10268d;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.d0.e */
final class C10284e implements C10268d<C10243c> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharSequence f27513a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final int f27514b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f27515c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10434p<CharSequence, Integer, C10314l<Integer, Integer>> f27516d;

    /* renamed from: g.d0.e$a */
    public static final class C10285a implements Iterator<C10243c>, C10445a {

        /* renamed from: f */
        private int f27517f = -1;

        /* renamed from: o */
        private int f27518o;

        /* renamed from: p */
        private int f27519p;

        /* renamed from: q */
        private C10243c f27520q;

        /* renamed from: r */
        private int f27521r;

        /* renamed from: s */
        final /* synthetic */ C10284e f27522s;

        C10285a(C10284e eVar) {
            this.f27522s = eVar;
            int f = C10247f.m34830f(eVar.f27514b, 0, eVar.f27513a.length());
            this.f27518o = f;
            this.f27519p = f;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < p455g.p459d0.C10284e.m34871d(r6.f27522s)) goto L_0x0023;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m34873b() {
            /*
                r6 = this;
                int r0 = r6.f27519p
                r1 = 0
                if (r0 >= 0) goto L_0x000c
                r6.f27517f = r1
                r0 = 0
                r6.f27520q = r0
                goto L_0x0099
            L_0x000c:
                g.d0.e r0 = r6.f27522s
                int r0 = r0.f27515c
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L_0x0023
                int r0 = r6.f27521r
                int r0 = r0 + r3
                r6.f27521r = r0
                g.d0.e r4 = r6.f27522s
                int r4 = r4.f27515c
                if (r0 >= r4) goto L_0x0031
            L_0x0023:
                int r0 = r6.f27519p
                g.d0.e r4 = r6.f27522s
                java.lang.CharSequence r4 = r4.f27513a
                int r4 = r4.length()
                if (r0 <= r4) goto L_0x0047
            L_0x0031:
                g.a0.c r0 = new g.a0.c
                int r1 = r6.f27518o
                g.d0.e r4 = r6.f27522s
                java.lang.CharSequence r4 = r4.f27513a
                int r4 = p455g.p459d0.C10300q.m34955L(r4)
                r0.<init>(r1, r4)
            L_0x0042:
                r6.f27520q = r0
            L_0x0044:
                r6.f27519p = r2
                goto L_0x0097
            L_0x0047:
                g.d0.e r0 = r6.f27522s
                g.y.c.p r0 = r0.f27516d
                g.d0.e r4 = r6.f27522s
                java.lang.CharSequence r4 = r4.f27513a
                int r5 = r6.f27519p
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo15709j(r4, r5)
                g.l r0 = (p455g.C10314l) r0
                if (r0 != 0) goto L_0x0073
                g.a0.c r0 = new g.a0.c
                int r1 = r6.f27518o
                g.d0.e r4 = r6.f27522s
                java.lang.CharSequence r4 = r4.f27513a
                int r4 = p455g.p459d0.C10300q.m34955L(r4)
                r0.<init>(r1, r4)
                goto L_0x0042
            L_0x0073:
                java.lang.Object r2 = r0.mo25609a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.mo25610b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f27518o
                g.a0.c r4 = p455g.p456a0.C10247f.m34833i(r4, r2)
                r6.f27520q = r4
                int r2 = r2 + r0
                r6.f27518o = r2
                if (r0 != 0) goto L_0x0095
                r1 = 1
            L_0x0095:
                int r2 = r2 + r1
                goto L_0x0044
            L_0x0097:
                r6.f27517f = r3
            L_0x0099:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p455g.p459d0.C10284e.C10285a.m34873b():void");
        }

        /* renamed from: c */
        public C10243c next() {
            if (this.f27517f == -1) {
                m34873b();
            }
            if (this.f27517f != 0) {
                C10243c cVar = this.f27520q;
                C10457l.m35318c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f27520q = null;
                this.f27517f = -1;
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            if (this.f27517f == -1) {
                m34873b();
            }
            return this.f27517f == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10284e(CharSequence charSequence, int i, int i2, C10434p<? super CharSequence, ? super Integer, C10314l<Integer, Integer>> pVar) {
        C10457l.m35320e(charSequence, "input");
        C10457l.m35320e(pVar, "getNextMatch");
        this.f27513a = charSequence;
        this.f27514b = i;
        this.f27515c = i2;
        this.f27516d = pVar;
    }

    public Iterator<C10243c> iterator() {
        return new C10285a(this);
    }
}
