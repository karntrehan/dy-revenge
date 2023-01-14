package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.yoga.C3307g;
import com.facebook.yoga.C3314n;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.react.views.text.c0 */
public class C3168c0 {

    /* renamed from: a */
    private static final String f8863a = "c0";

    /* renamed from: b */
    private static final TextPaint f8864b = new TextPaint(1);

    /* renamed from: c */
    private static final Object f8865c = new Object();

    /* renamed from: d */
    private static final LruCache<ReadableNativeMap, Spannable> f8866d = new LruCache<>(100);

    /* renamed from: e */
    private static final ConcurrentHashMap<Integer, Spannable> f8867e = new ConcurrentHashMap<>();

    /* renamed from: com.facebook.react.views.text.c0$a */
    public static class C3169a {

        /* renamed from: a */
        protected int f8868a;

        /* renamed from: b */
        protected int f8869b;

        /* renamed from: c */
        protected C3189m f8870c;

        public C3169a(int i, int i2, C3189m mVar) {
            this.f8868a = i;
            this.f8869b = i2;
            this.f8870c = mVar;
        }

        /* renamed from: a */
        public void mo10326a(Spannable spannable, int i) {
            int i2 = this.f8868a;
            spannable.setSpan(this.f8870c, i2, this.f8869b, ((i << 16) & 16711680) | ((i2 == 0 ? 18 : 34) & -16711681));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x016a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m12434a(android.content.Context r18, com.facebook.react.bridge.ReadableArray r19, android.text.SpannableStringBuilder r20, java.util.List<com.facebook.react.views.text.C3168c0.C3169a> r21) {
        /*
            r0 = r21
            int r1 = r19.size()
            r2 = 0
        L_0x0007:
            if (r2 >= r1) goto L_0x0191
            r3 = r19
            com.facebook.react.bridge.ReadableMap r4 = r3.getMap(r2)
            int r5 = r20.length()
            com.facebook.react.uimanager.f0 r6 = new com.facebook.react.uimanager.f0
            java.lang.String r7 = "textAttributes"
            com.facebook.react.bridge.ReadableMap r7 = r4.getMap(r7)
            r6.<init>(r7)
            com.facebook.react.views.text.y r6 = com.facebook.react.views.text.C3204y.m12533a(r6)
            java.lang.String r7 = "string"
            java.lang.String r7 = r4.getString(r7)
            com.facebook.react.views.text.e0 r8 = r6.f9005q
            java.lang.String r7 = com.facebook.react.views.text.C3174e0.m12453e(r7, r8)
            r8 = r20
            r8.append(r7)
            int r7 = r20.length()
            java.lang.String r9 = "reactTag"
            boolean r10 = r4.hasKey(r9)
            r11 = -1
            if (r10 == 0) goto L_0x0045
            int r9 = r4.getInt(r9)
            goto L_0x0046
        L_0x0045:
            r9 = -1
        L_0x0046:
            java.lang.String r10 = "isAttachment"
            boolean r12 = r4.hasKey(r10)
            if (r12 == 0) goto L_0x0083
            boolean r10 = r4.getBoolean(r10)
            if (r10 == 0) goto L_0x0083
            java.lang.String r5 = "width"
            double r5 = r4.getDouble(r5)
            float r5 = com.facebook.react.uimanager.C3038r.m12007d(r5)
            java.lang.String r6 = "height"
            double r6 = r4.getDouble(r6)
            float r4 = com.facebook.react.uimanager.C3038r.m12007d(r6)
            com.facebook.react.views.text.c0$a r6 = new com.facebook.react.views.text.c0$a
            int r7 = r20.length()
            int r7 = r7 + -1
            int r10 = r20.length()
            com.facebook.react.views.text.b0 r11 = new com.facebook.react.views.text.b0
            int r5 = (int) r5
            int r4 = (int) r4
            r11.<init>(r9, r5, r4)
            r6.<init>(r7, r10, r11)
            r0.add(r6)
            goto L_0x0189
        L_0x0083:
            if (r7 < r5) goto L_0x0189
            com.facebook.react.uimanager.u$d r4 = com.facebook.react.uimanager.C3046u.C3050d.LINK
            com.facebook.react.uimanager.u$d r10 = r6.f9013y
            boolean r4 = r4.equals(r10)
            if (r4 == 0) goto L_0x009f
            com.facebook.react.views.text.c0$a r4 = new com.facebook.react.views.text.c0$a
            com.facebook.react.views.text.i r10 = new com.facebook.react.views.text.i
            int r12 = r6.f8995g
            r10.<init>(r9, r12)
            r4.<init>(r5, r7, r10)
        L_0x009b:
            r0.add(r4)
            goto L_0x00b0
        L_0x009f:
            boolean r4 = r6.f8993e
            if (r4 == 0) goto L_0x00b0
            com.facebook.react.views.text.c0$a r4 = new com.facebook.react.views.text.c0$a
            com.facebook.react.views.text.k r10 = new com.facebook.react.views.text.k
            int r12 = r6.f8995g
            r10.<init>(r12)
            r4.<init>(r5, r7, r10)
            goto L_0x009b
        L_0x00b0:
            boolean r4 = r6.f8996h
            if (r4 == 0) goto L_0x00c3
            com.facebook.react.views.text.c0$a r4 = new com.facebook.react.views.text.c0$a
            com.facebook.react.views.text.g r10 = new com.facebook.react.views.text.g
            int r12 = r6.f8997i
            r10.<init>(r12)
            r4.<init>(r5, r7, r10)
            r0.add(r4)
        L_0x00c3:
            float r4 = r6.mo10417k()
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L_0x00de
            com.facebook.react.views.text.c0$a r4 = new com.facebook.react.views.text.c0$a
            com.facebook.react.views.text.a r10 = new com.facebook.react.views.text.a
            float r12 = r6.mo10417k()
            r10.<init>(r12)
            r4.<init>(r5, r7, r10)
            r0.add(r4)
        L_0x00de:
            com.facebook.react.views.text.c0$a r4 = new com.facebook.react.views.text.c0$a
            com.facebook.react.views.text.f r10 = new com.facebook.react.views.text.f
            int r12 = r6.f8999k
            r10.<init>(r12)
            r4.<init>(r5, r7, r10)
            r0.add(r4)
            int r4 = r6.f8986A
            if (r4 != r11) goto L_0x00fd
            int r4 = r6.f8987B
            if (r4 != r11) goto L_0x00fd
            java.lang.String r4 = r6.f8988C
            if (r4 == 0) goto L_0x00fa
            goto L_0x00fd
        L_0x00fa:
            r17 = r1
            goto L_0x011c
        L_0x00fd:
            com.facebook.react.views.text.c0$a r4 = new com.facebook.react.views.text.c0$a
            com.facebook.react.views.text.c r15 = new com.facebook.react.views.text.c
            int r11 = r6.f8986A
            int r12 = r6.f8987B
            java.lang.String r13 = r6.f8989D
            java.lang.String r14 = r6.f8988C
            android.content.res.AssetManager r16 = r18.getAssets()
            r10 = r15
            r17 = r1
            r1 = r15
            r15 = r16
            r10.<init>(r11, r12, r13, r14, r15)
            r4.<init>(r5, r7, r1)
            r0.add(r4)
        L_0x011c:
            boolean r1 = r6.f9010v
            if (r1 == 0) goto L_0x012d
            com.facebook.react.views.text.c0$a r1 = new com.facebook.react.views.text.c0$a
            com.facebook.react.views.text.v r4 = new com.facebook.react.views.text.v
            r4.<init>()
            r1.<init>(r5, r7, r4)
            r0.add(r1)
        L_0x012d:
            boolean r1 = r6.f9011w
            if (r1 == 0) goto L_0x013e
            com.facebook.react.views.text.c0$a r1 = new com.facebook.react.views.text.c0$a
            com.facebook.react.views.text.n r4 = new com.facebook.react.views.text.n
            r4.<init>()
            r1.<init>(r5, r7, r4)
            r0.add(r1)
        L_0x013e:
            float r1 = r6.f9006r
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x014b
            float r1 = r6.f9007s
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0160
        L_0x014b:
            com.facebook.react.views.text.c0$a r1 = new com.facebook.react.views.text.c0$a
            com.facebook.react.views.text.x r4 = new com.facebook.react.views.text.x
            float r10 = r6.f9006r
            float r11 = r6.f9007s
            float r12 = r6.f9008t
            int r13 = r6.f9009u
            r4.<init>(r10, r11, r12, r13)
            r1.<init>(r5, r7, r4)
            r0.add(r1)
        L_0x0160:
            float r1 = r6.mo10416e()
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x017b
            com.facebook.react.views.text.c0$a r1 = new com.facebook.react.views.text.c0$a
            com.facebook.react.views.text.b r4 = new com.facebook.react.views.text.b
            float r6 = r6.mo10416e()
            r4.<init>(r6)
            r1.<init>(r5, r7, r4)
            r0.add(r1)
        L_0x017b:
            com.facebook.react.views.text.c0$a r1 = new com.facebook.react.views.text.c0$a
            com.facebook.react.views.text.o r4 = new com.facebook.react.views.text.o
            r4.<init>(r9)
            r1.<init>(r5, r7, r4)
            r0.add(r1)
            goto L_0x018b
        L_0x0189:
            r17 = r1
        L_0x018b:
            int r2 = r2 + 1
            r1 = r17
            goto L_0x0007
        L_0x0191:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.C3168c0.m12434a(android.content.Context, com.facebook.react.bridge.ReadableArray, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* renamed from: b */
    private static Layout m12435b(Spannable spannable, BoringLayout.Metrics metrics, float f, C3314n nVar, boolean z, int i, int i2) {
        StaticLayout.Builder builder;
        int i3;
        Spannable spannable2 = spannable;
        BoringLayout.Metrics metrics2 = metrics;
        float f2 = f;
        boolean z2 = z;
        int i4 = i;
        int i5 = i2;
        int length = spannable.length();
        boolean z3 = nVar == C3314n.UNDEFINED || f2 < 0.0f;
        TextPaint textPaint = f8864b;
        float desiredWidth = metrics2 == null ? Layout.getDesiredWidth(spannable2, textPaint) : Float.NaN;
        if (metrics2 == null && (z3 || (!C3307g.m12971a(desiredWidth) && desiredWidth <= f2))) {
            int ceil = (int) Math.ceil((double) desiredWidth);
            if (Build.VERSION.SDK_INT < 23) {
                return new StaticLayout(spannable, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, z);
            }
            builder = StaticLayout.Builder.obtain(spannable2, 0, length, textPaint, ceil).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(z2).setBreakStrategy(i4).setHyphenationFrequency(i5);
        } else if (metrics2 == null || (!z3 && ((float) metrics2.width) > f2)) {
            int i6 = Build.VERSION.SDK_INT;
            if (i6 < 23) {
                return new StaticLayout(spannable, textPaint, (int) f2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, z);
            }
            builder = StaticLayout.Builder.obtain(spannable2, 0, length, textPaint, (int) f2).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(z2).setBreakStrategy(i4).setHyphenationFrequency(i5);
            if (i6 >= 28) {
                builder.setUseLineSpacingFromFallbacks(true);
            }
        } else {
            int i7 = metrics2.width;
            if (i7 < 0) {
                String str = f8863a;
                ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Text width is invalid: " + metrics2.width));
                i3 = 0;
            } else {
                i3 = i7;
            }
            return BoringLayout.make(spannable, textPaint, i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, metrics, z);
        }
        return builder.build();
    }

    /* renamed from: c */
    private static Spannable m12436c(Context context, ReadableMap readableMap, C3199t tVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<C3169a> arrayList = new ArrayList<>();
        m12434a(context, readableMap.getArray("fragments"), spannableStringBuilder, arrayList);
        int i = 0;
        for (C3169a a : arrayList) {
            a.mo10326a(spannableStringBuilder, i);
            i++;
        }
        if (tVar != null) {
            tVar.mo10414a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    /* renamed from: d */
    public static void m12437d(int i) {
        f8867e.remove(Integer.valueOf(i));
    }

    /* renamed from: e */
    public static Spannable m12438e(Context context, ReadableMap readableMap, C3199t tVar) {
        Object obj = f8865c;
        synchronized (obj) {
            LruCache<ReadableNativeMap, Spannable> lruCache = f8866d;
            Spannable spannable = lruCache.get((ReadableNativeMap) readableMap);
            if (spannable != null) {
                return spannable;
            }
            Spannable c = m12436c(context, readableMap, tVar);
            synchronized (obj) {
                lruCache.put((ReadableNativeMap) readableMap, c);
            }
            return c;
        }
    }

    /* renamed from: f */
    public static boolean m12439f(ReadableMap readableMap) {
        ReadableArray array = readableMap.getArray("fragments");
        return array.size() > 0 && C3204y.m12541j(array.getMap(0).getMap("textAttributes").getString("layoutDirection")) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        if (r3 > r21) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bb, code lost:
        if (r1 > r23) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0151, code lost:
        if (r6 != false) goto L_0x0153;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m12440g(android.content.Context r18, com.facebook.react.bridge.ReadableMap r19, com.facebook.react.bridge.ReadableMap r20, float r21, com.facebook.yoga.C3314n r22, float r23, com.facebook.yoga.C3314n r24, com.facebook.react.views.text.C3199t r25, float[] r26) {
        /*
            r0 = r19
            r1 = r20
            r9 = r22
            r10 = r24
            android.text.TextPaint r2 = f8864b
            java.lang.String r3 = "cacheId"
            boolean r4 = r0.hasKey(r3)
            if (r4 == 0) goto L_0x0030
            int r0 = r0.getInt(r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, android.text.Spannable> r3 = f8867e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            boolean r4 = r3.containsKey(r4)
            if (r4 == 0) goto L_0x002d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r3.get(r0)
            android.text.Spannable r0 = (android.text.Spannable) r0
            goto L_0x0038
        L_0x002d:
            r0 = 0
            return r0
        L_0x0030:
            r3 = r18
            r4 = r25
            android.text.Spannable r0 = m12438e(r3, r0, r4)
        L_0x0038:
            java.lang.String r3 = "textBreakStrategy"
            java.lang.String r3 = r1.getString(r3)
            int r7 = com.facebook.react.views.text.C3204y.m12544n(r3)
            java.lang.String r3 = "includeFontPadding"
            boolean r4 = r1.hasKey(r3)
            r11 = 1
            if (r4 == 0) goto L_0x0051
            boolean r3 = r1.getBoolean(r3)
            r6 = r3
            goto L_0x0052
        L_0x0051:
            r6 = 1
        L_0x0052:
            java.lang.String r3 = "android_hyphenationFrequency"
            java.lang.String r3 = r1.getString(r3)
            int r8 = com.facebook.react.views.text.C3204y.m12538g(r3)
            if (r0 == 0) goto L_0x0182
            android.text.BoringLayout$Metrics r3 = android.text.BoringLayout.isBoring(r0, r2)
            r2 = r0
            r4 = r21
            r5 = r22
            android.text.Layout r2 = m12435b(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r3 = "maximumNumberOfLines"
            boolean r4 = r1.hasKey(r3)
            r5 = -1
            if (r4 == 0) goto L_0x0079
            int r1 = r1.getInt(r3)
            goto L_0x007a
        L_0x0079:
            r1 = -1
        L_0x007a:
            if (r1 == r5) goto L_0x0088
            if (r1 != 0) goto L_0x007f
            goto L_0x0088
        L_0x007f:
            int r3 = r2.getLineCount()
            int r1 = java.lang.Math.min(r1, r3)
            goto L_0x008c
        L_0x0088:
            int r1 = r2.getLineCount()
        L_0x008c:
            r3 = 0
            com.facebook.yoga.n r4 = com.facebook.yoga.C3314n.EXACTLY
            if (r9 != r4) goto L_0x0092
            goto L_0x00a9
        L_0x0092:
            r4 = 0
        L_0x0093:
            if (r4 >= r1) goto L_0x00a1
            float r7 = r2.getLineWidth(r4)
            int r8 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x009e
            r3 = r7
        L_0x009e:
            int r4 = r4 + 1
            goto L_0x0093
        L_0x00a1:
            com.facebook.yoga.n r4 = com.facebook.yoga.C3314n.AT_MOST
            if (r9 != r4) goto L_0x00ab
            int r4 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ab
        L_0x00a9:
            r3 = r21
        L_0x00ab:
            com.facebook.yoga.n r4 = com.facebook.yoga.C3314n.EXACTLY
            if (r10 == r4) goto L_0x00bd
            int r1 = r1 - r11
            int r1 = r2.getLineBottom(r1)
            float r1 = (float) r1
            com.facebook.yoga.n r4 = com.facebook.yoga.C3314n.AT_MOST
            if (r10 != r4) goto L_0x00bf
            int r4 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r4 <= 0) goto L_0x00bf
        L_0x00bd:
            r1 = r23
        L_0x00bf:
            r4 = 0
            r7 = 0
        L_0x00c1:
            int r8 = r0.length()
            if (r4 >= r8) goto L_0x0175
            int r8 = r0.length()
            java.lang.Class<com.facebook.react.views.text.b0> r9 = com.facebook.react.views.text.C3166b0.class
            int r8 = r0.nextSpanTransition(r4, r8, r9)
            java.lang.Class<com.facebook.react.views.text.b0> r9 = com.facebook.react.views.text.C3166b0.class
            java.lang.Object[] r4 = r0.getSpans(r4, r8, r9)
            com.facebook.react.views.text.b0[] r4 = (com.facebook.react.views.text.C3166b0[]) r4
            int r9 = r4.length
            r10 = 0
        L_0x00db:
            if (r10 >= r9) goto L_0x0172
            r12 = r4[r10]
            int r13 = r0.getSpanStart(r12)
            int r14 = r2.getLineForOffset(r13)
            int r15 = r2.getEllipsisCount(r14)
            if (r15 <= 0) goto L_0x00ef
            r15 = 1
            goto L_0x00f0
        L_0x00ef:
            r15 = 0
        L_0x00f0:
            if (r15 == 0) goto L_0x0107
            int r15 = r2.getLineStart(r14)
            int r16 = r2.getEllipsisStart(r14)
            int r15 = r15 + r16
            if (r13 < r15) goto L_0x0107
            int r15 = r2.getLineEnd(r14)
            if (r13 < r15) goto L_0x0105
            goto L_0x0107
        L_0x0105:
            r6 = 1
            goto L_0x016c
        L_0x0107:
            int r15 = r12.mo10321c()
            float r15 = (float) r15
            int r12 = r12.mo10319a()
            float r12 = (float) r12
            boolean r6 = r2.isRtlCharAt(r13)
            int r11 = r2.getParagraphDirection(r14)
            if (r11 != r5) goto L_0x011d
            r11 = 1
            goto L_0x011e
        L_0x011d:
            r11 = 0
        L_0x011e:
            int r16 = r0.length()
            r17 = 1
            int r5 = r16 + -1
            if (r13 != r5) goto L_0x0136
            if (r11 == 0) goto L_0x0131
            float r5 = r2.getLineWidth(r14)
            float r5 = r3 - r5
            goto L_0x0154
        L_0x0131:
            float r5 = r2.getLineRight(r14)
            goto L_0x0153
        L_0x0136:
            if (r11 != r6) goto L_0x013b
            r17 = 1
            goto L_0x013d
        L_0x013b:
            r17 = 0
        L_0x013d:
            if (r17 == 0) goto L_0x0144
            float r5 = r2.getPrimaryHorizontal(r13)
            goto L_0x0148
        L_0x0144:
            float r5 = r2.getSecondaryHorizontal(r13)
        L_0x0148:
            if (r11 == 0) goto L_0x0151
            float r11 = r2.getLineRight(r14)
            float r11 = r11 - r5
            float r5 = r3 - r11
        L_0x0151:
            if (r6 == 0) goto L_0x0154
        L_0x0153:
            float r5 = r5 - r15
        L_0x0154:
            int r6 = r2.getLineBaseline(r14)
            float r6 = (float) r6
            float r6 = r6 - r12
            int r11 = r7 * 2
            float r6 = com.facebook.react.uimanager.C3038r.m12004a(r6)
            r26[r11] = r6
            r6 = 1
            int r11 = r11 + r6
            float r5 = com.facebook.react.uimanager.C3038r.m12004a(r5)
            r26[r11] = r5
            int r7 = r7 + 1
        L_0x016c:
            int r10 = r10 + 1
            r5 = -1
            r11 = 1
            goto L_0x00db
        L_0x0172:
            r4 = r8
            goto L_0x00c1
        L_0x0175:
            float r0 = com.facebook.react.uimanager.C3038r.m12004a(r3)
            float r1 = com.facebook.react.uimanager.C3038r.m12004a(r1)
            long r0 = com.facebook.yoga.C3315o.m12981a(r0, r1)
            return r0
        L_0x0182:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Spannable element has not been prepared in onBeforeLayout"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.C3168c0.m12440g(android.content.Context, com.facebook.react.bridge.ReadableMap, com.facebook.react.bridge.ReadableMap, float, com.facebook.yoga.n, float, com.facebook.yoga.n, com.facebook.react.views.text.t, float[]):long");
    }

    /* renamed from: h */
    public static void m12441h(int i, Spannable spannable) {
        f8867e.put(Integer.valueOf(i), spannable);
    }
}
