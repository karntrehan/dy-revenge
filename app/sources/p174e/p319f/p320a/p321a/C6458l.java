package p174e.p319f.p320a.p321a;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import org.reactnative.camera.C10939a;
import org.reactnative.camera.C10940b;
import p027c.p064i.p072j.C1988t;

/* renamed from: e.f.a.a.l */
class C6458l extends C6453i {

    /* renamed from: d */
    final SurfaceView f17996d;

    /* renamed from: e.f.a.a.l$a */
    class C6459a implements SurfaceHolder.Callback {
        C6459a() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C6458l.this.mo19204n(i2, i3);
            if (!C1988t.m8360R(C6458l.this.f17996d)) {
                C6458l.this.mo19191a();
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C6458l.this.mo19204n(0, 0);
        }
    }

    C6458l(Context context, ViewGroup viewGroup) {
        SurfaceView surfaceView = (SurfaceView) View.inflate(context, C10940b.surface_view, viewGroup).findViewById(C10939a.surface_view);
        this.f17996d = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        holder.setType(3);
        holder.addCallback(new C6459a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Class mo19194d() {
        return SurfaceHolder.class;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Surface mo19195e() {
        return mo19196f().getSurface();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public SurfaceHolder mo19196f() {
        return this.f17996d.getHolder();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public View mo19198h() {
        return this.f17996d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo19200j() {
        return (mo19199i() == 0 || mo19193c() == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo19203m(int i) {
    }
}
