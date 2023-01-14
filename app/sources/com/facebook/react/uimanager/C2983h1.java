package com.facebook.react.uimanager;

import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.facebook.react.uimanager.h1 */
public class C2983h1 {

    /* renamed from: a */
    public static final int[] f8306a = {8, 4, 5, 1, 3, 0, 2};

    /* renamed from: b */
    public static final int[] f8307b = {8, 7, 6, 4, 5, 1, 3, 0, 2};

    /* renamed from: c */
    public static final int[] f8308c = {4, 5, 1, 3};

    /* renamed from: d */
    private static final HashSet<String> f8309d = new HashSet<>(Arrays.asList(new String[]{"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd"}));

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m11837a(com.facebook.react.bridge.ReadableMap r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            java.util.HashSet<java.lang.String> r2 = f8309d
            boolean r2 = r2.contains(r1)
            r3 = 1
            if (r2 == 0) goto L_0x000e
            return r3
        L_0x000e:
            java.lang.String r2 = "pointerEvents"
            boolean r2 = r2.equals(r1)
            r4 = 0
            if (r2 == 0) goto L_0x002e
            java.lang.String r0 = r19.getString(r20)
            java.lang.String r1 = "auto"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x002d
            java.lang.String r1 = "box-none"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r3 = 0
        L_0x002d:
            return r3
        L_0x002e:
            r20.hashCode()
            int r5 = r20.hashCode()
            java.lang.String r6 = "overflow"
            java.lang.String r7 = "borderLeftWidth"
            java.lang.String r8 = "borderLeftColor"
            java.lang.String r9 = "opacity"
            java.lang.String r10 = "borderBottomWidth"
            java.lang.String r11 = "borderBottomColor"
            java.lang.String r12 = "borderTopWidth"
            java.lang.String r13 = "borderTopColor"
            java.lang.String r14 = "borderRightWidth"
            java.lang.String r15 = "borderRightColor"
            java.lang.String r2 = "borderWidth"
            switch(r5) {
                case -1989576717: goto L_0x00d4;
                case -1971292586: goto L_0x00c9;
                case -1470826662: goto L_0x00be;
                case -1452542531: goto L_0x00b3;
                case -1308858324: goto L_0x00a8;
                case -1290574193: goto L_0x009d;
                case -1267206133: goto L_0x0092;
                case -242276144: goto L_0x0087;
                case -223992013: goto L_0x007b;
                case 529642498: goto L_0x006e;
                case 741115130: goto L_0x0061;
                case 1349188574: goto L_0x0052;
                default: goto L_0x004e;
            }
        L_0x004e:
            r16 = -1
            goto L_0x00de
        L_0x0052:
            java.lang.String r5 = "borderRadius"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x005b
            goto L_0x004e
        L_0x005b:
            r1 = 11
            r16 = 11
            goto L_0x00de
        L_0x0061:
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0068
            goto L_0x004e
        L_0x0068:
            r1 = 10
            r16 = 10
            goto L_0x00de
        L_0x006e:
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0075
            goto L_0x004e
        L_0x0075:
            r1 = 9
            r16 = 9
            goto L_0x00de
        L_0x007b:
            boolean r1 = r1.equals(r7)
            if (r1 != 0) goto L_0x0082
            goto L_0x004e
        L_0x0082:
            r1 = 8
            r16 = 8
            goto L_0x00de
        L_0x0087:
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x008e
            goto L_0x004e
        L_0x008e:
            r1 = 7
            r16 = 7
            goto L_0x00de
        L_0x0092:
            boolean r1 = r1.equals(r9)
            if (r1 != 0) goto L_0x0099
            goto L_0x004e
        L_0x0099:
            r1 = 6
            r16 = 6
            goto L_0x00de
        L_0x009d:
            boolean r1 = r1.equals(r10)
            if (r1 != 0) goto L_0x00a4
            goto L_0x004e
        L_0x00a4:
            r1 = 5
            r16 = 5
            goto L_0x00de
        L_0x00a8:
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x00af
            goto L_0x004e
        L_0x00af:
            r1 = 4
            r16 = 4
            goto L_0x00de
        L_0x00b3:
            boolean r1 = r1.equals(r12)
            if (r1 != 0) goto L_0x00ba
            goto L_0x004e
        L_0x00ba:
            r1 = 3
            r16 = 3
            goto L_0x00de
        L_0x00be:
            boolean r1 = r1.equals(r13)
            if (r1 != 0) goto L_0x00c5
            goto L_0x004e
        L_0x00c5:
            r1 = 2
            r16 = 2
            goto L_0x00de
        L_0x00c9:
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x00d1
            goto L_0x004e
        L_0x00d1:
            r16 = 1
            goto L_0x00de
        L_0x00d4:
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x00dc
            goto L_0x004e
        L_0x00dc:
            r16 = 0
        L_0x00de:
            r17 = 0
            switch(r16) {
                case 0: goto L_0x01c0;
                case 1: goto L_0x01af;
                case 2: goto L_0x01a0;
                case 3: goto L_0x018f;
                case 4: goto L_0x0180;
                case 5: goto L_0x016f;
                case 6: goto L_0x015c;
                case 7: goto L_0x014d;
                case 8: goto L_0x013c;
                case 9: goto L_0x0127;
                case 10: goto L_0x0116;
                case 11: goto L_0x00e4;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            return r4
        L_0x00e4:
            java.lang.String r1 = "backgroundColor"
            boolean r5 = r0.hasKey(r1)
            if (r5 == 0) goto L_0x0100
            com.facebook.react.bridge.ReadableType r5 = r0.getType(r1)
            com.facebook.react.bridge.ReadableType r6 = com.facebook.react.bridge.ReadableType.Number
            if (r5 != r6) goto L_0x00fb
            int r1 = r0.getInt(r1)
            if (r1 == 0) goto L_0x00fb
            return r4
        L_0x00fb:
            com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Null
            if (r5 == r1) goto L_0x0100
            return r4
        L_0x0100:
            boolean r1 = r0.hasKey(r2)
            if (r1 == 0) goto L_0x0115
            boolean r1 = r0.isNull(r2)
            if (r1 != 0) goto L_0x0115
            double r0 = r0.getDouble(r2)
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0115
            return r4
        L_0x0115:
            return r3
        L_0x0116:
            boolean r1 = r0.isNull(r2)
            if (r1 != 0) goto L_0x0126
            double r0 = r0.getDouble(r2)
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            r3 = 0
        L_0x0126:
            return r3
        L_0x0127:
            boolean r1 = r0.isNull(r6)
            if (r1 != 0) goto L_0x013b
            java.lang.String r0 = r0.getString(r6)
            java.lang.String r1 = "visible"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x013a
            goto L_0x013b
        L_0x013a:
            r3 = 0
        L_0x013b:
            return r3
        L_0x013c:
            boolean r1 = r0.isNull(r7)
            if (r1 != 0) goto L_0x014c
            double r0 = r0.getDouble(r7)
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x014b
            goto L_0x014c
        L_0x014b:
            r3 = 0
        L_0x014c:
            return r3
        L_0x014d:
            boolean r1 = r0.isNull(r8)
            if (r1 != 0) goto L_0x015a
            int r0 = r0.getInt(r8)
            if (r0 != 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r3 = 0
        L_0x015b:
            return r3
        L_0x015c:
            boolean r1 = r0.isNull(r9)
            if (r1 != 0) goto L_0x016e
            double r0 = r0.getDouble(r9)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x016d
            goto L_0x016e
        L_0x016d:
            r3 = 0
        L_0x016e:
            return r3
        L_0x016f:
            boolean r1 = r0.isNull(r10)
            if (r1 != 0) goto L_0x017f
            double r0 = r0.getDouble(r10)
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x017e
            goto L_0x017f
        L_0x017e:
            r3 = 0
        L_0x017f:
            return r3
        L_0x0180:
            boolean r1 = r0.isNull(r11)
            if (r1 != 0) goto L_0x018d
            int r0 = r0.getInt(r11)
            if (r0 != 0) goto L_0x018d
            goto L_0x018e
        L_0x018d:
            r3 = 0
        L_0x018e:
            return r3
        L_0x018f:
            boolean r1 = r0.isNull(r12)
            if (r1 != 0) goto L_0x019f
            double r0 = r0.getDouble(r12)
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x019e
            goto L_0x019f
        L_0x019e:
            r3 = 0
        L_0x019f:
            return r3
        L_0x01a0:
            boolean r1 = r0.isNull(r13)
            if (r1 != 0) goto L_0x01ad
            int r0 = r0.getInt(r13)
            if (r0 != 0) goto L_0x01ad
            goto L_0x01ae
        L_0x01ad:
            r3 = 0
        L_0x01ae:
            return r3
        L_0x01af:
            boolean r1 = r0.isNull(r14)
            if (r1 != 0) goto L_0x01bf
            double r0 = r0.getDouble(r14)
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 != 0) goto L_0x01be
            goto L_0x01bf
        L_0x01be:
            r3 = 0
        L_0x01bf:
            return r3
        L_0x01c0:
            boolean r1 = r0.isNull(r15)
            if (r1 != 0) goto L_0x01cd
            int r0 = r0.getInt(r15)
            if (r0 != 0) goto L_0x01cd
            goto L_0x01ce
        L_0x01cd:
            r3 = 0
        L_0x01ce:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C2983h1.m11837a(com.facebook.react.bridge.ReadableMap, java.lang.String):boolean");
    }
}
