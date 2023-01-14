package p174e.p319f.p320a.p382e.p383a.p384a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.common.C4457c;
import com.google.android.play.core.install.C4461a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9101a;
import p174e.p319f.p320a.p382e.p383a.p385b.C9120j0;
import p174e.p319f.p320a.p382e.p383a.p385b.C9121k;
import p174e.p319f.p320a.p382e.p383a.p385b.C9129o;
import p174e.p319f.p320a.p382e.p383a.p387d.C9151a;
import p174e.p319f.p320a.p382e.p383a.p389f.C9156d;
import p174e.p319f.p320a.p382e.p383a.p389f.C9158f;
import p174e.p319f.p320a.p382e.p383a.p389f.C9165m;

/* renamed from: e.f.a.e.a.a.r */
final class C9092r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C9101a f24952a = new C9101a("AppUpdateService");

    /* renamed from: b */
    private static final Intent f24953b = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: c */
    C9121k<C9120j0> f24954c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f24955d;

    /* renamed from: e */
    private final Context f24956e;

    /* renamed from: f */
    private final C9094t f24957f;

    public C9092r(Context context, C9094t tVar) {
        this.f24955d = context.getPackageName();
        this.f24956e = context;
        this.f24957f = tVar;
        if (C9129o.m30393a(context)) {
            this.f24954c = new C9121k(C9151a.m30446b(context), f24952a, "AppUpdateService", f24953b, C9086l.f24940a);
        }
    }

    /* renamed from: d */
    static /* synthetic */ Bundle m30285d(C9092r rVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(m30291j());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(rVar.f24956e.getPackageManager().getPackageInfo(rVar.f24956e.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f24952a.mo23081b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* renamed from: h */
    static /* synthetic */ C9074a m30289h(C9092r rVar, Bundle bundle, String str) {
        Bundle bundle2 = bundle;
        return C9074a.m30232a(str, bundle2.getInt("version.code", -1), bundle2.getInt("update.availability"), bundle2.getInt("install.status", 0), bundle2.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle2.getInt("client.version.staleness")), bundle2.getInt("in.app.update.priority", 0), bundle2.getLong("bytes.downloaded"), bundle2.getLong("total.bytes.to.download"), bundle2.getLong("additional.size.required"), rVar.f24957f.mo23069a(), (PendingIntent) bundle2.getParcelable("blocking.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.intent"), (PendingIntent) bundle2.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle2.getParcelable("nonblocking.destructive.intent"));
    }

    /* renamed from: i */
    private static <T> C9156d<T> m30290i() {
        f24952a.mo23081b("onError(%d)", -9);
        return C9158f.m30459c(new C4461a(-9));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static Bundle m30291j() {
        Bundle bundle = new Bundle();
        bundle.putAll(C4457c.m17033b("app_update"));
        bundle.putInt("playcore.version.code", 10901);
        return bundle;
    }

    /* renamed from: a */
    public final C9156d<C9074a> mo23067a(String str) {
        if (this.f24954c == null) {
            return m30290i();
        }
        f24952a.mo23083d("requestUpdateInfo(%s)", str);
        C9165m mVar = new C9165m();
        this.f24954c.mo23099a(new C9087m(this, mVar, str, mVar));
        return mVar.mo23141c();
    }

    /* renamed from: b */
    public final C9156d<Void> mo23068b(String str) {
        if (this.f24954c == null) {
            return m30290i();
        }
        f24952a.mo23083d("completeUpdate(%s)", str);
        C9165m mVar = new C9165m();
        this.f24954c.mo23099a(new C9088n(this, mVar, mVar, str));
        return mVar.mo23141c();
    }
}
