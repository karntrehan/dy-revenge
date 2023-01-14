package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.facebook.react.uimanager.f0 */
public class C2962f0 {

    /* renamed from: a */
    final ReadableMap f8288a;

    public C2962f0(ReadableMap readableMap) {
        this.f8288a = readableMap;
    }

    /* renamed from: a */
    public ReadableArray mo9672a(String str) {
        return this.f8288a.getArray(str);
    }

    /* renamed from: b */
    public boolean mo9673b(String str, boolean z) {
        return this.f8288a.isNull(str) ? z : this.f8288a.getBoolean(str);
    }

    /* renamed from: c */
    public float mo9674c(String str, float f) {
        return this.f8288a.isNull(str) ? f : (float) this.f8288a.getDouble(str);
    }

    /* renamed from: d */
    public int mo9675d(String str, int i) {
        return this.f8288a.isNull(str) ? i : this.f8288a.getInt(str);
    }

    /* renamed from: e */
    public ReadableMap mo9676e(String str) {
        return this.f8288a.getMap(str);
    }

    /* renamed from: f */
    public String mo9677f(String str) {
        return this.f8288a.getString(str);
    }

    /* renamed from: g */
    public boolean mo9678g(String str) {
        return this.f8288a.hasKey(str);
    }

    public String toString() {
        return "{ " + C2962f0.class.getSimpleName() + ": " + this.f8288a.toString() + " }";
    }
}
