package p174e.p247e.p274h.p282d;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p174e.p247e.p274h.p282d.p283b.C6184b;
import p174e.p247e.p274h.p284e.C6205q;

/* renamed from: e.e.h.d.a */
public class C6182a extends Drawable implements C6184b {

    /* renamed from: A */
    private final Rect f17048A = new Rect();

    /* renamed from: B */
    private final RectF f17049B = new RectF();

    /* renamed from: C */
    private int f17050C;

    /* renamed from: D */
    private int f17051D;

    /* renamed from: E */
    private int f17052E;

    /* renamed from: F */
    private int f17053F;

    /* renamed from: G */
    private int f17054G;

    /* renamed from: H */
    private long f17055H;

    /* renamed from: I */
    private String f17056I;

    /* renamed from: J */
    private int f17057J = -1;

    /* renamed from: K */
    private int f17058K = 0;

    /* renamed from: f */
    private String f17059f;

    /* renamed from: o */
    private String f17060o;

    /* renamed from: p */
    private int f17061p;

    /* renamed from: q */
    private int f17062q;

    /* renamed from: r */
    private int f17063r;

    /* renamed from: s */
    private String f17064s;

    /* renamed from: t */
    private C6205q.C6207b f17065t;

    /* renamed from: u */
    private HashMap<String, String> f17066u = new HashMap<>();

    /* renamed from: v */
    private int f17067v;

    /* renamed from: w */
    private int f17068w;

    /* renamed from: x */
    private int f17069x = 80;

    /* renamed from: y */
    private final Paint f17070y = new Paint(1);

    /* renamed from: z */
    private final Matrix f17071z = new Matrix();

    public C6182a() {
        mo18327h();
    }

    /* renamed from: b */
    private void m23393b(Canvas canvas, String str, Object obj) {
        m23395d(canvas, str, String.valueOf(obj), -1);
    }

    /* renamed from: c */
    private void m23394c(Canvas canvas, String str, String str2) {
        m23395d(canvas, str, str2, -1);
    }

    /* renamed from: d */
    private void m23395d(Canvas canvas, String str, String str2, int i) {
        String str3 = str + ": ";
        float measureText = this.f17070y.measureText(str3);
        float measureText2 = this.f17070y.measureText(str2);
        this.f17070y.setColor(1711276032);
        int i2 = this.f17053F;
        int i3 = this.f17054G;
        canvas.drawRect((float) (i2 - 4), (float) (i3 + 8), ((float) i2) + measureText + measureText2 + 4.0f, (float) (i3 + this.f17052E + 8), this.f17070y);
        this.f17070y.setColor(-1);
        canvas.drawText(str3, (float) this.f17053F, (float) this.f17054G, this.f17070y);
        this.f17070y.setColor(i);
        canvas.drawText(str2, ((float) this.f17053F) + measureText, (float) this.f17054G, this.f17070y);
        this.f17054G += this.f17052E;
    }

    /* renamed from: f */
    private static String m23396f(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    /* renamed from: g */
    private void m23397g(Rect rect, int i, int i2) {
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i2, rect.height() / i)));
        this.f17070y.setTextSize((float) min);
        int i3 = min + 8;
        this.f17052E = i3;
        int i4 = this.f17069x;
        if (i4 == 80) {
            this.f17052E = i3 * -1;
        }
        this.f17050C = rect.left + 10;
        this.f17051D = i4 == 80 ? rect.bottom - 10 : rect.top + 10 + 10;
    }

    /* renamed from: a */
    public void mo18323a(long j) {
        this.f17055H = j;
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        String str;
        String str2;
        Rect bounds = getBounds();
        this.f17070y.setStyle(Paint.Style.STROKE);
        this.f17070y.setStrokeWidth(2.0f);
        this.f17070y.setColor(-26624);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f17070y);
        this.f17070y.setStyle(Paint.Style.FILL);
        this.f17070y.setColor(this.f17058K);
        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f17070y);
        this.f17070y.setStyle(Paint.Style.FILL);
        this.f17070y.setStrokeWidth(0.0f);
        this.f17070y.setColor(-1);
        this.f17053F = this.f17050C;
        this.f17054G = this.f17051D;
        String str3 = this.f17060o;
        if (str3 != null) {
            str2 = m23396f("%s, %s", this.f17059f, str3);
            str = "IDs";
        } else {
            str2 = this.f17059f;
            str = "ID";
        }
        m23394c(canvas, str, str2);
        m23394c(canvas, "D", m23396f("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        m23395d(canvas, "I", m23396f("%dx%d", Integer.valueOf(this.f17061p), Integer.valueOf(this.f17062q)), mo18325e(this.f17061p, this.f17062q, this.f17065t));
        m23394c(canvas, "I", m23396f("%d KiB", Integer.valueOf(this.f17063r / 1024)));
        String str4 = this.f17064s;
        if (str4 != null) {
            m23394c(canvas, "i format", str4);
        }
        int i = this.f17067v;
        if (i > 0) {
            m23394c(canvas, "anim", m23396f("f %d, l %d", Integer.valueOf(i), Integer.valueOf(this.f17068w)));
        }
        C6205q.C6207b bVar = this.f17065t;
        if (bVar != null) {
            m23393b(canvas, "scale", bVar);
        }
        long j = this.f17055H;
        if (j >= 0) {
            m23394c(canvas, "t", m23396f("%d ms", Long.valueOf(j)));
        }
        String str5 = this.f17056I;
        if (str5 != null) {
            m23395d(canvas, "origin", str5, this.f17057J);
        }
        for (Map.Entry next : this.f17066u.entrySet()) {
            m23394c(canvas, (String) next.getKey(), (String) next.getValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo18325e(int i, int i2, C6205q.C6207b bVar) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i > 0 && i2 > 0) {
            if (bVar != null) {
                Rect rect = this.f17048A;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.f17071z.reset();
                bVar.mo18439a(this.f17071z, this.f17048A, i, i2, 0.0f, 0.0f);
                RectF rectF = this.f17049B;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = (float) i;
                rectF.bottom = (float) i2;
                this.f17071z.mapRect(rectF);
                width = Math.min(width, (int) this.f17049B.width());
                height = Math.min(height, (int) this.f17049B.height());
            }
            float f = (float) width;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = (float) height;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int abs = Math.abs(i - width);
            int abs2 = Math.abs(i2 - height);
            float f7 = (float) abs;
            if (f7 >= f2 || ((float) abs2) >= f5) {
                return (f7 >= f3 || ((float) abs2) >= f6) ? -65536 : -256;
            }
            return -16711936;
        }
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void mo18327h() {
        this.f17061p = -1;
        this.f17062q = -1;
        this.f17063r = -1;
        this.f17066u = new HashMap<>();
        this.f17067v = -1;
        this.f17068w = -1;
        this.f17064s = null;
        mo18328i((String) null);
        this.f17055H = -1;
        this.f17056I = null;
        this.f17057J = -1;
        invalidateSelf();
    }

    /* renamed from: i */
    public void mo18328i(String str) {
        if (str == null) {
            str = "none";
        }
        this.f17059f = str;
        invalidateSelf();
    }

    /* renamed from: j */
    public void mo18329j(int i, int i2) {
        this.f17061p = i;
        this.f17062q = i2;
        invalidateSelf();
    }

    /* renamed from: k */
    public void mo18330k(int i) {
        this.f17063r = i;
    }

    /* renamed from: l */
    public void mo18331l(String str, int i) {
        this.f17056I = str;
        this.f17057J = i;
        invalidateSelf();
    }

    /* renamed from: m */
    public void mo18332m(C6205q.C6207b bVar) {
        this.f17065t = bVar;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m23397g(rect, 9, 8);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
