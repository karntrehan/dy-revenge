package p174e.p319f.p393c.p394a.p404z.p405a;

import java.io.IOException;
import p174e.p319f.p393c.p394a.p404z.p405a.C9426a;
import p174e.p319f.p393c.p394a.p404z.p405a.C9426a.C9427a;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9537s0;

/* renamed from: e.f.c.a.z.a.a */
public abstract class C9426a<MessageType extends C9426a<MessageType, BuilderType>, BuilderType extends C9427a<MessageType, BuilderType>> implements C9537s0 {
    protected int memoizedHashCode = 0;

    /* renamed from: e.f.c.a.z.a.a$a */
    public static abstract class C9427a<MessageType extends C9426a<MessageType, BuilderType>, BuilderType extends C9427a<MessageType, BuilderType>> implements C9537s0.C9538a {
        /* renamed from: p */
        protected static C9519n1 m31398p(C9537s0 s0Var) {
            return new C9519n1(s0Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public abstract BuilderType mo23483m(MessageType messagetype);

        /* renamed from: n */
        public BuilderType mo23482E(C9537s0 s0Var) {
            if (mo24005c().getClass().isInstance(s0Var)) {
                return mo23483m((C9426a) s0Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    /* renamed from: m */
    private String m31391m(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo23476a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: f */
    public C9468i mo23477f() {
        try {
            C9468i.C9476h B = C9468i.m31666B(mo23981g());
            mo23980e(B.mo23668b());
            return B.mo23667a();
        } catch (IOException e) {
            throw new RuntimeException(m31391m("ByteString"), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo23478h(C9467h1 h1Var) {
        int a = mo23476a();
        if (a != -1) {
            return a;
        }
        int h = h1Var.mo23636h(this);
        mo23481o(h);
        return h;
    }

    /* renamed from: i */
    public byte[] mo23479i() {
        try {
            byte[] bArr = new byte[mo23981g()];
            C9504l d0 = C9504l.m31984d0(bArr);
            mo23980e(d0);
            d0.mo23788c();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(m31391m("byte array"), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public C9519n1 mo23480n() {
        return new C9519n1(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo23481o(int i) {
        throw new UnsupportedOperationException();
    }
}
