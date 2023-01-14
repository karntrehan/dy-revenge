package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C2931d0;
import com.facebook.react.uimanager.C2940e0;
import com.facebook.react.uimanager.C2981h;
import com.facebook.react.uimanager.C2987j;
import com.facebook.react.uimanager.C3029o;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.yoga.C3322u;
import com.facebook.yoga.C3323v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p174e.p247e.p315l.p316a.C6409a;

@TargetApi(23)
/* renamed from: com.facebook.react.views.text.h */
public abstract class C3181h extends C2987j {

    /* renamed from: A */
    protected C3199t f8906A;

    /* renamed from: B */
    protected C3205z f8907B;

    /* renamed from: C */
    protected boolean f8908C;

    /* renamed from: D */
    protected int f8909D;

    /* renamed from: E */
    protected boolean f8910E;

    /* renamed from: F */
    protected int f8911F;

    /* renamed from: G */
    protected int f8912G;

    /* renamed from: H */
    protected int f8913H;

    /* renamed from: I */
    protected int f8914I;

    /* renamed from: J */
    protected int f8915J;

    /* renamed from: K */
    protected int f8916K;

    /* renamed from: L */
    protected float f8917L;

    /* renamed from: M */
    protected float f8918M;

    /* renamed from: N */
    protected float f8919N;

    /* renamed from: O */
    protected int f8920O;

    /* renamed from: P */
    protected boolean f8921P;

    /* renamed from: Q */
    protected boolean f8922Q;

    /* renamed from: R */
    protected boolean f8923R;

    /* renamed from: S */
    protected boolean f8924S;

    /* renamed from: T */
    protected float f8925T;

    /* renamed from: U */
    protected int f8926U;

    /* renamed from: V */
    protected int f8927V;

    /* renamed from: W */
    protected String f8928W;

    /* renamed from: X */
    protected String f8929X;

    /* renamed from: Y */
    protected boolean f8930Y;

    /* renamed from: Z */
    protected Map<Integer, C2931d0> f8931Z;

    /* renamed from: com.facebook.react.views.text.h$a */
    private static class C3182a {

        /* renamed from: a */
        protected int f8932a;

        /* renamed from: b */
        protected int f8933b;

        /* renamed from: c */
        protected C3189m f8934c;

        C3182a(int i, int i2, C3189m mVar) {
            this.f8932a = i;
            this.f8933b = i2;
            this.f8934c = mVar;
        }

        /* renamed from: a */
        public void mo10364a(SpannableStringBuilder spannableStringBuilder, int i) {
            int i2 = this.f8932a;
            spannableStringBuilder.setSpan(this.f8934c, i2, this.f8933b, ((i << 16) & 16711680) | ((i2 == 0 ? 18 : 34) & -16711681));
        }
    }

    public C3181h() {
        this((C3199t) null);
    }

    public C3181h(C3199t tVar) {
        this.f8908C = false;
        this.f8910E = false;
        this.f8912G = -1;
        this.f8913H = 0;
        this.f8914I = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        this.f8915J = 0;
        this.f8916K = 0;
        this.f8917L = 0.0f;
        this.f8918M = 0.0f;
        this.f8919N = 0.0f;
        this.f8920O = 1426063360;
        this.f8921P = false;
        this.f8922Q = false;
        this.f8923R = true;
        this.f8924S = false;
        this.f8925T = 0.0f;
        this.f8926U = -1;
        this.f8927V = -1;
        this.f8928W = null;
        this.f8929X = null;
        this.f8930Y = false;
        this.f8907B = new C3205z();
        this.f8906A = tVar;
    }

    /* renamed from: q1 */
    private static void m12472q1(C3181h hVar, SpannableStringBuilder spannableStringBuilder, List<C3182a> list, C3205z zVar, boolean z, Map<Integer, C2931d0> map, int i) {
        float f;
        float f2;
        C3181h hVar2 = hVar;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        List<C3182a> list2 = list;
        C3205z zVar2 = zVar;
        int i2 = i;
        C3205z zVar3 = hVar2.f8907B;
        if (zVar2 != null) {
            zVar3 = zVar2.mo10418a(zVar3);
        }
        C3205z zVar4 = zVar3;
        int b = hVar.mo9526b();
        for (int i3 = 0; i3 < b; i3++) {
            C2940e0 f0 = hVar2.mo9524a(i3);
            if (f0 instanceof C3188l) {
                spannableStringBuilder2.append(C3174e0.m12453e(((C3188l) f0).mo10371p1(), zVar4.mo10429l()));
            } else if (f0 instanceof C3181h) {
                m12472q1((C3181h) f0, spannableStringBuilder, list, zVar4, z, map, spannableStringBuilder.length());
            } else if (f0 instanceof C3192p) {
                spannableStringBuilder2.append("0");
                list2.add(new C3182a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((C3192p) f0).mo10330q1()));
            } else if (z) {
                int t = f0.mo9548t();
                C3323v F = f0.mo9503F();
                C3323v p = f0.mo9544p();
                C3322u uVar = F.f9394e;
                C3322u uVar2 = C3322u.POINT;
                if (uVar == uVar2 && p.f9394e == uVar2) {
                    f2 = F.f9393d;
                    f = p.f9393d;
                } else {
                    f0.mo9550v();
                    f2 = f0.mo9529d0();
                    f = f0.mo9542n();
                }
                spannableStringBuilder2.append("0");
                list2.add(new C3182a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new C3166b0(t, (int) f2, (int) f)));
                map.put(Integer.valueOf(t), f0);
                f0.mo9532g();
            } else {
                throw new C2981h("Unexpected view type nested under a <Text> or <TextInput> node: " + f0.getClass());
            }
            Map<Integer, C2931d0> map2 = map;
            f0.mo9532g();
        }
        int length = spannableStringBuilder.length();
        if (length >= i2) {
            if (hVar2.f8908C) {
                list2.add(new C3182a(i2, length, new C3187k(hVar2.f8909D)));
            }
            if (hVar2.f8910E) {
                list2.add(new C3182a(i2, length, new C3180g(hVar2.f8911F)));
            }
            float d = zVar4.mo10421d();
            if (!Float.isNaN(d) && (zVar2 == null || zVar.mo10421d() != d)) {
                list2.add(new C3182a(i2, length, new C3163a(d)));
            }
            int c = zVar4.mo10420c();
            if (zVar2 == null || zVar.mo10420c() != c) {
                list2.add(new C3182a(i2, length, new C3176f(c)));
            }
            if (!(hVar2.f8926U == -1 && hVar2.f8927V == -1 && hVar2.f8928W == null)) {
                list2.add(new C3182a(i2, length, new C3167c(hVar2.f8926U, hVar2.f8927V, hVar2.f8929X, hVar2.f8928W, hVar.mo9506I().getAssets())));
            }
            if (hVar2.f8921P) {
                list2.add(new C3182a(i2, length, new C3201v()));
            }
            if (hVar2.f8922Q) {
                list2.add(new C3182a(i2, length, new C3190n()));
            }
            if (!((hVar2.f8917L == 0.0f && hVar2.f8918M == 0.0f && hVar2.f8919N == 0.0f) || Color.alpha(hVar2.f8920O) == 0)) {
                list2.add(new C3182a(i2, length, new C3203x(hVar2.f8917L, hVar2.f8918M, hVar2.f8919N, hVar2.f8920O)));
            }
            float e = zVar4.mo10422e();
            if (!Float.isNaN(e) && (zVar2 == null || zVar.mo10422e() != e)) {
                list2.add(new C3182a(i2, length, new C3165b(e)));
            }
            list2.add(new C3182a(i2, length, new C3191o(hVar.mo9548t())));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r1 */
    public Spannable mo10341r1(C3181h hVar, String str, boolean z, C3029o oVar) {
        int i;
        C3181h hVar2 = hVar;
        String str2 = str;
        C3029o oVar2 = oVar;
        int i2 = 0;
        C6409a.m24520b(!z || oVar2 != null, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<C3182a> arrayList = new ArrayList<>();
        HashMap hashMap = z ? new HashMap() : null;
        if (str2 != null) {
            spannableStringBuilder.append(C3174e0.m12453e(str2, hVar2.f8907B.mo10429l()));
        }
        m12472q1(hVar, spannableStringBuilder, arrayList, (C3205z) null, z, hashMap, 0);
        hVar2.f8930Y = false;
        hVar2.f8931Z = hashMap;
        float f = Float.NaN;
        for (C3182a aVar : arrayList) {
            C3189m mVar = aVar.f8934c;
            boolean z2 = mVar instanceof C3164a0;
            if (z2 || (mVar instanceof C3166b0)) {
                if (z2) {
                    i = ((C3164a0) mVar).mo10312b();
                    hVar2.f8930Y = true;
                } else {
                    C3166b0 b0Var = (C3166b0) mVar;
                    int a = b0Var.mo10319a();
                    C2931d0 d0Var = hashMap.get(Integer.valueOf(b0Var.mo10320b()));
                    oVar2.mo9799h(d0Var);
                    d0Var.mo9513P(hVar);
                    i = a;
                }
                if (Float.isNaN(f) || ((float) i) > f) {
                    f = (float) i;
                }
            }
            aVar.mo10364a(spannableStringBuilder, i2);
            i2++;
        }
        hVar2.f8907B.mo10432o(f);
        C3199t tVar = this.f8906A;
        if (tVar != null) {
            tVar.mo10414a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    @C2991a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z) {
        if (z != this.f8924S) {
            this.f8924S = z;
            mo9621x0();
        }
    }

    @C2991a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z) {
        if (z != this.f8907B.mo10419b()) {
            this.f8907B.mo10430m(z);
            mo9621x0();
        }
    }

    @C2991a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (mo9551w()) {
            boolean z = num != null;
            this.f8910E = z;
            if (z) {
                this.f8911F = num.intValue();
            }
            mo9621x0();
        }
    }

    @C2991a(customType = "Color", name = "color")
    public void setColor(Integer num) {
        boolean z = num != null;
        this.f8908C = z;
        if (z) {
            this.f8909D = num.intValue();
        }
        mo9621x0();
    }

    @C2991a(name = "fontFamily")
    public void setFontFamily(String str) {
        this.f8928W = str;
        mo9621x0();
    }

    @C2991a(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f) {
        this.f8907B.mo10431n(f);
        mo9621x0();
    }

    @C2991a(name = "fontStyle")
    public void setFontStyle(String str) {
        int b = C3200u.m12521b(str);
        if (b != this.f8926U) {
            this.f8926U = b;
            mo9621x0();
        }
    }

    @C2991a(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String c = C3200u.m12522c(readableArray);
        if (!TextUtils.equals(c, this.f8929X)) {
            this.f8929X = c;
            mo9621x0();
        }
    }

    @C2991a(name = "fontWeight")
    public void setFontWeight(String str) {
        int d = C3200u.m12523d(str);
        if (d != this.f8927V) {
            this.f8927V = d;
            mo9621x0();
        }
    }

    @C2991a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z) {
        this.f8923R = z;
    }

    @C2991a(defaultFloat = Float.NaN, name = "letterSpacing")
    public void setLetterSpacing(float f) {
        this.f8907B.mo10433p(f);
        mo9621x0();
    }

    @C2991a(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f) {
        this.f8907B.mo10434q(f);
        mo9621x0();
    }

    @C2991a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f) {
        if (f != this.f8907B.mo10428k()) {
            this.f8907B.mo10435r(f);
            mo9621x0();
        }
    }

    @C2991a(name = "minimumFontScale")
    public void setMinimumFontScale(float f) {
        if (f != this.f8925T) {
            this.f8925T = f;
            mo9621x0();
        }
    }

    @C2991a(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.f8912G = i;
        mo9621x0();
    }

    @C2991a(name = "textAlign")
    public void setTextAlign(String str) {
        if (!"justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f8916K = 0;
            }
            if (str == null || "auto".equals(str)) {
                this.f8913H = 0;
                mo9621x0();
            } else if (!"left".equals(str)) {
                if ("right".equals(str)) {
                    this.f8913H = 5;
                } else if ("center".equals(str)) {
                    this.f8913H = 1;
                } else {
                    throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + str);
                }
                mo9621x0();
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.f8916K = 1;
        }
        this.f8913H = 3;
        mo9621x0();
    }

    @C2991a(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            if (str == null || "highQuality".equals(str)) {
                i = 1;
            } else if ("simple".equals(str)) {
                i = 0;
            } else if ("balanced".equals(str)) {
                i = 2;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid textBreakStrategy: " + str);
            }
            this.f8914I = i;
            mo9621x0();
        }
    }

    @C2991a(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.f8921P = false;
        this.f8922Q = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.f8921P = true;
                } else if ("line-through".equals(str2)) {
                    this.f8922Q = true;
                }
            }
        }
        mo9621x0();
    }

    @C2991a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i) {
        if (i != this.f8920O) {
            this.f8920O = i;
            mo9621x0();
        }
    }

    @C2991a(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.f8917L = 0.0f;
        this.f8918M = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.f8917L = C3038r.m12005b(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.f8918M = C3038r.m12005b(readableMap.getDouble("height"));
            }
        }
        mo9621x0();
    }

    @C2991a(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f) {
        if (f != this.f8919N) {
            this.f8919N = f;
            mo9621x0();
        }
    }

    @C2991a(name = "textTransform")
    public void setTextTransform(String str) {
        C3205z zVar;
        C3174e0 e0Var;
        if (str == null) {
            zVar = this.f8907B;
            e0Var = C3174e0.UNSET;
        } else if ("none".equals(str)) {
            zVar = this.f8907B;
            e0Var = C3174e0.NONE;
        } else if ("uppercase".equals(str)) {
            zVar = this.f8907B;
            e0Var = C3174e0.UPPERCASE;
        } else if ("lowercase".equals(str)) {
            zVar = this.f8907B;
            e0Var = C3174e0.LOWERCASE;
        } else if ("capitalize".equals(str)) {
            zVar = this.f8907B;
            e0Var = C3174e0.CAPITALIZE;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
        }
        zVar.mo10436s(e0Var);
        mo9621x0();
    }
}
