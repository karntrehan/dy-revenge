package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0058a;
import androidx.appcompat.app.C0064c;
import androidx.appcompat.app.C0066e;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C1135a;
import androidx.recyclerview.widget.RecyclerView;
import com.yalantis.ucrop.p443k.C10149a;
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

public class UCropActivity extends C0064c {

    /* renamed from: G */
    public static final Bitmap.CompressFormat f26972G = Bitmap.CompressFormat.JPEG;

    /* renamed from: H */
    private String f26973H;

    /* renamed from: I */
    private int f26974I;

    /* renamed from: J */
    private int f26975J;

    /* renamed from: K */
    private int f26976K;

    /* renamed from: L */
    private int f26977L;

    /* renamed from: M */
    private int f26978M;

    /* renamed from: N */
    private int f26979N;

    /* renamed from: O */
    private int f26980O;

    /* renamed from: P */
    private int f26981P;

    /* renamed from: Q */
    private boolean f26982Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public boolean f26983R = true;
    /* access modifiers changed from: private */

    /* renamed from: S */
    public UCropView f26984S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public GestureCropImageView f26985T;

    /* renamed from: U */
    private OverlayView f26986U;

    /* renamed from: V */
    private ViewGroup f26987V;

    /* renamed from: W */
    private ViewGroup f26988W;

    /* renamed from: X */
    private ViewGroup f26989X;

    /* renamed from: Y */
    private ViewGroup f26990Y;

    /* renamed from: Z */
    private ViewGroup f26991Z;

    /* renamed from: a0 */
    private ViewGroup f26992a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public List<ViewGroup> f26993b0 = new ArrayList();

    /* renamed from: c0 */
    private TextView f26994c0;

    /* renamed from: d0 */
    private TextView f26995d0;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public View f26996e0;

    /* renamed from: f0 */
    private C2214x f26997f0;

    /* renamed from: g0 */
    private Bitmap.CompressFormat f26998g0 = f26972G;

    /* renamed from: h0 */
    private int f26999h0 = 90;

    /* renamed from: i0 */
    private int[] f27000i0 = {1, 2, 3};

    /* renamed from: j0 */
    private C10183b.C10185b f27001j0 = new C10122a();

    /* renamed from: k0 */
    private final View.OnClickListener f27002k0 = new C10128g();

    /* renamed from: com.yalantis.ucrop.UCropActivity$a */
    class C10122a implements C10183b.C10185b {
        C10122a() {
        }

        /* renamed from: a */
        public void mo25196a(float f) {
            UCropActivity.this.m34258d0(f);
        }

        /* renamed from: b */
        public void mo25197b() {
            UCropActivity.this.f26984S.animate().alpha(1.0f).setDuration(300).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.f26996e0.setClickable(false);
            boolean unused = UCropActivity.this.f26983R = false;
            UCropActivity.this.mo259z();
        }

        /* renamed from: c */
        public void mo25198c(Exception exc) {
            UCropActivity.this.mo25191h0(exc);
            UCropActivity.this.finish();
        }

        /* renamed from: d */
        public void mo25199d(float f) {
            UCropActivity.this.m34262j0(f);
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$b */
    class C10123b implements View.OnClickListener {
        C10123b() {
        }

        public void onClick(View view) {
            UCropActivity.this.f26985T.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).mo25383i(view.isSelected()));
            UCropActivity.this.f26985T.mo25362z();
            if (!view.isSelected()) {
                for (ViewGroup viewGroup : UCropActivity.this.f26993b0) {
                    viewGroup.setSelected(viewGroup == view);
                }
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$c */
    class C10124c implements HorizontalProgressWheelView.C10186a {
        C10124c() {
        }

        /* renamed from: a */
        public void mo25201a() {
            UCropActivity.this.f26985T.mo25362z();
        }

        /* renamed from: b */
        public void mo25202b(float f, float f2) {
            UCropActivity.this.f26985T.mo25360x(f / 42.0f);
        }

        /* renamed from: c */
        public void mo25203c() {
            UCropActivity.this.f26985T.mo25356t();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$d */
    class C10125d implements View.OnClickListener {
        C10125d() {
        }

        public void onClick(View view) {
            UCropActivity.this.m34255a0();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$e */
    class C10126e implements View.OnClickListener {
        C10126e() {
        }

        public void onClick(View view) {
            UCropActivity.this.m34256b0(90);
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$f */
    class C10127f implements HorizontalProgressWheelView.C10186a {
        C10127f() {
        }

        /* renamed from: a */
        public void mo25201a() {
            UCropActivity.this.f26985T.mo25362z();
        }

        /* renamed from: b */
        public void mo25202b(float f, float f2) {
            if (f > 0.0f) {
                UCropActivity.this.f26985T.mo25338C(UCropActivity.this.f26985T.getCurrentScale() + (f * ((UCropActivity.this.f26985T.getMaxScale() - UCropActivity.this.f26985T.getMinScale()) / 15000.0f)));
            } else {
                UCropActivity.this.f26985T.mo25340E(UCropActivity.this.f26985T.getCurrentScale() + (f * ((UCropActivity.this.f26985T.getMaxScale() - UCropActivity.this.f26985T.getMinScale()) / 15000.0f)));
            }
        }

        /* renamed from: c */
        public void mo25203c() {
            UCropActivity.this.f26985T.mo25356t();
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$g */
    class C10128g implements View.OnClickListener {
        C10128g() {
        }

        public void onClick(View view) {
            if (!view.isSelected()) {
                UCropActivity.this.m34265m0(view.getId());
            }
        }
    }

    /* renamed from: com.yalantis.ucrop.UCropActivity$h */
    class C10129h implements C10149a {
        C10129h() {
        }

        /* renamed from: a */
        public void mo25207a(Uri uri, int i, int i2, int i3, int i4) {
            UCropActivity uCropActivity = UCropActivity.this;
            uCropActivity.mo25192i0(uri, uCropActivity.f26985T.getTargetAspectRatio(), i, i2, i3, i4);
            UCropActivity.this.finish();
        }

        /* renamed from: b */
        public void mo25208b(Throwable th) {
            UCropActivity.this.mo25191h0(th);
            UCropActivity.this.finish();
        }
    }

    static {
        C0066e.m254A(true);
    }

    /* renamed from: V */
    private void m34251V() {
        if (this.f26996e0 == null) {
            this.f26996e0 = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, C10141d.toolbar);
            this.f26996e0.setLayoutParams(layoutParams);
            this.f26996e0.setClickable(true);
        }
        ((RelativeLayout) findViewById(C10141d.ucrop_photobox)).addView(this.f26996e0);
    }

    /* renamed from: W */
    private void m34252W(int i) {
        C2224z.m9415a((ViewGroup) findViewById(C10141d.ucrop_photobox), this.f26997f0);
        int i2 = 0;
        this.f26989X.findViewById(C10141d.text_view_scale).setVisibility(i == C10141d.state_scale ? 0 : 8);
        this.f26987V.findViewById(C10141d.text_view_crop).setVisibility(i == C10141d.state_aspect_ratio ? 0 : 8);
        View findViewById = this.f26988W.findViewById(C10141d.text_view_rotate);
        if (i != C10141d.state_rotate) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
    }

    /* renamed from: Y */
    private void m34253Y() {
        UCropView uCropView = (UCropView) findViewById(C10141d.ucrop);
        this.f26984S = uCropView;
        this.f26985T = uCropView.getCropImageView();
        this.f26986U = this.f26984S.getOverlayView();
        this.f26985T.setTransformImageListener(this.f27001j0);
        ((ImageView) findViewById(C10141d.image_view_logo)).setColorFilter(this.f26981P, PorterDuff.Mode.SRC_ATOP);
        int i = C10141d.ucrop_frame;
        findViewById(i).setBackgroundColor(this.f26978M);
        if (!this.f26982Q) {
            ((RelativeLayout.LayoutParams) findViewById(i).getLayoutParams()).bottomMargin = 0;
            findViewById(i).requestLayout();
        }
    }

    /* renamed from: Z */
    private void m34254Z(Intent intent) {
        GestureCropImageView gestureCropImageView;
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.CompressionFormatName");
        Bitmap.CompressFormat valueOf = !TextUtils.isEmpty(stringExtra) ? Bitmap.CompressFormat.valueOf(stringExtra) : null;
        if (valueOf == null) {
            valueOf = f26972G;
        }
        this.f26998g0 = valueOf;
        this.f26999h0 = intent.getIntExtra("com.yalantis.ucrop.CompressionQuality", 90);
        int[] intArrayExtra = intent.getIntArrayExtra("com.yalantis.ucrop.AllowedGestures");
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.f27000i0 = intArrayExtra;
        }
        this.f26985T.setMaxBitmapSize(intent.getIntExtra("com.yalantis.ucrop.MaxBitmapSize", 0));
        this.f26985T.setMaxScaleMultiplier(intent.getFloatExtra("com.yalantis.ucrop.MaxScaleMultiplier", 10.0f));
        this.f26985T.setImageToWrapCropBoundsAnimDuration((long) intent.getIntExtra("com.yalantis.ucrop.ImageToCropBoundsAnimDuration", 500));
        this.f26986U.setFreestyleCropEnabled(intent.getBooleanExtra("com.yalantis.ucrop.FreeStyleCrop", false));
        this.f26986U.setDimmedColor(intent.getIntExtra("com.yalantis.ucrop.DimmedLayerColor", getResources().getColor(C10138a.ucrop_color_default_dimmed)));
        this.f26986U.setCircleDimmedLayer(intent.getBooleanExtra("com.yalantis.ucrop.CircleDimmedLayer", false));
        this.f26986U.setShowCropFrame(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropFrame", true));
        this.f26986U.setCropFrameColor(intent.getIntExtra("com.yalantis.ucrop.CropFrameColor", getResources().getColor(C10138a.ucrop_color_default_crop_frame)));
        this.f26986U.setCropFrameStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropFrameStrokeWidth", getResources().getDimensionPixelSize(C10139b.ucrop_default_crop_frame_stoke_width)));
        this.f26986U.setShowCropGrid(intent.getBooleanExtra("com.yalantis.ucrop.ShowCropGrid", true));
        this.f26986U.setCropGridRowCount(intent.getIntExtra("com.yalantis.ucrop.CropGridRowCount", 2));
        this.f26986U.setCropGridColumnCount(intent.getIntExtra("com.yalantis.ucrop.CropGridColumnCount", 2));
        OverlayView overlayView = this.f26986U;
        Resources resources = getResources();
        int i = C10138a.ucrop_color_default_crop_grid;
        overlayView.setCropGridColor(intent.getIntExtra("com.yalantis.ucrop.CropGridColor", resources.getColor(i)));
        this.f26986U.setCropGridCornerColor(intent.getIntExtra("com.yalantis.ucrop.CropGridCornerColor", getResources().getColor(i)));
        this.f26986U.setCropGridStrokeWidth(intent.getIntExtra("com.yalantis.ucrop.CropGridStrokeWidth", getResources().getDimensionPixelSize(C10139b.ucrop_default_crop_grid_stoke_width)));
        float f = 0.0f;
        float floatExtra = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioX", 0.0f);
        float floatExtra2 = intent.getFloatExtra("com.yalantis.ucrop.AspectRatioY", 0.0f);
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (floatExtra <= 0.0f || floatExtra2 <= 0.0f) {
            if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
                gestureCropImageView = this.f26985T;
            } else {
                gestureCropImageView = this.f26985T;
                f = ((C10153a) parcelableArrayListExtra.get(intExtra)).mo25241b() / ((C10153a) parcelableArrayListExtra.get(intExtra)).mo25242c();
            }
            gestureCropImageView.setTargetAspectRatio(f);
        } else {
            ViewGroup viewGroup = this.f26987V;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            this.f26985T.setTargetAspectRatio(floatExtra / floatExtra2);
        }
        int intExtra2 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeX", 0);
        int intExtra3 = intent.getIntExtra("com.yalantis.ucrop.MaxSizeY", 0);
        if (intExtra2 > 0 && intExtra3 > 0) {
            this.f26985T.setMaxResultImageSizeX(intExtra2);
            this.f26985T.setMaxResultImageSizeY(intExtra3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m34255a0() {
        GestureCropImageView gestureCropImageView = this.f26985T;
        gestureCropImageView.mo25360x(-gestureCropImageView.getCurrentAngle());
        this.f26985T.mo25362z();
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m34256b0(int i) {
        this.f26985T.mo25360x((float) i);
        this.f26985T.mo25362z();
    }

    /* renamed from: c0 */
    private void m34257c0(int i) {
        GestureCropImageView gestureCropImageView = this.f26985T;
        int[] iArr = this.f27000i0;
        boolean z = false;
        gestureCropImageView.setScaleEnabled(iArr[i] == 3 || iArr[i] == 1);
        GestureCropImageView gestureCropImageView2 = this.f26985T;
        int[] iArr2 = this.f27000i0;
        if (iArr2[i] == 3 || iArr2[i] == 2) {
            z = true;
        }
        gestureCropImageView2.setRotateEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m34258d0(float f) {
        TextView textView = this.f26994c0;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f°", new Object[]{Float.valueOf(f)}));
        }
    }

    /* renamed from: e0 */
    private void m34259e0(int i) {
        TextView textView = this.f26994c0;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    /* renamed from: f0 */
    private void m34260f0(Intent intent) {
        Throwable e;
        Uri uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.InputUri");
        Uri uri2 = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
        m34254Z(intent);
        if (uri == null || uri2 == null) {
            e = new NullPointerException(getString(C10144g.ucrop_error_input_data_is_absent));
        } else {
            try {
                this.f26985T.mo25377n(uri, uri2);
                return;
            } catch (Exception e2) {
                e = e2;
            }
        }
        mo25191h0(e);
        finish();
    }

    /* renamed from: g0 */
    private void m34261g0() {
        if (this.f26982Q) {
            m34265m0(this.f26987V.getVisibility() == 0 ? C10141d.state_aspect_ratio : C10141d.state_scale);
        } else {
            m34257c0(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m34262j0(float f) {
        TextView textView = this.f26995d0;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", new Object[]{Integer.valueOf((int) (f * 100.0f))}));
        }
    }

    /* renamed from: k0 */
    private void m34263k0(int i) {
        TextView textView = this.f26995d0;
        if (textView != null) {
            textView.setTextColor(i);
        }
    }

    @TargetApi(21)
    /* renamed from: l0 */
    private void m34264l0(int i) {
        Window window;
        if (Build.VERSION.SDK_INT >= 21 && (window = getWindow()) != null) {
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            window.setStatusBarColor(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public void m34265m0(int i) {
        if (this.f26982Q) {
            ViewGroup viewGroup = this.f26987V;
            int i2 = C10141d.state_aspect_ratio;
            viewGroup.setSelected(i == i2);
            ViewGroup viewGroup2 = this.f26988W;
            int i3 = C10141d.state_rotate;
            viewGroup2.setSelected(i == i3);
            ViewGroup viewGroup3 = this.f26989X;
            int i4 = C10141d.state_scale;
            viewGroup3.setSelected(i == i4);
            int i5 = 8;
            this.f26990Y.setVisibility(i == i2 ? 0 : 8);
            this.f26991Z.setVisibility(i == i3 ? 0 : 8);
            ViewGroup viewGroup4 = this.f26992a0;
            if (i == i4) {
                i5 = 0;
            }
            viewGroup4.setVisibility(i5);
            m34252W(i);
            if (i == i4) {
                m34257c0(0);
            } else if (i == i3) {
                m34257c0(1);
            } else {
                m34257c0(2);
            }
        }
    }

    /* renamed from: n0 */
    private void m34266n0() {
        m34264l0(this.f26975J);
        Toolbar toolbar = (Toolbar) findViewById(C10141d.toolbar);
        toolbar.setBackgroundColor(this.f26974I);
        toolbar.setTitleTextColor(this.f26977L);
        TextView textView = (TextView) toolbar.findViewById(C10141d.toolbar_title);
        textView.setTextColor(this.f26977L);
        textView.setText(this.f26973H);
        Drawable mutate = C1135a.m4419e(this, this.f26979N).mutate();
        mutate.setColorFilter(this.f26977L, PorterDuff.Mode.SRC_ATOP);
        toolbar.setNavigationIcon(mutate);
        mo227I(toolbar);
        C0058a B = mo221B();
        if (B != null) {
            B.mo195t(false);
        }
    }

    /* renamed from: o0 */
    private void m34267o0(Intent intent) {
        int intExtra = intent.getIntExtra("com.yalantis.ucrop.AspectRatioSelectedByDefault", 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("com.yalantis.ucrop.AspectRatioOptions");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            intExtra = 2;
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new C10153a((String) null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new C10153a((String) null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new C10153a(getString(C10144g.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new C10153a((String) null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new C10153a((String) null, 16.0f, 9.0f));
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(C10141d.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(C10142e.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.f26976K);
            aspectRatioTextView.setAspectRatio((C10153a) it.next());
            linearLayout.addView(frameLayout);
            this.f26993b0.add(frameLayout);
        }
        this.f26993b0.get(intExtra).setSelected(true);
        for (ViewGroup onClickListener : this.f26993b0) {
            onClickListener.setOnClickListener(new C10123b());
        }
    }

    /* renamed from: p0 */
    private void m34268p0() {
        this.f26994c0 = (TextView) findViewById(C10141d.text_view_rotate);
        int i = C10141d.rotate_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i)).setScrollingListener(new C10124c());
        ((HorizontalProgressWheelView) findViewById(i)).setMiddleLineColor(this.f26976K);
        findViewById(C10141d.wrapper_reset_rotate).setOnClickListener(new C10125d());
        findViewById(C10141d.wrapper_rotate_by_angle).setOnClickListener(new C10126e());
        m34259e0(this.f26976K);
    }

    /* renamed from: q0 */
    private void m34269q0() {
        this.f26995d0 = (TextView) findViewById(C10141d.text_view_scale);
        int i = C10141d.scale_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i)).setScrollingListener(new C10127f());
        ((HorizontalProgressWheelView) findViewById(i)).setMiddleLineColor(this.f26976K);
        m34263k0(this.f26976K);
    }

    /* renamed from: r0 */
    private void m34270r0() {
        ImageView imageView = (ImageView) findViewById(C10141d.image_view_state_scale);
        ImageView imageView2 = (ImageView) findViewById(C10141d.image_view_state_rotate);
        ImageView imageView3 = (ImageView) findViewById(C10141d.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new C10171i(imageView.getDrawable(), this.f26976K));
        imageView2.setImageDrawable(new C10171i(imageView2.getDrawable(), this.f26976K));
        imageView3.setImageDrawable(new C10171i(imageView3.getDrawable(), this.f26976K));
    }

    /* renamed from: s0 */
    private void m34271s0(Intent intent) {
        this.f26975J = intent.getIntExtra("com.yalantis.ucrop.StatusBarColor", C1135a.m4417c(this, C10138a.ucrop_color_statusbar));
        this.f26974I = intent.getIntExtra("com.yalantis.ucrop.ToolbarColor", C1135a.m4417c(this, C10138a.ucrop_color_toolbar));
        this.f26976K = intent.getIntExtra("com.yalantis.ucrop.UcropColorControlsWidgetActive", C1135a.m4417c(this, C10138a.ucrop_color_active_controls_color));
        this.f26977L = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarWidgetColor", C1135a.m4417c(this, C10138a.ucrop_color_toolbar_widget));
        this.f26979N = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCancelDrawable", C10140c.ucrop_ic_cross);
        this.f26980O = intent.getIntExtra("com.yalantis.ucrop.UcropToolbarCropDrawable", C10140c.f27046b);
        String stringExtra = intent.getStringExtra("com.yalantis.ucrop.UcropToolbarTitleText");
        this.f26973H = stringExtra;
        if (stringExtra == null) {
            stringExtra = getResources().getString(C10144g.ucrop_label_edit_photo);
        }
        this.f26973H = stringExtra;
        this.f26981P = intent.getIntExtra("com.yalantis.ucrop.UcropLogoColor", C1135a.m4417c(this, C10138a.ucrop_color_default_logo));
        this.f26982Q = !intent.getBooleanExtra("com.yalantis.ucrop.HideBottomControls", false);
        this.f26978M = intent.getIntExtra("com.yalantis.ucrop.UcropRootViewBackgroundColor", C1135a.m4417c(this, C10138a.ucrop_color_crop_background));
        m34266n0();
        m34253Y();
        if (this.f26982Q) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(C10141d.ucrop_photobox)).findViewById(C10141d.controls_wrapper);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(C10142e.ucrop_controls, viewGroup, true);
            C2126b bVar = new C2126b();
            this.f26997f0 = bVar;
            bVar.mo7184f0(50);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(C10141d.state_aspect_ratio);
            this.f26987V = viewGroup2;
            viewGroup2.setOnClickListener(this.f27002k0);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(C10141d.state_rotate);
            this.f26988W = viewGroup3;
            viewGroup3.setOnClickListener(this.f27002k0);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(C10141d.state_scale);
            this.f26989X = viewGroup4;
            viewGroup4.setOnClickListener(this.f27002k0);
            this.f26990Y = (ViewGroup) findViewById(C10141d.layout_aspect_ratio);
            this.f26991Z = (ViewGroup) findViewById(C10141d.layout_rotate_wheel);
            this.f26992a0 = (ViewGroup) findViewById(C10141d.layout_scale_wheel);
            m34267o0(intent);
            m34268p0();
            m34269q0();
            m34270r0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public void mo25190X() {
        this.f26996e0.setClickable(true);
        this.f26983R = true;
        mo259z();
        this.f26985T.mo25357u(this.f26998g0, this.f26999h0, new C10129h());
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public void mo25191h0(Throwable th) {
        setResult(96, new Intent().putExtra("com.yalantis.ucrop.Error", th));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public void mo25192i0(Uri uri, float f, int i, int i2, int i3, int i4) {
        setResult(-1, new Intent().putExtra("com.yalantis.ucrop.OutputUri", uri).putExtra("com.yalantis.ucrop.CropAspectRatio", f).putExtra("com.yalantis.ucrop.ImageWidth", i3).putExtra("com.yalantis.ucrop.ImageHeight", i4).putExtra("com.yalantis.ucrop.OffsetX", i).putExtra("com.yalantis.ucrop.OffsetY", i2));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C10142e.ucrop_activity_photobox);
        Intent intent = getIntent();
        m34271s0(intent);
        m34260f0(intent);
        m34261g0();
        m34251V();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C10143f.ucrop_menu_activity, menu);
        MenuItem findItem = menu.findItem(C10141d.menu_loader);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(this.f26977L, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (IllegalStateException e) {
                Log.i("UCropActivity", String.format("%s - %s", new Object[]{e.getMessage(), getString(C10144g.ucrop_mutate_exception_hint)}));
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(C10141d.menu_crop);
        Drawable e2 = C1135a.m4419e(this, this.f26980O);
        if (e2 != null) {
            e2.mutate();
            e2.setColorFilter(this.f26977L, PorterDuff.Mode.SRC_ATOP);
            findItem2.setIcon(e2);
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C10141d.menu_crop) {
            mo25190X();
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            onBackPressed();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(C10141d.menu_crop).setVisible(!this.f26983R);
        menu.findItem(C10141d.menu_loader).setVisible(this.f26983R);
        return super.onPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.f26985T;
        if (gestureCropImageView != null) {
            gestureCropImageView.mo25356t();
        }
    }
}
