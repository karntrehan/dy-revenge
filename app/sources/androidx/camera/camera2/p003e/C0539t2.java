package androidx.camera.camera2.p003e;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.p003e.p004j3.p007t0.C0479g;

/* renamed from: androidx.camera.camera2.e.t2 */
class C0539t2 {

    /* renamed from: a */
    private static final Size f1732a = new Size(1920, 1080);

    /* renamed from: b */
    private static final Object f1733b = new Object();

    /* renamed from: c */
    private static volatile C0539t2 f1734c;

    /* renamed from: d */
    private final DisplayManager f1735d;

    /* renamed from: e */
    private volatile Size f1736e = null;

    /* renamed from: f */
    private final C0479g f1737f = new C0479g();

    private C0539t2(Context context) {
        this.f1735d = (DisplayManager) context.getSystemService("display");
    }

    /* renamed from: a */
    private Size m2135a() {
        Point point = new Point();
        mo2303c().getRealSize(point);
        Size size = point.x > point.y ? new Size(point.x, point.y) : new Size(point.y, point.x);
        int width = size.getWidth() * size.getHeight();
        Size size2 = f1732a;
        if (width > size2.getWidth() * size2.getHeight()) {
            size = size2;
        }
        return this.f1737f.mo2223a(size);
    }

    /* renamed from: b */
    static C0539t2 m2136b(Context context) {
        if (f1734c == null) {
            synchronized (f1733b) {
                if (f1734c == null) {
                    f1734c = new C0539t2(context);
                }
            }
        }
        return f1734c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Display mo2303c() {
        Display[] displays = this.f1735d.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i = -1;
        for (Display display2 : displays) {
            if (display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i2 = point.x;
                int i3 = point.y;
                if (i2 * i3 > i) {
                    display = display2;
                    i = i2 * i3;
                }
            }
        }
        if (display != null) {
            return display;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Size mo2304d() {
        if (this.f1736e != null) {
            return this.f1736e;
        }
        this.f1736e = m2135a();
        return this.f1736e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2305e() {
        this.f1736e = m2135a();
    }
}
