package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.activity.C0043b;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import p455g.p470y.p472d.C10457l;

/* renamed from: com.swmansion.rnscreens.p */
public final class C10076p extends SearchView {

    /* renamed from: E0 */
    private SearchView.C0173k f26824E0;

    /* renamed from: F0 */
    private View.OnClickListener f26825F0;

    /* renamed from: G0 */
    private C0043b f26826G0;

    /* renamed from: H0 */
    private final C10080s f26827H0;

    /* renamed from: com.swmansion.rnscreens.p$a */
    public static final class C10077a extends C0043b {

        /* renamed from: c */
        final /* synthetic */ C10076p f26828c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C10077a(C10076p pVar) {
            super(true);
            this.f26828c = pVar;
        }

        /* renamed from: b */
        public void mo144b() {
            this.f26828c.setIconified(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10076p(Context context, Fragment fragment) {
        super(context);
        C10457l.m35320e(context, "context");
        C10457l.m35320e(fragment, "fragment");
        C10077a aVar = new C10077a(this);
        this.f26826G0 = aVar;
        this.f26827H0 = new C10080s(fragment, aVar);
        super.setOnSearchClickListener(new C10030b(this));
        super.setOnCloseListener(new C10027a(this));
        setMaxWidth(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO);
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m34105m0(C10076p pVar, View view) {
        C10457l.m35320e(pVar, "this$0");
        View.OnClickListener onClickListener = pVar.f26825F0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        pVar.f26827H0.mo25049b();
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public static final boolean m34106n0(C10076p pVar) {
        C10457l.m35320e(pVar, "this$0");
        SearchView.C0173k kVar = pVar.f26824E0;
        boolean a = kVar != null ? kVar.mo1088a() : false;
        pVar.f26827H0.mo25050c();
        return a;
    }

    public final boolean getOverrideBackAction() {
        return this.f26827H0.mo25048a();
    }

    /* renamed from: o0 */
    public final void mo25044o0() {
        setIconified(false);
        requestFocusFromTouch();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!mo1016L()) {
            this.f26827H0.mo25049b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26827H0.mo25050c();
    }

    public void setOnCloseListener(SearchView.C0173k kVar) {
        this.f26824E0 = kVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f26825F0 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z) {
        this.f26827H0.mo25051d(z);
    }
}
