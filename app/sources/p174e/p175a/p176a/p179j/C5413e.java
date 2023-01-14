package p174e.p175a.p176a.p179j;

import androidx.recyclerview.widget.RecyclerView;
import p174e.p175a.p176a.C5377b;

/* renamed from: e.a.a.j.e */
public final class C5413e extends C5411c {
    public C5413e() {
    }

    public C5413e(int i) {
        super(i);
    }

    /* renamed from: A */
    public C5413e mo16337A(boolean z) {
        mo16327f(RecyclerView.UNDEFINED_DURATION, z);
        return this;
    }

    /* renamed from: B */
    public C5413e mo16338B(boolean z) {
        mo16327f(256, z);
        return this;
    }

    /* renamed from: C */
    public C5413e mo16339C(boolean z) {
        mo16327f(2, z);
        return this;
    }

    /* renamed from: a */
    public void mo16323a(int i) {
        if ((i & 256) > 0 && (i & 512) > 0) {
            throw new C5377b("IsStruct and IsArray options are mutually exclusive", 103);
        } else if ((i & 2) > 0 && (i & 768) > 0) {
            throw new C5377b("Structs and arrays can't have \"value\" options", 103);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo16312e() {
        return -2147475470;
    }

    /* renamed from: h */
    public boolean mo16340h() {
        return mo16324c(64);
    }

    /* renamed from: i */
    public boolean mo16341i() {
        return mo16324c(512);
    }

    /* renamed from: j */
    public boolean mo16342j() {
        return mo16324c(4096);
    }

    /* renamed from: k */
    public boolean mo16343k() {
        return mo16324c(2048);
    }

    /* renamed from: l */
    public boolean mo16344l() {
        return mo16324c(1024);
    }

    /* renamed from: m */
    public boolean mo16345m() {
        return (mo16325d() & 768) > 0;
    }

    /* renamed from: n */
    public boolean mo16346n() {
        return mo16324c(32);
    }

    /* renamed from: o */
    public boolean mo16347o() {
        return mo16324c(RecyclerView.UNDEFINED_DURATION);
    }

    /* renamed from: p */
    public boolean mo16348p() {
        return (mo16325d() & 768) == 0;
    }

    /* renamed from: q */
    public boolean mo16349q() {
        return mo16324c(256);
    }

    /* renamed from: r */
    public void mo16350r(C5413e eVar) {
        if (eVar != null) {
            mo16328g(eVar.mo16325d() | mo16325d());
        }
    }

    /* renamed from: s */
    public C5413e mo16351s(boolean z) {
        mo16327f(512, z);
        return this;
    }

    /* renamed from: t */
    public C5413e mo16352t(boolean z) {
        mo16327f(4096, z);
        return this;
    }

    /* renamed from: u */
    public C5413e mo16353u(boolean z) {
        mo16327f(2048, z);
        return this;
    }

    /* renamed from: v */
    public C5413e mo16354v(boolean z) {
        mo16327f(1024, z);
        return this;
    }

    /* renamed from: w */
    public C5413e mo16355w(boolean z) {
        mo16327f(64, z);
        return this;
    }

    /* renamed from: x */
    public C5413e mo16356x(boolean z) {
        mo16327f(16, z);
        return this;
    }

    /* renamed from: y */
    public C5413e mo16357y(boolean z) {
        mo16327f(128, z);
        return this;
    }

    /* renamed from: z */
    public C5413e mo16358z(boolean z) {
        mo16327f(32, z);
        return this;
    }
}
