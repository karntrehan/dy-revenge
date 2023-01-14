package p174e.p247e.p294k.p301e;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import p174e.p247e.p294k.p301e.C6314c;
import p174e.p247e.p294k.p305i.C6357c;
import p174e.p247e.p294k.p314r.C6407a;

/* renamed from: e.e.k.e.c */
public class C6314c<T extends C6314c> {

    /* renamed from: a */
    private int f17454a = 100;

    /* renamed from: b */
    private int f17455b = RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;

    /* renamed from: c */
    private boolean f17456c;

    /* renamed from: d */
    private boolean f17457d;

    /* renamed from: e */
    private boolean f17458e;

    /* renamed from: f */
    private boolean f17459f;

    /* renamed from: g */
    private Bitmap.Config f17460g;

    /* renamed from: h */
    private Bitmap.Config f17461h;

    /* renamed from: i */
    private C6357c f17462i;

    /* renamed from: j */
    private C6407a f17463j;

    /* renamed from: k */
    private ColorSpace f17464k;

    /* renamed from: l */
    private boolean f17465l;

    public C6314c() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f17460g = config;
        this.f17461h = config;
    }

    /* renamed from: a */
    public C6313b mo18674a() {
        return new C6313b(this);
    }

    /* renamed from: b */
    public Bitmap.Config mo18675b() {
        return this.f17461h;
    }

    /* renamed from: c */
    public Bitmap.Config mo18676c() {
        return this.f17460g;
    }

    /* renamed from: d */
    public C6407a mo18677d() {
        return this.f17463j;
    }

    /* renamed from: e */
    public ColorSpace mo18678e() {
        return this.f17464k;
    }

    /* renamed from: f */
    public C6357c mo18679f() {
        return this.f17462i;
    }

    /* renamed from: g */
    public boolean mo18680g() {
        return this.f17458e;
    }

    /* renamed from: h */
    public boolean mo18681h() {
        return this.f17456c;
    }

    /* renamed from: i */
    public boolean mo18682i() {
        return this.f17465l;
    }

    /* renamed from: j */
    public boolean mo18683j() {
        return this.f17459f;
    }

    /* renamed from: k */
    public int mo18684k() {
        return this.f17455b;
    }

    /* renamed from: l */
    public int mo18685l() {
        return this.f17454a;
    }

    /* renamed from: m */
    public boolean mo18686m() {
        return this.f17457d;
    }
}
