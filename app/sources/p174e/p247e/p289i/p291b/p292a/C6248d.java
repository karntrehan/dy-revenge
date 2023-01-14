package p174e.p247e.p289i.p291b.p292a;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p174e.p247e.p289i.p291b.p292a.C6245b;

/* renamed from: e.e.i.b.a.d */
public class C6248d<I> extends C6244a<I> {

    /* renamed from: o */
    private final List<C6245b<I>> f17300o = new ArrayList(2);

    /* renamed from: I */
    private synchronized void m23688I(String str, Throwable th) {
        Log.e("FwdControllerListener2", str, th);
    }

    /* renamed from: A */
    public void mo18240A(String str, I i, C6245b.C6246a aVar) {
        int size = this.f17300o.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                C6245b bVar = this.f17300o.get(i2);
                if (bVar != null) {
                    bVar.mo18240A(str, i, aVar);
                }
            } catch (Exception e) {
                m23688I("ForwardingControllerListener2 exception in onFinalImageSet", e);
            }
        }
    }

    /* renamed from: E */
    public synchronized void mo18564E(C6245b<I> bVar) {
        this.f17300o.add(bVar);
    }

    /* renamed from: L */
    public synchronized void mo18565L(C6245b<I> bVar) {
        int indexOf = this.f17300o.indexOf(bVar);
        if (indexOf != -1) {
            this.f17300o.remove(indexOf);
        }
    }

    /* renamed from: b */
    public void mo18244b(String str, Object obj, C6245b.C6246a aVar) {
        int size = this.f17300o.size();
        for (int i = 0; i < size; i++) {
            try {
                C6245b bVar = this.f17300o.get(i);
                if (bVar != null) {
                    bVar.mo18244b(str, obj, aVar);
                }
            } catch (Exception e) {
                m23688I("ForwardingControllerListener2 exception in onSubmit", e);
            }
        }
    }

    /* renamed from: o */
    public void mo18248o(String str, Throwable th, C6245b.C6246a aVar) {
        int size = this.f17300o.size();
        for (int i = 0; i < size; i++) {
            try {
                C6245b bVar = this.f17300o.get(i);
                if (bVar != null) {
                    bVar.mo18248o(str, th, aVar);
                }
            } catch (Exception e) {
                m23688I("ForwardingControllerListener2 exception in onFailure", e);
            }
        }
    }

    /* renamed from: r */
    public void mo18249r(String str, C6245b.C6246a aVar) {
        int size = this.f17300o.size();
        for (int i = 0; i < size; i++) {
            try {
                C6245b bVar = this.f17300o.get(i);
                if (bVar != null) {
                    bVar.mo18249r(str, aVar);
                }
            } catch (Exception e) {
                m23688I("ForwardingControllerListener2 exception in onRelease", e);
            }
        }
    }
}
