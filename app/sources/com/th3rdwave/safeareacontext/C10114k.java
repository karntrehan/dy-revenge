package com.th3rdwave.safeareacontext;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.th3rdwave.safeareacontext.k */
public final class C10114k {
    /* renamed from: a */
    public static final C10110g m34210a(ViewGroup viewGroup, View view) {
        C10457l.m35320e(viewGroup, "rootView");
        C10457l.m35320e(view, "view");
        if (view.getParent() == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        try {
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            return new C10110g((float) rect.left, (float) rect.top, (float) view.getWidth(), (float) view.getHeight());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private static final C10107e m34211b(View view) {
        int i = Build.VERSION.SDK_INT;
        return i >= 30 ? m34214e(view) : i >= 23 ? m34213d(view) : m34212c(view);
    }

    /* renamed from: c */
    private static final C10107e m34212c(View view) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        return new C10107e((float) rect.top, (float) (view.getWidth() - rect.right), (float) (view.getHeight() - rect.bottom), (float) rect.left);
    }

    /* renamed from: d */
    private static final C10107e m34213d(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        return new C10107e((float) rootWindowInsets.getSystemWindowInsetTop(), (float) rootWindowInsets.getSystemWindowInsetRight(), (float) Math.min(rootWindowInsets.getSystemWindowInsetBottom(), rootWindowInsets.getStableInsetBottom()), (float) rootWindowInsets.getSystemWindowInsetLeft());
    }

    /* renamed from: e */
    private static final C10107e m34214e(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        Insets insets = rootWindowInsets == null ? null : rootWindowInsets.getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars());
        if (insets == null) {
            return null;
        }
        return new C10107e((float) insets.top, (float) insets.right, (float) insets.bottom, (float) insets.left);
    }

    /* renamed from: f */
    public static final C10107e m34215f(View view) {
        C10457l.m35320e(view, "view");
        if (view.getHeight() == 0) {
            return null;
        }
        View rootView = view.getRootView();
        C10457l.m35319d(rootView, "rootView");
        C10107e b = m34211b(rootView);
        if (b == null) {
            return null;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return new C10107e(Math.max(b.mo25165d() - ((float) rect.top), 0.0f), Math.max(Math.min(((float) (rect.left + view.getWidth())) - ((float) rootView.getWidth()), 0.0f) + b.mo25164c(), 0.0f), Math.max(Math.min(((float) (rect.top + view.getHeight())) - ((float) rootView.getHeight()), 0.0f) + b.mo25162a(), 0.0f), Math.max(b.mo25163b() - ((float) rect.left), 0.0f));
    }
}
