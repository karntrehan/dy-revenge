package p174e.p247e.p294k.p307k;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.facebook.imageutils.C2570c;
import com.facebook.imageutils.C2575f;
import com.facebook.imageutils.HeifExifUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;
import okhttp3.HttpUrl;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6065n;
import p174e.p247e.p253d.p260g.C6082g;
import p174e.p247e.p253d.p260g.C6085i;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p293j.C6252b;
import p174e.p247e.p293j.C6253c;
import p174e.p247e.p293j.C6255d;
import p174e.p247e.p294k.p301e.C6312a;

/* renamed from: e.e.k.k.d */
public class C6369d implements Closeable {

    /* renamed from: f */
    private static boolean f17754f;

    /* renamed from: o */
    private final C6088a<C6082g> f17755o;

    /* renamed from: p */
    private final C6065n<FileInputStream> f17756p;

    /* renamed from: q */
    private C6253c f17757q;

    /* renamed from: r */
    private int f17758r;

    /* renamed from: s */
    private int f17759s;

    /* renamed from: t */
    private int f17760t;

    /* renamed from: u */
    private int f17761u;

    /* renamed from: v */
    private int f17762v;

    /* renamed from: w */
    private int f17763w;

    /* renamed from: x */
    private C6312a f17764x;

    /* renamed from: y */
    private ColorSpace f17765y;

    /* renamed from: z */
    private boolean f17766z;

    public C6369d(C6065n<FileInputStream> nVar) {
        this.f17757q = C6253c.f17330a;
        this.f17758r = -1;
        this.f17759s = 0;
        this.f17760t = -1;
        this.f17761u = -1;
        this.f17762v = 1;
        this.f17763w = -1;
        C6062k.m22839g(nVar);
        this.f17755o = null;
        this.f17756p = nVar;
    }

    public C6369d(C6065n<FileInputStream> nVar, int i) {
        this(nVar);
        this.f17763w = i;
    }

    public C6369d(C6088a<C6082g> aVar) {
        this.f17757q = C6253c.f17330a;
        this.f17758r = -1;
        this.f17759s = 0;
        this.f17760t = -1;
        this.f17761u = -1;
        this.f17762v = 1;
        this.f17763w = -1;
        C6062k.m22834b(Boolean.valueOf(C6088a.m22950z0(aVar)));
        this.f17755o = aVar.clone();
        this.f17756p = null;
    }

    /* renamed from: B0 */
    private void m24305B0() {
        if (this.f17760t < 0 || this.f17761u < 0) {
            mo18880A0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[SYNTHETIC, Splitter:B:15:0x0034] */
    /* renamed from: C0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imageutils.C2569b m24306C0() {
        /*
            r4 = this;
            java.io.InputStream r0 = r4.mo18892X()     // Catch:{ all -> 0x0030 }
            com.facebook.imageutils.b r1 = com.facebook.imageutils.C2567a.m10702b(r0)     // Catch:{ all -> 0x002e }
            android.graphics.ColorSpace r2 = r1.mo8365a()     // Catch:{ all -> 0x002e }
            r4.f17765y = r2     // Catch:{ all -> 0x002e }
            android.util.Pair r2 = r1.mo8366b()     // Catch:{ all -> 0x002e }
            if (r2 == 0) goto L_0x0028
            java.lang.Object r3 = r2.first     // Catch:{ all -> 0x002e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x002e }
            int r3 = r3.intValue()     // Catch:{ all -> 0x002e }
            r4.f17760t = r3     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x002e }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x002e }
            int r2 = r2.intValue()     // Catch:{ all -> 0x002e }
            r4.f17761u = r2     // Catch:{ all -> 0x002e }
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            return r1
        L_0x002e:
            r1 = move-exception
            goto L_0x0032
        L_0x0030:
            r1 = move-exception
            r0 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0037
            r0.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p294k.p307k.C6369d.m24306C0():com.facebook.imageutils.b");
    }

    /* renamed from: D0 */
    private Pair<Integer, Integer> m24307D0() {
        Pair<Integer, Integer> g = C2575f.m10725g(mo18892X());
        if (g != null) {
            this.f17760t = ((Integer) g.first).intValue();
            this.f17761u = ((Integer) g.second).intValue();
        }
        return g;
    }

    /* renamed from: b */
    public static C6369d m24308b(C6369d dVar) {
        if (dVar != null) {
            return dVar.mo18893a();
        }
        return null;
    }

    /* renamed from: h */
    public static void m24309h(C6369d dVar) {
        if (dVar != null) {
            dVar.close();
        }
    }

    /* renamed from: v0 */
    private void m24310v0() {
        int i;
        int i2;
        C6253c c = C6255d.m23714c(mo18892X());
        this.f17757q = c;
        Pair<Integer, Integer> D0 = C6252b.m23709b(c) ? m24307D0() : m24306C0().mo8366b();
        if (c == C6252b.f17318a && this.f17758r == -1) {
            if (D0 != null) {
                i2 = C2570c.m10709b(mo18892X());
            } else {
                return;
            }
        } else if (c == C6252b.f17328k && this.f17758r == -1) {
            i2 = HeifExifUtil.m10699a(mo18892X());
        } else if (this.f17758r == -1) {
            i = 0;
            this.f17758r = i;
        } else {
            return;
        }
        this.f17759s = i2;
        i = C2570c.m10708a(i2);
        this.f17758r = i;
    }

    /* renamed from: x0 */
    public static boolean m24311x0(C6369d dVar) {
        return dVar.f17758r >= 0 && dVar.f17760t >= 0 && dVar.f17761u >= 0;
    }

    /* renamed from: z0 */
    public static boolean m24312z0(C6369d dVar) {
        return dVar != null && dVar.mo18905y0();
    }

    /* renamed from: A */
    public C6312a mo18879A() {
        return this.f17764x;
    }

    /* renamed from: A0 */
    public void mo18880A0() {
        if (!f17754f) {
            m24310v0();
        } else if (!this.f17766z) {
            m24310v0();
            this.f17766z = true;
        }
    }

    /* renamed from: E */
    public ColorSpace mo18881E() {
        m24305B0();
        return this.f17765y;
    }

    /* renamed from: E0 */
    public void mo18882E0(C6312a aVar) {
        this.f17764x = aVar;
    }

    /* renamed from: F0 */
    public void mo18883F0(int i) {
        this.f17759s = i;
    }

    /* renamed from: G0 */
    public void mo18884G0(int i) {
        this.f17761u = i;
    }

    /* renamed from: H0 */
    public void mo18885H0(C6253c cVar) {
        this.f17757q = cVar;
    }

    /* renamed from: I */
    public int mo18886I() {
        m24305B0();
        return this.f17759s;
    }

    /* renamed from: I0 */
    public void mo18887I0(int i) {
        this.f17758r = i;
    }

    /* renamed from: J0 */
    public void mo18888J0(int i) {
        this.f17762v = i;
    }

    /* renamed from: K0 */
    public void mo18889K0(int i) {
        this.f17760t = i;
    }

    /* renamed from: L */
    public String mo18890L(int i) {
        C6088a<C6082g> r = mo18901r();
        if (r == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        int min = Math.min(mo18902s0(), i);
        byte[] bArr = new byte[min];
        try {
            C6082g w0 = r.mo18082w0();
            if (w0 == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            w0.mo8161k(0, bArr, 0, min);
            r.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i2 = 0; i2 < min; i2++) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(bArr[i2])}));
            }
            return sb.toString();
        } finally {
            r.close();
        }
    }

    /* renamed from: W */
    public C6253c mo18891W() {
        m24305B0();
        return this.f17757q;
    }

    /* renamed from: X */
    public InputStream mo18892X() {
        C6065n<FileInputStream> nVar = this.f17756p;
        if (nVar != null) {
            return nVar.get();
        }
        C6088a<C6082g> u0 = C6088a.m22948u0(this.f17755o);
        if (u0 == null) {
            return null;
        }
        try {
            return new C6085i(u0.mo18082w0());
        } finally {
            C6088a.m22949v0(u0);
        }
    }

    /* renamed from: a */
    public C6369d mo18893a() {
        C6369d dVar;
        C6065n<FileInputStream> nVar = this.f17756p;
        if (nVar != null) {
            dVar = new C6369d(nVar, this.f17763w);
        } else {
            C6088a<C6082g> u0 = C6088a.m22948u0(this.f17755o);
            if (u0 == null) {
                dVar = null;
            } else {
                try {
                    dVar = new C6369d(u0);
                } catch (Throwable th) {
                    C6088a.m22949v0(u0);
                    throw th;
                }
            }
            C6088a.m22949v0(u0);
        }
        if (dVar != null) {
            dVar.mo18900o(this);
        }
        return dVar;
    }

    /* renamed from: c */
    public int mo18894c() {
        m24305B0();
        return this.f17761u;
    }

    public void close() {
        C6088a.m22949v0(this.f17755o);
    }

    /* renamed from: e */
    public int mo18896e() {
        m24305B0();
        return this.f17760t;
    }

    /* renamed from: e0 */
    public InputStream mo18897e0() {
        return (InputStream) C6062k.m22839g(mo18892X());
    }

    /* renamed from: i0 */
    public int mo18898i0() {
        m24305B0();
        return this.f17758r;
    }

    /* renamed from: n0 */
    public int mo18899n0() {
        return this.f17762v;
    }

    /* renamed from: o */
    public void mo18900o(C6369d dVar) {
        this.f17757q = dVar.mo18891W();
        this.f17760t = dVar.mo18896e();
        this.f17761u = dVar.mo18894c();
        this.f17758r = dVar.mo18898i0();
        this.f17759s = dVar.mo18886I();
        this.f17762v = dVar.mo18899n0();
        this.f17763w = dVar.mo18902s0();
        this.f17764x = dVar.mo18879A();
        this.f17765y = dVar.mo18881E();
        this.f17766z = dVar.mo18903u0();
    }

    /* renamed from: r */
    public C6088a<C6082g> mo18901r() {
        return C6088a.m22948u0(this.f17755o);
    }

    /* renamed from: s0 */
    public int mo18902s0() {
        C6088a<C6082g> aVar = this.f17755o;
        return (aVar == null || aVar.mo18082w0() == null) ? this.f17763w : this.f17755o.mo18082w0().size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public boolean mo18903u0() {
        return this.f17766z;
    }

    /* renamed from: w0 */
    public boolean mo18904w0(int i) {
        C6253c cVar = this.f17757q;
        if ((cVar != C6252b.f17318a && cVar != C6252b.f17329l) || this.f17756p != null) {
            return true;
        }
        C6062k.m22839g(this.f17755o);
        C6082g w0 = this.f17755o.mo18082w0();
        return w0.mo8160j(i + -2) == -1 && w0.mo8160j(i - 1) == -39;
    }

    /* renamed from: y0 */
    public synchronized boolean mo18905y0() {
        return C6088a.m22950z0(this.f17755o) || this.f17756p != null;
    }
}
