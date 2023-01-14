package com.facebook.react.views.text;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.LruCache;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.react.views.text.d0 */
public class C3171d0 {

    /* renamed from: a */
    private static final TextPaint f8871a = new TextPaint(1);

    /* renamed from: b */
    private static final Object f8872b = new Object();

    /* renamed from: c */
    private static final LruCache<ReadableMapBuffer, Spannable> f8873c = new LruCache<>(100);

    /* renamed from: d */
    private static final ConcurrentHashMap<Integer, Spannable> f8874d = new ConcurrentHashMap<>();

    /* renamed from: com.facebook.react.views.text.d0$a */
    public static class C3172a {

        /* renamed from: a */
        protected int f8875a;

        /* renamed from: b */
        protected int f8876b;

        /* renamed from: c */
        protected C3189m f8877c;

        public C3172a(int i, int i2, C3189m mVar) {
            this.f8875a = i;
            this.f8876b = i2;
            this.f8877c = mVar;
        }

        /* renamed from: a */
        public void mo10327a(Spannable spannable, int i) {
            int i2 = this.f8875a;
            spannable.setSpan(this.f8877c, i2, this.f8876b, ((i << 16) & 16711680) | ((i2 == 0 ? 18 : 34) & -16711681));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0157  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m12447a(android.content.Context r18, com.facebook.react.common.mapbuffer.ReadableMapBuffer r19, android.text.SpannableStringBuilder r20, java.util.List<com.facebook.react.views.text.C3171d0.C3172a> r21) {
        /*
            r0 = r21
            short r1 = r19.mo8830A()
            r2 = 0
            r3 = 0
        L_0x0008:
            if (r3 >= r1) goto L_0x017a
            r4 = r19
            com.facebook.react.common.mapbuffer.ReadableMapBuffer r5 = r4.mo8833E(r3)
            int r6 = r20.length()
            r7 = 5
            com.facebook.react.common.mapbuffer.ReadableMapBuffer r7 = r5.mo8833E(r7)
            com.facebook.react.views.text.y r7 = com.facebook.react.views.text.C3204y.m12534b(r7)
            java.lang.String r8 = r5.mo8834G(r2)
            com.facebook.react.views.text.e0 r9 = r7.f9005q
            java.lang.String r8 = com.facebook.react.views.text.C3174e0.m12453e(r8, r9)
            r9 = r20
            r9.append(r8)
            int r8 = r20.length()
            r10 = 1
            boolean r11 = r5.mo8835I(r10)
            r12 = -1
            if (r11 == 0) goto L_0x003d
            int r11 = r5.mo8832C(r10)
            goto L_0x003e
        L_0x003d:
            r11 = -1
        L_0x003e:
            r13 = 2
            boolean r14 = r5.mo8835I(r13)
            if (r14 == 0) goto L_0x0077
            boolean r13 = r5.mo8840v(r13)
            if (r13 == 0) goto L_0x0077
            r6 = 3
            double r6 = r5.mo8831B(r6)
            float r6 = com.facebook.react.uimanager.C3038r.m12007d(r6)
            r7 = 4
            double r7 = r5.mo8831B(r7)
            float r5 = com.facebook.react.uimanager.C3038r.m12007d(r7)
            com.facebook.react.views.text.d0$a r7 = new com.facebook.react.views.text.d0$a
            int r8 = r20.length()
            int r8 = r8 - r10
            int r10 = r20.length()
            com.facebook.react.views.text.b0 r12 = new com.facebook.react.views.text.b0
            int r6 = (int) r6
            int r5 = (int) r5
            r12.<init>(r11, r6, r5)
            r7.<init>(r8, r10, r12)
            r0.add(r7)
            goto L_0x0175
        L_0x0077:
            if (r8 < r6) goto L_0x0175
            com.facebook.react.uimanager.u$d r5 = com.facebook.react.uimanager.C3046u.C3050d.LINK
            com.facebook.react.uimanager.u$d r10 = r7.f9013y
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto L_0x0093
            com.facebook.react.views.text.d0$a r5 = new com.facebook.react.views.text.d0$a
            com.facebook.react.views.text.i r10 = new com.facebook.react.views.text.i
            int r13 = r7.f8995g
            r10.<init>(r11, r13)
            r5.<init>(r6, r8, r10)
        L_0x008f:
            r0.add(r5)
            goto L_0x00a4
        L_0x0093:
            boolean r5 = r7.f8993e
            if (r5 == 0) goto L_0x00a4
            com.facebook.react.views.text.d0$a r5 = new com.facebook.react.views.text.d0$a
            com.facebook.react.views.text.k r10 = new com.facebook.react.views.text.k
            int r13 = r7.f8995g
            r10.<init>(r13)
            r5.<init>(r6, r8, r10)
            goto L_0x008f
        L_0x00a4:
            boolean r5 = r7.f8996h
            if (r5 == 0) goto L_0x00b7
            com.facebook.react.views.text.d0$a r5 = new com.facebook.react.views.text.d0$a
            com.facebook.react.views.text.g r10 = new com.facebook.react.views.text.g
            int r13 = r7.f8997i
            r10.<init>(r13)
            r5.<init>(r6, r8, r10)
            r0.add(r5)
        L_0x00b7:
            float r5 = r7.mo10417k()
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x00d2
            com.facebook.react.views.text.d0$a r5 = new com.facebook.react.views.text.d0$a
            com.facebook.react.views.text.a r10 = new com.facebook.react.views.text.a
            float r13 = r7.mo10417k()
            r10.<init>(r13)
            r5.<init>(r6, r8, r10)
            r0.add(r5)
        L_0x00d2:
            com.facebook.react.views.text.d0$a r5 = new com.facebook.react.views.text.d0$a
            com.facebook.react.views.text.f r10 = new com.facebook.react.views.text.f
            int r13 = r7.f8999k
            r10.<init>(r13)
            r5.<init>(r6, r8, r10)
            r0.add(r5)
            int r5 = r7.f8986A
            if (r5 != r12) goto L_0x00ed
            int r5 = r7.f8987B
            if (r5 != r12) goto L_0x00ed
            java.lang.String r5 = r7.f8988C
            if (r5 == 0) goto L_0x0109
        L_0x00ed:
            com.facebook.react.views.text.d0$a r5 = new com.facebook.react.views.text.d0$a
            com.facebook.react.views.text.c r10 = new com.facebook.react.views.text.c
            int r13 = r7.f8986A
            int r14 = r7.f8987B
            java.lang.String r15 = r7.f8989D
            java.lang.String r12 = r7.f8988C
            android.content.res.AssetManager r17 = r18.getAssets()
            r16 = r12
            r12 = r10
            r12.<init>(r13, r14, r15, r16, r17)
            r5.<init>(r6, r8, r10)
            r0.add(r5)
        L_0x0109:
            boolean r5 = r7.f9010v
            if (r5 == 0) goto L_0x011a
            com.facebook.react.views.text.d0$a r5 = new com.facebook.react.views.text.d0$a
            com.facebook.react.views.text.v r10 = new com.facebook.react.views.text.v
            r10.<init>()
            r5.<init>(r6, r8, r10)
            r0.add(r5)
        L_0x011a:
            boolean r5 = r7.f9011w
            if (r5 == 0) goto L_0x012b
            com.facebook.react.views.text.d0$a r5 = new com.facebook.react.views.text.d0$a
            com.facebook.react.views.text.n r10 = new com.facebook.react.views.text.n
            r10.<init>()
            r5.<init>(r6, r8, r10)
            r0.add(r5)
        L_0x012b:
            float r5 = r7.f9006r
            r10 = 0
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0138
            float r5 = r7.f9007s
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x014d
        L_0x0138:
            com.facebook.react.views.text.d0$a r5 = new com.facebook.react.views.text.d0$a
            com.facebook.react.views.text.x r10 = new com.facebook.react.views.text.x
            float r12 = r7.f9006r
            float r13 = r7.f9007s
            float r14 = r7.f9008t
            int r15 = r7.f9009u
            r10.<init>(r12, r13, r14, r15)
            r5.<init>(r6, r8, r10)
            r0.add(r5)
        L_0x014d:
            float r5 = r7.mo10416e()
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x0168
            com.facebook.react.views.text.d0$a r5 = new com.facebook.react.views.text.d0$a
            com.facebook.react.views.text.b r10 = new com.facebook.react.views.text.b
            float r7 = r7.mo10416e()
            r10.<init>(r7)
            r5.<init>(r6, r8, r10)
            r0.add(r5)
        L_0x0168:
            com.facebook.react.views.text.d0$a r5 = new com.facebook.react.views.text.d0$a
            com.facebook.react.views.text.o r7 = new com.facebook.react.views.text.o
            r7.<init>(r11)
            r5.<init>(r6, r8, r7)
            r0.add(r5)
        L_0x0175:
            int r3 = r3 + 1
            short r3 = (short) r3
            goto L_0x0008
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.C3171d0.m12447a(android.content.Context, com.facebook.react.common.mapbuffer.ReadableMapBuffer, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* renamed from: b */
    private static Spannable m12448b(Context context, ReadableMapBuffer readableMapBuffer, C3199t tVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<C3172a> arrayList = new ArrayList<>();
        m12447a(context, readableMapBuffer.mo8833E(2), spannableStringBuilder, arrayList);
        int i = 0;
        for (C3172a a : arrayList) {
            a.mo10327a(spannableStringBuilder, i);
            i++;
        }
        if (tVar != null) {
            tVar.mo10414a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    /* renamed from: c */
    public static Spannable m12449c(Context context, ReadableMapBuffer readableMapBuffer, C3199t tVar) {
        Object obj = f8872b;
        synchronized (obj) {
            LruCache<ReadableMapBuffer, Spannable> lruCache = f8873c;
            Spannable spannable = lruCache.get(readableMapBuffer);
            if (spannable != null) {
                return spannable;
            }
            Spannable b = m12448b(context, readableMapBuffer, tVar);
            synchronized (obj) {
                lruCache.put(readableMapBuffer, b);
            }
            return b;
        }
    }

    /* renamed from: d */
    public static boolean m12450d(ReadableMapBuffer readableMapBuffer) {
        ReadableMapBuffer E = readableMapBuffer.mo8833E(2);
        return E.mo8830A() != 0 && C3204y.m12541j(E.mo8833E(0).mo8833E(5).mo8834G(21)) == 1;
    }
}
