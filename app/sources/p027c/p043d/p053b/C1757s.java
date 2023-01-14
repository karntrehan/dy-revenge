package p027c.p043d.p053b;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C1011z2;
import androidx.core.util.C1177h;
import p027c.p043d.p053b.C1759t;

/* renamed from: c.d.b.s */
final class C1757s {

    /* renamed from: a */
    private static final C1759t.C1764e f5198a = C1759t.C1764e.FILL_CENTER;

    /* renamed from: b */
    private Size f5199b;

    /* renamed from: c */
    private Rect f5200c;

    /* renamed from: d */
    private int f5201d;

    /* renamed from: e */
    private int f5202e;

    /* renamed from: f */
    private boolean f5203f;

    /* renamed from: g */
    private C1759t.C1764e f5204g = f5198a;

    /* renamed from: c.d.b.s$a */
    static /* synthetic */ class C1758a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5205a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                c.d.b.t$e[] r0 = p027c.p043d.p053b.C1759t.C1764e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5205a = r0
                c.d.b.t$e r1 = p027c.p043d.p053b.C1759t.C1764e.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5205a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.d.b.t$e r1 = p027c.p043d.p053b.C1759t.C1764e.FILL_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5205a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.d.b.t$e r1 = p027c.p043d.p053b.C1759t.C1764e.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5205a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.d.b.t$e r1 = p027c.p043d.p053b.C1759t.C1764e.FILL_END     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5205a     // Catch:{ NoSuchFieldError -> 0x003e }
                c.d.b.t$e r1 = p027c.p043d.p053b.C1759t.C1764e.FIT_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5205a     // Catch:{ NoSuchFieldError -> 0x0049 }
                c.d.b.t$e r1 = p027c.p043d.p053b.C1759t.C1764e.FILL_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p053b.C1757s.C1758a.<clinit>():void");
        }
    }

    C1757s() {
    }

    /* renamed from: b */
    private static RectF m7425b(RectF rectF, float f) {
        float f2 = f + f;
        return new RectF(f2 - rectF.right, rectF.top, f2 - rectF.left, rectF.bottom);
    }

    /* renamed from: e */
    private Size m7426e() {
        return C1776z.m7513d(this.f5201d) ? new Size(this.f5200c.height(), this.f5200c.width()) : new Size(this.f5200c.width(), this.f5200c.height());
    }

    /* renamed from: j */
    private RectF m7427j(Size size, int i) {
        C1177h.m4585g(m7428k());
        Matrix h = mo5986h(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f5199b.getWidth(), (float) this.f5199b.getHeight());
        h.mapRect(rectF);
        return rectF;
    }

    /* renamed from: k */
    private boolean m7428k() {
        return (this.f5200c == null || this.f5199b == null) ? false : true;
    }

    /* renamed from: m */
    private static void m7429m(Matrix matrix, RectF rectF, RectF rectF2, C1759t.C1764e eVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (C1758a.f5205a[eVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                C0949o2.m3690c("PreviewTransform", "Unexpected crop rect: " + eVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (eVar == C1759t.C1764e.FIT_CENTER || eVar == C1759t.C1764e.FIT_START || eVar == C1759t.C1764e.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            return;
        }
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        matrix.invert(matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap mo5981a(Bitmap bitmap, Size size, int i) {
        if (!m7428k()) {
            return bitmap;
        }
        Matrix i2 = mo5987i();
        RectF j = m7427j(size, i);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(i2);
        matrix.postScale(j.width() / ((float) this.f5199b.getWidth()), j.height() / ((float) this.f5199b.getHeight()));
        matrix.postTranslate(j.left, j.top);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        return createBitmap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Matrix mo5982c(Size size, int i) {
        if (!m7428k()) {
            return null;
        }
        Matrix matrix = new Matrix();
        mo5986h(size, i).invert(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(new RectF(0.0f, 0.0f, (float) this.f5199b.getWidth(), (float) this.f5199b.getHeight()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public RectF mo5983d(Size size, int i) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight());
        Size e = m7426e();
        RectF rectF2 = new RectF(0.0f, 0.0f, (float) e.getWidth(), (float) e.getHeight());
        Matrix matrix = new Matrix();
        m7429m(matrix, rectF2, rectF, this.f5204g);
        matrix.mapRect(rectF2);
        return i == 1 ? m7425b(rectF2, ((float) size.getWidth()) / 2.0f) : rectF2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C1759t.C1764e mo5984f() {
        return this.f5204g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Rect mo5985g() {
        return this.f5200c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Matrix mo5986h(Size size, int i) {
        C1177h.m4585g(m7428k());
        Matrix c = C1776z.m7512c(new RectF(this.f5200c), mo5988l(size) ? new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight()) : mo5983d(size, i), this.f5201d);
        if (this.f5203f) {
            if (C1776z.m7513d(this.f5201d)) {
                c.preScale(1.0f, -1.0f, (float) this.f5200c.centerX(), (float) this.f5200c.centerY());
            } else {
                c.preScale(-1.0f, 1.0f, (float) this.f5200c.centerX(), (float) this.f5200c.centerY());
            }
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public Matrix mo5987i() {
        C1177h.m4585g(m7428k());
        RectF rectF = new RectF(0.0f, 0.0f, (float) this.f5199b.getWidth(), (float) this.f5199b.getHeight());
        return C1776z.m7512c(rectF, rectF, -C1776z.m7515f(this.f5202e));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo5988l(Size size) {
        return C1776z.m7514e(size, true, m7426e(), false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo5989n(C1759t.C1764e eVar) {
        this.f5204g = eVar;
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"UnsafeOptInUsageError"})
    /* renamed from: o */
    public void mo5990o(C1011z2.C1018g gVar, Size size, boolean z) {
        C0949o2.m3688a("PreviewTransform", "Transformation info set: " + gVar + " " + size + " " + z);
        this.f5200c = gVar.mo3179a();
        this.f5201d = gVar.mo3180b();
        this.f5202e = gVar.mo3181c();
        this.f5199b = size;
        this.f5203f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5991p(Size size, int i, View view) {
        if (size.getHeight() == 0 || size.getWidth() == 0) {
            C0949o2.m3698k("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
        } else if (m7428k()) {
            if (view instanceof TextureView) {
                ((TextureView) view).setTransform(mo5987i());
            } else {
                Display display = view.getDisplay();
                if (!(display == null || display.getRotation() == this.f5202e)) {
                    C0949o2.m3690c("PreviewTransform", "Non-display rotation not supported with SurfaceView / PERFORMANCE mode.");
                }
            }
            RectF j = m7427j(size, i);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setScaleX(j.width() / ((float) this.f5199b.getWidth()));
            view.setScaleY(j.height() / ((float) this.f5199b.getHeight()));
            view.setTranslationX(j.left - ((float) view.getLeft()));
            view.setTranslationY(j.top - ((float) view.getTop()));
        }
    }
}
