package org.reactnative.camera.p514g;

import android.os.AsyncTask;
import p174e.p319f.p416e.C9657c;
import p174e.p319f.p416e.C9662h;
import p174e.p319f.p416e.C9663i;
import p174e.p319f.p416e.C9665k;
import p174e.p319f.p416e.C9668n;
import p174e.p319f.p416e.p420s.C9688j;

/* renamed from: org.reactnative.camera.g.a */
public class C10977a extends AsyncTask<Void, Void, C9668n> {

    /* renamed from: a */
    private byte[] f28751a;

    /* renamed from: b */
    private int f28752b;

    /* renamed from: c */
    private int f28753c;

    /* renamed from: d */
    private C10978b f28754d;

    /* renamed from: e */
    private final C9663i f28755e;

    /* renamed from: f */
    private boolean f28756f;

    /* renamed from: g */
    private float f28757g;

    /* renamed from: h */
    private float f28758h;

    /* renamed from: i */
    private float f28759i;

    /* renamed from: j */
    private float f28760j;

    /* renamed from: k */
    private int f28761k;

    /* renamed from: l */
    private int f28762l;

    /* renamed from: m */
    private float f28763m;

    public C10977a(C10978b bVar, C9663i iVar, byte[] bArr, int i, int i2, boolean z, float f, float f2, float f3, float f4, int i3, int i4, float f5) {
        this.f28751a = bArr;
        this.f28752b = i;
        this.f28753c = i2;
        this.f28754d = bVar;
        this.f28755e = iVar;
        this.f28756f = z;
        this.f28757g = f;
        this.f28758h = f2;
        this.f28759i = f3;
        this.f28760j = f4;
        this.f28761k = i3;
        this.f28762l = i4;
        this.f28763m = f5;
    }

    /* renamed from: b */
    private C9657c m37247b(byte[] bArr, int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
        C9657c cVar;
        C9688j jVar;
        C9665k kVar = this.f28756f ? new C9665k(bArr, i, i2, i3, i4, i5, i6, false) : new C9665k(bArr, i, i2, 0, 0, i, i2, false);
        if (z) {
            C9662h e = kVar.mo24214e();
            return cVar;
        }
        jVar = new C9688j(kVar);
        cVar = new C9657c(jVar);
        return cVar;
    }

    /* renamed from: d */
    private byte[] m37248d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                bArr2[(((i4 * i2) + i2) - i3) - 1] = bArr[(i3 * i) + i4];
            }
        }
        return bArr2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2 = m37248d(r10.f28751a, r10.f28752b, r10.f28753c);
        r3 = r10.f28753c;
        r1 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x007b, code lost:
        return r10.f28755e.mo24218d(m37247b(r2, r3, r10.f28752b, false, (r3 - r0) - r13, r12, r0, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r2 = r10.f28751a;
        r3 = r10.f28752b;
        r4 = r10.f28753c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0098, code lost:
        return r10.f28755e.mo24218d(m37247b(r2, r3, r4, true, (r3 - r14) - r12, (r4 - r0) - r13, r14, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2 = m37248d(r10.f28751a, r10.f28752b, r10.f28753c);
        r3 = r10.f28753c;
        r4 = r10.f28752b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ba, code lost:
        return r10.f28755e.mo24218d(m37247b(r2, r3, r4, true, r13, (r4 - r14) - r12, r0, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00bb, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x007c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0099 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x005a */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0058 A[ExcHandler: all (r0v13 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:5:0x0042] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p174e.p319f.p416e.C9668n doInBackground(java.lang.Void... r16) {
        /*
            r15 = this;
            r10 = r15
            boolean r0 = r15.isCancelled()
            r11 = 0
            if (r0 != 0) goto L_0x00be
            org.reactnative.camera.g.b r0 = r10.f28754d
            if (r0 != 0) goto L_0x000e
            goto L_0x00be
        L_0x000e:
            int r0 = r10.f28762l
            float r0 = (float) r0
            float r1 = r10.f28763m
            float r0 = r0 / r1
            int r0 = (int) r0
            int r1 = r10.f28761k
            int r2 = r0 - r1
            int r2 = r2 / 2
            float r2 = (float) r2
            float r3 = r10.f28758h
            float r4 = (float) r1
            float r3 = r3 * r4
            float r2 = r2 + r3
            float r0 = (float) r0
            float r2 = r2 / r0
            float r3 = r10.f28757g
            int r4 = r10.f28752b
            float r5 = (float) r4
            float r3 = r3 * r5
            int r12 = (int) r3
            int r5 = r10.f28753c
            float r3 = (float) r5
            float r2 = r2 * r3
            int r13 = (int) r2
            float r2 = r10.f28759i
            float r3 = (float) r4
            float r2 = r2 * r3
            int r14 = (int) r2
            float r2 = r10.f28760j
            float r1 = (float) r1
            float r2 = r2 * r1
            float r2 = r2 / r0
            float r0 = (float) r5
            float r2 = r2 * r0
            int r0 = (int) r2
            byte[] r2 = r10.f28751a     // Catch:{ j -> 0x005a, all -> 0x0058 }
            r6 = 0
            r1 = r15
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r0
            e.f.e.c r1 = r1.m37247b(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ j -> 0x005a, all -> 0x0058 }
            e.f.e.i r2 = r10.f28755e     // Catch:{ j -> 0x005a, all -> 0x0058 }
            e.f.e.n r0 = r2.mo24218d(r1)     // Catch:{ j -> 0x005a, all -> 0x0058 }
            return r0
        L_0x0058:
            r0 = move-exception
            goto L_0x00bb
        L_0x005a:
            byte[] r1 = r10.f28751a     // Catch:{ j -> 0x007c, all -> 0x0058 }
            int r2 = r10.f28752b     // Catch:{ j -> 0x007c, all -> 0x0058 }
            int r3 = r10.f28753c     // Catch:{ j -> 0x007c, all -> 0x0058 }
            byte[] r2 = r15.m37248d(r1, r2, r3)     // Catch:{ j -> 0x007c, all -> 0x0058 }
            int r3 = r10.f28753c     // Catch:{ j -> 0x007c, all -> 0x0058 }
            int r4 = r10.f28752b     // Catch:{ j -> 0x007c, all -> 0x0058 }
            r5 = 0
            int r1 = r3 - r0
            int r6 = r1 - r13
            r1 = r15
            r7 = r12
            r8 = r0
            r9 = r14
            e.f.e.c r1 = r1.m37247b(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ j -> 0x007c, all -> 0x0058 }
            e.f.e.i r2 = r10.f28755e     // Catch:{ j -> 0x007c, all -> 0x0058 }
            e.f.e.n r0 = r2.mo24218d(r1)     // Catch:{ j -> 0x007c, all -> 0x0058 }
            return r0
        L_0x007c:
            byte[] r2 = r10.f28751a     // Catch:{ j -> 0x0099, all -> 0x0058 }
            int r3 = r10.f28752b     // Catch:{ j -> 0x0099, all -> 0x0058 }
            int r4 = r10.f28753c     // Catch:{ j -> 0x0099, all -> 0x0058 }
            r5 = 1
            int r1 = r3 - r14
            int r6 = r1 - r12
            int r1 = r4 - r0
            int r7 = r1 - r13
            r1 = r15
            r8 = r14
            r9 = r0
            e.f.e.c r1 = r1.m37247b(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ j -> 0x0099, all -> 0x0058 }
            e.f.e.i r2 = r10.f28755e     // Catch:{ j -> 0x0099, all -> 0x0058 }
            e.f.e.n r0 = r2.mo24218d(r1)     // Catch:{ j -> 0x0099, all -> 0x0058 }
            return r0
        L_0x0099:
            byte[] r1 = r10.f28751a     // Catch:{ j -> 0x00be, all -> 0x0058 }
            int r2 = r10.f28752b     // Catch:{ j -> 0x00be, all -> 0x0058 }
            int r3 = r10.f28753c     // Catch:{ j -> 0x00be, all -> 0x0058 }
            byte[] r2 = r15.m37248d(r1, r2, r3)     // Catch:{ j -> 0x00be, all -> 0x0058 }
            int r3 = r10.f28753c     // Catch:{ j -> 0x00be, all -> 0x0058 }
            int r4 = r10.f28752b     // Catch:{ j -> 0x00be, all -> 0x0058 }
            r5 = 1
            int r1 = r4 - r14
            int r7 = r1 - r12
            r1 = r15
            r6 = r13
            r8 = r0
            r9 = r14
            e.f.e.c r0 = r1.m37247b(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ j -> 0x00be, all -> 0x0058 }
            e.f.e.i r1 = r10.f28755e     // Catch:{ j -> 0x00be, all -> 0x0058 }
            e.f.e.n r0 = r1.mo24218d(r0)     // Catch:{ j -> 0x00be, all -> 0x0058 }
            return r0
        L_0x00bb:
            r0.printStackTrace()
        L_0x00be:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: org.reactnative.camera.p514g.C10977a.doInBackground(java.lang.Void[]):e.f.e.n");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void onPostExecute(C9668n nVar) {
        super.onPostExecute(nVar);
        if (nVar != null) {
            this.f28754d.mo28926d(nVar, this.f28752b, this.f28753c, this.f28751a);
        }
        this.f28754d.mo28929g();
    }
}
