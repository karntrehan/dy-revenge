package org.reactnative.facedetector;

import android.graphics.PointF;
import android.graphics.Rect;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import p174e.p319f.p406d.p411b.p414c.C9633a;
import p174e.p319f.p406d.p411b.p414c.C9639f;

/* renamed from: org.reactnative.facedetector.a */
public class C10996a {

    /* renamed from: a */
    private static final String[] f28816a = {"bottomMouthPosition", "leftCheekPosition", "leftEarPosition", "leftEarTipPosition", "leftEyePosition", "leftMouthPosition", "noseBasePosition", "rightCheekPosition", "rightEarPosition", "rightEarTipPosition", "rightEyePosition", "rightMouthPosition"};

    /* renamed from: a */
    public static WritableMap m37300a(WritableMap writableMap) {
        writableMap.putDouble("rollAngle", ((-writableMap.getDouble("rollAngle")) + 360.0d) % 360.0d);
        writableMap.putDouble("yawAngle", ((-writableMap.getDouble("yawAngle")) + 360.0d) % 360.0d);
        return writableMap;
    }

    /* renamed from: b */
    public static WritableMap m37301b(PointF pointF, double d, double d2, int i, int i2, int i3, int i4) {
        WritableMap createMap = Arguments.createMap();
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        float f = pointF.x;
        float f2 = (float) (i / 2);
        if (f < f2 || f > f2) {
            valueOf.floatValue();
            int i5 = i3 / 2;
        }
        float f3 = pointF.y;
        float f4 = (float) (i2 / 2);
        if (f3 < f4 || f3 > f4) {
            valueOf2.floatValue();
            int i6 = i4 / 2;
        }
        createMap.putDouble("x", ((double) pointF.x) * d);
        createMap.putDouble("y", ((double) pointF.y) * d2);
        return createMap;
    }

    /* renamed from: c */
    public static WritableMap m37302c(ReadableMap readableMap, int i, double d) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        createMap.putDouble("x", m37307h(readableMap.getDouble("x"), i, d));
        return createMap;
    }

    /* renamed from: d */
    public static WritableMap m37303d(ReadableMap readableMap, double d) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        createMap.putDouble("x", readableMap.getDouble("x") + d);
        return createMap;
    }

    /* renamed from: e */
    public static WritableMap m37304e(WritableMap writableMap, int i, double d) {
        ReadableMap map = writableMap.getMap("bounds");
        WritableMap d2 = m37303d(m37302c(map.getMap("origin"), i, d), -map.getMap("size").getDouble("width"));
        WritableMap createMap = Arguments.createMap();
        createMap.merge(map);
        createMap.putMap("origin", d2);
        for (String str : f28816a) {
            ReadableMap map2 = writableMap.hasKey(str) ? writableMap.getMap(str) : null;
            if (map2 != null) {
                writableMap.putMap(str, m37302c(map2, i, d));
            }
        }
        writableMap.putMap("bounds", createMap);
        return writableMap;
    }

    /* renamed from: f */
    public static WritableMap m37305f(C9633a aVar) {
        return m37306g(aVar, 1.0d, 1.0d, 0, 0, 0, 0);
    }

    /* renamed from: g */
    public static WritableMap m37306g(C9633a aVar, double d, double d2, int i, int i2, int i3, int i4) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("faceID", aVar.mo24147k().intValue());
        createMap.putDouble("rollAngle", (double) aVar.mo24142f());
        createMap.putDouble("yawAngle", (double) aVar.mo24141e());
        if (aVar.mo24146j().floatValue() >= 0.0f) {
            createMap.putDouble("smilingProbability", (double) aVar.mo24146j().floatValue());
        }
        if (aVar.mo24144h().floatValue() >= 0.0f) {
            createMap.putDouble("leftEyeOpenProbability", (double) aVar.mo24144h().floatValue());
        }
        if (aVar.mo24145i().floatValue() >= 0.0f) {
            createMap.putDouble("rightEyeOpenProbability", (double) aVar.mo24145i().floatValue());
        }
        for (C9639f next : aVar.mo24137a()) {
            createMap.putMap(f28816a[next.mo24173a()], m37301b(next.mo24174b(), d, d2, i, i2, i3, i4));
        }
        WritableMap createMap2 = Arguments.createMap();
        Rect b = aVar.mo24138b();
        int i5 = b.left;
        int i6 = b.top;
        int i7 = i / 2;
        if (i5 < i7) {
            i5 += i3 / 2;
        } else if (i5 > i7) {
            i5 -= i3 / 2;
        }
        int i8 = i2 / 2;
        if (i6 < i8) {
            i6 += i4 / 2;
        } else if (i6 > i8) {
            i6 -= i4 / 2;
        }
        createMap2.putDouble("x", ((double) i5) * d);
        createMap2.putDouble("y", ((double) i6) * d2);
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("width", ((double) b.width()) * d);
        createMap3.putDouble("height", ((double) b.height()) * d2);
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putMap("origin", createMap2);
        createMap4.putMap("size", createMap3);
        createMap.putMap("bounds", createMap4);
        return createMap;
    }

    /* renamed from: h */
    public static double m37307h(double d, int i, double d2) {
        return (((double) i) - (d / d2)) * d2;
    }
}
