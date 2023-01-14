package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.p116f0.p118b.C2758a;
import com.facebook.react.p116f0.p118b.C2759b;
import com.facebook.react.p116f0.p118b.C2762c;
import com.facebook.react.uimanager.C2939e;
import com.facebook.react.uimanager.C3038r;
import com.facebook.react.uimanager.C3051u0;
import com.facebook.react.uimanager.events.C2945d;
import com.facebook.yoga.C3307g;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import p174e.p247e.p253d.p257d.C6058j;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p253d.p264k.C6111f;
import p174e.p247e.p274h.p281c.C6174b;
import p174e.p247e.p274h.p281c.C6179d;
import p174e.p247e.p274h.p284e.C6187b;
import p174e.p247e.p274h.p284e.C6198l;
import p174e.p247e.p274h.p284e.C6205q;
import p174e.p247e.p274h.p285f.C6224a;
import p174e.p247e.p274h.p285f.C6225b;
import p174e.p247e.p274h.p285f.C6227d;
import p174e.p247e.p274h.p288i.C6240d;
import p174e.p247e.p294k.p299c.C6270f;
import p174e.p247e.p294k.p307k.C6372g;
import p174e.p247e.p294k.p310n.C6382a;
import p174e.p247e.p294k.p311o.C6383a;

/* renamed from: com.facebook.react.views.image.h */
public class C3106h extends C6240d {
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static float[] f8612t = new float[4];
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final Matrix f8613u = new Matrix();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final Matrix f8614v = new Matrix();
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final Matrix f8615w = new Matrix();

    /* renamed from: A */
    private C2758a f8616A;

    /* renamed from: B */
    private Drawable f8617B;

    /* renamed from: C */
    private Drawable f8618C;

    /* renamed from: D */
    private C6198l f8619D;

    /* renamed from: E */
    private int f8620E = 0;

    /* renamed from: F */
    private int f8621F;

    /* renamed from: G */
    private int f8622G;

    /* renamed from: H */
    private float f8623H;

    /* renamed from: I */
    private float f8624I = Float.NaN;

    /* renamed from: J */
    private float[] f8625J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public C6205q.C6207b f8626K = C3100d.m12207b();
    /* access modifiers changed from: private */

    /* renamed from: L */
    public Shader.TileMode f8627L = C3100d.m12206a();

    /* renamed from: M */
    private boolean f8628M;

    /* renamed from: N */
    private final C6174b f8629N;

    /* renamed from: O */
    private final C3108b f8630O;

    /* renamed from: P */
    private final C3109c f8631P;

    /* renamed from: Q */
    private C6382a f8632Q;

    /* renamed from: R */
    private C3103g f8633R;

    /* renamed from: S */
    private C6179d f8634S;

    /* renamed from: T */
    private C3097a f8635T;

    /* renamed from: U */
    private Object f8636U;

    /* renamed from: V */
    private int f8637V = -1;

    /* renamed from: W */
    private boolean f8638W;

    /* renamed from: a0 */
    private ReadableMap f8639a0;

    /* renamed from: x */
    private C3099c f8640x = C3099c.AUTO;

    /* renamed from: y */
    private final List<C2758a> f8641y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C2758a f8642z;

    /* renamed from: com.facebook.react.views.image.h$a */
    class C3107a extends C3103g<C6372g> {

        /* renamed from: r */
        final /* synthetic */ C2945d f8643r;

        C3107a(C2945d dVar) {
            this.f8643r = dVar;
        }

        /* renamed from: h */
        public void mo9988h(String str, Throwable th) {
            this.f8643r.mo9651c(C3098b.m12197u(C3051u0.m12088e(C3106h.this), C3106h.this.getId(), th));
        }

        /* renamed from: n */
        public void mo9989n(String str, Object obj) {
            this.f8643r.mo9651c(C3098b.m12201y(C3051u0.m12088e(C3106h.this), C3106h.this.getId()));
        }

        /* renamed from: w */
        public void mo9960w(int i, int i2) {
            this.f8643r.mo9651c(C3098b.m12202z(C3051u0.m12088e(C3106h.this), C3106h.this.getId(), C3106h.this.f8642z.mo9020d(), i, i2));
        }

        /* renamed from: x */
        public void mo9987e(String str, C6372g gVar, Animatable animatable) {
            if (gVar != null) {
                this.f8643r.mo9651c(C3098b.m12200x(C3051u0.m12088e(C3106h.this), C3106h.this.getId(), C3106h.this.f8642z.mo9020d(), gVar.mo15982e(), gVar.mo15981c()));
                this.f8643r.mo9651c(C3098b.m12199w(C3051u0.m12088e(C3106h.this), C3106h.this.getId()));
            }
        }
    }

    /* renamed from: com.facebook.react.views.image.h$b */
    private class C3108b extends C6383a {
        private C3108b() {
        }

        /* synthetic */ C3108b(C3106h hVar, C3107a aVar) {
            this();
        }

        /* renamed from: f */
        public void mo9991f(Bitmap bitmap, Bitmap bitmap2) {
            C3106h.this.m12227p(C3106h.f8612t);
            bitmap.setHasAlpha(true);
            if (!C2939e.m11588a(C3106h.f8612t[0], 0.0f) || !C2939e.m11588a(C3106h.f8612t[1], 0.0f) || !C2939e.m11588a(C3106h.f8612t[2], 0.0f) || !C2939e.m11588a(C3106h.f8612t[3], 0.0f)) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                Canvas canvas = new Canvas(bitmap);
                float[] fArr = new float[8];
                mo9992g(bitmap2, C3106h.f8612t, fArr);
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight()), fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
                return;
            }
            super.mo9991f(bitmap, bitmap2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo9992g(Bitmap bitmap, float[] fArr, float[] fArr2) {
            C3106h.this.f8626K.mo18439a(C3106h.f8613u, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            C3106h.f8613u.invert(C3106h.f8614v);
            fArr2[0] = C3106h.f8614v.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = C3106h.f8614v.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = C3106h.f8614v.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = C3106h.f8614v.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }
    }

    /* renamed from: com.facebook.react.views.image.h$c */
    private class C3109c extends C6383a {
        private C3109c() {
        }

        /* synthetic */ C3109c(C3106h hVar, C3107a aVar) {
            this();
        }

        /* renamed from: b */
        public C6088a<Bitmap> mo9952b(Bitmap bitmap, C6270f fVar) {
            Rect rect = new Rect(0, 0, C3106h.this.getWidth(), C3106h.this.getHeight());
            C3106h.this.f8626K.mo18439a(C3106h.f8615w, rect, bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(bitmap, C3106h.this.f8627L, C3106h.this.f8627L);
            bitmapShader.setLocalMatrix(C3106h.f8615w);
            paint.setShader(bitmapShader);
            C6088a<Bitmap> a = fVar.mo18583a(C3106h.this.getWidth(), C3106h.this.getHeight());
            try {
                new Canvas(a.mo18082w0()).drawRect(rect, paint);
                return a.clone();
            } finally {
                C6088a.m22949v0(a);
            }
        }
    }

    public C3106h(Context context, C6174b bVar, C3097a aVar, Object obj) {
        super(context, m12226o(context));
        this.f8629N = bVar;
        this.f8630O = new C3108b(this, (C3107a) null);
        this.f8631P = new C3109c(this, (C3107a) null);
        this.f8635T = aVar;
        this.f8636U = obj;
        this.f8641y = new LinkedList();
    }

    /* renamed from: o */
    private static C6224a m12226o(Context context) {
        return new C6225b(context.getResources()).mo18493w(C6227d.m23591a(0.0f)).mo18473a();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m12227p(float[] fArr) {
        float f = !C3307g.m12971a(this.f8624I) ? this.f8624I : 0.0f;
        float[] fArr2 = this.f8625J;
        fArr[0] = (fArr2 == null || C3307g.m12971a(fArr2[0])) ? f : this.f8625J[0];
        float[] fArr3 = this.f8625J;
        fArr[1] = (fArr3 == null || C3307g.m12971a(fArr3[1])) ? f : this.f8625J[1];
        float[] fArr4 = this.f8625J;
        fArr[2] = (fArr4 == null || C3307g.m12971a(fArr4[2])) ? f : this.f8625J[2];
        float[] fArr5 = this.f8625J;
        if (fArr5 != null && !C3307g.m12971a(fArr5[3])) {
            f = this.f8625J[3];
        }
        fArr[3] = f;
    }

    /* renamed from: q */
    private boolean m12228q() {
        return this.f8641y.size() > 1;
    }

    /* renamed from: r */
    private boolean m12229r() {
        return this.f8627L != Shader.TileMode.CLAMP;
    }

    /* renamed from: u */
    private void m12230u() {
        this.f8642z = null;
        if (this.f8641y.isEmpty()) {
            this.f8641y.add(new C2758a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        } else if (m12228q()) {
            C2759b.C2761b a = C2759b.m11069a(getWidth(), getHeight(), this.f8641y);
            this.f8642z = a.mo9025a();
            this.f8616A = a.mo9026b();
            return;
        }
        this.f8642z = this.f8641y.get(0);
    }

    /* renamed from: v */
    private boolean m12231v(C2758a aVar) {
        C3099c cVar = this.f8640x;
        return cVar == C3099c.AUTO ? C6111f.m23005i(aVar.mo9021e()) || C6111f.m23006j(aVar.mo9021e()) : cVar == C3099c.RESIZE;
    }

    /* renamed from: x */
    private void m12232x(String str) {
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            this.f8628M = this.f8628M || m12228q() || m12229r();
            mo9967s();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.facebook.react.views.image.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: e.e.h.c.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: com.facebook.react.views.image.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: com.facebook.react.views.image.g} */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a0, code lost:
        if (r0 == null) goto L_0x01a3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a7  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9967s() {
        /*
            r11 = this;
            boolean r0 = r11.f8628M
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r11.m12228q()
            if (r0 == 0) goto L_0x0018
            int r0 = r11.getWidth()
            if (r0 <= 0) goto L_0x0017
            int r0 = r11.getHeight()
            if (r0 > 0) goto L_0x0018
        L_0x0017:
            return
        L_0x0018:
            r11.m12230u()
            com.facebook.react.f0.b.a r0 = r11.f8642z
            if (r0 != 0) goto L_0x0020
            return
        L_0x0020:
            boolean r0 = r11.m12231v(r0)
            if (r0 == 0) goto L_0x0033
            int r1 = r11.getWidth()
            if (r1 <= 0) goto L_0x0032
            int r1 = r11.getHeight()
            if (r1 > 0) goto L_0x0033
        L_0x0032:
            return
        L_0x0033:
            boolean r1 = r11.m12229r()
            if (r1 == 0) goto L_0x0046
            int r1 = r11.getWidth()
            if (r1 <= 0) goto L_0x0045
            int r1 = r11.getHeight()
            if (r1 > 0) goto L_0x0046
        L_0x0045:
            return
        L_0x0046:
            e.e.h.h.b r1 = r11.getHierarchy()
            e.e.h.f.a r1 = (p174e.p247e.p274h.p285f.C6224a) r1
            e.e.h.e.q$b r2 = r11.f8626K
            r1.mo18469v(r2)
            android.graphics.drawable.Drawable r2 = r11.f8617B
            if (r2 == 0) goto L_0x005a
            e.e.h.e.q$b r3 = r11.f8626K
            r1.mo18455A(r2, r3)
        L_0x005a:
            android.graphics.drawable.Drawable r2 = r11.f8618C
            if (r2 == 0) goto L_0x0063
            e.e.h.e.q$b r3 = p174e.p247e.p274h.p284e.C6205q.C6207b.f17205g
            r1.mo18455A(r2, r3)
        L_0x0063:
            e.e.h.e.q$b r2 = r11.f8626K
            e.e.h.e.q$b r3 = p174e.p247e.p274h.p284e.C6205q.C6207b.f17207i
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L_0x0071
            e.e.h.e.q$b r3 = p174e.p247e.p274h.p284e.C6205q.C6207b.f17208j
            if (r2 == r3) goto L_0x0071
            r2 = 1
            goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            e.e.h.f.d r3 = r1.mo18468q()
            float[] r6 = f8612t
            r11.m12227p(r6)
            float[] r6 = f8612t
            r7 = r6[r4]
            r8 = r6[r5]
            r9 = 2
            r9 = r6[r9]
            r10 = 3
            r6 = r6[r10]
            r3.mo18507m(r7, r8, r9, r6)
            e.e.h.e.l r6 = r11.f8619D
            if (r6 == 0) goto L_0x00a3
            int r7 = r11.f8621F
            float r8 = r11.f8623H
            r6.mo18402b(r7, r8)
            e.e.h.e.l r6 = r11.f8619D
            float[] r7 = r3.mo18497d()
            r6.mo18408s(r7)
            e.e.h.e.l r6 = r11.f8619D
            r1.mo18470w(r6)
        L_0x00a3:
            if (r2 == 0) goto L_0x00a9
            r6 = 0
            r3.mo18508n(r6)
        L_0x00a9:
            int r6 = r11.f8621F
            float r7 = r11.f8623H
            r3.mo18506l(r6, r7)
            int r6 = r11.f8622G
            if (r6 == 0) goto L_0x00b8
            r3.mo18509o(r6)
            goto L_0x00bd
        L_0x00b8:
            e.e.h.f.d$a r6 = p174e.p247e.p274h.p285f.C6227d.C6228a.BITMAP_ONLY
            r3.mo18510p(r6)
        L_0x00bd:
            r1.mo18457D(r3)
            int r3 = r11.f8637V
            if (r3 < 0) goto L_0x00c5
            goto L_0x00d1
        L_0x00c5:
            com.facebook.react.f0.b.a r3 = r11.f8642z
            boolean r3 = r3.mo9023f()
            if (r3 == 0) goto L_0x00cf
            r3 = 0
            goto L_0x00d1
        L_0x00cf:
            r3 = 300(0x12c, float:4.2E-43)
        L_0x00d1:
            r1.mo18471y(r3)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            if (r2 == 0) goto L_0x00e0
            com.facebook.react.views.image.h$b r2 = r11.f8630O
            r3.add(r2)
        L_0x00e0:
            e.e.k.n.a r2 = r11.f8632Q
            if (r2 == 0) goto L_0x00e7
            r3.add(r2)
        L_0x00e7:
            boolean r2 = r11.m12229r()
            if (r2 == 0) goto L_0x00f2
            com.facebook.react.views.image.h$c r2 = r11.f8631P
            r3.add(r2)
        L_0x00f2:
            e.e.k.o.d r2 = com.facebook.react.views.image.C3101e.m12210d(r3)
            if (r0 == 0) goto L_0x0106
            e.e.k.e.e r0 = new e.e.k.e.e
            int r3 = r11.getWidth()
            int r6 = r11.getHeight()
            r0.<init>(r3, r6)
            goto L_0x0107
        L_0x0106:
            r0 = 0
        L_0x0107:
            com.facebook.react.f0.b.a r3 = r11.f8642z
            android.net.Uri r3 = r3.mo9021e()
            e.e.k.o.c r3 = p174e.p247e.p294k.p311o.C6388c.m24438s(r3)
            e.e.k.o.c r3 = r3.mo18946A(r2)
            e.e.k.o.c r3 = r3.mo18950E(r0)
            e.e.k.o.c r3 = r3.mo18973t(r5)
            boolean r6 = r11.f8638W
            e.e.k.o.c r3 = r3.mo18947B(r6)
            com.facebook.react.bridge.ReadableMap r6 = r11.f8639a0
            com.facebook.react.modules.fresco.a r3 = com.facebook.react.modules.fresco.C2819a.m11231x(r3, r6)
            com.facebook.react.views.image.a r6 = r11.f8635T
            if (r6 == 0) goto L_0x0136
            com.facebook.react.f0.b.a r7 = r11.f8642z
            android.net.Uri r7 = r7.mo9021e()
            r6.mo9951a(r7)
        L_0x0136:
            e.e.h.c.b r6 = r11.f8629N
            r6.mo18318z()
            e.e.h.c.b r6 = r11.f8629N
            e.e.h.c.b r6 = r6.mo18291A(r5)
            java.lang.Object r7 = r11.f8636U
            e.e.h.c.b r6 = r6.mo18292B(r7)
            e.e.h.h.a r7 = r11.getController()
            e.e.h.c.b r6 = r6.mo18300d(r7)
            r6.mo18294D(r3)
            com.facebook.react.f0.b.a r3 = r11.f8616A
            if (r3 == 0) goto L_0x0179
            android.net.Uri r3 = r3.mo9021e()
            e.e.k.o.c r3 = p174e.p247e.p294k.p311o.C6388c.m24438s(r3)
            e.e.k.o.c r2 = r3.mo18946A(r2)
            e.e.k.o.c r0 = r2.mo18950E(r0)
            e.e.k.o.c r0 = r0.mo18973t(r5)
            boolean r2 = r11.f8638W
            e.e.k.o.c r0 = r0.mo18947B(r2)
            e.e.k.o.b r0 = r0.mo18956a()
            e.e.h.c.b r2 = r11.f8629N
            r2.mo18295E(r0)
        L_0x0179:
            com.facebook.react.views.image.g r0 = r11.f8633R
            if (r0 == 0) goto L_0x0196
            e.e.h.c.d r2 = r11.f8634S
            if (r2 == 0) goto L_0x0196
            e.e.h.c.f r0 = new e.e.h.c.f
            r0.<init>()
            com.facebook.react.views.image.g r2 = r11.f8633R
            r0.mo18321b(r2)
            e.e.h.c.d r2 = r11.f8634S
            r0.mo18321b(r2)
        L_0x0190:
            e.e.h.c.b r2 = r11.f8629N
            r2.mo18293C(r0)
            goto L_0x01a3
        L_0x0196:
            e.e.h.c.d r2 = r11.f8634S
            if (r2 == 0) goto L_0x01a0
            e.e.h.c.b r0 = r11.f8629N
            r0.mo18293C(r2)
            goto L_0x01a3
        L_0x01a0:
            if (r0 == 0) goto L_0x01a3
            goto L_0x0190
        L_0x01a3:
            com.facebook.react.views.image.g r0 = r11.f8633R
            if (r0 == 0) goto L_0x01aa
            r1.mo18456C(r0)
        L_0x01aa:
            e.e.h.c.b r0 = r11.f8629N
            e.e.h.c.a r0 = r0.mo18299b()
            r11.setController(r0)
            r11.f8628M = r4
            e.e.h.c.b r0 = r11.f8629N
            r0.mo18318z()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.image.C3106h.mo9967s():void");
    }

    public void setBackgroundColor(int i) {
        if (this.f8620E != i) {
            this.f8620E = i;
            this.f8619D = new C6198l(i);
            this.f8628M = true;
        }
    }

    public void setBlurRadius(float f) {
        int c = ((int) C3038r.m12006c(f)) / 2;
        if (c == 0) {
            this.f8632Q = null;
        } else {
            this.f8632Q = new C6382a(2, c);
        }
        this.f8628M = true;
    }

    public void setBorderColor(int i) {
        if (this.f8621F != i) {
            this.f8621F = i;
            this.f8628M = true;
        }
    }

    public void setBorderRadius(float f) {
        if (!C2939e.m11588a(this.f8624I, f)) {
            this.f8624I = f;
            this.f8628M = true;
        }
    }

    public void setBorderWidth(float f) {
        float c = C3038r.m12006c(f);
        if (!C2939e.m11588a(this.f8623H, c)) {
            this.f8623H = c;
            this.f8628M = true;
        }
    }

    public void setControllerListener(C6179d dVar) {
        this.f8634S = dVar;
        this.f8628M = true;
        mo9967s();
    }

    public void setDefaultSource(String str) {
        Drawable b = C2762c.m11073a().mo9027b(getContext(), str);
        if (!C6058j.m22825a(this.f8617B, b)) {
            this.f8617B = b;
            this.f8628M = true;
        }
    }

    public void setFadeDuration(int i) {
        this.f8637V = i;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.f8639a0 = readableMap;
    }

    public void setLoadingIndicatorSource(String str) {
        Drawable b = C2762c.m11073a().mo9027b(getContext(), str);
        C6187b bVar = b != null ? new C6187b(b, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) : null;
        if (!C6058j.m22825a(this.f8618C, bVar)) {
            this.f8618C = bVar;
            this.f8628M = true;
        }
    }

    public void setOverlayColor(int i) {
        if (this.f8622G != i) {
            this.f8622G = i;
            this.f8628M = true;
        }
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.f8638W = z;
    }

    public void setResizeMethod(C3099c cVar) {
        if (this.f8640x != cVar) {
            this.f8640x = cVar;
            this.f8628M = true;
        }
    }

    public void setScaleType(C6205q.C6207b bVar) {
        if (this.f8626K != bVar) {
            this.f8626K = bVar;
            this.f8628M = true;
        }
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        if (z != (this.f8633R != null)) {
            if (!z) {
                this.f8633R = null;
            } else {
                this.f8633R = new C3107a(C3051u0.m12085b((ReactContext) getContext(), getId()));
            }
            this.f8628M = true;
        }
    }

    public void setSource(ReadableArray readableArray) {
        LinkedList<C2758a> linkedList = new LinkedList<>();
        if (readableArray == null || readableArray.size() == 0) {
            linkedList.add(new C2758a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        } else {
            if (readableArray.size() == 1) {
                String string = readableArray.getMap(0).getString("uri");
                C2758a aVar = new C2758a(getContext(), string);
                linkedList.add(aVar);
                if (Uri.EMPTY.equals(aVar.mo9021e())) {
                    m12232x(string);
                }
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map = readableArray.getMap(i);
                    String string2 = map.getString("uri");
                    C2758a aVar2 = new C2758a(getContext(), string2, map.getDouble("width"), map.getDouble("height"));
                    linkedList.add(aVar2);
                    if (Uri.EMPTY.equals(aVar2.mo9021e())) {
                        m12232x(string2);
                    }
                }
            }
        }
        if (!this.f8641y.equals(linkedList)) {
            this.f8641y.clear();
            for (C2758a add : linkedList) {
                this.f8641y.add(add);
            }
            this.f8628M = true;
        }
    }

    public void setTileMode(Shader.TileMode tileMode) {
        if (this.f8627L != tileMode) {
            this.f8627L = tileMode;
            this.f8628M = true;
        }
    }

    /* renamed from: t */
    public void mo9985t(float f, int i) {
        if (this.f8625J == null) {
            float[] fArr = new float[4];
            this.f8625J = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (!C2939e.m11588a(this.f8625J[i], f)) {
            this.f8625J[i] = f;
            this.f8628M = true;
        }
    }

    /* renamed from: w */
    public void mo9986w(Object obj) {
        if (!C6058j.m22825a(this.f8636U, obj)) {
            this.f8636U = obj;
            this.f8628M = true;
        }
    }
}
