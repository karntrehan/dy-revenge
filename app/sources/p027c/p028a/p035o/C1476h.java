package p027c.p028a.p035o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p027c.p064i.p072j.C1906a0;
import p027c.p064i.p072j.C2008y;
import p027c.p064i.p072j.C2012z;

/* renamed from: c.a.o.h */
public class C1476h {

    /* renamed from: a */
    final ArrayList<C2008y> f4617a = new ArrayList<>();

    /* renamed from: b */
    private long f4618b = -1;

    /* renamed from: c */
    private Interpolator f4619c;

    /* renamed from: d */
    C2012z f4620d;

    /* renamed from: e */
    private boolean f4621e;

    /* renamed from: f */
    private final C1906a0 f4622f = new C1477a();

    /* renamed from: c.a.o.h$a */
    class C1477a extends C1906a0 {

        /* renamed from: a */
        private boolean f4623a = false;

        /* renamed from: b */
        private int f4624b = 0;

        C1477a() {
        }

        /* renamed from: b */
        public void mo324b(View view) {
            int i = this.f4624b + 1;
            this.f4624b = i;
            if (i == C1476h.this.f4617a.size()) {
                C2012z zVar = C1476h.this.f4620d;
                if (zVar != null) {
                    zVar.mo324b((View) null);
                }
                mo5498d();
            }
        }

        /* renamed from: c */
        public void mo325c(View view) {
            if (!this.f4623a) {
                this.f4623a = true;
                C2012z zVar = C1476h.this.f4620d;
                if (zVar != null) {
                    zVar.mo325c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5498d() {
            this.f4624b = 0;
            this.f4623a = false;
            C1476h.this.mo5491b();
        }
    }

    /* renamed from: a */
    public void mo5490a() {
        if (this.f4621e) {
            Iterator<C2008y> it = this.f4617a.iterator();
            while (it.hasNext()) {
                it.next().mo6697b();
            }
            this.f4621e = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5491b() {
        this.f4621e = false;
    }

    /* renamed from: c */
    public C1476h mo5492c(C2008y yVar) {
        if (!this.f4621e) {
            this.f4617a.add(yVar);
        }
        return this;
    }

    /* renamed from: d */
    public C1476h mo5493d(C2008y yVar, C2008y yVar2) {
        this.f4617a.add(yVar);
        yVar2.mo6702h(yVar.mo6698c());
        this.f4617a.add(yVar2);
        return this;
    }

    /* renamed from: e */
    public C1476h mo5494e(long j) {
        if (!this.f4621e) {
            this.f4618b = j;
        }
        return this;
    }

    /* renamed from: f */
    public C1476h mo5495f(Interpolator interpolator) {
        if (!this.f4621e) {
            this.f4619c = interpolator;
        }
        return this;
    }

    /* renamed from: g */
    public C1476h mo5496g(C2012z zVar) {
        if (!this.f4621e) {
            this.f4620d = zVar;
        }
        return this;
    }

    /* renamed from: h */
    public void mo5497h() {
        if (!this.f4621e) {
            Iterator<C2008y> it = this.f4617a.iterator();
            while (it.hasNext()) {
                C2008y next = it.next();
                long j = this.f4618b;
                if (j >= 0) {
                    next.mo6699d(j);
                }
                Interpolator interpolator = this.f4619c;
                if (interpolator != null) {
                    next.mo6700e(interpolator);
                }
                if (this.f4620d != null) {
                    next.mo6701f(this.f4622f);
                }
                next.mo6704j();
            }
            this.f4621e = true;
        }
    }
}
