package p027c.p104x.p105c;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.p511a.C10871a;

/* renamed from: c.x.c.e */
public class C2256e {

    /* renamed from: c.x.c.e$a */
    private static class C2257a {

        /* renamed from: a */
        static final C2261h f6647a = new C2261h(C2256e.m9514d().getWebkitToCompatConverter());
    }

    /* renamed from: c.x.c.e$b */
    private static class C2258b {

        /* renamed from: a */
        static final C2259f f6648a = C2256e.m9511a();
    }

    /* renamed from: a */
    static C2259f m9511a() {
        if (Build.VERSION.SDK_INT < 21) {
            return new C2252b();
        }
        try {
            return new C2260g((WebViewProviderFactoryBoundaryInterface) C10871a.m36986a(WebViewProviderFactoryBoundaryInterface.class, m9512b()));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (ClassNotFoundException unused) {
            return new C2252b();
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static InvocationHandler m9512b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m9515e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke((Object) null, new Object[0]);
    }

    /* renamed from: c */
    public static C2261h m9513c() {
        return C2257a.f6647a;
    }

    /* renamed from: d */
    public static C2259f m9514d() {
        return C2258b.f6648a;
    }

    /* renamed from: e */
    public static ClassLoader m9515e() {
        return Build.VERSION.SDK_INT >= 28 ? WebView.getWebViewClassLoader() : m9516f().getClass().getClassLoader();
    }

    /* renamed from: f */
    private static Object m9516f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, new Object[0]);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw new RuntimeException(e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        }
    }
}
