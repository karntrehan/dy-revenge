package p174e.p319f.p320a.p335c.p345f.p352g;

import java.io.IOException;
import p174e.p319f.p320a.p335c.p345f.p352g.C6702a9;
import p174e.p319f.p320a.p335c.p345f.p352g.C7075x8;

/* renamed from: e.f.a.c.f.g.x8 */
public class C7075x8<MessageType extends C6702a9<MessageType, BuilderType>, BuilderType extends C7075x8<MessageType, BuilderType>> extends C6818h7<MessageType, BuilderType> {

    /* renamed from: f */
    private final C6702a9 f19044f;

    /* renamed from: o */
    protected C6702a9 f19045o;

    /* renamed from: p */
    protected boolean f19046p = false;

    protected C7075x8(MessageType messagetype) {
        this.f19044f = messagetype;
        this.f19045o = (C6702a9) messagetype.mo19497w(4, (Object) null, (Object) null);
    }

    /* renamed from: m */
    private static final void m26996m(C6702a9 a9Var, C6702a9 a9Var2) {
        C6933oa.m26315a().mo20068b(a9Var.getClass()).mo19896e(a9Var, a9Var2);
    }

    /* renamed from: d */
    public final /* synthetic */ C6805ga mo19516d() {
        return this.f19044f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final /* synthetic */ C6818h7 mo19825j(C6834i7 i7Var) {
        mo20434p((C6702a9) i7Var);
        return this;
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C6818h7 mo19826k(byte[] bArr, int i, int i2) {
        mo20435q(bArr, 0, i2, C6899m8.m26140a());
        return this;
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C6818h7 mo19827l(byte[] bArr, int i, int i2, C6899m8 m8Var) {
        mo20435q(bArr, 0, i2, m8Var);
        return this;
    }

    /* renamed from: n */
    public final C7075x8 clone() {
        C7075x8 x8Var = (C7075x8) this.f19044f.mo19497w(5, (Object) null, (Object) null);
        x8Var.mo20434p(mo19766e0());
        return x8Var;
    }

    /* renamed from: p */
    public final C7075x8 mo20434p(C6702a9 a9Var) {
        if (this.f19046p) {
            mo20438t();
            this.f19046p = false;
        }
        m26996m(this.f19045o, a9Var);
        return this;
    }

    /* renamed from: q */
    public final C7075x8 mo20435q(byte[] bArr, int i, int i2, C6899m8 m8Var) {
        if (this.f19046p) {
            mo20438t();
            this.f19046p = false;
        }
        try {
            C6933oa.m26315a().mo20068b(this.f19045o.getClass()).mo19899h(this.f19045o, bArr, 0, i2, new C6882l7(m8Var));
            return this;
        } catch (C6852j9 e) {
            throw e;
        } catch (IndexOutOfBoundsException unused) {
            throw C6852j9.m25980f();
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r3 != false) goto L_0x0030;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final MessageType mo20436r() {
        /*
            r5 = this;
            e.f.a.c.f.g.a9 r0 = r5.mo19766e0()
            r1 = 1
            r2 = 0
            java.lang.Object r3 = r0.mo19497w(r1, r2, r2)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            if (r3 != r1) goto L_0x0013
            goto L_0x0030
        L_0x0013:
            if (r3 == 0) goto L_0x0031
            e.f.a.c.f.g.oa r3 = p174e.p319f.p320a.p335c.p345f.p352g.C6933oa.m26315a()
            java.lang.Class r4 = r0.getClass()
            e.f.a.c.f.g.ra r3 = r3.mo20068b(r4)
            boolean r3 = r3.mo19897f(r0)
            if (r1 == r3) goto L_0x0029
            r1 = r2
            goto L_0x002a
        L_0x0029:
            r1 = r0
        L_0x002a:
            r4 = 2
            r0.mo19497w(r4, r1, r2)
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            return r0
        L_0x0031:
            e.f.a.c.f.g.ib r1 = new e.f.a.c.f.g.ib
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C7075x8.mo20436r():e.f.a.c.f.g.a9");
    }

    /* renamed from: s */
    public MessageType mo19766e0() {
        if (this.f19046p) {
            return this.f19045o;
        }
        C6702a9 a9Var = this.f19045o;
        C6933oa.m26315a().mo20068b(a9Var.getClass()).mo19893b(a9Var);
        this.f19046p = true;
        return this.f19045o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo20438t() {
        C6702a9 a9Var = (C6702a9) this.f19045o.mo19497w(4, (Object) null, (Object) null);
        m26996m(a9Var, this.f19045o);
        this.f19045o = a9Var;
    }
}
