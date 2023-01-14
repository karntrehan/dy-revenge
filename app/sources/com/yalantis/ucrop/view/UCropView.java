package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.yalantis.ucrop.C10141d;
import com.yalantis.ucrop.C10142e;
import com.yalantis.ucrop.C10145h;
import com.yalantis.ucrop.p443k.C10151c;
import com.yalantis.ucrop.p443k.C10152d;

public class UCropView extends FrameLayout {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public GestureCropImageView f27211f;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final OverlayView f27212o;

    /* renamed from: com.yalantis.ucrop.view.UCropView$a */
    class C10178a implements C10151c {
        C10178a() {
        }

        /* renamed from: a */
        public void mo25238a(float f) {
            UCropView.this.f27212o.setTargetAspectRatio(f);
        }
    }

    /* renamed from: com.yalantis.ucrop.view.UCropView$b */
    class C10179b implements C10152d {
        C10179b() {
        }

        /* renamed from: a */
        public void mo25239a(RectF rectF) {
            UCropView.this.f27211f.setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public UCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C10142e.ucrop_view, this, true);
        this.f27211f = (GestureCropImageView) findViewById(C10141d.image_view_crop);
        OverlayView overlayView = (OverlayView) findViewById(C10141d.view_overlay);
        this.f27212o = overlayView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10145h.f27067U);
        overlayView.mo25311g(obtainStyledAttributes);
        this.f27211f.mo25361y(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        m34449c();
    }

    /* renamed from: c */
    private void m34449c() {
        this.f27211f.setCropBoundsChangeListener(new C10178a());
        this.f27212o.setOverlayViewChangeListener(new C10179b());
    }

    public GestureCropImageView getCropImageView() {
        return this.f27211f;
    }

    public OverlayView getOverlayView() {
        return this.f27212o;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
