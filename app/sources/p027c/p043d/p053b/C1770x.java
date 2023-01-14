package p027c.p043d.p053b;

import android.graphics.Bitmap;
import android.os.Handler;
import android.util.Size;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C1011z2;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.core.content.C1135a;
import androidx.core.util.C1177h;
import p027c.p043d.p053b.C1766u;
import p174e.p319f.p390b.p391a.p392a.C9172b;

/* renamed from: c.d.b.x */
final class C1770x extends C1766u {

    /* renamed from: e */
    SurfaceView f5247e;

    /* renamed from: f */
    final C1772b f5248f = new C1772b();

    /* renamed from: g */
    private C1766u.C1767a f5249g;

    /* renamed from: c.d.b.x$a */
    private static class C1771a {
        /* renamed from: a */
        static void m7481a(SurfaceView surfaceView, Bitmap bitmap, PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, Handler handler) {
            PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }

    /* renamed from: c.d.b.x$b */
    class C1772b implements SurfaceHolder.Callback {

        /* renamed from: a */
        private Size f5250a;

        /* renamed from: b */
        private C1011z2 f5251b;

        /* renamed from: c */
        private Size f5252c;

        /* renamed from: d */
        private boolean f5253d = false;

        C1772b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
            r0 = r2.f5250a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m7482a() {
            /*
                r2 = this;
                boolean r0 = r2.f5253d
                if (r0 != 0) goto L_0x0016
                androidx.camera.core.z2 r0 = r2.f5251b
                if (r0 == 0) goto L_0x0016
                android.util.Size r0 = r2.f5250a
                if (r0 == 0) goto L_0x0016
                android.util.Size r1 = r2.f5252c
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0016
                r0 = 1
                goto L_0x0017
            L_0x0016:
                r0 = 0
            L_0x0017:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p043d.p053b.C1770x.C1772b.m7482a():boolean");
        }

        /* renamed from: b */
        private void m7483b() {
            if (this.f5251b != null) {
                C0949o2.m3688a("SurfaceViewImpl", "Request canceled: " + this.f5251b);
                this.f5251b.mo3301r();
            }
        }

        /* renamed from: c */
        private void m7484c() {
            if (this.f5251b != null) {
                C0949o2.m3688a("SurfaceViewImpl", "Surface invalidated " + this.f5251b);
                this.f5251b.mo3294c().mo3001a();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void mo6030e(C1011z2.C1017f fVar) {
            C0949o2.m3688a("SurfaceViewImpl", "Safe to release surface.");
            C1770x.this.mo6029n();
        }

        /* renamed from: g */
        private boolean m7486g() {
            Surface surface = C1770x.this.f5247e.getHolder().getSurface();
            if (!m7482a()) {
                return false;
            }
            C0949o2.m3688a("SurfaceViewImpl", "Surface set on Preview.");
            this.f5251b.mo3298o(surface, C1135a.m4422h(C1770x.this.f5247e.getContext()), new C1746j(this));
            this.f5253d = true;
            C1770x.this.mo6022f();
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo6031f(C1011z2 z2Var) {
            m7483b();
            this.f5251b = z2Var;
            Size d = z2Var.mo3295d();
            this.f5250a = d;
            this.f5253d = false;
            if (!m7486g()) {
                C0949o2.m3688a("SurfaceViewImpl", "Wait for new Surface creation.");
                C1770x.this.f5247e.getHolder().setFixedSize(d.getWidth(), d.getHeight());
            }
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C0949o2.m3688a("SurfaceViewImpl", "Surface changed. Size: " + i2 + "x" + i3);
            this.f5252c = new Size(i2, i3);
            m7486g();
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            C0949o2.m3688a("SurfaceViewImpl", "Surface created.");
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C0949o2.m3688a("SurfaceViewImpl", "Surface destroyed.");
            if (this.f5253d) {
                m7484c();
            } else {
                m7483b();
            }
            this.f5253d = false;
            this.f5251b = null;
            this.f5252c = null;
            this.f5250a = null;
        }
    }

    C1770x(FrameLayout frameLayout, C1757s sVar) {
        super(frameLayout, sVar);
    }

    /* renamed from: k */
    static /* synthetic */ void m7470k(int i) {
        if (i == 0) {
            C0949o2.m3688a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
            return;
        }
        C0949o2.m3690c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void mo6028m(C1011z2 z2Var) {
        this.f5248f.mo6031f(z2Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public View mo6018b() {
        return this.f5247e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Bitmap mo6019c() {
        SurfaceView surfaceView = this.f5247e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.f5247e.getHolder().getSurface().isValid()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.f5247e.getWidth(), this.f5247e.getHeight(), Bitmap.Config.ARGB_8888);
        SurfaceView surfaceView2 = this.f5247e;
        C1771a.m7481a(surfaceView2, createBitmap, C1745i.f5173a, surfaceView2.getHandler());
        return createBitmap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6020d() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6021e() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo6023g(C1011z2 z2Var, C1766u.C1767a aVar) {
        this.f5237a = z2Var.mo3295d();
        this.f5249g = aVar;
        mo6027j();
        z2Var.mo3292a(C1135a.m4422h(this.f5247e.getContext()), new C1751o(this));
        this.f5247e.post(new C1744h(this, z2Var));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C9172b<Void> mo6025i() {
        return C0768f.m3081g(null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6027j() {
        C1177h.m4583e(this.f5238b);
        C1177h.m4583e(this.f5237a);
        SurfaceView surfaceView = new SurfaceView(this.f5238b.getContext());
        this.f5247e = surfaceView;
        surfaceView.setLayoutParams(new FrameLayout.LayoutParams(this.f5237a.getWidth(), this.f5237a.getHeight()));
        this.f5238b.removeAllViews();
        this.f5238b.addView(this.f5247e);
        this.f5247e.getHolder().addCallback(this.f5248f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo6029n() {
        C1766u.C1767a aVar = this.f5249g;
        if (aVar != null) {
            aVar.mo5966a();
            this.f5249g = null;
        }
    }
}
