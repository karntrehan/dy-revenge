package p174e.p319f.p406d.p407a.p409c;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import java.util.List;
import p174e.p319f.p320a.p335c.p345f.p353h.C7128h;

/* renamed from: e.f.d.a.c.m */
public class C9610m {
    /* renamed from: a */
    public static void m32725a(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        m32726b(context, C7128h.m27116p(str));
    }

    /* renamed from: b */
    public static void m32726b(@RecentlyNonNull Context context, @RecentlyNonNull List<String> list) {
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        context.sendBroadcast(intent);
    }
}
