package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.C2317b;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.C2503k0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p174e.p247e.p253d.p257d.C6058j;
import p174e.p247e.p253d.p264k.C6111f;
import p174e.p247e.p294k.p307k.C6369d;

/* renamed from: com.facebook.imagepipeline.producers.x */
public class C2555x extends C2465c<C2558c> {

    /* renamed from: a */
    private int f7529a;

    /* renamed from: b */
    private String f7530b;

    /* renamed from: c */
    private final Map<String, String> f7531c;

    /* renamed from: d */
    private final ExecutorService f7532d;

    /* renamed from: e */
    private final C2317b f7533e;

    /* renamed from: com.facebook.imagepipeline.producers.x$a */
    class C2556a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C2558c f7534f;

        /* renamed from: o */
        final /* synthetic */ C2503k0.C2504a f7535o;

        C2556a(C2558c cVar, C2503k0.C2504a aVar) {
            this.f7534f = cVar;
            this.f7535o = aVar;
        }

        public void run() {
            C2555x.this.mo8357j(this.f7534f, this.f7535o);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.x$b */
    class C2557b extends C2472e {

        /* renamed from: a */
        final /* synthetic */ Future f7537a;

        /* renamed from: b */
        final /* synthetic */ C2503k0.C2504a f7538b;

        C2557b(Future future, C2503k0.C2504a aVar) {
            this.f7537a = future;
            this.f7538b = aVar;
        }

        /* renamed from: a */
        public void mo8208a() {
            if (this.f7537a.cancel(false)) {
                this.f7538b.mo8298a();
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.x$c */
    public static class C2558c extends C2553w {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public long f7540f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f7541g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public long f7542h;

        public C2558c(C2505l<C6369d> lVar, C2531p0 p0Var) {
            super(lVar, p0Var);
        }
    }

    public C2555x(int i) {
        this((String) null, (Map<String, String>) null, RealtimeSinceBootClock.get());
        this.f7529a = i;
    }

    C2555x(String str, Map<String, String> map, C2317b bVar) {
        this.f7532d = Executors.newFixedThreadPool(3);
        this.f7533e = bVar;
        this.f7531c = map;
        this.f7530b = str;
    }

    /* renamed from: g */
    private HttpURLConnection m10655g(Uri uri, int i) {
        HttpURLConnection o = m10659o(uri);
        String str = this.f7530b;
        if (str != null) {
            o.setRequestProperty("User-Agent", str);
        }
        Map<String, String> map = this.f7531c;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                o.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
        o.setConnectTimeout(this.f7529a);
        int responseCode = o.getResponseCode();
        if (m10658m(responseCode)) {
            return o;
        }
        if (m10657l(responseCode)) {
            String headerField = o.getHeaderField("Location");
            o.disconnect();
            Uri parse = headerField == null ? null : Uri.parse(headerField);
            String scheme = uri.getScheme();
            if (i > 0 && parse != null && !C6058j.m22825a(parse.getScheme(), scheme)) {
                return m10655g(parse, i - 1);
            }
            throw new IOException(i == 0 ? m10656h("URL %s follows too many redirects", uri.toString()) : m10656h("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        o.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", new Object[]{uri.toString(), Integer.valueOf(responseCode)}));
    }

    /* renamed from: h */
    private static String m10656h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    /* renamed from: l */
    private static boolean m10657l(int i) {
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: m */
    private static boolean m10658m(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: o */
    static HttpURLConnection m10659o(Uri uri) {
        return (HttpURLConnection) C6111f.m23010n(uri).openConnection();
    }

    /* renamed from: f */
    public C2558c mo8305e(C2505l<C6369d> lVar, C2531p0 p0Var) {
        return new C2558c(lVar, p0Var);
    }

    /* renamed from: i */
    public void mo8304d(C2558c cVar, C2503k0.C2504a aVar) {
        long unused = cVar.f7540f = this.f7533e.now();
        cVar.mo8344b().mo8241g(new C2557b(this.f7532d.submit(new C2556a(cVar, aVar)), aVar));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* access modifiers changed from: package-private */
    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v7 ?
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.collectCodeVars(ProcessVariables.java:122)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:45)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[SYNTHETIC, Splitter:B:20:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041 A[SYNTHETIC, Splitter:B:27:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    public void mo8357j(com.facebook.imagepipeline.producers.C2555x.C2558c r5, com.facebook.imagepipeline.producers.C2503k0.C2504a r6) {
        /*
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r5.mo8349g()     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            r2 = 5
            java.net.HttpURLConnection r1 = r4.m10655g(r1, r2)     // Catch:{ IOException -> 0x002c, all -> 0x0029 }
            com.facebook.common.time.b r2 = r4.f7533e     // Catch:{ IOException -> 0x0027 }
            long r2 = r2.now()     // Catch:{ IOException -> 0x0027 }
            long unused = r5.f7541g = r2     // Catch:{ IOException -> 0x0027 }
            if (r1 == 0) goto L_0x001d
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ IOException -> 0x0027 }
            r5 = -1
            r6.mo8300c(r0, r5)     // Catch:{ IOException -> 0x0027 }
        L_0x001d:
            if (r0 == 0) goto L_0x0024
            r0.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0024
        L_0x0023:
        L_0x0024:
            if (r1 == 0) goto L_0x003d
            goto L_0x003a
        L_0x0027:
            r5 = move-exception
            goto L_0x002e
        L_0x0029:
            r5 = move-exception
            r1 = r0
            goto L_0x003f
        L_0x002c:
            r5 = move-exception
            r1 = r0
        L_0x002e:
            r6.mo8299b(r5)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0038
            r0.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0038
        L_0x0037:
        L_0x0038:
            if (r1 == 0) goto L_0x003d
        L_0x003a:
            r1.disconnect()
        L_0x003d:
            return
        L_0x003e:
            r5 = move-exception
        L_0x003f:
            if (r0 == 0) goto L_0x0046
            r0.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0046
        L_0x0045:
        L_0x0046:
            if (r1 == 0) goto L_0x004b
            r1.disconnect()
        L_0x004b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C2555x.mo8357j(com.facebook.imagepipeline.producers.x$c, com.facebook.imagepipeline.producers.k0$a):void");
    }

    /* renamed from: k */
    public Map<String, String> mo8303c(C2558c cVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f7541g - cVar.f7540f));
        hashMap.put("fetch_time", Long.toString(cVar.f7542h - cVar.f7541g));
        hashMap.put("total_time", Long.toString(cVar.f7542h - cVar.f7540f));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    /* renamed from: n */
    public void mo8302a(C2558c cVar, int i) {
        long unused = cVar.f7542h = this.f7533e.now();
    }
}
