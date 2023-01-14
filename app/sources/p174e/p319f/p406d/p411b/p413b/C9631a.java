package p174e.p319f.p406d.p411b.p413b;

import android.graphics.Bitmap;
import android.media.Image;
import android.os.Build;
import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C3705r;
import com.google.mlkit.vision.common.internal.C4965c;
import java.nio.ByteBuffer;
import p174e.p319f.p320a.p335c.p345f.p355j.C7678p7;
import p174e.p319f.p320a.p335c.p345f.p355j.C7696r7;
import p174e.p319f.p406d.p407a.p409c.C9605h;

/* renamed from: e.f.d.b.b.a */
public class C9631a implements C9605h {

    /* renamed from: a */
    private volatile Bitmap f25745a;

    /* renamed from: b */
    private volatile ByteBuffer f25746b;

    /* renamed from: c */
    private volatile C9632b f25747c;

    /* renamed from: d */
    private final int f25748d;

    /* renamed from: e */
    private final int f25749e;

    /* renamed from: f */
    private final int f25750f;

    /* renamed from: g */
    private final int f25751g;

    private C9631a(Bitmap bitmap, int i) {
        this.f25745a = (Bitmap) C3705r.m14346k(bitmap);
        this.f25748d = bitmap.getWidth();
        this.f25749e = bitmap.getHeight();
        this.f25750f = i;
        this.f25751g = -1;
    }

    private C9631a(Image image, int i, int i2, int i3) {
        C3705r.m14346k(image);
        this.f25747c = new C9632b(image);
        this.f25748d = i;
        this.f25749e = i2;
        this.f25750f = i3;
        this.f25751g = 35;
    }

    private C9631a(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        boolean z = true;
        if (i4 != 842094169) {
            if (i4 == 17) {
                i4 = 17;
            } else {
                z = false;
            }
        }
        C3705r.m14336a(z);
        this.f25746b = (ByteBuffer) C3705r.m14346k(byteBuffer);
        byteBuffer.rewind();
        this.f25748d = i;
        this.f25749e = i2;
        this.f25750f = i3;
        this.f25751g = i4;
    }

    /* renamed from: a */
    public static C9631a m32746a(@RecentlyNonNull Bitmap bitmap, int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C9631a aVar = new C9631a(bitmap, i);
        m32749l(-1, 1, elapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), Build.VERSION.SDK_INT > 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount(), i);
        return aVar;
    }

    /* renamed from: b */
    public static C9631a m32747b(@RecentlyNonNull ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C9631a aVar = new C9631a(byteBuffer, i, i2, i3, i4);
        m32749l(i4, 3, elapsedRealtime, i2, i, byteBuffer.limit(), i3);
        return aVar;
    }

    /* renamed from: c */
    public static C9631a m32748c(@RecentlyNonNull Image image, int i) {
        boolean z;
        int i2;
        C9631a aVar;
        int limit;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C3705r.m14347l(image, "Please provide a valid image");
        boolean z2 = true;
        if (i == 0 || i == 90 || i == 180) {
            i2 = i;
            z = true;
        } else if (i == 270) {
            z = true;
            i2 = 270;
        } else {
            i2 = i;
            z = false;
        }
        C3705r.m14337b(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        if (!(image.getFormat() == 256 || image.getFormat() == 35)) {
            z2 = false;
        }
        C3705r.m14337b(z2, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            aVar = new C9631a(C4965c.m18859f().mo14976c(image, i2), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            aVar = new C9631a(image, image.getWidth(), image.getHeight(), i2);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i3 = limit;
        C9631a aVar2 = aVar;
        m32749l(image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), i3, i2);
        return aVar2;
    }

    /* renamed from: l */
    private static void m32749l(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        C7696r7.m27769a(C7678p7.m27746b("vision-common"), i, i2, j, i3, i4, i5, i6);
    }

    @RecentlyNullable
    /* renamed from: d */
    public Bitmap mo24127d() {
        return this.f25745a;
    }

    @RecentlyNullable
    /* renamed from: e */
    public ByteBuffer mo24128e() {
        return this.f25746b;
    }

    /* renamed from: f */
    public int mo24129f() {
        return this.f25751g;
    }

    /* renamed from: g */
    public int mo24130g() {
        return this.f25749e;
    }

    @RecentlyNullable
    /* renamed from: h */
    public Image mo24131h() {
        if (this.f25747c == null) {
            return null;
        }
        return this.f25747c.mo24135a();
    }

    @RecentlyNullable
    /* renamed from: i */
    public Image.Plane[] mo24132i() {
        if (this.f25747c == null) {
            return null;
        }
        return this.f25747c.mo24136b();
    }

    /* renamed from: j */
    public int mo24133j() {
        return this.f25750f;
    }

    /* renamed from: k */
    public int mo24134k() {
        return this.f25748d;
    }
}
