package androidx.camera.core;

import android.util.SparseArray;
import androidx.camera.core.impl.C0885t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: androidx.camera.core.x2 */
final class C1002x2 implements C0885t1 {

    /* renamed from: a */
    final Object f2828a = new Object();

    /* renamed from: b */
    final SparseArray<C1814b.C1815a<ImageProxy>> f2829b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<C9172b<ImageProxy>> f2830c = new SparseArray<>();

    /* renamed from: d */
    private final List<ImageProxy> f2831d = new ArrayList();

    /* renamed from: e */
    private final List<Integer> f2832e;

    /* renamed from: f */
    private String f2833f = null;

    /* renamed from: g */
    private boolean f2834g = false;

    /* renamed from: androidx.camera.core.x2$a */
    class C1003a implements C1814b.C1817c<ImageProxy> {

        /* renamed from: a */
        final /* synthetic */ int f2835a;

        C1003a(int i) {
            this.f2835a = i;
        }

        /* renamed from: a */
        public Object mo1960a(C1814b.C1815a<ImageProxy> aVar) {
            synchronized (C1002x2.this.f2828a) {
                C1002x2.this.f2829b.put(this.f2835a, aVar);
            }
            return "getImageProxy(id: " + this.f2835a + ")";
        }
    }

    C1002x2(List<Integer> list, String str) {
        this.f2832e = list;
        this.f2833f = str;
        m3898f();
    }

    /* renamed from: f */
    private void m3898f() {
        synchronized (this.f2828a) {
            for (Integer intValue : this.f2832e) {
                int intValue2 = intValue.intValue();
                this.f2830c.put(intValue2, C1814b.m7736a(new C1003a(intValue2)));
            }
        }
    }

    /* renamed from: a */
    public C9172b<ImageProxy> mo3082a(int i) {
        C9172b<ImageProxy> bVar;
        synchronized (this.f2828a) {
            if (!this.f2834g) {
                bVar = this.f2830c.get(i);
                if (bVar == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i);
                }
            } else {
                throw new IllegalStateException("ImageProxyBundle already closed.");
            }
        }
        return bVar;
    }

    /* renamed from: b */
    public List<Integer> mo3083b() {
        return Collections.unmodifiableList(this.f2832e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3283c(ImageProxy imageProxy) {
        synchronized (this.f2828a) {
            if (!this.f2834g) {
                Integer num = (Integer) imageProxy.mo2537U().mo2693c().mo3114c(this.f2833f);
                if (num != null) {
                    C1814b.C1815a aVar = this.f2829b.get(num.intValue());
                    if (aVar != null) {
                        this.f2831d.add(imageProxy);
                        aVar.mo6308c(imageProxy);
                        return;
                    }
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
                }
                throw new IllegalArgumentException("CaptureId is null.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3284d() {
        synchronized (this.f2828a) {
            if (!this.f2834g) {
                for (ImageProxy close : this.f2831d) {
                    close.close();
                }
                this.f2831d.clear();
                this.f2830c.clear();
                this.f2829b.clear();
                this.f2834g = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo3285e() {
        synchronized (this.f2828a) {
            if (!this.f2834g) {
                for (ImageProxy close : this.f2831d) {
                    close.close();
                }
                this.f2831d.clear();
                this.f2830c.clear();
                this.f2829b.clear();
                m3898f();
            }
        }
    }
}
