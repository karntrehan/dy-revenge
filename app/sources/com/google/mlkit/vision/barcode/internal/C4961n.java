package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import p174e.p319f.p320a.p335c.p345f.p354i.C7509yc;

/* renamed from: com.google.mlkit.vision.barcode.internal.n */
public final class C4961n implements C4958k {

    /* renamed from: a */
    private final C7509yc f13838a;

    public C4961n(C7509yc ycVar) {
        this.f13838a = ycVar;
    }

    /* renamed from: a */
    public final Rect mo14965a() {
        C7509yc ycVar = this.f13838a;
        int i = RecyclerView.UNDEFINED_DURATION;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        int i3 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        int i4 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        int i5 = 0;
        while (true) {
            Point[] pointArr = ycVar.f20202r;
            if (i5 >= pointArr.length) {
                return new Rect(i3, i4, i, i2);
            }
            Point point = pointArr[i5];
            i3 = Math.min(i3, point.x);
            i = Math.max(i, point.x);
            i4 = Math.min(i4, point.y);
            i2 = Math.max(i2, point.y);
            i5++;
        }
    }

    /* renamed from: i */
    public final String mo14966i() {
        return this.f13838a.f20199o;
    }

    /* renamed from: k */
    public final String mo14967k() {
        return this.f13838a.f20200p;
    }

    public final int zza() {
        return this.f13838a.f20198f;
    }

    public final int zzb() {
        return this.f13838a.f20201q;
    }
}
