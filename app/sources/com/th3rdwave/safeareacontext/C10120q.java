package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C3038r;
import java.util.Map;
import p455g.C10320p;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.th3rdwave.safeareacontext.q */
public final class C10120q {
    /* renamed from: a */
    public static final Map<String, Float> m34235a(C10107e eVar) {
        C10457l.m35320e(eVar, "insets");
        return C10334c0.m35035e(C10320p.m35019a("top", Float.valueOf(C3038r.m12004a(eVar.mo25165d()))), C10320p.m35019a("right", Float.valueOf(C3038r.m12004a(eVar.mo25164c()))), C10320p.m35019a("bottom", Float.valueOf(C3038r.m12004a(eVar.mo25162a()))), C10320p.m35019a("left", Float.valueOf(C3038r.m12004a(eVar.mo25163b()))));
    }

    /* renamed from: b */
    public static final WritableMap m34236b(C10107e eVar) {
        C10457l.m35320e(eVar, "insets");
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", (double) C3038r.m12004a(eVar.mo25165d()));
        createMap.putDouble("right", (double) C3038r.m12004a(eVar.mo25164c()));
        createMap.putDouble("bottom", (double) C3038r.m12004a(eVar.mo25162a()));
        createMap.putDouble("left", (double) C3038r.m12004a(eVar.mo25163b()));
        C10457l.m35319d(createMap, "insetsMap");
        return createMap;
    }

    /* renamed from: c */
    public static final Map<String, Float> m34237c(C10110g gVar) {
        C10457l.m35320e(gVar, "rect");
        return C10334c0.m35035e(C10320p.m35019a("x", Float.valueOf(C3038r.m12004a(gVar.mo25171c()))), C10320p.m35019a("y", Float.valueOf(C3038r.m12004a(gVar.mo25172d()))), C10320p.m35019a("width", Float.valueOf(C3038r.m12004a(gVar.mo25170b()))), C10320p.m35019a("height", Float.valueOf(C3038r.m12004a(gVar.mo25169a()))));
    }

    /* renamed from: d */
    public static final WritableMap m34238d(C10110g gVar) {
        C10457l.m35320e(gVar, "rect");
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", (double) C3038r.m12004a(gVar.mo25171c()));
        createMap.putDouble("y", (double) C3038r.m12004a(gVar.mo25172d()));
        createMap.putDouble("width", (double) C3038r.m12004a(gVar.mo25170b()));
        createMap.putDouble("height", (double) C3038r.m12004a(gVar.mo25169a()));
        C10457l.m35319d(createMap, "rectMap");
        return createMap;
    }
}
