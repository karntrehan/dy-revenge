package p174e.p319f.p320a.p335c.p345f.p356k;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: e.f.a.c.f.k.h0 */
class C7861h0<E> extends C7874i0<E> {

    /* renamed from: a */
    Object[] f21441a = new Object[4];

    /* renamed from: b */
    int f21442b = 0;

    /* renamed from: c */
    boolean f21443c;

    C7861h0(int i) {
    }

    /* renamed from: b */
    private final void m28023b(int i) {
        Object[] objArr = this.f21441a;
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
            this.f21441a = Arrays.copyOf(objArr, i2);
        } else if (this.f21443c) {
            this.f21441a = (Object[]) objArr.clone();
        } else {
            return;
        }
        this.f21443c = false;
    }

    /* renamed from: a */
    public final C7861h0<E> mo21372a(E e) {
        Objects.requireNonNull(e);
        m28023b(this.f21442b + 1);
        Object[] objArr = this.f21441a;
        int i = this.f21442b;
        this.f21442b = i + 1;
        objArr[i] = e;
        return this;
    }
}
