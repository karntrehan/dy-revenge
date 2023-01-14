package p174e.p319f.p320a.p335c.p345f.p355j;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: e.f.a.c.f.j.i7 */
class C7612i7<E> extends C7723u7<E> {

    /* renamed from: a */
    Object[] f20510a = new Object[4];

    /* renamed from: b */
    int f20511b = 0;

    /* renamed from: c */
    boolean f20512c;

    C7612i7(int i) {
    }

    /* renamed from: b */
    private final void m27661b(int i) {
        Object[] objArr = this.f20510a;
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
            this.f20510a = Arrays.copyOf(objArr, i2);
        } else if (this.f20512c) {
            this.f20510a = (Object[]) objArr.clone();
        } else {
            return;
        }
        this.f20512c = false;
    }

    /* renamed from: a */
    public final C7612i7<E> mo21104a(E e) {
        Objects.requireNonNull(e);
        m27661b(this.f20511b + 1);
        Object[] objArr = this.f20510a;
        int i = this.f20511b;
        this.f20511b = i + 1;
        objArr[i] = e;
        return this;
    }
}
