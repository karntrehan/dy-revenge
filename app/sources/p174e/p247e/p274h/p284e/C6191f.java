package p174e.p247e.p274h.p284e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;
import p174e.p247e.p253d.p257d.C6062k;

/* renamed from: e.e.h.e.f */
public class C6191f extends C6185a {

    /* renamed from: A */
    int f17094A;

    /* renamed from: B */
    long f17095B;

    /* renamed from: C */
    int[] f17096C;

    /* renamed from: D */
    int[] f17097D;

    /* renamed from: E */
    int f17098E;

    /* renamed from: F */
    boolean[] f17099F;

    /* renamed from: G */
    int f17100G;

    /* renamed from: H */
    private C6192a f17101H;

    /* renamed from: I */
    private boolean f17102I;

    /* renamed from: J */
    private boolean f17103J;

    /* renamed from: K */
    private boolean f17104K = true;

    /* renamed from: v */
    private final Drawable[] f17105v;

    /* renamed from: w */
    private final boolean f17106w;

    /* renamed from: x */
    private final int f17107x;

    /* renamed from: y */
    private final int f17108y;

    /* renamed from: z */
    int f17109z;

    /* renamed from: e.e.h.e.f$a */
    public interface C6192a {
        /* renamed from: a */
        void mo18288a();

        /* renamed from: b */
        void mo18289b();

        /* renamed from: c */
        void mo18290c();
    }

    public C6191f(Drawable[] drawableArr, boolean z, int i) {
        super(drawableArr);
        boolean z2 = true;
        int i2 = 0;
        C6062k.m22842j(drawableArr.length < 1 ? false : z2, "At least one layer required!");
        this.f17105v = drawableArr;
        this.f17096C = new int[drawableArr.length];
        this.f17097D = new int[drawableArr.length];
        this.f17098E = 255;
        this.f17099F = new boolean[drawableArr.length];
        this.f17100G = 0;
        this.f17106w = z;
        this.f17107x = z ? 255 : i2;
        this.f17108y = i;
        m23437t();
    }

    /* renamed from: i */
    private void m23433i(Canvas canvas, Drawable drawable, int i) {
        if (drawable != null && i > 0) {
            this.f17100G++;
            if (this.f17104K) {
                drawable.mutate();
            }
            drawable.setAlpha(i);
            this.f17100G--;
            drawable.draw(canvas);
        }
    }

    /* renamed from: q */
    private void m23434q() {
        if (this.f17102I) {
            this.f17102I = false;
            C6192a aVar = this.f17101H;
            if (aVar != null) {
                aVar.mo18290c();
            }
        }
    }

    /* renamed from: r */
    private void m23435r() {
        int i;
        if (!this.f17102I && (i = this.f17108y) >= 0) {
            boolean[] zArr = this.f17099F;
            if (i < zArr.length && zArr[i]) {
                this.f17102I = true;
                C6192a aVar = this.f17101H;
                if (aVar != null) {
                    aVar.mo18288a();
                }
            }
        }
    }

    /* renamed from: s */
    private void m23436s() {
        if (this.f17103J && this.f17109z == 2 && this.f17099F[this.f17108y]) {
            C6192a aVar = this.f17101H;
            if (aVar != null) {
                aVar.mo18289b();
            }
            this.f17103J = false;
        }
    }

    /* renamed from: t */
    private void m23437t() {
        this.f17109z = 2;
        Arrays.fill(this.f17096C, this.f17107x);
        this.f17096C[0] = 255;
        Arrays.fill(this.f17097D, this.f17107x);
        this.f17097D[0] = 255;
        Arrays.fill(this.f17099F, this.f17106w);
        this.f17099F[0] = true;
    }

    /* renamed from: w */
    private boolean m23438w(float f) {
        boolean z = true;
        for (int i = 0; i < this.f17105v.length; i++) {
            boolean[] zArr = this.f17099F;
            int i2 = zArr[i] ? 1 : -1;
            int[] iArr = this.f17097D;
            iArr[i] = (int) (((float) this.f17096C[i]) + (((float) (i2 * 255)) * f));
            if (iArr[i] < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            if (zArr[i] && iArr[i] < 255) {
                z = false;
            }
            if (!zArr[i] && iArr[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r0 != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r0 != false) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052 A[LOOP:0: B:17:0x004d->B:19:0x0052, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e A[EDGE_INSN: B:23:0x006e->B:20:0x006e ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            int r0 = r8.f17109z
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 == r3) goto L_0x000a
            goto L_0x004d
        L_0x000a:
            int r0 = r8.f17094A
            if (r0 <= 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            p174e.p247e.p253d.p257d.C6062k.m22841i(r0)
            long r4 = r8.mo18379p()
            long r6 = r8.f17095B
            long r4 = r4 - r6
            float r0 = (float) r4
            int r4 = r8.f17094A
            float r4 = (float) r4
            float r0 = r0 / r4
            boolean r0 = r8.m23438w(r0)
            if (r0 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0027:
            int[] r0 = r8.f17097D
            int[] r4 = r8.f17096C
            android.graphics.drawable.Drawable[] r5 = r8.f17105v
            int r5 = r5.length
            java.lang.System.arraycopy(r0, r2, r4, r2, r5)
            long r4 = r8.mo18379p()
            r8.f17095B = r4
            int r0 = r8.f17094A
            if (r0 != 0) goto L_0x003e
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            boolean r0 = r8.m23438w(r0)
            r8.m23435r()
            if (r0 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r1 = 1
        L_0x004a:
            r8.f17109z = r1
            r3 = r0
        L_0x004d:
            android.graphics.drawable.Drawable[] r0 = r8.f17105v
            int r1 = r0.length
            if (r2 >= r1) goto L_0x006e
            r0 = r0[r2]
            int[] r1 = r8.f17097D
            r1 = r1[r2]
            int r4 = r8.f17098E
            int r1 = r1 * r4
            double r4 = (double) r1
            r6 = 4643176031446892544(0x406fe00000000000, double:255.0)
            double r4 = r4 / r6
            double r4 = java.lang.Math.ceil(r4)
            int r1 = (int) r4
            r8.m23433i(r9, r0, r1)
            int r2 = r2 + 1
            goto L_0x004d
        L_0x006e:
            if (r3 == 0) goto L_0x0077
            r8.m23434q()
            r8.m23436s()
            goto L_0x007a
        L_0x0077:
            r8.invalidateSelf()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p247e.p274h.p284e.C6191f.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        return this.f17098E;
    }

    /* renamed from: h */
    public void mo18372h() {
        this.f17100G++;
    }

    public void invalidateSelf() {
        if (this.f17100G == 0) {
            super.invalidateSelf();
        }
    }

    /* renamed from: j */
    public void mo18374j() {
        this.f17100G--;
        invalidateSelf();
    }

    /* renamed from: k */
    public void mo18375k() {
        this.f17109z = 0;
        Arrays.fill(this.f17099F, true);
        invalidateSelf();
    }

    /* renamed from: m */
    public void mo18376m(int i) {
        this.f17109z = 0;
        this.f17099F[i] = true;
        invalidateSelf();
    }

    /* renamed from: n */
    public void mo18377n(int i) {
        this.f17109z = 0;
        this.f17099F[i] = false;
        invalidateSelf();
    }

    /* renamed from: o */
    public void mo18378o() {
        this.f17109z = 2;
        for (int i = 0; i < this.f17105v.length; i++) {
            this.f17097D[i] = this.f17099F[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public long mo18379p() {
        return SystemClock.uptimeMillis();
    }

    public void setAlpha(int i) {
        if (this.f17098E != i) {
            this.f17098E = i;
            invalidateSelf();
        }
    }

    /* renamed from: u */
    public void mo18380u(C6192a aVar) {
        this.f17101H = aVar;
    }

    /* renamed from: v */
    public void mo18381v(int i) {
        this.f17094A = i;
        if (this.f17109z == 1) {
            this.f17109z = 0;
        }
    }
}
