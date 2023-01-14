package p496io.invertase.firebase.app;

import android.content.Context;
import android.util.Log;

/* renamed from: io.invertase.firebase.app.a */
public class C10652a {

    /* renamed from: a */
    private static Context f28122a;

    /* renamed from: a */
    public static Context m36272a() {
        return f28122a;
    }

    /* renamed from: b */
    public static void m36273b(Context context) {
        Log.d("ReactNativeFirebaseApp", "received application context.");
        f28122a = context;
    }
}
