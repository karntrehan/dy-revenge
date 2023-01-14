package com.facebook.react.views.image;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.C2944c;

/* renamed from: com.facebook.react.views.image.b */
public class C3098b extends C2944c<C3098b> {

    /* renamed from: h */
    private final int f8600h;

    /* renamed from: i */
    private final String f8601i;

    /* renamed from: j */
    private final String f8602j;

    /* renamed from: k */
    private final int f8603k;

    /* renamed from: l */
    private final int f8604l;

    /* renamed from: m */
    private final int f8605m;

    /* renamed from: n */
    private final int f8606n;

    private C3098b(int i, int i2, int i3) {
        this(i, i2, i3, (String) null, (String) null, 0, 0, 0, 0);
    }

    private C3098b(int i, int i2, int i3, String str, String str2, int i4, int i5, int i6, int i7) {
        super(i, i2);
        this.f8600h = i3;
        this.f8601i = str;
        this.f8602j = str2;
        this.f8603k = i4;
        this.f8604l = i5;
        this.f8605m = i6;
        this.f8606n = i7;
    }

    /* renamed from: A */
    public static String m12196A(int i) {
        if (i == 1) {
            return "topError";
        }
        if (i == 2) {
            return "topLoad";
        }
        if (i == 3) {
            return "topLoadEnd";
        }
        if (i == 4) {
            return "topLoadStart";
        }
        if (i == 5) {
            return "topProgress";
        }
        throw new IllegalStateException("Invalid image event: " + Integer.toString(i));
    }

    /* renamed from: u */
    public static final C3098b m12197u(int i, int i2, Throwable th) {
        return new C3098b(i, i2, 1, th.getMessage(), (String) null, 0, 0, 0, 0);
    }

    /* renamed from: v */
    private WritableMap m12198v() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", this.f8602j);
        createMap.putDouble("width", (double) this.f8603k);
        createMap.putDouble("height", (double) this.f8604l);
        return createMap;
    }

    /* renamed from: w */
    public static final C3098b m12199w(int i, int i2) {
        return new C3098b(i, i2, 3);
    }

    /* renamed from: x */
    public static final C3098b m12200x(int i, int i2, String str, int i3, int i4) {
        return new C3098b(i, i2, 2, (String) null, str, i3, i4, 0, 0);
    }

    /* renamed from: y */
    public static final C3098b m12201y(int i, int i2) {
        return new C3098b(i, i2, 4);
    }

    /* renamed from: z */
    public static final C3098b m12202z(int i, int i2, String str, int i3, int i4) {
        return new C3098b(i, i2, 5, (String) null, str, 0, 0, i3, i4);
    }

    /* renamed from: g */
    public short mo9637g() {
        return (short) this.f8600h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public WritableMap mo9629i() {
        WritableMap createMap = Arguments.createMap();
        int i = this.f8600h;
        if (i == 1) {
            createMap.putString("error", this.f8601i);
        } else if (i == 2) {
            createMap.putMap("source", m12198v());
        } else if (i == 5) {
            createMap.putInt("loaded", this.f8605m);
            createMap.putInt("total", this.f8606n);
        }
        return createMap;
    }

    /* renamed from: j */
    public String mo9630j() {
        return m12196A(this.f8600h);
    }
}
