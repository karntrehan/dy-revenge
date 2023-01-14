package p027c.p043d.p044a;

import androidx.core.util.C1170a;
import java.util.Objects;
import java.util.concurrent.Executor;
import p027c.p043d.p044a.C1502a1;

/* renamed from: c.d.a.m0 */
final class C1693m0 extends C1502a1.C1511i {

    /* renamed from: r */
    private final C1721v0 f5092r;

    /* renamed from: s */
    private final Executor f5093s;

    /* renamed from: t */
    private final C1170a<C1549i1> f5094t;

    /* renamed from: u */
    private final boolean f5095u;

    /* renamed from: v */
    private final long f5096v;

    C1693m0(C1721v0 v0Var, Executor executor, C1170a<C1549i1> aVar, boolean z, long j) {
        Objects.requireNonNull(v0Var, "Null getOutputOptions");
        this.f5092r = v0Var;
        this.f5093s = executor;
        this.f5094t = aVar;
        this.f5095u = z;
        this.f5096v = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C1721v0 mo5609A() {
        return this.f5092r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public long mo5610E() {
        return this.f5096v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo5611I() {
        return this.f5095u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r7.f5094t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r7.f5093s;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof p027c.p043d.p044a.C1502a1.C1511i
            r2 = 0
            if (r1 == 0) goto L_0x0056
            c.d.a.a1$i r8 = (p027c.p043d.p044a.C1502a1.C1511i) r8
            c.d.a.v0 r1 = r7.f5092r
            c.d.a.v0 r3 = r8.mo5609A()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0054
            java.util.concurrent.Executor r1 = r7.f5093s
            if (r1 != 0) goto L_0x0022
            java.util.concurrent.Executor r1 = r8.mo5616o()
            if (r1 != 0) goto L_0x0054
            goto L_0x002c
        L_0x0022:
            java.util.concurrent.Executor r3 = r8.mo5616o()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0054
        L_0x002c:
            androidx.core.util.a<c.d.a.i1> r1 = r7.f5094t
            if (r1 != 0) goto L_0x0037
            androidx.core.util.a r1 = r8.mo5617r()
            if (r1 != 0) goto L_0x0054
            goto L_0x0041
        L_0x0037:
            androidx.core.util.a r3 = r8.mo5617r()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0054
        L_0x0041:
            boolean r1 = r7.f5095u
            boolean r3 = r8.mo5611I()
            if (r1 != r3) goto L_0x0054
            long r3 = r7.f5096v
            long r5 = r8.mo5610E()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r0 = 0
        L_0x0055:
            return r0
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p044a.C1693m0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.f5092r.hashCode() ^ 1000003) * 1000003;
        Executor executor = this.f5093s;
        int i = 0;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        C1170a<C1549i1> aVar = this.f5094t;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        int i2 = (hashCode2 ^ i) * 1000003;
        int i3 = this.f5095u ? 1231 : 1237;
        long j = this.f5096v;
        return ((i2 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public Executor mo5616o() {
        return this.f5093s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C1170a<C1549i1> mo5617r() {
        return this.f5094t;
    }

    public String toString() {
        return "RecordingRecord{getOutputOptions=" + this.f5092r + ", getCallbackExecutor=" + this.f5093s + ", getEventListener=" + this.f5094t + ", hasAudioEnabled=" + this.f5095u + ", getRecordingId=" + this.f5096v + "}";
    }
}
