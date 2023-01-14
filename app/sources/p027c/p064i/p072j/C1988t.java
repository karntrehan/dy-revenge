package p027c.p064i.p072j;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p027c.p064i.C1825b;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1916d0;
import p027c.p064i.p072j.C1929e0;
import p027c.p064i.p072j.p073g0.C1955c;
import p027c.p064i.p072j.p073g0.C1965f;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: c.i.j.t */
public class C1988t {

    /* renamed from: a */
    private static final AtomicInteger f5751a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f5752b;

    /* renamed from: c */
    private static boolean f5753c;

    /* renamed from: d */
    private static Field f5754d;

    /* renamed from: e */
    private static boolean f5755e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f5756f;

    /* renamed from: g */
    private static WeakHashMap<View, C2008y> f5757g = null;

    /* renamed from: h */
    private static Field f5758h;

    /* renamed from: i */
    private static boolean f5759i = false;

    /* renamed from: j */
    private static ThreadLocal<Rect> f5760j;

    /* renamed from: k */
    private static final int[] f5761k = {C1825b.accessibility_custom_action_0, C1825b.accessibility_custom_action_1, C1825b.accessibility_custom_action_2, C1825b.accessibility_custom_action_3, C1825b.accessibility_custom_action_4, C1825b.accessibility_custom_action_5, C1825b.accessibility_custom_action_6, C1825b.accessibility_custom_action_7, C1825b.accessibility_custom_action_8, C1825b.accessibility_custom_action_9, C1825b.accessibility_custom_action_10, C1825b.accessibility_custom_action_11, C1825b.accessibility_custom_action_12, C1825b.accessibility_custom_action_13, C1825b.accessibility_custom_action_14, C1825b.accessibility_custom_action_15, C1825b.accessibility_custom_action_16, C1825b.accessibility_custom_action_17, C1825b.accessibility_custom_action_18, C1825b.accessibility_custom_action_19, C1825b.accessibility_custom_action_20, C1825b.accessibility_custom_action_21, C1825b.accessibility_custom_action_22, C1825b.accessibility_custom_action_23, C1825b.accessibility_custom_action_24, C1825b.accessibility_custom_action_25, C1825b.accessibility_custom_action_26, C1825b.accessibility_custom_action_27, C1825b.accessibility_custom_action_28, C1825b.accessibility_custom_action_29, C1825b.accessibility_custom_action_30, C1825b.accessibility_custom_action_31};

    /* renamed from: l */
    private static final C1985q f5762l = new C1989a();

    /* renamed from: m */
    private static C1994f f5763m = new C1994f();

    /* renamed from: c.i.j.t$a */
    class C1989a implements C1985q {
        C1989a() {
        }
    }

    /* renamed from: c.i.j.t$b */
    class C1990b extends C1995g<Boolean> {
        C1990b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo6666d(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo6667e(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo6668h(Boolean bool, Boolean bool2) {
            return !mo6684a(bool, bool2);
        }
    }

    /* renamed from: c.i.j.t$c */
    class C1991c extends C1995g<CharSequence> {
        C1991c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo6666d(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo6667e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo6668h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: c.i.j.t$d */
    class C1992d extends C1995g<CharSequence> {
        C1992d(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public CharSequence mo6666d(View view) {
            return view.getStateDescription();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo6667e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo6668h(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* renamed from: c.i.j.t$e */
    class C1993e extends C1995g<Boolean> {
        C1993e(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public Boolean mo6666d(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo6667e(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public boolean mo6668h(Boolean bool, Boolean bool2) {
            return !mo6684a(bool, bool2);
        }
    }

    /* renamed from: c.i.j.t$f */
    static class C1994f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: f */
        private WeakHashMap<View, Boolean> f5764f = new WeakHashMap<>();

        C1994f() {
        }

        /* renamed from: a */
        private void m8445a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                C1988t.m8365W(view, z2 ? 16 : 32);
                this.f5764f.put(view, Boolean.valueOf(z2));
            }
        }

        /* renamed from: b */
        private void m8446b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f5764f.entrySet()) {
                    m8445a((View) next.getKey(), ((Boolean) next.getValue()).booleanValue());
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            m8446b(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: c.i.j.t$g */
    static abstract class C1995g<T> {

        /* renamed from: a */
        private final int f5765a;

        /* renamed from: b */
        private final Class<T> f5766b;

        /* renamed from: c */
        private final int f5767c;

        /* renamed from: d */
        private final int f5768d;

        C1995g(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        C1995g(int i, Class<T> cls, int i2, int i3) {
            this.f5765a = i;
            this.f5766b = cls;
            this.f5768d = i2;
            this.f5767c = i3;
        }

        /* renamed from: b */
        private boolean m8447b() {
            return Build.VERSION.SDK_INT >= 19;
        }

        /* renamed from: c */
        private boolean m8448c() {
            return Build.VERSION.SDK_INT >= this.f5767c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6684a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract T mo6666d(View view);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo6667e(View view, T t);

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public T mo6685f(View view) {
            if (m8448c()) {
                return mo6666d(view);
            }
            if (!m8447b()) {
                return null;
            }
            T tag = view.getTag(this.f5765a);
            if (this.f5766b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo6686g(View view, T t) {
            if (m8448c()) {
                mo6667e(view, t);
            } else if (m8447b() && mo6668h(mo6685f(view), t)) {
                C1988t.m8335B(view);
                view.setTag(this.f5765a, t);
                C1988t.m8365W(view, this.f5768d);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract boolean mo6668h(T t, T t2);
    }

    /* renamed from: c.i.j.t$h */
    private static class C1996h {

        /* renamed from: c.i.j.t$h$a */
        class C1997a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            C1929e0 f5769a = null;

            /* renamed from: b */
            final /* synthetic */ View f5770b;

            /* renamed from: c */
            final /* synthetic */ C1984p f5771c;

            C1997a(View view, C1984p pVar) {
                this.f5770b = view;
                this.f5771c = pVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                C1929e0 v = C1929e0.m8058v(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C1996h.m8455a(windowInsets, this.f5770b);
                    if (v.equals(this.f5769a)) {
                        return this.f5771c.mo319a(view, v).mo6500t();
                    }
                }
                this.f5769a = v;
                C1929e0 a = this.f5771c.mo319a(view, v);
                if (i >= 30) {
                    return a.mo6500t();
                }
                C1988t.m8388j0(view);
                return a.mo6500t();
            }
        }

        /* renamed from: a */
        static void m8455a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C1825b.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        /* renamed from: b */
        static C1929e0 m8456b(View view, C1929e0 e0Var, Rect rect) {
            WindowInsets t = e0Var.mo6500t();
            if (t != null) {
                return C1929e0.m8058v(view.computeSystemWindowInsets(t, rect), view);
            }
            rect.setEmpty();
            return e0Var;
        }

        /* renamed from: c */
        public static C1929e0 m8457c(View view) {
            return C1929e0.C1930a.m8078a(view);
        }

        /* renamed from: d */
        static void m8458d(View view, C1984p pVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(C1825b.tag_on_apply_window_listener, pVar);
            }
            if (pVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C1825b.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new C1997a(view, pVar));
            }
        }
    }

    /* renamed from: c.i.j.t$i */
    private static class C1998i {
        /* renamed from: a */
        public static C1929e0 m8459a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            C1929e0 u = C1929e0.m8057u(rootWindowInsets);
            u.mo6498r(u);
            u.mo6483d(view.getRootView());
            return u;
        }
    }

    /* renamed from: c.i.j.t$j */
    private static class C1999j {
        /* renamed from: a */
        static void m8460a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: c.i.j.t$k */
    public interface C2000k {
        /* renamed from: a */
        boolean mo6688a(View view, KeyEvent keyEvent);
    }

    /* renamed from: c.i.j.t$l */
    static class C2001l {

        /* renamed from: a */
        private static final ArrayList<WeakReference<View>> f5772a = new ArrayList<>();

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f5773b = null;

        /* renamed from: c */
        private SparseArray<WeakReference<View>> f5774c = null;

        /* renamed from: d */
        private WeakReference<KeyEvent> f5775d = null;

        C2001l() {
        }

        /* renamed from: a */
        static C2001l m8462a(View view) {
            int i = C1825b.tag_unhandled_key_event_manager;
            C2001l lVar = (C2001l) view.getTag(i);
            if (lVar != null) {
                return lVar;
            }
            C2001l lVar2 = new C2001l();
            view.setTag(i, lVar2);
            return lVar2;
        }

        /* renamed from: c */
        private View m8463c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f5773b;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View c = m8463c(viewGroup.getChildAt(childCount), keyEvent);
                        if (c != null) {
                            return c;
                        }
                    }
                }
                if (m8465e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* renamed from: d */
        private SparseArray<WeakReference<View>> m8464d() {
            if (this.f5774c == null) {
                this.f5774c = new SparseArray<>();
            }
            return this.f5774c;
        }

        /* renamed from: e */
        private boolean m8465e(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(C1825b.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((C2000k) arrayList.get(size)).mo6688a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private void m8466g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f5773b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f5772a;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (this.f5773b == null) {
                        this.f5773b = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f5772a;
                        View view = (View) arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f5773b.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f5773b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6689b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m8466g();
            }
            View c = m8463c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m8464d().put(keyCode, new WeakReference(c));
                }
            }
            return c != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo6690f(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f5775d;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f5775d = new WeakReference<>(keyEvent);
            WeakReference weakReference2 = null;
            SparseArray<WeakReference<View>> d = m8464d();
            if (keyEvent.getAction() == 1 && (indexOfKey = d.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                weakReference2 = d.valueAt(indexOfKey);
                d.removeAt(indexOfKey);
            }
            if (weakReference2 == null) {
                weakReference2 = d.get(keyEvent.getKeyCode());
            }
            if (weakReference2 == null) {
                return false;
            }
            View view = (View) weakReference2.get();
            if (view != null && C1988t.m8359Q(view)) {
                m8465e(view, keyEvent);
            }
            return true;
        }
    }

    /* renamed from: A */
    public static int m8333A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f5753c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f5752b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5753c = true;
        }
        Field field = f5752b;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: A0 */
    public static void m8334A0(View view, C1984p pVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            C1996h.m8458d(view, pVar);
        }
    }

    /* renamed from: B */
    static C1904a m8335B(View view) {
        C1904a j = m8387j(view);
        if (j == null) {
            j = new C1904a();
        }
        m8394m0(view, j);
        return j;
    }

    /* renamed from: B0 */
    public static void m8336B0(View view, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* renamed from: C */
    public static int m8337C(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    /* renamed from: C0 */
    public static void m8338C0(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: D */
    public static int m8339D(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    /* renamed from: D0 */
    public static void m8340D0(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f5756f == null) {
            f5756f = new WeakHashMap<>();
        }
        f5756f.put(view, str);
    }

    /* renamed from: E */
    public static ViewParent m8341E(View view) {
        return Build.VERSION.SDK_INT >= 16 ? view.getParentForAccessibility() : view.getParent();
    }

    /* renamed from: E0 */
    public static void m8342E0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f);
        }
    }

    /* renamed from: F */
    public static C1929e0 m8343F(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C1998i.m8459a(view);
        }
        if (i >= 21) {
            return C1996h.m8457c(view);
        }
        return null;
    }

    /* renamed from: F0 */
    private static void m8344F0(View view) {
        if (m8413w(view) == 0) {
            m8414w0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (m8413w((View) parent) == 4) {
                m8414w0(view, 2);
                return;
            }
        }
    }

    /* renamed from: G */
    public static final CharSequence m8345G(View view) {
        return m8348H0().mo6685f(view);
    }

    /* renamed from: G0 */
    public static void m8346G0(View view, C1916d0.C1918b bVar) {
        C1916d0.m8013c(view, bVar);
    }

    /* renamed from: H */
    public static String m8347H(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f5756f;
        if (weakHashMap == null) {
            return null;
        }
        return weakHashMap.get(view);
    }

    /* renamed from: H0 */
    private static C1995g<CharSequence> m8348H0() {
        return new C1992d(C1825b.tag_state_description, CharSequence.class, 64, 30);
    }

    /* renamed from: I */
    public static float m8349I(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }

    /* renamed from: I0 */
    public static void m8350I0(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (view instanceof C1978j) {
            ((C1978j) view).stopNestedScroll();
        }
    }

    /* renamed from: J */
    public static int m8351J(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: J0 */
    private static void m8352J0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: K */
    public static float m8353K(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: L */
    public static boolean m8354L(View view) {
        return m8389k(view) != null;
    }

    /* renamed from: M */
    public static boolean m8355M(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: N */
    public static boolean m8356N(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: O */
    public static boolean m8357O(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: P */
    public static boolean m8358P(View view) {
        Boolean f = m8369a().mo6685f(view);
        if (f == null) {
            return false;
        }
        return f.booleanValue();
    }

    /* renamed from: Q */
    public static boolean m8359Q(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    /* renamed from: R */
    public static boolean m8360R(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.isInLayout();
        }
        return false;
    }

    /* renamed from: S */
    public static boolean m8361S(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    /* renamed from: T */
    public static boolean m8362T(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C1978j) {
            return ((C1978j) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: U */
    public static boolean m8363U(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: V */
    public static boolean m8364V(View view) {
        Boolean f = m8392l0().mo6685f(view);
        if (f == null) {
            return false;
        }
        return f.booleanValue();
    }

    /* renamed from: W */
    static void m8365W(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m8395n(view) != null && view.getVisibility() == 0;
            int i2 = 32;
            if (m8393m(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                obtain.setContentChangeTypes(i);
                if (z) {
                    obtain.getText().add(m8395n(view));
                    m8344F0(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                obtain2.setContentChangeTypes(i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(m8395n(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    /* renamed from: X */
    public static void m8366X(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetLeftAndRight(i);
        } else if (i2 >= 21) {
            Rect u = m8409u();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                u.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !u.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m8375d(view, i);
            if (z && u.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(u);
            }
        } else {
            m8375d(view, i);
        }
    }

    /* renamed from: Y */
    public static void m8367Y(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            view.offsetTopAndBottom(i);
        } else if (i2 >= 21) {
            Rect u = m8409u();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                u.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !u.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m8377e(view, i);
            if (z && u.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(u);
            }
        } else {
            m8377e(view, i);
        }
    }

    /* renamed from: Z */
    public static C1929e0 m8368Z(View view, C1929e0 e0Var) {
        WindowInsets t;
        if (Build.VERSION.SDK_INT >= 21 && (t = e0Var.mo6500t()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(t);
            if (!onApplyWindowInsets.equals(t)) {
                return C1929e0.m8058v(onApplyWindowInsets, view);
            }
        }
        return e0Var;
    }

    /* renamed from: a */
    private static C1995g<Boolean> m8369a() {
        return new C1993e(C1825b.tag_accessibility_heading, Boolean.class, 28);
    }

    /* renamed from: a0 */
    public static void m8370a0(View view, C1955c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.mo6560E0());
    }

    /* renamed from: b */
    private static void m8371b(View view, C1955c.C1956a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            m8335B(view);
            m8384h0(aVar.mo6623b(), view);
            m8397o(view).add(aVar);
            m8365W(view, 0);
        }
    }

    /* renamed from: b0 */
    private static C1995g<CharSequence> m8372b0() {
        return new C1991c(C1825b.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    /* renamed from: c */
    public static C2008y m8373c(View view) {
        if (f5757g == null) {
            f5757g = new WeakHashMap<>();
        }
        C2008y yVar = f5757g.get(view);
        if (yVar != null) {
            return yVar;
        }
        C2008y yVar2 = new C2008y(view);
        f5757g.put(view, yVar2);
        return yVar2;
    }

    /* renamed from: c0 */
    public static boolean m8374c0(View view, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: d */
    private static void m8375d(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m8352J0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m8352J0((View) parent);
            }
        }
    }

    /* renamed from: d0 */
    public static void m8376d0(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: e */
    private static void m8377e(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m8352J0(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m8352J0((View) parent);
            }
        }
    }

    /* renamed from: e0 */
    public static void m8378e0(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: f */
    public static C1929e0 m8379f(View view, C1929e0 e0Var, Rect rect) {
        return Build.VERSION.SDK_INT >= 21 ? C1996h.m8456b(view, e0Var, rect) : e0Var;
    }

    /* renamed from: f0 */
    public static void m8380f0(View view, Runnable runnable, long j) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: g */
    public static C1929e0 m8381g(View view, C1929e0 e0Var) {
        WindowInsets t;
        if (Build.VERSION.SDK_INT >= 21 && (t = e0Var.mo6500t()) != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(t);
            if (!dispatchApplyWindowInsets.equals(t)) {
                return C1929e0.m8058v(dispatchApplyWindowInsets, view);
            }
        }
        return e0Var;
    }

    /* renamed from: g0 */
    public static void m8382g0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            m8384h0(i, view);
            m8365W(view, 0);
        }
    }

    /* renamed from: h */
    static boolean m8383h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C2001l.m8462a(view).mo6689b(view, keyEvent);
    }

    /* renamed from: h0 */
    private static void m8384h0(int i, View view) {
        List<C1955c.C1956a> o = m8397o(view);
        for (int i2 = 0; i2 < o.size(); i2++) {
            if (o.get(i2).mo6623b() == i) {
                o.remove(i2);
                return;
            }
        }
    }

    /* renamed from: i */
    static boolean m8385i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C2001l.m8462a(view).mo6690f(keyEvent);
    }

    /* renamed from: i0 */
    public static void m8386i0(View view, C1955c.C1956a aVar, CharSequence charSequence, C1965f fVar) {
        if (fVar == null && charSequence == null) {
            m8382g0(view, aVar.mo6623b());
        } else {
            m8371b(view, aVar.mo6622a(charSequence, fVar));
        }
    }

    /* renamed from: j */
    public static C1904a m8387j(View view) {
        View.AccessibilityDelegate k = m8389k(view);
        if (k == null) {
            return null;
        }
        return k instanceof C1904a.C1905a ? ((C1904a.C1905a) k).f5600a : new C1904a(k);
    }

    /* renamed from: j0 */
    public static void m8388j0(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 20) {
            view.requestApplyInsets();
        } else if (i >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: k */
    private static View.AccessibilityDelegate m8389k(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : m8391l(view);
    }

    /* renamed from: k0 */
    public static void m8390k0(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1999j.m8460a(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* renamed from: l */
    private static View.AccessibilityDelegate m8391l(View view) {
        if (f5759i) {
            return null;
        }
        if (f5758h == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f5758h = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f5759i = true;
                return null;
            }
        }
        try {
            Object obj = f5758h.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f5759i = true;
            return null;
        }
    }

    /* renamed from: l0 */
    private static C1995g<Boolean> m8392l0() {
        return new C1990b(C1825b.tag_screen_reader_focusable, Boolean.class, 28);
    }

    /* renamed from: m */
    public static int m8393m(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: m0 */
    public static void m8394m0(View view, C1904a aVar) {
        if (aVar == null && (m8389k(view) instanceof C1904a.C1905a)) {
            aVar = new C1904a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.mo6438d());
    }

    /* renamed from: n */
    public static CharSequence m8395n(View view) {
        return m8372b0().mo6685f(view);
    }

    /* renamed from: n0 */
    public static void m8396n0(View view, boolean z) {
        m8369a().mo6686g(view, Boolean.valueOf(z));
    }

    /* renamed from: o */
    private static List<C1955c.C1956a> m8397o(View view) {
        int i = C1825b.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i, arrayList2);
        return arrayList2;
    }

    /* renamed from: o0 */
    public static void m8398o0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: p */
    public static ColorStateList m8399p(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof C1987s) {
            return ((C1987s) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: p0 */
    public static void m8400p0(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: q */
    public static PorterDuff.Mode m8401q(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof C1987s) {
            return ((C1987s) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: q0 */
    public static void m8402q0(View view, ColorStateList colorStateList) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C1987s) {
            ((C1987s) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: r */
    public static Rect m8403r(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: r0 */
    public static void m8404r0(View view, PorterDuff.Mode mode) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            view.setBackgroundTintMode(mode);
            if (i == 21) {
                Drawable background = view.getBackground();
                boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C1987s) {
            ((C1987s) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: s */
    public static Display m8405s(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m8359Q(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: s0 */
    public static void m8406s0(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: t */
    public static float m8407t(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: t0 */
    public static void m8408t0(View view, float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: u */
    private static Rect m8409u() {
        if (f5760j == null) {
            f5760j = new ThreadLocal<>();
        }
        Rect rect = f5760j.get();
        if (rect == null) {
            rect = new Rect();
            f5760j.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    @Deprecated
    /* renamed from: u0 */
    public static void m8410u0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: v */
    public static boolean m8411v(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: v0 */
    public static void m8412v0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: w */
    public static int m8413w(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: w0 */
    public static void m8414w0(View view, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 19) {
            if (i2 < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: x */
    public static int m8415x(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: x0 */
    public static void m8416x0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    /* renamed from: y */
    public static int m8417y(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: y0 */
    public static void m8418y0(View view, int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    /* renamed from: z */
    public static int m8419z(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f5755e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f5754d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f5755e = true;
        }
        Field field = f5754d;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    /* renamed from: z0 */
    public static void m8420z0(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (view instanceof C1978j) {
            ((C1978j) view).setNestedScrollingEnabled(z);
        }
    }
}
