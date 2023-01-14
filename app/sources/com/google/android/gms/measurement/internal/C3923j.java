package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.j */
public final class C3923j {

    /* renamed from: a */
    public static final C3923j f10811a = new C3923j((Boolean) null, (Boolean) null);

    /* renamed from: b */
    private final EnumMap f10812b;

    public C3923j(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(C3910i.class);
        this.f10812b = enumMap;
        enumMap.put(C3910i.AD_STORAGE, bool);
        enumMap.put(C3910i.ANALYTICS_STORAGE, bool2);
    }

    public C3923j(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(C3910i.class);
        this.f10812b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* renamed from: a */
    public static C3923j m14934a(Bundle bundle) {
        if (bundle == null) {
            return f10811a;
        }
        EnumMap enumMap = new EnumMap(C3910i.class);
        for (C3910i iVar : C3910i.values()) {
            enumMap.put(iVar, m14939n(bundle.getString(iVar.f10774r)));
        }
        return new C3923j(enumMap);
    }

    /* renamed from: b */
    public static C3923j m14935b(String str) {
        EnumMap enumMap = new EnumMap(C3910i.class);
        if (str != null) {
            int i = 0;
            while (true) {
                C3910i[] iVarArr = C3910i.f10772p;
                int length = iVarArr.length;
                if (i >= 2) {
                    break;
                }
                C3910i iVar = iVarArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(iVar, bool);
                }
                i++;
            }
        }
        return new C3923j(enumMap);
    }

    /* renamed from: g */
    public static String m14936g(Bundle bundle) {
        String string;
        for (C3910i iVar : C3910i.values()) {
            if (bundle.containsKey(iVar.f10774r) && (string = bundle.getString(iVar.f10774r)) != null && m14939n(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m14937j(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: m */
    static final int m14938m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: n */
    private static Boolean m14939n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: c */
    public final C3923j mo12116c(C3923j jVar) {
        EnumMap enumMap = new EnumMap(C3910i.class);
        for (C3910i iVar : C3910i.values()) {
            Boolean bool = (Boolean) this.f10812b.get(iVar);
            Boolean bool2 = (Boolean) jVar.f10812b.get(iVar);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(iVar, bool);
        }
        return new C3923j(enumMap);
    }

    /* renamed from: d */
    public final C3923j mo12117d(C3923j jVar) {
        EnumMap enumMap = new EnumMap(C3910i.class);
        for (C3910i iVar : C3910i.values()) {
            Boolean bool = (Boolean) this.f10812b.get(iVar);
            if (bool == null) {
                bool = (Boolean) jVar.f10812b.get(iVar);
            }
            enumMap.put(iVar, bool);
        }
        return new C3923j(enumMap);
    }

    /* renamed from: e */
    public final Boolean mo12118e() {
        return (Boolean) this.f10812b.get(C3910i.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3923j)) {
            return false;
        }
        C3923j jVar = (C3923j) obj;
        for (C3910i iVar : C3910i.values()) {
            if (m14938m((Boolean) this.f10812b.get(iVar)) != m14938m((Boolean) jVar.f10812b.get(iVar))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo12120f() {
        return (Boolean) this.f10812b.get(C3910i.ANALYTICS_STORAGE);
    }

    /* renamed from: h */
    public final String mo12121h() {
        StringBuilder sb = new StringBuilder("G1");
        C3910i[] iVarArr = C3910i.f10772p;
        int length = iVarArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f10812b.get(iVarArr[i]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean m : this.f10812b.values()) {
            i = (i * 31) + m14938m(m);
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo12123i(C3910i iVar) {
        Boolean bool = (Boolean) this.f10812b.get(iVar);
        return bool == null || bool.booleanValue();
    }

    /* renamed from: k */
    public final boolean mo12124k(C3923j jVar) {
        return mo12125l(jVar, (C3910i[]) this.f10812b.keySet().toArray(new C3910i[0]));
    }

    /* renamed from: l */
    public final boolean mo12125l(C3923j jVar, C3910i... iVarArr) {
        for (C3910i iVar : iVarArr) {
            Boolean bool = (Boolean) this.f10812b.get(iVar);
            Boolean bool2 = (Boolean) jVar.f10812b.get(iVar);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        C3910i[] values = C3910i.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            C3910i iVar = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(iVar.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f10812b.get(iVar);
            sb.append(bool == null ? "uninitialized" : true != bool.booleanValue() ? "denied" : "granted");
        }
        return sb.toString();
    }
}
