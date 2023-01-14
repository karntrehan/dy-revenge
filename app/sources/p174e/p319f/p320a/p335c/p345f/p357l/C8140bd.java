package p174e.p319f.p320a.p335c.p345f.p357l;

import java.util.ArrayList;
import java.util.List;
import p174e.p319f.p320a.p335c.p345f.p357l.C8121ad;
import p174e.p319f.p320a.p335c.p345f.p357l.C8140bd;

/* renamed from: e.f.a.c.f.l.bd */
public abstract class C8140bd<MessageType extends C8140bd<MessageType, BuilderType>, BuilderType extends C8121ad<MessageType, BuilderType>> extends C8197ed<MessageType, BuilderType> implements C8293je {
    protected C8509vc<C8159cd> zzb = C8509vc.m29167d();

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final C8509vc<C8159cd> mo21698w() {
        if (this.zzb.mo22215k()) {
            this.zzb = this.zzb.clone();
        }
        return this.zzb;
    }

    /* renamed from: x */
    public final <Type> Type mo21699x(C8383oc<MessageType, Type> ocVar) {
        C8178dd ddVar = (C8178dd) ocVar;
        if (ddVar.f22203a == ((C8197ed) mo21702k(6, (Object) null, (Object) null))) {
            Type e = this.zzb.mo22207e(ddVar.f22206d);
            if (e == null) {
                return ddVar.f22204b;
            }
            if (ddVar.f22206d.f22161p.mo21663e() != C8143bg.ENUM) {
                return e;
            }
            Type arrayList = new ArrayList();
            for (Object next : (List) e) {
                if (ddVar.f22206d.f22161p.mo21663e() != C8143bg.ENUM) {
                    arrayList.add(next);
                } else {
                    C8254hd<?> hdVar = ddVar.f22206d.f22159f;
                    ((Integer) next).intValue();
                    throw null;
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }
}
