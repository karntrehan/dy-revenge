package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.yc */
final class C8563yc implements C8236ge {

    /* renamed from: a */
    private static final C8563yc f23334a = new C8563yc();

    private C8563yc() {
    }

    /* renamed from: c */
    public static C8563yc m29317c() {
        return f23334a;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p174e.p319f.p320a.p335c.p345f.p357l.C8217fe mo21833a(java.lang.Class<?> r5) {
        /*
            r4 = this;
            java.lang.Class<e.f.a.c.f.l.ed> r0 = p174e.p319f.p320a.p335c.p345f.p357l.C8197ed.class
            boolean r1 = r0.isAssignableFrom(r5)
            if (r1 != 0) goto L_0x0024
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "Unsupported message type: "
            int r2 = r5.length()
            if (r2 == 0) goto L_0x001b
            java.lang.String r5 = r1.concat(r5)
            goto L_0x0020
        L_0x001b:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1)
        L_0x0020:
            r0.<init>(r5)
            throw r0
        L_0x0024:
            java.lang.Class r0 = r5.asSubclass(r0)     // Catch:{ Exception -> 0x0035 }
            e.f.a.c.f.l.ed r0 = p174e.p319f.p320a.p335c.p345f.p357l.C8197ed.m28471p(r0)     // Catch:{ Exception -> 0x0035 }
            r1 = 3
            r2 = 0
            java.lang.Object r0 = r0.mo21702k(r1, r2, r2)     // Catch:{ Exception -> 0x0035 }
            e.f.a.c.f.l.fe r0 = (p174e.p319f.p320a.p335c.p345f.p357l.C8217fe) r0     // Catch:{ Exception -> 0x0035 }
            return r0
        L_0x0035:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            java.lang.String r2 = "Unable to get message info for "
            int r3 = r5.length()
            if (r3 == 0) goto L_0x0049
            java.lang.String r5 = r2.concat(r5)
            goto L_0x004e
        L_0x0049:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L_0x004e:
            r1.<init>(r5, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p357l.C8563yc.mo21833a(java.lang.Class):e.f.a.c.f.l.fe");
    }

    /* renamed from: b */
    public final boolean mo21834b(Class<?> cls) {
        return C8197ed.class.isAssignableFrom(cls);
    }
}
