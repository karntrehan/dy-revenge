package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.modules.i18nmanager.C2822a;
import com.facebook.react.uimanager.p120j1.C2991a;
import com.facebook.react.uimanager.p120j1.C2992b;
import com.facebook.yoga.C3301a;
import com.facebook.yoga.C3309i;
import com.facebook.yoga.C3311k;
import com.facebook.yoga.C3312l;
import com.facebook.yoga.C3320s;
import com.facebook.yoga.C3321t;
import com.facebook.yoga.C3322u;
import com.facebook.yoga.C3325w;

/* renamed from: com.facebook.react.uimanager.j */
public class C2987j extends C2940e0 {

    /* renamed from: y */
    private final C2989b f8318y = new C2989b((C2988a) null);

    /* renamed from: z */
    boolean f8319z;

    /* renamed from: com.facebook.react.uimanager.j$a */
    static /* synthetic */ class C2988a {

        /* renamed from: a */
        static final /* synthetic */ int[] f8320a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.facebook.yoga.u[] r0 = com.facebook.yoga.C3322u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8320a = r0
                com.facebook.yoga.u r1 = com.facebook.yoga.C3322u.POINT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8320a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.yoga.u r1 = com.facebook.yoga.C3322u.UNDEFINED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8320a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.yoga.u r1 = com.facebook.yoga.C3322u.AUTO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f8320a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.yoga.u r1 = com.facebook.yoga.C3322u.PERCENT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.C2987j.C2988a.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.react.uimanager.j$b */
    private static class C2989b {

        /* renamed from: a */
        float f8321a;

        /* renamed from: b */
        C3322u f8322b;

        private C2989b() {
        }

        /* synthetic */ C2989b(C2988a aVar) {
            this();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9712a(Dynamic dynamic) {
            float f;
            C3322u uVar;
            if (dynamic.isNull()) {
                uVar = C3322u.UNDEFINED;
            } else {
                if (dynamic.getType() == ReadableType.String) {
                    String asString = dynamic.asString();
                    if (asString.equals("auto")) {
                        uVar = C3322u.AUTO;
                    } else if (asString.endsWith("%")) {
                        this.f8322b = C3322u.PERCENT;
                        f = Float.parseFloat(asString.substring(0, asString.length() - 1));
                    } else {
                        throw new IllegalArgumentException("Unknown value: " + asString);
                    }
                } else {
                    this.f8322b = C3322u.POINT;
                    f = C3038r.m12005b(dynamic.asDouble());
                }
                this.f8321a = f;
                return;
            }
            this.f8322b = uVar;
            this.f8321a = Float.NaN;
        }
    }

    /* renamed from: p1 */
    private int m11845p1(int i) {
        if (!C2822a.m11246d().mo9190b(mo9506I())) {
            return i;
        }
        if (i == 0) {
            return 4;
        }
        if (i != 2) {
            return i;
        }
        return 5;
    }

    @C2991a(name = "alignContent")
    public void setAlignContent(String str) {
        C3301a aVar;
        if (!mo9551w()) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1881872635:
                        if (str.equals("stretch")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1720785339:
                        if (str.equals("baseline")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1364013995:
                        if (str.equals("center")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -46581362:
                        if (str.equals("flex-start")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 441309761:
                        if (str.equals("space-between")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1742952711:
                        if (str.equals("flex-end")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1937124468:
                        if (str.equals("space-around")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        aVar = C3301a.STRETCH;
                        break;
                    case 1:
                        aVar = C3301a.BASELINE;
                        break;
                    case 2:
                        aVar = C3301a.CENTER;
                        break;
                    case 3:
                        break;
                    case 4:
                        aVar = C3301a.AUTO;
                        break;
                    case 5:
                        aVar = C3301a.SPACE_BETWEEN;
                        break;
                    case 6:
                        aVar = C3301a.FLEX_END;
                        break;
                    case 7:
                        aVar = C3301a.SPACE_AROUND;
                        break;
                    default:
                        throw new JSApplicationIllegalArgumentException("invalid value for alignContent: " + str);
                }
            }
            aVar = C3301a.FLEX_START;
            mo9560C0(aVar);
        }
    }

    @C2991a(name = "alignItems")
    public void setAlignItems(String str) {
        C3301a aVar;
        if (!mo9551w()) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1881872635:
                        if (str.equals("stretch")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1720785339:
                        if (str.equals("baseline")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1364013995:
                        if (str.equals("center")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -46581362:
                        if (str.equals("flex-start")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 441309761:
                        if (str.equals("space-between")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1742952711:
                        if (str.equals("flex-end")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1937124468:
                        if (str.equals("space-around")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        break;
                    case 1:
                        aVar = C3301a.BASELINE;
                        break;
                    case 2:
                        aVar = C3301a.CENTER;
                        break;
                    case 3:
                        aVar = C3301a.FLEX_START;
                        break;
                    case 4:
                        aVar = C3301a.AUTO;
                        break;
                    case 5:
                        aVar = C3301a.SPACE_BETWEEN;
                        break;
                    case 6:
                        aVar = C3301a.FLEX_END;
                        break;
                    case 7:
                        aVar = C3301a.SPACE_AROUND;
                        break;
                    default:
                        throw new JSApplicationIllegalArgumentException("invalid value for alignItems: " + str);
                }
            }
            aVar = C3301a.STRETCH;
            mo9561D0(aVar);
        }
    }

    @C2991a(name = "alignSelf")
    public void setAlignSelf(String str) {
        C3301a aVar;
        if (!mo9551w()) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1881872635:
                        if (str.equals("stretch")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1720785339:
                        if (str.equals("baseline")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1364013995:
                        if (str.equals("center")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -46581362:
                        if (str.equals("flex-start")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3005871:
                        if (str.equals("auto")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 441309761:
                        if (str.equals("space-between")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1742952711:
                        if (str.equals("flex-end")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 1937124468:
                        if (str.equals("space-around")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        aVar = C3301a.STRETCH;
                        break;
                    case 1:
                        aVar = C3301a.BASELINE;
                        break;
                    case 2:
                        aVar = C3301a.CENTER;
                        break;
                    case 3:
                        aVar = C3301a.FLEX_START;
                        break;
                    case 4:
                        break;
                    case 5:
                        aVar = C3301a.SPACE_BETWEEN;
                        break;
                    case 6:
                        aVar = C3301a.FLEX_END;
                        break;
                    case 7:
                        aVar = C3301a.SPACE_AROUND;
                        break;
                    default:
                        throw new JSApplicationIllegalArgumentException("invalid value for alignSelf: " + str);
                }
            }
            aVar = C3301a.AUTO;
            mo9562E0(aVar);
        }
    }

    @C2991a(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f) {
        mo9584a1(f);
    }

    @C2992b(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i, float f) {
        if (!mo9551w()) {
            mo9564G0(m11845p1(C2983h1.f8306a[i]), C3038r.m12006c(f));
        }
    }

    @C2991a(name = "collapsable")
    public void setCollapsable(boolean z) {
        this.f8319z = z;
    }

    @C2991a(name = "display")
    public void setDisplay(String str) {
        C3309i iVar;
        if (!mo9551w()) {
            if (str == null) {
                mo9566I0(C3309i.FLEX);
                return;
            }
            if (str.equals("flex")) {
                iVar = C3309i.FLEX;
            } else if (!str.equals("none")) {
                throw new JSApplicationIllegalArgumentException("invalid value for display: " + str);
            } else {
                iVar = C3309i.NONE;
            }
            mo9566I0(iVar);
        }
    }

    @C2991a(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f) {
        if (!mo9551w()) {
            super.setFlex(f);
        }
    }

    @C2991a(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (!mo9551w()) {
            this.f8318y.mo9712a(dynamic);
            int i = C2988a.f8320a[this.f8318y.f8322b.ordinal()];
            if (i == 1 || i == 2) {
                mo9567J0(this.f8318y.f8321a);
            } else if (i == 3) {
                mo9568K0();
            } else if (i == 4) {
                mo9569L0(this.f8318y.f8321a);
            }
            dynamic.recycle();
        }
    }

    @C2991a(name = "flexDirection")
    public void setFlexDirection(String str) {
        C3311k kVar;
        if (!mo9551w()) {
            if (str == null) {
                mo9570M0(C3311k.COLUMN);
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1448970769:
                    if (str.equals("row-reverse")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1354837162:
                    if (str.equals("column")) {
                        c = 1;
                        break;
                    }
                    break;
                case 113114:
                    if (str.equals("row")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1272730475:
                    if (str.equals("column-reverse")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    kVar = C3311k.ROW_REVERSE;
                    break;
                case 1:
                    kVar = C3311k.COLUMN;
                    break;
                case 2:
                    kVar = C3311k.ROW;
                    break;
                case 3:
                    kVar = C3311k.COLUMN_REVERSE;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for flexDirection: " + str);
            }
            mo9570M0(kVar);
        }
    }

    @C2991a(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f) {
        if (!mo9551w()) {
            super.setFlexGrow(f);
        }
    }

    @C2991a(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f) {
        if (!mo9551w()) {
            super.setFlexShrink(f);
        }
    }

    @C2991a(name = "flexWrap")
    public void setFlexWrap(String str) {
        C3325w wVar;
        if (!mo9551w()) {
            if (str == null) {
                mo9571N0(C3325w.NO_WRAP);
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1039592053:
                    if (str.equals("nowrap")) {
                        c = 0;
                        break;
                    }
                    break;
                case -749527969:
                    if (str.equals("wrap-reverse")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3657802:
                    if (str.equals("wrap")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    wVar = C3325w.NO_WRAP;
                    break;
                case 1:
                    wVar = C3325w.WRAP_REVERSE;
                    break;
                case 2:
                    wVar = C3325w.WRAP;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for flexWrap: " + str);
            }
            mo9571N0(wVar);
        }
    }

    @C2991a(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (!mo9551w()) {
            this.f8318y.mo9712a(dynamic);
            int i = C2988a.f8320a[this.f8318y.f8322b.ordinal()];
            if (i == 1 || i == 2) {
                mo9537i(this.f8318y.f8321a);
            } else if (i == 3) {
                mo9585b1();
            } else if (i == 4) {
                mo9586c1(this.f8318y.f8321a);
            }
            dynamic.recycle();
        }
    }

    @C2991a(name = "justifyContent")
    public void setJustifyContent(String str) {
        C3312l lVar;
        if (!mo9551w()) {
            if (str == null) {
                mo9572O0(C3312l.FLEX_START);
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        c = 0;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals("flex-start")) {
                        c = 1;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals("space-between")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals("flex-end")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals("space-around")) {
                        c = 4;
                        break;
                    }
                    break;
                case 2055030478:
                    if (str.equals("space-evenly")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    lVar = C3312l.CENTER;
                    break;
                case 1:
                    lVar = C3312l.FLEX_START;
                    break;
                case 2:
                    lVar = C3312l.SPACE_BETWEEN;
                    break;
                case 3:
                    lVar = C3312l.FLEX_END;
                    break;
                case 4:
                    lVar = C3312l.SPACE_AROUND;
                    break;
                case 5:
                    lVar = C3312l.SPACE_EVENLY;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for justifyContent: " + str);
            }
            mo9572O0(lVar);
        }
    }

    @C2992b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        if (!mo9551w()) {
            int p1 = m11845p1(C2983h1.f8307b[i]);
            this.f8318y.mo9712a(dynamic);
            int i2 = C2988a.f8320a[this.f8318y.f8322b.ordinal()];
            if (i2 == 1 || i2 == 2) {
                mo9574Q0(p1, this.f8318y.f8321a);
            } else if (i2 == 3) {
                mo9575R0(p1);
            } else if (i2 == 4) {
                mo9576S0(p1, this.f8318y.f8321a);
            }
            dynamic.recycle();
        }
    }

    @C2991a(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (!mo9551w()) {
            this.f8318y.mo9712a(dynamic);
            int i = C2988a.f8320a[this.f8318y.f8322b.ordinal()];
            if (i == 1 || i == 2) {
                mo9588d1(this.f8318y.f8321a);
            } else if (i == 4) {
                mo9590e1(this.f8318y.f8321a);
            }
            dynamic.recycle();
        }
    }

    @C2991a(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (!mo9551w()) {
            this.f8318y.mo9712a(dynamic);
            int i = C2988a.f8320a[this.f8318y.f8322b.ordinal()];
            if (i == 1 || i == 2) {
                mo9592f1(this.f8318y.f8321a);
            } else if (i == 4) {
                mo9594g1(this.f8318y.f8321a);
            }
            dynamic.recycle();
        }
    }

    @C2991a(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (!mo9551w()) {
            this.f8318y.mo9712a(dynamic);
            int i = C2988a.f8320a[this.f8318y.f8322b.ordinal()];
            if (i == 1 || i == 2) {
                mo9596h1(this.f8318y.f8321a);
            } else if (i == 4) {
                mo9598i1(this.f8318y.f8321a);
            }
            dynamic.recycle();
        }
    }

    @C2991a(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (!mo9551w()) {
            this.f8318y.mo9712a(dynamic);
            int i = C2988a.f8320a[this.f8318y.f8322b.ordinal()];
            if (i == 1 || i == 2) {
                mo9600j1(this.f8318y.f8321a);
            } else if (i == 4) {
                mo9602k1(this.f8318y.f8321a);
            }
            dynamic.recycle();
        }
    }

    @C2991a(name = "overflow")
    public void setOverflow(String str) {
        C3320s sVar;
        if (!mo9551w()) {
            if (str == null) {
                mo9578U0(C3320s.VISIBLE);
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1217487446:
                    if (str.equals("hidden")) {
                        c = 0;
                        break;
                    }
                    break;
                case -907680051:
                    if (str.equals("scroll")) {
                        c = 1;
                        break;
                    }
                    break;
                case 466743410:
                    if (str.equals("visible")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    sVar = C3320s.HIDDEN;
                    break;
                case 1:
                    sVar = C3320s.SCROLL;
                    break;
                case 2:
                    sVar = C3320s.VISIBLE;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for overflow: " + str);
            }
            mo9578U0(sVar);
        }
    }

    @C2992b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        if (!mo9551w()) {
            int p1 = m11845p1(C2983h1.f8307b[i]);
            this.f8318y.mo9712a(dynamic);
            int i2 = C2988a.f8320a[this.f8318y.f8322b.ordinal()];
            if (i2 == 1 || i2 == 2) {
                mo9579V0(p1, this.f8318y.f8321a);
            } else if (i2 == 4) {
                mo9580W0(p1, this.f8318y.f8321a);
            }
            dynamic.recycle();
        }
    }

    @C2991a(name = "position")
    public void setPosition(String str) {
        C3321t tVar;
        if (!mo9551w()) {
            if (str == null) {
                mo9583Z0(C3321t.RELATIVE);
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -892481938:
                    if (str.equals("static")) {
                        c = 0;
                        break;
                    }
                    break;
                case -554435892:
                    if (str.equals("relative")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1728122231:
                    if (str.equals("absolute")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    tVar = C3321t.STATIC;
                    break;
                case 1:
                    tVar = C3321t.RELATIVE;
                    break;
                case 2:
                    tVar = C3321t.ABSOLUTE;
                    break;
                default:
                    throw new JSApplicationIllegalArgumentException("invalid value for position: " + str);
            }
            mo9583Z0(tVar);
        }
    }

    @C2992b(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (!mo9551w()) {
            int p1 = m11845p1(new int[]{4, 5, 0, 2, 1, 3}[i]);
            this.f8318y.mo9712a(dynamic);
            int i2 = C2988a.f8320a[this.f8318y.f8322b.ordinal()];
            if (i2 == 1 || i2 == 2) {
                mo9581X0(p1, this.f8318y.f8321a);
            } else if (i2 == 4) {
                mo9582Y0(p1, this.f8318y.f8321a);
            }
            dynamic.recycle();
        }
    }

    @C2991a(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        super.setShouldNotifyOnLayout(z);
    }

    @C2991a(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (!mo9551w()) {
            this.f8318y.mo9712a(dynamic);
            int i = C2988a.f8320a[this.f8318y.f8322b.ordinal()];
            if (i == 1 || i == 2) {
                mo9501D(this.f8318y.f8321a);
            } else if (i == 3) {
                mo9604l1();
            } else if (i == 4) {
                mo9605m1(this.f8318y.f8321a);
            }
            dynamic.recycle();
        }
    }
}
