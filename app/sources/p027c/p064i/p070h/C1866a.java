package p027c.p064i.p070h;

import android.graphics.Typeface;
import android.os.Handler;
import p027c.p064i.p070h.C1873e;
import p027c.p064i.p070h.C1879f;

/* renamed from: c.i.h.a */
class C1866a {

    /* renamed from: a */
    private final C1879f.C1882c f5505a;

    /* renamed from: b */
    private final Handler f5506b;

    /* renamed from: c.i.h.a$a */
    class C1867a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1879f.C1882c f5507f;

        /* renamed from: o */
        final /* synthetic */ Typeface f5508o;

        C1867a(C1879f.C1882c cVar, Typeface typeface) {
            this.f5507f = cVar;
            this.f5508o = typeface;
        }

        public void run() {
            this.f5507f.mo6328b(this.f5508o);
        }
    }

    /* renamed from: c.i.h.a$b */
    class C1868b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1879f.C1882c f5510f;

        /* renamed from: o */
        final /* synthetic */ int f5511o;

        C1868b(C1879f.C1882c cVar, int i) {
            this.f5510f = cVar;
            this.f5511o = i;
        }

        public void run() {
            this.f5510f.mo6327a(this.f5511o);
        }
    }

    C1866a(C1879f.C1882c cVar, Handler handler) {
        this.f5505a = cVar;
        this.f5506b = handler;
    }

    /* renamed from: a */
    private void m7884a(int i) {
        this.f5506b.post(new C1868b(this.f5505a, i));
    }

    /* renamed from: c */
    private void m7885c(Typeface typeface) {
        this.f5506b.post(new C1867a(this.f5505a, typeface));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo6372b(C1873e.C1878e eVar) {
        if (eVar.mo6390a()) {
            m7885c(eVar.f5534a);
        } else {
            m7884a(eVar.f5535b);
        }
    }
}
