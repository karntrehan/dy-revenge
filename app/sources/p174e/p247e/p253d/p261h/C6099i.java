package p174e.p247e.p253d.p261h;

import android.graphics.Bitmap;
import java.util.IdentityHashMap;
import java.util.Map;
import p174e.p247e.p253d.p257d.C6062k;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: e.e.d.h.i */
public class C6099i<T> {

    /* renamed from: a */
    private static final Map<Object, Integer> f16737a = new IdentityHashMap();

    /* renamed from: b */
    private T f16738b;

    /* renamed from: c */
    private int f16739c = 1;

    /* renamed from: d */
    private final C6098h<T> f16740d;

    /* renamed from: e.e.d.h.i$a */
    public static class C6100a extends RuntimeException {
        public C6100a() {
            super("Null shared reference");
        }
    }

    public C6099i(T t, C6098h<T> hVar) {
        this.f16738b = C6062k.m22839g(t);
        this.f16740d = (C6098h) C6062k.m22839g(hVar);
        m22970a(t);
    }

    /* renamed from: a */
    private static void m22970a(Object obj) {
        if (!C6088a.m22946G0() || (!(obj instanceof Bitmap) && !(obj instanceof C6094d))) {
            Map<Object, Integer> map = f16737a;
            synchronized (map) {
                Integer num = map.get(obj);
                map.put(obj, num == null ? 1 : Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    /* renamed from: c */
    private synchronized int m22971c() {
        int i;
        m22972e();
        C6062k.m22834b(Boolean.valueOf(this.f16739c > 0));
        i = this.f16739c - 1;
        this.f16739c = i;
        return i;
    }

    /* renamed from: e */
    private void m22972e() {
        if (!m22973h(this)) {
            throw new C6100a();
        }
    }

    /* renamed from: h */
    public static boolean m22973h(C6099i<?> iVar) {
        return iVar != null && iVar.mo18094g();
    }

    /* renamed from: i */
    private static void m22974i(Object obj) {
        Map<Object, Integer> map = f16737a;
        synchronized (map) {
            Integer num = map.get(obj);
            if (num == null) {
                C6071a.m22866N("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                map.remove(obj);
            } else {
                map.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    /* renamed from: b */
    public synchronized void mo18091b() {
        m22972e();
        this.f16739c++;
    }

    /* renamed from: d */
    public void mo18092d() {
        T t;
        if (m22971c() == 0) {
            synchronized (this) {
                t = this.f16738b;
                this.f16738b = null;
            }
            if (t != null) {
                this.f16740d.mo8068a(t);
                m22974i(t);
            }
        }
    }

    /* renamed from: f */
    public synchronized T mo18093f() {
        return this.f16738b;
    }

    /* renamed from: g */
    public synchronized boolean mo18094g() {
        return this.f16739c > 0;
    }
}
