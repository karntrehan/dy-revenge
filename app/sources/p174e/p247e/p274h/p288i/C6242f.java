package p174e.p247e.p274h.p288i;

import android.net.Uri;
import p174e.p247e.p253d.p257d.C6065n;
import p174e.p247e.p253d.p264k.C6111f;
import p174e.p247e.p274h.p281c.C6174b;
import p174e.p247e.p294k.p311o.C6384b;

/* renamed from: e.e.h.i.f */
public class C6242f extends C6240d {

    /* renamed from: t */
    private static C6065n<? extends C6174b> f17286t;

    /* renamed from: u */
    private C6174b f17287u;

    /* renamed from: g */
    public static void m23671g(C6065n<? extends C6174b> nVar) {
        f17286t = nVar;
    }

    /* access modifiers changed from: protected */
    public C6174b getControllerBuilder() {
        return this.f17287u;
    }

    /* renamed from: h */
    public void mo18557h(int i, Object obj) {
        mo18558i(C6111f.m23000d(i), obj);
    }

    /* renamed from: i */
    public void mo18558i(Uri uri, Object obj) {
        setController(this.f17287u.mo18292B(obj).mo18190c(uri).mo18300d(getController()).mo18299b());
    }

    /* renamed from: j */
    public void mo18559j(String str, Object obj) {
        mo18558i(str != null ? Uri.parse(str) : null, obj);
    }

    public void setActualImageResource(int i) {
        mo18557h(i, (Object) null);
    }

    public void setImageRequest(C6384b bVar) {
        setController(this.f17287u.mo18294D(bVar).mo18300d(getController()).mo18299b());
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    public void setImageURI(Uri uri) {
        mo18558i(uri, (Object) null);
    }

    public void setImageURI(String str) {
        mo18559j(str, (Object) null);
    }
}
