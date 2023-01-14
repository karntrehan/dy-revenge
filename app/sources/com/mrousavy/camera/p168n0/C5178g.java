package com.mrousavy.camera.p168n0;

import android.util.Range;
import android.util.Size;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.n0.g */
public final class C5178g {

    /* renamed from: a */
    private final List<Range<Integer>> f14658a;

    /* renamed from: b */
    private final Size f14659b;

    /* renamed from: c */
    private final Size f14660c;

    public C5178g(ReadableMap readableMap) {
        Class<?> cls;
        C10457l.m35320e(readableMap, "map");
        ReadableArray array = readableMap.getArray("frameRateRanges");
        C10457l.m35317b(array);
        ArrayList<Object> arrayList = array.toArrayList();
        C10457l.m35319d(arrayList, "map.getArray(\"frameRateRanges\")!!.toArrayList()");
        ArrayList arrayList2 = new ArrayList(C10351m.m35147p(arrayList, 10));
        for (T next : arrayList) {
            if (next instanceof HashMap) {
                Map map = (Map) next;
                arrayList2.add(C5179h.m19458a(map.get("minFrameRate"), map.get("maxFrameRate")));
            } else {
                String str = null;
                if (!(next == null || (cls = next.getClass()) == null)) {
                    str = cls.getName();
                }
                throw new IllegalArgumentException(C10457l.m35326k("DeviceFormat: frameRateRanges contained a Range that was not of type HashMap<*,*>! Actual Type: ", str));
            }
        }
        this.f14658a = arrayList2;
        this.f14659b = new Size(readableMap.getInt("photoWidth"), readableMap.getInt("photoHeight"));
        this.f14660c = new Size(readableMap.getInt("videoWidth"), readableMap.getInt("videoHeight"));
    }

    /* renamed from: a */
    public final List<Range<Integer>> mo15776a() {
        return this.f14658a;
    }

    /* renamed from: b */
    public final Size mo15777b() {
        return this.f14659b;
    }

    /* renamed from: c */
    public final Size mo15778c() {
        return this.f14660c;
    }
}
