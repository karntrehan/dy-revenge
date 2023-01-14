package p174e.p199d.p218c.p220b0;

import java.util.Stack;
import p174e.p199d.p200a.p214s.C5693b;
import p174e.p199d.p217b.C5712m;
import p174e.p199d.p218c.C5722b;
import p174e.p199d.p218c.C5724c;
import p174e.p199d.p218c.C5732e;
import p174e.p199d.p218c.C5737g;

/* renamed from: e.d.c.b0.a */
public abstract class C5723a implements C5693b {

    /* renamed from: a */
    private final Stack<C5722b> f16191a = new Stack<>();

    /* renamed from: b */
    private C5722b f16192b;

    /* renamed from: c */
    protected C5722b f16193c;

    /* renamed from: d */
    protected final C5732e f16194d;

    protected C5723a(C5732e eVar, C5722b bVar) {
        this.f16194d = eVar;
        this.f16192b = bVar;
    }

    /* renamed from: A */
    private C5722b m21366A() {
        Class cls = C5724c.class;
        C5722b bVar = this.f16193c;
        if (bVar != null) {
            return bVar;
        }
        C5724c cVar = (C5724c) this.f16194d.mo17170e(cls);
        if (cVar != null) {
            return cVar;
        }
        mo17162B(cls);
        return this.f16193c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo17162B(Class<? extends C5722b> cls) {
        try {
            C5722b bVar = (C5722b) cls.newInstance();
            C5722b bVar2 = this.f16193c;
            if (bVar2 == null) {
                C5722b bVar3 = this.f16192b;
                if (bVar3 != null) {
                    bVar.mo17130O(bVar3);
                    this.f16192b = null;
                }
            } else {
                this.f16191a.push(bVar2);
                bVar.mo17130O(this.f16193c);
            }
            this.f16193c = bVar;
            this.f16194d.mo17166a(bVar);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public void mo16988a(int i, double d) {
        this.f16193c.mo17121F(i, d);
    }

    /* renamed from: c */
    public void mo16990c(int i, C5712m[] mVarArr) {
        this.f16193c.mo17132Q(i, mVarArr);
    }

    public void error(String str) {
        m21366A().mo17137a(str);
    }

    /* renamed from: g */
    public void mo16995g(int i, int[] iArr) {
        this.f16193c.mo17126K(i, iArr);
    }

    /* renamed from: h */
    public void mo16996h() {
        this.f16193c = this.f16191a.empty() ? null : this.f16191a.pop();
    }

    /* renamed from: i */
    public void mo16997i(int i, short s) {
        this.f16193c.mo17125J(i, s);
    }

    /* renamed from: j */
    public void mo16998j(int i, byte[] bArr) {
        this.f16193c.mo17118C(i, bArr);
    }

    /* renamed from: k */
    public void mo16999k(int i, float f) {
        this.f16193c.mo17123H(i, f);
    }

    /* renamed from: l */
    public void mo17000l(int i, short[] sArr) {
        this.f16193c.mo17129N(i, sArr);
    }

    /* renamed from: m */
    public void mo17001m(int i, short[] sArr) {
        this.f16193c.mo17129N(i, sArr);
    }

    /* renamed from: n */
    public void mo17002n(int i, long j) {
        this.f16193c.mo17127L(i, j);
    }

    /* renamed from: o */
    public void mo17003o(int i, C5737g gVar) {
        this.f16193c.mo17135T(i, gVar);
    }

    /* renamed from: p */
    public void mo17004p(int i, int i2) {
        this.f16193c.mo17125J(i, i2);
    }

    /* renamed from: q */
    public void mo17005q(int i, float[] fArr) {
        this.f16193c.mo17124I(i, fArr);
    }

    /* renamed from: r */
    public void mo17006r(int i, int i2) {
        this.f16193c.mo17125J(i, i2);
    }

    /* renamed from: s */
    public void mo17007s(int i, double[] dArr) {
        this.f16193c.mo17122G(i, dArr);
    }

    /* renamed from: t */
    public void mo17008t(int i, int[] iArr) {
        this.f16193c.mo17129N(i, iArr);
    }

    /* renamed from: v */
    public void mo17010v(int i, byte[] bArr) {
        this.f16193c.mo17118C(i, bArr);
    }

    /* renamed from: w */
    public void mo17011w(int i, byte b) {
        this.f16193c.mo17125J(i, b);
    }

    public void warn(String str) {
        m21366A().mo17137a(str);
    }

    /* renamed from: x */
    public void mo17013x(int i, int i2) {
        this.f16193c.mo17125J(i, i2);
    }

    /* renamed from: y */
    public void mo17014y(int i, long[] jArr) {
        this.f16193c.mo17129N(i, jArr);
    }

    /* renamed from: z */
    public void mo17015z(int i, C5712m mVar) {
        this.f16193c.mo17131P(i, mVar);
    }
}
