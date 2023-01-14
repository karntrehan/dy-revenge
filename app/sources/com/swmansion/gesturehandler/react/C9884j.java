package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C2990j0;
import com.facebook.react.views.view.C3245g;
import java.util.Objects;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.gesturehandler.react.j */
public final class C9884j extends C3245g {

    /* renamed from: F */
    public static final C9885a f26442F = new C9885a((C10452g) null);

    /* renamed from: G */
    private boolean f26443G;

    /* renamed from: H */
    private C9881i f26444H;

    /* renamed from: com.swmansion.gesturehandler.react.j$a */
    public static final class C9885a {
        private C9885a() {
        }

        public /* synthetic */ C9885a(C10452g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final boolean m33701b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if ((parent instanceof C9874d) || (parent instanceof C9884j)) {
                    return true;
                }
                if (parent instanceof C2990j0) {
                    return false;
                }
            }
            return false;
        }
    }

    public C9884j(Context context) {
        super(context);
    }

    /* renamed from: B */
    public final void mo24743B() {
        C9881i iVar = this.f26444H;
        if (iVar != null) {
            iVar.mo24740h();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C10457l.m35320e(motionEvent, "ev");
        if (this.f26443G) {
            C9881i iVar = this.f26444H;
            C10457l.m35317b(iVar);
            if (iVar.mo24736b(motionEvent)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z = !f26442F.m33701b(this);
        this.f26443G = z;
        if (!z) {
            Log.i("ReactNative", "[GESTURE HANDLER] Gesture handler is already enabled for a parent view");
        }
        if (this.f26443G && this.f26444H == null) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.f26444H = new C9881i((ReactContext) context, this);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.f26443G) {
            C9881i iVar = this.f26444H;
            C10457l.m35317b(iVar);
            iVar.mo24739g(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}
