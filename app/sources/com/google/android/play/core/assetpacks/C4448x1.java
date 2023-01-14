package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.x1 */
final class C4448x1 {

    /* renamed from: a */
    private final int f12701a;

    /* renamed from: b */
    private final String f12702b;

    /* renamed from: c */
    private final long f12703c;

    /* renamed from: d */
    private final long f12704d;

    /* renamed from: e */
    private final int f12705e;

    C4448x1() {
    }

    C4448x1(int i, String str, long j, long j2, int i2) {
        this();
        this.f12701a = i;
        this.f12702b = str;
        this.f12703c = j;
        this.f12704d = j2;
        this.f12705e = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo13953a() {
        return this.f12701a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo13954b() {
        return this.f12702b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public long mo13955c() {
        return this.f12703c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public long mo13956d() {
        return this.f12704d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo13957e() {
        return this.f12705e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.f12702b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.C4448x1
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.google.android.play.core.assetpacks.x1 r8 = (com.google.android.play.core.assetpacks.C4448x1) r8
            int r1 = r7.f12701a
            int r3 = r8.mo13953a()
            if (r1 != r3) goto L_0x0046
            java.lang.String r1 = r7.f12702b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r8.mo13954b()
            if (r1 != 0) goto L_0x0046
            goto L_0x0029
        L_0x001e:
            java.lang.String r3 = r8.mo13954b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0046
        L_0x0029:
            long r3 = r7.f12703c
            long r5 = r8.mo13955c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            long r3 = r7.f12704d
            long r5 = r8.mo13956d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            int r1 = r7.f12705e
            int r8 = r8.mo13957e()
            if (r1 != r8) goto L_0x0046
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C4448x1.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = (this.f12701a ^ 1000003) * 1000003;
        String str = this.f12702b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f12703c;
        long j2 = this.f12704d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f12705e;
    }

    public String toString() {
        int i = this.f12701a;
        String str = this.f12702b;
        long j = this.f12703c;
        long j2 = this.f12704d;
        int i2 = this.f12705e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
