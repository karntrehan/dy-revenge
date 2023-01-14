package p174e.p319f.p320a.p363d.p381z;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p027c.p064i.p065d.C1827a;

/* renamed from: e.f.a.d.z.a */
public class C9072a {

    /* renamed from: a */
    private static final int[] f24917a = new int[3];

    /* renamed from: b */
    private static final float[] f24918b = {0.0f, 0.5f, 1.0f};

    /* renamed from: c */
    private static final int[] f24919c = new int[4];

    /* renamed from: d */
    private static final float[] f24920d = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: e */
    private final Paint f24921e;

    /* renamed from: f */
    private final Paint f24922f;

    /* renamed from: g */
    private final Paint f24923g;

    /* renamed from: h */
    private int f24924h;

    /* renamed from: i */
    private int f24925i;

    /* renamed from: j */
    private int f24926j;

    /* renamed from: k */
    private final Path f24927k;

    public C9072a() {
        this(-16777216);
    }

    public C9072a(int i) {
        this.f24927k = new Path();
        mo23035d(i);
        Paint paint = new Paint(4);
        this.f24922f = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f24921e = paint2;
        paint2.setColor(this.f24924h);
        this.f24923g = new Paint(paint);
    }

    /* renamed from: a */
    public void mo23032a(Canvas canvas, Matrix matrix, RectF rectF, int i, float f, float f2) {
        RectF rectF2 = rectF;
        int i2 = i;
        float f3 = f2;
        boolean z = f3 < 0.0f;
        Path path = this.f24927k;
        if (z) {
            int[] iArr = f24919c;
            iArr[0] = 0;
            iArr[1] = this.f24926j;
            iArr[2] = this.f24925i;
            iArr[3] = this.f24924h;
            float f4 = f;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF2, f, f3);
            path.close();
            float f5 = (float) (-i2);
            rectF2.inset(f5, f5);
            int[] iArr2 = f24919c;
            iArr2[0] = 0;
            iArr2[1] = this.f24924h;
            iArr2[2] = this.f24925i;
            iArr2[3] = this.f24926j;
        }
        float width = 1.0f - (((float) i2) / (rectF.width() / 2.0f));
        float[] fArr = f24920d;
        fArr[1] = width;
        fArr[2] = ((1.0f - width) / 2.0f) + width;
        this.f24922f.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, f24919c, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        } else {
            Canvas canvas2 = canvas;
        }
        canvas.drawArc(rectF, f, f2, true, this.f24922f);
        canvas.restore();
    }

    /* renamed from: b */
    public void mo23033b(Canvas canvas, Matrix matrix, RectF rectF, int i) {
        rectF.bottom += (float) i;
        rectF.offset(0.0f, (float) (-i));
        int[] iArr = f24917a;
        iArr[0] = this.f24926j;
        iArr[1] = this.f24925i;
        iArr[2] = this.f24924h;
        Paint paint = this.f24923g;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, f24918b, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f24923g);
        canvas.restore();
    }

    /* renamed from: c */
    public Paint mo23034c() {
        return this.f24921e;
    }

    /* renamed from: d */
    public void mo23035d(int i) {
        this.f24924h = C1827a.m7759h(i, 68);
        this.f24925i = C1827a.m7759h(i, 20);
        this.f24926j = C1827a.m7759h(i, 0);
    }
}
