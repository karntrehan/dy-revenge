package p174e.p247e.p253d.p255b;

import android.os.Handler;
import android.os.Looper;

/* renamed from: e.e.d.b.f */
public class C6041f extends C6037b {

    /* renamed from: o */
    private static C6041f f16693o;

    private C6041f() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: g */
    public static C6041f m22805g() {
        if (f16693o == null) {
            f16693o = new C6041f();
        }
        return f16693o;
    }

    public void execute(Runnable runnable) {
        if (mo18006a()) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
