package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import p174e.p319f.p320a.p335c.p345f.p354i.C7165ac;

/* renamed from: com.google.mlkit.vision.barcode.internal.l */
public final class C4959l implements C4958k {

    /* renamed from: a */
    private final C7165ac f13830a;

    public C4959l(C7165ac acVar) {
        this.f13830a = acVar;
    }

    /* renamed from: a */
    public final Rect mo14965a() {
        Point[] E = this.f13830a.mo20574E();
        if (E == null) {
            return null;
        }
        int i = RecyclerView.UNDEFINED_DURATION;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        int i3 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        int i4 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        for (Point point : E) {
            i3 = Math.min(i3, point.x);
            i = Math.max(i, point.x);
            i4 = Math.min(i4, point.y);
            i2 = Math.max(i2, point.y);
        }
        return new Rect(i3, i4, i, i2);
    }

    /* renamed from: i */
    public final String mo14966i() {
        return this.f13830a.mo20573C();
    }

    /* renamed from: k */
    public final String mo14967k() {
        return this.f13830a.mo20577r();
    }

    public final int zza() {
        return this.f13830a.mo20575o();
    }

    public final int zzb() {
        return this.f13830a.mo20576p();
    }
}
