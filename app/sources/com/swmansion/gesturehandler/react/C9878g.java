package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import p174e.p446g.p448b.C10200h;
import p174e.p446g.p448b.C10204i;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.gesturehandler.react.g */
public final class C9878g implements C10204i {

    /* renamed from: a */
    public static final C9879a f26428a = new C9879a((C10452g) null);

    /* renamed from: b */
    private final SparseArray<int[]> f26429b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<int[]> f26430c = new SparseArray<>();

    /* renamed from: com.swmansion.gesturehandler.react.g$a */
    public static final class C9879a {
        private C9879a() {
        }

        public /* synthetic */ C9879a(C10452g gVar) {
            this();
        }
    }

    /* renamed from: f */
    private final int[] m33667f(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        C10457l.m35317b(array);
        C10457l.m35319d(array, "config.getArray(key)!!");
        int size = array.size();
        int[] iArr = new int[size];
        int i = size - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                iArr[i2] = array.getInt(i2);
                if (i3 > i) {
                    break;
                }
                i2 = i3;
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public boolean mo24722a(C10200h<?> hVar, C10200h<?> hVar2) {
        C10457l.m35320e(hVar, "handler");
        C10457l.m35320e(hVar2, "otherHandler");
        return false;
    }

    /* renamed from: b */
    public boolean mo24723b(C10200h<?> hVar, C10200h<?> hVar2) {
        C10457l.m35320e(hVar, "handler");
        C10457l.m35320e(hVar2, "otherHandler");
        int[] iArr = this.f26430c.get(hVar.mo25428O());
        if (iArr == null) {
            return false;
        }
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == hVar2.mo25428O()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo24724c(C10200h<?> hVar, C10200h<?> hVar2) {
        C10457l.m35320e(hVar, "handler");
        C10457l.m35320e(hVar2, "otherHandler");
        int[] iArr = this.f26429b.get(hVar.mo25428O());
        if (iArr == null) {
            return false;
        }
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iArr[i] == hVar2.mo25428O()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean mo24725d(C10200h<?> hVar, C10200h<?> hVar2) {
        C10457l.m35320e(hVar, "handler");
        C10457l.m35320e(hVar2, "otherHandler");
        return false;
    }

    /* renamed from: e */
    public final void mo24726e(C10200h<?> hVar, ReadableMap readableMap) {
        C10457l.m35320e(hVar, "handler");
        C10457l.m35320e(readableMap, "config");
        hVar.mo25456t0(this);
        if (readableMap.hasKey("waitFor")) {
            this.f26429b.put(hVar.mo25428O(), m33667f(readableMap, "waitFor"));
        }
        if (readableMap.hasKey("simultaneousHandlers")) {
            this.f26430c.put(hVar.mo25428O(), m33667f(readableMap, "simultaneousHandlers"));
        }
    }

    /* renamed from: g */
    public final void mo24727g(int i) {
        this.f26429b.remove(i);
        this.f26430c.remove(i);
    }

    /* renamed from: h */
    public final void mo24728h() {
        this.f26429b.clear();
        this.f26430c.clear();
    }
}
