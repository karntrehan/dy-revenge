package p174e.p319f.p320a.p335c.p345f.p348c;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.internal.p130z.C3735e;
import p174e.p319f.p320a.p335c.p338b.p339a.C6619a;

/* renamed from: e.f.a.c.f.c.g */
public final class C6670g {
    /* renamed from: a */
    public static PendingIntent m25318a(Context context, C6619a.C6620a aVar, HintRequest hintRequest, String str) {
        C3705r.m14347l(context, "context must not be null");
        C3705r.m14347l(hintRequest, "request must not be null");
        String a = TextUtils.isEmpty(str) ? C6666c.m25312a() : (String) C3705r.m14346k(str);
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", (String) null);
        putExtra.putExtra("logSessionId", a);
        C3735e.m14458b(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(context, 2000, putExtra, C6667d.f18327a | 134217728);
    }
}
