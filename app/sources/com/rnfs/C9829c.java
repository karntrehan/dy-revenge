package com.rnfs;

import android.os.AsyncTask;
import android.os.Build;
import com.rnfs.C9824a;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.rnfs.c */
public class C9829c extends AsyncTask<C9824a, long[], C9828b> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C9824a f26332a;

    /* renamed from: b */
    private AtomicBoolean f26333b = new AtomicBoolean(false);

    /* renamed from: c */
    C9828b f26334c;

    /* renamed from: com.rnfs.c$a */
    class C9830a implements Runnable {
        C9830a() {
        }

        public void run() {
            try {
                C9829c cVar = C9829c.this;
                cVar.m33541d(cVar.f26332a, C9829c.this.f26334c);
                C9829c.this.f26332a.f26326h.mo24595a(C9829c.this.f26334c);
            } catch (Exception e) {
                C9829c cVar2 = C9829c.this;
                cVar2.f26334c.f26331c = e;
                cVar2.f26332a.f26326h.mo24595a(C9829c.this.f26334c);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0225  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m33541d(com.rnfs.C9824a r30, com.rnfs.C9828b r31) {
        /*
            r29 = this;
            r1 = r29
            r0 = r30
            r2 = r31
            r3 = 0
            java.net.URL r4 = r0.f26319a     // Catch:{ all -> 0x0215 }
            java.net.URLConnection r4 = r4.openConnection()     // Catch:{ all -> 0x0215 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ all -> 0x0215 }
            com.facebook.react.bridge.ReadableMap r5 = r0.f26321c     // Catch:{ all -> 0x0210 }
            com.facebook.react.bridge.ReadableMapKeySetIterator r5 = r5.keySetIterator()     // Catch:{ all -> 0x0210 }
        L_0x0015:
            boolean r6 = r5.hasNextKey()     // Catch:{ all -> 0x0210 }
            if (r6 == 0) goto L_0x0029
            java.lang.String r6 = r5.nextKey()     // Catch:{ all -> 0x0210 }
            com.facebook.react.bridge.ReadableMap r7 = r0.f26321c     // Catch:{ all -> 0x0210 }
            java.lang.String r7 = r7.getString(r6)     // Catch:{ all -> 0x0210 }
            r4.setRequestProperty(r6, r7)     // Catch:{ all -> 0x0210 }
            goto L_0x0015
        L_0x0029:
            int r5 = r0.f26325g     // Catch:{ all -> 0x0210 }
            r4.setConnectTimeout(r5)     // Catch:{ all -> 0x0210 }
            int r5 = r0.f26324f     // Catch:{ all -> 0x0210 }
            r4.setReadTimeout(r5)     // Catch:{ all -> 0x0210 }
            r4.connect()     // Catch:{ all -> 0x0210 }
            int r5 = r4.getResponseCode()     // Catch:{ all -> 0x0210 }
            long r6 = r1.m33542e(r4)     // Catch:{ all -> 0x0210 }
            r8 = 200(0xc8, float:2.8E-43)
            r10 = 0
            if (r5 == r8) goto L_0x0055
            r11 = 301(0x12d, float:4.22E-43)
            if (r5 == r11) goto L_0x0053
            r11 = 302(0x12e, float:4.23E-43)
            if (r5 == r11) goto L_0x0053
            r11 = 307(0x133, float:4.3E-43)
            if (r5 == r11) goto L_0x0053
            r11 = 308(0x134, float:4.32E-43)
            if (r5 != r11) goto L_0x0055
        L_0x0053:
            r11 = 1
            goto L_0x0056
        L_0x0055:
            r11 = 0
        L_0x0056:
            if (r11 == 0) goto L_0x0088
            java.lang.String r5 = "Location"
            java.lang.String r5 = r4.getHeaderField(r5)     // Catch:{ all -> 0x0210 }
            r4.disconnect()     // Catch:{ all -> 0x0210 }
            java.net.URL r6 = new java.net.URL     // Catch:{ all -> 0x0210 }
            r6.<init>(r5)     // Catch:{ all -> 0x0210 }
            java.net.URLConnection r5 = r6.openConnection()     // Catch:{ all -> 0x0210 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ all -> 0x0210 }
            r4 = 5000(0x1388, float:7.006E-42)
            r5.setConnectTimeout(r4)     // Catch:{ all -> 0x0082 }
            r5.connect()     // Catch:{ all -> 0x0082 }
            int r4 = r5.getResponseCode()     // Catch:{ all -> 0x0082 }
            long r6 = r1.m33542e(r5)     // Catch:{ all -> 0x0082 }
            r28 = r5
            r5 = r4
            r4 = r28
            goto L_0x0088
        L_0x0082:
            r0 = move-exception
            r22 = r3
            r10 = r5
            goto L_0x0219
        L_0x0088:
            if (r5 < r8) goto L_0x01f7
            r8 = 300(0x12c, float:4.2E-43)
            if (r5 >= r8) goto L_0x01f7
            java.util.Map r8 = r4.getHeaderFields()     // Catch:{ all -> 0x01f2 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x01f2 }
            r11.<init>()     // Catch:{ all -> 0x01f2 }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x01f2 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x01f2 }
        L_0x009f:
            boolean r12 = r8.hasNext()     // Catch:{ all -> 0x01f2 }
            if (r12 == 0) goto L_0x00c5
            java.lang.Object r12 = r8.next()     // Catch:{ all -> 0x0210 }
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12     // Catch:{ all -> 0x0210 }
            java.lang.Object r13 = r12.getKey()     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0210 }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x0210 }
            java.util.List r12 = (java.util.List) r12     // Catch:{ all -> 0x0210 }
            java.lang.Object r12 = r12.get(r10)     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0210 }
            if (r13 == 0) goto L_0x009f
            if (r12 == 0) goto L_0x009f
            r11.put(r13, r12)     // Catch:{ all -> 0x0210 }
            goto L_0x009f
        L_0x00c5:
            com.rnfs.a r8 = r1.f26332a     // Catch:{ all -> 0x01f2 }
            com.rnfs.a$a r8 = r8.f26327i     // Catch:{ all -> 0x01f2 }
            if (r8 == 0) goto L_0x00ce
            r8.mo24596a(r5, r6, r11)     // Catch:{ all -> 0x0210 }
        L_0x00ce:
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ all -> 0x01f2 }
            java.io.InputStream r11 = r4.getInputStream()     // Catch:{ all -> 0x01f2 }
            r12 = 8192(0x2000, float:1.14794E-41)
            r8.<init>(r11, r12)     // Catch:{ all -> 0x01f2 }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ all -> 0x01ed }
            java.io.File r13 = r0.f26320b     // Catch:{ all -> 0x01ed }
            r11.<init>(r13)     // Catch:{ all -> 0x01ed }
            byte[] r3 = new byte[r12]     // Catch:{ all -> 0x01e7 }
            com.rnfs.a r12 = r1.f26332a     // Catch:{ all -> 0x01e7 }
            com.rnfs.a$b r12 = r12.f26328j     // Catch:{ all -> 0x01e7 }
            if (r12 == 0) goto L_0x00ea
            r12 = 1
            goto L_0x00eb
        L_0x00ea:
            r12 = 0
        L_0x00eb:
            r15 = 0
            r13 = r15
            r19 = 0
        L_0x00f0:
            int r10 = r8.read(r3)     // Catch:{ all -> 0x01e7 }
            r9 = -1
            if (r10 == r9) goto L_0x01d9
            java.util.concurrent.atomic.AtomicBoolean r9 = r1.f26333b     // Catch:{ all -> 0x01e7 }
            boolean r9 = r9.get()     // Catch:{ all -> 0x01e7 }
            if (r9 != 0) goto L_0x01ce
            r22 = r8
            long r8 = (long) r10
            long r13 = r13 + r8
            if (r12 == 0) goto L_0x01b7
            int r8 = r0.f26322d     // Catch:{ all -> 0x01b4 }
            if (r8 <= 0) goto L_0x0135
            long r23 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01b4 }
            long r25 = r23 - r15
            int r8 = r0.f26322d     // Catch:{ all -> 0x01b4 }
            r27 = r10
            long r9 = (long) r8     // Catch:{ all -> 0x01b4 }
            int r8 = (r25 > r9 ? 1 : (r25 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x012a
            r8 = 1
            long[][] r9 = new long[r8][]     // Catch:{ all -> 0x01b4 }
            r10 = 2
            long[] r10 = new long[r10]     // Catch:{ all -> 0x01b4 }
            r15 = 0
            r10[r15] = r6     // Catch:{ all -> 0x01b4 }
            r10[r8] = r13     // Catch:{ all -> 0x01b4 }
            r9[r15] = r10     // Catch:{ all -> 0x01b4 }
            r1.publishProgress(r9)     // Catch:{ all -> 0x01b4 }
            r15 = r23
        L_0x012a:
            r10 = r4
            r23 = r5
            r4 = r27
            r0 = 1
            r5 = 0
            r17 = 0
            goto L_0x01c2
        L_0x0135:
            r27 = r10
            float r8 = r0.f26323e     // Catch:{ all -> 0x01b4 }
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x0156
            r8 = 1
            long[][] r9 = new long[r8][]     // Catch:{ all -> 0x01b4 }
            r10 = 2
            long[] r10 = new long[r10]     // Catch:{ all -> 0x01b4 }
            r21 = 0
            r10[r21] = r6     // Catch:{ all -> 0x01b4 }
            r10[r8] = r13     // Catch:{ all -> 0x01b4 }
            r9[r21] = r10     // Catch:{ all -> 0x01b4 }
            r1.publishProgress(r9)     // Catch:{ all -> 0x01b4 }
            r10 = r4
            r23 = r5
            r0 = 1
            r17 = 0
            goto L_0x01bf
        L_0x0156:
            double r8 = (double) r13
            r23 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r8 = r8 * r23
            r10 = r4
            r23 = r5
            double r4 = (double) r6
            double r8 = r8 / r4
            long r4 = java.lang.Math.round(r8)     // Catch:{ all -> 0x01e5 }
            double r4 = (double) r4     // Catch:{ all -> 0x01e5 }
            float r8 = r0.f26323e     // Catch:{ all -> 0x01e5 }
            double r8 = (double) r8     // Catch:{ all -> 0x01e5 }
            double r8 = r4 % r8
            r17 = 0
            int r24 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r24 != 0) goto L_0x01b2
            int r8 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r8 != 0) goto L_0x0178
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01b2
        L_0x0178:
            java.lang.String r8 = "Downloader"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01e5 }
            r9.<init>()     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = "EMIT: "
            r9.append(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x01e5 }
            r9.append(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = ", TOTAL:"
            r9.append(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x01e5 }
            r9.append(r0)     // Catch:{ all -> 0x01e5 }
            java.lang.String r0 = r9.toString()     // Catch:{ all -> 0x01e5 }
            android.util.Log.d(r8, r0)     // Catch:{ all -> 0x01e5 }
            r0 = 1
            long[][] r8 = new long[r0][]     // Catch:{ all -> 0x01e5 }
            r9 = 2
            long[] r9 = new long[r9]     // Catch:{ all -> 0x01e5 }
            r19 = 0
            r9[r19] = r6     // Catch:{ all -> 0x01e5 }
            r9[r0] = r13     // Catch:{ all -> 0x01e5 }
            r8[r19] = r9     // Catch:{ all -> 0x01e5 }
            r1.publishProgress(r8)     // Catch:{ all -> 0x01e5 }
            r19 = r4
            goto L_0x01bf
        L_0x01b2:
            r0 = 1
            goto L_0x01bf
        L_0x01b4:
            r0 = move-exception
            r10 = r4
            goto L_0x01eb
        L_0x01b7:
            r23 = r5
            r27 = r10
            r0 = 1
            r17 = 0
            r10 = r4
        L_0x01bf:
            r4 = r27
            r5 = 0
        L_0x01c2:
            r11.write(r3, r5, r4)     // Catch:{ all -> 0x01e5 }
            r0 = r30
            r4 = r10
            r8 = r22
            r5 = r23
            goto L_0x00f0
        L_0x01ce:
            r10 = r4
            r22 = r8
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x01e5 }
            java.lang.String r2 = "Download has been aborted"
            r0.<init>(r2)     // Catch:{ all -> 0x01e5 }
            throw r0     // Catch:{ all -> 0x01e5 }
        L_0x01d9:
            r10 = r4
            r23 = r5
            r22 = r8
            r11.flush()     // Catch:{ all -> 0x01e5 }
            r2.f26330b = r13     // Catch:{ all -> 0x01e5 }
            r3 = r11
            goto L_0x01fc
        L_0x01e5:
            r0 = move-exception
            goto L_0x01eb
        L_0x01e7:
            r0 = move-exception
            r10 = r4
            r22 = r8
        L_0x01eb:
            r3 = r11
            goto L_0x0219
        L_0x01ed:
            r0 = move-exception
            r10 = r4
            r22 = r8
            goto L_0x0219
        L_0x01f2:
            r0 = move-exception
            r10 = r4
            r22 = r3
            goto L_0x0219
        L_0x01f7:
            r10 = r4
            r23 = r5
            r22 = r3
        L_0x01fc:
            r4 = r23
            r2.f26329a = r4     // Catch:{ all -> 0x020e }
            if (r3 == 0) goto L_0x0205
            r3.close()
        L_0x0205:
            if (r22 == 0) goto L_0x020a
            r22.close()
        L_0x020a:
            r10.disconnect()
            return
        L_0x020e:
            r0 = move-exception
            goto L_0x0219
        L_0x0210:
            r0 = move-exception
            r22 = r3
            r10 = r4
            goto L_0x0219
        L_0x0215:
            r0 = move-exception
            r10 = r3
            r22 = r10
        L_0x0219:
            if (r3 == 0) goto L_0x021e
            r3.close()
        L_0x021e:
            if (r22 == 0) goto L_0x0223
            r22.close()
        L_0x0223:
            if (r10 == 0) goto L_0x0228
            r10.disconnect()
        L_0x0228:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.C9829c.m33541d(com.rnfs.a, com.rnfs.b):void");
    }

    /* renamed from: e */
    private long m33542e(HttpURLConnection httpURLConnection) {
        return Build.VERSION.SDK_INT >= 24 ? httpURLConnection.getContentLengthLong() : (long) httpURLConnection.getContentLength();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C9828b doInBackground(C9824a... aVarArr) {
        this.f26332a = aVarArr[0];
        this.f26334c = new C9828b();
        new Thread(new C9830a()).start();
        return this.f26334c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void onProgressUpdate(long[]... jArr) {
        super.onProgressUpdate(jArr);
        C9824a.C9826b bVar = this.f26332a.f26328j;
        if (bVar != null) {
            bVar.mo24597a(jArr[0][0], jArr[0][1]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo24608g() {
        this.f26333b.set(true);
    }
}
