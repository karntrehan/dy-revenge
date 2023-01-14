package p174e.p319f.p320a.p335c.p362h;

/* renamed from: e.f.a.c.h.v */
final class C8978v implements Runnable {

    /* renamed from: f */
    final /* synthetic */ C8963l f24397f;

    /* renamed from: o */
    final /* synthetic */ C8979w f24398o;

    C8978v(C8979w wVar, C8963l lVar) {
        this.f24398o = wVar;
        this.f24397f = lVar;
    }

    public final void run() {
        if (this.f24397f.mo22777m()) {
            this.f24398o.f24401c.mo22791t();
            return;
        }
        try {
            this.f24398o.f24401c.mo22790s(this.f24398o.f24400b.mo14079a(this.f24397f));
        } catch (C8959j e) {
            if (e.getCause() instanceof Exception) {
                this.f24398o.f24401c.mo22789r((Exception) e.getCause());
            } else {
                this.f24398o.f24401c.mo22789r(e);
            }
        } catch (Exception e2) {
            this.f24398o.f24401c.mo22789r(e2);
        }
    }
}
