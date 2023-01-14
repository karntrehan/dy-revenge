package androidx.lifecycle;

import androidx.lifecycle.C1286d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p027c.p036b.p037a.p039b.C1485a;
import p027c.p036b.p037a.p039b.C1486b;

/* renamed from: androidx.lifecycle.h */
public class C1292h extends C1286d {

    /* renamed from: b */
    private C1485a<C1290f, C1294b> f3721b = new C1485a<>();

    /* renamed from: c */
    private C1286d.C1288b f3722c;

    /* renamed from: d */
    private final WeakReference<C1291g> f3723d;

    /* renamed from: e */
    private int f3724e = 0;

    /* renamed from: f */
    private boolean f3725f = false;

    /* renamed from: g */
    private boolean f3726g = false;

    /* renamed from: h */
    private ArrayList<C1286d.C1288b> f3727h = new ArrayList<>();

    /* renamed from: androidx.lifecycle.h$a */
    static /* synthetic */ class C1293a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3728a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3729b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0082 */
        static {
            /*
                androidx.lifecycle.d$b[] r0 = androidx.lifecycle.C1286d.C1288b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3729b = r0
                r1 = 1
                androidx.lifecycle.d$b r2 = androidx.lifecycle.C1286d.C1288b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3729b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.d$b r3 = androidx.lifecycle.C1286d.C1288b.CREATED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3729b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.d$b r4 = androidx.lifecycle.C1286d.C1288b.STARTED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f3729b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.d$b r5 = androidx.lifecycle.C1286d.C1288b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f3729b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.d$b r6 = androidx.lifecycle.C1286d.C1288b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                androidx.lifecycle.d$a[] r5 = androidx.lifecycle.C1286d.C1287a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f3728a = r5
                androidx.lifecycle.d$a r6 = androidx.lifecycle.C1286d.C1287a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r1 = f3728a     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.lifecycle.d$a r5 = androidx.lifecycle.C1286d.C1287a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f3728a     // Catch:{ NoSuchFieldError -> 0x0063 }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.C1286d.C1287a.ON_START     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f3728a     // Catch:{ NoSuchFieldError -> 0x006d }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.C1286d.C1287a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f3728a     // Catch:{ NoSuchFieldError -> 0x0077 }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.C1286d.C1287a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                int[] r0 = f3728a     // Catch:{ NoSuchFieldError -> 0x0082 }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.C1286d.C1287a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = f3728a     // Catch:{ NoSuchFieldError -> 0x008d }
                androidx.lifecycle.d$a r1 = androidx.lifecycle.C1286d.C1287a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1292h.C1293a.<clinit>():void");
        }
    }

    /* renamed from: androidx.lifecycle.h$b */
    static class C1294b {

        /* renamed from: a */
        C1286d.C1288b f3730a;

        /* renamed from: b */
        C1289e f3731b;

        C1294b(C1290f fVar, C1286d.C1288b bVar) {
            this.f3731b = C1296j.m5326f(fVar);
            this.f3730a = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4345a(C1291g gVar, C1286d.C1287a aVar) {
            C1286d.C1288b h = C1292h.m5306h(aVar);
            this.f3730a = C1292h.m5308l(this.f3730a, h);
            this.f3731b.mo137h(gVar, aVar);
            this.f3730a = h;
        }
    }

    public C1292h(C1291g gVar) {
        this.f3723d = new WeakReference<>(gVar);
        this.f3722c = C1286d.C1288b.INITIALIZED;
    }

    /* renamed from: d */
    private void m5302d(C1291g gVar) {
        Iterator<Map.Entry<C1290f, C1294b>> b = this.f3721b.mo5525b();
        while (b.hasNext() && !this.f3726g) {
            Map.Entry next = b.next();
            C1294b bVar = (C1294b) next.getValue();
            while (bVar.f3730a.compareTo(this.f3722c) > 0 && !this.f3726g && this.f3721b.contains(next.getKey())) {
                C1286d.C1287a f = m5304f(bVar.f3730a);
                m5311o(m5306h(f));
                bVar.mo4345a(gVar, f);
                m5310n();
            }
        }
    }

    /* renamed from: e */
    private C1286d.C1288b m5303e(C1290f fVar) {
        Map.Entry<C1290f, C1294b> v = this.f3721b.mo5524v(fVar);
        C1286d.C1288b bVar = null;
        C1286d.C1288b bVar2 = v != null ? v.getValue().f3730a : null;
        if (!this.f3727h.isEmpty()) {
            ArrayList<C1286d.C1288b> arrayList = this.f3727h;
            bVar = arrayList.get(arrayList.size() - 1);
        }
        return m5308l(m5308l(this.f3722c, bVar2), bVar);
    }

    /* renamed from: f */
    private static C1286d.C1287a m5304f(C1286d.C1288b bVar) {
        int i = C1293a.f3729b[bVar.ordinal()];
        if (i == 1) {
            throw new IllegalArgumentException();
        } else if (i == 2) {
            return C1286d.C1287a.ON_DESTROY;
        } else {
            if (i == 3) {
                return C1286d.C1287a.ON_STOP;
            }
            if (i == 4) {
                return C1286d.C1287a.ON_PAUSE;
            }
            if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: g */
    private void m5305g(C1291g gVar) {
        C1486b<K, V>.d j = this.f3721b.mo5530j();
        while (j.hasNext() && !this.f3726g) {
            Map.Entry entry = (Map.Entry) j.next();
            C1294b bVar = (C1294b) entry.getValue();
            while (bVar.f3730a.compareTo(this.f3722c) < 0 && !this.f3726g && this.f3721b.contains(entry.getKey())) {
                m5311o(bVar.f3730a);
                bVar.mo4345a(gVar, m5313r(bVar.f3730a));
                m5310n();
            }
        }
    }

    /* renamed from: h */
    static C1286d.C1288b m5306h(C1286d.C1287a aVar) {
        switch (C1293a.f3728a[aVar.ordinal()]) {
            case 1:
            case 2:
                return C1286d.C1288b.CREATED;
            case 3:
            case 4:
                return C1286d.C1288b.STARTED;
            case 5:
                return C1286d.C1288b.RESUMED;
            case 6:
                return C1286d.C1288b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    /* renamed from: j */
    private boolean m5307j() {
        if (this.f3721b.size() == 0) {
            return true;
        }
        C1286d.C1288b bVar = this.f3721b.mo5527g().getValue().f3730a;
        C1286d.C1288b bVar2 = this.f3721b.mo5531k().getValue().f3730a;
        return bVar == bVar2 && this.f3722c == bVar2;
    }

    /* renamed from: l */
    static C1286d.C1288b m5308l(C1286d.C1288b bVar, C1286d.C1288b bVar2) {
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    /* renamed from: m */
    private void m5309m(C1286d.C1288b bVar) {
        if (this.f3722c != bVar) {
            this.f3722c = bVar;
            if (this.f3725f || this.f3724e != 0) {
                this.f3726g = true;
                return;
            }
            this.f3725f = true;
            m5312q();
            this.f3725f = false;
        }
    }

    /* renamed from: n */
    private void m5310n() {
        ArrayList<C1286d.C1288b> arrayList = this.f3727h;
        arrayList.remove(arrayList.size() - 1);
    }

    /* renamed from: o */
    private void m5311o(C1286d.C1288b bVar) {
        this.f3727h.add(bVar);
    }

    /* renamed from: q */
    private void m5312q() {
        C1291g gVar = (C1291g) this.f3723d.get();
        if (gVar != null) {
            while (true) {
                boolean j = m5307j();
                this.f3726g = false;
                if (!j) {
                    if (this.f3722c.compareTo(this.f3721b.mo5527g().getValue().f3730a) < 0) {
                        m5302d(gVar);
                    }
                    Map.Entry<C1290f, C1294b> k = this.f3721b.mo5531k();
                    if (!this.f3726g && k != null && this.f3722c.compareTo(k.getValue().f3730a) > 0) {
                        m5305g(gVar);
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }

    /* renamed from: r */
    private static C1286d.C1287a m5313r(C1286d.C1288b bVar) {
        int i = C1293a.f3729b[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return C1286d.C1287a.ON_START;
            }
            if (i == 3) {
                return C1286d.C1287a.ON_RESUME;
            }
            if (i == 4) {
                throw new IllegalArgumentException();
            } else if (i != 5) {
                throw new IllegalArgumentException("Unexpected state value " + bVar);
            }
        }
        return C1286d.C1287a.ON_CREATE;
    }

    /* renamed from: a */
    public void mo4338a(C1290f fVar) {
        C1291g gVar;
        C1286d.C1288b bVar = this.f3722c;
        C1286d.C1288b bVar2 = C1286d.C1288b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = C1286d.C1288b.INITIALIZED;
        }
        C1294b bVar3 = new C1294b(fVar, bVar2);
        if (this.f3721b.mo5522p(fVar, bVar3) == null && (gVar = (C1291g) this.f3723d.get()) != null) {
            boolean z = this.f3724e != 0 || this.f3725f;
            C1286d.C1288b e = m5303e(fVar);
            this.f3724e++;
            while (bVar3.f3730a.compareTo(e) < 0 && this.f3721b.contains(fVar)) {
                m5311o(bVar3.f3730a);
                bVar3.mo4345a(gVar, m5313r(bVar3.f3730a));
                m5310n();
                e = m5303e(fVar);
            }
            if (!z) {
                m5312q();
            }
            this.f3724e--;
        }
    }

    /* renamed from: b */
    public C1286d.C1288b mo4339b() {
        return this.f3722c;
    }

    /* renamed from: c */
    public void mo4340c(C1290f fVar) {
        this.f3721b.mo5523r(fVar);
    }

    /* renamed from: i */
    public void mo4342i(C1286d.C1287a aVar) {
        m5309m(m5306h(aVar));
    }

    @Deprecated
    /* renamed from: k */
    public void mo4343k(C1286d.C1288b bVar) {
        mo4344p(bVar);
    }

    /* renamed from: p */
    public void mo4344p(C1286d.C1288b bVar) {
        m5309m(bVar);
    }
}
