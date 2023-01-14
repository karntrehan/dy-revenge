package com.facebook.react.bridge;

import androidx.core.util.Pools$SimplePool;

public class DynamicFromMap implements Dynamic {
    private static final ThreadLocal<Pools$SimplePool<DynamicFromMap>> sPool = new ThreadLocal<Pools$SimplePool<DynamicFromMap>>() {
        /* access modifiers changed from: protected */
        public Pools$SimplePool<DynamicFromMap> initialValue() {
            return new Pools$SimplePool<>(10);
        }
    };
    private ReadableMap mMap;
    private String mName;

    private DynamicFromMap() {
    }

    public static DynamicFromMap create(ReadableMap readableMap, String str) {
        DynamicFromMap dynamicFromMap = (DynamicFromMap) sPool.get().mo3702b();
        if (dynamicFromMap == null) {
            dynamicFromMap = new DynamicFromMap();
        }
        dynamicFromMap.mMap = readableMap;
        dynamicFromMap.mName = str;
        return dynamicFromMap;
    }

    public ReadableArray asArray() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getArray(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public boolean asBoolean() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getBoolean(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public double asDouble() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getDouble(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public int asInt() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getInt(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public ReadableMap asMap() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getMap(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public String asString() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getString(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public ReadableType getType() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.getType(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public boolean isNull() {
        String str;
        ReadableMap readableMap = this.mMap;
        if (readableMap != null && (str = this.mName) != null) {
            return readableMap.isNull(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    public void recycle() {
        this.mMap = null;
        this.mName = null;
        sPool.get().mo3701a(this);
    }
}