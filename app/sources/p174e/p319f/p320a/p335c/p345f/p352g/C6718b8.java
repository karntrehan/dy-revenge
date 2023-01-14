package p174e.p319f.p320a.p335c.p345f.p352g;

import com.lwansbrough.RCTCamera.RCTCameraModule;

/* renamed from: e.f.a.c.f.g.b8 */
final class C6718b8 extends C6752d8 {

    /* renamed from: b */
    private final byte[] f18382b;

    /* renamed from: c */
    private int f18383c;

    /* renamed from: d */
    private int f18384d;

    /* renamed from: e */
    private int f18385e = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;

    /* synthetic */ C6718b8(byte[] bArr, int i, int i2, boolean z, C6701a8 a8Var) {
        super((C6735c8) null);
        this.f18382b = bArr;
        this.f18383c = 0;
    }

    /* renamed from: c */
    public final int mo19564c(int i) {
        int i2 = this.f18385e;
        this.f18385e = 0;
        int i3 = this.f18383c + this.f18384d;
        this.f18383c = i3;
        if (i3 > 0) {
            this.f18384d = i3;
            this.f18383c = 0;
        } else {
            this.f18384d = 0;
        }
        return i2;
    }
}
