package p027c.p064i.p070h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.util.C1170a;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.face.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p027c.p060f.C1794e;
import p027c.p060f.C1801g;
import p027c.p064i.p065d.C1832d;
import p027c.p064i.p070h.C1879f;

/* renamed from: c.i.h.e */
class C1873e {

    /* renamed from: a */
    static final C1794e<String, Typeface> f5520a = new C1794e<>(16);

    /* renamed from: b */
    private static final ExecutorService f5521b = C1883g.m7926a("fonts-androidx", 10, ModuleDescriptor.MODULE_VERSION);

    /* renamed from: c */
    static final Object f5522c = new Object();

    /* renamed from: d */
    static final C1801g<String, ArrayList<C1170a<C1878e>>> f5523d = new C1801g<>();

    /* renamed from: c.i.h.e$a */
    class C1874a implements Callable<C1878e> {

        /* renamed from: a */
        final /* synthetic */ String f5524a;

        /* renamed from: b */
        final /* synthetic */ Context f5525b;

        /* renamed from: c */
        final /* synthetic */ C1872d f5526c;

        /* renamed from: d */
        final /* synthetic */ int f5527d;

        C1874a(String str, Context context, C1872d dVar, int i) {
            this.f5524a = str;
            this.f5525b = context;
            this.f5526c = dVar;
            this.f5527d = i;
        }

        /* renamed from: a */
        public C1878e call() {
            return C1873e.m7904c(this.f5524a, this.f5525b, this.f5526c, this.f5527d);
        }
    }

    /* renamed from: c.i.h.e$b */
    class C1875b implements C1170a<C1878e> {

        /* renamed from: a */
        final /* synthetic */ C1866a f5528a;

        C1875b(C1866a aVar) {
            this.f5528a = aVar;
        }

        /* renamed from: b */
        public void mo2687a(C1878e eVar) {
            this.f5528a.mo6372b(eVar);
        }
    }

    /* renamed from: c.i.h.e$c */
    class C1876c implements Callable<C1878e> {

        /* renamed from: a */
        final /* synthetic */ String f5529a;

        /* renamed from: b */
        final /* synthetic */ Context f5530b;

        /* renamed from: c */
        final /* synthetic */ C1872d f5531c;

        /* renamed from: d */
        final /* synthetic */ int f5532d;

        C1876c(String str, Context context, C1872d dVar, int i) {
            this.f5529a = str;
            this.f5530b = context;
            this.f5531c = dVar;
            this.f5532d = i;
        }

        /* renamed from: a */
        public C1878e call() {
            return C1873e.m7904c(this.f5529a, this.f5530b, this.f5531c, this.f5532d);
        }
    }

    /* renamed from: c.i.h.e$d */
    class C1877d implements C1170a<C1878e> {

        /* renamed from: a */
        final /* synthetic */ String f5533a;

        C1877d(String str) {
            this.f5533a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((androidx.core.util.C1170a) r2.get(r0)).mo2687a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo2687a(p027c.p064i.p070h.C1873e.C1878e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p027c.p064i.p070h.C1873e.f5522c
                monitor-enter(r0)
                c.f.g<java.lang.String, java.util.ArrayList<androidx.core.util.a<c.i.h.e$e>>> r1 = p027c.p064i.p070h.C1873e.f5523d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f5533a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f5533a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                androidx.core.util.a r1 = (androidx.core.util.C1170a) r1
                r1.mo2687a(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p064i.p070h.C1873e.C1877d.mo2687a(c.i.h.e$e):void");
        }
    }

    /* renamed from: c.i.h.e$e */
    static final class C1878e {

        /* renamed from: a */
        final Typeface f5534a;

        /* renamed from: b */
        final int f5535b;

        C1878e(int i) {
            this.f5534a = null;
            this.f5535b = i;
        }

        @SuppressLint({"WrongConstant"})
        C1878e(Typeface typeface) {
            this.f5534a = typeface;
            this.f5535b = 0;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean mo6390a() {
            return this.f5535b == 0;
        }
    }

    /* renamed from: a */
    private static String m7902a(C1872d dVar, int i) {
        return dVar.mo6379d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    private static int m7903b(C1879f.C1880a aVar) {
        int i = 1;
        if (aVar.mo6392c() != 0) {
            return aVar.mo6392c() != 1 ? -3 : -2;
        }
        C1879f.C1881b[] b = aVar.mo6391b();
        if (!(b == null || b.length == 0)) {
            int length = b.length;
            i = 0;
            int i2 = 0;
            while (i2 < length) {
                int b2 = b[i2].mo6393b();
                if (b2 == 0) {
                    i2++;
                } else if (b2 < 0) {
                    return -3;
                } else {
                    return b2;
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    static C1878e m7904c(String str, Context context, C1872d dVar, int i) {
        C1794e<String, Typeface> eVar = f5520a;
        Typeface c = eVar.mo6177c(str);
        if (c != null) {
            return new C1878e(c);
        }
        try {
            C1879f.C1880a d = C1870c.m7891d(context, dVar, (CancellationSignal) null);
            int b = m7903b(d);
            if (b != 0) {
                return new C1878e(b);
            }
            Typeface b2 = C1832d.m7781b(context, (CancellationSignal) null, d.mo6391b(), i);
            if (b2 == null) {
                return new C1878e(-3);
            }
            eVar.mo6178d(str, b2);
            return new C1878e(b2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C1878e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r9 = new p027c.p064i.p070h.C1873e.C1876c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r8 = f5521b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        p027c.p064i.p070h.C1883g.m7927b(r8, r9, new p027c.p064i.p070h.C1873e.C1877d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface m7905d(android.content.Context r5, p027c.p064i.p070h.C1872d r6, int r7, java.util.concurrent.Executor r8, p027c.p064i.p070h.C1866a r9) {
        /*
            java.lang.String r0 = m7902a(r6, r7)
            c.f.e<java.lang.String, android.graphics.Typeface> r1 = f5520a
            java.lang.Object r1 = r1.mo6177c(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            c.i.h.e$e r5 = new c.i.h.e$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.mo6372b(r5)
            return r1
        L_0x0017:
            c.i.h.e$b r1 = new c.i.h.e$b
            r1.<init>(r9)
            java.lang.Object r9 = f5522c
            monitor-enter(r9)
            c.f.g<java.lang.String, java.util.ArrayList<androidx.core.util.a<c.i.h.e$e>>> r2 = f5523d     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x004d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x004d }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3.add(r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            return r4
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            r3.add(r1)     // Catch:{ all -> 0x004d }
            r2.put(r0, r3)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            c.i.h.e$c r9 = new c.i.h.e$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0044
            java.util.concurrent.ExecutorService r8 = f5521b
        L_0x0044:
            c.i.h.e$d r5 = new c.i.h.e$d
            r5.<init>(r0)
            p027c.p064i.p070h.C1883g.m7927b(r8, r9, r5)
            return r4
        L_0x004d:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p064i.p070h.C1873e.m7905d(android.content.Context, c.i.h.d, int, java.util.concurrent.Executor, c.i.h.a):android.graphics.Typeface");
    }

    /* renamed from: e */
    static Typeface m7906e(Context context, C1872d dVar, C1866a aVar, int i, int i2) {
        String a = m7902a(dVar, i);
        Typeface c = f5520a.mo6177c(a);
        if (c != null) {
            aVar.mo6372b(new C1878e(c));
            return c;
        } else if (i2 == -1) {
            C1878e c2 = m7904c(a, context, dVar, i);
            aVar.mo6372b(c2);
            return c2.f5534a;
        } else {
            try {
                C1878e eVar = (C1878e) C1883g.m7928c(f5521b, new C1874a(a, context, dVar, i), i2);
                aVar.mo6372b(eVar);
                return eVar.f5534a;
            } catch (InterruptedException unused) {
                aVar.mo6372b(new C1878e(-3));
                return null;
            }
        }
    }
}
