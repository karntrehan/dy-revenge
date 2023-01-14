package p174e.p247e.p274h.p288i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import p174e.p247e.p253d.p257d.C6058j;
import p174e.p247e.p274h.p287h.C6232a;
import p174e.p247e.p274h.p287h.C6233b;
import p174e.p247e.p274h.p288i.C6236a;
import p174e.p247e.p294k.p312p.C6394b;

/* renamed from: e.e.h.i.c */
public class C6239c<DH extends C6233b> extends ImageView {

    /* renamed from: f */
    private static boolean f17278f = false;

    /* renamed from: o */
    private final C6236a.C6237a f17279o = new C6236a.C6237a();

    /* renamed from: p */
    private float f17280p = 0.0f;

    /* renamed from: q */
    private C6238b<DH> f17281q;

    /* renamed from: r */
    private boolean f17282r = false;

    /* renamed from: s */
    private boolean f17283s = false;

    public C6239c(Context context) {
        super(context);
        m23660c(context);
    }

    /* renamed from: c */
    private void m23660c(Context context) {
        try {
            if (C6394b.m24481d()) {
                C6394b.m24478a("DraweeView#init");
            }
            if (!this.f17282r) {
                boolean z = true;
                this.f17282r = true;
                this.f17281q = C6238b.m23645e(null, context);
                if (Build.VERSION.SDK_INT >= 21) {
                    ColorStateList imageTintList = getImageTintList();
                    if (imageTintList != null) {
                        setColorFilter(imageTintList.getDefaultColor());
                    } else if (C6394b.m24481d()) {
                        C6394b.m24479b();
                        return;
                    } else {
                        return;
                    }
                }
                if (!f17278f || context.getApplicationInfo().targetSdkVersion < 24) {
                    z = false;
                }
                this.f17283s = z;
                if (C6394b.m24481d()) {
                    C6394b.m24479b();
                }
            }
        } finally {
            if (C6394b.m24481d()) {
                C6394b.m24479b();
            }
        }
    }

    /* renamed from: d */
    private void m23661d() {
        Drawable drawable;
        if (this.f17283s && (drawable = getDrawable()) != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        f17278f = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18527a() {
        this.f17281q.mo18520k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18528b() {
        this.f17281q.mo18521l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo18529e() {
        mo18527a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo18530f() {
        mo18528b();
    }

    public float getAspectRatio() {
        return this.f17280p;
    }

    public C6232a getController() {
        return this.f17281q.mo18516g();
    }

    public DH getHierarchy() {
        return this.f17281q.mo18517h();
    }

    public Drawable getTopLevelDrawable() {
        return this.f17281q.mo18518i();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m23661d();
        mo18529e();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m23661d();
        mo18530f();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        m23661d();
        mo18529e();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C6236a.C6237a aVar = this.f17279o;
        aVar.f17270a = i;
        aVar.f17271b = i2;
        C6236a.m23642b(aVar, this.f17280p, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        C6236a.C6237a aVar2 = this.f17279o;
        super.onMeasure(aVar2.f17270a, aVar2.f17271b);
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        m23661d();
        mo18530f();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f17281q.mo18522m(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        m23661d();
    }

    public void setAspectRatio(float f) {
        if (f != this.f17280p) {
            this.f17280p = f;
            requestLayout();
        }
    }

    public void setController(C6232a aVar) {
        this.f17281q.mo18524o(aVar);
        super.setImageDrawable(this.f17281q.mo18518i());
    }

    public void setHierarchy(DH dh) {
        this.f17281q.mo18525p(dh);
        super.setImageDrawable(this.f17281q.mo18518i());
    }

    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        m23660c(getContext());
        this.f17281q.mo18524o((C6232a) null);
        super.setImageBitmap(bitmap);
    }

    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        m23660c(getContext());
        this.f17281q.mo18524o((C6232a) null);
        super.setImageDrawable(drawable);
    }

    @Deprecated
    public void setImageResource(int i) {
        m23660c(getContext());
        this.f17281q.mo18524o((C6232a) null);
        super.setImageResource(i);
    }

    @Deprecated
    public void setImageURI(Uri uri) {
        m23660c(getContext());
        this.f17281q.mo18524o((C6232a) null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.f17283s = z;
    }

    public String toString() {
        C6058j.C6060b c = C6058j.m22827c(this);
        C6238b<DH> bVar = this.f17281q;
        return c.mo18044b("holder", bVar != null ? bVar.toString() : "<no holder set>").toString();
    }
}
