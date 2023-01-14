package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.internal.l */
public class C10750l {

    /* renamed from: f */
    static final /* synthetic */ AtomicReferenceFieldUpdater f28244f;

    /* renamed from: o */
    static final /* synthetic */ AtomicReferenceFieldUpdater f28245o;

    /* renamed from: p */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28246p;
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: kotlinx.coroutines.internal.l$a */
    public static abstract class C10751a extends C10733c<C10750l> {

        /* renamed from: b */
        public final C10750l f28247b;

        /* renamed from: c */
        public C10750l f28248c;

        public C10751a(C10750l lVar) {
            this.f28247b = lVar;
        }

        /* renamed from: h */
        public void mo26700d(C10750l lVar, Object obj) {
            boolean z = obj == null;
            C10750l lVar2 = z ? this.f28247b : this.f28248c;
            if (lVar2 != null && C10750l.f28244f.compareAndSet(lVar, this, lVar2) && z) {
                C10750l lVar3 = this.f28247b;
                C10750l lVar4 = this.f28248c;
                C10457l.m35317b(lVar4);
                lVar3.m36535k(lVar4);
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C10750l> cls2 = C10750l.class;
        f28244f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f28245o = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f28246p = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: kotlinx.coroutines.internal.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlinx.coroutines.internal.l} */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (f28244f.compareAndSet(r3, r2, ((kotlinx.coroutines.internal.C10760s) r4).f28265a) != false) goto L_0x004b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlinx.coroutines.internal.C10750l m36533g(kotlinx.coroutines.internal.C10759r r8) {
        /*
            r7 = this;
        L_0x0000:
            java.lang.Object r0 = r7._prev
            kotlinx.coroutines.internal.l r0 = (kotlinx.coroutines.internal.C10750l) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L_0x0018
            if (r0 != r2) goto L_0x000e
            return r2
        L_0x000e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f28245o
            boolean r0 = r1.compareAndSet(r7, r0, r2)
            if (r0 != 0) goto L_0x0017
            goto L_0x0000
        L_0x0017:
            return r2
        L_0x0018:
            boolean r5 = r7.mo26725o()
            if (r5 == 0) goto L_0x001f
            return r1
        L_0x001f:
            if (r4 != r8) goto L_0x0022
            return r2
        L_0x0022:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C10759r
            if (r5 == 0) goto L_0x0038
            if (r8 == 0) goto L_0x0032
            r0 = r4
            kotlinx.coroutines.internal.r r0 = (kotlinx.coroutines.internal.C10759r) r0
            boolean r0 = r8.mo26750b(r0)
            if (r0 == 0) goto L_0x0032
            return r1
        L_0x0032:
            kotlinx.coroutines.internal.r r4 = (kotlinx.coroutines.internal.C10759r) r4
            r4.mo26699c(r2)
            goto L_0x0000
        L_0x0038:
            boolean r5 = r4 instanceof kotlinx.coroutines.internal.C10760s
            if (r5 == 0) goto L_0x0052
            if (r3 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f28244f
            kotlinx.coroutines.internal.s r4 = (kotlinx.coroutines.internal.C10760s) r4
            kotlinx.coroutines.internal.l r4 = r4.f28265a
            boolean r2 = r5.compareAndSet(r3, r2, r4)
            if (r2 != 0) goto L_0x004b
            goto L_0x0000
        L_0x004b:
            r2 = r3
            goto L_0x0006
        L_0x004d:
            java.lang.Object r2 = r2._prev
            kotlinx.coroutines.internal.l r2 = (kotlinx.coroutines.internal.C10750l) r2
            goto L_0x0007
        L_0x0052:
            r3 = r4
            kotlinx.coroutines.internal.l r3 = (kotlinx.coroutines.internal.C10750l) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C10750l.m36533g(kotlinx.coroutines.internal.r):kotlinx.coroutines.internal.l");
    }

    /* renamed from: i */
    private final C10750l m36534i(C10750l lVar) {
        while (lVar.mo26725o()) {
            lVar = (C10750l) lVar._prev;
        }
        return lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m36535k(C10750l lVar) {
        C10750l lVar2;
        do {
            lVar2 = (C10750l) lVar._prev;
            if (mo26727l() != lVar) {
                return;
            }
        } while (!f28245o.compareAndSet(lVar, lVar2, this));
        if (mo26725o()) {
            lVar.m36533g((C10759r) null);
        }
    }

    /* renamed from: r */
    private final C10760s m36536r() {
        C10760s sVar = (C10760s) this._removedRef;
        if (sVar != null) {
            return sVar;
        }
        C10760s sVar2 = new C10760s(this);
        f28246p.lazySet(this, sVar2);
        return sVar2;
    }

    /* renamed from: d */
    public final boolean mo26726d(C10750l lVar) {
        f28245o.lazySet(lVar, this);
        f28244f.lazySet(lVar, this);
        while (mo26727l() == this) {
            if (f28244f.compareAndSet(this, this, lVar)) {
                lVar.m36535k(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public final Object mo26727l() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C10759r)) {
                return obj;
            }
            ((C10759r) obj).mo26699c(this);
        }
    }

    /* renamed from: m */
    public final C10750l mo26728m() {
        return C10749k.m36531b(mo26727l());
    }

    /* renamed from: n */
    public final C10750l mo26729n() {
        C10750l g = m36533g((C10759r) null);
        return g == null ? m36534i((C10750l) this._prev) : g;
    }

    /* renamed from: o */
    public boolean mo26725o() {
        return mo26727l() instanceof C10760s;
    }

    /* renamed from: p */
    public boolean mo26730p() {
        return mo26731q() == null;
    }

    /* renamed from: q */
    public final C10750l mo26731q() {
        Object l;
        C10750l lVar;
        do {
            l = mo26727l();
            if (l instanceof C10760s) {
                return ((C10760s) l).f28265a;
            }
            if (l == this) {
                return (C10750l) l;
            }
            lVar = (C10750l) l;
        } while (!f28244f.compareAndSet(this, l, lVar.m36536r()));
        lVar.m36533g((C10759r) null);
        return null;
    }

    /* renamed from: s */
    public final int mo26732s(C10750l lVar, C10750l lVar2, C10751a aVar) {
        f28245o.lazySet(lVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28244f;
        atomicReferenceFieldUpdater.lazySet(lVar, lVar2);
        aVar.f28248c = lVar2;
        if (!atomicReferenceFieldUpdater.compareAndSet(this, lVar2, aVar)) {
            return 0;
        }
        return aVar.mo26699c(this) == null ? 1 : 2;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
