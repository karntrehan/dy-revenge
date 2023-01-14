package p174e.p247e.p249b.p251b;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import p174e.p247e.p248a.C5992a;
import p174e.p247e.p249b.p250a.C5994a;
import p174e.p247e.p249b.p251b.C6019d;
import p174e.p247e.p253d.p256c.C6042a;
import p174e.p247e.p253d.p256c.C6044c;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p257d.C6065n;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: e.e.b.b.f */
public class C6026f implements C6019d {

    /* renamed from: a */
    private static final Class<?> f16668a = C6026f.class;

    /* renamed from: b */
    private final int f16669b;

    /* renamed from: c */
    private final C6065n<File> f16670c;

    /* renamed from: d */
    private final String f16671d;

    /* renamed from: e */
    private final C5994a f16672e;

    /* renamed from: f */
    volatile C6027a f16673f = new C6027a((File) null, (C6019d) null);

    /* renamed from: e.e.b.b.f$a */
    static class C6027a {

        /* renamed from: a */
        public final C6019d f16674a;

        /* renamed from: b */
        public final File f16675b;

        C6027a(File file, C6019d dVar) {
            this.f16674a = dVar;
            this.f16675b = file;
        }
    }

    public C6026f(int i, C6065n<File> nVar, String str, C5994a aVar) {
        this.f16669b = i;
        this.f16672e = aVar;
        this.f16670c = nVar;
        this.f16671d = str;
    }

    /* renamed from: k */
    private void m22756k() {
        File file = new File(this.f16670c.get(), this.f16671d);
        mo17987j(file);
        this.f16673f = new C6027a(file, new C6006a(file, this.f16669b, this.f16672e));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.f16675b;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m22757n() {
        /*
            r2 = this;
            e.e.b.b.f$a r0 = r2.f16673f
            e.e.b.b.d r1 = r0.f16674a
            if (r1 == 0) goto L_0x0013
            java.io.File r0 = r0.f16675b
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = 0
            goto L_0x0014
        L_0x0013:
            r0 = 1
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p249b.p251b.C6026f.m22757n():boolean");
    }

    /* renamed from: a */
    public void mo17929a() {
        mo17989m().mo17929a();
    }

    /* renamed from: b */
    public boolean mo17930b() {
        try {
            return mo17989m().mo17930b();
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: c */
    public void mo17931c() {
        try {
            mo17989m().mo17931c();
        } catch (IOException e) {
            C6071a.m22872f(f16668a, "purgeUnexpectedResources", e);
        }
    }

    /* renamed from: d */
    public C6019d.C6021b mo17932d(String str, Object obj) {
        return mo17989m().mo17932d(str, obj);
    }

    /* renamed from: e */
    public boolean mo17933e(String str, Object obj) {
        return mo17989m().mo17933e(str, obj);
    }

    /* renamed from: f */
    public boolean mo17934f(String str, Object obj) {
        return mo17989m().mo17934f(str, obj);
    }

    /* renamed from: g */
    public C5992a mo17935g(String str, Object obj) {
        return mo17989m().mo17935g(str, obj);
    }

    /* renamed from: h */
    public Collection<C6019d.C6020a> mo17936h() {
        return mo17989m().mo17936h();
    }

    /* renamed from: i */
    public long mo17937i(C6019d.C6020a aVar) {
        return mo17989m().mo17937i(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo17987j(File file) {
        try {
            C6044c.m22812a(file);
            C6071a.m22867a(f16668a, "Created cache directory %s", file.getAbsolutePath());
        } catch (C6044c.C6045a e) {
            this.f16672e.mo17909a(C5994a.C5995a.WRITE_CREATE_DIR, f16668a, "createRootDirectoryIfNecessary", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo17988l() {
        if (this.f16673f.f16674a != null && this.f16673f.f16675b != null) {
            C6042a.m22807b(this.f16673f.f16675b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized C6019d mo17989m() {
        if (m22757n()) {
            mo17988l();
            m22756k();
        }
        return (C6019d) C6062k.m22839g(this.f16673f.f16674a);
    }

    public long remove(String str) {
        return mo17989m().remove(str);
    }
}
