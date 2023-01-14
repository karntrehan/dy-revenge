package p174e.p319f.p320a.p335c.p345f.p357l;

import p174e.p319f.p320a.p335c.p345f.p357l.C8309kb;
import p174e.p319f.p320a.p335c.p345f.p357l.C8346mb;

/* renamed from: e.f.a.c.f.l.kb */
public abstract class C8309kb<MessageType extends C8346mb<MessageType, BuilderType>, BuilderType extends C8309kb<MessageType, BuilderType>> implements C8255he {
    /* renamed from: I */
    public final /* bridge */ /* synthetic */ C8255he mo21841I(C8274ie ieVar) {
        if (mo21769t().getClass().isInstance(ieVar)) {
            return mo21925d((C8346mb) ieVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract BuilderType mo21925d(MessageType messagetype);
}
