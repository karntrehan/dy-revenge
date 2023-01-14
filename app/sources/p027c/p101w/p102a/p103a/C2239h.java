package p027c.p101w.p102a.p103a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.p022d.C1145b;
import androidx.core.content.p022d.C1163g;
import androidx.core.graphics.drawable.C1164a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p027c.p060f.C1788a;
import p027c.p064i.p065d.C1829c;

/* renamed from: c.w.a.a.h */
public class C2239h extends C2238g {

    /* renamed from: o */
    static final PorterDuff.Mode f6526o = PorterDuff.Mode.SRC_IN;

    /* renamed from: p */
    private C2247h f6527p;

    /* renamed from: q */
    private PorterDuffColorFilter f6528q;

    /* renamed from: r */
    private ColorFilter f6529r;

    /* renamed from: s */
    private boolean f6530s;

    /* renamed from: t */
    private boolean f6531t;

    /* renamed from: u */
    private Drawable.ConstantState f6532u;

    /* renamed from: v */
    private final float[] f6533v;

    /* renamed from: w */
    private final Matrix f6534w;

    /* renamed from: x */
    private final Rect f6535x;

    /* renamed from: c.w.a.a.h$b */
    private static class C2241b extends C2245f {
        C2241b() {
        }

        C2241b(C2241b bVar) {
            super(bVar);
        }

        /* renamed from: f */
        private void m9462f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f6562b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f6561a = C1829c.m7768d(string2);
            }
            this.f6563c = C1163g.m4515g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        /* renamed from: c */
        public boolean mo7487c() {
            return true;
        }

        /* renamed from: e */
        public void mo7488e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (C1163g.m4518j(xmlPullParser, "pathData")) {
                TypedArray k = C1163g.m4519k(resources, theme, attributeSet, C2228a.f6499d);
                m9462f(k, xmlPullParser);
                k.recycle();
            }
        }
    }

    /* renamed from: c.w.a.a.h$c */
    private static class C2242c extends C2245f {

        /* renamed from: e */
        private int[] f6536e;

        /* renamed from: f */
        C1145b f6537f;

        /* renamed from: g */
        float f6538g = 0.0f;

        /* renamed from: h */
        C1145b f6539h;

        /* renamed from: i */
        float f6540i = 1.0f;

        /* renamed from: j */
        float f6541j = 1.0f;

        /* renamed from: k */
        float f6542k = 0.0f;

        /* renamed from: l */
        float f6543l = 1.0f;

        /* renamed from: m */
        float f6544m = 0.0f;

        /* renamed from: n */
        Paint.Cap f6545n = Paint.Cap.BUTT;

        /* renamed from: o */
        Paint.Join f6546o = Paint.Join.MITER;

        /* renamed from: p */
        float f6547p = 4.0f;

        C2242c() {
        }

        C2242c(C2242c cVar) {
            super(cVar);
            this.f6536e = cVar.f6536e;
            this.f6537f = cVar.f6537f;
            this.f6538g = cVar.f6538g;
            this.f6540i = cVar.f6540i;
            this.f6539h = cVar.f6539h;
            this.f6563c = cVar.f6563c;
            this.f6541j = cVar.f6541j;
            this.f6542k = cVar.f6542k;
            this.f6543l = cVar.f6543l;
            this.f6544m = cVar.f6544m;
            this.f6545n = cVar.f6545n;
            this.f6546o = cVar.f6546o;
            this.f6547p = cVar.f6547p;
        }

        /* renamed from: e */
        private Paint.Cap m9465e(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        /* renamed from: f */
        private Paint.Join m9466f(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        /* renamed from: h */
        private void m9467h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f6536e = null;
            if (C1163g.m4518j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f6562b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f6561a = C1829c.m7768d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f6539h = C1163g.m4513e(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f6541j = C1163g.m4514f(typedArray, xmlPullParser, "fillAlpha", 12, this.f6541j);
                this.f6545n = m9465e(C1163g.m4515g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f6545n);
                this.f6546o = m9466f(C1163g.m4515g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f6546o);
                this.f6547p = C1163g.m4514f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f6547p);
                this.f6537f = C1163g.m4513e(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f6540i = C1163g.m4514f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f6540i);
                this.f6538g = C1163g.m4514f(typedArray, xmlPullParser, "strokeWidth", 4, this.f6538g);
                this.f6543l = C1163g.m4514f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f6543l);
                this.f6544m = C1163g.m4514f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f6544m);
                this.f6542k = C1163g.m4514f(typedArray, xmlPullParser, "trimPathStart", 5, this.f6542k);
                this.f6563c = C1163g.m4515g(typedArray, xmlPullParser, "fillType", 13, this.f6563c);
            }
        }

        /* renamed from: a */
        public boolean mo7489a() {
            return this.f6539h.mo3624i() || this.f6537f.mo3624i();
        }

        /* renamed from: b */
        public boolean mo7490b(int[] iArr) {
            return this.f6537f.mo3625j(iArr) | this.f6539h.mo3625j(iArr);
        }

        /* renamed from: g */
        public void mo7491g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C1163g.m4519k(resources, theme, attributeSet, C2228a.f6498c);
            m9467h(k, xmlPullParser, theme);
            k.recycle();
        }

        /* access modifiers changed from: package-private */
        public float getFillAlpha() {
            return this.f6541j;
        }

        /* access modifiers changed from: package-private */
        public int getFillColor() {
            return this.f6539h.mo3621e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeAlpha() {
            return this.f6540i;
        }

        /* access modifiers changed from: package-private */
        public int getStrokeColor() {
            return this.f6537f.mo3621e();
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.f6538g;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathEnd() {
            return this.f6543l;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathOffset() {
            return this.f6544m;
        }

        /* access modifiers changed from: package-private */
        public float getTrimPathStart() {
            return this.f6542k;
        }

        /* access modifiers changed from: package-private */
        public void setFillAlpha(float f) {
            this.f6541j = f;
        }

        /* access modifiers changed from: package-private */
        public void setFillColor(int i) {
            this.f6539h.mo3626k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeAlpha(float f) {
            this.f6540i = f;
        }

        /* access modifiers changed from: package-private */
        public void setStrokeColor(int i) {
            this.f6537f.mo3626k(i);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f) {
            this.f6538g = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathEnd(float f) {
            this.f6543l = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathOffset(float f) {
            this.f6544m = f;
        }

        /* access modifiers changed from: package-private */
        public void setTrimPathStart(float f) {
            this.f6542k = f;
        }
    }

    /* renamed from: c.w.a.a.h$d */
    private static class C2243d extends C2244e {

        /* renamed from: a */
        final Matrix f6548a;

        /* renamed from: b */
        final ArrayList<C2244e> f6549b;

        /* renamed from: c */
        float f6550c;

        /* renamed from: d */
        private float f6551d;

        /* renamed from: e */
        private float f6552e;

        /* renamed from: f */
        private float f6553f;

        /* renamed from: g */
        private float f6554g;

        /* renamed from: h */
        private float f6555h;

        /* renamed from: i */
        private float f6556i;

        /* renamed from: j */
        final Matrix f6557j;

        /* renamed from: k */
        int f6558k;

        /* renamed from: l */
        private int[] f6559l;

        /* renamed from: m */
        private String f6560m;

        public C2243d() {
            super();
            this.f6548a = new Matrix();
            this.f6549b = new ArrayList<>();
            this.f6550c = 0.0f;
            this.f6551d = 0.0f;
            this.f6552e = 0.0f;
            this.f6553f = 1.0f;
            this.f6554g = 1.0f;
            this.f6555h = 0.0f;
            this.f6556i = 0.0f;
            this.f6557j = new Matrix();
            this.f6560m = null;
        }

        public C2243d(C2243d dVar, C1788a<String, Object> aVar) {
            super();
            C2245f fVar;
            this.f6548a = new Matrix();
            this.f6549b = new ArrayList<>();
            this.f6550c = 0.0f;
            this.f6551d = 0.0f;
            this.f6552e = 0.0f;
            this.f6553f = 1.0f;
            this.f6554g = 1.0f;
            this.f6555h = 0.0f;
            this.f6556i = 0.0f;
            Matrix matrix = new Matrix();
            this.f6557j = matrix;
            this.f6560m = null;
            this.f6550c = dVar.f6550c;
            this.f6551d = dVar.f6551d;
            this.f6552e = dVar.f6552e;
            this.f6553f = dVar.f6553f;
            this.f6554g = dVar.f6554g;
            this.f6555h = dVar.f6555h;
            this.f6556i = dVar.f6556i;
            this.f6559l = dVar.f6559l;
            String str = dVar.f6560m;
            this.f6560m = str;
            this.f6558k = dVar.f6558k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f6557j);
            ArrayList<C2244e> arrayList = dVar.f6549b;
            for (int i = 0; i < arrayList.size(); i++) {
                C2244e eVar = arrayList.get(i);
                if (eVar instanceof C2243d) {
                    this.f6549b.add(new C2243d((C2243d) eVar, aVar));
                } else {
                    if (eVar instanceof C2242c) {
                        fVar = new C2242c((C2242c) eVar);
                    } else if (eVar instanceof C2241b) {
                        fVar = new C2241b((C2241b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f6549b.add(fVar);
                    String str2 = fVar.f6562b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        /* renamed from: d */
        private void m9471d() {
            this.f6557j.reset();
            this.f6557j.postTranslate(-this.f6551d, -this.f6552e);
            this.f6557j.postScale(this.f6553f, this.f6554g);
            this.f6557j.postRotate(this.f6550c, 0.0f, 0.0f);
            this.f6557j.postTranslate(this.f6555h + this.f6551d, this.f6556i + this.f6552e);
        }

        /* renamed from: e */
        private void m9472e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f6559l = null;
            this.f6550c = C1163g.m4514f(typedArray, xmlPullParser, "rotation", 5, this.f6550c);
            this.f6551d = typedArray.getFloat(1, this.f6551d);
            this.f6552e = typedArray.getFloat(2, this.f6552e);
            this.f6553f = C1163g.m4514f(typedArray, xmlPullParser, "scaleX", 3, this.f6553f);
            this.f6554g = C1163g.m4514f(typedArray, xmlPullParser, "scaleY", 4, this.f6554g);
            this.f6555h = C1163g.m4514f(typedArray, xmlPullParser, "translateX", 6, this.f6555h);
            this.f6556i = C1163g.m4514f(typedArray, xmlPullParser, "translateY", 7, this.f6556i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f6560m = string;
            }
            m9471d();
        }

        /* renamed from: a */
        public boolean mo7489a() {
            for (int i = 0; i < this.f6549b.size(); i++) {
                if (this.f6549b.get(i).mo7489a()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public boolean mo7490b(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f6549b.size(); i++) {
                z |= this.f6549b.get(i).mo7490b(iArr);
            }
            return z;
        }

        /* renamed from: c */
        public void mo7508c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k = C1163g.m4519k(resources, theme, attributeSet, C2228a.f6497b);
            m9472e(k, xmlPullParser);
            k.recycle();
        }

        public String getGroupName() {
            return this.f6560m;
        }

        public Matrix getLocalMatrix() {
            return this.f6557j;
        }

        public float getPivotX() {
            return this.f6551d;
        }

        public float getPivotY() {
            return this.f6552e;
        }

        public float getRotation() {
            return this.f6550c;
        }

        public float getScaleX() {
            return this.f6553f;
        }

        public float getScaleY() {
            return this.f6554g;
        }

        public float getTranslateX() {
            return this.f6555h;
        }

        public float getTranslateY() {
            return this.f6556i;
        }

        public void setPivotX(float f) {
            if (f != this.f6551d) {
                this.f6551d = f;
                m9471d();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f6552e) {
                this.f6552e = f;
                m9471d();
            }
        }

        public void setRotation(float f) {
            if (f != this.f6550c) {
                this.f6550c = f;
                m9471d();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f6553f) {
                this.f6553f = f;
                m9471d();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f6554g) {
                this.f6554g = f;
                m9471d();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f6555h) {
                this.f6555h = f;
                m9471d();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f6556i) {
                this.f6556i = f;
                m9471d();
            }
        }
    }

    /* renamed from: c.w.a.a.h$e */
    private static abstract class C2244e {
        private C2244e() {
        }

        /* renamed from: a */
        public boolean mo7489a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo7490b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: c.w.a.a.h$f */
    private static abstract class C2245f extends C2244e {

        /* renamed from: a */
        protected C1829c.C1831b[] f6561a = null;

        /* renamed from: b */
        String f6562b;

        /* renamed from: c */
        int f6563c = 0;

        /* renamed from: d */
        int f6564d;

        public C2245f() {
            super();
        }

        public C2245f(C2245f fVar) {
            super();
            this.f6562b = fVar.f6562b;
            this.f6564d = fVar.f6564d;
            this.f6561a = C1829c.m7770f(fVar.f6561a);
        }

        /* renamed from: c */
        public boolean mo7487c() {
            return false;
        }

        /* renamed from: d */
        public void mo7525d(Path path) {
            path.reset();
            C1829c.C1831b[] bVarArr = this.f6561a;
            if (bVarArr != null) {
                C1829c.C1831b.m7778e(bVarArr, path);
            }
        }

        public C1829c.C1831b[] getPathData() {
            return this.f6561a;
        }

        public String getPathName() {
            return this.f6562b;
        }

        public void setPathData(C1829c.C1831b[] bVarArr) {
            if (!C1829c.m7766b(this.f6561a, bVarArr)) {
                this.f6561a = C1829c.m7770f(bVarArr);
            } else {
                C1829c.m7774j(this.f6561a, bVarArr);
            }
        }
    }

    /* renamed from: c.w.a.a.h$g */
    private static class C2246g {

        /* renamed from: a */
        private static final Matrix f6565a = new Matrix();

        /* renamed from: b */
        private final Path f6566b;

        /* renamed from: c */
        private final Path f6567c;

        /* renamed from: d */
        private final Matrix f6568d;

        /* renamed from: e */
        Paint f6569e;

        /* renamed from: f */
        Paint f6570f;

        /* renamed from: g */
        private PathMeasure f6571g;

        /* renamed from: h */
        private int f6572h;

        /* renamed from: i */
        final C2243d f6573i;

        /* renamed from: j */
        float f6574j;

        /* renamed from: k */
        float f6575k;

        /* renamed from: l */
        float f6576l;

        /* renamed from: m */
        float f6577m;

        /* renamed from: n */
        int f6578n;

        /* renamed from: o */
        String f6579o;

        /* renamed from: p */
        Boolean f6580p;

        /* renamed from: q */
        final C1788a<String, Object> f6581q;

        public C2246g() {
            this.f6568d = new Matrix();
            this.f6574j = 0.0f;
            this.f6575k = 0.0f;
            this.f6576l = 0.0f;
            this.f6577m = 0.0f;
            this.f6578n = 255;
            this.f6579o = null;
            this.f6580p = null;
            this.f6581q = new C1788a<>();
            this.f6573i = new C2243d();
            this.f6566b = new Path();
            this.f6567c = new Path();
        }

        public C2246g(C2246g gVar) {
            this.f6568d = new Matrix();
            this.f6574j = 0.0f;
            this.f6575k = 0.0f;
            this.f6576l = 0.0f;
            this.f6577m = 0.0f;
            this.f6578n = 255;
            this.f6579o = null;
            this.f6580p = null;
            C1788a<String, Object> aVar = new C1788a<>();
            this.f6581q = aVar;
            this.f6573i = new C2243d(gVar.f6573i, aVar);
            this.f6566b = new Path(gVar.f6566b);
            this.f6567c = new Path(gVar.f6567c);
            this.f6574j = gVar.f6574j;
            this.f6575k = gVar.f6575k;
            this.f6576l = gVar.f6576l;
            this.f6577m = gVar.f6577m;
            this.f6572h = gVar.f6572h;
            this.f6578n = gVar.f6578n;
            this.f6579o = gVar.f6579o;
            String str = gVar.f6579o;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f6580p = gVar.f6580p;
        }

        /* renamed from: a */
        private static float m9480a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        /* renamed from: c */
        private void m9481c(C2243d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            dVar.f6548a.set(matrix);
            dVar.f6548a.preConcat(dVar.f6557j);
            canvas.save();
            for (int i3 = 0; i3 < dVar.f6549b.size(); i3++) {
                C2244e eVar = dVar.f6549b.get(i3);
                if (eVar instanceof C2243d) {
                    m9481c((C2243d) eVar, dVar.f6548a, canvas, i, i2, colorFilter);
                } else if (eVar instanceof C2245f) {
                    m9482d(dVar, (C2245f) eVar, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        /* renamed from: d */
        private void m9482d(C2243d dVar, C2245f fVar, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f6576l;
            float f2 = ((float) i2) / this.f6577m;
            float min = Math.min(f, f2);
            Matrix matrix = dVar.f6548a;
            this.f6568d.set(matrix);
            this.f6568d.postScale(f, f2);
            float e = m9483e(matrix);
            if (e != 0.0f) {
                fVar.mo7525d(this.f6566b);
                Path path = this.f6566b;
                this.f6567c.reset();
                if (fVar.mo7487c()) {
                    this.f6567c.setFillType(fVar.f6563c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f6567c.addPath(path, this.f6568d);
                    canvas.clipPath(this.f6567c);
                    return;
                }
                C2242c cVar = (C2242c) fVar;
                float f3 = cVar.f6542k;
                if (!(f3 == 0.0f && cVar.f6543l == 1.0f)) {
                    float f4 = cVar.f6544m;
                    float f5 = (f3 + f4) % 1.0f;
                    float f6 = (cVar.f6543l + f4) % 1.0f;
                    if (this.f6571g == null) {
                        this.f6571g = new PathMeasure();
                    }
                    this.f6571g.setPath(this.f6566b, false);
                    float length = this.f6571g.getLength();
                    float f7 = f5 * length;
                    float f8 = f6 * length;
                    path.reset();
                    if (f7 > f8) {
                        this.f6571g.getSegment(f7, length, path, true);
                        this.f6571g.getSegment(0.0f, f8, path, true);
                    } else {
                        this.f6571g.getSegment(f7, f8, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f6567c.addPath(path, this.f6568d);
                if (cVar.f6539h.mo3627l()) {
                    C1145b bVar = cVar.f6539h;
                    if (this.f6570f == null) {
                        Paint paint = new Paint(1);
                        this.f6570f = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f6570f;
                    if (bVar.mo3623h()) {
                        Shader f9 = bVar.mo3622f();
                        f9.setLocalMatrix(this.f6568d);
                        paint2.setShader(f9);
                        paint2.setAlpha(Math.round(cVar.f6541j * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(C2239h.m9452a(bVar.mo3621e(), cVar.f6541j));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f6567c.setFillType(cVar.f6563c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f6567c, paint2);
                }
                if (cVar.f6537f.mo3627l()) {
                    C1145b bVar2 = cVar.f6537f;
                    if (this.f6569e == null) {
                        Paint paint3 = new Paint(1);
                        this.f6569e = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f6569e;
                    Paint.Join join = cVar.f6546o;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f6545n;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f6547p);
                    if (bVar2.mo3623h()) {
                        Shader f10 = bVar2.mo3622f();
                        f10.setLocalMatrix(this.f6568d);
                        paint4.setShader(f10);
                        paint4.setAlpha(Math.round(cVar.f6540i * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(C2239h.m9452a(bVar2.mo3621e(), cVar.f6540i));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f6538g * min * e);
                    canvas.drawPath(this.f6567c, paint4);
                }
            }
        }

        /* renamed from: e */
        private float m9483e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a = m9480a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a) / max;
            }
            return 0.0f;
        }

        /* renamed from: b */
        public void mo7529b(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m9481c(this.f6573i, f6565a, canvas, i, i2, colorFilter);
        }

        /* renamed from: f */
        public boolean mo7530f() {
            if (this.f6580p == null) {
                this.f6580p = Boolean.valueOf(this.f6573i.mo7489a());
            }
            return this.f6580p.booleanValue();
        }

        /* renamed from: g */
        public boolean mo7531g(int[] iArr) {
            return this.f6573i.mo7490b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f6578n;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f6578n = i;
        }
    }

    /* renamed from: c.w.a.a.h$h */
    private static class C2247h extends Drawable.ConstantState {

        /* renamed from: a */
        int f6582a;

        /* renamed from: b */
        C2246g f6583b;

        /* renamed from: c */
        ColorStateList f6584c;

        /* renamed from: d */
        PorterDuff.Mode f6585d;

        /* renamed from: e */
        boolean f6586e;

        /* renamed from: f */
        Bitmap f6587f;

        /* renamed from: g */
        ColorStateList f6588g;

        /* renamed from: h */
        PorterDuff.Mode f6589h;

        /* renamed from: i */
        int f6590i;

        /* renamed from: j */
        boolean f6591j;

        /* renamed from: k */
        boolean f6592k;

        /* renamed from: l */
        Paint f6593l;

        public C2247h() {
            this.f6584c = null;
            this.f6585d = C2239h.f6526o;
            this.f6583b = new C2246g();
        }

        public C2247h(C2247h hVar) {
            this.f6584c = null;
            this.f6585d = C2239h.f6526o;
            if (hVar != null) {
                this.f6582a = hVar.f6582a;
                C2246g gVar = new C2246g(hVar.f6583b);
                this.f6583b = gVar;
                if (hVar.f6583b.f6570f != null) {
                    gVar.f6570f = new Paint(hVar.f6583b.f6570f);
                }
                if (hVar.f6583b.f6569e != null) {
                    this.f6583b.f6569e = new Paint(hVar.f6583b.f6569e);
                }
                this.f6584c = hVar.f6584c;
                this.f6585d = hVar.f6585d;
                this.f6586e = hVar.f6586e;
            }
        }

        /* renamed from: a */
        public boolean mo7536a(int i, int i2) {
            return i == this.f6587f.getWidth() && i2 == this.f6587f.getHeight();
        }

        /* renamed from: b */
        public boolean mo7537b() {
            return !this.f6592k && this.f6588g == this.f6584c && this.f6589h == this.f6585d && this.f6591j == this.f6586e && this.f6590i == this.f6583b.getRootAlpha();
        }

        /* renamed from: c */
        public void mo7538c(int i, int i2) {
            if (this.f6587f == null || !mo7536a(i, i2)) {
                this.f6587f = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.f6592k = true;
            }
        }

        /* renamed from: d */
        public void mo7539d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f6587f, (Rect) null, rect, mo7540e(colorFilter));
        }

        /* renamed from: e */
        public Paint mo7540e(ColorFilter colorFilter) {
            if (!mo7541f() && colorFilter == null) {
                return null;
            }
            if (this.f6593l == null) {
                Paint paint = new Paint();
                this.f6593l = paint;
                paint.setFilterBitmap(true);
            }
            this.f6593l.setAlpha(this.f6583b.getRootAlpha());
            this.f6593l.setColorFilter(colorFilter);
            return this.f6593l;
        }

        /* renamed from: f */
        public boolean mo7541f() {
            return this.f6583b.getRootAlpha() < 255;
        }

        /* renamed from: g */
        public boolean mo7542g() {
            return this.f6583b.mo7530f();
        }

        public int getChangingConfigurations() {
            return this.f6582a;
        }

        /* renamed from: h */
        public boolean mo7544h(int[] iArr) {
            boolean g = this.f6583b.mo7531g(iArr);
            this.f6592k |= g;
            return g;
        }

        /* renamed from: i */
        public void mo7545i() {
            this.f6588g = this.f6584c;
            this.f6589h = this.f6585d;
            this.f6590i = this.f6583b.getRootAlpha();
            this.f6591j = this.f6586e;
            this.f6592k = false;
        }

        /* renamed from: j */
        public void mo7546j(int i, int i2) {
            this.f6587f.eraseColor(0);
            this.f6583b.mo7529b(new Canvas(this.f6587f), i, i2, (ColorFilter) null);
        }

        public Drawable newDrawable() {
            return new C2239h(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C2239h(this);
        }
    }

    /* renamed from: c.w.a.a.h$i */
    private static class C2248i extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f6594a;

        public C2248i(Drawable.ConstantState constantState) {
            this.f6594a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f6594a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f6594a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C2239h hVar = new C2239h();
            hVar.f6525f = (VectorDrawable) this.f6594a.newDrawable();
            return hVar;
        }

        public Drawable newDrawable(Resources resources) {
            C2239h hVar = new C2239h();
            hVar.f6525f = (VectorDrawable) this.f6594a.newDrawable(resources);
            return hVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C2239h hVar = new C2239h();
            hVar.f6525f = (VectorDrawable) this.f6594a.newDrawable(resources, theme);
            return hVar;
        }
    }

    C2239h() {
        this.f6531t = true;
        this.f6533v = new float[9];
        this.f6534w = new Matrix();
        this.f6535x = new Rect();
        this.f6527p = new C2247h();
    }

    C2239h(C2247h hVar) {
        this.f6531t = true;
        this.f6533v = new float[9];
        this.f6534w = new Matrix();
        this.f6535x = new Rect();
        this.f6527p = hVar;
        this.f6528q = mo7477j(this.f6528q, hVar.f6584c, hVar.f6585d);
    }

    /* renamed from: a */
    static int m9452a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d A[Catch:{ IOException | XmlPullParserException -> 0x0045 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p027c.p101w.p102a.p103a.C2239h m9453b(android.content.res.Resources r6, int r7, android.content.res.Resources.Theme r8) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "VectorDrawableCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0023
            c.w.a.a.h r0 = new c.w.a.a.h
            r0.<init>()
            android.graphics.drawable.Drawable r6 = androidx.core.content.p022d.C1154f.m4492e(r6, r7, r8)
            r0.f6525f = r6
            c.w.a.a.h$i r6 = new c.w.a.a.h$i
            android.graphics.drawable.Drawable r7 = r0.f6525f
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f6532u = r6
            return r0
        L_0x0023:
            android.content.res.XmlResourceParser r7 = r6.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x002b:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            r4 = 2
            if (r3 == r4) goto L_0x0036
            r5 = 1
            if (r3 == r5) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            if (r3 != r4) goto L_0x003d
            c.w.a.a.h r6 = m9454c(r6, r7, r2, r8)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            return r6
        L_0x003d:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
            throw r6     // Catch:{ XmlPullParserException -> 0x0047, IOException -> 0x0045 }
        L_0x0045:
            r6 = move-exception
            goto L_0x0048
        L_0x0047:
            r6 = move-exception
        L_0x0048:
            android.util.Log.e(r1, r0, r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p101w.p102a.p103a.C2239h.m9453b(android.content.res.Resources, int, android.content.res.Resources$Theme):c.w.a.a.h");
    }

    /* renamed from: c */
    public static C2239h m9454c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C2239h hVar = new C2239h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: c.w.a.a.h$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: c.w.a.a.h$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: c.w.a.a.h$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: c.w.a.a.h$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: c.w.a.a.h$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9455e(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) {
        /*
            r10 = this;
            c.w.a.a.h$h r0 = r10.f6527p
            c.w.a.a.h$g r1 = r0.f6583b
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            c.w.a.a.h$d r3 = r1.f6573i
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = 1
        L_0x0019:
            if (r3 == r5) goto L_0x00c4
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L_0x0024
            if (r3 == r8) goto L_0x00c4
        L_0x0024:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto L_0x00af
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            c.w.a.a.h$d r7 = (p027c.p101w.p102a.p103a.C2239h.C2243d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0059
            c.w.a.a.h$c r3 = new c.w.a.a.h$c
            r3.<init>()
            r3.mo7491g(r11, r13, r14, r12)
            java.util.ArrayList<c.w.a.a.h$e> r6 = r7.f6549b
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L_0x0057
            c.f.a<java.lang.String, java.lang.Object> r6 = r1.f6581q
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L_0x0057:
            r6 = 0
            goto L_0x007d
        L_0x0059:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0085
            c.w.a.a.h$b r3 = new c.w.a.a.h$b
            r3.<init>()
            r3.mo7488e(r11, r13, r14, r12)
            java.util.ArrayList<c.w.a.a.h$e> r7 = r7.f6549b
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L_0x007d
            c.f.a<java.lang.String, java.lang.Object> r7 = r1.f6581q
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L_0x007d:
            int r7 = r0.f6582a
            int r3 = r3.f6564d
        L_0x0081:
            r3 = r3 | r7
            r0.f6582a = r3
            goto L_0x00be
        L_0x0085:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            c.w.a.a.h$d r3 = new c.w.a.a.h$d
            r3.<init>()
            r3.mo7508c(r11, r13, r14, r12)
            java.util.ArrayList<c.w.a.a.h$e> r7 = r7.f6549b
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto L_0x00aa
            c.f.a<java.lang.String, java.lang.Object> r7 = r1.f6581q
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        L_0x00aa:
            int r7 = r0.f6582a
            int r3 = r3.f6558k
            goto L_0x0081
        L_0x00af:
            if (r3 != r8) goto L_0x00be
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            r2.pop()
        L_0x00be:
            int r3 = r12.next()
            goto L_0x0019
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            return
        L_0x00c7:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p101w.p102a.p103a.C2239h.m9455e(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    /* renamed from: f */
    private boolean m9456f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && C1164a.m4542f(this) == 1;
    }

    /* renamed from: g */
    private static PorterDuff.Mode m9457g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: i */
    private void m9458i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        C2247h hVar = this.f6527p;
        C2246g gVar = hVar.f6583b;
        hVar.f6585d = m9457g(C1163g.m4515g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c = C1163g.m4511c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c != null) {
            hVar.f6584c = c;
        }
        hVar.f6586e = C1163g.m4509a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f6586e);
        gVar.f6576l = C1163g.m4514f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f6576l);
        float f = C1163g.m4514f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f6577m);
        gVar.f6577m = f;
        if (gVar.f6576l <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f > 0.0f) {
            gVar.f6574j = typedArray.getDimension(3, gVar.f6574j);
            float dimension = typedArray.getDimension(2, gVar.f6575k);
            gVar.f6575k = dimension;
            if (gVar.f6574j <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(C1163g.m4514f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f6579o = string;
                    gVar.f6581q.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f6525f;
        if (drawable == null) {
            return false;
        }
        C1164a.m4538b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object mo7462d(String str) {
        return this.f6527p.f6583b.f6581q.get(str);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f6535x);
        if (this.f6535x.width() > 0 && this.f6535x.height() > 0) {
            ColorFilter colorFilter = this.f6529r;
            if (colorFilter == null) {
                colorFilter = this.f6528q;
            }
            canvas.getMatrix(this.f6534w);
            this.f6534w.getValues(this.f6533v);
            float abs = Math.abs(this.f6533v[0]);
            float abs2 = Math.abs(this.f6533v[4]);
            float abs3 = Math.abs(this.f6533v[1]);
            float abs4 = Math.abs(this.f6533v[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.f6535x.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.f6535x.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.f6535x;
                canvas.translate((float) rect.left, (float) rect.top);
                if (m9456f()) {
                    canvas.translate((float) this.f6535x.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f6535x.offsetTo(0, 0);
                this.f6527p.mo7538c(min, min2);
                if (!this.f6531t) {
                    this.f6527p.mo7546j(min, min2);
                } else if (!this.f6527p.mo7537b()) {
                    this.f6527p.mo7546j(min, min2);
                    this.f6527p.mo7545i();
                }
                this.f6527p.mo7539d(canvas, colorFilter, this.f6535x);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f6525f;
        return drawable != null ? C1164a.m4540d(drawable) : this.f6527p.f6583b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f6525f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f6527p.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6525f;
        return drawable != null ? C1164a.m4541e(drawable) : this.f6529r;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f6525f != null && Build.VERSION.SDK_INT >= 24) {
            return new C2248i(this.f6525f.getConstantState());
        }
        this.f6527p.f6582a = getChangingConfigurations();
        return this.f6527p;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f6525f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f6527p.f6583b.f6575k;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f6525f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f6527p.f6583b.f6574j;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo7471h(boolean z) {
        this.f6531t = z;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            C1164a.m4543g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C2247h hVar = this.f6527p;
        hVar.f6583b = new C2246g();
        TypedArray k = C1163g.m4519k(resources, theme, attributeSet, C2228a.f6496a);
        m9458i(k, xmlPullParser, theme);
        k.recycle();
        hVar.f6582a = getChangingConfigurations();
        hVar.f6592k = true;
        m9455e(resources, xmlPullParser, attributeSet, theme);
        this.f6528q = mo7477j(this.f6528q, hVar.f6584c, hVar.f6585d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f6525f;
        return drawable != null ? C1164a.m4544h(drawable) : this.f6527p.f6586e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f6527p.f6584c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f6527p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f6525f
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            c.w.a.a.h$h r0 = r1.f6527p
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.mo7542g()
            if (r0 != 0) goto L_0x0028
            c.w.a.a.h$h r0 = r1.f6527p
            android.content.res.ColorStateList r0 = r0.f6584c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p101w.p102a.p103a.C2239h.isStateful():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public PorterDuffColorFilter mo7477j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6530s && super.mutate() == this) {
            this.f6527p = new C2247h(this.f6527p);
            this.f6530s = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        C2247h hVar = this.f6527p;
        ColorStateList colorStateList = hVar.f6584c;
        if (!(colorStateList == null || (mode = hVar.f6585d) == null)) {
            this.f6528q = mo7477j(this.f6528q, colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (!hVar.mo7542g() || !hVar.mo7544h(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f6527p.f6583b.getRootAlpha() != i) {
            this.f6527p.f6583b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            C1164a.m4546j(drawable, z);
        } else {
            this.f6527p.f6586e = z;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f6529r = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            C1164a.m4550n(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            C1164a.m4551o(drawable, colorStateList);
            return;
        }
        C2247h hVar = this.f6527p;
        if (hVar.f6584c != colorStateList) {
            hVar.f6584c = colorStateList;
            this.f6528q = mo7477j(this.f6528q, colorStateList, hVar.f6585d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            C1164a.m4552p(drawable, mode);
            return;
        }
        C2247h hVar = this.f6527p;
        if (hVar.f6585d != mode) {
            hVar.f6585d = mode;
            this.f6528q = mo7477j(this.f6528q, hVar.f6584c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f6525f;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f6525f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
