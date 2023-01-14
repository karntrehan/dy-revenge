package p174e.p247e.p274h.p275a.p276a;

import android.content.Context;
import android.content.res.Resources;
import java.util.Set;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p255b.C6041f;
import p174e.p247e.p253d.p257d.C6054f;
import p174e.p247e.p253d.p257d.C6065n;
import p174e.p247e.p274h.p275a.p276a.p278i.C6155f;
import p174e.p247e.p274h.p280b.C6163a;
import p174e.p247e.p274h.p281c.C6179d;
import p174e.p247e.p289i.p291b.p292a.C6245b;
import p174e.p247e.p294k.p300d.C6304s;
import p174e.p247e.p294k.p302f.C6327h;
import p174e.p247e.p294k.p302f.C6341l;
import p174e.p247e.p294k.p306j.C6365a;
import p174e.p247e.p294k.p307k.C6367b;

/* renamed from: e.e.h.a.a.f */
public class C6146f implements C6065n<C6144e> {

    /* renamed from: a */
    private final Context f16852a;

    /* renamed from: b */
    private final C6327h f16853b;

    /* renamed from: c */
    private final C6147g f16854c;

    /* renamed from: d */
    private final Set<C6179d> f16855d;

    /* renamed from: e */
    private final Set<C6245b> f16856e;

    /* renamed from: f */
    private final C6155f f16857f;

    public C6146f(Context context, C6141b bVar) {
        this(context, C6341l.m24151l(), bVar);
    }

    public C6146f(Context context, C6341l lVar, C6141b bVar) {
        this(context, lVar, (Set<C6179d>) null, (Set<C6245b>) null, bVar);
    }

    public C6146f(Context context, C6341l lVar, Set<C6179d> set, Set<C6245b> set2, C6141b bVar) {
        this.f16852a = context;
        C6327h j = lVar.mo18805j();
        this.f16853b = j;
        if (bVar == null) {
            C6147g gVar = new C6147g();
            this.f16854c = gVar;
            Resources resources = context.getResources();
            C6163a b = C6163a.m23251b();
            C6365a b2 = lVar.mo18799b(context);
            C6041f g = C6041f.m22805g();
            C6304s<C5999d, C6367b> j2 = j.mo18717j();
            if (bVar != null) {
                throw null;
            } else if (bVar == null) {
                gVar.mo18194a(resources, b, b2, g, j2, (C6054f<C6365a>) null, (C6065n<Boolean>) null);
                this.f16855d = set;
                this.f16856e = set2;
                if (bVar == null) {
                    this.f16857f = null;
                    return;
                }
                throw null;
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    /* renamed from: a */
    public C6144e get() {
        return new C6144e(this.f16852a, this.f16854c, this.f16853b, this.f16855d, this.f16856e).mo18188M(this.f16857f);
    }
}
