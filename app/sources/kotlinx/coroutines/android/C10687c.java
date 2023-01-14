package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Objects;
import p455g.C10315m;
import p455g.C10318n;
import p455g.p470y.p472d.C10452g;

/* renamed from: kotlinx.coroutines.android.c */
public final class C10687c {

    /* renamed from: a */
    public static final C10686b f28176a;
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        C10686b bVar = null;
        try {
            C10315m.C10316a aVar = C10315m.f27541f;
            obj = C10315m.m35012a(new C10685a(m36369a(Looper.getMainLooper(), true), (String) null, 2, (C10452g) null));
        } catch (Throwable th) {
            C10315m.C10316a aVar2 = C10315m.f27541f;
            obj = C10315m.m35012a(C10318n.m35016a(th));
        }
        if (!C10315m.m35014c(obj)) {
            bVar = obj;
        }
        f28176a = bVar;
    }

    /* renamed from: a */
    public static final Handler m36369a(Looper looper, boolean z) {
        int i;
        if (!z || (i = Build.VERSION.SDK_INT) < 16) {
            return new Handler(looper);
        }
        if (i >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", new Class[]{Looper.class}).invoke((Object) null, new Object[]{looper});
            Objects.requireNonNull(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        Class<Handler> cls = Handler.class;
        try {
            return cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
