package p027c.p064i.p072j;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.util.C1173d;
import androidx.core.util.C1177h;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p027c.p064i.p065d.C1828b;

/* renamed from: c.i.j.e0 */
public class C1929e0 {

    /* renamed from: a */
    public static final C1929e0 f5639a = (Build.VERSION.SDK_INT >= 30 ? C1940k.f5670r : C1941l.f5671a);

    /* renamed from: b */
    private final C1941l f5640b;

    /* renamed from: c.i.j.e0$a */
    static class C1930a {

        /* renamed from: a */
        private static Field f5641a;

        /* renamed from: b */
        private static Field f5642b;

        /* renamed from: c */
        private static Field f5643c;

        /* renamed from: d */
        private static boolean f5644d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f5641a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f5642b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f5643c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public static C1929e0 m8078a(View view) {
            if (f5644d && view.isAttachedToWindow()) {
                try {
                    Object obj = f5641a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f5642b.get(obj);
                        Rect rect2 = (Rect) f5643c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            C1929e0 a = new C1931b().mo6503c(C1828b.m7762c(rect)).mo6504d(C1828b.m7762c(rect2)).mo6501a();
                            a.mo6498r(a);
                            a.mo6483d(view.getRootView());
                            return a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* renamed from: c.i.j.e0$b */
    public static final class C1931b {

        /* renamed from: a */
        private final C1935f f5645a;

        public C1931b() {
            int i = Build.VERSION.SDK_INT;
            this.f5645a = i >= 30 ? new C1934e() : i >= 29 ? new C1933d() : i >= 20 ? new C1932c() : new C1935f();
        }

        public C1931b(C1929e0 e0Var) {
            int i = Build.VERSION.SDK_INT;
            this.f5645a = i >= 30 ? new C1934e(e0Var) : i >= 29 ? new C1933d(e0Var) : i >= 20 ? new C1932c(e0Var) : new C1935f(e0Var);
        }

        /* renamed from: a */
        public C1929e0 mo6501a() {
            return this.f5645a.mo6505b();
        }

        /* renamed from: b */
        public C1931b mo6502b(int i, C1828b bVar) {
            this.f5645a.mo6511c(i, bVar);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C1931b mo6503c(C1828b bVar) {
            this.f5645a.mo6506e(bVar);
            return this;
        }

        @Deprecated
        /* renamed from: d */
        public C1931b mo6504d(C1828b bVar) {
            this.f5645a.mo6507g(bVar);
            return this;
        }
    }

    /* renamed from: c.i.j.e0$c */
    private static class C1932c extends C1935f {

        /* renamed from: c */
        private static Field f5646c = null;

        /* renamed from: d */
        private static boolean f5647d = false;

        /* renamed from: e */
        private static Constructor<WindowInsets> f5648e = null;

        /* renamed from: f */
        private static boolean f5649f = false;

        /* renamed from: g */
        private WindowInsets f5650g;

        /* renamed from: h */
        private C1828b f5651h;

        C1932c() {
            this.f5650g = m8083i();
        }

        C1932c(C1929e0 e0Var) {
            super(e0Var);
            this.f5650g = e0Var.mo6500t();
        }

        /* renamed from: i */
        private static WindowInsets m8083i() {
            if (!f5647d) {
                try {
                    f5646c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f5647d = true;
            }
            Field field = f5646c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f5649f) {
                try {
                    f5648e = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f5649f = true;
            }
            Constructor<WindowInsets> constructor = f5648e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1929e0 mo6505b() {
            mo6512a();
            C1929e0 u = C1929e0.m8057u(this.f5650g);
            u.mo6496p(this.f5654b);
            u.mo6499s(this.f5651h);
            return u;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6506e(C1828b bVar) {
            this.f5651h = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo6507g(C1828b bVar) {
            WindowInsets windowInsets = this.f5650g;
            if (windowInsets != null) {
                this.f5650g = windowInsets.replaceSystemWindowInsets(bVar.f5455b, bVar.f5456c, bVar.f5457d, bVar.f5458e);
            }
        }
    }

    /* renamed from: c.i.j.e0$d */
    private static class C1933d extends C1935f {

        /* renamed from: c */
        final WindowInsets.Builder f5652c;

        C1933d() {
            this.f5652c = new WindowInsets.Builder();
        }

        C1933d(C1929e0 e0Var) {
            super(e0Var);
            WindowInsets.Builder builder;
            WindowInsets t = e0Var.mo6500t();
            if (t == null) {
                builder = new WindowInsets.Builder();
            }
            this.f5652c = builder;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1929e0 mo6505b() {
            mo6512a();
            C1929e0 u = C1929e0.m8057u(this.f5652c.build());
            u.mo6496p(this.f5654b);
            return u;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6508d(C1828b bVar) {
            this.f5652c.setMandatorySystemGestureInsets(bVar.mo6322e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6506e(C1828b bVar) {
            this.f5652c.setStableInsets(bVar.mo6322e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo6509f(C1828b bVar) {
            this.f5652c.setSystemGestureInsets(bVar.mo6322e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo6507g(C1828b bVar) {
            this.f5652c.setSystemWindowInsets(bVar.mo6322e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo6510h(C1828b bVar) {
            this.f5652c.setTappableElementInsets(bVar.mo6322e());
        }
    }

    /* renamed from: c.i.j.e0$e */
    private static class C1934e extends C1933d {
        C1934e() {
        }

        C1934e(C1929e0 e0Var) {
            super(e0Var);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6511c(int i, C1828b bVar) {
            this.f5652c.setInsets(C1943n.m8154a(i), bVar.mo6322e());
        }
    }

    /* renamed from: c.i.j.e0$f */
    private static class C1935f {

        /* renamed from: a */
        private final C1929e0 f5653a;

        /* renamed from: b */
        C1828b[] f5654b;

        C1935f() {
            this(new C1929e0((C1929e0) null));
        }

        C1935f(C1929e0 e0Var) {
            this.f5653a = e0Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo6512a() {
            C1828b[] bVarArr = this.f5654b;
            if (bVarArr != null) {
                C1828b bVar = bVarArr[C1942m.m8150b(1)];
                C1828b bVar2 = this.f5654b[C1942m.m8150b(2)];
                if (bVar2 == null) {
                    bVar2 = this.f5653a.mo6486f(2);
                }
                if (bVar == null) {
                    bVar = this.f5653a.mo6486f(1);
                }
                mo6507g(C1828b.m7760a(bVar, bVar2));
                C1828b bVar3 = this.f5654b[C1942m.m8150b(16)];
                if (bVar3 != null) {
                    mo6509f(bVar3);
                }
                C1828b bVar4 = this.f5654b[C1942m.m8150b(32)];
                if (bVar4 != null) {
                    mo6508d(bVar4);
                }
                C1828b bVar5 = this.f5654b[C1942m.m8150b(64)];
                if (bVar5 != null) {
                    mo6510h(bVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1929e0 mo6505b() {
            mo6512a();
            return this.f5653a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6511c(int i, C1828b bVar) {
            if (this.f5654b == null) {
                this.f5654b = new C1828b[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f5654b[C1942m.m8150b(i2)] = bVar;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6508d(C1828b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6506e(C1828b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo6509f(C1828b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo6507g(C1828b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo6510h(C1828b bVar) {
        }
    }

    /* renamed from: c.i.j.e0$g */
    private static class C1936g extends C1941l {

        /* renamed from: c */
        private static boolean f5655c = false;

        /* renamed from: d */
        private static Method f5656d;

        /* renamed from: e */
        private static Class<?> f5657e;

        /* renamed from: f */
        private static Class<?> f5658f;

        /* renamed from: g */
        private static Field f5659g;

        /* renamed from: h */
        private static Field f5660h;

        /* renamed from: i */
        final WindowInsets f5661i;

        /* renamed from: j */
        private C1828b[] f5662j;

        /* renamed from: k */
        private C1828b f5663k;

        /* renamed from: l */
        private C1929e0 f5664l;

        /* renamed from: m */
        C1828b f5665m;

        C1936g(C1929e0 e0Var, WindowInsets windowInsets) {
            super(e0Var);
            this.f5663k = null;
            this.f5661i = windowInsets;
        }

        C1936g(C1929e0 e0Var, C1936g gVar) {
            this(e0Var, new WindowInsets(gVar.f5661i));
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private C1828b m8102t(int i, boolean z) {
            C1828b bVar = C1828b.f5454a;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    bVar = C1828b.m7760a(bVar, mo6523u(i2, z));
                }
            }
            return bVar;
        }

        /* renamed from: v */
        private C1828b m8103v() {
            C1929e0 e0Var = this.f5664l;
            return e0Var != null ? e0Var.mo6487g() : C1828b.f5454a;
        }

        /* renamed from: w */
        private C1828b m8104w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f5655c) {
                    m8105x();
                }
                Method method = f5656d;
                if (!(method == null || f5658f == null || f5659g == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f5659g.get(f5660h.get(invoke));
                        if (rect != null) {
                            return C1828b.m7762c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: x */
        private static void m8105x() {
            try {
                f5656d = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f5657e = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f5658f = cls;
                f5659g = cls.getDeclaredField("mVisibleInsets");
                f5660h = f5657e.getDeclaredField("mAttachInfo");
                f5659g.setAccessible(true);
                f5660h.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f5655c = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6513d(View view) {
            C1828b w = m8104w(view);
            if (w == null) {
                w = C1828b.f5454a;
            }
            mo6521q(w);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6514e(C1929e0 e0Var) {
            e0Var.mo6498r(this.f5664l);
            e0Var.mo6497q(this.f5665m);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f5665m, ((C1936g) obj).f5665m);
        }

        /* renamed from: g */
        public C1828b mo6516g(int i) {
            return m8102t(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public final C1828b mo6517k() {
            if (this.f5663k == null) {
                this.f5663k = C1828b.m7761b(this.f5661i.getSystemWindowInsetLeft(), this.f5661i.getSystemWindowInsetTop(), this.f5661i.getSystemWindowInsetRight(), this.f5661i.getSystemWindowInsetBottom());
            }
            return this.f5663k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C1929e0 mo6518m(int i, int i2, int i3, int i4) {
            C1931b bVar = new C1931b(C1929e0.m8057u(this.f5661i));
            bVar.mo6504d(C1929e0.m8056m(mo6517k(), i, i2, i3, i4));
            bVar.mo6503c(C1929e0.m8056m(mo6526i(), i, i2, i3, i4));
            return bVar.mo6501a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo6519o() {
            return this.f5661i.isRound();
        }

        /* renamed from: p */
        public void mo6520p(C1828b[] bVarArr) {
            this.f5662j = bVarArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo6521q(C1828b bVar) {
            this.f5665m = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo6522r(C1929e0 e0Var) {
            this.f5664l = e0Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public C1828b mo6523u(int i, boolean z) {
            int i2;
            if (i == 1) {
                return z ? C1828b.m7761b(0, Math.max(m8103v().f5456c, mo6517k().f5456c), 0, 0) : C1828b.m7761b(0, mo6517k().f5456c, 0, 0);
            }
            C1828b bVar = null;
            if (i != 2) {
                if (i == 8) {
                    C1828b[] bVarArr = this.f5662j;
                    if (bVarArr != null) {
                        bVar = bVarArr[C1942m.m8150b(8)];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    C1828b k = mo6517k();
                    C1828b v = m8103v();
                    int i3 = k.f5458e;
                    if (i3 > v.f5458e) {
                        return C1828b.m7761b(0, 0, 0, i3);
                    }
                    C1828b bVar2 = this.f5665m;
                    return (bVar2 == null || bVar2.equals(C1828b.f5454a) || (i2 = this.f5665m.f5458e) <= v.f5458e) ? C1828b.f5454a : C1828b.m7761b(0, 0, 0, i2);
                } else if (i == 16) {
                    return mo6533j();
                } else {
                    if (i == 32) {
                        return mo6532h();
                    }
                    if (i == 64) {
                        return mo6534l();
                    }
                    if (i != 128) {
                        return C1828b.f5454a;
                    }
                    C1929e0 e0Var = this.f5664l;
                    C1911c e = e0Var != null ? e0Var.mo6484e() : mo6530f();
                    return e != null ? C1828b.m7761b(e.mo6451b(), e.mo6453d(), e.mo6452c(), e.mo6450a()) : C1828b.f5454a;
                }
            } else if (z) {
                C1828b v2 = m8103v();
                C1828b i4 = mo6526i();
                return C1828b.m7761b(Math.max(v2.f5455b, i4.f5455b), 0, Math.max(v2.f5457d, i4.f5457d), Math.max(v2.f5458e, i4.f5458e));
            } else {
                C1828b k2 = mo6517k();
                C1929e0 e0Var2 = this.f5664l;
                if (e0Var2 != null) {
                    bVar = e0Var2.mo6487g();
                }
                int i5 = k2.f5458e;
                if (bVar != null) {
                    i5 = Math.min(i5, bVar.f5458e);
                }
                return C1828b.m7761b(k2.f5455b, 0, k2.f5457d, i5);
            }
        }
    }

    /* renamed from: c.i.j.e0$h */
    private static class C1937h extends C1936g {

        /* renamed from: n */
        private C1828b f5666n = null;

        C1937h(C1929e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        C1937h(C1929e0 e0Var, C1937h hVar) {
            super(e0Var, (C1936g) hVar);
            this.f5666n = hVar.f5666n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1929e0 mo6524b() {
            return C1929e0.m8057u(this.f5661i.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1929e0 mo6525c() {
            return C1929e0.m8057u(this.f5661i.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final C1828b mo6526i() {
            if (this.f5666n == null) {
                this.f5666n = C1828b.m7761b(this.f5661i.getStableInsetLeft(), this.f5661i.getStableInsetTop(), this.f5661i.getStableInsetRight(), this.f5661i.getStableInsetBottom());
            }
            return this.f5666n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo6527n() {
            return this.f5661i.isConsumed();
        }

        /* renamed from: s */
        public void mo6528s(C1828b bVar) {
            this.f5666n = bVar;
        }
    }

    /* renamed from: c.i.j.e0$i */
    private static class C1938i extends C1937h {
        C1938i(C1929e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        C1938i(C1929e0 e0Var, C1938i iVar) {
            super(e0Var, (C1937h) iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1929e0 mo6529a() {
            return C1929e0.m8057u(this.f5661i.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1938i)) {
                return false;
            }
            C1938i iVar = (C1938i) obj;
            return Objects.equals(this.f5661i, iVar.f5661i) && Objects.equals(this.f5665m, iVar.f5665m);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C1911c mo6530f() {
            return C1911c.m8003e(this.f5661i.getDisplayCutout());
        }

        public int hashCode() {
            return this.f5661i.hashCode();
        }
    }

    /* renamed from: c.i.j.e0$j */
    private static class C1939j extends C1938i {

        /* renamed from: o */
        private C1828b f5667o = null;

        /* renamed from: p */
        private C1828b f5668p = null;

        /* renamed from: q */
        private C1828b f5669q = null;

        C1939j(C1929e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        C1939j(C1929e0 e0Var, C1939j jVar) {
            super(e0Var, (C1938i) jVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C1828b mo6532h() {
            if (this.f5668p == null) {
                this.f5668p = C1828b.m7763d(this.f5661i.getMandatorySystemGestureInsets());
            }
            return this.f5668p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C1828b mo6533j() {
            if (this.f5667o == null) {
                this.f5667o = C1828b.m7763d(this.f5661i.getSystemGestureInsets());
            }
            return this.f5667o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C1828b mo6534l() {
            if (this.f5669q == null) {
                this.f5669q = C1828b.m7763d(this.f5661i.getTappableElementInsets());
            }
            return this.f5669q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C1929e0 mo6518m(int i, int i2, int i3, int i4) {
            return C1929e0.m8057u(this.f5661i.inset(i, i2, i3, i4));
        }

        /* renamed from: s */
        public void mo6528s(C1828b bVar) {
        }
    }

    /* renamed from: c.i.j.e0$k */
    private static class C1940k extends C1939j {

        /* renamed from: r */
        static final C1929e0 f5670r = C1929e0.m8057u(WindowInsets.CONSUMED);

        C1940k(C1929e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        C1940k(C1929e0 e0Var, C1940k kVar) {
            super(e0Var, (C1939j) kVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo6513d(View view) {
        }

        /* renamed from: g */
        public C1828b mo6516g(int i) {
            return C1828b.m7763d(this.f5661i.getInsets(C1943n.m8154a(i)));
        }
    }

    /* renamed from: c.i.j.e0$l */
    private static class C1941l {

        /* renamed from: a */
        static final C1929e0 f5671a = new C1931b().mo6501a().mo6480a().mo6481b().mo6482c();

        /* renamed from: b */
        final C1929e0 f5672b;

        C1941l(C1929e0 e0Var) {
            this.f5672b = e0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1929e0 mo6529a() {
            return this.f5672b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C1929e0 mo6524b() {
            return this.f5672b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C1929e0 mo6525c() {
            return this.f5672b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6513d(View view) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6514e(C1929e0 e0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1941l)) {
                return false;
            }
            C1941l lVar = (C1941l) obj;
            return mo6519o() == lVar.mo6519o() && mo6527n() == lVar.mo6527n() && C1173d.m4572a(mo6517k(), lVar.mo6517k()) && C1173d.m4572a(mo6526i(), lVar.mo6526i()) && C1173d.m4572a(mo6530f(), lVar.mo6530f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C1911c mo6530f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C1828b mo6516g(int i) {
            return C1828b.f5454a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C1828b mo6532h() {
            return mo6517k();
        }

        public int hashCode() {
            return C1173d.m4573b(Boolean.valueOf(mo6519o()), Boolean.valueOf(mo6527n()), mo6517k(), mo6526i(), mo6530f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C1828b mo6526i() {
            return C1828b.f5454a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C1828b mo6533j() {
            return mo6517k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C1828b mo6517k() {
            return C1828b.f5454a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C1828b mo6534l() {
            return mo6517k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C1929e0 mo6518m(int i, int i2, int i3, int i4) {
            return f5671a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo6527n() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo6519o() {
            return false;
        }

        /* renamed from: p */
        public void mo6520p(C1828b[] bVarArr) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo6521q(C1828b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo6522r(C1929e0 e0Var) {
        }

        /* renamed from: s */
        public void mo6528s(C1828b bVar) {
        }
    }

    /* renamed from: c.i.j.e0$m */
    public static final class C1942m {
        /* renamed from: a */
        public static int m8149a() {
            return 8;
        }

        /* renamed from: b */
        static int m8150b(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        /* renamed from: c */
        public static int m8151c() {
            return 2;
        }

        /* renamed from: d */
        public static int m8152d() {
            return 1;
        }

        /* renamed from: e */
        public static int m8153e() {
            return 7;
        }
    }

    /* renamed from: c.i.j.e0$n */
    private static final class C1943n {
        /* renamed from: a */
        static int m8154a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    private C1929e0(WindowInsets windowInsets) {
        C1941l gVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            gVar = new C1940k(this, windowInsets);
        } else if (i >= 29) {
            gVar = new C1939j(this, windowInsets);
        } else if (i >= 28) {
            gVar = new C1938i(this, windowInsets);
        } else if (i >= 21) {
            gVar = new C1937h(this, windowInsets);
        } else if (i >= 20) {
            gVar = new C1936g(this, windowInsets);
        } else {
            this.f5640b = new C1941l(this);
            return;
        }
        this.f5640b = gVar;
    }

    public C1929e0(C1929e0 e0Var) {
        if (e0Var != null) {
            C1941l lVar = e0Var.f5640b;
            int i = Build.VERSION.SDK_INT;
            this.f5640b = (i < 30 || !(lVar instanceof C1940k)) ? (i < 29 || !(lVar instanceof C1939j)) ? (i < 28 || !(lVar instanceof C1938i)) ? (i < 21 || !(lVar instanceof C1937h)) ? (i < 20 || !(lVar instanceof C1936g)) ? new C1941l(this) : new C1936g(this, (C1936g) lVar) : new C1937h(this, (C1937h) lVar) : new C1938i(this, (C1938i) lVar) : new C1939j(this, (C1939j) lVar) : new C1940k(this, (C1940k) lVar);
            lVar.mo6514e(this);
            return;
        }
        this.f5640b = new C1941l(this);
    }

    /* renamed from: m */
    static C1828b m8056m(C1828b bVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bVar.f5455b - i);
        int max2 = Math.max(0, bVar.f5456c - i2);
        int max3 = Math.max(0, bVar.f5457d - i3);
        int max4 = Math.max(0, bVar.f5458e - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? bVar : C1828b.m7761b(max, max2, max3, max4);
    }

    /* renamed from: u */
    public static C1929e0 m8057u(WindowInsets windowInsets) {
        return m8058v(windowInsets, (View) null);
    }

    /* renamed from: v */
    public static C1929e0 m8058v(WindowInsets windowInsets, View view) {
        C1929e0 e0Var = new C1929e0((WindowInsets) C1177h.m4583e(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            e0Var.mo6498r(C1988t.m8343F(view));
            e0Var.mo6483d(view.getRootView());
        }
        return e0Var;
    }

    @Deprecated
    /* renamed from: a */
    public C1929e0 mo6480a() {
        return this.f5640b.mo6529a();
    }

    @Deprecated
    /* renamed from: b */
    public C1929e0 mo6481b() {
        return this.f5640b.mo6524b();
    }

    @Deprecated
    /* renamed from: c */
    public C1929e0 mo6482c() {
        return this.f5640b.mo6525c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6483d(View view) {
        this.f5640b.mo6513d(view);
    }

    /* renamed from: e */
    public C1911c mo6484e() {
        return this.f5640b.mo6530f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1929e0)) {
            return false;
        }
        return C1173d.m4572a(this.f5640b, ((C1929e0) obj).f5640b);
    }

    /* renamed from: f */
    public C1828b mo6486f(int i) {
        return this.f5640b.mo6516g(i);
    }

    @Deprecated
    /* renamed from: g */
    public C1828b mo6487g() {
        return this.f5640b.mo6526i();
    }

    @Deprecated
    /* renamed from: h */
    public int mo6488h() {
        return this.f5640b.mo6517k().f5458e;
    }

    public int hashCode() {
        C1941l lVar = this.f5640b;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int mo6490i() {
        return this.f5640b.mo6517k().f5455b;
    }

    @Deprecated
    /* renamed from: j */
    public int mo6491j() {
        return this.f5640b.mo6517k().f5457d;
    }

    @Deprecated
    /* renamed from: k */
    public int mo6492k() {
        return this.f5640b.mo6517k().f5456c;
    }

    /* renamed from: l */
    public C1929e0 mo6493l(int i, int i2, int i3, int i4) {
        return this.f5640b.mo6518m(i, i2, i3, i4);
    }

    /* renamed from: n */
    public boolean mo6494n() {
        return this.f5640b.mo6527n();
    }

    @Deprecated
    /* renamed from: o */
    public C1929e0 mo6495o(int i, int i2, int i3, int i4) {
        return new C1931b(this).mo6504d(C1828b.m7761b(i, i2, i3, i4)).mo6501a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6496p(C1828b[] bVarArr) {
        this.f5640b.mo6520p(bVarArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo6497q(C1828b bVar) {
        this.f5640b.mo6521q(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo6498r(C1929e0 e0Var) {
        this.f5640b.mo6522r(e0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo6499s(C1828b bVar) {
        this.f5640b.mo6528s(bVar);
    }

    /* renamed from: t */
    public WindowInsets mo6500t() {
        C1941l lVar = this.f5640b;
        if (lVar instanceof C1936g) {
            return ((C1936g) lVar).f5661i;
        }
        return null;
    }
}
