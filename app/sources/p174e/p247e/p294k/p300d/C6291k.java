package p174e.p247e.p294k.p300d;

import android.net.Uri;
import p174e.p247e.p249b.p250a.C5999d;
import p174e.p247e.p249b.p250a.C6004i;
import p174e.p247e.p294k.p311o.C6384b;
import p174e.p247e.p294k.p311o.C6390d;

/* renamed from: e.e.k.d.k */
public class C6291k implements C6283f {

    /* renamed from: a */
    private static C6291k f17410a;

    protected C6291k() {
    }

    /* renamed from: f */
    public static synchronized C6291k m23802f() {
        C6291k kVar;
        synchronized (C6291k.class) {
            if (f17410a == null) {
                f17410a = new C6291k();
            }
            kVar = f17410a;
        }
        return kVar;
    }

    /* renamed from: a */
    public C5999d mo18607a(C6384b bVar, Object obj) {
        return new C6274b(mo18623e(bVar.mo18938r()).toString(), bVar.mo18934n(), bVar.mo18936p(), bVar.mo18923e(), (C5999d) null, (String) null, obj);
    }

    /* renamed from: b */
    public C5999d mo18608b(C6384b bVar, Uri uri, Object obj) {
        return new C6004i(mo18623e(uri).toString());
    }

    /* renamed from: c */
    public C5999d mo18609c(C6384b bVar, Object obj) {
        String str;
        C5999d dVar;
        C6390d h = bVar.mo18927h();
        if (h != null) {
            C5999d c = h.mo9953c();
            str = h.getClass().getName();
            dVar = c;
        } else {
            dVar = null;
            str = null;
        }
        return new C6274b(mo18623e(bVar.mo18938r()).toString(), bVar.mo18934n(), bVar.mo18936p(), bVar.mo18923e(), dVar, str, obj);
    }

    /* renamed from: d */
    public C5999d mo18610d(C6384b bVar, Object obj) {
        return mo18608b(bVar, bVar.mo18938r(), obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Uri mo18623e(Uri uri) {
        return uri;
    }
}
