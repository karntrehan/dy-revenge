package p174e.p247e.p274h.p275a.p276a;

import android.content.Context;
import android.net.Uri;
import java.util.Set;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p253d.p257d.C6054f;
import p174e.p247e.p253d.p257d.C6066o;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p266e.C6122c;
import p174e.p247e.p274h.p275a.p276a.p278i.C6151b;
import p174e.p247e.p274h.p275a.p276a.p278i.C6155f;
import p174e.p247e.p274h.p281c.C6174b;
import p174e.p247e.p274h.p281c.C6179d;
import p174e.p247e.p274h.p287h.C6232a;
import p174e.p247e.p289i.p291b.p292a.C6245b;
import p174e.p247e.p294k.p300d.C6283f;
import p174e.p247e.p294k.p301e.C6317f;
import p174e.p247e.p294k.p302f.C6327h;
import p174e.p247e.p294k.p306j.C6365a;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p307k.C6372g;
import p174e.p247e.p294k.p309m.C6381e;
import p174e.p247e.p294k.p311o.C6384b;
import p174e.p247e.p294k.p311o.C6388c;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.h.a.a.e */
public class C6144e extends C6174b<C6144e, C6384b, C6088a<C6367b>, C6372g> {

    /* renamed from: u */
    private final C6327h f16846u;

    /* renamed from: v */
    private final C6147g f16847v;

    /* renamed from: w */
    private C6054f<C6365a> f16848w;

    /* renamed from: x */
    private C6151b f16849x;

    /* renamed from: y */
    private C6155f f16850y;

    /* renamed from: e.e.h.a.a.e$a */
    static /* synthetic */ class C6145a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16851a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                e.e.h.c.b$c[] r0 = p174e.p247e.p274h.p281c.C6174b.C6177c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16851a = r0
                e.e.h.c.b$c r1 = p174e.p247e.p274h.p281c.C6174b.C6177c.FULL_FETCH     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16851a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.e.h.c.b$c r1 = p174e.p247e.p274h.p281c.C6174b.C6177c.DISK_CACHE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16851a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.e.h.c.b$c r1 = p174e.p247e.p274h.p281c.C6174b.C6177c.BITMAP_MEMORY_CACHE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p274h.p275a.p276a.C6144e.C6145a.<clinit>():void");
        }
    }

    public C6144e(Context context, C6147g gVar, C6327h hVar, Set<C6179d> set, Set<C6245b> set2) {
        super(context, set, set2);
        this.f16846u = hVar;
        this.f16847v = gVar;
    }

    /* renamed from: H */
    public static C6384b.C6387c m23165H(C6174b.C6177c cVar) {
        int i = C6145a.f16851a[cVar.ordinal()];
        if (i == 1) {
            return C6384b.C6387c.FULL_FETCH;
        }
        if (i == 2) {
            return C6384b.C6387c.DISK_CACHE;
        }
        if (i == 3) {
            return C6384b.C6387c.BITMAP_MEMORY_CACHE;
        }
        throw new RuntimeException("Cache level" + cVar + "is not supported. ");
    }

    /* renamed from: I */
    private C5999d m23166I() {
        C6384b bVar = (C6384b) mo18309o();
        C6283f k = this.f16846u.mo18718k();
        if (k == null || bVar == null) {
            return null;
        }
        return bVar.mo18927h() != null ? k.mo18609c(bVar, mo18302g()) : k.mo18607a(bVar, mo18302g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public C6122c<C6088a<C6367b>> mo18191j(C6232a aVar, String str, C6384b bVar, Object obj, C6174b.C6177c cVar) {
        return this.f16846u.mo18714g(bVar, obj, m23165H(cVar), mo18186K(aVar), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public C6381e mo18186K(C6232a aVar) {
        if (aVar instanceof C6143d) {
            return ((C6143d) aVar).mo18174p0();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public C6143d mo18192x() {
        if (C6394b.m24481d()) {
            C6394b.m24478a("PipelineDraweeControllerBuilder#obtainController");
        }
        try {
            C6232a q = mo18311q();
            String f = C6174b.m23337f();
            C6143d c = q instanceof C6143d ? (C6143d) q : this.f16847v.mo18196c();
            c.mo18175r0(mo18317y(c, f), f, m23166I(), mo18302g(), this.f16848w, this.f16849x);
            c.mo18176s0(this.f16850y, this, C6066o.f16704b);
            return c;
        } finally {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
    }

    /* renamed from: M */
    public C6144e mo18188M(C6155f fVar) {
        this.f16850y = fVar;
        return (C6144e) mo18313s();
    }

    /* renamed from: N */
    public C6144e mo18190c(Uri uri) {
        return (C6144e) super.mo18294D(uri == null ? null : C6388c.m24438s(uri).mo18951F(C6317f.m23928b()).mo18956a());
    }
}
