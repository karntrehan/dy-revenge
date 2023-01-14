package p027c.p064i.p069g;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;

/* renamed from: c.i.g.n */
public class C1865n {
    /* renamed from: a */
    public static boolean m7883a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
