package p027c.p101w.p102a.p103a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import androidx.core.content.p022d.C1163g;
import org.xmlpull.v1.XmlPullParser;
import p027c.p064i.p065d.C1829c;

/* renamed from: c.w.a.a.f */
public class C2237f implements Interpolator {

    /* renamed from: a */
    private float[] f6523a;

    /* renamed from: b */
    private float[] f6524b;

    public C2237f(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public C2237f(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k = C1163g.m4519k(resources, theme, attributeSet, C2228a.f6507l);
        m9451d(k, xmlPullParser);
        k.recycle();
    }

    /* renamed from: a */
    private void m9448a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
        m9449b(path);
    }

    /* renamed from: b */
    private void m9449b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min > 0) {
            this.f6523a = new float[min];
            this.f6524b = new float[min];
            float[] fArr = new float[2];
            for (int i2 = 0; i2 < min; i2++) {
                pathMeasure.getPosTan((((float) i2) * length) / ((float) (min - 1)), fArr, (float[]) null);
                this.f6523a[i2] = fArr[0];
                this.f6524b[i2] = fArr[1];
            }
            if (((double) Math.abs(this.f6523a[0])) <= 1.0E-5d && ((double) Math.abs(this.f6524b[0])) <= 1.0E-5d) {
                int i3 = min - 1;
                if (((double) Math.abs(this.f6523a[i3] - 1.0f)) <= 1.0E-5d && ((double) Math.abs(this.f6524b[i3] - 1.0f)) <= 1.0E-5d) {
                    float f = 0.0f;
                    int i4 = 0;
                    while (i < min) {
                        float[] fArr2 = this.f6523a;
                        int i5 = i4 + 1;
                        float f2 = fArr2[i4];
                        if (f2 >= f) {
                            fArr2[i] = f2;
                            i++;
                            f = f2;
                            i4 = i5;
                        } else {
                            throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                        }
                    }
                    if (pathMeasure.nextContour()) {
                        throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                    }
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("The Path must start at (0,0) and end at (1,1) start: ");
            sb.append(this.f6523a[0]);
            sb.append(",");
            sb.append(this.f6524b[0]);
            sb.append(" end:");
            int i6 = min - 1;
            sb.append(this.f6523a[i6]);
            sb.append(",");
            sb.append(this.f6524b[i6]);
            throw new IllegalArgumentException(sb.toString());
        }
        throw new IllegalArgumentException("The Path has a invalid length " + length);
    }

    /* renamed from: c */
    private void m9450c(float f, float f2) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f2, 1.0f, 1.0f);
        m9449b(path);
    }

    /* renamed from: d */
    private void m9451d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (C1163g.m4518j(xmlPullParser, "pathData")) {
            String i = C1163g.m4517i(typedArray, xmlPullParser, "pathData", 4);
            Path e = C1829c.m7769e(i);
            if (e != null) {
                m9449b(e);
                return;
            }
            throw new InflateException("The path is null, which is created from " + i);
        } else if (!C1163g.m4518j(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        } else if (C1163g.m4518j(xmlPullParser, "controlY1")) {
            float f = C1163g.m4514f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
            float f2 = C1163g.m4514f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
            boolean j = C1163g.m4518j(xmlPullParser, "controlX2");
            if (j != C1163g.m4518j(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            } else if (!j) {
                m9450c(f, f2);
            } else {
                m9448a(f, f2, C1163g.m4514f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), C1163g.m4514f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
            }
        } else {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
    }

    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f6523a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f6523a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f6523a;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f6524b[i];
        }
        float[] fArr2 = this.f6524b;
        float f3 = fArr2[i];
        return f3 + (((f - fArr[i]) / f2) * (fArr2[length] - f3));
    }
}
