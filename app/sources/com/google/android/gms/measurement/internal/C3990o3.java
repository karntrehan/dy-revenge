package com.google.android.gms.measurement.internal;

import p174e.p319f.p320a.p335c.p345f.p352g.C6939p0;

/* renamed from: com.google.android.gms.measurement.internal.o3 */
public abstract class C3990o3 extends C6939p0 implements C4002p3 {
    public C3990o3() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0127, code lost:
        r9.writeNoException();
        r9.writeTypedList(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0190, code lost:
        r9.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12237j(int r7, android.os.Parcel r8, android.os.Parcel r9, int r10) {
        /*
            r6 = this;
            switch(r7) {
                case 1: goto L_0x017a;
                case 2: goto L_0x0163;
                case 3: goto L_0x0003;
                case 4: goto L_0x0154;
                case 5: goto L_0x013d;
                case 6: goto L_0x012e;
                case 7: goto L_0x0114;
                case 8: goto L_0x0003;
                case 9: goto L_0x00f9;
                case 10: goto L_0x00e0;
                case 11: goto L_0x00c9;
                case 12: goto L_0x00b1;
                case 13: goto L_0x00a1;
                case 14: goto L_0x0084;
                case 15: goto L_0x006b;
                case 16: goto L_0x0052;
                case 17: goto L_0x003d;
                case 18: goto L_0x002d;
                case 19: goto L_0x0015;
                case 20: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r7 = 0
            return r7
        L_0x0005:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.cb> r7 = com.google.android.gms.measurement.internal.C3844cb.CREATOR
            android.os.Parcelable r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r7)
            com.google.android.gms.measurement.internal.cb r7 = (com.google.android.gms.measurement.internal.C3844cb) r7
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            r6.mo11918u0(r7)
            goto L_0x0190
        L_0x0015:
            android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
            android.os.Parcelable r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r7)
            android.os.Bundle r7 = (android.os.Bundle) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.cb> r10 = com.google.android.gms.measurement.internal.C3844cb.CREATOR
            android.os.Parcelable r10 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r10)
            com.google.android.gms.measurement.internal.cb r10 = (com.google.android.gms.measurement.internal.C3844cb) r10
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            r6.mo11917u(r7, r10)
            goto L_0x0190
        L_0x002d:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.cb> r7 = com.google.android.gms.measurement.internal.C3844cb.CREATOR
            android.os.Parcelable r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r7)
            com.google.android.gms.measurement.internal.cb r7 = (com.google.android.gms.measurement.internal.C3844cb) r7
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            r6.mo11903B0(r7)
            goto L_0x0190
        L_0x003d:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            java.util.List r7 = r6.mo11906J(r7, r10, r0)
            goto L_0x0127
        L_0x0052:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.cb> r0 = com.google.android.gms.measurement.internal.C3844cb.CREATOR
            android.os.Parcelable r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r0)
            com.google.android.gms.measurement.internal.cb r0 = (com.google.android.gms.measurement.internal.C3844cb) r0
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            java.util.List r7 = r6.mo11912d0(r7, r10, r0)
            goto L_0x0127
        L_0x006b:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            boolean r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26387g(r8)
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            java.util.List r7 = r6.mo11920w(r7, r10, r0, r1)
            goto L_0x0127
        L_0x0084:
            java.lang.String r7 = r8.readString()
            java.lang.String r10 = r8.readString()
            boolean r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26387g(r8)
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.cb> r1 = com.google.android.gms.measurement.internal.C3844cb.CREATOR
            android.os.Parcelable r1 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r1)
            com.google.android.gms.measurement.internal.cb r1 = (com.google.android.gms.measurement.internal.C3844cb) r1
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            java.util.List r7 = r6.mo11919v0(r7, r10, r0, r1)
            goto L_0x0127
        L_0x00a1:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.d> r7 = com.google.android.gms.measurement.internal.C3845d.CREATOR
            android.os.Parcelable r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r7)
            com.google.android.gms.measurement.internal.d r7 = (com.google.android.gms.measurement.internal.C3845d) r7
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            r6.mo11921x(r7)
            goto L_0x0190
        L_0x00b1:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.d> r7 = com.google.android.gms.measurement.internal.C3845d.CREATOR
            android.os.Parcelable r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r7)
            com.google.android.gms.measurement.internal.d r7 = (com.google.android.gms.measurement.internal.C3845d) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.cb> r10 = com.google.android.gms.measurement.internal.C3844cb.CREATOR
            android.os.Parcelable r10 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r10)
            com.google.android.gms.measurement.internal.cb r10 = (com.google.android.gms.measurement.internal.C3844cb) r10
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            r6.mo11905F0(r7, r10)
            goto L_0x0190
        L_0x00c9:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.cb> r7 = com.google.android.gms.measurement.internal.C3844cb.CREATOR
            android.os.Parcelable r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r7)
            com.google.android.gms.measurement.internal.cb r7 = (com.google.android.gms.measurement.internal.C3844cb) r7
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            java.lang.String r7 = r6.mo11904D(r7)
            r9.writeNoException()
            r9.writeString(r7)
            goto L_0x0193
        L_0x00e0:
            long r1 = r8.readLong()
            java.lang.String r3 = r8.readString()
            java.lang.String r4 = r8.readString()
            java.lang.String r5 = r8.readString()
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            r0 = r6
            r0.mo11913j0(r1, r3, r4, r5)
            goto L_0x0190
        L_0x00f9:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.x> r7 = com.google.android.gms.measurement.internal.C4094x.CREATOR
            android.os.Parcelable r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r7)
            com.google.android.gms.measurement.internal.x r7 = (com.google.android.gms.measurement.internal.C4094x) r7
            java.lang.String r10 = r8.readString()
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            byte[] r7 = r6.mo11902A(r7, r10)
            r9.writeNoException()
            r9.writeByteArray(r7)
            goto L_0x0193
        L_0x0114:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.cb> r7 = com.google.android.gms.measurement.internal.C3844cb.CREATOR
            android.os.Parcelable r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r7)
            com.google.android.gms.measurement.internal.cb r7 = (com.google.android.gms.measurement.internal.C3844cb) r7
            boolean r10 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26387g(r8)
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            java.util.List r7 = r6.mo11922z(r7, r10)
        L_0x0127:
            r9.writeNoException()
            r9.writeTypedList(r7)
            goto L_0x0193
        L_0x012e:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.cb> r7 = com.google.android.gms.measurement.internal.C3844cb.CREATOR
            android.os.Parcelable r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r7)
            com.google.android.gms.measurement.internal.cb r7 = (com.google.android.gms.measurement.internal.C3844cb) r7
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            r6.mo11916q(r7)
            goto L_0x0190
        L_0x013d:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.x> r7 = com.google.android.gms.measurement.internal.C4094x.CREATOR
            android.os.Parcelable r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r7)
            com.google.android.gms.measurement.internal.x r7 = (com.google.android.gms.measurement.internal.C4094x) r7
            java.lang.String r10 = r8.readString()
            java.lang.String r0 = r8.readString()
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            r6.mo11915m0(r7, r10, r0)
            goto L_0x0190
        L_0x0154:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.cb> r7 = com.google.android.gms.measurement.internal.C3844cb.CREATOR
            android.os.Parcelable r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r7)
            com.google.android.gms.measurement.internal.cb r7 = (com.google.android.gms.measurement.internal.C3844cb) r7
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            r6.mo11911b0(r7)
            goto L_0x0190
        L_0x0163:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.sa> r7 = com.google.android.gms.measurement.internal.C4045sa.CREATOR
            android.os.Parcelable r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r7)
            com.google.android.gms.measurement.internal.sa r7 = (com.google.android.gms.measurement.internal.C4045sa) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.cb> r10 = com.google.android.gms.measurement.internal.C3844cb.CREATOR
            android.os.Parcelable r10 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r10)
            com.google.android.gms.measurement.internal.cb r10 = (com.google.android.gms.measurement.internal.C3844cb) r10
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            r6.mo11923z0(r7, r10)
            goto L_0x0190
        L_0x017a:
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.x> r7 = com.google.android.gms.measurement.internal.C4094x.CREATOR
            android.os.Parcelable r7 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r7)
            com.google.android.gms.measurement.internal.x r7 = (com.google.android.gms.measurement.internal.C4094x) r7
            android.os.Parcelable$Creator<com.google.android.gms.measurement.internal.cb> r10 = com.google.android.gms.measurement.internal.C3844cb.CREATOR
            android.os.Parcelable r10 = p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26381a(r8, r10)
            com.google.android.gms.measurement.internal.cb r10 = (com.google.android.gms.measurement.internal.C3844cb) r10
            p174e.p319f.p320a.p335c.p345f.p352g.C6955q0.m26383c(r8)
            r6.mo11910V(r7, r10)
        L_0x0190:
            r9.writeNoException()
        L_0x0193:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3990o3.mo12237j(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
