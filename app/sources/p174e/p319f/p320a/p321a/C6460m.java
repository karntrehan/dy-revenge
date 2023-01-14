package p174e.p319f.p320a.p321a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import org.reactnative.camera.C10939a;
import org.reactnative.camera.C10940b;

@TargetApi(14)
/* renamed from: e.f.a.a.m */
class C6460m extends C6453i {

    /* renamed from: d */
    private final TextureView f17998d;

    /* renamed from: e */
    private int f17999e;

    /* renamed from: e.f.a.a.m$a */
    class C6461a implements TextureView.SurfaceTextureListener {
        C6461a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C6460m.this.mo19204n(i, i2);
            C6460m.this.mo19227o();
            C6460m.this.mo19191a();
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C6460m.this.mo19204n(0, 0);
            C6460m.this.mo19192b();
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C6460m.this.mo19204n(i, i2);
            C6460m.this.mo19227o();
            C6460m.this.mo19191a();
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    C6460m(Context context, ViewGroup viewGroup) {
        TextureView textureView = (TextureView) View.inflate(context, C10940b.texture_view, viewGroup).findViewById(C10939a.texture_view);
        this.f17998d = textureView;
        textureView.setSurfaceTextureListener(new C6461a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Class mo19194d() {
        return SurfaceTexture.class;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Surface mo19195e() {
        return new Surface(this.f17998d.getSurfaceTexture());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public View mo19198h() {
        return this.f17998d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo19200j() {
        return this.f17998d.getSurfaceTexture() != null;
    }

    /* access modifiers changed from: package-private */
    @TargetApi(15)
    /* renamed from: k */
    public void mo19201k(int i, int i2) {
        this.f17998d.getSurfaceTexture().setDefaultBufferSize(i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo19203m(int i) {
        this.f17999e = i;
        mo19227o();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo19227o() {
        Matrix matrix = new Matrix();
        int i = this.f17999e;
        if (i % 180 == 90) {
            float i2 = (float) mo19199i();
            float c = (float) mo19193c();
            matrix.setPolyToPoly(new float[]{0.0f, 0.0f, i2, 0.0f, 0.0f, c, i2, c}, 0, this.f17999e == 90 ? new float[]{0.0f, c, 0.0f, 0.0f, i2, c, i2, 0.0f} : new float[]{i2, 0.0f, i2, c, 0.0f, 0.0f, 0.0f, c}, 0, 4);
        } else if (i == 180) {
            matrix.postRotate(180.0f, (float) (mo19199i() / 2), (float) (mo19193c() / 2));
        }
        this.f17998d.setTransform(matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public SurfaceTexture mo19197g() {
        return this.f17998d.getSurfaceTexture();
    }
}
