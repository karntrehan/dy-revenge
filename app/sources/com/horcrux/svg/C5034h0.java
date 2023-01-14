package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.p120j1.C2991a;
import java.text.Bidi;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.h0 */
class C5034h0 extends C5062u0 {

    /* renamed from: j1 */
    private Path f14090j1;

    /* renamed from: k1 */
    String f14091k1;

    /* renamed from: l1 */
    private C5037i0 f14092l1;

    /* renamed from: m1 */
    private final ArrayList<String> f14093m1 = new ArrayList<>();

    /* renamed from: n1 */
    private final ArrayList<Matrix> f14094n1 = new ArrayList<>();

    /* renamed from: o1 */
    private final AssetManager f14095o1 = this.f14336G.getResources().getAssets();

    /* renamed from: com.horcrux.svg.h0$a */
    static /* synthetic */ class C5035a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14096a;

        /* renamed from: b */
        static final /* synthetic */ int[] f14097b;

        /* renamed from: c */
        static final /* synthetic */ int[] f14098c;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|(2:41|42)|43|45|46|47|48|(3:49|50|52)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|(2:41|42)|43|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|(2:41|42)|43|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(47:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|45|46|47|48|49|50|52) */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|45|46|47|48|49|50|52) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ec */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00f6 */
        static {
            /*
                com.horcrux.svg.j0[] r0 = com.horcrux.svg.C5039j0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14098c = r0
                r1 = 1
                com.horcrux.svg.j0 r2 = com.horcrux.svg.C5039j0.baseline     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f14098c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.horcrux.svg.j0 r3 = com.horcrux.svg.C5039j0.textBottom     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.afterEdge     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.textAfterEdge     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x003e }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.alphabetic     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.ideographic     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.middle     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r5 = 7
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.central     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r5 = 8
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x006c }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.mathematical     // Catch:{ NoSuchFieldError -> 0x006c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r5 = 9
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.hanging     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r5 = 10
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.textTop     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r5 = 11
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.beforeEdge     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r5 = 12
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x009c }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.textBeforeEdge     // Catch:{ NoSuchFieldError -> 0x009c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r5 = 13
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.bottom     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r5 = 14
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.center     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r5 = 15
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r3 = f14098c     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.horcrux.svg.j0 r4 = com.horcrux.svg.C5039j0.top     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r5 = 16
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                com.horcrux.svg.p0[] r3 = com.horcrux.svg.C5052p0.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f14097b = r3
                com.horcrux.svg.p0 r4 = com.horcrux.svg.C5052p0.spacing     // Catch:{ NoSuchFieldError -> 0x00d1 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00d1 }
            L_0x00d1:
                int[] r3 = f14097b     // Catch:{ NoSuchFieldError -> 0x00db }
                com.horcrux.svg.p0 r4 = com.horcrux.svg.C5052p0.spacingAndGlyphs     // Catch:{ NoSuchFieldError -> 0x00db }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00db }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00db }
            L_0x00db:
                com.horcrux.svg.n0[] r3 = com.horcrux.svg.C5048n0.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f14096a = r3
                com.horcrux.svg.n0 r4 = com.horcrux.svg.C5048n0.start     // Catch:{ NoSuchFieldError -> 0x00ec }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ec }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x00ec }
            L_0x00ec:
                int[] r1 = f14096a     // Catch:{ NoSuchFieldError -> 0x00f6 }
                com.horcrux.svg.n0 r3 = com.horcrux.svg.C5048n0.middle     // Catch:{ NoSuchFieldError -> 0x00f6 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f6 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x00f6 }
            L_0x00f6:
                int[] r0 = f14096a     // Catch:{ NoSuchFieldError -> 0x0100 }
                com.horcrux.svg.n0 r1 = com.horcrux.svg.C5048n0.end     // Catch:{ NoSuchFieldError -> 0x0100 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0100 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0100 }
            L_0x0100:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5034h0.C5035a.<clinit>():void");
        }
    }

    public C5034h0(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: r0 */
    private void m19014r0(Paint paint, C5032h hVar) {
        String str;
        StringBuilder sb;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            double d = hVar.f14086o;
            paint.setLetterSpacing((float) (d / (hVar.f14073b * ((double) this.f14354b0))));
            if (d == 0.0d && hVar.f14081j == C5043l0.normal) {
                sb = new StringBuilder();
                str = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', ";
            } else {
                sb = new StringBuilder();
                str = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, ";
            }
            sb.append(str);
            sb.append(hVar.f14079h);
            paint.setFontFeatureSettings(sb.toString());
            if (i >= 26) {
                paint.setFontVariationSettings("'wght' " + hVar.f14078g + hVar.f14080i);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r0 = android.graphics.Typeface.create(android.graphics.Typeface.createFromAsset(r10.f14095o1, r7), r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00c5 */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19015s0(android.graphics.Paint r11, com.horcrux.svg.C5032h r12) {
        /*
            r10 = this;
            com.horcrux.svg.m0 r0 = r12.f14077f
            com.horcrux.svg.m0 r1 = com.horcrux.svg.C5046m0.Bold
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0011
            int r0 = r12.f14078g
            r1 = 550(0x226, float:7.71E-43)
            if (r0 < r1) goto L_0x000f
            goto L_0x0011
        L_0x000f:
            r0 = 0
            goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            com.horcrux.svg.k0 r1 = r12.f14075d
            com.horcrux.svg.k0 r4 = com.horcrux.svg.C5041k0.italic
            if (r1 != r4) goto L_0x001a
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x0021
            if (r1 == 0) goto L_0x0021
            r2 = 3
            goto L_0x0028
        L_0x0021:
            if (r0 == 0) goto L_0x0025
            r2 = 1
            goto L_0x0028
        L_0x0025:
            if (r1 == 0) goto L_0x0028
            r2 = 2
        L_0x0028:
            r0 = 0
            int r4 = r12.f14078g
            java.lang.String r5 = r12.f14074c
            if (r5 == 0) goto L_0x00d1
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x00d1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "fonts/"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r8 = ".otf"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r5)
            java.lang.String r7 = ".ttf"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 26
            if (r8 < r9) goto L_0x00ba
            android.graphics.Typeface$Builder r0 = new android.graphics.Typeface$Builder
            android.content.res.AssetManager r8 = r10.f14095o1
            r0.<init>(r8, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "'wght' "
            r6.append(r8)
            r6.append(r4)
            java.lang.String r9 = r12.f14080i
            r6.append(r9)
            java.lang.String r6 = r6.toString()
            r0.setFontVariationSettings(r6)
            r0.setWeight(r4)
            r0.setItalic(r1)
            android.graphics.Typeface r0 = r0.build()
            if (r0 != 0) goto L_0x00d1
            android.graphics.Typeface$Builder r0 = new android.graphics.Typeface$Builder
            android.content.res.AssetManager r6 = r10.f14095o1
            r0.<init>(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r8)
            r6.append(r4)
            java.lang.String r7 = r12.f14080i
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.setFontVariationSettings(r6)
            r0.setWeight(r4)
            r0.setItalic(r1)
            android.graphics.Typeface r0 = r0.build()
            goto L_0x00d1
        L_0x00ba:
            android.content.res.AssetManager r8 = r10.f14095o1     // Catch:{ Exception -> 0x00c5 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r8, r6)     // Catch:{ Exception -> 0x00c5 }
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r2)     // Catch:{ Exception -> 0x00c5 }
            goto L_0x00d1
        L_0x00c5:
            android.content.res.AssetManager r6 = r10.f14095o1     // Catch:{ Exception -> 0x00d0 }
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r6, r7)     // Catch:{ Exception -> 0x00d0 }
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r2)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00d1
        L_0x00d0:
        L_0x00d1:
            if (r0 != 0) goto L_0x00df
            com.facebook.react.views.text.j r6 = com.facebook.react.views.text.C3184j.m12476b()     // Catch:{ Exception -> 0x00de }
            android.content.res.AssetManager r7 = r10.f14095o1     // Catch:{ Exception -> 0x00de }
            android.graphics.Typeface r0 = r6.mo10367c(r5, r2, r7)     // Catch:{ Exception -> 0x00de }
            goto L_0x00df
        L_0x00de:
        L_0x00df:
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 28
            if (r2 < r5) goto L_0x00e9
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r4, r1)
        L_0x00e9:
            r11.setLinearText(r3)
            r11.setSubpixelText(r3)
            r11.setTypeface(r0)
            double r0 = r12.f14073b
            float r12 = r10.f14354b0
            double r3 = (double) r12
            double r0 = r0 * r3
            float r12 = (float) r0
            r11.setTextSize(r12)
            r12 = 21
            if (r2 < r12) goto L_0x0105
            r12 = 0
            r11.setLetterSpacing(r12)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5034h0.m19015s0(android.graphics.Paint, com.horcrux.svg.h):void");
    }

    /* renamed from: t0 */
    private void m19016t0(Canvas canvas, Paint paint) {
        Canvas canvas2 = canvas;
        C5038j g0 = mo15299g0();
        mo15271i0();
        C5032h b = g0.mo15282b();
        TextPaint textPaint = new TextPaint(paint);
        m19015s0(textPaint, b);
        m19014r0(textPaint, b);
        double c = g0.mo15283c();
        int i = C5035a.f14096a[b.f14082k.ordinal()];
        StaticLayout w0 = m19019w0(textPaint, i != 2 ? i != 3 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER, true, new SpannableString(this.f14091k1), (int) C5065w.m19147a(this.f14300Y0, (double) canvas.getWidth(), 0.0d, (double) this.f14354b0, c));
        int lineAscent = w0.getLineAscent(0);
        mo15270h0();
        canvas.save();
        canvas2.translate((float) g0.mo15289l(0.0d), (float) (g0.mo15290m() + ((double) lineAscent)));
        w0.draw(canvas2);
        canvas.restore();
    }

    /* renamed from: u0 */
    private double m19017u0(C5020c0 c0Var, double d, double d2) {
        return C5065w.m19147a(c0Var, d, 0.0d, (double) this.f14354b0, d2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d8, code lost:
        r10 = r2 * r4;
     */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Path m19018v0(java.lang.String r69, android.graphics.Paint r70, android.graphics.Canvas r71) {
        /*
            r68 = this;
            r6 = r68
            r14 = r70
            r15 = r71
            int r13 = r69.length()
            android.graphics.Path r12 = new android.graphics.Path
            r12.<init>()
            java.util.ArrayList<java.lang.String> r0 = r6.f14093m1
            r0.clear()
            java.util.ArrayList<android.graphics.Matrix> r0 = r6.f14094n1
            r0.clear()
            if (r13 != 0) goto L_0x001c
            return r12
        L_0x001c:
            r0 = 0
            com.horcrux.svg.i0 r1 = r6.f14092l1
            r11 = 0
            if (r1 == 0) goto L_0x0025
            r16 = 1
            goto L_0x0027
        L_0x0025:
            r16 = 0
        L_0x0027:
            r17 = 0
            if (r16 == 0) goto L_0x0049
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            com.horcrux.svg.i0 r1 = r6.f14092l1
            android.graphics.Path r1 = r1.mo15281u0(r15, r14)
            r0.<init>(r1, r11)
            float r1 = r0.getLength()
            double r1 = (double) r1
            boolean r3 = r0.isClosed()
            int r4 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r4 != 0) goto L_0x0044
            return r12
        L_0x0044:
            r9 = r0
            r7 = r1
            r19 = r3
            goto L_0x004e
        L_0x0049:
            r9 = r0
            r7 = r17
            r19 = 0
        L_0x004e:
            com.horcrux.svg.j r4 = r68.mo15299g0()
            com.horcrux.svg.h r0 = r4.mo15282b()
            r6.m19015s0(r14, r0)
            com.horcrux.svg.k r5 = new com.horcrux.svg.k
            r5.<init>(r14)
            boolean[] r2 = new boolean[r13]
            char[] r20 = r69.toCharArray()
            r21 = r12
            double r11 = r0.f14084m
            r23 = r11
            double r11 = r0.f14085n
            r26 = r11
            double r10 = r0.f14086o
            boolean r1 = r0.f14087p
            r3 = 1
            r28 = r1 ^ 1
            int r1 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x0081
            com.horcrux.svg.l0 r1 = r0.f14081j
            com.horcrux.svg.l0 r3 = com.horcrux.svg.C5043l0.normal
            if (r1 != r3) goto L_0x0081
            r1 = 1
            goto L_0x0082
        L_0x0081:
            r1 = 0
        L_0x0082:
            int r3 = android.os.Build.VERSION.SDK_INT
            r12 = 21
            if (r3 < r12) goto L_0x00c7
            if (r1 == 0) goto L_0x0092
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r12 = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', "
            goto L_0x0099
        L_0x0092:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r12 = "'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, "
        L_0x0099:
            r1.append(r12)
            java.lang.String r12 = r0.f14079h
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            r14.setFontFeatureSettings(r1)
            r1 = 26
            if (r3 < r1) goto L_0x00c7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "'wght' "
            r1.append(r3)
            int r3 = r0.f14078g
            r1.append(r3)
            java.lang.String r3 = r0.f14080i
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r14.setFontVariationSettings(r1)
        L_0x00c7:
            com.facebook.react.bridge.ReadableMap r12 = r0.f14076e
            float[] r3 = new float[r13]
            r1 = r69
            r14.getTextWidths(r1, r3)
            com.horcrux.svg.n0 r1 = r0.f14082k
            com.horcrux.svg.u0 r0 = r68.mo15361p0()
            r29 = r9
            r30 = r10
            double r9 = r0.mo15262o0(r14)
            double r32 = r6.m19020x0(r1, r9)
            double r43 = r4.mo15283c()
            r45 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r16 == 0) goto L_0x013c
            com.horcrux.svg.i0 r0 = r6.f14092l1
            com.horcrux.svg.r0 r0 = r0.mo15272r0()
            com.horcrux.svg.r0 r11 = com.horcrux.svg.C5056r0.sharp
            if (r0 != r11) goto L_0x00f6
            r11 = 1
            goto L_0x00f7
        L_0x00f6:
            r11 = 0
        L_0x00f7:
            com.horcrux.svg.i0 r0 = r6.f14092l1
            com.horcrux.svg.s0 r0 = r0.mo15273s0()
            r34 = r1
            com.horcrux.svg.s0 r1 = com.horcrux.svg.C5058s0.right
            if (r0 != r1) goto L_0x0106
            r35 = -1
            goto L_0x0108
        L_0x0106:
            r35 = 1
        L_0x0108:
            com.horcrux.svg.i0 r0 = r6.f14092l1
            com.horcrux.svg.c0 r1 = r0.mo15280t0()
            r0 = r68
            r36 = r11
            r11 = r34
            r47 = r2
            r48 = r3
            r2 = r7
            r15 = r4
            r49 = r5
            r4 = r43
            double r0 = r0.m19017u0(r1, r2, r4)
            double r32 = r32 + r0
            if (r19 == 0) goto L_0x0134
            double r2 = r7 / r45
            com.horcrux.svg.n0 r4 = com.horcrux.svg.C5048n0.middle
            if (r11 != r4) goto L_0x012e
            double r2 = -r2
            goto L_0x0130
        L_0x012e:
            r2 = r17
        L_0x0130:
            double r0 = r0 + r2
            double r2 = r0 + r7
            goto L_0x0137
        L_0x0134:
            r2 = r7
            r0 = r17
        L_0x0137:
            r4 = r35
            r5 = r36
            goto L_0x0148
        L_0x013c:
            r47 = r2
            r48 = r3
            r15 = r4
            r49 = r5
            r2 = r7
            r0 = r17
            r4 = 1
            r5 = 0
        L_0x0148:
            r50 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            com.horcrux.svg.c0 r11 = r6.f14301Z0
            r52 = r7
            if (r11 == 0) goto L_0x0190
            int r8 = r71.getWidth()
            double r7 = (double) r8
            r37 = 0
            r54 = r5
            float r5 = r6.f14354b0
            r55 = r0
            double r0 = (double) r5
            r34 = r11
            r35 = r7
            r39 = r0
            r41 = r43
            double r0 = com.horcrux.svg.C5065w.m19147a(r34, r35, r37, r39, r41)
            int r5 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r5 < 0) goto L_0x0188
            int[] r5 = com.horcrux.svg.C5034h0.C5035a.f14097b
            com.horcrux.svg.p0 r7 = r6.f14303b1
            int r7 = r7.ordinal()
            r5 = r5[r7]
            r7 = 2
            if (r5 == r7) goto L_0x0185
            double r0 = r0 - r9
            int r5 = r13 + -1
            double r7 = (double) r5
            double r0 = r0 / r7
            double r10 = r30 + r0
            r30 = r10
            goto L_0x0194
        L_0x0185:
            double r50 = r0 / r9
            goto L_0x0194
        L_0x0188:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Negative textLength value"
            r0.<init>(r1)
            throw r0
        L_0x0190:
            r55 = r0
            r54 = r5
        L_0x0194:
            double r0 = (double) r4
            double r10 = r50 * r0
            android.graphics.Paint$FontMetrics r5 = r70.getFontMetrics()
            float r7 = r5.descent
            double r7 = (double) r7
            float r9 = r5.leading
            r41 = r10
            double r10 = (double) r9
            double r10 = r10 + r7
            r57 = r4
            float r4 = r5.ascent
            float r4 = -r4
            float r4 = r4 + r9
            r58 = r2
            double r2 = (double) r4
            float r4 = r5.top
            float r4 = -r4
            double r4 = (double) r4
            double r34 = r4 + r10
            java.lang.String r9 = r68.mo15359m0()
            com.horcrux.svg.j0 r36 = r68.mo15358l0()
            if (r36 == 0) goto L_0x01f7
            int[] r37 = com.horcrux.svg.C5034h0.C5035a.f14098c
            int r38 = r36.ordinal()
            r37 = r37[r38]
            switch(r37) {
                case 2: goto L_0x01f4;
                case 3: goto L_0x01f4;
                case 4: goto L_0x01f4;
                case 5: goto L_0x01f7;
                case 6: goto L_0x01f4;
                case 7: goto L_0x01e0;
                case 8: goto L_0x01db;
                case 9: goto L_0x01d6;
                case 10: goto L_0x01d0;
                case 11: goto L_0x01ce;
                case 12: goto L_0x01ce;
                case 13: goto L_0x01ce;
                case 14: goto L_0x01de;
                case 15: goto L_0x01cb;
                case 16: goto L_0x01c9;
                default: goto L_0x01c8;
            }
        L_0x01c8:
            goto L_0x01f7
        L_0x01c9:
            r10 = r4
            goto L_0x01de
        L_0x01cb:
            double r10 = r34 / r45
            goto L_0x01de
        L_0x01ce:
            r10 = r2
            goto L_0x01de
        L_0x01d0:
            r4 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            goto L_0x01d8
        L_0x01d6:
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
        L_0x01d8:
            double r10 = r2 * r4
            goto L_0x01de
        L_0x01db:
            double r2 = r2 - r7
            double r10 = r2 / r45
        L_0x01de:
            r4 = 0
            goto L_0x01fa
        L_0x01e0:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            java.lang.String r3 = "x"
            r4 = 0
            r5 = 1
            r14.getTextBounds(r3, r4, r5, r2)
            int r2 = r2.height()
            double r2 = (double) r2
            double r10 = r2 / r45
            goto L_0x01fa
        L_0x01f4:
            r4 = 0
            double r10 = -r7
            goto L_0x01fa
        L_0x01f7:
            r4 = 0
            r10 = r17
        L_0x01fa:
            if (r9 == 0) goto L_0x02c3
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto L_0x02c3
            int[] r2 = com.horcrux.svg.C5034h0.C5035a.f14098c
            int r3 = r36.ordinal()
            r2 = r2[r3]
            r3 = 14
            if (r2 == r3) goto L_0x02c3
            r3 = 16
            if (r2 == r3) goto L_0x02c3
            int r2 = r9.hashCode()
            switch(r2) {
                case -1720785339: goto L_0x0231;
                case 114240: goto L_0x0226;
                case 109801339: goto L_0x021b;
                default: goto L_0x0219;
            }
        L_0x0219:
            r2 = -1
            goto L_0x023b
        L_0x021b:
            java.lang.String r2 = "super"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x0224
            goto L_0x0219
        L_0x0224:
            r2 = 2
            goto L_0x023b
        L_0x0226:
            java.lang.String r2 = "sub"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x022f
            goto L_0x0219
        L_0x022f:
            r2 = 1
            goto L_0x023b
        L_0x0231:
            java.lang.String r2 = "baseline"
            boolean r2 = r9.equals(r2)
            if (r2 != 0) goto L_0x023a
            goto L_0x0219
        L_0x023a:
            r2 = 0
        L_0x023b:
            java.lang.String r3 = "os2"
            java.lang.String r5 = "unitsPerEm"
            java.lang.String r7 = "tables"
            switch(r2) {
                case 0: goto L_0x02c3;
                case 1: goto L_0x028d;
                case 2: goto L_0x0256;
                default: goto L_0x0244;
            }
        L_0x0244:
            float r2 = r6.f14354b0
            double r7 = (double) r2
            double r35 = r7 * r43
            double r2 = (double) r2
            r34 = r9
            r37 = r2
            r39 = r43
            double r2 = com.horcrux.svg.C5065w.m19148b(r34, r35, r37, r39)
            double r10 = r10 - r2
            goto L_0x02c3
        L_0x0256:
            if (r12 == 0) goto L_0x02c3
            boolean r2 = r12.hasKey(r7)
            if (r2 == 0) goto L_0x02c3
            boolean r2 = r12.hasKey(r5)
            if (r2 == 0) goto L_0x02c3
            int r2 = r12.getInt(r5)
            com.facebook.react.bridge.ReadableMap r5 = r12.getMap(r7)
            boolean r7 = r5.hasKey(r3)
            if (r7 == 0) goto L_0x02c3
            com.facebook.react.bridge.ReadableMap r3 = r5.getMap(r3)
            java.lang.String r5 = "ySuperscriptYOffset"
            boolean r7 = r3.hasKey(r5)
            if (r7 == 0) goto L_0x02c3
            double r7 = r3.getDouble(r5)
            float r3 = r6.f14354b0
            double r4 = (double) r3
            double r4 = r4 * r43
            double r4 = r4 * r7
            double r2 = (double) r2
            double r4 = r4 / r2
            double r10 = r10 - r4
            goto L_0x02c3
        L_0x028d:
            if (r12 == 0) goto L_0x02c3
            boolean r2 = r12.hasKey(r7)
            if (r2 == 0) goto L_0x02c3
            boolean r2 = r12.hasKey(r5)
            if (r2 == 0) goto L_0x02c3
            int r2 = r12.getInt(r5)
            com.facebook.react.bridge.ReadableMap r4 = r12.getMap(r7)
            boolean r5 = r4.hasKey(r3)
            if (r5 == 0) goto L_0x02c3
            com.facebook.react.bridge.ReadableMap r3 = r4.getMap(r3)
            java.lang.String r4 = "ySubscriptYOffset"
            boolean r5 = r3.hasKey(r4)
            if (r5 == 0) goto L_0x02c3
            double r3 = r3.getDouble(r4)
            float r5 = r6.f14354b0
            double r7 = (double) r5
            double r7 = r7 * r43
            double r7 = r7 * r3
            double r2 = (double) r2
            double r7 = r7 / r2
            double r10 = r10 + r7
        L_0x02c3:
            r2 = r10
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            android.graphics.Matrix r12 = new android.graphics.Matrix
            r12.<init>()
            r7 = 9
            float[] r11 = new float[r7]
            float[] r10 = new float[r7]
            r9 = 0
        L_0x02da:
            if (r9 >= r13) goto L_0x052f
            char r7 = r20[r9]
            java.lang.String r8 = java.lang.String.valueOf(r7)
            boolean r34 = r47[r9]
            if (r34 == 0) goto L_0x02ed
            java.lang.String r8 = ""
            r6 = r8
            r35 = r13
            r8 = 0
            goto L_0x0324
        L_0x02ed:
            r60 = r8
            r25 = r9
            r8 = 0
        L_0x02f2:
            r35 = 1
            int r6 = r25 + 1
            if (r6 >= r13) goto L_0x031f
            r35 = r48[r6]
            r36 = 0
            int r35 = (r35 > r36 ? 1 : (r35 == r36 ? 0 : -1))
            if (r35 <= 0) goto L_0x0301
            goto L_0x031f
        L_0x0301:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r35 = r13
            r13 = r60
            r8.append(r13)
            char r13 = r20[r6]
            r8.append(r13)
            java.lang.String r60 = r8.toString()
            r8 = 1
            r47[r6] = r8
            r25 = r6
            r13 = r35
            r8 = 1
            goto L_0x02f2
        L_0x031f:
            r35 = r13
            r13 = r60
            r6 = r13
        L_0x0324:
            float r13 = r14.measureText(r6)
            double r13 = (double) r13
            double r13 = r13 * r50
            r36 = r6
            if (r28 == 0) goto L_0x033c
            r6 = r48[r9]
            r38 = r8
            r37 = r9
            double r8 = (double) r6
            double r8 = r8 * r50
            double r8 = r8 - r13
            r23 = r8
            goto L_0x0340
        L_0x033c:
            r38 = r8
            r37 = r9
        L_0x0340:
            r6 = 32
            if (r7 != r6) goto L_0x0346
            r6 = 1
            goto L_0x0347
        L_0x0346:
            r6 = 0
        L_0x0347:
            if (r6 == 0) goto L_0x034c
            r8 = r26
            goto L_0x034e
        L_0x034c:
            r8 = r17
        L_0x034e:
            double r8 = r8 + r30
            double r8 = r8 + r13
            if (r34 == 0) goto L_0x0358
            r43 = r2
            r2 = r17
            goto L_0x035e
        L_0x0358:
            double r39 = r23 + r8
            r43 = r2
            r2 = r39
        L_0x035e:
            double r2 = r15.mo15289l(r2)
            r40 = r10
            r39 = r11
            double r10 = r15.mo15290m()
            double r60 = r15.mo15286i()
            double r62 = r15.mo15287j()
            r64 = r10
            double r10 = r15.mo15288k()
            if (r34 != 0) goto L_0x04e8
            if (r6 == 0) goto L_0x037e
            goto L_0x04e8
        L_0x037e:
            double r8 = r8 * r0
            double r13 = r13 * r0
            double r2 = r2 + r60
            double r2 = r2 * r0
            double r2 = r32 + r2
            double r2 = r2 - r8
            if (r16 == 0) goto L_0x0429
            double r8 = r2 + r13
            double r13 = r13 / r45
            r34 = r7
            double r6 = r2 + r13
            int r60 = (r6 > r58 ? 1 : (r6 == r58 ? 0 : -1))
            if (r60 <= 0) goto L_0x0399
            goto L_0x04e8
        L_0x0399:
            int r60 = (r6 > r55 ? 1 : (r6 == r55 ? 0 : -1))
            if (r60 >= 0) goto L_0x039f
            goto L_0x04e8
        L_0x039f:
            r60 = r15
            r15 = 3
            if (r54 == 0) goto L_0x03ae
            float r2 = (float) r6
            r3 = r29
            r3.getMatrix(r2, r5, r15)
            r15 = r3
            r66 = r10
            goto L_0x0410
        L_0x03ae:
            r15 = r29
            int r61 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            r66 = r10
            if (r61 >= 0) goto L_0x03c1
            r10 = 3
            r11 = 0
            r15.getMatrix(r11, r4, r10)
            float r2 = (float) r2
            r4.preTranslate(r2, r11)
            r10 = 1
            goto L_0x03c6
        L_0x03c1:
            float r2 = (float) r2
            r10 = 1
            r15.getMatrix(r2, r4, r10)
        L_0x03c6:
            float r2 = (float) r6
            r15.getMatrix(r2, r5, r10)
            int r2 = (r8 > r52 ? 1 : (r8 == r52 ? 0 : -1))
            r6 = r52
            if (r2 <= 0) goto L_0x03dc
            float r2 = (float) r6
            r3 = 3
            r15.getMatrix(r2, r12, r3)
            double r8 = r8 - r6
            float r2 = (float) r8
            r3 = 0
            r12.preTranslate(r2, r3)
            goto L_0x03e0
        L_0x03dc:
            float r2 = (float) r8
            r15.getMatrix(r2, r12, r10)
        L_0x03e0:
            r11 = r39
            r4.getValues(r11)
            r9 = r40
            r12.getValues(r9)
            r8 = 2
            r2 = r11[r8]
            double r2 = (double) r2
            r19 = 5
            r10 = r11[r19]
            r52 = r6
            double r6 = (double) r10
            r10 = r9[r8]
            r39 = r11
            double r10 = (double) r10
            r8 = r9[r19]
            double r8 = (double) r8
            double r10 = r10 - r2
            double r8 = r8 - r6
            double r2 = java.lang.Math.atan2(r8, r10)
            r6 = 4633260481411531256(0x404ca5dc1a63c1f8, double:57.29577951308232)
            double r2 = r2 * r6
            double r2 = r2 * r0
            float r2 = (float) r2
            r5.preRotate(r2)
        L_0x0410:
            double r2 = -r13
            float r2 = (float) r2
            double r6 = r62 + r43
            float r3 = (float) r6
            r5.preTranslate(r2, r3)
            r10 = r41
            float r2 = (float) r10
            r6 = r57
            float r3 = (float) r6
            r5.preScale(r2, r3)
            r7 = r64
            float r2 = (float) r7
            r3 = 0
            r5.postTranslate(r3, r2)
            goto L_0x0440
        L_0x0429:
            r34 = r7
            r66 = r10
            r60 = r15
            r15 = r29
            r10 = r41
            r6 = r57
            r7 = r64
            float r2 = (float) r2
            double r7 = r7 + r62
            double r7 = r7 + r43
            float r3 = (float) r7
            r5.setTranslate(r2, r3)
        L_0x0440:
            r2 = r66
            float r2 = (float) r2
            r5.preRotate(r2)
            if (r38 == 0) goto L_0x0480
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r9 = 0
            int r3 = r36.length()
            r13 = 0
            r14 = 0
            r41 = r52
            r19 = 2
            r7 = r70
            r8 = r36
            r34 = r15
            r29 = r37
            r15 = r40
            r37 = r10
            r11 = 1
            r10 = r3
            r25 = r26
            r3 = r39
            r22 = 0
            r11 = r13
            r13 = r21
            r21 = r12
            r12 = r14
            r39 = r0
            r0 = r13
            r14 = r35
            r13 = r2
            r7.getTextPath(r8, r9, r10, r11, r12, r13)
            r13 = r36
            r1 = r49
            goto L_0x04a4
        L_0x0480:
            r25 = r26
            r2 = r34
            r14 = r35
            r13 = r36
            r29 = r37
            r3 = r39
            r41 = r52
            r19 = 2
            r22 = 0
            r37 = r10
            r34 = r15
            r15 = r40
            r39 = r0
            r0 = r21
            r1 = r49
            r21 = r12
            android.graphics.Path r2 = r1.mo15295b(r2, r13)
        L_0x04a4:
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r8 = 1
            r2.computeBounds(r7, r8)
            float r7 = r7.width()
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x04da
            r71.save()
            r7 = r1
            r1 = r71
            r1.concat(r5)
            r2 = 0
            r9 = r68
            java.util.ArrayList<java.lang.String> r10 = r9.f14093m1
            r10.add(r13)
            java.util.ArrayList<android.graphics.Matrix> r10 = r9.f14094n1
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>(r5)
            r10.add(r11)
            r10 = r70
            r1.drawText(r13, r2, r2, r10)
            r71.restore()
            goto L_0x050f
        L_0x04da:
            r9 = r68
            r10 = r70
            r7 = r1
            r1 = r71
            r2.transform(r5)
            r0.addPath(r2)
            goto L_0x050f
        L_0x04e8:
            r9 = r68
            r10 = r70
            r60 = r15
            r25 = r26
            r34 = r29
            r14 = r35
            r29 = r37
            r3 = r39
            r15 = r40
            r37 = r41
            r7 = r49
            r41 = r52
            r6 = r57
            r8 = 1
            r19 = 2
            r22 = 0
            r39 = r0
            r0 = r21
            r1 = r71
            r21 = r12
        L_0x050f:
            int r2 = r29 + 1
            r11 = r3
            r57 = r6
            r49 = r7
            r6 = r9
            r13 = r14
            r12 = r21
            r26 = r25
            r29 = r34
            r52 = r41
            r21 = r0
            r9 = r2
            r14 = r10
            r10 = r15
            r41 = r37
            r0 = r39
            r2 = r43
            r15 = r60
            goto L_0x02da
        L_0x052f:
            r9 = r6
            r0 = r21
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5034h0.m19018v0(java.lang.String, android.graphics.Paint, android.graphics.Canvas):android.graphics.Path");
    }

    /* renamed from: w0 */
    private StaticLayout m19019w0(TextPaint textPaint, Layout.Alignment alignment, boolean z, SpannableString spannableString, int i) {
        return Build.VERSION.SDK_INT < 23 ? new StaticLayout(spannableString, textPaint, i, alignment, 1.0f, 0.0f, z) : StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    /* renamed from: x0 */
    private double m19020x0(C5048n0 n0Var, double d) {
        int i = C5035a.f14096a[n0Var.ordinal()];
        if (i == 2) {
            return (-d) / 2.0d;
        }
        if (i != 3) {
            return 0.0d;
        }
        return -d;
    }

    /* renamed from: y0 */
    private void m19021y0() {
        ViewParent parent = getParent();
        while (parent != null) {
            if (parent.getClass() == C5037i0.class) {
                this.f14092l1 = (C5037i0) parent;
                return;
            } else if (parent instanceof C5062u0) {
                parent = parent.getParent();
            } else {
                return;
            }
        }
    }

    /* renamed from: z0 */
    public static String m19022z0(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        Bidi bidi = new Bidi(str, -2);
        if (bidi.isLeftToRight()) {
            return str;
        }
        int runCount = bidi.getRunCount();
        byte[] bArr = new byte[runCount];
        Integer[] numArr = new Integer[runCount];
        for (int i = 0; i < runCount; i++) {
            bArr[i] = (byte) bidi.getRunLevel(i);
            numArr[i] = Integer.valueOf(i);
        }
        Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < runCount; i2++) {
            int intValue = numArr[i2].intValue();
            int runStart = bidi.getRunStart(intValue);
            int runLimit = bidi.getRunLimit(intValue);
            if ((bArr[intValue] & 1) != 0) {
                while (true) {
                    runLimit--;
                    if (runLimit < runStart) {
                        break;
                    }
                    sb.append(str.charAt(runLimit));
                }
            } else {
                sb.append(str, runStart, runLimit);
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo15260B() {
        this.f14090j1 = null;
        super.mo15260B();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo15193F(Canvas canvas, Paint paint, float f) {
        if (this.f14091k1 != null) {
            C5020c0 c0Var = this.f14300Y0;
            if (c0Var == null || c0Var.f14015a == 0.0d) {
                int size = this.f14093m1.size();
                if (size > 0) {
                    m19015s0(paint, mo15299g0().mo15282b());
                    for (int i = 0; i < size; i++) {
                        canvas.save();
                        canvas.concat(this.f14094n1.get(i));
                        canvas.drawText(this.f14093m1.get(i), 0.0f, 0.0f, paint);
                        canvas.restore();
                    }
                }
                mo15296d0(canvas, paint, f);
                return;
            }
            if (mo15201Z(paint, this.f14008Q0 * f)) {
                m19016t0(canvas, paint);
            }
            if (mo15202b0(paint, f * this.f14002K0)) {
                m19016t0(canvas, paint);
                return;
            }
            return;
        }
        mo15379E(canvas, paint);
        mo15264c0(canvas, paint, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public Path mo15183I(Canvas canvas, Paint paint) {
        Path path = this.f14090j1;
        if (path != null) {
            return path;
        }
        if (this.f14091k1 == null) {
            Path n0 = mo15360n0(canvas, paint);
            this.f14090j1 = n0;
            return n0;
        }
        m19021y0();
        mo15271i0();
        this.f14090j1 = m19018v0(m19022z0(this.f14091k1), paint, canvas);
        mo15270h0();
        return this.f14090j1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public int mo15194J(float[] fArr) {
        Region region;
        if (this.f14091k1 == null) {
            return super.mo15194J(fArr);
        }
        if (this.f14367o0 != null && this.f14344O && this.f14346Q) {
            float[] fArr2 = new float[2];
            this.f14342M.mapPoints(fArr2, fArr);
            this.f14343N.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            mo15197U();
            Region region2 = this.f14377y0;
            if ((region2 != null && region2.contains(round, round2)) || ((region = this.f14332A0) != null && region.contains(round, round2))) {
                if (getClipPath() == null || this.f14333B0.contains(round, round2)) {
                    return getId();
                }
                return -1;
            }
        }
        return -1;
    }

    public void invalidate() {
        this.f14090j1 = null;
        super.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public double mo15262o0(Paint paint) {
        if (!Double.isNaN(this.f14310i1)) {
            return this.f14310i1;
        }
        String str = this.f14091k1;
        double d = 0.0d;
        if (str == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof C5062u0) {
                    d += ((C5062u0) childAt).mo15262o0(paint);
                }
            }
            this.f14310i1 = d;
            return d;
        } else if (str.length() == 0) {
            this.f14310i1 = 0.0d;
            return 0.0d;
        } else {
            C5032h b = mo15299g0().mo15282b();
            m19015s0(paint, b);
            m19014r0(paint, b);
            double measureText = (double) paint.measureText(str);
            this.f14310i1 = measureText;
            return measureText;
        }
    }

    @C2991a(name = "content")
    public void setContent(String str) {
        this.f14091k1 = str;
        invalidate();
    }
}
