package com.proyecto26.inappbrowser;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.C10878c;
import org.greenrobot.eventbus.C10893m;
import p027c.p041c.p042b.C1497b;
import p027c.p041c.p042b.C1498c;
import p027c.p064i.p065d.C1827a;

/* renamed from: com.proyecto26.inappbrowser.c */
public class C5211c {

    /* renamed from: a */
    private static final Pattern f14710a = Pattern.compile("^.+:.+/");

    /* renamed from: b */
    private Promise f14711b;

    /* renamed from: c */
    private Boolean f14712c;

    /* renamed from: d */
    private Activity f14713d;

    /* renamed from: com.proyecto26.inappbrowser.c$a */
    static /* synthetic */ class C5212a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14714a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f14714a = iArr;
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: c */
    private String m19506c(Context context) {
        List<ResolveInfo> d = m19507d(context);
        String a = C1497b.m6650a(context, Arrays.asList(new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.google.android.apps.chrome"}));
        return (a != null || d == null || d.size() <= 0) ? a : d.get(0).serviceInfo.packageName;
    }

    /* renamed from: d */
    private List<ResolveInfo> m19507d(Context context) {
        return context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
    }

    /* renamed from: g */
    private void m19508g() {
        if (!C10878c.m37003c().mo28478j(this)) {
            C10878c.m37003c().mo28480p(this);
        }
    }

    /* renamed from: h */
    private int m19509h(Context context, String str) {
        return f14710a.matcher(str).find() ? context.getResources().getIdentifier(str, (String) null, (String) null) : context.getResources().getIdentifier(str, "anim", context.getPackageName());
    }

    /* renamed from: j */
    private Boolean m19510j(int i) {
        return Boolean.valueOf(C1827a.m7753b(i) > 0.5d);
    }

    /* renamed from: k */
    private void m19511k() {
        if (C10878c.m37003c().mo28478j(this)) {
            C10878c.m37003c().mo28481r(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15800a(Context context, C1498c.C1499a aVar, ReadableMap readableMap) {
        int h = readableMap.hasKey("startEnter") ? m19509h(context, readableMap.getString("startEnter")) : -1;
        int h2 = readableMap.hasKey("startExit") ? m19509h(context, readableMap.getString("startExit")) : -1;
        int h3 = readableMap.hasKey("endEnter") ? m19509h(context, readableMap.getString("endEnter")) : -1;
        int h4 = readableMap.hasKey("endExit") ? m19509h(context, readableMap.getString("endExit")) : -1;
        if (!(h == -1 || h2 == -1)) {
            aVar.mo5558h(context, h, h2);
        }
        if (h3 != -1 && h4 != -1) {
            aVar.mo5555d(context, h3, h4);
        }
    }

    /* renamed from: b */
    public void mo15801b() {
        Promise promise = this.f14711b;
        if (promise != null) {
            if (this.f14713d == null) {
                promise.reject("InAppBrowser", "No activity");
                this.f14711b = null;
                return;
            }
            m19511k();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", "dismiss");
            this.f14711b.resolve(createMap);
            this.f14711b = null;
            Activity activity = this.f14713d;
            activity.startActivity(ChromeTabsManagerActivity.m19504b(activity));
        }
    }

    /* renamed from: e */
    public void mo15802e(Context context, Promise promise) {
        List<ResolveInfo> d = m19507d(context);
        promise.resolve(Boolean.valueOf(d != null && !d.isEmpty()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014f, code lost:
        if (android.text.TextUtils.isEmpty(r0) == false) goto L_0x0151;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo15803f(android.content.Context r11, com.facebook.react.bridge.ReadableMap r12, com.facebook.react.bridge.Promise r13, android.app.Activity r14) {
        /*
            r10 = this;
            java.lang.String r0 = "browserPackage"
            java.lang.String r1 = "url"
            java.lang.String r1 = r12.getString(r1)
            r10.f14713d = r14
            com.facebook.react.bridge.Promise r2 = r10.f14711b
            r3 = 0
            if (r2 == 0) goto L_0x0022
            com.facebook.react.bridge.WritableMap r11 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r12 = "type"
            java.lang.String r13 = "cancel"
            r11.putString(r12, r13)
            com.facebook.react.bridge.Promise r12 = r10.f14711b
            r12.resolve(r11)
            r10.f14711b = r3
            return
        L_0x0022:
            r10.f14711b = r13
            if (r14 != 0) goto L_0x0030
            java.lang.String r11 = "InAppBrowser"
            java.lang.String r12 = "No activity"
            r13.reject((java.lang.String) r11, (java.lang.String) r12)
            r10.f14711b = r3
            return
        L_0x0030:
            c.c.b.c$a r13 = new c.c.b.c$a
            r13.<init>()
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r10.f14712c = r14
            java.lang.String r7 = "toolbarColor"
            java.lang.String r8 = "setToolbarColor"
            java.lang.String r9 = "toolbar"
            r4 = r10
            r5 = r13
            r6 = r12
            java.lang.Integer r14 = r4.mo15804i(r5, r6, r7, r8, r9)
            if (r14 == 0) goto L_0x0052
            int r14 = r14.intValue()
            java.lang.Boolean r14 = r10.m19510j(r14)
            r10.f14712c = r14
        L_0x0052:
            java.lang.String r7 = "secondaryToolbarColor"
            java.lang.String r8 = "setSecondaryToolbarColor"
            java.lang.String r9 = "secondary toolbar"
            r4 = r10
            r5 = r13
            r6 = r12
            r4.mo15804i(r5, r6, r7, r8, r9)
            java.lang.String r7 = "navigationBarColor"
            java.lang.String r8 = "setNavigationBarColor"
            java.lang.String r9 = "navigation bar"
            r4.mo15804i(r5, r6, r7, r8, r9)
            java.lang.String r7 = "navigationBarDividerColor"
            java.lang.String r8 = "setNavigationBarDividerColor"
            java.lang.String r9 = "navigation bar divider"
            r4.mo15804i(r5, r6, r7, r8, r9)
            java.lang.String r14 = "enableDefaultShare"
            boolean r2 = r12.hasKey(r14)
            if (r2 == 0) goto L_0x0081
            boolean r14 = r12.getBoolean(r14)
            if (r14 == 0) goto L_0x0081
            r13.mo5552a()
        L_0x0081:
            java.lang.String r14 = "animations"
            boolean r2 = r12.hasKey(r14)
            if (r2 == 0) goto L_0x0090
            com.facebook.react.bridge.ReadableMap r14 = r12.getMap(r14)
            r10.mo15800a(r11, r13, r14)
        L_0x0090:
            java.lang.String r14 = "hasBackButton"
            boolean r2 = r12.hasKey(r14)
            if (r2 == 0) goto L_0x00b6
            boolean r14 = r12.getBoolean(r14)
            if (r14 == 0) goto L_0x00b6
            android.content.res.Resources r11 = r11.getResources()
            java.lang.Boolean r14 = r10.f14712c
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x00ad
            int r14 = com.proyecto26.inappbrowser.C5210b.f14708a
            goto L_0x00af
        L_0x00ad:
            int r14 = com.proyecto26.inappbrowser.C5210b.f14709b
        L_0x00af:
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeResource(r11, r14)
            r13.mo5554c(r11)
        L_0x00b6:
            c.c.b.c r11 = r13.mo5553b()
            android.content.Intent r14 = r11.f4659a
            java.lang.String r2 = "headers"
            boolean r3 = r12.hasKey(r2)
            r4 = 1
            if (r3 == 0) goto L_0x0100
            com.facebook.react.bridge.ReadableMap r2 = r12.getMap(r2)
            if (r2 == 0) goto L_0x0100
            com.facebook.react.bridge.ReadableMapKeySetIterator r3 = r2.keySetIterator()
            boolean r5 = r3.hasNextKey()
            if (r5 == 0) goto L_0x0100
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        L_0x00da:
            boolean r6 = r3.hasNextKey()
            if (r6 == 0) goto L_0x00fb
            java.lang.String r6 = r3.nextKey()
            com.facebook.react.bridge.ReadableType r7 = r2.getType(r6)
            int[] r8 = com.proyecto26.inappbrowser.C5211c.C5212a.f14714a
            int r7 = r7.ordinal()
            r7 = r8[r7]
            if (r7 == r4) goto L_0x00f3
            goto L_0x00da
        L_0x00f3:
            java.lang.String r7 = r2.getString(r6)
            r5.putString(r6, r7)
            goto L_0x00da
        L_0x00fb:
            java.lang.String r2 = "com.android.browser.headers"
            r14.putExtra(r2, r5)
        L_0x0100:
            java.lang.String r2 = "forceCloseOnRedirection"
            boolean r3 = r12.hasKey(r2)
            if (r3 == 0) goto L_0x0113
            boolean r2 = r12.getBoolean(r2)
            if (r2 == 0) goto L_0x0113
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r14.addFlags(r2)
        L_0x0113:
            java.lang.String r2 = "showInRecents"
            boolean r3 = r12.hasKey(r2)
            if (r3 == 0) goto L_0x0121
            boolean r2 = r12.getBoolean(r2)
            if (r2 != 0) goto L_0x012b
        L_0x0121:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r14.addFlags(r2)
            r2 = 1073741824(0x40000000, float:2.0)
            r14.addFlags(r2)
        L_0x012b:
            java.lang.String r2 = "enableUrlBarHiding"
            boolean r3 = r12.hasKey(r2)
            r5 = 0
            if (r3 == 0) goto L_0x013b
            boolean r2 = r12.getBoolean(r2)
            if (r2 == 0) goto L_0x013b
            goto L_0x013c
        L_0x013b:
            r4 = 0
        L_0x013c:
            java.lang.String r2 = "android.support.customtabs.extra.ENABLE_URLBAR_HIDING"
            r14.putExtra(r2, r4)
            boolean r2 = r12.hasKey(r0)     // Catch:{ Exception -> 0x015c }
            if (r2 == 0) goto L_0x0155
            java.lang.String r0 = r12.getString(r0)     // Catch:{ Exception -> 0x015c }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x015c }
            if (r2 != 0) goto L_0x0160
        L_0x0151:
            r14.setPackage(r0)     // Catch:{ Exception -> 0x015c }
            goto L_0x0160
        L_0x0155:
            android.app.Activity r0 = r10.f14713d     // Catch:{ Exception -> 0x015c }
            java.lang.String r0 = r10.m19506c(r0)     // Catch:{ Exception -> 0x015c }
            goto L_0x0151
        L_0x015c:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0160:
            r10.m19508g()
            android.net.Uri r0 = android.net.Uri.parse(r1)
            r14.setData(r0)
            java.lang.String r0 = "showTitle"
            boolean r1 = r12.hasKey(r0)
            if (r1 == 0) goto L_0x017a
            boolean r12 = r12.getBoolean(r0)
            r13.mo5557g(r12)
            goto L_0x017f
        L_0x017a:
            java.lang.String r12 = "android.support.customtabs.extra.TITLE_VISIBILITY"
            r14.putExtra(r12, r5)
        L_0x017f:
            android.app.Activity r12 = r10.f14713d
            android.content.Intent r13 = com.proyecto26.inappbrowser.ChromeTabsManagerActivity.m19505c(r12, r14)
            android.os.Bundle r11 = r11.f4660b
            r12.startActivity(r13, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.proyecto26.inappbrowser.C5211c.mo15803f(android.content.Context, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.Promise, android.app.Activity):void");
    }

    /* renamed from: i */
    public Integer mo15804i(C1498c.C1499a aVar, ReadableMap readableMap, String str, String str2, String str3) {
        String str4;
        Integer num = null;
        try {
            if (!readableMap.hasKey(str)) {
                return null;
            }
            str4 = readableMap.getString(str);
            try {
                num = Integer.valueOf(Color.parseColor(str4));
                aVar.getClass().getDeclaredMethod(str2, new Class[]{Integer.TYPE}).invoke(aVar, new Object[]{num});
                return num;
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
            str4 = null;
            try {
                if (!(e instanceof IllegalArgumentException)) {
                    return num;
                }
                throw new JSApplicationIllegalArgumentException("Invalid " + str3 + " color '" + str4 + "': " + e.getMessage());
            } catch (Throwable unused) {
                return num;
            }
        }
    }

    @C10893m
    public void onEvent(C5209a aVar) {
        m19511k();
        if (this.f14711b != null) {
            if (aVar.f14707c.booleanValue()) {
                this.f14711b.reject("InAppBrowser", aVar.f14705a);
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("type", aVar.f14706b);
                createMap.putString("message", aVar.f14705a);
                this.f14711b.resolve(createMap);
            }
            this.f14711b = null;
        }
    }
}
