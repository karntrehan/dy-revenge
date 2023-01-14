package p174e.p319f.p393c.p394a.p395a0;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: e.f.c.a.a0.i */
abstract class C9191i implements C9205p {

    /* renamed from: a */
    private static final int[] f25093a = m30543m(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: b */
    int[] f25094b;

    /* renamed from: c */
    private final int f25095c;

    C9191i(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.f25094b = m30543m(bArr);
            this.f25095c = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: h */
    private void m30538h(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer c = mo23171c(bArr, this.f25095c + i2);
            if (i2 == i - 1) {
                C9189g.m30532c(byteBuffer, byteBuffer2, c, remaining % 64);
            } else {
                C9189g.m30532c(byteBuffer, byteBuffer2, c, 64);
            }
        }
    }

    /* renamed from: i */
    static void m30539i(int[] iArr, int i, int i2, int i3, int i4) {
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m30540j(iArr[i4] ^ iArr[i], 16);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m30540j(iArr[i2] ^ iArr[i3], 12);
        iArr[i] = iArr[i] + iArr[i2];
        iArr[i4] = m30540j(iArr[i] ^ iArr[i4], 8);
        iArr[i3] = iArr[i3] + iArr[i4];
        iArr[i2] = m30540j(iArr[i2] ^ iArr[i3], 7);
    }

    /* renamed from: j */
    private static int m30540j(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    /* renamed from: k */
    static void m30541k(int[] iArr, int[] iArr2) {
        int[] iArr3 = f25093a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* renamed from: l */
    static void m30542l(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i = 0; i < 10; i++) {
            m30539i(iArr2, 0, 4, 8, 12);
            m30539i(iArr2, 1, 5, 9, 13);
            m30539i(iArr2, 2, 6, 10, 14);
            m30539i(iArr2, 3, 7, 11, 15);
            m30539i(iArr2, 0, 5, 10, 15);
            m30539i(iArr2, 1, 6, 11, 12);
            m30539i(iArr2, 2, 7, 8, 13);
            m30539i(iArr2, 3, 4, 9, 14);
        }
    }

    /* renamed from: m */
    static int[] m30543m(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    /* renamed from: a */
    public byte[] mo23155a(byte[] bArr) {
        if (bArr.length <= RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - mo23170g()) {
            ByteBuffer allocate = ByteBuffer.allocate(mo23170g() + bArr.length);
            mo23173f(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public byte[] mo23156b(byte[] bArr) {
        return mo23172e(ByteBuffer.wrap(bArr));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ByteBuffer mo23171c(byte[] bArr, int i) {
        int[] d = mo23169d(m30543m(bArr), i);
        int[] iArr = (int[]) d.clone();
        m30542l(iArr);
        for (int i2 = 0; i2 < d.length; i2++) {
            d[i2] = d[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(d, 0, 16);
        return order;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int[] mo23169d(int[] iArr, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public byte[] mo23172e(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= mo23170g()) {
            byte[] bArr = new byte[mo23170g()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            m30538h(bArr, allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo23173f(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - mo23170g() >= bArr.length) {
            byte[] c = C9211u.m30601c(mo23170g());
            byteBuffer.put(c);
            m30538h(c, byteBuffer, ByteBuffer.wrap(bArr));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract int mo23170g();
}
