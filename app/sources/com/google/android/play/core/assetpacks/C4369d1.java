package com.google.android.play.core.assetpacks;

import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;

/* renamed from: com.google.android.play.core.assetpacks.d1 */
final class C4369d1 {

    /* renamed from: a */
    private static final C9101a f12411a = new C9101a("ExtractorTaskFinder");

    /* renamed from: b */
    private final C4357a1 f12412b;

    /* renamed from: c */
    private final C4439v f12413c;

    /* renamed from: d */
    private final C4364c0 f12414d;

    C4369d1(C4357a1 a1Var, C4439v vVar, C4364c0 c0Var) {
        this.f12412b = a1Var;
        this.f12413c = vVar;
        this.f12414d = c0Var;
    }

    /* renamed from: b */
    private final boolean m16803b(C4447x0 x0Var, C4450y0 y0Var) {
        C4439v vVar = this.f12413c;
        C4444w0 w0Var = x0Var.f12700c;
        return new C4451y1(vVar, w0Var.f12687a, x0Var.f12699b, w0Var.f12688b, y0Var.f12709a).mo13975l();
    }

    /* renamed from: c */
    private static boolean m16804c(C4450y0 y0Var) {
        int i = y0Var.f12714f;
        return i == 1 || i == 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.play.core.assetpacks.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.play.core.assetpacks.p1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.android.play.core.assetpacks.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.android.play.core.assetpacks.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: com.google.android.play.core.assetpacks.b2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.android.play.core.assetpacks.b2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: com.google.android.play.core.assetpacks.b2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: com.google.android.play.core.assetpacks.m1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: com.google.android.play.core.assetpacks.p1} */
    /* JADX WARNING: type inference failed for: r0v11, types: [com.google.android.play.core.assetpacks.c1] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        f12411a.mo23080a("Found final move task for session %s with pack %s.", java.lang.Integer.valueOf(r4.f12698a), r4.f12700c.f12687a);
        r11 = r4.f12698a;
        r8 = r4.f12700c;
        r10 = new com.google.android.play.core.assetpacks.C4417p1(r11, r8.f12687a, r4.f12699b, r8.f12688b);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.C4365c1 mo13837a() {
        /*
            r33 = this;
            r1 = r33
            com.google.android.play.core.assetpacks.a1 r0 = r1.f12412b     // Catch:{ all -> 0x0384 }
            r0.mo13806a()     // Catch:{ all -> 0x0384 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0384 }
            r2.<init>()     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.a1 r0 = r1.f12412b     // Catch:{ all -> 0x0384 }
            java.util.Map r0 = r0.mo13808c()     // Catch:{ all -> 0x0384 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0384 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0384 }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0384 }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.x0 r3 = (com.google.android.play.core.assetpacks.C4447x0) r3     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r4 = r3.f12700c     // Catch:{ all -> 0x0384 }
            int r4 = r4.f12689c     // Catch:{ all -> 0x0384 }
            boolean r4 = com.google.android.play.core.assetpacks.C4393j1.m16870f(r4)     // Catch:{ all -> 0x0384 }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x0384 }
            goto L_0x001a
        L_0x0034:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x037d
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0384 }
        L_0x003e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0384 }
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x00ac
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.x0 r4 = (com.google.android.play.core.assetpacks.C4447x0) r4     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.v r8 = r1.f12413c     // Catch:{ IOException -> 0x008d }
            com.google.android.play.core.assetpacks.w0 r9 = r4.f12700c     // Catch:{ IOException -> 0x008d }
            java.lang.String r10 = r9.f12687a     // Catch:{ IOException -> 0x008d }
            int r11 = r4.f12699b     // Catch:{ IOException -> 0x008d }
            long r12 = r9.f12688b     // Catch:{ IOException -> 0x008d }
            int r8 = r8.mo13944y(r10, r11, r12)     // Catch:{ IOException -> 0x008d }
            com.google.android.play.core.assetpacks.w0 r9 = r4.f12700c     // Catch:{ IOException -> 0x008d }
            java.util.List<com.google.android.play.core.assetpacks.y0> r9 = r9.f12691e     // Catch:{ IOException -> 0x008d }
            int r9 = r9.size()     // Catch:{ IOException -> 0x008d }
            if (r8 != r9) goto L_0x003e
            e.f.a.e.a.b.a r0 = f12411a     // Catch:{ all -> 0x0384 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0384 }
            int r9 = r4.f12698a     // Catch:{ all -> 0x0384 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0384 }
            r8[r7] = r9     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r9 = r4.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r9.f12687a     // Catch:{ all -> 0x0384 }
            r8[r6] = r9     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = "Found final move task for session %s with pack %s."
            r0.mo23080a(r9, r8)     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.p1 r0 = new com.google.android.play.core.assetpacks.p1     // Catch:{ all -> 0x0384 }
            int r11 = r4.f12698a     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r8 = r4.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = r8.f12687a     // Catch:{ all -> 0x0384 }
            int r13 = r4.f12699b     // Catch:{ all -> 0x0384 }
            long r14 = r8.f12688b     // Catch:{ all -> 0x0384 }
            r10 = r0
            r10.<init>(r11, r12, r13, r14)     // Catch:{ all -> 0x0384 }
            goto L_0x00ad
        L_0x008d:
            r0 = move-exception
            com.google.android.play.core.assetpacks.k0 r2 = new com.google.android.play.core.assetpacks.k0     // Catch:{ all -> 0x0384 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0384 }
            int r5 = r4.f12698a     // Catch:{ all -> 0x0384 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0384 }
            r3[r7] = r5     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r5 = r4.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = r5.f12687a     // Catch:{ all -> 0x0384 }
            r3[r6] = r5     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r5, r3)     // Catch:{ all -> 0x0384 }
            int r4 = r4.f12698a     // Catch:{ all -> 0x0384 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x0384 }
            throw r2     // Catch:{ all -> 0x0384 }
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            if (r0 != 0) goto L_0x0377
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0384 }
        L_0x00b3:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0384 }
            r8 = 3
            if (r4 == 0) goto L_0x0137
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.x0 r4 = (com.google.android.play.core.assetpacks.C4447x0) r4     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r9 = r4.f12700c     // Catch:{ all -> 0x0384 }
            int r9 = r9.f12689c     // Catch:{ all -> 0x0384 }
            boolean r9 = com.google.android.play.core.assetpacks.C4393j1.m16870f(r9)     // Catch:{ all -> 0x0384 }
            if (r9 == 0) goto L_0x00b3
            com.google.android.play.core.assetpacks.w0 r9 = r4.f12700c     // Catch:{ all -> 0x0384 }
            java.util.List<com.google.android.play.core.assetpacks.y0> r9 = r9.f12691e     // Catch:{ all -> 0x0384 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0384 }
        L_0x00d2:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0384 }
            if (r10 == 0) goto L_0x00b3
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.y0 r10 = (com.google.android.play.core.assetpacks.C4450y0) r10     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.v r11 = r1.f12413c     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r12 = r4.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r13 = r12.f12687a     // Catch:{ all -> 0x0384 }
            int r14 = r4.f12699b     // Catch:{ all -> 0x0384 }
            long r5 = r12.f12688b     // Catch:{ all -> 0x0384 }
            java.lang.String r15 = r10.f12709a     // Catch:{ all -> 0x0384 }
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r5
            java.io.File r5 = r11.mo13942w(r12, r13, r14, r16)     // Catch:{ all -> 0x0384 }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x0384 }
            if (r5 == 0) goto L_0x0134
            e.f.a.e.a.b.a r0 = f12411a     // Catch:{ all -> 0x0384 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0384 }
            int r6 = r4.f12698a     // Catch:{ all -> 0x0384 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0384 }
            r5[r7] = r6     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r6 = r4.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = r6.f12687a     // Catch:{ all -> 0x0384 }
            r9 = 1
            r5[r9] = r6     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = r10.f12709a     // Catch:{ all -> 0x0384 }
            r9 = 2
            r5[r9] = r6     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = "Found merge task for session %s with pack %s and slice %s."
            r0.mo23080a(r6, r5)     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.m1 r0 = new com.google.android.play.core.assetpacks.m1     // Catch:{ all -> 0x0384 }
            int r5 = r4.f12698a     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r6 = r4.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r6.f12687a     // Catch:{ all -> 0x0384 }
            int r4 = r4.f12699b     // Catch:{ all -> 0x0384 }
            long r11 = r6.f12688b     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = r10.f12709a     // Catch:{ all -> 0x0384 }
            r19 = r0
            r20 = r5
            r21 = r9
            r22 = r4
            r23 = r11
            r25 = r6
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0384 }
            goto L_0x0138
        L_0x0134:
            r5 = 2
            r6 = 1
            goto L_0x00d2
        L_0x0137:
            r0 = 0
        L_0x0138:
            if (r0 != 0) goto L_0x0377
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0384 }
        L_0x013e:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x0384 }
            if (r4 == 0) goto L_0x01c3
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.x0 r4 = (com.google.android.play.core.assetpacks.C4447x0) r4     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r5 = r4.f12700c     // Catch:{ all -> 0x0384 }
            int r5 = r5.f12689c     // Catch:{ all -> 0x0384 }
            boolean r5 = com.google.android.play.core.assetpacks.C4393j1.m16870f(r5)     // Catch:{ all -> 0x0384 }
            if (r5 == 0) goto L_0x013e
            com.google.android.play.core.assetpacks.w0 r5 = r4.f12700c     // Catch:{ all -> 0x0384 }
            java.util.List<com.google.android.play.core.assetpacks.y0> r5 = r5.f12691e     // Catch:{ all -> 0x0384 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0384 }
        L_0x015c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0384 }
            if (r6 == 0) goto L_0x013e
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.y0 r6 = (com.google.android.play.core.assetpacks.C4450y0) r6     // Catch:{ all -> 0x0384 }
            boolean r9 = r1.m16803b(r4, r6)     // Catch:{ all -> 0x0384 }
            if (r9 == 0) goto L_0x015c
            com.google.android.play.core.assetpacks.v r10 = r1.f12413c     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r9 = r4.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r11 = r9.f12687a     // Catch:{ all -> 0x0384 }
            int r12 = r4.f12699b     // Catch:{ all -> 0x0384 }
            long r13 = r9.f12688b     // Catch:{ all -> 0x0384 }
            java.lang.String r15 = r6.f12709a     // Catch:{ all -> 0x0384 }
            java.io.File r9 = r10.mo13941v(r11, r12, r13, r15)     // Catch:{ all -> 0x0384 }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x0384 }
            if (r9 == 0) goto L_0x015c
            e.f.a.e.a.b.a r0 = f12411a     // Catch:{ all -> 0x0384 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0384 }
            int r9 = r4.f12698a     // Catch:{ all -> 0x0384 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0384 }
            r5[r7] = r9     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r9 = r4.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r9.f12687a     // Catch:{ all -> 0x0384 }
            r10 = 1
            r5[r10] = r9     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r6.f12709a     // Catch:{ all -> 0x0384 }
            r10 = 2
            r5[r10] = r9     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = "Found verify task for session %s with pack %s and slice %s."
            r0.mo23080a(r9, r5)     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.b2 r0 = new com.google.android.play.core.assetpacks.b2     // Catch:{ all -> 0x0384 }
            int r5 = r4.f12698a     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r9 = r4.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r10 = r9.f12687a     // Catch:{ all -> 0x0384 }
            int r4 = r4.f12699b     // Catch:{ all -> 0x0384 }
            long r11 = r9.f12688b     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r6.f12709a     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = r6.f12710b     // Catch:{ all -> 0x0384 }
            r19 = r0
            r20 = r5
            r21 = r10
            r22 = r4
            r23 = r11
            r25 = r9
            r26 = r6
            r19.<init>(r20, r21, r22, r23, r25, r26)     // Catch:{ all -> 0x0384 }
            goto L_0x01c4
        L_0x01c3:
            r0 = 0
        L_0x01c4:
            if (r0 != 0) goto L_0x0377
            java.util.Iterator r4 = r2.iterator()     // Catch:{ all -> 0x0384 }
        L_0x01ca:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0384 }
            r5 = 4
            if (r0 == 0) goto L_0x02b2
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0384 }
            r6 = r0
            com.google.android.play.core.assetpacks.x0 r6 = (com.google.android.play.core.assetpacks.C4447x0) r6     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r0 = r6.f12700c     // Catch:{ all -> 0x0384 }
            int r0 = r0.f12689c     // Catch:{ all -> 0x0384 }
            boolean r0 = com.google.android.play.core.assetpacks.C4393j1.m16870f(r0)     // Catch:{ all -> 0x0384 }
            if (r0 == 0) goto L_0x01ca
            com.google.android.play.core.assetpacks.w0 r0 = r6.f12700c     // Catch:{ all -> 0x0384 }
            java.util.List<com.google.android.play.core.assetpacks.y0> r0 = r0.f12691e     // Catch:{ all -> 0x0384 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0384 }
        L_0x01ea:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0384 }
            if (r0 == 0) goto L_0x01ca
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0384 }
            r10 = r0
            com.google.android.play.core.assetpacks.y0 r10 = (com.google.android.play.core.assetpacks.C4450y0) r10     // Catch:{ all -> 0x0384 }
            boolean r0 = m16804c(r10)     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x01ea
            com.google.android.play.core.assetpacks.y1 r0 = new com.google.android.play.core.assetpacks.y1     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.v r11 = r1.f12413c     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r12 = r6.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r13 = r12.f12687a     // Catch:{ all -> 0x0384 }
            int r14 = r6.f12699b     // Catch:{ all -> 0x0384 }
            r16 = r4
            long r3 = r12.f12688b     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = r10.f12709a     // Catch:{ all -> 0x0384 }
            r19 = r0
            r20 = r11
            r21 = r13
            r22 = r14
            r23 = r3
            r25 = r12
            r19.<init>(r20, r21, r22, r23, r25)     // Catch:{ all -> 0x0384 }
            int r0 = r0.mo13974k()     // Catch:{ IOException -> 0x0221 }
            goto L_0x0230
        L_0x0221:
            r0 = move-exception
            r3 = r0
            e.f.a.e.a.b.a r0 = f12411a     // Catch:{ all -> 0x0384 }
            r4 = 1
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0384 }
            r11[r7] = r3     // Catch:{ all -> 0x0384 }
            java.lang.String r3 = "Slice checkpoint corrupt, restarting extraction. %s"
            r0.mo23081b(r3, r11)     // Catch:{ all -> 0x0384 }
            r0 = 0
        L_0x0230:
            r3 = -1
            if (r0 == r3) goto L_0x02ae
            java.util.List<com.google.android.play.core.assetpacks.v0> r3 = r10.f12712d     // Catch:{ all -> 0x0384 }
            java.lang.Object r3 = r3.get(r0)     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.v0 r3 = (com.google.android.play.core.assetpacks.C4440v0) r3     // Catch:{ all -> 0x0384 }
            boolean r3 = r3.f12673a     // Catch:{ all -> 0x0384 }
            if (r3 == 0) goto L_0x02ae
            e.f.a.e.a.b.a r3 = f12411a     // Catch:{ all -> 0x0384 }
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0384 }
            int r9 = r10.f12713e     // Catch:{ all -> 0x0384 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0384 }
            r4[r7] = r9     // Catch:{ all -> 0x0384 }
            int r9 = r6.f12698a     // Catch:{ all -> 0x0384 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0384 }
            r11 = 1
            r4[r11] = r9     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r9 = r6.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r9.f12687a     // Catch:{ all -> 0x0384 }
            r11 = 2
            r4[r11] = r9     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r10.f12709a     // Catch:{ all -> 0x0384 }
            r4[r8] = r9     // Catch:{ all -> 0x0384 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0384 }
            r4[r5] = r9     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r3.mo23080a(r9, r4)     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.c0 r3 = r1.f12414d     // Catch:{ all -> 0x0384 }
            int r4 = r6.f12698a     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r9 = r6.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r9.f12687a     // Catch:{ all -> 0x0384 }
            java.lang.String r11 = r10.f12709a     // Catch:{ all -> 0x0384 }
            java.io.InputStream r32 = r3.mo13827a(r4, r9, r11, r0)     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.i0 r3 = new com.google.android.play.core.assetpacks.i0     // Catch:{ all -> 0x0384 }
            int r4 = r6.f12698a     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r9 = r6.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r11 = r9.f12687a     // Catch:{ all -> 0x0384 }
            int r12 = r6.f12699b     // Catch:{ all -> 0x0384 }
            long r13 = r9.f12688b     // Catch:{ all -> 0x0384 }
            java.lang.String r9 = r10.f12709a     // Catch:{ all -> 0x0384 }
            int r15 = r10.f12713e     // Catch:{ all -> 0x0384 }
            java.util.List<com.google.android.play.core.assetpacks.v0> r10 = r10.f12712d     // Catch:{ all -> 0x0384 }
            int r28 = r10.size()     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r6 = r6.f12700c     // Catch:{ all -> 0x0384 }
            long r7 = r6.f12690d     // Catch:{ all -> 0x0384 }
            int r6 = r6.f12689c     // Catch:{ all -> 0x0384 }
            r19 = r3
            r20 = r4
            r21 = r11
            r22 = r12
            r23 = r13
            r25 = r9
            r26 = r15
            r27 = r0
            r29 = r7
            r31 = r6
            r19.<init>(r20, r21, r22, r23, r25, r26, r27, r28, r29, r31, r32)     // Catch:{ all -> 0x0384 }
            r15 = r3
            goto L_0x02b3
        L_0x02ae:
            r4 = r16
            goto L_0x01ea
        L_0x02b2:
            r15 = 0
        L_0x02b3:
            if (r15 != 0) goto L_0x0371
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0384 }
        L_0x02b9:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0384 }
            if (r2 == 0) goto L_0x0366
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.x0 r2 = (com.google.android.play.core.assetpacks.C4447x0) r2     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r3 = r2.f12700c     // Catch:{ all -> 0x0384 }
            int r3 = r3.f12689c     // Catch:{ all -> 0x0384 }
            boolean r3 = com.google.android.play.core.assetpacks.C4393j1.m16870f(r3)     // Catch:{ all -> 0x0384 }
            if (r3 == 0) goto L_0x02b9
            com.google.android.play.core.assetpacks.w0 r3 = r2.f12700c     // Catch:{ all -> 0x0384 }
            java.util.List<com.google.android.play.core.assetpacks.y0> r3 = r3.f12691e     // Catch:{ all -> 0x0384 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0384 }
        L_0x02d7:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0384 }
            if (r4 == 0) goto L_0x02b9
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.y0 r4 = (com.google.android.play.core.assetpacks.C4450y0) r4     // Catch:{ all -> 0x0384 }
            boolean r6 = m16804c(r4)     // Catch:{ all -> 0x0384 }
            if (r6 == 0) goto L_0x02d7
            java.util.List<com.google.android.play.core.assetpacks.v0> r6 = r4.f12712d     // Catch:{ all -> 0x0384 }
            r7 = 0
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.v0 r6 = (com.google.android.play.core.assetpacks.C4440v0) r6     // Catch:{ all -> 0x0384 }
            boolean r6 = r6.f12673a     // Catch:{ all -> 0x0384 }
            if (r6 == 0) goto L_0x02d7
            boolean r6 = r1.m16803b(r2, r4)     // Catch:{ all -> 0x0384 }
            if (r6 != 0) goto L_0x02d7
            e.f.a.e.a.b.a r0 = f12411a     // Catch:{ all -> 0x0384 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0384 }
            int r5 = r4.f12714f     // Catch:{ all -> 0x0384 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0384 }
            r6 = 0
            r3[r6] = r5     // Catch:{ all -> 0x0384 }
            int r5 = r2.f12698a     // Catch:{ all -> 0x0384 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0384 }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r5 = r2.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = r5.f12687a     // Catch:{ all -> 0x0384 }
            r7 = 2
            r3[r7] = r5     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = r4.f12709a     // Catch:{ all -> 0x0384 }
            r8 = 3
            r3[r8] = r5     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.mo23080a(r5, r3)     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.c0 r0 = r1.f12414d     // Catch:{ all -> 0x0384 }
            int r3 = r2.f12698a     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r5 = r2.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = r5.f12687a     // Catch:{ all -> 0x0384 }
            java.lang.String r6 = r4.f12709a     // Catch:{ all -> 0x0384 }
            r9 = 0
            java.io.InputStream r23 = r0.mo13827a(r3, r5, r6, r9)     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.v1 r0 = new com.google.android.play.core.assetpacks.v1     // Catch:{ all -> 0x0384 }
            int r11 = r2.f12698a     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r3 = r2.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r12 = r3.f12687a     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.v r3 = r1.f12413c     // Catch:{ all -> 0x0384 }
            int r13 = r3.mo13927G(r12)     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.v r3 = r1.f12413c     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r5 = r2.f12700c     // Catch:{ all -> 0x0384 }
            java.lang.String r5 = r5.f12687a     // Catch:{ all -> 0x0384 }
            long r14 = r3.mo13928H(r5)     // Catch:{ all -> 0x0384 }
            int r3 = r2.f12699b     // Catch:{ all -> 0x0384 }
            com.google.android.play.core.assetpacks.w0 r2 = r2.f12700c     // Catch:{ all -> 0x0384 }
            long r5 = r2.f12688b     // Catch:{ all -> 0x0384 }
            int r2 = r4.f12714f     // Catch:{ all -> 0x0384 }
            java.lang.String r7 = r4.f12709a     // Catch:{ all -> 0x0384 }
            long r8 = r4.f12711c     // Catch:{ all -> 0x0384 }
            r10 = r0
            r16 = r3
            r17 = r5
            r19 = r2
            r20 = r7
            r21 = r8
            r10.<init>(r11, r12, r13, r14, r16, r17, r19, r20, r21, r23)     // Catch:{ all -> 0x0384 }
            r15 = r0
            goto L_0x0367
        L_0x0366:
            r15 = 0
        L_0x0367:
            com.google.android.play.core.assetpacks.a1 r0 = r1.f12412b
            r0.mo13807b()
            if (r15 == 0) goto L_0x036f
            return r15
        L_0x036f:
            r2 = 0
            return r2
        L_0x0371:
            com.google.android.play.core.assetpacks.a1 r0 = r1.f12412b
            r0.mo13807b()
            return r15
        L_0x0377:
            com.google.android.play.core.assetpacks.a1 r2 = r1.f12412b
            r2.mo13807b()
            return r0
        L_0x037d:
            com.google.android.play.core.assetpacks.a1 r0 = r1.f12412b
            r0.mo13807b()
            r2 = 0
            return r2
        L_0x0384:
            r0 = move-exception
            com.google.android.play.core.assetpacks.a1 r2 = r1.f12412b
            r2.mo13807b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C4369d1.mo13837a():com.google.android.play.core.assetpacks.c1");
    }
}
