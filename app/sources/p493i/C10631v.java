package p493i;

import p455g.p470y.p472d.C10457l;

/* renamed from: i.v */
public final class C10631v implements C10598d0 {

    /* renamed from: f */
    private final C10603f f28075f;

    /* renamed from: o */
    private C10636y f28076o;

    /* renamed from: p */
    private int f28077p;

    /* renamed from: q */
    private boolean f28078q;

    /* renamed from: r */
    private long f28079r;

    /* renamed from: s */
    private final C10615h f28080s;

    public C10631v(C10615h hVar) {
        C10457l.m35320e(hVar, "upstream");
        this.f28080s = hVar;
        C10603f d = hVar.mo26350d();
        this.f28075f = d;
        C10636y yVar = d.f28034f;
        this.f28076o = yVar;
        this.f28077p = yVar != null ? yVar.f28091c : -1;
    }

    public void close() {
        this.f28078q = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r5 == r6.f28091c) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long read(p493i.C10603f r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            p455g.p470y.p472d.C10457l.m35320e(r9, r0)
            r0 = 0
            r1 = 0
            r3 = 1
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 < 0) goto L_0x000f
            r5 = 1
            goto L_0x0010
        L_0x000f:
            r5 = 0
        L_0x0010:
            if (r5 == 0) goto L_0x0087
            boolean r5 = r8.f28078q
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x007b
            i.y r5 = r8.f28076o
            if (r5 == 0) goto L_0x002a
            i.f r6 = r8.f28075f
            i.y r6 = r6.f28034f
            if (r5 != r6) goto L_0x002b
            int r5 = r8.f28077p
            p455g.p470y.p472d.C10457l.m35317b(r6)
            int r6 = r6.f28091c
            if (r5 != r6) goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            if (r0 == 0) goto L_0x006f
            if (r4 != 0) goto L_0x0030
            return r1
        L_0x0030:
            i.h r0 = r8.f28080s
            long r1 = r8.f28079r
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo26338V(r1)
            if (r0 != 0) goto L_0x0040
            r9 = -1
            return r9
        L_0x0040:
            i.y r0 = r8.f28076o
            if (r0 != 0) goto L_0x0053
            i.f r0 = r8.f28075f
            i.y r0 = r0.f28034f
            if (r0 == 0) goto L_0x0053
            r8.f28076o = r0
            p455g.p470y.p472d.C10457l.m35317b(r0)
            int r0 = r0.f28091c
            r8.f28077p = r0
        L_0x0053:
            i.f r0 = r8.f28075f
            long r0 = r0.size()
            long r2 = r8.f28079r
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            i.f r2 = r8.f28075f
            long r4 = r8.f28079r
            r3 = r9
            r6 = r10
            r2.mo26381v0(r3, r4, r6)
            long r0 = r8.f28079r
            long r0 = r0 + r10
            r8.f28079r = r0
            return r10
        L_0x006f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x007b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x0087:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p493i.C10631v.read(i.f, long):long");
    }

    public C10600e0 timeout() {
        return this.f28080s.timeout();
    }
}
