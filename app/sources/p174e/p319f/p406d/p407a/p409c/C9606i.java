package p174e.p319f.p406d.p407a.p409c;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3705r;
import com.google.firebase.components.C4501n;
import com.google.firebase.components.C4505p;
import com.google.firebase.components.C4511s;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.concurrent.atomic.AtomicReference;
import p174e.p319f.p320a.p335c.p362h.C8967n;

/* renamed from: e.f.d.a.c.i */
public class C9606i {

    /* renamed from: a */
    private static final AtomicReference<C9606i> f25697a = new AtomicReference<>();

    /* renamed from: b */
    private C4511s f25698b;

    private C9606i() {
    }

    @RecentlyNonNull
    /* renamed from: c */
    public static C9606i m32708c() {
        C9606i iVar = f25697a.get();
        C3705r.m14350o(iVar != null, "MlKitContext has not been initialized");
        return iVar;
    }

    @RecentlyNonNull
    /* renamed from: d */
    public static C9606i m32709d(@RecentlyNonNull Context context) {
        C9606i iVar = new C9606i();
        Context e = m32710e(context);
        boolean z = false;
        C4511s d = C4511s.m17156f(C8967n.f24375a).mo14042c(C4505p.m17147b(e, MlKitComponentDiscoveryService.class).mo14035a()).mo14040a(C4501n.m17126n(e, Context.class, new Class[0])).mo14040a(C4501n.m17126n(iVar, C9606i.class, new Class[0])).mo14043d();
        iVar.f25698b = d;
        d.mo14038i(true);
        if (f25697a.getAndSet(iVar) == null) {
            z = true;
        }
        C3705r.m14350o(z, "MlKitContext is already initialized");
        return iVar;
    }

    /* renamed from: e */
    private static Context m32710e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @RecentlyNonNull
    /* renamed from: a */
    public <T> T mo24097a(@RecentlyNonNull Class<T> cls) {
        C3705r.m14350o(f25697a.get() == this, "MlKitContext has been deleted");
        C3705r.m14346k(this.f25698b);
        return this.f25698b.mo14013a(cls);
    }

    @RecentlyNonNull
    /* renamed from: b */
    public Context mo24098b() {
        return (Context) mo24097a(Context.class);
    }
}
