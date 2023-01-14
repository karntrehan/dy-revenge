package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0066e;
import androidx.core.content.C1135a;
import androidx.fragment.app.Fragment;
import com.yalantis.ucrop.p444l.C10153a;
import com.yalantis.ucrop.p445m.C10171i;
import com.yalantis.ucrop.view.C10183b;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p027c.p100v.C2126b;
import p027c.p100v.C2214x;
import p027c.p100v.C2224z;

public class UCropFragment extends Fragment {

    /* renamed from: k0 */
    public static final Bitmap.CompressFormat f27011k0 = Bitmap.CompressFormat.JPEG;
    /* access modifiers changed from: private */

    /* renamed from: A0 */
    public List<ViewGroup> f27012A0 = new ArrayList();

    /* renamed from: B0 */
    private TextView f27013B0;

    /* renamed from: C0 */
    private TextView f27014C0;
    /* access modifiers changed from: private */

    /* renamed from: D0 */
    public View f27015D0;

    /* renamed from: E0 */
    private Bitmap.CompressFormat f27016E0 = f27011k0;

    /* renamed from: F0 */
    private int f27017F0 = 90;

    /* renamed from: G0 */
    private int[] f27018G0 = {1, 2, 3};

    /* renamed from: H0 */
    private C10183b.C10185b f27019H0 = new C10130a();

    /* renamed from: I0 */
    private final View.OnClickListener f27020I0 = new C10136g();
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public C10148j f27021l0;

    /* renamed from: m0 */
    private int f27022m0;

    /* renamed from: n0 */
    private int f27023n0;

    /* renamed from: o0 */
    private int f27024o0;

    /* renamed from: p0 */
    private boolean f27025p0;

    /* renamed from: q0 */
    private C2214x f27026q0;
    /* access modifiers changed from: private */

    /* renamed from: r0 */
    public UCropView f27027r0;
    /* access modifiers changed from: private */

    /* renamed from: s0 */
    public GestureCropImageView f27028s0;

    /* renamed from: t0 */
    private OverlayView f27029t0;

    /* renamed from: u0 */
    private ViewGroup f27030u0;

    /* renamed from: v0 */
    private ViewGroup f27031v0;

    /* renamed from: w0 */
    private ViewGroup f27032w0;

    /* renamed from: x0 */
    private ViewGroup f27033x0;

    /* renamed from: y0 */
    private ViewGroup f27034y0;

    /* renamed from: z0 */
    private ViewGroup f27035z0;

    /* renamed from: com.yalantis.ucrop.UCropFragment$a */
    class C10130a implements C10183b.C10185b {
        C10130a() {
        }

        /* renamed from: a */
        public void mo25196a(float f) {
            UCropFragment.this.m34300O1(f);
        }

        /* renamed from: b */
        public void mo25197b() {
            UCropFragment.this.f27027r0.animate().alpha(1.0f).setDuration(300).setInterpolator(new AccelerateInterpolator());
            UCropFragment.this.f27015D0.setClickable(false);
            UCropFragment.this.f27021l0.mo25235b(false);
        }

        /* renamed from: c */
        public void mo25198c(Exception exc) {
            UCropFragment.this.f27021l0.mo25234a(UCropFragment.this.mo25209I1(exc));
        }

        /* renamed from: d */
        public void mo25199d(float f) {
            UCropFragment.this.m34304S1(f);
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$b */
    class C10131b implements View.OnClickListener {
        C10131b() {
        }

        public void onClick(View view) {
            UCropFragment.this.f27028s0.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).mo25383i(view.isSelected()));
            UCropFragment.this.f27028s0.mo25362z();
            if (!view.isSelected()) {
                for (ViewGroup viewGroup : UCropFragment.this.f27012A0) {
                    viewGroup.setSelected(viewGroup == view);
                }
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$c */
    class C10132c implements HorizontalProgressWheelView.C10186a {
        C10132c() {
        }

        /* renamed from: a */
        public void mo25201a() {
            UCropFragment.this.f27028s0.mo25362z();
        }

        /* renamed from: b */
        public void mo25202b(float f, float f2) {
            UCropFragment.this.f27028s0.mo25360x(f / 42.0f);
        }

        /* renamed from: c */
        public void mo25203c() {
            UCropFragment.this.f27028s0.mo25356t();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$d */
    class C10133d implements View.OnClickListener {
        C10133d() {
        }

        public void onClick(View view) {
            UCropFragment.this.m34297L1();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$e */
    class C10134e implements View.OnClickListener {
        C10134e() {
        }

        public void onClick(View view) {
            UCropFragment.this.m34298M1(90);
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$f */
    class C10135f implements HorizontalProgressWheelView.C10186a {
        C10135f() {
        }

        /* renamed from: a */
        public void mo25201a() {
            UCropFragment.this.f27028s0.mo25362z();
        }

        /* renamed from: b */
        public void mo25202b(float f, float f2) {
            if (f > 0.0f) {
                UCropFragment.this.f27028s0.mo25338C(UCropFragment.this.f27028s0.getCurrentScale() + (f * ((UCropFragment.this.f27028s0.getMaxScale() - UCropFragment.this.f27028s0.getMinScale()) / 15000.0f)));
            } else {
                UCropFragment.this.f27028s0.mo25340E(UCropFragment.this.f27028s0.getCurrentScale() + (f * ((UCropFragment.this.f27028s0.getMaxScale() - UCropFragment.this.f27028s0.getMinScale()) / 15000.0f)));
            }
        }

        /* renamed from: c */
        public void mo25203c() {
            UCropFragment.this.f27028s0.mo25356t();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$g */
    class C10136g implements View.OnClickListener {
        C10136g() {
        }

        public void onClick(View view) {
            if (!view.isSelected()) {
                UCropFragment.this.m34306U1(view.getId());
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropFragment$h */
    public class C10137h {

        /* renamed from: a */
        public int f27043a;

        /* renamed from: b */
        public Intent f27044b;

        public C10137h(int i, Intent intent) {
            this.f27043a = i;
            this.f27044b = intent;
        }
    }

    static {
        C0066e.m254A(true);
    }

    /* renamed from: G1 */
    private void m34293G1(View view) {
        if (this.f27015D0 == null) {
            this.f27015D0 = new View(mo3930s());
            this.f27015D0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f27015D0.setClickable(true);
        }
        ((RelativeLayout) view.findViewById(C10141d.ucrop_photobox)).addView(this.f27015D0);
    }

    /* renamed from: H1 */
    private void m34294H1(int i) {
        if (mo3861N() != null) {
            C2224z.m9415a((ViewGroup) mo3861N().findViewById(C10141d.ucrop_photobox), this.f27026q0);
        }
        int i2 = 0;
        this.f27032w0.findViewById(C10141d.text_view_scale).setVisibility(i == C10141d.state_scale ? 0 : 8);
        this.f27030u0.findViewById(C10141d.text_view_crop).setVisibility(i == C10141d.state_aspect_ratio ? 0 : 8);
        View findViewById = this.f27031v0.findViewById(C10141d.text_view_rotate);
        if (i != C10141d.state_rotate) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
    }

    /* renamed from: J1 */
    private void m34295J1(View view) {
        UCropView uCropView = (UCropView) view.findViewById(C10141d.ucrop);
        this.f27027r0 = uCropView;
        this.f27028s0 = uCropView.getCropImageView();
        this.f27029t0 = this.f27027r0.getOverlayView();
        this.f27028s0.setTransformImageListener(this.f27019H0);
        ((ImageView) view.findViewById(C10141d.image_view_logo)).setColorFilter(this.f27024o0, PorterDuff.Mode.SRC_ATOP);
        view.findViewById(C10141d.ucrop_frame).setBackgroundColor(this.f27023n0);
    }

    /* renamed from: K1 */
    private void m34296K1(Bundle bundle) {
        GestureCropImageView gestureCropImageView;
        String string = bundle.getString("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat valueOf = !TextUtils.isEmpty(string) ? Bitmap.CompressFormat.valueOf(string) : null;
        if (valueOf == null) {
            valueOf = f27011k0;
        }
        this.f27016E0 = valueOf;
        this.f27017F0 = bundle.getInt("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArray = bundle.getIntArray("com.yalantis.ucrop.AllowedGestures");
        if (intArray != null && intArray.length == 3) {
            this.f27018G0 = intArray;
        }
        this.f27028s0.setMaxBitmapSize(bundle.getInt("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.f27028s0.setMaxScaleMultiplier(bundle.getFloat("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.f27028s0.setImageToWrapCropBoundsAnimDuration((long) bundle.getInt("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.f27029t0.setFreestyleCropEnabled(bundle.getBoolean("com.yalantis.ucrop.FreeStyleCrop", false));
        this.f27029t0.setDimmedColor(bundle.getInt("com.yalantis.ucrop.DimmedLayerColor", mo3846F().getColor(C10138a.ucrop_color_default_dimmed)));
        this.f27029t0.setCircleDimmedLayer(bundle.getBoolean("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.f27029t0.setShowCropFrame(bundle.getBoolean("com.yalantis.ucrop.ShowCropFrame", true));
        this.f27029t0.setCropFrameColor(bundle.getInt("com.yalantis.ucrop.CropFrameColor", mo3846F().getColor(C10138a.ucrop_color_default_crop_frame)));
        this.f27029t0.setCropFrameStrokeWidth(bundle.getInt("com.yalantis.ucrop.CropFrameStrokeWidth", mo3846F().getDimensionPixelSize(C10139b.ucrop_default_crop_frame_stoke_width)));
        this.f27029t0.setShowCropGrid(bundle.getBoolean("com.yalantis.ucrop.ShowCropGrid", true));
        this.f27029t0.setCropGridRowCount(bundle.getInt("com.yalantis.ucrop.CropGridRowCount", 2));
        this.f27029t0.setCropGridColumnCount(bundle.getInt("com.yalantis.ucrop.CropGridColumnCount", 2));
        this.f27029t0.setCropGridColor(bundle.getInt("com.yalantis.ucrop.CropGridColor", mo3846F().getColor(C10138a.ucrop_color_default_crop_grid)));
        this.f27029t0.setCropGridStrokeWidth(bundle.getInt("com.yalantis.ucrop.CropGridStrokeWidth", mo3846F().getDimensionPixelSize(C10139b.ucrop_default_crop_grid_stoke_width)));
        float f = 0.0f;
        float f2 = bundle.getFloat("com.yalantis.ucrop.AspectRatioX", 0.0f);
        float f3 = bundle.getFloat("com.yalantis.ucrop.AspectRatioY", 0.0f);
        int i = bundle.getInt("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("com.yalantis.ucrop.AspectRatioOptions");
        if (f2 <= 0.0f || f3 <= 0.0f) {
            if (parcelableArrayList == null || i >= parcelableArrayList.size()) {
                gestureCropImageView = this.f27028s0;
            } else {
                gestureCropImageView = this.f27028s0;
                f = ((C10153a) parcelableArrayList.get(i)).mo25241b() / ((C10153a) parcelableArrayList.get(i)).mo25242c();
            }
            gestureCropImageView.setTargetAspectRatio(f);
        } else {
            ViewGroup viewGroup = this.f27030u0;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.f27028s0.setTargetAspectRatio(f2 / f3);
        }
        int i2 = bundle.getInt("com.yalantis.ucrop.MaxSizeX", 0);
        int i3 = bundle.getInt("com.yalantis.ucrop.MaxSizeY", 0);
        if (i2 > 0 && i3 > 0) {
            this.f27028s0.setMaxResultImageSizeX(i2);
            this.f27028s0.setMaxResultImageSizeY(i3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public void m34297L1() {
        GestureCropImageView gestureCropImageView = this.f27028s0;
        gestureCropImageView.mo25360x(-gestureCropImageView.getCurrentAngle());
        this.f27028s0.mo25362z();
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public void m34298M1(int i) {
        this.f27028s0.mo25360x((float) i);
        this.f27028s0.mo25362z();
    }

    /* renamed from: N1 */
    private void m34299N1(int i) {
        GestureCropImageView gestureCropImageView = this.f27028s0;
        int[] iArr = this.f27018G0;
        boolean z = false;
        gestureCropImageView.setScaleEnabled(iArr[i] == 3 || iArr[i] == 1);
        GestureCropImageView gestureCropImageView2 = this.f27028s0;
        int[] iArr2 = this.f27018G0;
        if (iArr2[i] == 3 || iArr2[i] == 2) {
            z = true;
        }
        gestureCropImageView2.setRotateEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public void m34300O1(float f) {
        TextView textView = this.f27013B0;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", new Object[]{Float.valueOf(f)}));
        }
    }

    /* renamed from: P1 */
    private void m34301P1(int i) {
        TextView textView = this.f27013B0;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* renamed from: Q1 */
    private void m34302Q1(Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) bundle.getParcelable("com.yalantis.ucrop.OutputUri");
        m34296K1(bundle);
        if (uri == null || uri2 == null) {
            this.f27021l0.mo25234a(mo25209I1(new NullPointerException(mo3857L(C10144g.ucrop_error_input_data_is_absent))));
            return;
        }
        try {
            this.f27028s0.mo25377n(uri, uri2);
        } catch (Exception e) {
            this.f27021l0.mo25234a(mo25209I1(e));
        }
    }

    /* renamed from: R1 */
    private void m34303R1() {
        if (this.f27025p0) {
            m34306U1(this.f27030u0.getVisibility() == 0 ? C10141d.state_aspect_ratio : C10141d.state_scale);
        } else {
            m34299N1(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public void m34304S1(float f) {
        TextView textView = this.f27014C0;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf((int) (f * 100.0f))}));
        }
    }

    /* renamed from: T1 */
    private void m34305T1(int i) {
        TextView textView = this.f27014C0;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public void m34306U1(int i) {
        if (this.f27025p0) {
            ViewGroup viewGroup = this.f27030u0;
            int i2 = C10141d.state_aspect_ratio;
            viewGroup.setSelected(i == i2);
            ViewGroup viewGroup2 = this.f27031v0;
            int i3 = C10141d.state_rotate;
            viewGroup2.setSelected(i == i3);
            ViewGroup viewGroup3 = this.f27032w0;
            int i4 = C10141d.state_scale;
            viewGroup3.setSelected(i == i4);
            int i5 = 8;
            this.f27033x0.setVisibility(i == i2 ? 0 : 8);
            this.f27034y0.setVisibility(i == i3 ? 0 : 8);
            ViewGroup viewGroup4 = this.f27035z0;
            if (i == i4) {
                i5 = 0;
            }
            viewGroup4.setVisibility(i5);
            m34294H1(i);
            if (i == i4) {
                m34299N1(0);
            } else if (i == i3) {
                m34299N1(1);
            } else {
                m34299N1(2);
            }
        }
    }

    /* renamed from: V1 */
    private void m34307V1(Bundle bundle, View view) {
        int i = bundle.getInt("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            i = 2;
            parcelableArrayList = new ArrayList();
            parcelableArrayList.add(new C10153a((String) null, 1.0f, 1.0f));
            parcelableArrayList.add(new C10153a((String) null, 3.0f, 4.0f));
            parcelableArrayList.add(new C10153a(mo3857L(C10144g.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayList.add(new C10153a((String) null, 3.0f, 2.0f));
            parcelableArrayList.add(new C10153a((String) null, 16.0f, 9.0f));
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C10141d.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) mo3949y().inflate(C10142e.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f27022m0);
            aspectRatioTextView.setAspectRatio((C10153a) it.next());
            linearLayout.addView(frameLayout);
            this.f27012A0.add(frameLayout);
        }
        this.f27012A0.get(i).setSelected(true);
        for (ViewGroup onClickListener : this.f27012A0) {
            onClickListener.setOnClickListener(new C10131b());
        }
    }

    /* renamed from: W1 */
    private void m34308W1(View view) {
        this.f27013B0 = (TextView) view.findViewById(C10141d.text_view_rotate);
        int i = C10141d.rotate_scroll_wheel;
        ((HorizontalProgressWheelView) view.findViewById(i)).setScrollingListener(new C10132c());
        ((HorizontalProgressWheelView) view.findViewById(i)).setMiddleLineColor(this.f27022m0);
        view.findViewById(C10141d.wrapper_reset_rotate).setOnClickListener(new C10133d());
        view.findViewById(C10141d.wrapper_rotate_by_angle).setOnClickListener(new C10134e());
        m34301P1(this.f27022m0);
    }

    /* renamed from: X1 */
    private void m34309X1(View view) {
        this.f27014C0 = (TextView) view.findViewById(C10141d.text_view_scale);
        int i = C10141d.scale_scroll_wheel;
        ((HorizontalProgressWheelView) view.findViewById(i)).setScrollingListener(new C10135f());
        ((HorizontalProgressWheelView) view.findViewById(i)).setMiddleLineColor(this.f27022m0);
        m34305T1(this.f27022m0);
    }

    /* renamed from: Y1 */
    private void m34310Y1(View view) {
        ImageView imageView = (ImageView) view.findViewById(C10141d.image_view_state_scale);
        ImageView imageView2 = (ImageView) view.findViewById(C10141d.image_view_state_rotate);
        ImageView imageView3 = (ImageView) view.findViewById(C10141d.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new C10171i(imageView.getDrawable(), this.f27022m0));
        imageView2.setImageDrawable(new C10171i(imageView2.getDrawable(), this.f27022m0));
        imageView3.setImageDrawable(new C10171i(imageView3.getDrawable(), this.f27022m0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: I1 */
    public C10137h mo25209I1(Throwable th) {
        return new C10137h(96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    /* renamed from: Z1 */
    public void mo25210Z1(View view, Bundle bundle) {
        this.f27022m0 = bundle.getInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", C1135a.m4417c(mo3930s(), C10138a.ucrop_color_widget_active));
        this.f27024o0 = bundle.getInt("com.yalantis.ucrop.UcropLogoColor", C1135a.m4417c(mo3930s(), C10138a.ucrop_color_default_logo));
        this.f27025p0 = !bundle.getBoolean("com.yalantis.ucrop.HideBottomControls", false);
        this.f27023n0 = bundle.getInt("com.yalantis.ucrop.UcropRootViewBackgroundColor", C1135a.m4417c(mo3930s(), C10138a.ucrop_color_crop_background));
        m34295J1(view);
        this.f27021l0.mo25235b(true);
        if (this.f27025p0) {
            ViewGroup viewGroup = (ViewGroup) view.findViewById(C10141d.controls_wrapper);
            viewGroup.setVisibility(0);
            LayoutInflater.from(mo3930s()).inflate(C10142e.ucrop_controls, viewGroup, true);
            C2126b bVar = new C2126b();
            this.f27026q0 = bVar;
            bVar.mo7184f0(50);
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(C10141d.state_aspect_ratio);
            this.f27030u0 = viewGroup2;
            viewGroup2.setOnClickListener(this.f27020I0);
            ViewGroup viewGroup3 = (ViewGroup) view.findViewById(C10141d.state_rotate);
            this.f27031v0 = viewGroup3;
            viewGroup3.setOnClickListener(this.f27020I0);
            ViewGroup viewGroup4 = (ViewGroup) view.findViewById(C10141d.state_scale);
            this.f27032w0 = viewGroup4;
            viewGroup4.setOnClickListener(this.f27020I0);
            this.f27033x0 = (ViewGroup) view.findViewById(C10141d.layout_aspect_ratio);
            this.f27034y0 = (ViewGroup) view.findViewById(C10141d.layout_rotate_wheel);
            this.f27035z0 = (ViewGroup) view.findViewById(C10141d.layout_scale_wheel);
            m34307V1(bundle, view);
            m34308W1(view);
            m34309X1(view);
            m34310Y1(view);
            return;
        }
        int i = C10141d.ucrop_frame;
        ((RelativeLayout.LayoutParams) view.findViewById(i).getLayoutParams()).bottomMargin = 0;
        view.findViewById(i).requestLayout();
    }

    /* renamed from: e0 */
    public void mo3824e0(Context context) {
        Object obj;
        super.mo3824e0(context);
        if (mo3842C() instanceof C10148j) {
            obj = mo3842C();
        } else {
            boolean z = context instanceof C10148j;
            obj = context;
            if (!z) {
                throw new IllegalArgumentException(context.toString() + " must implement UCropFragmentCallback");
            }
        }
        this.f27021l0 = (C10148j) obj;
    }

    /* renamed from: l0 */
    public View mo3910l0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C10142e.ucrop_fragment_photobox, viewGroup, false);
        Bundle q = mo3925q();
        mo25210Z1(inflate, q);
        m34302Q1(q);
        m34303R1();
        m34293G1(inflate);
        return inflate;
    }
}
