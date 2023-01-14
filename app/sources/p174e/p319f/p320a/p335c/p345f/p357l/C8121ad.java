package p174e.p319f.p320a.p335c.p345f.p357l;

import p174e.p319f.p320a.p335c.p345f.p357l.C8121ad;
import p174e.p319f.p320a.p335c.p345f.p357l.C8140bd;

/* renamed from: e.f.a.c.f.l.ad */
public class C8121ad<MessageType extends C8140bd<MessageType, BuilderType>, BuilderType extends C8121ad<MessageType, BuilderType>> extends C8581zc<MessageType, BuilderType> implements C8293je {
    protected C8121ad(MessageType messagetype) {
        super(messagetype);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo21658l() {
        super.mo21658l();
        C8140bd bdVar = (C8140bd) this.f23362o;
        bdVar.zzb = bdVar.zzb.clone();
    }

    /* renamed from: m */
    public final MessageType mo21660o() {
        MessageType k;
        if (this.f23363p) {
            k = this.f23362o;
        } else {
            ((C8140bd) this.f23362o).zzb.mo22211h();
            k = super.mo21660o();
        }
        return (C8140bd) k;
    }
}
