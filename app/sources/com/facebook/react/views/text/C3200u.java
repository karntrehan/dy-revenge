package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;

/* renamed from: com.facebook.react.views.text.u */
public class C3200u {
    /* renamed from: a */
    public static Typeface m12520a(Typeface typeface, int i, int i2, String str, AssetManager assetManager) {
        C3177f0 f0Var = new C3177f0(i, i2);
        if (str != null) {
            return C3184j.m12476b().mo10368d(str, f0Var, assetManager);
        }
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return f0Var.mo10328a(typeface);
    }

    /* renamed from: b */
    public static int m12521b(String str) {
        if (str == null) {
            return -1;
        }
        if ("italic".equals(str)) {
            return 2;
        }
        return "normal".equals(str) ? 0 : -1;
    }

    /* renamed from: c */
    public static String m12522c(ReadableArray readableArray) {
        String str;
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (string != null) {
                char c = 65535;
                switch (string.hashCode()) {
                    case -1195362251:
                        if (string.equals("proportional-nums")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1061392823:
                        if (string.equals("lining-nums")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -771984547:
                        if (string.equals("tabular-nums")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -659678800:
                        if (string.equals("oldstyle-nums")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1183323111:
                        if (string.equals("small-caps")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        str = "'pnum'";
                        break;
                    case 1:
                        str = "'lnum'";
                        break;
                    case 2:
                        str = "'tnum'";
                        break;
                    case 3:
                        str = "'onum'";
                        break;
                    case 4:
                        str = "'smcp'";
                        break;
                }
                arrayList.add(str);
            }
        }
        return TextUtils.join(", ", arrayList);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m12523d(java.lang.String r2) {
        /*
            r0 = -1
            if (r2 == 0) goto L_0x00aa
            int r1 = r2.hashCode()
            switch(r1) {
                case -1039745817: goto L_0x0081;
                case 48625: goto L_0x0076;
                case 49586: goto L_0x006b;
                case 50547: goto L_0x0060;
                case 51508: goto L_0x0055;
                case 52469: goto L_0x004a;
                case 53430: goto L_0x003f;
                case 54391: goto L_0x0034;
                case 55352: goto L_0x0027;
                case 56313: goto L_0x001a;
                case 3029637: goto L_0x000d;
                default: goto L_0x000a;
            }
        L_0x000a:
            r2 = -1
            goto L_0x008b
        L_0x000d:
            java.lang.String r1 = "bold"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0016
            goto L_0x000a
        L_0x0016:
            r2 = 10
            goto L_0x008b
        L_0x001a:
            java.lang.String r1 = "900"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0023
            goto L_0x000a
        L_0x0023:
            r2 = 9
            goto L_0x008b
        L_0x0027:
            java.lang.String r1 = "800"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0030
            goto L_0x000a
        L_0x0030:
            r2 = 8
            goto L_0x008b
        L_0x0034:
            java.lang.String r1 = "700"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x003d
            goto L_0x000a
        L_0x003d:
            r2 = 7
            goto L_0x008b
        L_0x003f:
            java.lang.String r1 = "600"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0048
            goto L_0x000a
        L_0x0048:
            r2 = 6
            goto L_0x008b
        L_0x004a:
            java.lang.String r1 = "500"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0053
            goto L_0x000a
        L_0x0053:
            r2 = 5
            goto L_0x008b
        L_0x0055:
            java.lang.String r1 = "400"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x005e
            goto L_0x000a
        L_0x005e:
            r2 = 4
            goto L_0x008b
        L_0x0060:
            java.lang.String r1 = "300"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0069
            goto L_0x000a
        L_0x0069:
            r2 = 3
            goto L_0x008b
        L_0x006b:
            java.lang.String r1 = "200"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x0074
            goto L_0x000a
        L_0x0074:
            r2 = 2
            goto L_0x008b
        L_0x0076:
            java.lang.String r1 = "100"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x007f
            goto L_0x000a
        L_0x007f:
            r2 = 1
            goto L_0x008b
        L_0x0081:
            java.lang.String r1 = "normal"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x008a
            goto L_0x000a
        L_0x008a:
            r2 = 0
        L_0x008b:
            switch(r2) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x00a4;
                case 2: goto L_0x00a1;
                case 3: goto L_0x009e;
                case 4: goto L_0x00a7;
                case 5: goto L_0x009b;
                case 6: goto L_0x0098;
                case 7: goto L_0x0095;
                case 8: goto L_0x0092;
                case 9: goto L_0x008f;
                case 10: goto L_0x0095;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x00aa
        L_0x008f:
            r2 = 900(0x384, float:1.261E-42)
            return r2
        L_0x0092:
            r2 = 800(0x320, float:1.121E-42)
            return r2
        L_0x0095:
            r2 = 700(0x2bc, float:9.81E-43)
            return r2
        L_0x0098:
            r2 = 600(0x258, float:8.41E-43)
            return r2
        L_0x009b:
            r2 = 500(0x1f4, float:7.0E-43)
            return r2
        L_0x009e:
            r2 = 300(0x12c, float:4.2E-43)
            return r2
        L_0x00a1:
            r2 = 200(0xc8, float:2.8E-43)
            return r2
        L_0x00a4:
            r2 = 100
            return r2
        L_0x00a7:
            r2 = 400(0x190, float:5.6E-43)
            return r2
        L_0x00aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.C3200u.m12523d(java.lang.String):int");
    }
}
