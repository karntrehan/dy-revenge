package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.react.animated.i */
class C2618i extends C2636s {

    /* renamed from: i */
    private static final Pattern f7685i = Pattern.compile("[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?");

    /* renamed from: j */
    private final double[] f7686j;

    /* renamed from: k */
    private final double[] f7687k;

    /* renamed from: l */
    private String f7688l;

    /* renamed from: m */
    private double[][] f7689m;

    /* renamed from: n */
    private final boolean f7690n;

    /* renamed from: o */
    private final Matcher f7691o;

    /* renamed from: p */
    private final String f7692p;

    /* renamed from: q */
    private final String f7693q;

    /* renamed from: r */
    private C2636s f7694r;

    /* renamed from: s */
    private boolean f7695s;

    /* renamed from: t */
    private int f7696t;

    public C2618i(ReadableMap readableMap) {
        this.f7686j = m10815o(readableMap.getArray("inputRange"));
        ReadableArray array = readableMap.getArray("outputRange");
        boolean z = array.getType(0) == ReadableType.String;
        this.f7690n = z;
        if (z) {
            int size = array.size();
            this.f7687k = new double[size];
            String string = array.getString(0);
            this.f7688l = string;
            this.f7695s = string.startsWith("rgb");
            this.f7691o = f7685i.matcher(this.f7688l);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                Matcher matcher = f7685i.matcher(array.getString(i));
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
                while (matcher.find()) {
                    arrayList2.add(Double.valueOf(Double.parseDouble(matcher.group())));
                }
                this.f7687k[i] = ((Double) arrayList2.get(0)).doubleValue();
            }
            int size2 = ((ArrayList) arrayList.get(0)).size();
            this.f7696t = size2;
            this.f7689m = new double[size2][];
            for (int i2 = 0; i2 < this.f7696t; i2++) {
                double[] dArr = new double[size];
                this.f7689m[i2] = dArr;
                for (int i3 = 0; i3 < size; i3++) {
                    dArr[i3] = ((Double) ((ArrayList) arrayList.get(i3)).get(i2)).doubleValue();
                }
            }
        } else {
            this.f7687k = m10815o(array);
            this.f7691o = null;
        }
        this.f7692p = readableMap.getString("extrapolateLeft");
        this.f7693q = readableMap.getString("extrapolateRight");
    }

    /* renamed from: n */
    private static int m10814n(double d, double[] dArr) {
        int i = 1;
        while (i < dArr.length - 1 && dArr[i] < d) {
            i++;
        }
        return i - 1;
    }

    /* renamed from: o */
    private static double[] m10815o(ReadableArray readableArray) {
        int size = readableArray.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = readableArray.getDouble(i);
        }
        return dArr;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (r1.equals("clamp") == false) goto L_0x0069;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static double m10816p(double r13, double r15, double r17, double r19, double r21, java.lang.String r23, java.lang.String r24) {
        /*
            r0 = r23
            r1 = r24
            java.lang.String r2 = "Invalid extrapolation type "
            r3 = 2
            java.lang.String r4 = "clamp"
            r5 = 1
            java.lang.String r6 = "identity"
            r7 = 0
            java.lang.String r8 = "extend"
            r9 = -1
            int r10 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r10 >= 0) goto L_0x005a
            r23.hashCode()
            int r11 = r23.hashCode()
            switch(r11) {
                case -1289044198: goto L_0x0032;
                case -135761730: goto L_0x0029;
                case 94742715: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            r11 = -1
            goto L_0x003a
        L_0x0020:
            boolean r11 = r0.equals(r4)
            if (r11 != 0) goto L_0x0027
            goto L_0x001e
        L_0x0027:
            r11 = 2
            goto L_0x003a
        L_0x0029:
            boolean r11 = r0.equals(r6)
            if (r11 != 0) goto L_0x0030
            goto L_0x001e
        L_0x0030:
            r11 = 1
            goto L_0x003a
        L_0x0032:
            boolean r11 = r0.equals(r8)
            if (r11 != 0) goto L_0x0039
            goto L_0x001e
        L_0x0039:
            r11 = 0
        L_0x003a:
            switch(r11) {
                case 0: goto L_0x005a;
                case 1: goto L_0x0059;
                case 2: goto L_0x0057;
                default: goto L_0x003d;
            }
        L_0x003d:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r1 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "for left extrapolation"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        L_0x0057:
            r11 = r15
            goto L_0x005b
        L_0x0059:
            return r13
        L_0x005a:
            r11 = r13
        L_0x005b:
            int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a4
            r24.hashCode()
            int r0 = r24.hashCode()
            switch(r0) {
                case -1289044198: goto L_0x007b;
                case -135761730: goto L_0x0072;
                case 94742715: goto L_0x006b;
                default: goto L_0x0069;
            }
        L_0x0069:
            r3 = -1
            goto L_0x0083
        L_0x006b:
            boolean r0 = r1.equals(r4)
            if (r0 != 0) goto L_0x0083
            goto L_0x0069
        L_0x0072:
            boolean r0 = r1.equals(r6)
            if (r0 != 0) goto L_0x0079
            goto L_0x0069
        L_0x0079:
            r3 = 1
            goto L_0x0083
        L_0x007b:
            boolean r0 = r1.equals(r8)
            if (r0 != 0) goto L_0x0082
            goto L_0x0069
        L_0x0082:
            r3 = 0
        L_0x0083:
            switch(r3) {
                case 0: goto L_0x00a4;
                case 1: goto L_0x00a3;
                case 2: goto L_0x00a0;
                default: goto L_0x0086;
            }
        L_0x0086:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r0 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = "for right extrapolation"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L_0x00a0:
            r11 = r17
            goto L_0x00a4
        L_0x00a3:
            return r11
        L_0x00a4:
            int r0 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r0 != 0) goto L_0x00a9
            return r19
        L_0x00a9:
            int r0 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r0 != 0) goto L_0x00b1
            if (r10 > 0) goto L_0x00b0
            return r19
        L_0x00b0:
            return r21
        L_0x00b1:
            double r0 = r21 - r19
            double r11 = r11 - r15
            double r0 = r0 * r11
            double r2 = r17 - r15
            double r0 = r0 / r2
            double r0 = r19 + r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.C2618i.m10816p(double, double, double, double, double, java.lang.String, java.lang.String):double");
    }

    /* renamed from: q */
    static double m10817q(double d, double[] dArr, double[] dArr2, String str, String str2) {
        int n = m10814n(d, dArr);
        int i = n + 1;
        return m10816p(d, dArr[n], dArr[i], dArr2[n], dArr2[i], str, str2);
    }

    /* renamed from: b */
    public void mo8424b(C2611b bVar) {
        if (this.f7694r != null) {
            throw new IllegalStateException("Parent already attached");
        } else if (bVar instanceof C2636s) {
            this.f7694r = (C2636s) bVar;
        } else {
            throw new IllegalArgumentException("Parent is of an invalid type");
        }
    }

    /* renamed from: c */
    public void mo8425c(C2611b bVar) {
        if (bVar == this.f7694r) {
            this.f7694r = null;
            return;
        }
        throw new IllegalArgumentException("Invalid parent node provided");
    }

    /* renamed from: d */
    public String mo8421d() {
        return "InterpolationAnimatedNode[" + this.f7660d + "] super: " + super.mo8421d();
    }

    /* renamed from: g */
    public void mo8422g() {
        String str;
        String str2;
        C2636s sVar = this.f7694r;
        if (sVar != null) {
            double k = sVar.mo8464k();
            double q = m10817q(k, this.f7686j, this.f7687k, this.f7692p, this.f7693q);
            this.f7758f = q;
            if (this.f7690n) {
                if (this.f7696t > 1) {
                    StringBuffer stringBuffer = new StringBuffer(this.f7688l.length());
                    this.f7691o.reset();
                    int i = 0;
                    while (this.f7691o.find()) {
                        int i2 = i + 1;
                        double q2 = m10817q(k, this.f7686j, this.f7689m[i], this.f7692p, this.f7693q);
                        if (this.f7695s) {
                            boolean z = i2 == 4;
                            if (z) {
                                q2 *= 1000.0d;
                            }
                            int round = (int) Math.round(q2);
                            if (z) {
                                q2 = ((double) round) / 1000.0d;
                            } else {
                                str2 = Integer.toString(round);
                                this.f7691o.appendReplacement(stringBuffer, str2);
                                i = i2;
                            }
                        } else {
                            int i3 = (int) q2;
                            if (((double) i3) == q2) {
                                str2 = Integer.toString(i3);
                                this.f7691o.appendReplacement(stringBuffer, str2);
                                i = i2;
                            }
                        }
                        str2 = Double.toString(q2);
                        this.f7691o.appendReplacement(stringBuffer, str2);
                        i = i2;
                    }
                    this.f7691o.appendTail(stringBuffer);
                    str = stringBuffer.toString();
                } else {
                    str = this.f7691o.replaceFirst(String.valueOf(q));
                }
                this.f7757e = str;
            }
        }
    }
}
