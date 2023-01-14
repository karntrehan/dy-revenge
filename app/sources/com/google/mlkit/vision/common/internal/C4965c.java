package com.google.mlkit.vision.common.internal;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.os.Build;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3705r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import p174e.p319f.p406d.p407a.C9585a;
import p174e.p319f.p406d.p411b.p413b.C9631a;

/* renamed from: com.google.mlkit.vision.common.internal.c */
public class C4965c {

    /* renamed from: a */
    private static final C4965c f13853a = new C4965c();

    private C4965c() {
    }

    @RecentlyNonNull
    /* renamed from: a */
    public static ByteBuffer m18858a(@RecentlyNonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @RecentlyNonNull
    /* renamed from: f */
    public static C4965c m18859f() {
        return f13853a;
    }

    @RecentlyNonNull
    /* renamed from: i */
    public static Bitmap m18860i(@RecentlyNonNull ByteBuffer byteBuffer, int i, int i2, int i3) {
        byte[] l = m18863l(m18861j(byteBuffer, true).array(), i, i2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(l, 0, l.length);
        return m18862k(decodeByteArray, i3, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    @RecentlyNonNull
    /* renamed from: j */
    public static ByteBuffer m18861j(@RecentlyNonNull ByteBuffer byteBuffer, boolean z) {
        int i;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i2 = limit / 6;
        ByteBuffer allocate = z ? ByteBuffer.allocate(limit) : ByteBuffer.allocateDirect(limit);
        int i3 = 0;
        while (true) {
            i = i2 * 4;
            if (i3 >= i) {
                break;
            }
            allocate.put(i3, byteBuffer.get(i3));
            i3++;
        }
        for (int i4 = 0; i4 < i2 + i2; i4++) {
            allocate.put(i + i4, byteBuffer.get(((i4 % 2) * i2) + i + (i4 / 2)));
        }
        return allocate;
    }

    /* renamed from: k */
    private static Bitmap m18862k(Bitmap bitmap, int i, int i2, int i3) {
        if (i == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
    }

    /* renamed from: l */
    private static byte[] m18863l(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream;
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, (int[]) null);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            Log.w("ImageConvertUtils", "Error closing ByteArrayOutputStream");
            throw new C9585a("Image conversion error from NV21 format", 13);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @TargetApi(19)
    /* renamed from: m */
    private static final void m18864m(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int limit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (limit != 0) {
            int i5 = i / (i2 / limit);
            int i6 = 0;
            for (int i7 = 0; i7 < limit; i7++) {
                int i8 = i6;
                for (int i9 = 0; i9 < i5; i9++) {
                    bArr[i3] = buffer.get(i8);
                    i3 += i4;
                    i8 += plane.getPixelStride();
                }
                i6 += plane.getRowStride();
            }
        }
    }

    @RecentlyNonNull
    /* renamed from: b */
    public byte[] mo14975b(@RecentlyNonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        byte[] bArr = new byte[limit];
        byteBuffer.get(bArr, 0, limit);
        return bArr;
    }

    /* renamed from: c */
    public Bitmap mo14976c(@RecentlyNonNull Image image, int i) {
        C3705r.m14337b(image.getFormat() == 256, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int remaining = buffer.remaining();
        byte[] bArr = new byte[remaining];
        buffer.get(bArr);
        return m18862k(BitmapFactory.decodeByteArray(bArr, 0, remaining), i, image.getWidth(), image.getHeight());
    }

    /* renamed from: d */
    public ByteBuffer mo14977d(@RecentlyNonNull C9631a aVar, boolean z) {
        boolean z2 = z;
        int f = aVar.mo24129f();
        if (f == -1) {
            Bitmap bitmap = (Bitmap) C3705r.m14346k(aVar.mo24127d());
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int ceil = (int) Math.ceil(((double) height) / 2.0d);
            int ceil2 = ((ceil + ceil) * ((int) Math.ceil(((double) width) / 2.0d))) + i;
            ByteBuffer allocate = z2 ? ByteBuffer.allocate(ceil2) : ByteBuffer.allocateDirect(ceil2);
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < height; i4++) {
                int i5 = 0;
                while (i5 < width) {
                    int i6 = iArr[i2];
                    int i7 = (i6 >> 16) & 255;
                    int i8 = (i6 >> 8) & 255;
                    int i9 = i6 & 255;
                    int i10 = (((((i7 * -38) - (i8 * 74)) + (i9 * 112)) + 128) >> 8) + 128;
                    int i11 = (((((i7 * 112) - (i8 * 94)) - (i9 * 18)) + 128) >> 8) + 128;
                    int i12 = i3 + 1;
                    allocate.put(i3, (byte) Math.min(255, (((((i7 * 66) + (i8 * 129)) + (i9 * 25)) + 128) >> 8) + 16));
                    if (i4 % 2 == 0 && i2 % 2 == 0) {
                        int i13 = i + 1;
                        allocate.put(i, (byte) Math.min(255, i11));
                        i = i13 + 1;
                        allocate.put(i13, (byte) Math.min(255, i10));
                    }
                    i2++;
                    i5++;
                    i3 = i12;
                }
            }
            return allocate;
        } else if (f == 17) {
            return z2 ? m18858a((ByteBuffer) C3705r.m14346k(aVar.mo24128e())) : (ByteBuffer) C3705r.m14346k(aVar.mo24128e());
        } else if (f != 35) {
            if (f == 842094169) {
                return m18861j((ByteBuffer) C3705r.m14346k(aVar.mo24128e()), z2);
            }
            throw new C9585a("Unsupported image format", 13);
        } else if (Build.VERSION.SDK_INT >= 19) {
            return mo14980h((Image.Plane[]) C3705r.m14346k(aVar.mo24132i()), aVar.mo24134k(), aVar.mo24130g());
        } else {
            throw new C9585a("Unsupported image format", 13);
        }
    }

    /* renamed from: e */
    public Bitmap mo14978e(@RecentlyNonNull C9631a aVar) {
        int f = aVar.mo24129f();
        if (f == -1) {
            return m18862k((Bitmap) C3705r.m14346k(aVar.mo24127d()), aVar.mo24133j(), aVar.mo24134k(), aVar.mo24130g());
        }
        if (f == 17) {
            return mo14979g((ByteBuffer) C3705r.m14346k(aVar.mo24128e()), aVar.mo24134k(), aVar.mo24130g(), aVar.mo24133j());
        }
        if (f != 35) {
            if (f == 842094169) {
                return m18860i((ByteBuffer) C3705r.m14346k(aVar.mo24128e()), aVar.mo24134k(), aVar.mo24130g(), aVar.mo24133j());
            }
            throw new C9585a("Unsupported image format", 13);
        } else if (Build.VERSION.SDK_INT >= 19) {
            return mo14979g(mo14980h((Image.Plane[]) C3705r.m14346k(aVar.mo24132i()), aVar.mo24134k(), aVar.mo24130g()), aVar.mo24134k(), aVar.mo24130g(), aVar.mo24133j());
        } else {
            throw new C9585a("Unsupported image format", 13);
        }
    }

    @RecentlyNonNull
    /* renamed from: g */
    public Bitmap mo14979g(@RecentlyNonNull ByteBuffer byteBuffer, int i, int i2, int i3) {
        byte[] l = m18863l(mo14975b(byteBuffer), i, i2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(l, 0, l.length);
        return m18862k(decodeByteArray, i3, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    @RecentlyNonNull
    /* renamed from: h */
    public ByteBuffer mo14980h(@RecentlyNonNull Image.Plane[] planeArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = i3 / 4;
        byte[] bArr = new byte[(i4 + i4 + i3)];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i5 = (i3 + i3) / 4;
        boolean z = buffer2.remaining() == i5 + -2 && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i3);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i3, 1);
            buffer3.get(bArr, i3 + 1, i5 - 1);
        } else {
            int i6 = i;
            int i7 = i2;
            byte[] bArr2 = bArr;
            m18864m(planeArr[0], i6, i7, bArr2, 0, 1);
            m18864m(planeArr[1], i6, i7, bArr2, i3 + 1, 2);
            m18864m(planeArr[2], i, i2, bArr, i3, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
