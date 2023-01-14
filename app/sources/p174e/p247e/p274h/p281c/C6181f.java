package p174e.p247e.p274h.p281c;

import android.graphics.drawable.Animatable;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e.e.h.c.f */
public class C6181f<INFO> implements C6179d<INFO> {

    /* renamed from: f */
    private final List<C6179d<? super INFO>> f17047f = new ArrayList(2);

    /* renamed from: d */
    private synchronized void m23384d(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    /* renamed from: a */
    public void mo9956a(String str, INFO info) {
        int size = this.f17047f.size();
        for (int i = 0; i < size; i++) {
            try {
                C6179d dVar = this.f17047f.get(i);
                if (dVar != null) {
                    dVar.mo9956a(str, info);
                }
            } catch (Exception e) {
                m23384d("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo18321b(C6179d<? super INFO> dVar) {
        this.f17047f.add(dVar);
    }

    /* renamed from: c */
    public synchronized void mo18322c() {
        this.f17047f.clear();
    }

    /* renamed from: e */
    public synchronized void mo9987e(String str, INFO info, Animatable animatable) {
        int size = this.f17047f.size();
        for (int i = 0; i < size; i++) {
            try {
                C6179d dVar = this.f17047f.get(i);
                if (dVar != null) {
                    dVar.mo9987e(str, info, animatable);
                }
            } catch (Exception e) {
                m23384d("InternalListener exception in onFinalImageSet", e);
            }
        }
    }

    /* renamed from: h */
    public synchronized void mo9988h(String str, Throwable th) {
        int size = this.f17047f.size();
        for (int i = 0; i < size; i++) {
            try {
                C6179d dVar = this.f17047f.get(i);
                if (dVar != null) {
                    dVar.mo9988h(str, th);
                }
            } catch (Exception e) {
                m23384d("InternalListener exception in onFailure", e);
            }
        }
    }

    /* renamed from: j */
    public synchronized void mo9957j(String str) {
        int size = this.f17047f.size();
        for (int i = 0; i < size; i++) {
            try {
                C6179d dVar = this.f17047f.get(i);
                if (dVar != null) {
                    dVar.mo9957j(str);
                }
            } catch (Exception e) {
                m23384d("InternalListener exception in onRelease", e);
            }
        }
    }

    /* renamed from: n */
    public synchronized void mo9989n(String str, Object obj) {
        int size = this.f17047f.size();
        for (int i = 0; i < size; i++) {
            try {
                C6179d dVar = this.f17047f.get(i);
                if (dVar != null) {
                    dVar.mo9989n(str, obj);
                }
            } catch (Exception e) {
                m23384d("InternalListener exception in onSubmit", e);
            }
        }
    }

    /* renamed from: o */
    public void mo9958o(String str, Throwable th) {
        int size = this.f17047f.size();
        for (int i = 0; i < size; i++) {
            try {
                C6179d dVar = this.f17047f.get(i);
                if (dVar != null) {
                    dVar.mo9958o(str, th);
                }
            } catch (Exception e) {
                m23384d("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }
}
