package p174e.p319f.p320a.p335c.p345f.p357l;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: e.f.a.c.f.l.k1 */
class C8299k1<E> extends C8318l1<E> {

    /* renamed from: a */
    Object[] f22686a = new Object[4];

    /* renamed from: b */
    int f22687b = 0;

    /* renamed from: c */
    boolean f22688c;

    C8299k1(int i) {
    }

    /* renamed from: b */
    private final void m28649b(int i) {
        Object[] objArr = this.f22686a;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
            }
            this.f22686a = Arrays.copyOf(objArr, i2);
        } else if (this.f22688c) {
            this.f22686a = (Object[]) objArr.clone();
        } else {
            return;
        }
        this.f22688c = false;
    }

    /* renamed from: a */
    public final C8299k1<E> mo21915a(E e) {
        Objects.requireNonNull(e);
        m28649b(this.f22687b + 1);
        Object[] objArr = this.f22686a;
        int i = this.f22687b;
        this.f22687b = i + 1;
        objArr[i] = e;
        return this;
    }
}
