package p174e.p319f.p393c.p394a;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p174e.p319f.p393c.p394a.p395a0.C9204o;
import p174e.p319f.p393c.p394a.p403y.C9324c0;
import p174e.p319f.p393c.p394a.p403y.C9364i0;
import p174e.p319f.p393c.p394a.p403y.C9424z;

/* renamed from: e.f.c.a.p */
public final class C9237p<P> {

    /* renamed from: a */
    private final ConcurrentMap<C9240c, List<C9239b<P>>> f25147a = new ConcurrentHashMap();

    /* renamed from: b */
    private C9239b<P> f25148b;

    /* renamed from: c */
    private final Class<P> f25149c;

    /* renamed from: e.f.c.a.p$b */
    public static final class C9239b<P> {

        /* renamed from: a */
        private final P f25150a;

        /* renamed from: b */
        private final byte[] f25151b;

        /* renamed from: c */
        private final C9424z f25152c;

        /* renamed from: d */
        private final C9364i0 f25153d;

        /* renamed from: e */
        private final int f25154e;

        C9239b(P p, byte[] bArr, C9424z zVar, C9364i0 i0Var, int i) {
            this.f25150a = p;
            this.f25151b = Arrays.copyOf(bArr, bArr.length);
            this.f25152c = zVar;
            this.f25153d = i0Var;
            this.f25154e = i;
        }

        /* renamed from: a */
        public final byte[] mo23234a() {
            byte[] bArr = this.f25151b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        /* renamed from: b */
        public C9364i0 mo23235b() {
            return this.f25153d;
        }

        /* renamed from: c */
        public P mo23236c() {
            return this.f25150a;
        }

        /* renamed from: d */
        public C9424z mo23237d() {
            return this.f25152c;
        }
    }

    /* renamed from: e.f.c.a.p$c */
    private static class C9240c implements Comparable<C9240c> {

        /* renamed from: f */
        private final byte[] f25155f;

        private C9240c(byte[] bArr) {
            this.f25155f = Arrays.copyOf(bArr, bArr.length);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compareTo(p174e.p319f.p393c.p394a.C9237p.C9240c r7) {
            /*
                r6 = this;
                byte[] r0 = r6.f25155f
                int r1 = r0.length
                byte[] r2 = r7.f25155f
                int r3 = r2.length
                if (r1 == r3) goto L_0x000c
                int r7 = r0.length
                int r0 = r2.length
            L_0x000a:
                int r7 = r7 - r0
                return r7
            L_0x000c:
                r0 = 0
                r1 = 0
            L_0x000e:
                byte[] r2 = r6.f25155f
                int r3 = r2.length
                if (r1 >= r3) goto L_0x0023
                byte r3 = r2[r1]
                byte[] r4 = r7.f25155f
                byte r5 = r4[r1]
                if (r3 == r5) goto L_0x0020
                byte r7 = r2[r1]
                byte r0 = r4[r1]
                goto L_0x000a
            L_0x0020:
                int r1 = r1 + 1
                goto L_0x000e
            L_0x0023:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.C9237p.C9240c.compareTo(e.f.c.a.p$c):int");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9240c)) {
                return false;
            }
            return Arrays.equals(this.f25155f, ((C9240c) obj).f25155f);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f25155f);
        }

        public String toString() {
            return C9204o.m30581b(this.f25155f);
        }
    }

    private C9237p(Class<P> cls) {
        this.f25149c = cls;
    }

    /* renamed from: f */
    public static <P> C9237p<P> m30680f(Class<P> cls) {
        return new C9237p<>(cls);
    }

    /* renamed from: a */
    public C9239b<P> mo23228a(P p, C9324c0.C9327c cVar) {
        if (cVar.mo23375U() == C9424z.ENABLED) {
            C9239b bVar = new C9239b(p, C9218c.m30616a(cVar), cVar.mo23375U(), cVar.mo23374T(), cVar.mo23373S());
            ArrayList arrayList = new ArrayList();
            arrayList.add(bVar);
            C9240c cVar2 = new C9240c(bVar.mo23234a());
            List list = (List) this.f25147a.put(cVar2, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(bVar);
                this.f25147a.put(cVar2, Collections.unmodifiableList(arrayList2));
            }
            return bVar;
        }
        throw new GeneralSecurityException("only ENABLED key is allowed");
    }

    /* renamed from: b */
    public C9239b<P> mo23229b() {
        return this.f25148b;
    }

    /* renamed from: c */
    public List<C9239b<P>> mo23230c(byte[] bArr) {
        List<C9239b<P>> list = (List) this.f25147a.get(new C9240c(bArr));
        return list != null ? list : Collections.emptyList();
    }

    /* renamed from: d */
    public Class<P> mo23231d() {
        return this.f25149c;
    }

    /* renamed from: e */
    public List<C9239b<P>> mo23232e() {
        return mo23230c(C9218c.f25126a);
    }

    /* renamed from: g */
    public void mo23233g(C9239b<P> bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        } else if (bVar.mo23237d() != C9424z.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        } else if (!mo23230c(bVar.mo23234a()).isEmpty()) {
            this.f25148b = bVar;
        } else {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
    }
}
