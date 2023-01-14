package p174e.p319f.p320a.p335c.p345f.p352g;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e.f.a.c.f.g.v6 */
public abstract class C7041v6 {

    /* renamed from: a */
    private static final Object f19010a = new Object();

    /* renamed from: b */
    private static volatile C6993s6 f19011b;

    /* renamed from: c */
    private static final AtomicReference f19012c = new AtomicReference();

    /* renamed from: d */
    private static final C7073x6 f19013d = new C7073x6(C6897m6.f18628a, (byte[]) null);

    /* renamed from: e */
    private static final AtomicInteger f19014e = new AtomicInteger();

    /* renamed from: f */
    public static final /* synthetic */ int f19015f = 0;

    /* renamed from: g */
    final C6977r6 f19016g;

    /* renamed from: h */
    final String f19017h;

    /* renamed from: i */
    private final Object f19018i;

    /* renamed from: j */
    private volatile int f19019j = -1;

    /* renamed from: k */
    private volatile Object f19020k;

    /* renamed from: l */
    private final boolean f19021l;

    /* synthetic */ C7041v6(C6977r6 r6Var, String str, Object obj, boolean z, C7009t6 t6Var) {
        if (r6Var.f18839b != null) {
            this.f19016g = r6Var;
            this.f19017h = str;
            this.f19018i = obj;
            this.f19021l = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: d */
    public static void m26924d() {
        f19014e.incrementAndGet();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: e */
    public static void m26925e(android.content.Context r3) {
        /*
            e.f.a.c.f.g.s6 r0 = f19011b
            if (r0 != 0) goto L_0x0045
            java.lang.Object r0 = f19010a
            monitor-enter(r0)
            e.f.a.c.f.g.s6 r1 = f19011b     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0040
            monitor-enter(r0)     // Catch:{ all -> 0x0042 }
            e.f.a.c.f.g.s6 r1 = f19011b     // Catch:{ all -> 0x003d }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0015
            r3 = r2
        L_0x0015:
            if (r1 == 0) goto L_0x001d
            android.content.Context r1 = r1.mo20151a()     // Catch:{ all -> 0x003d }
            if (r1 == r3) goto L_0x003b
        L_0x001d:
            p174e.p319f.p320a.p335c.p345f.p352g.C7088y5.m27038e()     // Catch:{ all -> 0x003d }
            p174e.p319f.p320a.p335c.p345f.p352g.C7057w6.m26970c()     // Catch:{ all -> 0x003d }
            p174e.p319f.p320a.p335c.p345f.p352g.C6801g6.m25748e()     // Catch:{ all -> 0x003d }
            e.f.a.c.f.g.l6 r1 = new e.f.a.c.f.g.l6     // Catch:{ all -> 0x003d }
            r1.<init>(r3)     // Catch:{ all -> 0x003d }
            e.f.a.c.f.g.c7 r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6802g7.m25752a(r1)     // Catch:{ all -> 0x003d }
            e.f.a.c.f.g.v5 r2 = new e.f.a.c.f.g.v5     // Catch:{ all -> 0x003d }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x003d }
            f19011b = r2     // Catch:{ all -> 0x003d }
            java.util.concurrent.atomic.AtomicInteger r3 = f19014e     // Catch:{ all -> 0x003d }
            r3.incrementAndGet()     // Catch:{ all -> 0x003d }
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0040
        L_0x003d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r3     // Catch:{ all -> 0x0042 }
        L_0x0040:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return
        L_0x0042:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r3
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C7041v6.m26925e(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo19989a(Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        r2 = r2.mo19678a(mo20383c());
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0099  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo20382b() {
        /*
            r6 = this;
            boolean r0 = r6.f19021l
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = r6.f19017h
            java.lang.String r1 = "flagName must not be null"
            java.util.Objects.requireNonNull(r0, r1)
        L_0x000b:
            java.util.concurrent.atomic.AtomicInteger r0 = f19014e
            int r0 = r0.get()
            int r1 = r6.f19019j
            if (r1 >= r0) goto L_0x00d6
            monitor-enter(r6)
            int r1 = r6.f19019j     // Catch:{ all -> 0x00d3 }
            if (r1 >= r0) goto L_0x00d1
            e.f.a.c.f.g.s6 r1 = f19011b     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x00cb
            e.f.a.c.f.g.r6 r2 = r6.f19016g     // Catch:{ all -> 0x00d3 }
            boolean r3 = r2.f18843f     // Catch:{ all -> 0x00d3 }
            android.net.Uri r2 = r2.f18839b     // Catch:{ all -> 0x00d3 }
            r3 = 0
            if (r2 == 0) goto L_0x0050
            android.content.Context r2 = r1.mo20151a()     // Catch:{ all -> 0x00d3 }
            e.f.a.c.f.g.r6 r4 = r6.f19016g     // Catch:{ all -> 0x00d3 }
            android.net.Uri r4 = r4.f18839b     // Catch:{ all -> 0x00d3 }
            boolean r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6833i6.m25866a(r2, r4)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x004e
            e.f.a.c.f.g.r6 r2 = r6.f19016g     // Catch:{ all -> 0x00d3 }
            boolean r2 = r2.f18845h     // Catch:{ all -> 0x00d3 }
            android.content.Context r2 = r1.mo20151a()     // Catch:{ all -> 0x00d3 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x00d3 }
            e.f.a.c.f.g.r6 r4 = r6.f19016g     // Catch:{ all -> 0x00d3 }
            android.net.Uri r4 = r4.f18839b     // Catch:{ all -> 0x00d3 }
            e.f.a.c.f.g.k6 r5 = p174e.p319f.p320a.p335c.p345f.p352g.C6865k6.f18578f     // Catch:{ all -> 0x00d3 }
            e.f.a.c.f.g.y5 r2 = p174e.p319f.p320a.p335c.p345f.p352g.C7088y5.m27037b(r2, r4, r5)     // Catch:{ all -> 0x00d3 }
            goto L_0x005e
        L_0x004e:
            r2 = r3
            goto L_0x005e
        L_0x0050:
            android.content.Context r2 = r1.mo20151a()     // Catch:{ all -> 0x00d3 }
            e.f.a.c.f.g.r6 r4 = r6.f19016g     // Catch:{ all -> 0x00d3 }
            java.lang.String r4 = r4.f18838a     // Catch:{ all -> 0x00d3 }
            e.f.a.c.f.g.k6 r4 = p174e.p319f.p320a.p335c.p345f.p352g.C6865k6.f18578f     // Catch:{ all -> 0x00d3 }
            e.f.a.c.f.g.w6 r2 = p174e.p319f.p320a.p335c.p345f.p352g.C7057w6.m26969b(r2, r3, r4)     // Catch:{ all -> 0x00d3 }
        L_0x005e:
            if (r2 == 0) goto L_0x006f
            java.lang.String r4 = r6.mo20383c()     // Catch:{ all -> 0x00d3 }
            java.lang.Object r2 = r2.mo19678a(r4)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r6.mo19989a(r2)     // Catch:{ all -> 0x00d3 }
            goto L_0x0070
        L_0x006f:
            r2 = r3
        L_0x0070:
            if (r2 == 0) goto L_0x0073
            goto L_0x009b
        L_0x0073:
            e.f.a.c.f.g.r6 r2 = r6.f19016g     // Catch:{ all -> 0x00d3 }
            boolean r2 = r2.f18842e     // Catch:{ all -> 0x00d3 }
            if (r2 != 0) goto L_0x0096
            android.content.Context r2 = r1.mo20151a()     // Catch:{ all -> 0x00d3 }
            e.f.a.c.f.g.g6 r2 = p174e.p319f.p320a.p335c.p345f.p352g.C6801g6.m25747b(r2)     // Catch:{ all -> 0x00d3 }
            e.f.a.c.f.g.r6 r4 = r6.f19016g     // Catch:{ all -> 0x00d3 }
            boolean r4 = r4.f18842e     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x0089
            r4 = r3
            goto L_0x008b
        L_0x0089:
            java.lang.String r4 = r6.f19017h     // Catch:{ all -> 0x00d3 }
        L_0x008b:
            java.lang.String r2 = r2.mo19678a(r4)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x0096
            java.lang.Object r2 = r6.mo19989a(r2)     // Catch:{ all -> 0x00d3 }
            goto L_0x0097
        L_0x0096:
            r2 = r3
        L_0x0097:
            if (r2 != 0) goto L_0x009b
            java.lang.Object r2 = r6.f19018i     // Catch:{ all -> 0x00d3 }
        L_0x009b:
            e.f.a.c.f.g.c7 r1 = r1.mo20152b()     // Catch:{ all -> 0x00d3 }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x00d3 }
            e.f.a.c.f.g.a7 r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6700a7) r1     // Catch:{ all -> 0x00d3 }
            boolean r4 = r1.mo19514b()     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x00c6
            java.lang.Object r1 = r1.mo19513a()     // Catch:{ all -> 0x00d3 }
            e.f.a.c.f.g.a6 r1 = (p174e.p319f.p320a.p335c.p345f.p352g.C6699a6) r1     // Catch:{ all -> 0x00d3 }
            e.f.a.c.f.g.r6 r2 = r6.f19016g     // Catch:{ all -> 0x00d3 }
            android.net.Uri r4 = r2.f18839b     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = r2.f18841d     // Catch:{ all -> 0x00d3 }
            java.lang.String r5 = r6.f19017h     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = r1.mo19512a(r4, r3, r2, r5)     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x00c2
            java.lang.Object r2 = r6.f19018i     // Catch:{ all -> 0x00d3 }
            goto L_0x00c6
        L_0x00c2:
            java.lang.Object r2 = r6.mo19989a(r1)     // Catch:{ all -> 0x00d3 }
        L_0x00c6:
            r6.f19020k = r2     // Catch:{ all -> 0x00d3 }
            r6.f19019j = r0     // Catch:{ all -> 0x00d3 }
            goto L_0x00d1
        L_0x00cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d3 }
            r0.<init>(r2)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d1:
            monitor-exit(r6)     // Catch:{ all -> 0x00d3 }
            goto L_0x00d6
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00d3 }
            throw r0
        L_0x00d6:
            java.lang.Object r0 = r6.f19020k
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C7041v6.mo20382b():java.lang.Object");
    }

    /* renamed from: c */
    public final String mo20383c() {
        String str = this.f19016g.f18841d;
        return this.f19017h;
    }
}
