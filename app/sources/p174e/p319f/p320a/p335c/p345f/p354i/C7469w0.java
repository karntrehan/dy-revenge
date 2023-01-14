package p174e.p319f.p320a.p335c.p345f.p354i;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: e.f.a.c.f.i.w0 */
class C7469w0<E> extends C7483x0<E> {

    /* renamed from: a */
    Object[] f20063a = new Object[4];

    /* renamed from: b */
    int f20064b = 0;

    /* renamed from: c */
    boolean f20065c;

    C7469w0(int i) {
    }

    /* renamed from: d */
    private final void m27530d(int i) {
        Object[] objArr = this.f20063a;
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
            this.f20063a = Arrays.copyOf(objArr, i2);
        } else if (this.f20065c) {
            this.f20063a = (Object[]) objArr.clone();
        } else {
            return;
        }
        this.f20065c = false;
    }

    /* renamed from: b */
    public final C7469w0<E> mo20967b(E e) {
        Objects.requireNonNull(e);
        m27530d(this.f20064b + 1);
        Object[] objArr = this.f20063a;
        int i = this.f20064b;
        this.f20064b = i + 1;
        objArr[i] = e;
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Iterable<? extends E>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p174e.p319f.p320a.p335c.p345f.p354i.C7483x0<E> mo20968c(java.lang.Iterable<? extends E> r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0020
            int r0 = r2.f20064b
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.m27530d(r0)
            boolean r0 = r3 instanceof p174e.p319f.p320a.p335c.p345f.p354i.C7497y0
            if (r0 != 0) goto L_0x0013
            goto L_0x0020
        L_0x0013:
            e.f.a.c.f.i.y0 r3 = (p174e.p319f.p320a.p335c.p345f.p354i.C7497y0) r3
            java.lang.Object[] r0 = r2.f20063a
            int r1 = r2.f20064b
            int r3 = r3.mo20663b(r0, r1)
            r2.f20064b = r3
            return r2
        L_0x0020:
            java.util.Iterator r3 = r3.iterator()
        L_0x0024:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0032
            java.lang.Object r0 = r3.next()
            r2.mo20561a(r0)
            goto L_0x0024
        L_0x0032:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p354i.C7469w0.mo20968c(java.lang.Iterable):e.f.a.c.f.i.x0");
    }
}
