package org.chromium.support_lib_boundary.p511a;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* renamed from: org.chromium.support_lib_boundary.a.a */
public class C10871a {
    /* renamed from: a */
    public static <T> T m36986a(Class<T> cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C10871a.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: b */
    public static boolean m36987b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (m36988c()) {
                if (collection.contains(str + ":dev")) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m36988c() {
        String str = Build.TYPE;
        return "eng".equals(str) || "userdebug".equals(str);
    }
}
