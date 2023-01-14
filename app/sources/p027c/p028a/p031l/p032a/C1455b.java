package p027c.p028a.p031l.p032a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C1164a;

/* renamed from: c.a.l.a.b */
class C1455b extends Drawable implements Drawable.Callback {

    /* renamed from: f */
    private C1458c f4479f;

    /* renamed from: o */
    private Rect f4480o;

    /* renamed from: p */
    private Drawable f4481p;

    /* renamed from: q */
    private Drawable f4482q;

    /* renamed from: r */
    private int f4483r = 255;

    /* renamed from: s */
    private boolean f4484s;

    /* renamed from: t */
    private int f4485t = -1;

    /* renamed from: u */
    private boolean f4486u;

    /* renamed from: v */
    private Runnable f4487v;

    /* renamed from: w */
    private long f4488w;

    /* renamed from: x */
    private long f4489x;

    /* renamed from: y */
    private C1457b f4490y;

    /* renamed from: c.a.l.a.b$a */
    class C1456a implements Runnable {
        C1456a() {
        }

        public void run() {
            C1455b.this.mo5373a(true);
            C1455b.this.invalidateSelf();
        }
    }

    /* renamed from: c.a.l.a.b$b */
    static class C1457b implements Drawable.Callback {

        /* renamed from: f */
        private Drawable.Callback f4492f;

        C1457b() {
        }

        /* renamed from: a */
        public Drawable.Callback mo5381a() {
            Drawable.Callback callback = this.f4492f;
            this.f4492f = null;
            return callback;
        }

        /* renamed from: b */
        public C1457b mo5382b(Drawable.Callback callback) {
            this.f4492f = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f4492f;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f4492f;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: c.a.l.a.b$c */
    static abstract class C1458c extends Drawable.ConstantState {

        /* renamed from: A */
        int f4493A;

        /* renamed from: B */
        int f4494B;

        /* renamed from: C */
        boolean f4495C;

        /* renamed from: D */
        ColorFilter f4496D;

        /* renamed from: E */
        boolean f4497E;

        /* renamed from: F */
        ColorStateList f4498F;

        /* renamed from: G */
        PorterDuff.Mode f4499G;

        /* renamed from: H */
        boolean f4500H;

        /* renamed from: I */
        boolean f4501I;

        /* renamed from: a */
        final C1455b f4502a;

        /* renamed from: b */
        Resources f4503b;

        /* renamed from: c */
        int f4504c = 160;

        /* renamed from: d */
        int f4505d;

        /* renamed from: e */
        int f4506e;

        /* renamed from: f */
        SparseArray<Drawable.ConstantState> f4507f;

        /* renamed from: g */
        Drawable[] f4508g;

        /* renamed from: h */
        int f4509h;

        /* renamed from: i */
        boolean f4510i;

        /* renamed from: j */
        boolean f4511j;

        /* renamed from: k */
        Rect f4512k;

        /* renamed from: l */
        boolean f4513l;

        /* renamed from: m */
        boolean f4514m;

        /* renamed from: n */
        int f4515n;

        /* renamed from: o */
        int f4516o;

        /* renamed from: p */
        int f4517p;

        /* renamed from: q */
        int f4518q;

        /* renamed from: r */
        boolean f4519r;

        /* renamed from: s */
        int f4520s;

        /* renamed from: t */
        boolean f4521t;

        /* renamed from: u */
        boolean f4522u;

        /* renamed from: v */
        boolean f4523v;

        /* renamed from: w */
        boolean f4524w;

        /* renamed from: x */
        boolean f4525x;

        /* renamed from: y */
        boolean f4526y;

        /* renamed from: z */
        int f4527z;

        C1458c(C1458c cVar, C1455b bVar, Resources resources) {
            this.f4510i = false;
            this.f4513l = false;
            this.f4525x = true;
            this.f4493A = 0;
            this.f4494B = 0;
            this.f4502a = bVar;
            this.f4503b = resources != null ? resources : cVar != null ? cVar.f4503b : null;
            int f = C1455b.m6487f(resources, cVar != null ? cVar.f4504c : 0);
            this.f4504c = f;
            if (cVar != null) {
                this.f4505d = cVar.f4505d;
                this.f4506e = cVar.f4506e;
                this.f4523v = true;
                this.f4524w = true;
                this.f4510i = cVar.f4510i;
                this.f4513l = cVar.f4513l;
                this.f4525x = cVar.f4525x;
                this.f4526y = cVar.f4526y;
                this.f4527z = cVar.f4527z;
                this.f4493A = cVar.f4493A;
                this.f4494B = cVar.f4494B;
                this.f4495C = cVar.f4495C;
                this.f4496D = cVar.f4496D;
                this.f4497E = cVar.f4497E;
                this.f4498F = cVar.f4498F;
                this.f4499G = cVar.f4499G;
                this.f4500H = cVar.f4500H;
                this.f4501I = cVar.f4501I;
                if (cVar.f4504c == f) {
                    if (cVar.f4511j) {
                        this.f4512k = new Rect(cVar.f4512k);
                        this.f4511j = true;
                    }
                    if (cVar.f4514m) {
                        this.f4515n = cVar.f4515n;
                        this.f4516o = cVar.f4516o;
                        this.f4517p = cVar.f4517p;
                        this.f4518q = cVar.f4518q;
                        this.f4514m = true;
                    }
                }
                if (cVar.f4519r) {
                    this.f4520s = cVar.f4520s;
                    this.f4519r = true;
                }
                if (cVar.f4521t) {
                    this.f4522u = cVar.f4522u;
                    this.f4521t = true;
                }
                Drawable[] drawableArr = cVar.f4508g;
                this.f4508g = new Drawable[drawableArr.length];
                this.f4509h = cVar.f4509h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f4507f;
                this.f4507f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f4509h);
                int i = this.f4509h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        Drawable.ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f4507f.put(i2, constantState);
                        } else {
                            this.f4508g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f4508g = new Drawable[10];
            this.f4509h = 0;
        }

        /* renamed from: e */
        private void m6496e() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f4507f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f4508g[this.f4507f.keyAt(i)] = m6497s(this.f4507f.valueAt(i).newDrawable(this.f4503b));
                }
                this.f4507f = null;
            }
        }

        /* renamed from: s */
        private Drawable m6497s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f4527z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f4502a);
            return mutate;
        }

        /* renamed from: a */
        public final int mo5386a(Drawable drawable) {
            int i = this.f4509h;
            if (i >= this.f4508g.length) {
                mo5401o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f4502a);
            this.f4508g[i] = drawable;
            this.f4509h++;
            this.f4506e = drawable.getChangingConfigurations() | this.f4506e;
            mo5402p();
            this.f4512k = null;
            this.f4511j = false;
            this.f4514m = false;
            this.f4523v = false;
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo5387b(Resources.Theme theme) {
            if (theme != null) {
                m6496e();
                int i = this.f4509h;
                Drawable[] drawableArr = this.f4508g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f4506e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo5409y(theme.getResources());
            }
        }

        /* renamed from: c */
        public synchronized boolean mo5388c() {
            if (this.f4523v) {
                return this.f4524w;
            }
            m6496e();
            this.f4523v = true;
            int i = this.f4509h;
            Drawable[] drawableArr = this.f4508g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f4524w = false;
                    return false;
                }
            }
            this.f4524w = true;
            return true;
        }

        public boolean canApplyTheme() {
            int i = this.f4509h;
            Drawable[] drawableArr = this.f4508g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f4507f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo5390d() {
            this.f4514m = true;
            m6496e();
            int i = this.f4509h;
            Drawable[] drawableArr = this.f4508g;
            this.f4516o = -1;
            this.f4515n = -1;
            this.f4518q = 0;
            this.f4517p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f4515n) {
                    this.f4515n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f4516o) {
                    this.f4516o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f4517p) {
                    this.f4517p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f4518q) {
                    this.f4518q = minimumHeight;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public final int mo5391f() {
            return this.f4508g.length;
        }

        /* renamed from: g */
        public final Drawable mo5392g(int i) {
            int indexOfKey;
            Drawable drawable = this.f4508g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f4507f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable s = m6497s(this.f4507f.valueAt(indexOfKey).newDrawable(this.f4503b));
            this.f4508g[i] = s;
            this.f4507f.removeAt(indexOfKey);
            if (this.f4507f.size() == 0) {
                this.f4507f = null;
            }
            return s;
        }

        public int getChangingConfigurations() {
            return this.f4505d | this.f4506e;
        }

        /* renamed from: h */
        public final int mo5394h() {
            return this.f4509h;
        }

        /* renamed from: i */
        public final int mo5395i() {
            if (!this.f4514m) {
                mo5390d();
            }
            return this.f4516o;
        }

        /* renamed from: j */
        public final int mo5396j() {
            if (!this.f4514m) {
                mo5390d();
            }
            return this.f4518q;
        }

        /* renamed from: k */
        public final int mo5397k() {
            if (!this.f4514m) {
                mo5390d();
            }
            return this.f4517p;
        }

        /* renamed from: l */
        public final Rect mo5398l() {
            Rect rect = null;
            if (this.f4510i) {
                return null;
            }
            Rect rect2 = this.f4512k;
            if (rect2 != null || this.f4511j) {
                return rect2;
            }
            m6496e();
            Rect rect3 = new Rect();
            int i = this.f4509h;
            Drawable[] drawableArr = this.f4508g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect3.left;
                    if (i3 > rect.left) {
                        rect.left = i3;
                    }
                    int i4 = rect3.top;
                    if (i4 > rect.top) {
                        rect.top = i4;
                    }
                    int i5 = rect3.right;
                    if (i5 > rect.right) {
                        rect.right = i5;
                    }
                    int i6 = rect3.bottom;
                    if (i6 > rect.bottom) {
                        rect.bottom = i6;
                    }
                }
            }
            this.f4511j = true;
            this.f4512k = rect;
            return rect;
        }

        /* renamed from: m */
        public final int mo5399m() {
            if (!this.f4514m) {
                mo5390d();
            }
            return this.f4515n;
        }

        /* renamed from: n */
        public final int mo5400n() {
            if (this.f4519r) {
                return this.f4520s;
            }
            m6496e();
            int i = this.f4509h;
            Drawable[] drawableArr = this.f4508g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f4520s = opacity;
            this.f4519r = true;
            return opacity;
        }

        /* renamed from: o */
        public void mo5401o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f4508g, 0, drawableArr, 0, i);
            this.f4508g = drawableArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo5402p() {
            this.f4519r = false;
            this.f4521t = false;
        }

        /* renamed from: q */
        public final boolean mo5403q() {
            return this.f4513l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public abstract void mo5367r();

        /* renamed from: t */
        public final void mo5404t(boolean z) {
            this.f4513l = z;
        }

        /* renamed from: u */
        public final void mo5405u(int i) {
            this.f4493A = i;
        }

        /* renamed from: v */
        public final void mo5406v(int i) {
            this.f4494B = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public final boolean mo5407w(int i, int i2) {
            int i3 = this.f4509h;
            Drawable[] drawableArr = this.f4508g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = Build.VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f4527z = i;
            return z;
        }

        /* renamed from: x */
        public final void mo5408x(boolean z) {
            this.f4510i = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public final void mo5409y(Resources resources) {
            if (resources != null) {
                this.f4503b = resources;
                int f = C1455b.m6487f(resources, this.f4504c);
                int i = this.f4504c;
                this.f4504c = f;
                if (i != f) {
                    this.f4514m = false;
                    this.f4511j = false;
                }
            }
        }
    }

    C1455b() {
    }

    /* renamed from: d */
    private void m6485d(Drawable drawable) {
        if (this.f4490y == null) {
            this.f4490y = new C1457b();
        }
        drawable.setCallback(this.f4490y.mo5382b(drawable.getCallback()));
        try {
            if (this.f4479f.f4493A <= 0 && this.f4484s) {
                drawable.setAlpha(this.f4483r);
            }
            C1458c cVar = this.f4479f;
            if (cVar.f4497E) {
                drawable.setColorFilter(cVar.f4496D);
            } else {
                if (cVar.f4500H) {
                    C1164a.m4551o(drawable, cVar.f4498F);
                }
                C1458c cVar2 = this.f4479f;
                if (cVar2.f4501I) {
                    C1164a.m4552p(drawable, cVar2.f4499G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f4479f.f4525x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            int i = Build.VERSION.SDK_INT;
            if (i >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (i >= 19) {
                drawable.setAutoMirrored(this.f4479f.f4495C);
            }
            Rect rect = this.f4480o;
            if (i >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f4490y.mo5381a());
        }
    }

    /* renamed from: e */
    private boolean m6486e() {
        return isAutoMirrored() && C1164a.m4542f(this) == 1;
    }

    /* renamed from: f */
    static int m6487f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo5373a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f4484s = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f4481p
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f4488w
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f4483r
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            c.a.l.a.b$c r9 = r13.f4479f
            int r9 = r9.f4493A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f4483r
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f4488w = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f4482q
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f4489x
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f4482q = r0
            goto L_0x0061
        L_0x004e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            c.a.l.a.b$c r4 = r13.f4479f
            int r4 = r4.f4494B
            int r3 = r3 / r4
            int r4 = r13.f4483r
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f4489x = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f4487v
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p028a.p031l.p032a.C1455b.mo5373a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        this.f4479f.mo5387b(theme);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1458c mo5322b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo5374c() {
        return this.f4485t;
    }

    public boolean canApplyTheme() {
        return this.f4479f.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f4481p;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f4482q;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo5375g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f4485t
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            c.a.l.a.b$c r0 = r9.f4479f
            int r0 = r0.f4494B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f4482q
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f4481p
            if (r0 == 0) goto L_0x0029
            r9.f4482q = r0
            c.a.l.a.b$c r0 = r9.f4479f
            int r0 = r0.f4494B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f4489x = r0
            goto L_0x0035
        L_0x0029:
            r9.f4482q = r4
            r9.f4489x = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f4481p
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            c.a.l.a.b$c r0 = r9.f4479f
            int r1 = r0.f4509h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo5392g(r10)
            r9.f4481p = r0
            r9.f4485t = r10
            if (r0 == 0) goto L_0x005a
            c.a.l.a.b$c r10 = r9.f4479f
            int r10 = r10.f4493A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f4488w = r2
        L_0x0051:
            r9.m6485d(r0)
            goto L_0x005a
        L_0x0055:
            r9.f4481p = r4
            r10 = -1
            r9.f4485t = r10
        L_0x005a:
            long r0 = r9.f4488w
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f4489x
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f4487v
            if (r0 != 0) goto L_0x0073
            c.a.l.a.b$a r0 = new c.a.l.a.b$a
            r0.<init>()
            r9.f4487v = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo5373a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p028a.p031l.p032a.C1455b.mo5375g(int):boolean");
    }

    public int getAlpha() {
        return this.f4483r;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f4479f.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        if (!this.f4479f.mo5388c()) {
            return null;
        }
        this.f4479f.f4505d = getChangingConfigurations();
        return this.f4479f;
    }

    public Drawable getCurrent() {
        return this.f4481p;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f4480o;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f4479f.mo5403q()) {
            return this.f4479f.mo5395i();
        }
        Drawable drawable = this.f4481p;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f4479f.mo5403q()) {
            return this.f4479f.mo5399m();
        }
        Drawable drawable = this.f4481p;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f4479f.mo5403q()) {
            return this.f4479f.mo5396j();
        }
        Drawable drawable = this.f4481p;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f4479f.mo5403q()) {
            return this.f4479f.mo5397k();
        }
        Drawable drawable = this.f4481p;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f4481p;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f4479f.mo5400n();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f4481p;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect l = this.f4479f.mo5398l();
        if (l != null) {
            rect.set(l);
            z = (l.right | ((l.left | l.top) | l.bottom)) != 0;
        } else {
            Drawable drawable = this.f4481p;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m6486e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo5336h(C1458c cVar) {
        this.f4479f = cVar;
        int i = this.f4485t;
        if (i >= 0) {
            Drawable g = cVar.mo5392g(i);
            this.f4481p = g;
            if (g != null) {
                m6485d(g);
            }
        }
        this.f4482q = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo5377i(Resources resources) {
        this.f4479f.mo5409y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        C1458c cVar = this.f4479f;
        if (cVar != null) {
            cVar.mo5402p();
        }
        if (drawable == this.f4481p && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f4479f.f4495C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f4482q;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f4482q = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f4481p;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f4484s) {
                this.f4481p.setAlpha(this.f4483r);
            }
        }
        if (this.f4489x != 0) {
            this.f4489x = 0;
            z = true;
        }
        if (this.f4488w != 0) {
            this.f4488w = 0;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f4486u && super.mutate() == this) {
            C1458c b = mo5322b();
            b.mo5367r();
            mo5336h(b);
            this.f4486u = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4482q;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f4481p;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f4479f.mo5407w(i, mo5374c());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f4482q;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f4481p;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4482q;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f4481p;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f4481p && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f4484s || this.f4483r != i) {
            this.f4484s = true;
            this.f4483r = i;
            Drawable drawable = this.f4481p;
            if (drawable == null) {
                return;
            }
            if (this.f4488w == 0) {
                drawable.setAlpha(i);
            } else {
                mo5373a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C1458c cVar = this.f4479f;
        if (cVar.f4495C != z) {
            cVar.f4495C = z;
            Drawable drawable = this.f4481p;
            if (drawable != null) {
                C1164a.m4546j(drawable, z);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C1458c cVar = this.f4479f;
        cVar.f4497E = true;
        if (cVar.f4496D != colorFilter) {
            cVar.f4496D = colorFilter;
            Drawable drawable = this.f4481p;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C1458c cVar = this.f4479f;
        if (cVar.f4525x != z) {
            cVar.f4525x = z;
            Drawable drawable = this.f4481p;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f4481p;
        if (drawable != null) {
            C1164a.m4547k(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f4480o;
        if (rect == null) {
            this.f4480o = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f4481p;
        if (drawable != null) {
            C1164a.m4548l(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C1458c cVar = this.f4479f;
        cVar.f4500H = true;
        if (cVar.f4498F != colorStateList) {
            cVar.f4498F = colorStateList;
            C1164a.m4551o(this.f4481p, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C1458c cVar = this.f4479f;
        cVar.f4501I = true;
        if (cVar.f4499G != mode) {
            cVar.f4499G = mode;
            C1164a.m4552p(this.f4481p, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f4482q;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f4481p;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f4481p && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
