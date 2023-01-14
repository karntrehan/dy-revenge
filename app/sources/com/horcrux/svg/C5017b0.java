package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.C3040s;
import com.facebook.react.uimanager.p120j1.C2991a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.horcrux.svg.b0 */
public abstract class C5017b0 extends C5070x0 {

    /* renamed from: E0 */
    static C5017b0 f13996E0;

    /* renamed from: F0 */
    private static final Pattern f13997F0 = Pattern.compile("[0-9.-]+");

    /* renamed from: G0 */
    public int f13998G0 = 0;

    /* renamed from: H0 */
    public ReadableArray f13999H0;

    /* renamed from: I0 */
    public C5020c0[] f14000I0;

    /* renamed from: J0 */
    public C5020c0 f14001J0 = new C5020c0(1.0d);

    /* renamed from: K0 */
    public float f14002K0 = 1.0f;

    /* renamed from: L0 */
    public float f14003L0 = 4.0f;

    /* renamed from: M0 */
    public float f14004M0 = 0.0f;

    /* renamed from: N0 */
    public Paint.Cap f14005N0 = Paint.Cap.BUTT;

    /* renamed from: O0 */
    public Paint.Join f14006O0 = Paint.Join.MITER;

    /* renamed from: P0 */
    public ReadableArray f14007P0;

    /* renamed from: Q0 */
    public float f14008Q0 = 1.0f;

    /* renamed from: R0 */
    public Path.FillType f14009R0 = Path.FillType.WINDING;

    /* renamed from: S0 */
    private ArrayList<String> f14010S0;

    /* renamed from: T0 */
    private ArrayList<Object> f14011T0;

    /* renamed from: U0 */
    private ArrayList<String> f14012U0;

    /* renamed from: V0 */
    private ArrayList<String> f14013V0;

    /* renamed from: com.horcrux.svg.b0$a */
    static /* synthetic */ class C5018a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14014a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.horcrux.svg.y[] r0 = com.horcrux.svg.C5072y.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14014a = r0
                com.horcrux.svg.y r1 = com.horcrux.svg.C5072y.kStartMarker     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14014a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.horcrux.svg.y r1 = com.horcrux.svg.C5072y.kMidMarker     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14014a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.horcrux.svg.y r1 = com.horcrux.svg.C5072y.kEndMarker     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5017b0.C5018a.<clinit>():void");
        }
    }

    C5017b0(ReactContext reactContext) {
        super(reactContext);
        setPivotX(0.0f);
        setPivotY(0.0f);
    }

    /* renamed from: T */
    private boolean m18951T(String str) {
        ArrayList<String> arrayList = this.f14013V0;
        return arrayList != null && arrayList.contains(str);
    }

    /* renamed from: Y */
    private static double m18952Y(double d) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        if (d >= 1.0d) {
            return 1.0d;
        }
        return d;
    }

    /* renamed from: a0 */
    private void m18953a0(Paint paint, float f, ReadableArray readableArray) {
        int round;
        ReadableArray readableArray2;
        C5017b0 b0Var;
        int i = readableArray.getInt(0);
        if (i != 0) {
            if (i == 1) {
                C5012a K = getSvgView().mo15226K(readableArray.getString(1));
                if (K != null) {
                    K.mo15182i(paint, this.f14372t0, this.f14354b0, f);
                    return;
                }
                return;
            } else if (i != 2) {
                if (i == 3) {
                    C5017b0 b0Var2 = f13996E0;
                    if (b0Var2 == null || (readableArray2 = b0Var2.f14007P0) == null) {
                        return;
                    }
                } else if (i != 4 || (b0Var = f13996E0) == null || (readableArray2 = b0Var.f13999H0) == null) {
                    return;
                }
                m18953a0(paint, f, readableArray2);
                return;
            } else {
                round = getSvgView().f14060d0;
            }
        } else if (readableArray.size() == 2) {
            int intValue = readableArray.getType(1) == ReadableType.Map ? ColorPropConverter.getColor(readableArray.getMap(1), getContext()).intValue() : readableArray.getInt(1);
            round = (Math.round(((float) (intValue >>> 24)) * f) << 24) | (intValue & 16777215);
        } else {
            paint.setARGB((int) (readableArray.size() > 4 ? readableArray.getDouble(4) * ((double) f) * 255.0d : (double) (f * 255.0f)), (int) (readableArray.getDouble(1) * 255.0d), (int) (readableArray.getDouble(2) * 255.0d), (int) (readableArray.getDouble(3) * 255.0d));
            return;
        }
        paint.setColor(round);
    }

    private ArrayList<String> getAttributeList() {
        return this.f14013V0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo15193F(Canvas canvas, Paint paint, float f) {
        float f2 = f * this.f14337H;
        boolean z = false;
        boolean z2 = this.f14367o0 == null;
        if (z2) {
            Path I = mo15183I(canvas, paint);
            this.f14367o0 = I;
            I.setFillType(this.f14009R0);
        }
        if (this.f13998G0 == 1) {
            z = true;
        }
        Path path = this.f14367o0;
        if (z) {
            path = new Path();
            this.f14367o0.transform(this.f14338I, path);
            canvas.setMatrix((Matrix) null);
        }
        if (z2 || path != this.f14367o0) {
            RectF rectF = new RectF();
            this.f14372t0 = rectF;
            path.computeBounds(rectF, true);
        }
        RectF rectF2 = new RectF(this.f14372t0);
        this.f14338I.mapRect(rectF2);
        setClientRect(rectF2);
        mo15379E(canvas, paint);
        if (mo15201Z(paint, this.f14008Q0 * f2)) {
            if (z2) {
                Path path2 = new Path();
                this.f14368p0 = path2;
                paint.getFillPath(path, path2);
            }
            canvas.drawPath(path, paint);
        }
        if (mo15202b0(paint, this.f14002K0 * f2)) {
            if (z2) {
                Path path3 = new Path();
                this.f14369q0 = path3;
                paint.getFillPath(path, path3);
            }
            canvas.drawPath(path, paint);
        }
        mo15199W(canvas, paint, f2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public int mo15194J(float[] fArr) {
        Region region;
        Region region2;
        if (this.f14367o0 == null || !this.f14344O || !this.f14346Q || this.f14335D0 == C3040s.NONE) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.f14342M.mapPoints(fArr2, fArr);
        this.f14343N.mapPoints(fArr2);
        int round = Math.round(fArr2[0]);
        int round2 = Math.round(fArr2[1]);
        mo15197U();
        Region region3 = this.f14377y0;
        if ((region3 != null && region3.contains(round, round2)) || ((region = this.f14332A0) != null && (region.contains(round, round2) || ((region2 = this.f14378z0) != null && region2.contains(round, round2))))) {
            if (getClipPath() == null || this.f14333B0.contains(round, round2)) {
                return getId();
            }
            return -1;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo15195O(Canvas canvas, Paint paint, float f) {
        Paint paint2 = paint;
        C5053q qVar = this.f14350U != null ? (C5053q) getSvgView().mo15229N(this.f14350U) : null;
        if (qVar != null) {
            Rect clipBounds = canvas.getClipBounds();
            int height = clipBounds.height();
            int width = clipBounds.width();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Bitmap createBitmap2 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Bitmap createBitmap3 = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            Canvas canvas3 = new Canvas(createBitmap);
            Canvas canvas4 = new Canvas(createBitmap3);
            int i = width;
            canvas3.clipRect((float) mo15383N(qVar.f14251Z0), (float) mo15381L(qVar.f14252a1), (float) mo15383N(qVar.f14253b1), (float) mo15381L(qVar.f14254c1));
            Paint paint3 = new Paint(1);
            qVar.mo15193F(canvas3, paint3, 1.0f);
            int i2 = i * height;
            int[] iArr = new int[i2];
            Canvas canvas5 = canvas4;
            Canvas canvas6 = canvas2;
            Bitmap bitmap = createBitmap3;
            createBitmap.getPixels(iArr, 0, i, 0, 0, i, height);
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                iArr[i3] = ((int) (((double) (i4 >>> 24)) * m18952Y((((((double) ((i4 >> 16) & 255)) * 0.299d) + (((double) ((i4 >> 8) & 255)) * 0.587d)) + (((double) (i4 & 255)) * 0.144d)) / 255.0d))) << 24;
                i3++;
                i2 = i2;
                paint3 = paint3;
            }
            createBitmap.setPixels(iArr, 0, i, 0, 0, i, height);
            mo15193F(canvas6, paint2, f);
            Paint paint4 = paint3;
            paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            Canvas canvas7 = canvas5;
            canvas7.drawBitmap(createBitmap2, 0.0f, 0.0f, (Paint) null);
            canvas7.drawBitmap(createBitmap, 0.0f, 0.0f, paint4);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
            return;
        }
        Canvas canvas8 = canvas;
        float f2 = f;
        mo15193F(canvas, paint, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public Region mo15196S(Path path, RectF rectF) {
        Region region = new Region();
        region.setPath(path, new Region((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom)));
        return region;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo15197U() {
        if (this.f14377y0 == null && this.f14368p0 != null) {
            RectF rectF = new RectF();
            this.f14373u0 = rectF;
            this.f14368p0.computeBounds(rectF, true);
            this.f14377y0 = mo15196S(this.f14368p0, this.f14373u0);
        }
        if (this.f14377y0 == null && this.f14367o0 != null) {
            RectF rectF2 = new RectF();
            this.f14373u0 = rectF2;
            this.f14367o0.computeBounds(rectF2, true);
            this.f14377y0 = mo15196S(this.f14367o0, this.f14373u0);
        }
        if (this.f14332A0 == null && this.f14369q0 != null) {
            RectF rectF3 = new RectF();
            this.f14374v0 = rectF3;
            this.f14369q0.computeBounds(rectF3, true);
            this.f14332A0 = mo15196S(this.f14369q0, this.f14374v0);
        }
        if (this.f14378z0 == null && this.f14370r0 != null) {
            RectF rectF4 = new RectF();
            this.f14375w0 = rectF4;
            this.f14370r0.computeBounds(rectF4, true);
            this.f14378z0 = mo15196S(this.f14370r0, this.f14375w0);
        }
        Path clipPath = getClipPath();
        if (clipPath != null && this.f14371s0 != clipPath) {
            this.f14371s0 = clipPath;
            RectF rectF5 = new RectF();
            this.f14376x0 = rectF5;
            clipPath.computeBounds(rectF5, true);
            this.f14333B0 = mo15196S(clipPath, this.f14376x0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo15198V(C5017b0 b0Var) {
        ArrayList<String> attributeList = b0Var.getAttributeList();
        if (attributeList != null && attributeList.size() != 0) {
            this.f14011T0 = new ArrayList<>();
            this.f14013V0 = this.f14012U0 == null ? new ArrayList<>() : new ArrayList<>(this.f14012U0);
            int i = 0;
            int size = attributeList.size();
            while (i < size) {
                try {
                    String str = attributeList.get(i);
                    Field field = getClass().getField(str);
                    Object obj = field.get(b0Var);
                    this.f14011T0.add(field.get(this));
                    if (!m18951T(str)) {
                        this.f14013V0.add(str);
                        field.set(this, obj);
                    }
                    i++;
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            }
            this.f14010S0 = attributeList;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo15199W(Canvas canvas, Paint paint, float f) {
        C5051p pVar = (C5051p) getSvgView().mo15228M(this.f14351V);
        C5051p pVar2 = (C5051p) getSvgView().mo15228M(this.f14352W);
        C5051p pVar3 = (C5051p) getSvgView().mo15228M(this.f14353a0);
        ArrayList<C5055r> arrayList = this.f14334C0;
        if (arrayList == null) {
            return;
        }
        if (pVar != null || pVar2 != null || pVar3 != null) {
            f13996E0 = this;
            ArrayList<C5068x> h = C5068x.m19158h(arrayList);
            C5020c0 c0Var = this.f14001J0;
            float M = (float) (c0Var != null ? mo15382M(c0Var) : 1.0d);
            this.f14370r0 = new Path();
            Iterator<C5068x> it = h.iterator();
            while (it.hasNext()) {
                C5068x next = it.next();
                int i = C5018a.f14014a[next.f14326h.ordinal()];
                C5051p pVar4 = i != 1 ? i != 2 ? i != 3 ? null : pVar3 : pVar2 : pVar;
                if (pVar4 != null) {
                    pVar4.mo15323l0(canvas, paint, f, next, M);
                    this.f14370r0.addPath(pVar4.mo15183I(canvas, paint), pVar4.f14246k1);
                }
            }
            f13996E0 = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public void mo15200X() {
        ArrayList<String> arrayList = this.f14010S0;
        if (arrayList != null && this.f14011T0 != null) {
            try {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    getClass().getField(this.f14010S0.get(size)).set(this, this.f14011T0.get(size));
                }
                this.f14010S0 = null;
                this.f14011T0 = null;
                this.f14013V0 = this.f14012U0;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public boolean mo15201Z(Paint paint, float f) {
        ReadableArray readableArray = this.f14007P0;
        if (readableArray == null || readableArray.size() <= 0) {
            return false;
        }
        paint.reset();
        paint.setFlags(385);
        paint.setStyle(Paint.Style.FILL);
        m18953a0(paint, f, this.f14007P0);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean mo15202b0(Paint paint, float f) {
        ReadableArray readableArray;
        paint.reset();
        double M = mo15382M(this.f14001J0);
        if (M == 0.0d || (readableArray = this.f13999H0) == null || readableArray.size() == 0) {
            return false;
        }
        paint.setFlags(385);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f14005N0);
        paint.setStrokeJoin(this.f14006O0);
        paint.setStrokeMiter(this.f14003L0 * this.f14354b0);
        paint.setStrokeWidth((float) M);
        m18953a0(paint, f, this.f13999H0);
        C5020c0[] c0VarArr = this.f14000I0;
        if (c0VarArr == null) {
            return true;
        }
        int length = c0VarArr.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            fArr[i] = (float) mo15382M(this.f14000I0[i]);
        }
        paint.setPathEffect(new DashPathEffect(fArr, this.f14004M0));
        return true;
    }

    @C2991a(name = "fill")
    public void setFill(Dynamic dynamic) {
        ReadableArray asArray;
        if (dynamic == null || dynamic.isNull()) {
            this.f14007P0 = null;
            invalidate();
            return;
        }
        ReadableType type = dynamic.getType();
        int i = 0;
        if (type.equals(ReadableType.Number)) {
            asArray = JavaOnlyArray.m10885of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            asArray = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = f13997F0.matcher(dynamic.asString());
            while (matcher.find()) {
                double parseDouble = Double.parseDouble(matcher.group());
                int i2 = i + 1;
                if (i < 3) {
                    parseDouble /= 255.0d;
                }
                javaOnlyArray.pushDouble(parseDouble);
                i = i2;
            }
            this.f14007P0 = javaOnlyArray;
            invalidate();
        }
        this.f14007P0 = asArray;
        invalidate();
    }

    @C2991a(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(float f) {
        this.f14008Q0 = f;
        invalidate();
    }

    @C2991a(defaultInt = 1, name = "fillRule")
    public void setFillRule(int i) {
        if (i == 0) {
            this.f14009R0 = Path.FillType.EVEN_ODD;
        } else if (i != 1) {
            throw new JSApplicationIllegalArgumentException("fillRule " + i + " unrecognized");
        }
        invalidate();
    }

    public void setId(int i) {
        super.setId(i);
        RenderableViewManager.setRenderableView(i, this);
    }

    @C2991a(name = "propList")
    public void setPropList(ReadableArray readableArray) {
        if (readableArray != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            this.f14013V0 = arrayList;
            this.f14012U0 = arrayList;
            for (int i = 0; i < readableArray.size(); i++) {
                this.f14012U0.add(readableArray.getString(i));
            }
        }
        invalidate();
    }

    @C2991a(name = "stroke")
    public void setStroke(Dynamic dynamic) {
        ReadableArray asArray;
        if (dynamic == null || dynamic.isNull()) {
            this.f13999H0 = null;
            invalidate();
            return;
        }
        ReadableType type = dynamic.getType();
        int i = 0;
        if (type.equals(ReadableType.Number)) {
            asArray = JavaOnlyArray.m10885of(0, Integer.valueOf(dynamic.asInt()));
        } else if (type.equals(ReadableType.Array)) {
            asArray = dynamic.asArray();
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            javaOnlyArray.pushInt(0);
            Matcher matcher = f13997F0.matcher(dynamic.asString());
            while (matcher.find()) {
                double parseDouble = Double.parseDouble(matcher.group());
                int i2 = i + 1;
                if (i < 3) {
                    parseDouble /= 255.0d;
                }
                javaOnlyArray.pushDouble(parseDouble);
                i = i2;
            }
            this.f13999H0 = javaOnlyArray;
            invalidate();
        }
        this.f13999H0 = asArray;
        invalidate();
    }

    @C2991a(name = "strokeDasharray")
    public void setStrokeDasharray(ReadableArray readableArray) {
        if (readableArray != null) {
            int size = readableArray.size();
            this.f14000I0 = new C5020c0[size];
            for (int i = 0; i < size; i++) {
                this.f14000I0[i] = C5020c0.m18971b(readableArray.getDynamic(i));
            }
        } else {
            this.f14000I0 = null;
        }
        invalidate();
    }

    @C2991a(name = "strokeDashoffset")
    public void setStrokeDashoffset(float f) {
        this.f14004M0 = f * this.f14354b0;
        invalidate();
    }

    @C2991a(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(int i) {
        Paint.Cap cap;
        if (i == 0) {
            cap = Paint.Cap.BUTT;
        } else if (i == 1) {
            cap = Paint.Cap.ROUND;
        } else if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            throw new JSApplicationIllegalArgumentException("strokeLinecap " + i + " unrecognized");
        }
        this.f14005N0 = cap;
        invalidate();
    }

    @C2991a(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(int i) {
        Paint.Join join;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else if (i == 1) {
            join = Paint.Join.ROUND;
        } else if (i == 2) {
            join = Paint.Join.BEVEL;
        } else {
            throw new JSApplicationIllegalArgumentException("strokeLinejoin " + i + " unrecognized");
        }
        this.f14006O0 = join;
        invalidate();
    }

    @C2991a(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(float f) {
        this.f14003L0 = f;
        invalidate();
    }

    @C2991a(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(float f) {
        this.f14002K0 = f;
        invalidate();
    }

    @C2991a(name = "strokeWidth")
    public void setStrokeWidth(Dynamic dynamic) {
        this.f14001J0 = C5020c0.m18971b(dynamic);
        invalidate();
    }

    @C2991a(name = "vectorEffect")
    public void setVectorEffect(int i) {
        this.f13998G0 = i;
        invalidate();
    }
}
