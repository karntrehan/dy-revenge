package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C3705r;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.e4 */
final class C3863e4 implements Runnable {

    /* renamed from: f */
    private final URL f10643f;

    /* renamed from: o */
    private final byte[] f10644o;

    /* renamed from: p */
    private final C3824b4 f10645p;

    /* renamed from: q */
    private final String f10646q;

    /* renamed from: r */
    private final Map f10647r;

    /* renamed from: s */
    final /* synthetic */ C3889g4 f10648s;

    public C3863e4(C3889g4 g4Var, String str, URL url, byte[] bArr, Map map, C3824b4 b4Var) {
        this.f10648s = g4Var;
        C3705r.m14342g(str);
        C3705r.m14346k(url);
        C3705r.m14346k(b4Var);
        this.f10643f = url;
        this.f10644o = bArr;
        this.f10645p = b4Var;
        this.f10646q = str;
        this.f10647r = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f3 A[SYNTHETIC, Splitter:B:43:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0123 A[SYNTHETIC, Splitter:B:65:0x0123] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0163 A[SYNTHETIC, Splitter:B:78:0x0163] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.g4 r1 = r14.f10648s
            r1.mo11939g()
            r1 = 0
            r2 = 0
            com.google.android.gms.measurement.internal.g4 r3 = r14.f10648s     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            java.net.URL r4 = r14.f10643f     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            boolean r5 = r4 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            if (r5 == 0) goto L_0x0114
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r4.setDefaultUseCaches(r1)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            com.google.android.gms.measurement.internal.l5 r5 = r3.f10651a     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r5.mo12181z()     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r5 = 60000(0xea60, float:8.4078E-41)
            r4.setConnectTimeout(r5)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            com.google.android.gms.measurement.internal.l5 r3 = r3.f10651a     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r3.mo12181z()     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r3 = 61000(0xee48, float:8.5479E-41)
            r4.setReadTimeout(r3)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r4.setInstanceFollowRedirects(r1)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            r3 = 1
            r4.setDoInput(r3)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            java.util.Map r5 = r14.f10647r     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            if (r5 == 0) goto L_0x005f
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
        L_0x0043:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            goto L_0x0043
        L_0x005f:
            byte[] r5 = r14.f10644o     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            if (r5 == 0) goto L_0x00ac
            com.google.android.gms.measurement.internal.g4 r5 = r14.f10648s     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.pa r5 = r5.f10552b     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.ra r5 = r5.mo12287g0()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            byte[] r6 = r14.f10644o     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            byte[] r5 = r5.mo12399O(r6)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.g4 r6 = r14.f10648s     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.l5 r6 = r6.f10651a     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.z3 r6 = r6.mo11935b()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            com.google.android.gms.measurement.internal.x3 r6 = r6.mo12548v()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            int r7 = r5.length     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r8 = "Uploading data. size"
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r6.mo12477b(r8, r9)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.setDoOutput(r3)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.lang.String r3 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r4.addRequestProperty(r3, r6)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.setFixedLengthStreamingMode(r7)     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r4.connect()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.io.OutputStream r3 = r4.getOutputStream()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            r3.write(r5)     // Catch:{ IOException -> 0x00a7, all -> 0x00a2 }
            r3.close()     // Catch:{ IOException -> 0x00a7, all -> 0x00a2 }
            goto L_0x00ac
        L_0x00a2:
            r5 = move-exception
            r12 = r2
            r2 = r3
            goto L_0x0120
        L_0x00a7:
            r5 = move-exception
            r12 = r2
            r2 = r3
            goto L_0x015f
        L_0x00ac:
            int r8 = r4.getResponseCode()     // Catch:{ IOException -> 0x0110, all -> 0x010c }
            java.util.Map r11 = r4.getHeaderFields()     // Catch:{ IOException -> 0x0107, all -> 0x0103 }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x00ef }
            r3.<init>()     // Catch:{ all -> 0x00ef }
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ all -> 0x00ef }
            r6 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x00ed }
        L_0x00c1:
            int r7 = r5.read(r6)     // Catch:{ all -> 0x00ed }
            if (r7 <= 0) goto L_0x00cb
            r3.write(r6, r1, r7)     // Catch:{ all -> 0x00ed }
            goto L_0x00c1
        L_0x00cb:
            byte[] r10 = r3.toByteArray()     // Catch:{ all -> 0x00ed }
            r5.close()     // Catch:{ IOException -> 0x00fc, all -> 0x00f7 }
            r4.disconnect()
            com.google.android.gms.measurement.internal.g4 r0 = r14.f10648s
            com.google.android.gms.measurement.internal.l5 r0 = r0.f10651a
            com.google.android.gms.measurement.internal.i5 r0 = r0.mo11934a()
            com.google.android.gms.measurement.internal.d4 r1 = new com.google.android.gms.measurement.internal.d4
            java.lang.String r6 = r14.f10646q
            com.google.android.gms.measurement.internal.b4 r7 = r14.f10645p
            r9 = 0
            r12 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L_0x00e9:
            r0.mo12110z(r1)
            return
        L_0x00ed:
            r1 = move-exception
            goto L_0x00f1
        L_0x00ef:
            r1 = move-exception
            r5 = r2
        L_0x00f1:
            if (r5 == 0) goto L_0x00f6
            r5.close()     // Catch:{ IOException -> 0x00fc, all -> 0x00f7 }
        L_0x00f6:
            throw r1     // Catch:{ IOException -> 0x00fc, all -> 0x00f7 }
        L_0x00f7:
            r1 = move-exception
            r5 = r1
            r9 = r8
            r12 = r11
            goto L_0x0121
        L_0x00fc:
            r1 = move-exception
            r5 = r1
            r10 = r5
            r9 = r8
            r12 = r11
            goto L_0x0161
        L_0x0103:
            r5 = move-exception
            r12 = r2
            r9 = r8
            goto L_0x0121
        L_0x0107:
            r5 = move-exception
            r12 = r2
            r10 = r5
            r9 = r8
            goto L_0x0161
        L_0x010c:
            r3 = move-exception
            r12 = r2
            r5 = r3
            goto L_0x0120
        L_0x0110:
            r3 = move-exception
            r12 = r2
            r10 = r3
            goto L_0x0160
        L_0x0114:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x015b, all -> 0x011c }
            throw r3     // Catch:{ IOException -> 0x015b, all -> 0x011c }
        L_0x011c:
            r3 = move-exception
            r5 = r3
            r4 = r2
            r12 = r4
        L_0x0120:
            r9 = 0
        L_0x0121:
            if (r2 == 0) goto L_0x013d
            r2.close()     // Catch:{ IOException -> 0x0127 }
            goto L_0x013d
        L_0x0127:
            r1 = move-exception
            com.google.android.gms.measurement.internal.g4 r2 = r14.f10648s
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()
            java.lang.String r3 = r14.f10646q
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)
            r2.mo12478c(r0, r3, r1)
        L_0x013d:
            if (r4 == 0) goto L_0x0142
            r4.disconnect()
        L_0x0142:
            com.google.android.gms.measurement.internal.g4 r0 = r14.f10648s
            com.google.android.gms.measurement.internal.l5 r0 = r0.f10651a
            com.google.android.gms.measurement.internal.i5 r0 = r0.mo11934a()
            com.google.android.gms.measurement.internal.d4 r1 = new com.google.android.gms.measurement.internal.d4
            java.lang.String r7 = r14.f10646q
            com.google.android.gms.measurement.internal.b4 r8 = r14.f10645p
            r10 = 0
            r11 = 0
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0.mo12110z(r1)
            throw r5
        L_0x015b:
            r3 = move-exception
            r5 = r3
            r4 = r2
            r12 = r4
        L_0x015f:
            r10 = r5
        L_0x0160:
            r9 = 0
        L_0x0161:
            if (r2 == 0) goto L_0x017d
            r2.close()     // Catch:{ IOException -> 0x0167 }
            goto L_0x017d
        L_0x0167:
            r1 = move-exception
            com.google.android.gms.measurement.internal.g4 r2 = r14.f10648s
            com.google.android.gms.measurement.internal.l5 r2 = r2.f10651a
            com.google.android.gms.measurement.internal.z3 r2 = r2.mo11935b()
            com.google.android.gms.measurement.internal.x3 r2 = r2.mo12544r()
            java.lang.String r3 = r14.f10646q
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4122z3.m15469z(r3)
            r2.mo12478c(r0, r3, r1)
        L_0x017d:
            if (r4 == 0) goto L_0x0182
            r4.disconnect()
        L_0x0182:
            com.google.android.gms.measurement.internal.g4 r0 = r14.f10648s
            com.google.android.gms.measurement.internal.l5 r0 = r0.f10651a
            com.google.android.gms.measurement.internal.i5 r0 = r0.mo11934a()
            com.google.android.gms.measurement.internal.d4 r1 = new com.google.android.gms.measurement.internal.d4
            java.lang.String r7 = r14.f10646q
            com.google.android.gms.measurement.internal.b4 r8 = r14.f10645p
            r11 = 0
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3863e4.run():void");
    }
}
