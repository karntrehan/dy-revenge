package com.mrousavy.camera.p168n0;

import com.facebook.react.bridge.WritableMap;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.mrousavy.camera.n0.o */
public final class C5187o {
    /* renamed from: a */
    public static final void m19467a(WritableMap writableMap, String str, Double d) {
        C10457l.m35320e(writableMap, "<this>");
        C10457l.m35320e(str, "key");
        if (d == null) {
            writableMap.putNull(str);
        } else {
            writableMap.putDouble(str, d.doubleValue());
        }
    }

    /* renamed from: b */
    public static final void m19468b(WritableMap writableMap, String str, Integer num) {
        C10457l.m35320e(writableMap, "<this>");
        C10457l.m35320e(str, "key");
        if (num == null) {
            writableMap.putNull(str);
        } else {
            writableMap.putInt(str, num.intValue());
        }
    }
}
