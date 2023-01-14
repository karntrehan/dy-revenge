package p174e.p319f.p320a.p382e.p383a.p384a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.C4455a;
import com.google.android.play.core.install.C4462b;
import p174e.p319f.p320a.p382e.p383a.p389f.C9156d;

/* renamed from: e.f.a.e.a.a.g */
final class C9081g implements C9075b {

    /* renamed from: a */
    private final C9092r f24929a;

    /* renamed from: b */
    private final C9079e f24930b;

    /* renamed from: c */
    private final Context f24931c;

    /* renamed from: d */
    private final Handler f24932d = new Handler(Looper.getMainLooper());

    C9081g(C9092r rVar, C9079e eVar, Context context) {
        this.f24929a = rVar;
        this.f24930b = eVar;
        this.f24931c = context;
    }

    /* renamed from: a */
    public final C9156d<Void> mo23053a() {
        return this.f24929a.mo23068b(this.f24931c.getPackageName());
    }

    /* renamed from: b */
    public final C9156d<C9074a> mo23054b() {
        return this.f24929a.mo23067a(this.f24931c.getPackageName());
    }

    /* renamed from: c */
    public final synchronized void mo23055c(C4462b bVar) {
        this.f24930b.mo23122d(bVar);
    }

    /* renamed from: d */
    public final boolean mo23056d(C9074a aVar, int i, Activity activity, int i2) {
        return mo23062f(aVar, new C9080f(activity), C9077d.m30257c(i), i2);
    }

    /* renamed from: e */
    public final synchronized void mo23057e(C4462b bVar) {
        this.f24930b.mo23123e(bVar);
    }

    /* renamed from: f */
    public final boolean mo23062f(C9074a aVar, C4455a aVar2, C9077d dVar, int i) {
        if (!aVar.mo23048o(dVar)) {
            return false;
        }
        aVar2.mo13984a(aVar.mo23045k(dVar).getIntentSender(), i, (Intent) null, 0, 0, 0, (Bundle) null);
        return true;
    }
}
