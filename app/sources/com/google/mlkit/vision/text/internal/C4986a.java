package com.google.mlkit.vision.text.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.util.Arrays;
import java.util.List;
import p174e.p319f.p320a.p335c.p345f.p358m.C8643e4;

/* renamed from: com.google.mlkit.vision.text.internal.a */
final class C4986a {
    /* renamed from: a */
    static Rect m18912a(List<Point> list) {
        int i = RecyclerView.UNDEFINED_DURATION;
        int i2 = RecyclerView.UNDEFINED_DURATION;
        int i3 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        int i4 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
        for (Point next : list) {
            i3 = Math.min(i3, next.x);
            i = Math.max(i, next.x);
            i4 = Math.min(i4, next.y);
            i2 = Math.max(i2, next.y);
        }
        return new Rect(i3, i4, i, i2);
    }

    /* renamed from: b */
    static List<Point> m18913b(C8643e4 e4Var) {
        Point[] pointArr = new Point[4];
        double sin = Math.sin(Math.toRadians((double) e4Var.f23686r));
        double cos = Math.cos(Math.toRadians((double) e4Var.f23686r));
        pointArr[0] = new Point(e4Var.f23682f, e4Var.f23683o);
        int i = e4Var.f23682f;
        double d = (double) e4Var.f23684p;
        Point point = new Point((int) (((double) i) + (d * cos)), (int) (((double) e4Var.f23683o) + (d * sin)));
        pointArr[1] = point;
        int i2 = e4Var.f23685q;
        pointArr[2] = new Point((int) (((double) point.x) - (((double) i2) * sin)), (int) (((double) pointArr[1].y) + (((double) i2) * cos)));
        pointArr[3] = new Point(pointArr[0].x + (pointArr[2].x - pointArr[1].x), pointArr[0].y + (pointArr[2].y - pointArr[1].y));
        return Arrays.asList(pointArr);
    }
}
