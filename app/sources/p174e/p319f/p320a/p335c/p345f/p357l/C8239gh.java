package p174e.p319f.p320a.p335c.p345f.p357l;

import android.content.Context;

/* renamed from: e.f.a.c.f.l.gh */
public final /* synthetic */ class C8239gh implements C8185e1 {

    /* renamed from: f */
    public final /* synthetic */ Context f22585f;

    public /* synthetic */ C8239gh(Context context) {
        this.f22585f = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074 A[Catch:{ RuntimeException -> 0x0067, all -> 0x014b }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0143 A[Catch:{ RuntimeException -> 0x0067, all -> 0x014b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object zza() {
        /*
            r13 = this;
            java.lang.String r0 = "HermeticFileOverrides"
            android.content.Context r1 = r13.f22585f
            int r2 = p174e.p319f.p320a.p335c.p345f.p357l.C8126b.f22076f
            java.lang.String r2 = android.os.Build.TYPE
            java.lang.String r3 = android.os.Build.TAGS
            java.lang.String r4 = "eng"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x001b
            java.lang.String r4 = "userdebug"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x001b
            goto L_0x002c
        L_0x001b:
            java.lang.String r2 = "dev-keys"
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L_0x0032
            java.lang.String r2 = "test-keys"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            e.f.a.c.f.l.w0 r0 = p174e.p319f.p320a.p335c.p345f.p357l.C8515w0.m29203c()
            goto L_0x014a
        L_0x0032:
            boolean r2 = p174e.p319f.p320a.p335c.p345f.p357l.C8207f4.m28493a()
            if (r2 == 0) goto L_0x0042
            boolean r2 = r1.isDeviceProtectedStorage()
            if (r2 != 0) goto L_0x0042
            android.content.Context r1 = r1.createDeviceProtectedStorageContext()
        L_0x0042:
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x014b }
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ RuntimeException -> 0x0067 }
            java.lang.String r5 = "phenotype_hermetic"
            java.io.File r1 = r1.getDir(r5, r3)     // Catch:{ RuntimeException -> 0x0067 }
            java.lang.String r5 = "overrides.txt"
            r4.<init>(r1, r5)     // Catch:{ RuntimeException -> 0x0067 }
            boolean r1 = r4.exists()     // Catch:{ all -> 0x014b }
            if (r1 == 0) goto L_0x0062
            e.f.a.c.f.l.w0 r1 = p174e.p319f.p320a.p335c.p345f.p357l.C8515w0.m29204d(r4)     // Catch:{ all -> 0x014b }
            goto L_0x006e
        L_0x0062:
            e.f.a.c.f.l.w0 r1 = p174e.p319f.p320a.p335c.p345f.p357l.C8515w0.m29203c()     // Catch:{ all -> 0x014b }
            goto L_0x006e
        L_0x0067:
            r1 = move-exception
            java.lang.String r4 = "no data dir"
            android.util.Log.e(r0, r4, r1)     // Catch:{ all -> 0x014b }
            goto L_0x0062
        L_0x006e:
            boolean r4 = r1.mo21673b()     // Catch:{ all -> 0x014b }
            if (r4 == 0) goto L_0x0143
            java.lang.Object r1 = r1.mo21672a()     // Catch:{ all -> 0x014b }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x014b }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x013c }
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x013c }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x013c }
            r6.<init>(r1)     // Catch:{ IOException -> 0x013c }
            r5.<init>(r6)     // Catch:{ IOException -> 0x013c }
            r4.<init>(r5)     // Catch:{ IOException -> 0x013c }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0132 }
            r5.<init>()     // Catch:{ all -> 0x0132 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0132 }
            r6.<init>()     // Catch:{ all -> 0x0132 }
        L_0x0093:
            java.lang.String r7 = r4.readLine()     // Catch:{ all -> 0x0132 }
            if (r7 == 0) goto L_0x0107
            java.lang.String r8 = " "
            r9 = 3
            java.lang.String[] r8 = r7.split(r8, r9)     // Catch:{ all -> 0x0132 }
            int r10 = r8.length     // Catch:{ all -> 0x0132 }
            if (r10 == r9) goto L_0x00b9
            java.lang.String r8 = "Invalid: "
            int r9 = r7.length()     // Catch:{ all -> 0x0132 }
            if (r9 == 0) goto L_0x00b0
            java.lang.String r7 = r8.concat(r7)     // Catch:{ all -> 0x0132 }
            goto L_0x00b5
        L_0x00b0:
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0132 }
            r7.<init>(r8)     // Catch:{ all -> 0x0132 }
        L_0x00b5:
            android.util.Log.e(r0, r7)     // Catch:{ all -> 0x0132 }
            goto L_0x0093
        L_0x00b9:
            r7 = r8[r3]     // Catch:{ all -> 0x0132 }
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x0132 }
            r9.<init>(r7)     // Catch:{ all -> 0x0132 }
            r7 = 1
            r7 = r8[r7]     // Catch:{ all -> 0x0132 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0132 }
            r10.<init>(r7)     // Catch:{ all -> 0x0132 }
            java.lang.String r7 = android.net.Uri.decode(r10)     // Catch:{ all -> 0x0132 }
            r10 = 2
            r11 = r8[r10]     // Catch:{ all -> 0x0132 }
            java.lang.Object r11 = r6.get(r11)     // Catch:{ all -> 0x0132 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0132 }
            if (r11 != 0) goto L_0x00ef
            r8 = r8[r10]     // Catch:{ all -> 0x0132 }
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x0132 }
            r10.<init>(r8)     // Catch:{ all -> 0x0132 }
            java.lang.String r11 = android.net.Uri.decode(r10)     // Catch:{ all -> 0x0132 }
            int r8 = r11.length()     // Catch:{ all -> 0x0132 }
            r12 = 1024(0x400, float:1.435E-42)
            if (r8 < r12) goto L_0x00ec
            if (r11 != r10) goto L_0x00ef
        L_0x00ec:
            r6.put(r10, r11)     // Catch:{ all -> 0x0132 }
        L_0x00ef:
            boolean r8 = r5.containsKey(r9)     // Catch:{ all -> 0x0132 }
            if (r8 != 0) goto L_0x00fd
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0132 }
            r8.<init>()     // Catch:{ all -> 0x0132 }
            r5.put(r9, r8)     // Catch:{ all -> 0x0132 }
        L_0x00fd:
            java.lang.Object r8 = r5.get(r9)     // Catch:{ all -> 0x0132 }
            java.util.Map r8 = (java.util.Map) r8     // Catch:{ all -> 0x0132 }
            r8.put(r7, r11)     // Catch:{ all -> 0x0132 }
            goto L_0x0093
        L_0x0107:
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0132 }
            int r3 = r1.length()     // Catch:{ all -> 0x0132 }
            int r3 = r3 + 7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0132 }
            r6.<init>(r3)     // Catch:{ all -> 0x0132 }
            java.lang.String r3 = "Parsed "
            r6.append(r3)     // Catch:{ all -> 0x0132 }
            r6.append(r1)     // Catch:{ all -> 0x0132 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0132 }
            android.util.Log.i(r0, r1)     // Catch:{ all -> 0x0132 }
            e.f.a.c.f.l.pg r0 = new e.f.a.c.f.l.pg     // Catch:{ all -> 0x0132 }
            r0.<init>(r5)     // Catch:{ all -> 0x0132 }
            r4.close()     // Catch:{ IOException -> 0x013c }
            e.f.a.c.f.l.w0 r0 = p174e.p319f.p320a.p335c.p345f.p357l.C8515w0.m29204d(r0)     // Catch:{ all -> 0x014b }
            goto L_0x0147
        L_0x0132:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0137 }
            goto L_0x013b
        L_0x0137:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch:{ IOException -> 0x013c }
        L_0x013b:
            throw r0     // Catch:{ IOException -> 0x013c }
        L_0x013c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x014b }
            r1.<init>(r0)     // Catch:{ all -> 0x014b }
            throw r1     // Catch:{ all -> 0x014b }
        L_0x0143:
            e.f.a.c.f.l.w0 r0 = p174e.p319f.p320a.p335c.p345f.p357l.C8515w0.m29203c()     // Catch:{ all -> 0x014b }
        L_0x0147:
            android.os.StrictMode.setThreadPolicy(r2)
        L_0x014a:
            return r0
        L_0x014b:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p357l.C8239gh.zza():java.lang.Object");
    }
}
