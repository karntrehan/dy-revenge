package p174e.p319f.p416e.p428v.p429r;

import androidx.recyclerview.widget.RecyclerView;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import p174e.p319f.p416e.C9664j;
import p174e.p319f.p416e.p428v.C9726k;

/* renamed from: e.f.e.v.r.a */
public abstract class C9733a extends C9726k {

    /* renamed from: a */
    private final int[] f26080a = new int[4];

    /* renamed from: b */
    private final int[] f26081b;

    /* renamed from: c */
    private final float[] f26082c;

    /* renamed from: d */
    private final float[] f26083d;

    /* renamed from: e */
    private final int[] f26084e;

    /* renamed from: f */
    private final int[] f26085f;

    protected C9733a() {
        int[] iArr = new int[8];
        this.f26081b = iArr;
        this.f26082c = new float[4];
        this.f26083d = new float[4];
        this.f26084e = new int[(iArr.length / 2)];
        this.f26085f = new int[(iArr.length / 2)];
    }

    /* renamed from: h */
    protected static void m33161h(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: o */
    protected static void m33162o(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: p */
    protected static boolean m33163p(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
            int i3 = RecyclerView.UNDEFINED_DURATION;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    protected static int m33164q(int[] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (C9726k.m33121e(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw C9664j.m32854a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int[] mo24359i() {
        return this.f26081b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int[] mo24360j() {
        return this.f26080a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final int[] mo24361k() {
        return this.f26085f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final float[] mo24362l() {
        return this.f26083d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int[] mo24363m() {
        return this.f26084e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final float[] mo24364n() {
        return this.f26082c;
    }
}
