package p174e.p319f.p320a.p335c.p345f.p352g;

/* renamed from: e.f.a.c.f.g.h6 */
public final class C6817h6 {

    /* renamed from: a */
    private static volatile C6700a7 f18515a;

    private C6817h6() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:68|69) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        throw r13;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014d */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077 A[Catch:{ RuntimeException -> 0x0068, all -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0155 A[Catch:{ RuntimeException -> 0x0068, all -> 0x0161 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p174e.p319f.p320a.p335c.p345f.p352g.C6700a7 m25795a(android.content.Context r13) {
        /*
            java.lang.Class<e.f.a.c.f.g.h6> r0 = p174e.p319f.p320a.p335c.p345f.p352g.C6817h6.class
            monitor-enter(r0)
            e.f.a.c.f.g.a7 r1 = f18515a     // Catch:{ all -> 0x0168 }
            if (r1 != 0) goto L_0x0166
            java.lang.String r1 = android.os.Build.TYPE     // Catch:{ all -> 0x0168 }
            java.lang.String r2 = android.os.Build.TAGS     // Catch:{ all -> 0x0168 }
            java.lang.String r3 = "eng"
            boolean r3 = r1.equals(r3)     // Catch:{ all -> 0x0168 }
            if (r3 != 0) goto L_0x001b
            java.lang.String r3 = "userdebug"
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0168 }
            if (r1 == 0) goto L_0x002c
        L_0x001b:
            java.lang.String r1 = "dev-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0168 }
            if (r1 != 0) goto L_0x0033
            java.lang.String r1 = "test-keys"
            boolean r1 = r2.contains(r1)     // Catch:{ all -> 0x0168 }
            if (r1 == 0) goto L_0x002c
            goto L_0x0033
        L_0x002c:
            e.f.a.c.f.g.a7 r13 = p174e.p319f.p320a.p335c.p345f.p352g.C6700a7.m25407c()     // Catch:{ all -> 0x0168 }
        L_0x0030:
            r1 = r13
            goto L_0x015e
        L_0x0033:
            boolean r1 = p174e.p319f.p320a.p335c.p345f.p352g.C7024u5.m26734a()     // Catch:{ all -> 0x0168 }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r13.isDeviceProtectedStorage()     // Catch:{ all -> 0x0168 }
            if (r1 != 0) goto L_0x0043
            android.content.Context r13 = r13.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0168 }
        L_0x0043:
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0168 }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0161 }
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ RuntimeException -> 0x0068 }
            java.lang.String r4 = "phenotype_hermetic"
            java.io.File r13 = r13.getDir(r4, r2)     // Catch:{ RuntimeException -> 0x0068 }
            java.lang.String r4 = "overrides.txt"
            r3.<init>(r13, r4)     // Catch:{ RuntimeException -> 0x0068 }
            boolean r13 = r3.exists()     // Catch:{ all -> 0x0161 }
            if (r13 == 0) goto L_0x0063
            e.f.a.c.f.g.a7 r13 = p174e.p319f.p320a.p335c.p345f.p352g.C6700a7.m25408d(r3)     // Catch:{ all -> 0x0161 }
            goto L_0x0071
        L_0x0063:
            e.f.a.c.f.g.a7 r13 = p174e.p319f.p320a.p335c.p345f.p352g.C6700a7.m25407c()     // Catch:{ all -> 0x0161 }
            goto L_0x0071
        L_0x0068:
            r13 = move-exception
            java.lang.String r3 = "HermeticFileOverrides"
            java.lang.String r4 = "no data dir"
            android.util.Log.e(r3, r4, r13)     // Catch:{ all -> 0x0161 }
            goto L_0x0063
        L_0x0071:
            boolean r3 = r13.mo19514b()     // Catch:{ all -> 0x0161 }
            if (r3 == 0) goto L_0x0155
            java.lang.Object r13 = r13.mo19513a()     // Catch:{ all -> 0x0161 }
            java.io.File r13 = (java.io.File) r13     // Catch:{ all -> 0x0161 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x014e }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x014e }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x014e }
            r5.<init>(r13)     // Catch:{ IOException -> 0x014e }
            r4.<init>(r5)     // Catch:{ IOException -> 0x014e }
            r3.<init>(r4)     // Catch:{ IOException -> 0x014e }
            r4 = 1
            c.f.g r5 = new c.f.g     // Catch:{ all -> 0x0132 }
            r5.<init>()     // Catch:{ all -> 0x0132 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0132 }
            r6.<init>()     // Catch:{ all -> 0x0132 }
        L_0x0097:
            java.lang.String r7 = r3.readLine()     // Catch:{ all -> 0x0132 }
            if (r7 == 0) goto L_0x010b
            java.lang.String r8 = " "
            r9 = 3
            java.lang.String[] r8 = r7.split(r8, r9)     // Catch:{ all -> 0x0132 }
            int r10 = r8.length     // Catch:{ all -> 0x0132 }
            if (r10 == r9) goto L_0x00be
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
            r8.<init>()     // Catch:{ all -> 0x0132 }
            java.lang.String r9 = "Invalid: "
            r8.append(r9)     // Catch:{ all -> 0x0132 }
            r8.append(r7)     // Catch:{ all -> 0x0132 }
            java.lang.String r7 = "HermeticFileOverrides"
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0132 }
            android.util.Log.e(r7, r8)     // Catch:{ all -> 0x0132 }
            goto L_0x0097
        L_0x00be:
            r7 = r8[r2]     // Catch:{ all -> 0x0132 }
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0132 }
            r9.<init>(r7)     // Catch:{ all -> 0x0132 }
            r7 = r8[r4]     // Catch:{ all -> 0x0132 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0132 }
            r10.<init>(r7)     // Catch:{ all -> 0x0132 }
            java.lang.String r7 = android.net.Uri.decode(r10)     // Catch:{ all -> 0x0132 }
            r10 = 2
            r11 = r8[r10]     // Catch:{ all -> 0x0132 }
            java.lang.Object r11 = r6.get(r11)     // Catch:{ all -> 0x0132 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0132 }
            if (r11 != 0) goto L_0x00f3
            r8 = r8[r10]     // Catch:{ all -> 0x0132 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0132 }
            r10.<init>(r8)     // Catch:{ all -> 0x0132 }
            java.lang.String r11 = android.net.Uri.decode(r10)     // Catch:{ all -> 0x0132 }
            int r8 = r11.length()     // Catch:{ all -> 0x0132 }
            r12 = 1024(0x400, float:1.435E-42)
            if (r8 < r12) goto L_0x00f0
            if (r11 != r10) goto L_0x00f3
        L_0x00f0:
            r6.put(r10, r11)     // Catch:{ all -> 0x0132 }
        L_0x00f3:
            boolean r8 = r5.containsKey(r9)     // Catch:{ all -> 0x0132 }
            if (r8 != 0) goto L_0x0101
            c.f.g r8 = new c.f.g     // Catch:{ all -> 0x0132 }
            r8.<init>()     // Catch:{ all -> 0x0132 }
            r5.put(r9, r8)     // Catch:{ all -> 0x0132 }
        L_0x0101:
            java.lang.Object r8 = r5.get(r9)     // Catch:{ all -> 0x0132 }
            c.f.g r8 = (p027c.p060f.C1801g) r8     // Catch:{ all -> 0x0132 }
            r8.put(r7, r11)     // Catch:{ all -> 0x0132 }
            goto L_0x0097
        L_0x010b:
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0132 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
            r6.<init>()     // Catch:{ all -> 0x0132 }
            java.lang.String r7 = "Parsed "
            r6.append(r7)     // Catch:{ all -> 0x0132 }
            r6.append(r13)     // Catch:{ all -> 0x0132 }
            java.lang.String r13 = "HermeticFileOverrides"
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0132 }
            android.util.Log.i(r13, r6)     // Catch:{ all -> 0x0132 }
            e.f.a.c.f.g.a6 r13 = new e.f.a.c.f.g.a6     // Catch:{ all -> 0x0132 }
            r13.<init>(r5)     // Catch:{ all -> 0x0132 }
            r3.close()     // Catch:{ IOException -> 0x014e }
            e.f.a.c.f.g.a7 r13 = p174e.p319f.p320a.p335c.p345f.p352g.C6700a7.m25408d(r13)     // Catch:{ all -> 0x0161 }
            goto L_0x0159
        L_0x0132:
            r13 = move-exception
            r3.close()     // Catch:{ all -> 0x0137 }
            goto L_0x014d
        L_0x0137:
            r3 = move-exception
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x014d }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            r5[r2] = r6     // Catch:{ Exception -> 0x014d }
            java.lang.Class<java.lang.Throwable> r6 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r5 = r6.getDeclaredMethod(r7, r5)     // Catch:{ Exception -> 0x014d }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x014d }
            r4[r2] = r3     // Catch:{ Exception -> 0x014d }
            r5.invoke(r13, r4)     // Catch:{ Exception -> 0x014d }
        L_0x014d:
            throw r13     // Catch:{ IOException -> 0x014e }
        L_0x014e:
            r13 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0161 }
            r2.<init>(r13)     // Catch:{ all -> 0x0161 }
            throw r2     // Catch:{ all -> 0x0161 }
        L_0x0155:
            e.f.a.c.f.g.a7 r13 = p174e.p319f.p320a.p335c.p345f.p352g.C6700a7.m25407c()     // Catch:{ all -> 0x0161 }
        L_0x0159:
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x0168 }
            goto L_0x0030
        L_0x015e:
            f18515a = r1     // Catch:{ all -> 0x0168 }
            goto L_0x0166
        L_0x0161:
            r13 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch:{ all -> 0x0168 }
            throw r13     // Catch:{ all -> 0x0168 }
        L_0x0166:
            monitor-exit(r0)     // Catch:{ all -> 0x0168 }
            return r1
        L_0x0168:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0168 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6817h6.m25795a(android.content.Context):e.f.a.c.f.g.a7");
    }
}
