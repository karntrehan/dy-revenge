package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.C1135a;
import androidx.core.graphics.drawable.C1164a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p027c.p028a.p031l.p032a.C1447a;
import p027c.p028a.p033m.C1462a;
import p027c.p060f.C1793d;
import p027c.p060f.C1794e;
import p027c.p060f.C1801g;
import p027c.p060f.C1802h;
import p027c.p101w.p102a.p103a.C2229b;
import p027c.p101w.p102a.p103a.C2239h;

/* renamed from: androidx.appcompat.widget.m0 */
public final class C0247m0 {

    /* renamed from: a */
    private static final PorterDuff.Mode f1070a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0247m0 f1071b;

    /* renamed from: c */
    private static final C0250c f1072c = new C0250c(6);

    /* renamed from: d */
    private WeakHashMap<Context, C1802h<ColorStateList>> f1073d;

    /* renamed from: e */
    private C1801g<String, C0251d> f1074e;

    /* renamed from: f */
    private C1802h<String> f1075f;

    /* renamed from: g */
    private final WeakHashMap<Context, C1793d<WeakReference<Drawable.ConstantState>>> f1076g = new WeakHashMap<>(0);

    /* renamed from: h */
    private TypedValue f1077h;

    /* renamed from: i */
    private boolean f1078i;

    /* renamed from: j */
    private C0252e f1079j;

    /* renamed from: androidx.appcompat.widget.m0$a */
    static class C0248a implements C0251d {
        C0248a() {
        }

        /* renamed from: a */
        public Drawable mo1522a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1447a.m6450m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$b */
    private static class C0249b implements C0251d {
        C0249b() {
        }

        /* renamed from: a */
        public Drawable mo1522a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C2229b.m9421a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$c */
    private static class C0250c extends C1794e<Integer, PorterDuffColorFilter> {
        public C0250c(int i) {
            super(i);
        }

        /* renamed from: j */
        private static int m1269j(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public PorterDuffColorFilter mo1523k(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) mo6177c(Integer.valueOf(m1269j(i, mode)));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public PorterDuffColorFilter mo1524l(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo6178d(Integer.valueOf(m1269j(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.m0$d */
    private interface C0251d {
        /* renamed from: a */
        Drawable mo1522a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.m0$e */
    interface C0252e {
        /* renamed from: a */
        boolean mo1446a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        PorterDuff.Mode mo1447b(int i);

        /* renamed from: c */
        Drawable mo1448c(C0247m0 m0Var, Context context, int i);

        /* renamed from: d */
        ColorStateList mo1449d(Context context, int i);

        /* renamed from: e */
        boolean mo1450e(Context context, int i, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.m0$f */
    private static class C0253f implements C0251d {
        C0253f() {
        }

        /* renamed from: a */
        public Drawable mo1522a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C2239h.m9454c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m1243a(String str, C0251d dVar) {
        if (this.f1074e == null) {
            this.f1074e = new C1801g<>();
        }
        this.f1074e.put(str, dVar);
    }

    /* renamed from: b */
    private synchronized boolean m1244b(Context context, long j, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C1793d dVar = this.f1076g.get(context);
            if (dVar == null) {
                dVar = new C1793d();
                this.f1076g.put(context, dVar);
            }
            dVar.mo6169m(j, new WeakReference(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private void m1245c(Context context, int i, ColorStateList colorStateList) {
        if (this.f1073d == null) {
            this.f1073d = new WeakHashMap<>();
        }
        C1802h hVar = this.f1073d.get(context);
        if (hVar == null) {
            hVar = new C1802h();
            this.f1073d.put(context, hVar);
        }
        hVar.mo6272c(i, colorStateList);
    }

    /* renamed from: d */
    private void m1246d(Context context) {
        if (!this.f1078i) {
            this.f1078i = true;
            Drawable j = mo1514j(context, C1462a.abc_vector_test);
            if (j == null || !m1255q(j)) {
                this.f1078i = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: e */
    private static long m1247e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: f */
    private Drawable m1248f(Context context, int i) {
        if (this.f1077h == null) {
            this.f1077h = new TypedValue();
        }
        TypedValue typedValue = this.f1077h;
        context.getResources().getValue(i, typedValue, true);
        long e = m1247e(typedValue);
        Drawable i2 = m1251i(context, e);
        if (i2 != null) {
            return i2;
        }
        C0252e eVar = this.f1079j;
        Drawable c = eVar == null ? null : eVar.mo1448c(this, context, i);
        if (c != null) {
            c.setChangingConfigurations(typedValue.changingConfigurations);
            m1244b(context, e, c);
        }
        return c;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m1249g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1252l(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: h */
    public static synchronized C0247m0 m1250h() {
        C0247m0 m0Var;
        synchronized (C0247m0.class) {
            if (f1071b == null) {
                C0247m0 m0Var2 = new C0247m0();
                f1071b = m0Var2;
                m1254p(m0Var2);
            }
            m0Var = f1071b;
        }
        return m0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m1251i(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, c.f.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1076g     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            c.f.d r0 = (p027c.p060f.C1793d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo6165i(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo6170n(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0247m0.m1251i(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m1252l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter k;
        synchronized (C0247m0.class) {
            C0250c cVar = f1072c;
            k = cVar.mo1523k(i, mode);
            if (k == null) {
                k = new PorterDuffColorFilter(i, mode);
                cVar.mo1524l(i, mode, k);
            }
        }
        return k;
    }

    /* renamed from: n */
    private ColorStateList m1253n(Context context, int i) {
        C1802h hVar;
        WeakHashMap<Context, C1802h<ColorStateList>> weakHashMap = this.f1073d;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) hVar.mo6276g(i);
    }

    /* renamed from: p */
    private static void m1254p(C0247m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.m1243a("vector", new C0253f());
            m0Var.m1243a("animated-vector", new C0249b());
            m0Var.m1243a("animated-selector", new C0248a());
        }
    }

    /* renamed from: q */
    private static boolean m1255q(Drawable drawable) {
        return (drawable instanceof C2239h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1256r(android.content.Context r11, int r12) {
        /*
            r10 = this;
            c.f.g<java.lang.String, androidx.appcompat.widget.m0$d> r0 = r10.f1074e
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            c.f.h<java.lang.String> r0 = r10.f1075f
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo6276g(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            c.f.g<java.lang.String, androidx.appcompat.widget.m0$d> r3 = r10.f1074e
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            c.f.h r0 = new c.f.h
            r0.<init>()
            r10.f1075f = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1077h
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1077h = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1077h
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m1247e(r0)
            android.graphics.drawable.Drawable r6 = r10.m1251i(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            c.f.h<java.lang.String> r8 = r10.f1075f     // Catch:{ Exception -> 0x00a2 }
            r8.mo6272c(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            c.f.g<java.lang.String, androidx.appcompat.widget.m0$d> r8 = r10.f1074e     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.m0$d r3 = (androidx.appcompat.widget.C0247m0.C0251d) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo1522a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m1244b(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            c.f.h<java.lang.String> r11 = r10.f1075f
            r11.mo6272c(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0247m0.m1256r(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: v */
    private Drawable m1257v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m = mo1516m(context, i);
        if (m != null) {
            if (C0215e0.m1117a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = C1164a.m4554r(drawable);
            C1164a.m4551o(r, m);
            PorterDuff.Mode o = mo1517o(i);
            if (o == null) {
                return r;
            }
            C1164a.m4552p(r, o);
            return r;
        }
        C0252e eVar = this.f1079j;
        if ((eVar == null || !eVar.mo1450e(context, i, drawable)) && !mo1521x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* renamed from: w */
    static void m1258w(Drawable drawable, C0277v0 v0Var, int[] iArr) {
        if (!C0215e0.m1117a(drawable) || drawable.mutate() == drawable) {
            boolean z = v0Var.f1211d;
            if (z || v0Var.f1210c) {
                drawable.setColorFilter(m1249g(z ? v0Var.f1208a : null, v0Var.f1210c ? v0Var.f1209b : f1070a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: j */
    public synchronized Drawable mo1514j(Context context, int i) {
        return mo1515k(context, i, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable mo1515k(Context context, int i, boolean z) {
        Drawable r;
        m1246d(context);
        r = m1256r(context, i);
        if (r == null) {
            r = m1248f(context, i);
        }
        if (r == null) {
            r = C1135a.m4419e(context, i);
        }
        if (r != null) {
            r = m1257v(context, i, z, r);
        }
        if (r != null) {
            C0215e0.m1118b(r);
        }
        return r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList mo1516m(Context context, int i) {
        ColorStateList n;
        n = m1253n(context, i);
        if (n == null) {
            C0252e eVar = this.f1079j;
            n = eVar == null ? null : eVar.mo1449d(context, i);
            if (n != null) {
                m1245c(context, i, n);
            }
        }
        return n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public PorterDuff.Mode mo1517o(int i) {
        C0252e eVar = this.f1079j;
        if (eVar == null) {
            return null;
        }
        return eVar.mo1447b(i);
    }

    /* renamed from: s */
    public synchronized void mo1518s(Context context) {
        C1793d dVar = this.f1076g.get(context);
        if (dVar != null) {
            dVar.mo6162d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable mo1519t(Context context, C0210c1 c1Var, int i) {
        Drawable r = m1256r(context, i);
        if (r == null) {
            r = c1Var.mo1274d(i);
        }
        if (r == null) {
            return null;
        }
        return m1257v(context, i, false, r);
    }

    /* renamed from: u */
    public synchronized void mo1520u(C0252e eVar) {
        this.f1079j = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean mo1521x(Context context, int i, Drawable drawable) {
        C0252e eVar = this.f1079j;
        return eVar != null && eVar.mo1446a(context, i, drawable);
    }
}
