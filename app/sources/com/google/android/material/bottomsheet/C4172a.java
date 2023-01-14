package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0091g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p027c.p064i.p072j.C1904a;
import p027c.p064i.p072j.C1988t;
import p027c.p064i.p072j.p073g0.C1955c;
import p174e.p319f.p320a.p363d.C9013b;
import p174e.p319f.p320a.p363d.C9019f;
import p174e.p319f.p320a.p363d.C9021h;
import p174e.p319f.p320a.p363d.C9023j;

/* renamed from: com.google.android.material.bottomsheet.a */
public class C4172a extends C0091g {

    /* renamed from: p */
    private BottomSheetBehavior<FrameLayout> f11663p;

    /* renamed from: q */
    private FrameLayout f11664q;

    /* renamed from: r */
    boolean f11665r;

    /* renamed from: s */
    boolean f11666s = true;

    /* renamed from: t */
    private boolean f11667t = true;

    /* renamed from: u */
    private boolean f11668u;

    /* renamed from: v */
    private BottomSheetBehavior.C4168e f11669v = new C4176d();

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    class C4173a implements View.OnClickListener {
        C4173a() {
        }

        public void onClick(View view) {
            C4172a aVar = C4172a.this;
            if (aVar.f11666s && aVar.isShowing() && C4172a.this.mo12760j()) {
                C4172a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    class C4174b extends C1904a {
        C4174b() {
        }

        /* renamed from: g */
        public void mo3776g(View view, C1955c cVar) {
            boolean z;
            super.mo3776g(view, cVar);
            if (C4172a.this.f11666s) {
                cVar.mo6577a(1048576);
                z = true;
            } else {
                z = false;
            }
            cVar.mo6589g0(z);
        }

        /* renamed from: j */
        public boolean mo3777j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                C4172a aVar = C4172a.this;
                if (aVar.f11666s) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.mo3777j(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    class C4175c implements View.OnTouchListener {
        C4175c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    class C4176d extends BottomSheetBehavior.C4168e {
        C4176d() {
        }

        /* renamed from: a */
        public void mo12749a(View view, float f) {
        }

        /* renamed from: b */
        public void mo12750b(View view, int i) {
            if (i == 5) {
                C4172a.this.cancel();
            }
        }
    }

    public C4172a(Context context, int i) {
        super(context, m15779b(context, i));
        mo361f(1);
    }

    /* renamed from: b */
    private static int m15779b(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C9013b.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : C9023j.Theme_Design_Light_BottomSheetDialog;
    }

    /* renamed from: g */
    private FrameLayout m15780g() {
        if (this.f11664q == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C9021h.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f11664q = frameLayout;
            BottomSheetBehavior<FrameLayout> S = BottomSheetBehavior.m15725S((FrameLayout) frameLayout.findViewById(C9019f.design_bottom_sheet));
            this.f11663p = S;
            S.mo12730K(this.f11669v);
            this.f11663p.mo12737b0(this.f11666s);
        }
        return this.f11664q;
    }

    /* renamed from: k */
    private View m15781k(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m15780g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f11664q.findViewById(C9019f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f11664q.findViewById(C9019f.design_bottom_sheet);
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C9019f.touch_outside).setOnClickListener(new C4173a());
        C1988t.m8394m0(frameLayout, new C4174b());
        frameLayout.setOnTouchListener(new C4175c());
        return this.f11664q;
    }

    public void cancel() {
        BottomSheetBehavior<FrameLayout> i = mo12759i();
        if (!this.f11665r || i.mo12733U() == 5) {
            super.cancel();
        } else {
            i.mo12742g0(5);
        }
    }

    /* renamed from: i */
    public BottomSheetBehavior<FrameLayout> mo12759i() {
        if (this.f11663p == null) {
            m15780g();
        }
        return this.f11663p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo12760j() {
        if (!this.f11668u) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.f11667t = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.f11668u = true;
        }
        return this.f11667t;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(RecyclerView.UNDEFINED_DURATION);
            }
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f11663p;
        if (bottomSheetBehavior != null && bottomSheetBehavior.mo12733U() == 5) {
            this.f11663p.mo12742g0(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f11666s != z) {
            this.f11666s = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f11663p;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo12737b0(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f11666s) {
            this.f11666s = true;
        }
        this.f11667t = z;
        this.f11668u = true;
    }

    public void setContentView(int i) {
        super.setContentView(m15781k(i, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(m15781k(0, view, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m15781k(0, view, layoutParams));
    }
}
