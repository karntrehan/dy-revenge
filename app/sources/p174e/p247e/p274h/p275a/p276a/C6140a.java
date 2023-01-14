package p174e.p247e.p274h.p275a.p276a;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p174e.p247e.p274h.p284e.C6195i;
import p174e.p247e.p294k.p306j.C6365a;
import p174e.p247e.p294k.p307k.C6367b;
import p174e.p247e.p294k.p307k.C6368c;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.h.a.a.a */
public class C6140a implements C6365a {

    /* renamed from: a */
    private final Resources f16825a;

    /* renamed from: b */
    private final C6365a f16826b;

    public C6140a(Resources resources, C6365a aVar) {
        this.f16825a = resources;
        this.f16826b = aVar;
    }

    /* renamed from: c */
    private static boolean m23122c(C6368c cVar) {
        return (cVar.mo18877X() == 1 || cVar.mo18877X() == 0) ? false : true;
    }

    /* renamed from: d */
    private static boolean m23123d(C6368c cVar) {
        return (cVar.mo18878e0() == 0 || cVar.mo18878e0() == -1) ? false : true;
    }

    /* renamed from: a */
    public boolean mo18153a(C6367b bVar) {
        return true;
    }

    /* renamed from: b */
    public Drawable mo18154b(C6367b bVar) {
        try {
            if (C6394b.m24481d()) {
                C6394b.m24478a("DefaultDrawableFactory#createDrawable");
            }
            if (bVar instanceof C6368c) {
                C6368c cVar = (C6368c) bVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f16825a, cVar.mo18868E());
                if (!m23123d(cVar) && !m23122c(cVar)) {
                    return bitmapDrawable;
                }
                C6195i iVar = new C6195i(bitmapDrawable, cVar.mo18878e0(), cVar.mo18877X());
                if (C6394b.m24481d()) {
                    C6394b.m24479b();
                }
                return iVar;
            }
            C6365a aVar = this.f16826b;
            if (aVar == null || !aVar.mo18153a(bVar)) {
                if (C6394b.m24481d()) {
                    C6394b.m24479b();
                }
                return null;
            }
            Drawable b = this.f16826b.mo18154b(bVar);
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
            return b;
        } finally {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
    }
}
