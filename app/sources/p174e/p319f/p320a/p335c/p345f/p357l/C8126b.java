package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: e.f.a.c.f.l.b */
public abstract class C8126b<T> {

    /* renamed from: a */
    private static final Object f22071a = new Object();

    /* renamed from: b */
    private static volatile C8315kh f22072b;

    /* renamed from: c */
    private static final AtomicReference<Collection<C8126b<?>>> f22073c = new AtomicReference<>();

    /* renamed from: d */
    private static final C8164d f22074d = new C8164d(C8220fh.f22511a, (byte[]) null);

    /* renamed from: e */
    private static final AtomicInteger f22075e = new AtomicInteger();

    /* renamed from: f */
    public static final /* synthetic */ int f22076f = 0;

    /* renamed from: g */
    final C8296jh f22077g;

    /* renamed from: h */
    final String f22078h;

    /* renamed from: i */
    private final T f22079i;

    /* renamed from: j */
    private volatile int f22080j = -1;

    /* renamed from: k */
    private volatile T f22081k;

    /* renamed from: l */
    private final boolean f22082l;

    /* synthetic */ C8126b(C8296jh jhVar, String str, Object obj, boolean z, C8258hh hhVar) {
        if (jhVar.f22678b != null) {
            this.f22077g = jhVar;
            this.f22078h = str;
            this.f22079i = obj;
            this.f22082l = true;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: d */
    static void m28323d() {
        f22075e.incrementAndGet();
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
    public static void m28324e(android.content.Context r3) {
        /*
            e.f.a.c.f.l.kh r0 = f22072b
            if (r0 != 0) goto L_0x0045
            java.lang.Object r0 = f22071a
            monitor-enter(r0)
            e.f.a.c.f.l.kh r1 = f22072b     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x0040
            monitor-enter(r0)     // Catch:{ all -> 0x0042 }
            e.f.a.c.f.l.kh r1 = f22072b     // Catch:{ all -> 0x003d }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0015
            r3 = r2
        L_0x0015:
            if (r1 == 0) goto L_0x001d
            android.content.Context r1 = r1.mo21825a()     // Catch:{ all -> 0x003d }
            if (r1 == r3) goto L_0x003b
        L_0x001d:
            p174e.p319f.p320a.p335c.p345f.p357l.C8287j8.m28617d()     // Catch:{ all -> 0x003d }
            p174e.p319f.p320a.p335c.p345f.p357l.C8145c.m28372c()     // Catch:{ all -> 0x003d }
            p174e.p319f.p320a.p335c.p345f.p357l.C8386of.m28913e()     // Catch:{ all -> 0x003d }
            e.f.a.c.f.l.gh r1 = new e.f.a.c.f.l.gh     // Catch:{ all -> 0x003d }
            r1.<init>(r3)     // Catch:{ all -> 0x003d }
            e.f.a.c.f.l.e1 r1 = p174e.p319f.p320a.p335c.p345f.p357l.C8261i1.m28560a(r1)     // Catch:{ all -> 0x003d }
            e.f.a.c.f.l.g5 r2 = new e.f.a.c.f.l.g5     // Catch:{ all -> 0x003d }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x003d }
            f22072b = r2     // Catch:{ all -> 0x003d }
            java.util.concurrent.atomic.AtomicInteger r3 = f22075e     // Catch:{ all -> 0x003d }
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
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p357l.C8126b.m28324e(android.content.Context):void");
    }

    /* renamed from: f */
    private final String m28325f(String str) {
        if (str.isEmpty()) {
            return this.f22078h;
        }
        String valueOf = String.valueOf(this.f22078h);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract T mo21666a(Object obj);

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ec  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo21667b() {
        /*
            r7 = this;
            boolean r0 = r7.f22082l
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = r7.f22078h
            java.lang.String r1 = "flagName must not be null"
            java.util.Objects.requireNonNull(r0, r1)
        L_0x000b:
            java.util.concurrent.atomic.AtomicInteger r0 = f22075e
            int r0 = r0.get()
            int r1 = r7.f22080j
            if (r1 >= r0) goto L_0x0117
            monitor-enter(r7)
            int r1 = r7.f22080j     // Catch:{ all -> 0x0114 }
            if (r1 >= r0) goto L_0x0112
            e.f.a.c.f.l.kh r1 = f22072b     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = "Must call PhenotypeFlag.init() first"
            if (r1 == 0) goto L_0x010c
            e.f.a.c.f.l.jh r2 = r7.f22077g     // Catch:{ all -> 0x0114 }
            boolean r2 = r2.f22682f     // Catch:{ all -> 0x0114 }
            android.content.Context r2 = r1.mo21825a()     // Catch:{ all -> 0x0114 }
            e.f.a.c.f.l.of r2 = p174e.p319f.p320a.p335c.p345f.p357l.C8386of.m28912b(r2)     // Catch:{ all -> 0x0114 }
            java.lang.String r3 = "gms:phenotype:phenotype_flag:debug_bypass_phenotype"
            java.lang.String r2 = r2.mo21701a(r3)     // Catch:{ all -> 0x0114 }
            r3 = 0
            if (r2 == 0) goto L_0x006c
            java.util.regex.Pattern r4 = p174e.p319f.p320a.p335c.p345f.p357l.C8187e3.f22220c     // Catch:{ all -> 0x0114 }
            java.util.regex.Matcher r2 = r4.matcher(r2)     // Catch:{ all -> 0x0114 }
            boolean r2 = r2.matches()     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x006c
            java.lang.String r2 = "PhenotypeFlag"
            r4 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x006a
            java.lang.String r2 = "PhenotypeFlag"
            java.lang.String r4 = "Bypass reading Phenotype values for flag: "
            java.lang.String r5 = r7.mo21668c()     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0114 }
            int r6 = r5.length()     // Catch:{ all -> 0x0114 }
            if (r6 == 0) goto L_0x0061
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0114 }
            goto L_0x0067
        L_0x0061:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0114 }
            r5.<init>(r4)     // Catch:{ all -> 0x0114 }
            r4 = r5
        L_0x0067:
            android.util.Log.d(r2, r4)     // Catch:{ all -> 0x0114 }
        L_0x006a:
            r2 = r3
            goto L_0x00b3
        L_0x006c:
            e.f.a.c.f.l.jh r2 = r7.f22077g     // Catch:{ all -> 0x0114 }
            android.net.Uri r2 = r2.f22678b     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x0097
            android.content.Context r2 = r1.mo21825a()     // Catch:{ all -> 0x0114 }
            e.f.a.c.f.l.jh r4 = r7.f22077g     // Catch:{ all -> 0x0114 }
            android.net.Uri r4 = r4.f22678b     // Catch:{ all -> 0x0114 }
            boolean r2 = p174e.p319f.p320a.p335c.p345f.p357l.C8182dh.m28435a(r2, r4)     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x0095
            e.f.a.c.f.l.jh r2 = r7.f22077g     // Catch:{ all -> 0x0114 }
            boolean r2 = r2.f22684h     // Catch:{ all -> 0x0114 }
            android.content.Context r2 = r1.mo21825a()     // Catch:{ all -> 0x0114 }
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0114 }
            e.f.a.c.f.l.jh r4 = r7.f22077g     // Catch:{ all -> 0x0114 }
            android.net.Uri r4 = r4.f22678b     // Catch:{ all -> 0x0114 }
            e.f.a.c.f.l.j8 r2 = p174e.p319f.p320a.p335c.p345f.p357l.C8287j8.m28616b(r2, r4)     // Catch:{ all -> 0x0114 }
            goto L_0x00a3
        L_0x0095:
            r2 = r3
            goto L_0x00a3
        L_0x0097:
            android.content.Context r2 = r1.mo21825a()     // Catch:{ all -> 0x0114 }
            e.f.a.c.f.l.jh r4 = r7.f22077g     // Catch:{ all -> 0x0114 }
            java.lang.String r4 = r4.f22677a     // Catch:{ all -> 0x0114 }
            e.f.a.c.f.l.c r2 = p174e.p319f.p320a.p335c.p345f.p357l.C8145c.m28371b(r2, r3)     // Catch:{ all -> 0x0114 }
        L_0x00a3:
            if (r2 == 0) goto L_0x006a
            java.lang.String r4 = r7.mo21668c()     // Catch:{ all -> 0x0114 }
            java.lang.Object r2 = r2.mo21701a(r4)     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x006a
            java.lang.Object r2 = r7.mo21666a(r2)     // Catch:{ all -> 0x0114 }
        L_0x00b3:
            if (r2 == 0) goto L_0x00b6
            goto L_0x00dc
        L_0x00b6:
            e.f.a.c.f.l.jh r2 = r7.f22077g     // Catch:{ all -> 0x0114 }
            boolean r2 = r2.f22681e     // Catch:{ all -> 0x0114 }
            android.content.Context r2 = r1.mo21825a()     // Catch:{ all -> 0x0114 }
            e.f.a.c.f.l.of r2 = p174e.p319f.p320a.p335c.p345f.p357l.C8386of.m28912b(r2)     // Catch:{ all -> 0x0114 }
            e.f.a.c.f.l.jh r4 = r7.f22077g     // Catch:{ all -> 0x0114 }
            boolean r5 = r4.f22681e     // Catch:{ all -> 0x0114 }
            java.lang.String r4 = r4.f22679c     // Catch:{ all -> 0x0114 }
            java.lang.String r4 = r7.m28325f(r4)     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = r2.mo21701a(r4)     // Catch:{ all -> 0x0114 }
            if (r2 == 0) goto L_0x00d7
            java.lang.Object r2 = r7.mo21666a(r2)     // Catch:{ all -> 0x0114 }
            goto L_0x00d8
        L_0x00d7:
            r2 = r3
        L_0x00d8:
            if (r2 != 0) goto L_0x00dc
            T r2 = r7.f22079i     // Catch:{ all -> 0x0114 }
        L_0x00dc:
            e.f.a.c.f.l.e1 r1 = r1.mo21826b()     // Catch:{ all -> 0x0114 }
            java.lang.Object r1 = r1.zza()     // Catch:{ all -> 0x0114 }
            e.f.a.c.f.l.w0 r1 = (p174e.p319f.p320a.p335c.p345f.p357l.C8515w0) r1     // Catch:{ all -> 0x0114 }
            boolean r4 = r1.mo21673b()     // Catch:{ all -> 0x0114 }
            if (r4 == 0) goto L_0x0107
            java.lang.Object r1 = r1.mo21672a()     // Catch:{ all -> 0x0114 }
            e.f.a.c.f.l.pg r1 = (p174e.p319f.p320a.p335c.p345f.p357l.C8405pg) r1     // Catch:{ all -> 0x0114 }
            e.f.a.c.f.l.jh r2 = r7.f22077g     // Catch:{ all -> 0x0114 }
            android.net.Uri r4 = r2.f22678b     // Catch:{ all -> 0x0114 }
            java.lang.String r2 = r2.f22680d     // Catch:{ all -> 0x0114 }
            java.lang.String r5 = r7.f22078h     // Catch:{ all -> 0x0114 }
            java.lang.String r1 = r1.mo22078a(r4, r3, r2, r5)     // Catch:{ all -> 0x0114 }
            if (r1 != 0) goto L_0x0103
            T r2 = r7.f22079i     // Catch:{ all -> 0x0114 }
            goto L_0x0107
        L_0x0103:
            java.lang.Object r2 = r7.mo21666a(r1)     // Catch:{ all -> 0x0114 }
        L_0x0107:
            r7.f22081k = r2     // Catch:{ all -> 0x0114 }
            r7.f22080j = r0     // Catch:{ all -> 0x0114 }
            goto L_0x0112
        L_0x010c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0114 }
            r0.<init>(r2)     // Catch:{ all -> 0x0114 }
            throw r0     // Catch:{ all -> 0x0114 }
        L_0x0112:
            monitor-exit(r7)     // Catch:{ all -> 0x0114 }
            goto L_0x0117
        L_0x0114:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0114 }
            throw r0
        L_0x0117:
            T r0 = r7.f22081k
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p357l.C8126b.mo21667b():java.lang.Object");
    }

    /* renamed from: c */
    public final String mo21668c() {
        return m28325f(this.f22077g.f22680d);
    }
}
