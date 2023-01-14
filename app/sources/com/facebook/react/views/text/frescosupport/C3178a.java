package com.facebook.react.views.text.frescosupport;

import android.content.Context;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.views.text.C3164a0;
import com.facebook.react.views.text.C3192p;
import java.util.Locale;
import p174e.p247e.p274h.p281c.C6174b;

/* renamed from: com.facebook.react.views.text.frescosupport.a */
public class C3178a extends C3192p {

    /* renamed from: A */
    private Uri f8887A;

    /* renamed from: B */
    private ReadableMap f8888B;

    /* renamed from: C */
    private final C6174b f8889C;

    /* renamed from: D */
    private final Object f8890D;

    /* renamed from: E */
    private float f8891E = Float.NaN;

    /* renamed from: F */
    private String f8892F;

    /* renamed from: G */
    private float f8893G = Float.NaN;

    /* renamed from: H */
    private int f8894H = 0;

    public C3178a(C6174b bVar, Object obj) {
        this.f8889C = bVar;
        this.f8890D = obj;
    }

    /* renamed from: u1 */
    private static Uri m12457u1(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return new Uri.Builder().scheme("res").path(String.valueOf(context.getResources().getIdentifier(str.toLowerCase(Locale.getDefault()).replace("-", "_"), "drawable", context.getPackageName()))).build();
    }

    /* renamed from: q1 */
    public C3164a0 mo10330q1() {
        return new C3179b(mo9506I().getResources(), (int) Math.ceil((double) this.f8893G), (int) Math.ceil((double) this.f8891E), this.f8894H, mo10338v1(), mo10337t1(), mo10332s1(), mo10331r1(), this.f8892F);
    }

    /* renamed from: r1 */
    public Object mo10331r1() {
        return this.f8890D;
    }

    /* renamed from: s1 */
    public C6174b mo10332s1() {
        return this.f8889C;
    }

    @C2991a(name = "headers")
    public void setHeaders(ReadableMap readableMap) {
        this.f8888B = readableMap;
    }

    public void setHeight(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f8893G = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based height");
    }

    @C2991a(name = "resizeMode")
    public void setResizeMode(String str) {
        this.f8892F = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r1.getScheme() == null) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0035  */
    @com.facebook.react.uimanager.p120j1.C2991a(name = "src")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSource(com.facebook.react.bridge.ReadableArray r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L_0x0016
            int r1 = r4.size()
            if (r1 != 0) goto L_0x000a
            goto L_0x0016
        L_0x000a:
            r1 = 0
            com.facebook.react.bridge.ReadableMap r4 = r4.getMap(r1)
            java.lang.String r1 = "uri"
            java.lang.String r4 = r4.getString(r1)
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            if (r4 == 0) goto L_0x0031
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0026 }
            java.lang.String r2 = r1.getScheme()     // Catch:{ Exception -> 0x0024 }
            if (r2 != 0) goto L_0x0024
            goto L_0x0027
        L_0x0024:
            r0 = r1
            goto L_0x0027
        L_0x0026:
        L_0x0027:
            if (r0 != 0) goto L_0x0031
            com.facebook.react.uimanager.o0 r0 = r3.mo9506I()
            android.net.Uri r0 = m12457u1(r0, r4)
        L_0x0031:
            android.net.Uri r4 = r3.f8887A
            if (r0 == r4) goto L_0x0038
            r3.mo9621x0()
        L_0x0038:
            r3.f8887A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.frescosupport.C3178a.setSource(com.facebook.react.bridge.ReadableArray):void");
    }

    @C2991a(name = "tintColor")
    public void setTintColor(int i) {
        this.f8894H = i;
    }

    public void setWidth(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Number) {
            this.f8891E = (float) dynamic.asDouble();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Inline images must not have percentage based width");
    }

    /* renamed from: t1 */
    public ReadableMap mo10337t1() {
        return this.f8888B;
    }

    /* renamed from: v1 */
    public Uri mo10338v1() {
        return this.f8887A;
    }

    /* renamed from: w */
    public boolean mo9551w() {
        return true;
    }
}
