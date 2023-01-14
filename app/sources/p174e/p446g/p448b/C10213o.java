package p174e.p446g.p448b;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

/* renamed from: e.g.b.o */
public final class C10213o extends C10200h<C10213o> {

    /* renamed from: L */
    public static final C10214a f27377L = new C10214a((C10452g) null);

    /* renamed from: M */
    private boolean f27378M;

    /* renamed from: N */
    private boolean f27379N;

    /* renamed from: e.g.b.o$a */
    public static final class C10214a {
        private C10214a() {
        }

        public /* synthetic */ C10214a(C10452g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final boolean m34684b(View view, MotionEvent motionEvent) {
            return (view instanceof ViewGroup) && ((ViewGroup) view).onInterceptTouchEvent(motionEvent);
        }
    }

    /* renamed from: e.g.b.o$b */
    public interface C10215b {
        /* renamed from: a */
        boolean mo24654a();

        /* renamed from: b */
        void mo24655b();
    }

    public C10213o() {
        mo25463x0(true);
    }

    /* renamed from: I0 */
    private final void m34674I0() {
        View R = mo25431R();
        if (R instanceof C10215b) {
            ((C10215b) R).mo24655b();
        }
    }

    /* renamed from: J0 */
    private final boolean m34675J0() {
        View R = mo25431R();
        if (R instanceof C10215b) {
            return ((C10215b) R).mo24654a();
        }
        return true;
    }

    /* renamed from: A0 */
    public boolean mo25408A0(C10200h<?> hVar) {
        C10457l.m35320e(hVar, "handler");
        return !this.f27379N;
    }

    /* renamed from: B0 */
    public boolean mo25410B0(C10200h<?> hVar) {
        C10457l.m35320e(hVar, "handler");
        if ((hVar instanceof C10213o) && hVar.mo25427N() == 4 && ((C10213o) hVar).f27379N) {
            return false;
        }
        boolean z = !this.f27379N;
        return !(mo25427N() == 4 && hVar.mo25427N() == 4 && z) && mo25427N() == 4 && z;
    }

    /* renamed from: K0 */
    public final C10213o mo25487K0(boolean z) {
        this.f27379N = z;
        return this;
    }

    /* renamed from: L0 */
    public final C10213o mo25488L0(boolean z) {
        this.f27378M = z;
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public void mo24741d0() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        obtain.setAction(3);
        View R = mo25431R();
        C10457l.m35317b(R);
        R.onTouchEvent(obtain);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public void mo24742e0(MotionEvent motionEvent) {
        C10457l.m35320e(motionEvent, "event");
        View R = mo25431R();
        C10457l.m35317b(R);
        if (motionEvent.getActionMasked() == 1) {
            R.onTouchEvent(motionEvent);
            if ((mo25427N() == 0 || mo25427N() == 2) && R.isPressed()) {
                mo25441i();
            }
            mo25465z();
            m34674I0();
        } else if (mo25427N() == 0 || mo25427N() == 2) {
            if (this.f27378M) {
                boolean unused = f27377L.m34684b(R, motionEvent);
            } else if (!f27377L.m34684b(R, motionEvent)) {
                if (mo25427N() == 2) {
                    return;
                }
                if (m34675J0()) {
                    mo25446n();
                    return;
                } else {
                    mo25448o();
                    return;
                }
            }
            R.onTouchEvent(motionEvent);
            mo25441i();
        } else if (mo25427N() == 4) {
            R.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: j0 */
    public void mo25407j0() {
        super.mo25407j0();
        this.f27378M = false;
        this.f27379N = false;
    }
}
