package com.mrousavy.camera.p168n0;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.mrousavy.camera.p167m0.C5169c;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.n0.d */
public final class C5175d {

    /* renamed from: a */
    private static final Size f14657a = new Size(36, 24);

    /* renamed from: a */
    public static final ReadableArray m19449a(CameraCharacteristics cameraCharacteristics) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C10457l.m35320e(cameraCharacteristics, "<this>");
        Object obj = cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        C10457l.m35317b(obj);
        C10457l.m35319d(obj, "this.get(CameraCharacter…VAILABLE_FOCAL_LENGTHS)!!");
        float[] fArr = (float[]) obj;
        Object obj2 = cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        C10457l.m35317b(obj2);
        C10457l.m35319d(obj2, "this.get(CameraCharacter…SOR_INFO_PHYSICAL_SIZE)!!");
        float c = ((float) C5169c.m19436c(f14657a)) / C5169c.m19435b((SizeF) obj2);
        WritableArray createArray = Arguments.createArray();
        int length = fArr.length;
        boolean z6 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            float f = fArr[i];
            i++;
            if (f * c > 35.0f) {
                z5 = true;
                continue;
            } else {
                z5 = false;
                continue;
            }
            if (z5) {
                z = true;
                break;
            }
        }
        int length2 = fArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                z2 = false;
                break;
            }
            float f2 = fArr[i2];
            i2++;
            float f3 = f2 * c;
            if (f3 < 24.0f || f3 > 35.0f) {
                z4 = false;
                continue;
            } else {
                z4 = true;
                continue;
            }
            if (z4) {
                z2 = true;
                break;
            }
        }
        int length3 = fArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                break;
            }
            float f4 = fArr[i3];
            i3++;
            if (f4 * c < 24.0f) {
                z3 = true;
                continue;
            } else {
                z3 = false;
                continue;
            }
            if (z3) {
                z6 = true;
                break;
            }
        }
        if (z) {
            createArray.pushString("telephoto-camera");
        }
        if (z2) {
            createArray.pushString("wide-angle-camera");
        }
        if (z6) {
            createArray.pushString("ultra-wide-angle-camera");
        }
        C10457l.m35319d(createArray, "deviceTypes");
        return createArray;
    }

    /* renamed from: b */
    public static final double m19450b(CameraCharacteristics cameraCharacteristics) {
        C10457l.m35320e(cameraCharacteristics, "<this>");
        Object obj = cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        C10457l.m35317b(obj);
        C10457l.m35319d(obj, "this.get(CameraCharacter…VAILABLE_FOCAL_LENGTHS)!!");
        Object obj2 = cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        C10457l.m35317b(obj2);
        C10457l.m35319d(obj2, "this.get(CameraCharacter…SOR_INFO_PHYSICAL_SIZE)!!");
        float f = (float) 2;
        return ((double) (f * ((float) Math.atan((double) (C5169c.m19435b((SizeF) obj2) / (((float[]) obj)[0] * f)))))) * 57.29577951308232d;
    }
}
