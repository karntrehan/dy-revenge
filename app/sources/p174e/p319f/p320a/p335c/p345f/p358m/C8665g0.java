package p174e.p319f.p320a.p335c.p345f.p358m;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: e.f.a.c.f.m.g0 */
class C8665g0<E> extends C8678h0<E> {

    /* renamed from: a */
    Object[] f23718a = new Object[4];

    /* renamed from: b */
    int f23719b = 0;

    /* renamed from: c */
    boolean f23720c;

    C8665g0(int i) {
    }

    /* renamed from: b */
    private final void m29468b(int i) {
        Object[] objArr = this.f23718a;
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
            this.f23718a = Arrays.copyOf(objArr, i2);
        } else if (this.f23720c) {
            this.f23718a = (Object[]) objArr.clone();
        } else {
            return;
        }
        this.f23720c = false;
    }

    /* renamed from: a */
    public final C8665g0<E> mo22417a(E e) {
        Objects.requireNonNull(e);
        m29468b(this.f23719b + 1);
        Object[] objArr = this.f23718a;
        int i = this.f23719b;
        this.f23719b = i + 1;
        objArr[i] = e;
        return this;
    }
}
