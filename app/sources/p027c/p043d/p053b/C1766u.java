package p027c.p043d.p053b;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.C1011z2;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: c.d.b.u */
abstract class C1766u {

    /* renamed from: a */
    Size f5237a;

    /* renamed from: b */
    FrameLayout f5238b;

    /* renamed from: c */
    private final C1757s f5239c;

    /* renamed from: d */
    private boolean f5240d = false;

    /* renamed from: c.d.b.u$a */
    interface C1767a {
        /* renamed from: a */
        void mo5966a();
    }

    C1766u(FrameLayout frameLayout, C1757s sVar) {
        this.f5238b = frameLayout;
        this.f5239c = sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Bitmap mo6017a() {
        Bitmap c = mo6019c();
        if (c == null) {
            return null;
        }
        return this.f5239c.mo5981a(c, new Size(this.f5238b.getWidth(), this.f5238b.getHeight()), this.f5238b.getLayoutDirection());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract View mo6018b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Bitmap mo6019c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo6020d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo6021e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo6022f() {
        this.f5240d = true;
        mo6024h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo6023g(C1011z2 z2Var, C1767a aVar);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo6024h() {
        View b = mo6018b();
        if (b != null && this.f5240d) {
            this.f5239c.mo5991p(new Size(this.f5238b.getWidth(), this.f5238b.getHeight()), this.f5238b.getLayoutDirection(), b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract C9172b<Void> mo6025i();
}
