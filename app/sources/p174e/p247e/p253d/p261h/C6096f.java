package p174e.p247e.p253d.p261h;

import java.lang.ref.SoftReference;

/* renamed from: e.e.d.h.f */
public class C6096f<T> {

    /* renamed from: a */
    SoftReference<T> f16734a = null;

    /* renamed from: b */
    SoftReference<T> f16735b = null;

    /* renamed from: c */
    SoftReference<T> f16736c = null;

    /* renamed from: a */
    public void mo18088a() {
        SoftReference<T> softReference = this.f16734a;
        if (softReference != null) {
            softReference.clear();
            this.f16734a = null;
        }
        SoftReference<T> softReference2 = this.f16735b;
        if (softReference2 != null) {
            softReference2.clear();
            this.f16735b = null;
        }
        SoftReference<T> softReference3 = this.f16736c;
        if (softReference3 != null) {
            softReference3.clear();
            this.f16736c = null;
        }
    }

    /* renamed from: b */
    public T mo18089b() {
        SoftReference<T> softReference = this.f16734a;
        if (softReference == null) {
            return null;
        }
        return softReference.get();
    }

    /* renamed from: c */
    public void mo18090c(T t) {
        this.f16734a = new SoftReference<>(t);
        this.f16735b = new SoftReference<>(t);
        this.f16736c = new SoftReference<>(t);
    }
}
