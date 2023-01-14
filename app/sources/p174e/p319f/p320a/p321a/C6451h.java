package p174e.p319f.p320a.p321a;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.OrientationEventListener;

/* renamed from: e.f.a.a.h */
abstract class C6451h {

    /* renamed from: a */
    static final SparseIntArray f17983a;

    /* renamed from: b */
    private final OrientationEventListener f17984b;

    /* renamed from: c */
    Display f17985c;

    /* renamed from: d */
    private int f17986d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f17987e = 0;

    /* renamed from: e.f.a.a.h$a */
    class C6452a extends OrientationEventListener {

        /* renamed from: a */
        private int f17988a = -1;

        C6452a(Context context) {
            super(context);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onOrientationChanged(int r6) {
            /*
                r5 = this;
                r0 = -1
                if (r6 == r0) goto L_0x0058
                e.f.a.a.h r0 = p174e.p319f.p320a.p321a.C6451h.this
                android.view.Display r1 = r0.f17985c
                if (r1 != 0) goto L_0x000a
                goto L_0x0058
            L_0x000a:
                r1 = 315(0x13b, float:4.41E-43)
                r2 = 0
                if (r6 > r1) goto L_0x002d
                r3 = 45
                if (r6 >= r3) goto L_0x0014
                goto L_0x002d
            L_0x0014:
                r4 = 135(0x87, float:1.89E-43)
                if (r6 <= r3) goto L_0x001d
                if (r6 >= r4) goto L_0x001d
                r6 = 90
                goto L_0x002e
            L_0x001d:
                r3 = 225(0xe1, float:3.15E-43)
                if (r6 <= r4) goto L_0x0026
                if (r6 >= r3) goto L_0x0026
                r6 = 180(0xb4, float:2.52E-43)
                goto L_0x002e
            L_0x0026:
                if (r6 <= r3) goto L_0x002d
                if (r6 >= r1) goto L_0x002d
                r6 = 270(0x10e, float:3.78E-43)
                goto L_0x002e
            L_0x002d:
                r6 = 0
            L_0x002e:
                int r0 = r0.f17987e
                r1 = 1
                if (r0 == r6) goto L_0x003b
                e.f.a.a.h r0 = p174e.p319f.p320a.p321a.C6451h.this
                int unused = r0.f17987e = r6
                r2 = 1
            L_0x003b:
                e.f.a.a.h r6 = p174e.p319f.p320a.p321a.C6451h.this
                android.view.Display r6 = r6.f17985c
                int r6 = r6.getRotation()
                int r0 = r5.f17988a
                if (r0 == r6) goto L_0x004a
                r5.f17988a = r6
                goto L_0x004b
            L_0x004a:
                r1 = r2
            L_0x004b:
                if (r1 == 0) goto L_0x0058
                e.f.a.a.h r0 = p174e.p319f.p320a.p321a.C6451h.this
                android.util.SparseIntArray r1 = p174e.p319f.p320a.p321a.C6451h.f17983a
                int r6 = r1.get(r6)
                r0.mo19187d(r6)
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p321a.C6451h.C6452a.onOrientationChanged(int):void");
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f17983a = sparseIntArray;
        sparseIntArray.put(0, 0);
        sparseIntArray.put(1, 90);
        sparseIntArray.put(2, 180);
        sparseIntArray.put(3, 270);
    }

    public C6451h(Context context) {
        this.f17984b = new C6452a(context);
    }

    /* renamed from: c */
    public void mo19186c() {
        this.f17984b.disable();
        this.f17985c = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo19187d(int i) {
        this.f17986d = i;
        mo19163g(i, this.f17987e);
    }

    /* renamed from: e */
    public void mo19188e(Display display) {
        this.f17985c = display;
        this.f17984b.enable();
        mo19187d(f17983a.get(display.getRotation()));
    }

    /* renamed from: f */
    public int mo19189f() {
        return this.f17986d;
    }

    /* renamed from: g */
    public abstract void mo19163g(int i, int i2);
}
