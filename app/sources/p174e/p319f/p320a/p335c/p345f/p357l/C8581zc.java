package p174e.p319f.p320a.p335c.p345f.p357l;

import p174e.p319f.p320a.p335c.p345f.p357l.C8197ed;
import p174e.p319f.p320a.p335c.p345f.p357l.C8581zc;

/* renamed from: e.f.a.c.f.l.zc */
public class C8581zc<MessageType extends C8197ed<MessageType, BuilderType>, BuilderType extends C8581zc<MessageType, BuilderType>> extends C8309kb<MessageType, BuilderType> {

    /* renamed from: f */
    private final MessageType f23361f;

    /* renamed from: o */
    protected MessageType f23362o;

    /* renamed from: p */
    protected boolean f23363p = false;

    protected C8581zc(MessageType messagetype) {
        this.f23361f = messagetype;
        this.f23362o = (C8197ed) messagetype.mo21702k(4, (Object) null, (Object) null);
    }

    /* renamed from: f */
    private static final void m29338f(MessageType messagetype, MessageType messagetype2) {
        C8457se.m29041a().mo22144b(messagetype.getClass()).mo21979e(messagetype, messagetype2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C8309kb mo21925d(C8346mb mbVar) {
        mo22293i((C8197ed) mbVar);
        return this;
    }

    /* renamed from: g */
    public final BuilderType clone() {
        BuilderType buildertype = (C8581zc) this.f23361f.mo21702k(5, (Object) null, (Object) null);
        buildertype.mo22293i(mo21660o());
        return buildertype;
    }

    /* renamed from: i */
    public final BuilderType mo22293i(MessageType messagetype) {
        if (this.f23363p) {
            mo21658l();
            this.f23363p = false;
        }
        m29338f(this.f23362o, messagetype);
        return this;
    }

    /* renamed from: j */
    public final MessageType mo22294j() {
        MessageType k = mo21660o();
        if (k.mo21767r()) {
            return k;
        }
        throw new C8275if(k);
    }

    /* renamed from: k */
    public MessageType mo21660o() {
        if (this.f23363p) {
            return this.f23362o;
        }
        MessageType messagetype = this.f23362o;
        C8457se.m29041a().mo22144b(messagetype.getClass()).mo21976b(messagetype);
        this.f23363p = true;
        return this.f23362o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo21658l() {
        MessageType messagetype = (C8197ed) this.f23362o.mo21702k(4, (Object) null, (Object) null);
        m29338f(messagetype, this.f23362o);
        this.f23362o = messagetype;
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C8274ie mo21769t() {
        return this.f23361f;
    }
}
