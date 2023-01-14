package com.facebook.imagepipeline.platform;

import android.os.Build;
import androidx.core.util.C1176g;
import com.facebook.imagepipeline.memory.C2406e0;
import com.facebook.imagepipeline.memory.C2422q;
import java.lang.reflect.InvocationTargetException;
import p174e.p247e.p294k.p302f.C6342m;

/* renamed from: com.facebook.imagepipeline.platform.e */
public class C2445e {
    /* renamed from: a */
    public static C2444d m10175a(C2406e0 e0Var, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            int e = e0Var.mo8116e();
            return new C2443c(e0Var.mo8113b(), e, new C1176g(e));
        } else if (i >= 21 || !C6342m.m24169a()) {
            int e2 = e0Var.mo8116e();
            return new C2441a(e0Var.mo8113b(), e2, new C1176g(e2));
        } else if (!z || i >= 19) {
            return (C2444d) Class.forName("com.facebook.imagepipeline.platform.KitKatPurgeableDecoder").getConstructor(new Class[]{C2422q.class}).newInstance(new Object[]{e0Var.mo8115d()});
        } else {
            try {
                return (C2444d) Class.forName("com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder").getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e5);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e6);
            } catch (InstantiationException e7) {
                throw new RuntimeException("Wrong Native code setup, reflection failed.", e7);
            }
        }
    }
}
