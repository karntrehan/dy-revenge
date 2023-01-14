package com.facebook.react.views.scroll;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.C3051u0;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.facebook.react.views.scroll.g */
public class C3143g {

    /* renamed from: a */
    private static final Set<C3145b> f8799a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private static int f8800b = 250;

    /* renamed from: c */
    private static boolean f8801c = false;

    /* renamed from: com.facebook.react.views.scroll.g$a */
    private static class C3144a extends OverScroller {

        /* renamed from: a */
        private int f8802a = 250;

        C3144a(Context context) {
            super(context);
        }

        /* renamed from: a */
        public int mo10223a() {
            super.startScroll(0, 0, 0, 0);
            return this.f8802a;
        }

        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            this.f8802a = i5;
        }
    }

    /* renamed from: com.facebook.react.views.scroll.g$b */
    public interface C3145b {
        /* renamed from: a */
        void mo10225a(ViewGroup viewGroup);

        /* renamed from: b */
        void mo10226b(ViewGroup viewGroup, C3147i iVar, float f, float f2);
    }

    /* renamed from: a */
    public static void m12363a(ViewGroup viewGroup) {
        for (C3145b a : f8799a) {
            a.mo10225a(viewGroup);
        }
    }

    /* renamed from: b */
    public static void m12364b(ViewGroup viewGroup) {
        m12367e(viewGroup, C3147i.BEGIN_DRAG);
    }

    /* renamed from: c */
    public static void m12365c(ViewGroup viewGroup, float f, float f2) {
        m12368f(viewGroup, C3147i.END_DRAG, f, f2);
    }

    /* renamed from: d */
    public static void m12366d(ViewGroup viewGroup, float f, float f2) {
        m12368f(viewGroup, C3147i.SCROLL, f, f2);
    }

    /* renamed from: e */
    private static void m12367e(ViewGroup viewGroup, C3147i iVar) {
        m12368f(viewGroup, iVar, 0.0f, 0.0f);
    }

    /* renamed from: f */
    private static void m12368f(ViewGroup viewGroup, C3147i iVar, float f, float f2) {
        ViewGroup viewGroup2 = viewGroup;
        View childAt = viewGroup.getChildAt(0);
        if (childAt != null) {
            for (C3145b b : f8799a) {
                b.mo10226b(viewGroup, iVar, f, f2);
            }
            ReactContext reactContext = (ReactContext) viewGroup.getContext();
            int d = C3051u0.m12087d(reactContext);
            C3051u0.m12085b(reactContext, viewGroup.getId()).mo9651c(C3146h.m12378v(d, viewGroup.getId(), iVar, viewGroup.getScrollX(), viewGroup.getScrollY(), f, f2, childAt.getWidth(), childAt.getHeight(), viewGroup.getWidth(), viewGroup.getHeight()));
        }
    }

    /* renamed from: g */
    public static void m12369g(ViewGroup viewGroup, int i, int i2) {
        m12368f(viewGroup, C3147i.MOMENTUM_BEGIN, (float) i, (float) i2);
    }

    /* renamed from: h */
    public static void m12370h(ViewGroup viewGroup) {
        m12367e(viewGroup, C3147i.MOMENTUM_END);
    }

    /* renamed from: i */
    public static int m12371i(Context context) {
        if (!f8801c) {
            f8801c = true;
            try {
                f8800b = new C3144a(context).mo10223a();
            } catch (Throwable unused) {
            }
        }
        return f8800b;
    }

    /* renamed from: j */
    public static int m12372j(String str) {
        if (str == null || str.equals("auto")) {
            return 1;
        }
        if (str.equals("always")) {
            return 0;
        }
        if (str.equals("never")) {
            return 2;
        }
        throw new JSApplicationIllegalArgumentException("wrong overScrollMode: " + str);
    }

    /* renamed from: k */
    public static int m12373k(String str) {
        if (str == null) {
            return 0;
        }
        if ("start".equalsIgnoreCase(str)) {
            return 1;
        }
        if ("center".equalsIgnoreCase(str)) {
            return 2;
        }
        if ("end".equals(str)) {
            return 3;
        }
        throw new JSApplicationIllegalArgumentException("wrong snap alignment value: " + str);
    }
}
