package p174e.p247e.p294k.p303g;

import com.facebook.imagepipeline.producers.C2459b;
import com.facebook.imagepipeline.producers.C2505l;
import com.facebook.imagepipeline.producers.C2529o0;
import com.facebook.imagepipeline.producers.C2531p0;
import com.facebook.imagepipeline.producers.C2552v0;
import java.util.Map;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p266e.C6116a;
import p174e.p247e.p294k.p309m.C6380d;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.k.g.a */
public abstract class C6347a<T> extends C6116a<T> {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2552v0 f17728i;

    /* renamed from: j */
    private final C6380d f17729j;

    /* renamed from: e.e.k.g.a$a */
    class C6348a extends C2459b<T> {
        C6348a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo8224g() {
            C6347a.this.m24238E();
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo8225h(Throwable th) {
            C6347a.this.m24239F(th);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo8209i(T t, int i) {
            C6347a aVar = C6347a.this;
            aVar.mo18848G(t, i, aVar.f17728i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: j */
        public void mo8226j(float f) {
            boolean unused = C6347a.this.mo18131t(f);
        }
    }

    protected C6347a(C2529o0<T> o0Var, C2552v0 v0Var, C6380d dVar) {
        if (C6394b.m24481d()) {
            C6394b.m24478a("AbstractProducerToDataSourceAdapter()");
        }
        this.f17728i = v0Var;
        this.f17729j = dVar;
        m24240H();
        if (C6394b.m24481d()) {
            C6394b.m24478a("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        dVar.mo8361b(v0Var);
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        if (C6394b.m24481d()) {
            C6394b.m24478a("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        o0Var.mo8198b(m24237C(), v0Var);
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
        if (C6394b.m24481d()) {
            C6394b.m24479b();
        }
    }

    /* renamed from: C */
    private C2505l<T> m24237C() {
        return new C6348a();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public synchronized void m24238E() {
        C6062k.m22841i(mo18125l());
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m24239F(Throwable th) {
        if (super.mo18130r(th, mo18847D(this.f17728i))) {
            this.f17729j.mo8363h(this.f17728i, th);
        }
    }

    /* renamed from: H */
    private void m24240H() {
        mo18128p(this.f17728i.mo8236b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public Map<String, Object> mo18847D(C2531p0 p0Var) {
        return p0Var.mo8236b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo18848G(T t, int i, C2531p0 p0Var) {
        boolean e = C2459b.m10210e(i);
        if (super.mo18132v(t, e, mo18847D(p0Var)) && e) {
            this.f17729j.mo8362f(this.f17728i);
        }
    }

    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.mo18118d()) {
            return true;
        }
        this.f17729j.mo8364i(this.f17728i);
        this.f17728i.mo8253w();
        return true;
    }
}
