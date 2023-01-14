package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

/* renamed from: com.facebook.react.views.text.j */
public class C3184j {

    /* renamed from: a */
    private static final String[] f8937a = {HttpUrl.FRAGMENT_ENCODE_SET, "_bold", "_italic", "_bold_italic"};

    /* renamed from: b */
    private static final String[] f8938b = {".ttf", ".otf"};

    /* renamed from: c */
    private static C3184j f8939c;

    /* renamed from: d */
    private final Map<String, C3186b> f8940d = new HashMap();

    /* renamed from: e */
    private final Map<String, Typeface> f8941e = new HashMap();

    /* renamed from: com.facebook.react.views.text.j$b */
    private static class C3186b {

        /* renamed from: a */
        private SparseArray<Typeface> f8942a;

        private C3186b() {
            this.f8942a = new SparseArray<>(4);
        }

        /* renamed from: a */
        public Typeface mo10369a(int i) {
            return this.f8942a.get(i);
        }

        /* renamed from: b */
        public void mo10370b(int i, Typeface typeface) {
            this.f8942a.put(i, typeface);
        }
    }

    private C3184j() {
    }

    /* renamed from: a */
    private static Typeface m12475a(String str, int i, AssetManager assetManager) {
        String str2 = f8937a[i];
        String[] strArr = f8938b;
        int length = strArr.length;
        int i2 = 0;
        while (i2 < length) {
            String str3 = strArr[i2];
            try {
                return Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
            } catch (RuntimeException unused) {
                i2++;
            }
        }
        return Typeface.create(str, i);
    }

    /* renamed from: b */
    public static C3184j m12476b() {
        if (f8939c == null) {
            f8939c = new C3184j();
        }
        return f8939c;
    }

    /* renamed from: c */
    public Typeface mo10367c(String str, int i, AssetManager assetManager) {
        return mo10368d(str, new C3177f0(i), assetManager);
    }

    /* renamed from: d */
    public Typeface mo10368d(String str, C3177f0 f0Var, AssetManager assetManager) {
        if (this.f8941e.containsKey(str)) {
            return f0Var.mo10328a(this.f8941e.get(str));
        }
        C3186b bVar = this.f8940d.get(str);
        if (bVar == null) {
            bVar = new C3186b();
            this.f8940d.put(str, bVar);
        }
        int b = f0Var.mo10329b();
        Typeface a = bVar.mo10369a(b);
        if (a != null) {
            return a;
        }
        Typeface a2 = m12475a(str, b, assetManager);
        bVar.mo10370b(b, a2);
        return a2;
    }
}
