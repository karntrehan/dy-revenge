package p174e.p247e.p294k.p303g;

import android.graphics.Bitmap;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p266e.C6121b;
import p174e.p247e.p266e.C6122c;
import p174e.p247e.p294k.p307k.C6366a;
import p174e.p247e.p294k.p307k.C6367b;

/* renamed from: e.e.k.g.b */
public abstract class C6349b extends C6121b<C6088a<C6367b>> {
    /* renamed from: f */
    public void mo9195f(C6122c<C6088a<C6367b>> cVar) {
        if (cVar.mo18118d()) {
            C6088a h = cVar.mo18122h();
            Bitmap bitmap = null;
            if (h != null && (h.mo18082w0() instanceof C6366a)) {
                bitmap = ((C6366a) h.mo18082w0()).mo18868E();
            }
            try {
                mo15309g(bitmap);
            } finally {
                C6088a.m22949v0(h);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo15309g(Bitmap bitmap);
}
