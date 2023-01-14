package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.uimanager.C2962f0;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.C3046u;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.react.views.text.y */
public class C3204y {

    /* renamed from: a */
    private static final int f8983a = 0;

    /* renamed from: b */
    private static final int f8984b;

    /* renamed from: c */
    private static final int f8985c = 0;

    /* renamed from: A */
    protected int f8986A = -1;

    /* renamed from: B */
    protected int f8987B = -1;

    /* renamed from: C */
    protected String f8988C = null;

    /* renamed from: D */
    protected String f8989D = null;

    /* renamed from: E */
    protected boolean f8990E = false;

    /* renamed from: F */
    protected float f8991F = Float.NaN;

    /* renamed from: d */
    protected float f8992d = Float.NaN;

    /* renamed from: e */
    protected boolean f8993e = false;

    /* renamed from: f */
    protected boolean f8994f = true;

    /* renamed from: g */
    protected int f8995g;

    /* renamed from: h */
    protected boolean f8996h = false;

    /* renamed from: i */
    protected int f8997i;

    /* renamed from: j */
    protected int f8998j = -1;

    /* renamed from: k */
    protected int f8999k = -1;

    /* renamed from: l */
    protected float f9000l = -1.0f;

    /* renamed from: m */
    protected float f9001m = -1.0f;

    /* renamed from: n */
    protected float f9002n = Float.NaN;

    /* renamed from: o */
    protected int f9003o = 0;

    /* renamed from: p */
    protected int f9004p = -1;

    /* renamed from: q */
    protected C3174e0 f9005q = C3174e0.NONE;

    /* renamed from: r */
    protected float f9006r = 0.0f;

    /* renamed from: s */
    protected float f9007s = 0.0f;

    /* renamed from: t */
    protected float f9008t = 1.0f;

    /* renamed from: u */
    protected int f9009u = 1426063360;

    /* renamed from: v */
    protected boolean f9010v = false;

    /* renamed from: w */
    protected boolean f9011w = false;

    /* renamed from: x */
    protected boolean f9012x = true;

    /* renamed from: y */
    protected C3046u.C3050d f9013y = null;

    /* renamed from: z */
    protected boolean f9014z = false;

    static {
        int i = Build.VERSION.SDK_INT;
        f8984b = i < 23 ? 0 : 1;
    }

    private C3204y() {
    }

    /* renamed from: A */
    private void m12525A(float f) {
        this.f9002n = f;
    }

    /* renamed from: B */
    private void m12526B(float f) {
        this.f9001m = f;
        this.f8992d = f == -1.0f ? Float.NaN : this.f8994f ? C3038r.m12008e(f) : C3038r.m12006c(f);
    }

    /* renamed from: C */
    private void m12527C(int i) {
        if (i == 0) {
            i = -1;
        }
        this.f8998j = i;
    }

    /* renamed from: D */
    private void m12528D(String str) {
        this.f9010v = false;
        this.f9011w = false;
        if (str != null) {
            for (String str2 : str.split("-")) {
                if ("underline".equals(str2)) {
                    this.f9010v = true;
                } else if ("strikethrough".equals(str2)) {
                    this.f9011w = true;
                }
            }
        }
    }

    /* renamed from: E */
    private void m12529E(int i) {
        if (i != this.f9009u) {
            this.f9009u = i;
        }
    }

    /* renamed from: F */
    private void m12530F(ReadableMap readableMap) {
        this.f9006r = 0.0f;
        this.f9007s = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.f9006r = C3038r.m12005b(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.f9007s = C3038r.m12005b(readableMap.getDouble("height"));
            }
        }
    }

    /* renamed from: G */
    private void m12531G(float f) {
        if (f != this.f9008t) {
            this.f9008t = f;
        }
    }

    /* renamed from: H */
    private void m12532H(String str) {
        C3174e0 e0Var;
        if (str == null || "none".equals(str)) {
            e0Var = C3174e0.NONE;
        } else if ("uppercase".equals(str)) {
            e0Var = C3174e0.UPPERCASE;
        } else if ("lowercase".equals(str)) {
            e0Var = C3174e0.LOWERCASE;
        } else if ("capitalize".equals(str)) {
            e0Var = C3174e0.CAPITALIZE;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textTransform: " + str);
        }
        this.f9005q = e0Var;
    }

    /* renamed from: a */
    public static C3204y m12533a(C2962f0 f0Var) {
        C3204y yVar = new C3204y();
        yVar.m12527C(m12539h(f0Var, "numberOfLines", -1));
        yVar.m12526B(m12537f(f0Var, "lineHeight", -1.0f));
        yVar.m12525A(m12537f(f0Var, "letterSpacing", Float.NaN));
        yVar.m12546p(m12536d(f0Var, "allowFontScaling", true));
        yVar.m12550t(m12537f(f0Var, "fontSize", -1.0f));
        ReadableMap readableMap = null;
        yVar.m12548r(f0Var.mo9678g("color") ? Integer.valueOf(f0Var.mo9675d("color", 0)) : null);
        yVar.m12548r(f0Var.mo9678g("foregroundColor") ? Integer.valueOf(f0Var.mo9675d("foregroundColor", 0)) : null);
        yVar.m12547q(f0Var.mo9678g("backgroundColor") ? Integer.valueOf(f0Var.mo9675d("backgroundColor", 0)) : null);
        yVar.m12549s(m12542l(f0Var, "fontFamily"));
        yVar.m12554x(m12542l(f0Var, "fontWeight"));
        yVar.m12551u(m12542l(f0Var, "fontStyle"));
        yVar.m12552v(m12535c(f0Var, "fontVariant"));
        yVar.m12555y(m12536d(f0Var, "includeFontPadding", true));
        yVar.m12528D(m12542l(f0Var, "textDecorationLine"));
        if (f0Var.mo9678g("textShadowOffset")) {
            readableMap = f0Var.mo9676e("textShadowOffset");
        }
        yVar.m12530F(readableMap);
        yVar.m12531G((float) m12539h(f0Var, "textShadowRadius", 1));
        yVar.m12529E(m12539h(f0Var, "textShadowColor", 1426063360));
        yVar.m12532H(m12542l(f0Var, "textTransform"));
        yVar.m12556z(m12542l(f0Var, "layoutDirection"));
        yVar.m12545o(m12542l(f0Var, "accessibilityRole"));
        return yVar;
    }

    /* renamed from: b */
    public static C3204y m12534b(ReadableMapBuffer readableMapBuffer) {
        C3204y yVar = new C3204y();
        Iterator<ReadableMapBuffer.C2703b> it = readableMapBuffer.iterator();
        while (it.hasNext()) {
            ReadableMapBuffer.C2703b next = it.next();
            short d = next.mo8847d();
            if (d == 0) {
                yVar.m12548r(Integer.valueOf(next.mo8846c(0)));
            } else if (d == 1) {
                yVar.m12547q(Integer.valueOf(next.mo8846c(0)));
            } else if (d == 3) {
                yVar.m12549s(next.mo8849f());
            } else if (d == 4) {
                yVar.m12550t((float) next.mo8845b(-1.0d));
            } else if (d == 15) {
                yVar.m12528D(next.mo8849f());
            } else if (d == 18) {
                yVar.m12531G((float) next.mo8846c(1));
            } else if (d == 19) {
                yVar.m12529E(next.mo8846c(1426063360));
            } else if (d == 21) {
                yVar.m12556z(next.mo8849f());
            } else if (d != 22) {
                switch (d) {
                    case 6:
                        yVar.m12554x(next.mo8849f());
                        break;
                    case 7:
                        yVar.m12551u(next.mo8849f());
                        break;
                    case 8:
                        yVar.m12553w(next.mo8848e());
                        break;
                    case 9:
                        yVar.m12546p(next.mo8844a(true));
                        break;
                    case 10:
                        yVar.m12525A((float) next.mo8845b(Double.NaN));
                        break;
                    case 11:
                        yVar.m12526B((float) next.mo8845b(-1.0d));
                        break;
                }
            } else {
                yVar.m12545o(next.mo8849f());
            }
        }
        return yVar;
    }

    /* renamed from: c */
    private static ReadableArray m12535c(C2962f0 f0Var, String str) {
        if (f0Var.mo9678g(str)) {
            return f0Var.mo9672a(str);
        }
        return null;
    }

    /* renamed from: d */
    private static boolean m12536d(C2962f0 f0Var, String str, boolean z) {
        return f0Var.mo9678g(str) ? f0Var.mo9673b(str, z) : z;
    }

    /* renamed from: f */
    private static float m12537f(C2962f0 f0Var, String str, float f) {
        return f0Var.mo9678g(str) ? f0Var.mo9674c(str, f) : f;
    }

    /* renamed from: g */
    public static int m12538g(String str) {
        int i = f8985c;
        if (str == null) {
            return i;
        }
        if (!str.equals("normal")) {
            return !str.equals("none") ? 2 : 0;
        }
        return 1;
    }

    /* renamed from: h */
    private static int m12539h(C2962f0 f0Var, String str, int i) {
        return f0Var.mo9678g(str) ? f0Var.mo9675d(str, i) : i;
    }

    /* renamed from: i */
    public static int m12540i(C2962f0 f0Var) {
        if (!"justify".equals(f0Var.mo9678g("textAlign") ? f0Var.mo9677f("textAlign") : null) || Build.VERSION.SDK_INT < 26) {
            return f8983a;
        }
        return 1;
    }

    /* renamed from: j */
    public static int m12541j(String str) {
        if (str == null || "undefined".equals(str)) {
            return -1;
        }
        if ("rtl".equals(str)) {
            return 1;
        }
        if ("ltr".equals(str)) {
            return 0;
        }
        throw new JSApplicationIllegalArgumentException("Invalid layoutDirection: " + str);
    }

    /* renamed from: l */
    private static String m12542l(C2962f0 f0Var, String str) {
        if (f0Var.mo9678g(str)) {
            return f0Var.mo9677f(str);
        }
        return null;
    }

    /* renamed from: m */
    public static int m12543m(C2962f0 f0Var, boolean z) {
        String f = f0Var.mo9678g("textAlign") ? f0Var.mo9677f("textAlign") : null;
        if ("justify".equals(f)) {
            return 3;
        }
        if (f == null || "auto".equals(f)) {
            return 0;
        }
        if ("left".equals(f)) {
            return z ? 5 : 3;
        }
        if ("right".equals(f)) {
            if (z) {
                return 3;
            }
        } else if ("center".equals(f)) {
            return 1;
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid textAlign: " + f);
        }
    }

    /* renamed from: n */
    public static int m12544n(String str) {
        int i = f8984b;
        if (str == null) {
            return i;
        }
        if (!str.equals("balanced")) {
            return !str.equals("simple") ? 1 : 0;
        }
        return 2;
    }

    /* renamed from: o */
    private void m12545o(String str) {
        if (str != null) {
            this.f9014z = true;
            this.f9013y = C3046u.C3050d.m12082e(str);
        }
    }

    /* renamed from: p */
    private void m12546p(boolean z) {
        if (z != this.f8994f) {
            this.f8994f = z;
            m12550t(this.f9000l);
            m12526B(this.f9001m);
            m12525A(this.f9002n);
        }
    }

    /* renamed from: q */
    private void m12547q(Integer num) {
        boolean z = num != null;
        this.f8996h = z;
        if (z) {
            this.f8997i = num.intValue();
        }
    }

    /* renamed from: r */
    private void m12548r(Integer num) {
        boolean z = num != null;
        this.f8993e = z;
        if (z) {
            this.f8995g = num.intValue();
        }
    }

    /* renamed from: s */
    private void m12549s(String str) {
        this.f8988C = str;
    }

    /* renamed from: t */
    private void m12550t(float f) {
        this.f9000l = f;
        if (f != -1.0f) {
            f = (float) Math.ceil((double) (this.f8994f ? C3038r.m12008e(f) : C3038r.m12006c(f)));
        }
        this.f8999k = (int) f;
    }

    /* renamed from: u */
    private void m12551u(String str) {
        this.f8986A = C3200u.m12521b(str);
    }

    /* renamed from: v */
    private void m12552v(ReadableArray readableArray) {
        this.f8989D = C3200u.m12522c(readableArray);
    }

    /* renamed from: w */
    private void m12553w(ReadableMapBuffer readableMapBuffer) {
        String str;
        String str2;
        if (readableMapBuffer == null || readableMapBuffer.mo8830A() == 0) {
            str = null;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<ReadableMapBuffer.C2703b> it = readableMapBuffer.iterator();
            while (it.hasNext()) {
                String f = it.next().mo8849f();
                if (f != null) {
                    char c = 65535;
                    switch (f.hashCode()) {
                        case -1195362251:
                            if (f.equals("proportional-nums")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1061392823:
                            if (f.equals("lining-nums")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -771984547:
                            if (f.equals("tabular-nums")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -659678800:
                            if (f.equals("oldstyle-nums")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1183323111:
                            if (f.equals("small-caps")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            str2 = "'pnum'";
                            break;
                        case 1:
                            str2 = "'lnum'";
                            break;
                        case 2:
                            str2 = "'tnum'";
                            break;
                        case 3:
                            str2 = "'onum'";
                            break;
                        case 4:
                            str2 = "'smcp'";
                            break;
                    }
                    arrayList.add(str2);
                }
            }
            str = TextUtils.join(", ", arrayList);
        }
        this.f8989D = str;
    }

    /* renamed from: x */
    private void m12554x(String str) {
        this.f8987B = C3200u.m12523d(str);
    }

    /* renamed from: y */
    private void m12555y(boolean z) {
        this.f9012x = z;
    }

    /* renamed from: z */
    private void m12556z(String str) {
        this.f9004p = m12541j(str);
    }

    /* renamed from: e */
    public float mo10416e() {
        return !Float.isNaN(this.f8992d) && !Float.isNaN(this.f8991F) && (this.f8991F > this.f8992d ? 1 : (this.f8991F == this.f8992d ? 0 : -1)) > 0 ? this.f8991F : this.f8992d;
    }

    /* renamed from: k */
    public float mo10417k() {
        float e = this.f8994f ? C3038r.m12008e(this.f9002n) : C3038r.m12006c(this.f9002n);
        int i = this.f8999k;
        if (i > 0) {
            return e / ((float) i);
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.f8999k);
    }
}
