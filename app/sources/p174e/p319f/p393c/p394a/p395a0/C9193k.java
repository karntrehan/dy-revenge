package p174e.p319f.p393c.p394a.p395a0;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
import p174e.p319f.p393c.p394a.C9175a;

/* renamed from: e.f.c.a.a0.k */
abstract class C9193k implements C9175a {

    /* renamed from: a */
    private final C9191i f25096a;

    /* renamed from: b */
    private final C9191i f25097b;

    public C9193k(byte[] bArr) {
        this.f25096a = mo23174g(bArr, 1);
        this.f25097b = mo23174g(bArr, 0);
    }

    /* renamed from: c */
    private byte[] m30554c(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() >= this.f25096a.mo23170g() + 16) {
            int position = byteBuffer.position();
            byte[] bArr2 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] bArr3 = new byte[this.f25096a.mo23170g()];
            byteBuffer.get(bArr3);
            if (bArr == null) {
                bArr = new byte[0];
            }
            try {
                C9206q.m30589f(m30556e(bArr3), m30557f(bArr, byteBuffer), bArr2);
                byteBuffer.position(position);
                return this.f25096a.mo23172e(byteBuffer);
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    /* renamed from: d */
    private void m30555d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= bArr.length + this.f25096a.mo23170g() + 16) {
            int position = byteBuffer.position();
            this.f25096a.mo23173f(byteBuffer, bArr);
            byteBuffer.position(position);
            byte[] bArr3 = new byte[this.f25096a.mo23170g()];
            byteBuffer.get(bArr3);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] a = C9206q.m30584a(m30556e(bArr3), m30557f(bArr2, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(a);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: e */
    private byte[] m30556e(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.f25097b.mo23171c(bArr, 0).get(bArr2);
        return bArr2;
    }

    /* renamed from: f */
    private static byte[] m30557f(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong((long) bArr.length);
        order.putLong((long) remaining);
        return order.array();
    }

    /* renamed from: a */
    public byte[] mo23153a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= (RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO - this.f25096a.mo23170g()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.f25096a.mo23170g() + 16);
            m30555d(allocate, bArr, bArr2);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: b */
    public byte[] mo23154b(byte[] bArr, byte[] bArr2) {
        return m30554c(ByteBuffer.wrap(bArr), bArr2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract C9191i mo23174g(byte[] bArr, int i);
}
