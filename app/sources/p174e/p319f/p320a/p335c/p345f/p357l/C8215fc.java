package p174e.p319f.p320a.p335c.p345f.p357l;

import com.lwansbrough.RCTCamera.RCTCameraModule;

/* renamed from: e.f.a.c.f.l.fc */
final class C8215fc extends C8234gc {

    /* renamed from: b */
    private final byte[] f22497b;

    /* renamed from: c */
    private int f22498c;

    /* renamed from: d */
    private int f22499d;

    /* renamed from: e */
    private int f22500e = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;

    /* synthetic */ C8215fc(byte[] bArr, int i, int i2, boolean z, C8196ec ecVar) {
        super((C8196ec) null);
        this.f22497b = bArr;
        this.f22498c = 0;
    }

    /* renamed from: c */
    public final int mo21787c(int i) {
        int i2 = this.f22500e;
        this.f22500e = 0;
        int i3 = this.f22498c + this.f22499d;
        this.f22498c = i3;
        if (i3 > 0) {
            this.f22499d = i3;
            this.f22498c = 0;
        } else {
            this.f22499d = 0;
        }
        return i2;
    }
}
