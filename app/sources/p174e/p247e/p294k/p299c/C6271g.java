package p174e.p247e.p294k.p299c;

import android.os.Build;
import com.facebook.imagepipeline.memory.C2406e0;
import com.facebook.imagepipeline.platform.C2444d;
import p174e.p247e.p294k.p302f.C6319a;

/* renamed from: e.e.k.c.g */
public class C6271g {
    /* renamed from: a */
    public static C6270f m23749a(C2406e0 e0Var, C2444d dVar, C6319a aVar) {
        int i = Build.VERSION.SDK_INT;
        return i >= 21 ? new C6265a(e0Var.mo8113b(), aVar) : i >= 11 ? new C6269e(new C6266b(e0Var.mo8118h()), dVar, aVar) : new C6267c();
    }
}
