package p027c.p043d.p053b;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C1011z2;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0765d;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.content.C1135a;
import androidx.core.util.C1177h;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p027c.p043d.p053b.C1766u;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: c.d.b.y */
final class C1773y extends C1766u {

    /* renamed from: e */
    TextureView f5255e;

    /* renamed from: f */
    SurfaceTexture f5256f;

    /* renamed from: g */
    C9172b<C1011z2.C1017f> f5257g;

    /* renamed from: h */
    C1011z2 f5258h;

    /* renamed from: i */
    boolean f5259i = false;

    /* renamed from: j */
    SurfaceTexture f5260j;

    /* renamed from: k */
    AtomicReference<C1814b.C1815a<Void>> f5261k = new AtomicReference<>();

    /* renamed from: l */
    C1766u.C1767a f5262l;

    /* renamed from: c.d.b.y$a */
    class C1774a implements TextureView.SurfaceTextureListener {

        /* renamed from: c.d.b.y$a$a */
        class C1775a implements C0765d<C1011z2.C1017f> {

            /* renamed from: a */
            final /* synthetic */ SurfaceTexture f5264a;

            C1775a(SurfaceTexture surfaceTexture) {
                this.f5264a = surfaceTexture;
            }

            /* renamed from: b */
            public void mo1981b(Throwable th) {
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            }

            /* renamed from: c */
            public void mo1980a(C1011z2.C1017f fVar) {
                C1177h.m4586h(fVar.mo2789a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                C0949o2.m3688a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                this.f5264a.release();
                C1773y yVar = C1773y.this;
                if (yVar.f5260j != null) {
                    yVar.f5260j = null;
                }
            }
        }

        C1774a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C0949o2.m3688a("TextureViewImpl", "SurfaceTexture available. Size: " + i + "x" + i2);
            C1773y yVar = C1773y.this;
            yVar.f5256f = surfaceTexture;
            if (yVar.f5257g != null) {
                C1177h.m4583e(yVar.f5258h);
                C0949o2.m3688a("TextureViewImpl", "Surface invalidated " + C1773y.this.f5258h);
                C1773y.this.f5258h.mo3294c().mo3001a();
                return;
            }
            yVar.mo6040u();
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C1773y yVar = C1773y.this;
            yVar.f5256f = null;
            C9172b<C1011z2.C1017f> bVar = yVar.f5257g;
            if (bVar != null) {
                C0768f.m3075a(bVar, new C1775a(surfaceTexture), C1135a.m4422h(C1773y.this.f5255e.getContext()));
                C1773y.this.f5260j = surfaceTexture;
                return false;
            }
            C0949o2.m3688a("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C0949o2.m3688a("TextureViewImpl", "SurfaceTexture size changed: " + i + "x" + i2);
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C1814b.C1815a andSet = C1773y.this.f5261k.getAndSet((Object) null);
            if (andSet != null) {
                andSet.mo6308c(null);
            }
        }
    }

    C1773y(FrameLayout frameLayout, C1757s sVar) {
        super(frameLayout, sVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void mo6036l(C1011z2 z2Var) {
        C1011z2 z2Var2 = this.f5258h;
        if (z2Var2 != null && z2Var2 == z2Var) {
            this.f5258h = null;
            this.f5257g = null;
        }
        m7493s();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object mo6037n(Surface surface, C1814b.C1815a aVar) {
        C0949o2.m3688a("TextureViewImpl", "Surface set on Preview.");
        C1011z2 z2Var = this.f5258h;
        Executor a = C0744a.m3044a();
        Objects.requireNonNull(aVar);
        z2Var.mo3298o(surface, a, new C1752p(aVar));
        return "provideSurface[request=" + this.f5258h + " surface=" + surface + "]";
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void mo6038p(Surface surface, C9172b bVar, C1011z2 z2Var) {
        C0949o2.m3688a("TextureViewImpl", "Safe to release surface.");
        m7493s();
        surface.release();
        if (this.f5257g == bVar) {
            this.f5257g = null;
        }
        if (this.f5258h == z2Var) {
            this.f5258h = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object mo6039r(C1814b.C1815a aVar) {
        this.f5261k.set(aVar);
        return "textureViewImpl_waitForNextFrame";
    }

    /* renamed from: s */
    private void m7493s() {
        C1766u.C1767a aVar = this.f5262l;
        if (aVar != null) {
            aVar.mo5966a();
            this.f5262l = null;
        }
    }

    /* renamed from: t */
    private void m7494t() {
        SurfaceTexture surfaceTexture;
        if (this.f5259i && this.f5260j != null && this.f5255e.getSurfaceTexture() != (surfaceTexture = this.f5260j)) {
            this.f5255e.setSurfaceTexture(surfaceTexture);
            this.f5260j = null;
            this.f5259i = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo6018b() {
        return this.f5255e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap mo6019c() {
        TextureView textureView = this.f5255e;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.f5255e.getBitmap();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6020d() {
        m7494t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6021e() {
        this.f5259i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo6023g(C1011z2 z2Var, C1766u.C1767a aVar) {
        this.f5237a = z2Var.mo3295d();
        this.f5262l = aVar;
        mo6035j();
        C1011z2 z2Var2 = this.f5258h;
        if (z2Var2 != null) {
            z2Var2.mo3301r();
        }
        this.f5258h = z2Var;
        z2Var.mo3292a(C1135a.m4422h(this.f5255e.getContext()), new C1748l(this, z2Var));
        mo6040u();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C9172b<Void> mo6025i() {
        return C1814b.m7736a(new C1747k(this));
    }

    /* renamed from: j */
    public void mo6035j() {
        C1177h.m4583e(this.f5238b);
        C1177h.m4583e(this.f5237a);
        TextureView textureView = new TextureView(this.f5238b.getContext());
        this.f5255e = textureView;
        textureView.setLayoutParams(new FrameLayout.LayoutParams(this.f5237a.getWidth(), this.f5237a.getHeight()));
        this.f5255e.setSurfaceTextureListener(new C1774a());
        this.f5238b.removeAllViews();
        this.f5238b.addView(this.f5255e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo6040u() {
        SurfaceTexture surfaceTexture;
        Size size = this.f5237a;
        if (size != null && (surfaceTexture = this.f5256f) != null && this.f5258h != null) {
            surfaceTexture.setDefaultBufferSize(size.getWidth(), this.f5237a.getHeight());
            Surface surface = new Surface(this.f5256f);
            C1011z2 z2Var = this.f5258h;
            C9172b<C1011z2.C1017f> a = C1814b.m7736a(new C1750n(this, surface));
            this.f5257g = a;
            a.mo2919e(new C1749m(this, surface, a, z2Var), C1135a.m4422h(this.f5255e.getContext()));
            mo6022f();
        }
    }
}
