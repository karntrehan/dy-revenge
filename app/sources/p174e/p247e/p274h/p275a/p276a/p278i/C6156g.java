package p174e.p247e.p274h.p275a.p276a.p278i;

import android.graphics.Rect;
import com.facebook.common.time.C2317b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p174e.p247e.p253d.p257d.C6065n;
import p174e.p247e.p253d.p257d.C6066o;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p274h.p275a.p276a.C6143d;
import p174e.p247e.p274h.p275a.p276a.C6144e;
import p174e.p247e.p274h.p275a.p276a.p278i.p279j.C6159a;
import p174e.p247e.p274h.p275a.p276a.p278i.p279j.C6161b;
import p174e.p247e.p274h.p275a.p276a.p278i.p279j.C6162c;
import p174e.p247e.p274h.p281c.C6174b;
import p174e.p247e.p274h.p287h.C6233b;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p307k.C6372g;
import p174e.p247e.p294k.p309m.C6379c;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: e.e.h.a.a.i.g */
public class C6156g implements C6157h {

    /* renamed from: a */
    private final C6143d f16897a;

    /* renamed from: b */
    private final C2317b f16898b;

    /* renamed from: c */
    private final C6158i f16899c = new C6158i();

    /* renamed from: d */
    private final C6065n<Boolean> f16900d;

    /* renamed from: e */
    private C6152c f16901e;

    /* renamed from: f */
    private C6151b f16902f;

    /* renamed from: g */
    private C6162c f16903g;

    /* renamed from: h */
    private C6159a f16904h;

    /* renamed from: i */
    private C6379c f16905i;

    /* renamed from: j */
    private List<C6155f> f16906j;

    /* renamed from: k */
    private boolean f16907k;

    public C6156g(C2317b bVar, C6143d dVar, C6065n<Boolean> nVar) {
        this.f16898b = bVar;
        this.f16897a = dVar;
        this.f16900d = nVar;
    }

    /* renamed from: h */
    private void m23192h() {
        if (this.f16904h == null) {
            this.f16904h = new C6159a(this.f16898b, this.f16899c, this, this.f16900d, C6066o.f16704b);
        }
        if (this.f16903g == null) {
            this.f16903g = new C6162c(this.f16898b, this.f16899c);
        }
        if (this.f16902f == null) {
            this.f16902f = new C6161b(this.f16899c, this);
        }
        C6152c cVar = this.f16901e;
        if (cVar == null) {
            this.f16901e = new C6152c(this.f16897a.mo18286x(), this.f16902f);
        } else {
            cVar.mo18201l(this.f16897a.mo18286x());
        }
        if (this.f16905i == null) {
            this.f16905i = new C6379c(this.f16903g, this.f16901e);
        }
    }

    /* renamed from: a */
    public void mo18204a(C6158i iVar, int i) {
        List<C6155f> list;
        if (this.f16907k && (list = this.f16906j) != null && !list.isEmpty()) {
            C6154e B = iVar.mo18213B();
            for (C6155f b : this.f16906j) {
                b.mo18203b(B, i);
            }
        }
    }

    /* renamed from: b */
    public void mo18205b(C6158i iVar, int i) {
        List<C6155f> list;
        iVar.mo18228o(i);
        if (this.f16907k && (list = this.f16906j) != null && !list.isEmpty()) {
            if (i == 3) {
                mo18207d();
            }
            C6154e B = iVar.mo18213B();
            for (C6155f a : this.f16906j) {
                a.mo18202a(B, i);
            }
        }
    }

    /* renamed from: c */
    public void mo18206c(C6155f fVar) {
        if (fVar != null) {
            if (this.f16906j == null) {
                this.f16906j = new CopyOnWriteArrayList();
            }
            this.f16906j.add(fVar);
        }
    }

    /* renamed from: d */
    public void mo18207d() {
        C6233b c = this.f16897a.mo18270c();
        if (c != null && c.mo18464g() != null) {
            Rect bounds = c.mo18464g().getBounds();
            this.f16899c.mo18235v(bounds.width());
            this.f16899c.mo18234u(bounds.height());
        }
    }

    /* renamed from: e */
    public void mo18208e() {
        List<C6155f> list = this.f16906j;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: f */
    public void mo18209f() {
        mo18208e();
        mo18210g(false);
        this.f16899c.mo18215b();
    }

    /* renamed from: g */
    public void mo18210g(boolean z) {
        this.f16907k = z;
        if (z) {
            m23192h();
            C6151b bVar = this.f16902f;
            if (bVar != null) {
                this.f16897a.mo18165i0(bVar);
            }
            C6159a aVar = this.f16904h;
            if (aVar != null) {
                this.f16897a.mo18279m(aVar);
            }
            C6379c cVar = this.f16905i;
            if (cVar != null) {
                this.f16897a.mo18166j0(cVar);
                return;
            }
            return;
        }
        C6151b bVar2 = this.f16902f;
        if (bVar2 != null) {
            this.f16897a.mo18182y0(bVar2);
        }
        C6159a aVar2 = this.f16904h;
        if (aVar2 != null) {
            this.f16897a.mo18264S(aVar2);
        }
        C6379c cVar2 = this.f16905i;
        if (cVar2 != null) {
            this.f16897a.mo18184z0(cVar2);
        }
    }

    /* renamed from: i */
    public void mo18211i(C6174b<C6144e, C6384b, C6088a<C6367b>, C6372g> bVar) {
        this.f16899c.mo18222i(bVar.mo18309o(), bVar.mo18310p(), (C6384b[]) bVar.mo18308n());
    }
}
