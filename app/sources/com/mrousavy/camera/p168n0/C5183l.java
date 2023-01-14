package com.mrousavy.camera.p168n0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Log;
import androidx.camera.core.ImageProxy;
import com.mrousavy.camera.C5205x;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p027c.p084n.p085a.C2049a;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.n0.l */
public final class C5183l {
    /* renamed from: a */
    public static final byte[] m19463a(byte[] bArr) {
        C10457l.m35320e(bArr, "imageBytes");
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Matrix matrix = new Matrix();
        switch (new C2049a((InputStream) new ByteArrayInputStream(bArr)).mo6897i("Orientation", 0)) {
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
        matrix.postScale(-1.0f, 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C10457l.m35319d(byteArray, "stream.toByteArray()");
        return byteArray;
    }

    /* renamed from: b */
    public static final void m19464b(ImageProxy imageProxy, File file, boolean z) {
        C10457l.m35320e(imageProxy, "<this>");
        C10457l.m35320e(file, "file");
        int q0 = imageProxy.mo2543q0();
        int i = 0;
        if (q0 == 35) {
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putInt(imageProxy.mo2541e()).putInt(imageProxy.mo2539c()).putInt(imageProxy.mo2542m()[1].mo2546f()).putInt(imageProxy.mo2542m()[1].mo2545e());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(allocate.array());
            while (true) {
                int i2 = i + 1;
                ByteBuffer d = imageProxy.mo2542m()[i].mo2544d();
                C10457l.m35319d(d, "planes[i].buffer");
                byte[] bArr = new byte[d.remaining()];
                d.get(bArr);
                fileOutputStream.write(bArr);
                if (i2 > 2) {
                    fileOutputStream.close();
                    return;
                }
                i = i2;
            }
        } else if (q0 == 256) {
            ByteBuffer d2 = imageProxy.mo2542m()[0].mo2544d();
            C10457l.m35319d(d2, "planes[0].buffer");
            byte[] bArr2 = new byte[d2.remaining()];
            d2.get(bArr2);
            if (z) {
                long currentTimeMillis = System.currentTimeMillis();
                bArr2 = m19463a(bArr2);
                Log.i("CameraView.performance", "Flipping Image took " + (System.currentTimeMillis() - currentTimeMillis) + " ms.");
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            fileOutputStream2.write(bArr2);
            fileOutputStream2.close();
        } else {
            throw new C5205x(imageProxy.mo2543q0());
        }
    }
}
