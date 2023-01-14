package p174e.p247e.p294k.p307k;

import com.lwansbrough.RCTCamera.RCTCameraModule;

/* renamed from: e.e.k.k.h */
public class C6373h implements C6374i {

    /* renamed from: a */
    public static final C6374i f17773a = m24342d(RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO, true, true);

    /* renamed from: b */
    int f17774b;

    /* renamed from: c */
    boolean f17775c;

    /* renamed from: d */
    boolean f17776d;

    private C6373h(int i, boolean z, boolean z2) {
        this.f17774b = i;
        this.f17775c = z;
        this.f17776d = z2;
    }

    /* renamed from: d */
    public static C6374i m24342d(int i, boolean z, boolean z2) {
        return new C6373h(i, z, z2);
    }

    /* renamed from: a */
    public boolean mo18907a() {
        return this.f17776d;
    }

    /* renamed from: b */
    public boolean mo18908b() {
        return this.f17775c;
    }

    /* renamed from: c */
    public int mo18909c() {
        return this.f17774b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6373h)) {
            return false;
        }
        C6373h hVar = (C6373h) obj;
        return this.f17774b == hVar.f17774b && this.f17775c == hVar.f17775c && this.f17776d == hVar.f17776d;
    }

    public int hashCode() {
        int i = 0;
        int i2 = this.f17774b ^ (this.f17775c ? 4194304 : 0);
        if (this.f17776d) {
            i = 8388608;
        }
        return i2 ^ i;
    }
}
