package p174e.p319f.p320a.p335c.p345f.p352g;

import p174e.p319f.p320a.p335c.p345f.p352g.C6818h7;
import p174e.p319f.p320a.p335c.p345f.p352g.C6834i7;

/* renamed from: e.f.a.c.f.g.h7 */
public abstract class C6818h7<MessageType extends C6834i7<MessageType, BuilderType>, BuilderType extends C6818h7<MessageType, BuilderType>> implements C6788fa {
    /* renamed from: W */
    public final /* synthetic */ C6788fa mo19765W(byte[] bArr, C6899m8 m8Var) {
        return mo19827l(bArr, 0, bArr.length, m8Var);
    }

    /* renamed from: h */
    public final /* synthetic */ C6788fa mo19767h(byte[] bArr) {
        return mo19826k(bArr, 0, bArr.length);
    }

    /* renamed from: i0 */
    public final /* bridge */ /* synthetic */ C6788fa mo19768i0(C6805ga gaVar) {
        if (mo19516d().getClass().isInstance(gaVar)) {
            return mo19825j((C6834i7) gaVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract C6818h7 mo19825j(C6834i7 i7Var);

    /* renamed from: k */
    public abstract C6818h7 mo19826k(byte[] bArr, int i, int i2);

    /* renamed from: l */
    public abstract C6818h7 mo19827l(byte[] bArr, int i, int i2, C6899m8 m8Var);
}
