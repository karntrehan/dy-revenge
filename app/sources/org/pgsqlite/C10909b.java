package org.pgsqlite;

import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: org.pgsqlite.b */
public abstract class C10909b {

    /* renamed from: org.pgsqlite.b$a */
    static /* synthetic */ class C10910a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28557a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28557a = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28557a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Boolean     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f28557a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f28557a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f28557a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Map     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f28557a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.pgsqlite.C10909b.C10910a.<clinit>():void");
        }
    }

    /* renamed from: a */
    static Object m37059a(ReadableArray readableArray, int i, Object obj) {
        if (readableArray == null) {
            return obj;
        }
        try {
            int i2 = C10910a.f28557a[readableArray.getType(i).ordinal()];
            if (i2 == 1) {
                return Double.valueOf(readableArray.getDouble(i));
            }
            if (i2 == 2) {
                return Boolean.valueOf(readableArray.getBoolean(i));
            }
            if (i2 == 3) {
                return readableArray.getString(i);
            }
            if (i2 == 5) {
                return readableArray.getMap(i);
            }
            if (i2 != 6) {
                return null;
            }
            return readableArray.getArray(i);
        } catch (NoSuchKeyException unused) {
            return obj;
        }
    }

    /* renamed from: b */
    static Object m37060b(ReadableMap readableMap, String str, Object obj) {
        if (readableMap == null) {
            return obj;
        }
        try {
            switch (C10910a.f28557a[readableMap.getType(str).ordinal()]) {
                case 1:
                    return Double.valueOf(readableMap.getDouble(str));
                case 2:
                    return Boolean.valueOf(readableMap.getBoolean(str));
                case 3:
                    return readableMap.getString(str);
                case 4:
                    return null;
                case 5:
                    return readableMap.getMap(str);
                case 6:
                    return readableMap.getArray(str);
                default:
                    return null;
            }
        } catch (NoSuchKeyException unused) {
            return obj;
        }
    }

    /* renamed from: c */
    static boolean m37061c(ReadableMap readableMap, String str, boolean z) {
        if (readableMap == null) {
            return z;
        }
        try {
            int i = C10910a.f28557a[readableMap.getType(str).ordinal()];
            if (i == 1) {
                return readableMap.getDouble(str) != 0.0d;
            }
            if (i == 2) {
                return readableMap.getBoolean(str);
            }
            if (i == 3) {
                String string = readableMap.getString(str);
                if ("true".equalsIgnoreCase(string)) {
                    return true;
                }
                boolean equalsIgnoreCase = "false".equalsIgnoreCase(string);
                return false;
            } else if (i != 4) {
                return z;
            } else {
                return false;
            }
        } catch (NoSuchKeyException unused) {
            return z;
        }
    }

    /* renamed from: d */
    static String m37062d(ReadableArray readableArray, int i, String str) {
        if (readableArray == null) {
            return str;
        }
        try {
            int i2 = C10910a.f28557a[readableArray.getType(i).ordinal()];
            if (i2 == 1) {
                double d = readableArray.getDouble(i);
                long j = (long) d;
                return d == ((double) j) ? String.valueOf(j) : String.valueOf(d);
            } else if (i2 == 2) {
                return String.valueOf(readableArray.getBoolean(i));
            } else {
                if (i2 == 3) {
                    return readableArray.getString(i);
                }
                if (i2 != 4) {
                    return str;
                }
                return null;
            }
        } catch (NoSuchKeyException unused) {
            return str;
        }
    }

    /* renamed from: e */
    static String m37063e(ReadableMap readableMap, String str, String str2) {
        if (readableMap == null) {
            return str2;
        }
        try {
            int i = C10910a.f28557a[readableMap.getType(str).ordinal()];
            if (i == 1) {
                double d = readableMap.getDouble(str);
                long j = (long) d;
                return d == ((double) j) ? String.valueOf(j) : String.valueOf(d);
            } else if (i == 2) {
                return String.valueOf(readableMap.getBoolean(str));
            } else {
                if (i == 3) {
                    return readableMap.getString(str);
                }
                if (i != 4) {
                    return str2;
                }
                return null;
            }
        } catch (NoSuchKeyException unused) {
            return str2;
        }
    }
}
