package p174e.p199d.p218c.p221c0;

import okhttp3.HttpUrl;
import p174e.p199d.p200a.p213r.C5689a;
import p174e.p199d.p218c.C5732e;

/* renamed from: e.d.c.c0.c */
public class C5727c implements C5689a {

    /* renamed from: a */
    private final C5726b f16198a;

    /* renamed from: b */
    private String f16199b = HttpUrl.FRAGMENT_ENCODE_SET;

    public C5727c(C5732e eVar) {
        C5726b bVar = new C5726b();
        this.f16198a = bVar;
        eVar.mo17166a(bVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r10.f16198a.mo17137a("Error calculating duration: bytes per second not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00ef */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16980a(java.lang.String r11, byte[] r12) {
        /*
            r10 = this;
            java.lang.String r0 = "fmt "
            boolean r0 = r11.equals(r0)     // Catch:{ IOException -> 0x011a }
            r1 = 3
            r2 = 2
            r3 = 4
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0085
            e.d.b.b r11 = new e.d.b.b     // Catch:{ IOException -> 0x011a }
            r11.<init>(r12)     // Catch:{ IOException -> 0x011a }
            r11.mo17058w(r4)     // Catch:{ IOException -> 0x011a }
            short r12 = r11.mo17042f(r4)     // Catch:{ IOException -> 0x011a }
            short r0 = r11.mo17042f(r2)     // Catch:{ IOException -> 0x011a }
            int r4 = r11.mo17044h(r3)     // Catch:{ IOException -> 0x011a }
            r6 = 8
            int r6 = r11.mo17044h(r6)     // Catch:{ IOException -> 0x011a }
            r7 = 12
            short r7 = r11.mo17042f(r7)     // Catch:{ IOException -> 0x011a }
            if (r12 == r5) goto L_0x0053
            java.util.HashMap<java.lang.Integer, java.lang.String> r11 = p174e.p199d.p218c.p221c0.C5726b.f16197h     // Catch:{ IOException -> 0x011a }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x011a }
            boolean r8 = r11.containsKey(r8)     // Catch:{ IOException -> 0x011a }
            if (r8 == 0) goto L_0x004b
            e.d.c.c0.b r8 = r10.f16198a     // Catch:{ IOException -> 0x011a }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x011a }
            java.lang.Object r11 = r11.get(r12)     // Catch:{ IOException -> 0x011a }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ IOException -> 0x011a }
            r8.mo17133R(r5, r11)     // Catch:{ IOException -> 0x011a }
            goto L_0x006e
        L_0x004b:
            e.d.c.c0.b r11 = r10.f16198a     // Catch:{ IOException -> 0x011a }
            java.lang.String r12 = "Unknown"
        L_0x004f:
            r11.mo17133R(r5, r12)     // Catch:{ IOException -> 0x011a }
            goto L_0x006e
        L_0x0053:
            r8 = 14
            short r11 = r11.mo17042f(r8)     // Catch:{ IOException -> 0x011a }
            e.d.c.c0.b r8 = r10.f16198a     // Catch:{ IOException -> 0x011a }
            r9 = 6
            r8.mo17125J(r9, r11)     // Catch:{ IOException -> 0x011a }
            e.d.c.c0.b r11 = r10.f16198a     // Catch:{ IOException -> 0x011a }
            java.util.HashMap<java.lang.Integer, java.lang.String> r8 = p174e.p199d.p218c.p221c0.C5726b.f16197h     // Catch:{ IOException -> 0x011a }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x011a }
            java.lang.Object r12 = r8.get(r12)     // Catch:{ IOException -> 0x011a }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x011a }
            goto L_0x004f
        L_0x006e:
            e.d.c.c0.b r11 = r10.f16198a     // Catch:{ IOException -> 0x011a }
            r11.mo17125J(r2, r0)     // Catch:{ IOException -> 0x011a }
            e.d.c.c0.b r11 = r10.f16198a     // Catch:{ IOException -> 0x011a }
            r11.mo17125J(r1, r4)     // Catch:{ IOException -> 0x011a }
            e.d.c.c0.b r11 = r10.f16198a     // Catch:{ IOException -> 0x011a }
            r11.mo17125J(r3, r6)     // Catch:{ IOException -> 0x011a }
            e.d.c.c0.b r11 = r10.f16198a     // Catch:{ IOException -> 0x011a }
            r12 = 5
            r11.mo17125J(r12, r7)     // Catch:{ IOException -> 0x011a }
            goto L_0x0124
        L_0x0085:
            java.lang.String r0 = "data"
            boolean r0 = r11.equals(r0)     // Catch:{ IOException -> 0x011a }
            if (r0 == 0) goto L_0x00f7
            e.d.c.c0.b r11 = r10.f16198a     // Catch:{ f -> 0x00ef }
            boolean r11 = r11.mo17138b(r3)     // Catch:{ f -> 0x00ef }
            if (r11 == 0) goto L_0x0124
            int r11 = r12.length     // Catch:{ f -> 0x00ef }
            double r11 = (double) r11     // Catch:{ f -> 0x00ef }
            e.d.c.c0.b r0 = r10.f16198a     // Catch:{ f -> 0x00ef }
            double r6 = r0.mo17143g(r3)     // Catch:{ f -> 0x00ef }
            double r11 = r11 / r6
            int r0 = (int) r11     // Catch:{ f -> 0x00ef }
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r8 = 4633641066610819072(0x404e000000000000, double:60.0)
            double r6 = java.lang.Math.pow(r8, r6)     // Catch:{ f -> 0x00ef }
            int r3 = (int) r6     // Catch:{ f -> 0x00ef }
            int r3 = r0 / r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ f -> 0x00ef }
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r6 = java.lang.Math.pow(r8, r6)     // Catch:{ f -> 0x00ef }
            int r6 = (int) r6     // Catch:{ f -> 0x00ef }
            int r0 = r0 / r6
            int r6 = r3.intValue()     // Catch:{ f -> 0x00ef }
            int r6 = r6 * 60
            int r0 = r0 - r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ f -> 0x00ef }
            r6 = 0
            double r6 = java.lang.Math.pow(r8, r6)     // Catch:{ f -> 0x00ef }
            double r11 = r11 / r6
            int r6 = r0.intValue()     // Catch:{ f -> 0x00ef }
            int r6 = r6 * 60
            double r6 = (double) r6     // Catch:{ f -> 0x00ef }
            double r11 = r11 - r6
            long r11 = java.lang.Math.round(r11)     // Catch:{ f -> 0x00ef }
            int r12 = (int) r11     // Catch:{ f -> 0x00ef }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)     // Catch:{ f -> 0x00ef }
            java.lang.String r12 = "%1$02d:%2$02d:%3$02d"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ f -> 0x00ef }
            r1[r4] = r3     // Catch:{ f -> 0x00ef }
            r1[r5] = r0     // Catch:{ f -> 0x00ef }
            r1[r2] = r11     // Catch:{ f -> 0x00ef }
            java.lang.String r11 = java.lang.String.format(r12, r1)     // Catch:{ f -> 0x00ef }
            e.d.c.c0.b r12 = r10.f16198a     // Catch:{ f -> 0x00ef }
            r0 = 16
            r12.mo17133R(r0, r11)     // Catch:{ f -> 0x00ef }
            goto L_0x0124
        L_0x00ef:
            e.d.c.c0.b r11 = r10.f16198a     // Catch:{ IOException -> 0x011a }
            java.lang.String r12 = "Error calculating duration: bytes per second not found"
            r11.mo17137a(r12)     // Catch:{ IOException -> 0x011a }
            goto L_0x0124
        L_0x00f7:
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = p174e.p199d.p218c.p221c0.C5726b.f16196g     // Catch:{ IOException -> 0x011a }
            boolean r1 = r0.containsKey(r11)     // Catch:{ IOException -> 0x011a }
            if (r1 == 0) goto L_0x0124
            e.d.c.c0.b r1 = r10.f16198a     // Catch:{ IOException -> 0x011a }
            java.lang.Object r11 = r0.get(r11)     // Catch:{ IOException -> 0x011a }
            java.lang.Integer r11 = (java.lang.Integer) r11     // Catch:{ IOException -> 0x011a }
            int r11 = r11.intValue()     // Catch:{ IOException -> 0x011a }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x011a }
            r0.<init>(r12)     // Catch:{ IOException -> 0x011a }
            int r12 = r12.length     // Catch:{ IOException -> 0x011a }
            int r12 = r12 - r5
            java.lang.String r12 = r0.substring(r4, r12)     // Catch:{ IOException -> 0x011a }
            r1.mo17133R(r11, r12)     // Catch:{ IOException -> 0x011a }
            goto L_0x0124
        L_0x011a:
            r11 = move-exception
            e.d.c.c0.b r12 = r10.f16198a
            java.lang.String r11 = r11.getMessage()
            r12.mo17137a(r11)
        L_0x0124:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p199d.p218c.p221c0.C5727c.mo16980a(java.lang.String, byte[]):void");
    }

    /* renamed from: b */
    public boolean mo16981b(String str) {
        if (str.equals("INFO")) {
            this.f16199b = "INFO";
            return true;
        }
        this.f16199b = HttpUrl.FRAGMENT_ENCODE_SET;
        return false;
    }

    /* renamed from: c */
    public boolean mo16982c(String str) {
        return str.equals("fmt ") || (this.f16199b.equals("INFO") && C5726b.f16196g.containsKey(str)) || str.equals("data");
    }

    /* renamed from: d */
    public boolean mo16983d(String str) {
        return str.equals("WAVE");
    }
}
