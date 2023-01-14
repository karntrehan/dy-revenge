package com.google.firebase.crashlytics.p139h.p149p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p142j.C4554a0;
import com.google.firebase.crashlytics.p139h.p142j.C4568h0;
import com.google.firebase.crashlytics.p139h.p142j.C4577n;
import com.google.firebase.crashlytics.p139h.p142j.C4606v;
import com.google.firebase.crashlytics.p139h.p142j.C4607w;
import com.google.firebase.crashlytics.p139h.p142j.C4608x;
import com.google.firebase.crashlytics.p139h.p146m.C4775b;
import com.google.firebase.crashlytics.p139h.p147n.C4782f;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p174e.p319f.p320a.p335c.p362h.C8961k;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8965m;
import p174e.p319f.p320a.p335c.p362h.C8969o;

/* renamed from: com.google.firebase.crashlytics.h.p.f */
public class C4796f implements C4800i {

    /* renamed from: a */
    private final Context f13515a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C4801j f13516b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4798g f13517c;

    /* renamed from: d */
    private final C4606v f13518d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C4789a f13519e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C4802k f13520f;

    /* renamed from: g */
    private final C4607w f13521g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AtomicReference<C4792d> f13522h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final AtomicReference<C8965m<C4792d>> f13523i = new AtomicReference<>(new C8965m());

    /* renamed from: com.google.firebase.crashlytics.h.p.f$a */
    class C4797a implements C8961k<Void, Void> {
        C4797a() {
        }

        /* renamed from: b */
        public C8963l<Void> mo14185a(Void voidR) {
            JSONObject a = C4796f.this.f13520f.mo14693a(C4796f.this.f13516b, true);
            if (a != null) {
                C4792d b = C4796f.this.f13517c.mo14704b(a);
                C4796f.this.f13519e.mo14691c(b.f13501c, a);
                C4796f.this.m18344q(a, "Loaded settings: ");
                C4796f fVar = C4796f.this;
                boolean unused = fVar.m18345r(fVar.f13516b.f13531f);
                C4796f.this.f13522h.set(b);
                ((C8965m) C4796f.this.f13523i.get()).mo22786e(b);
            }
            return C8969o.m29867f(null);
        }
    }

    C4796f(Context context, C4801j jVar, C4606v vVar, C4798g gVar, C4789a aVar, C4802k kVar, C4607w wVar) {
        AtomicReference<C4792d> atomicReference = new AtomicReference<>();
        this.f13522h = atomicReference;
        this.f13515a = context;
        this.f13516b = jVar;
        this.f13518d = vVar;
        this.f13517c = gVar;
        this.f13519e = aVar;
        this.f13520f = kVar;
        this.f13521g = wVar;
        atomicReference.set(C4790b.m18322b(vVar));
    }

    /* renamed from: l */
    public static C4796f m18341l(Context context, String str, C4554a0 a0Var, C4775b bVar, String str2, String str3, C4782f fVar, C4607w wVar) {
        String g = a0Var.mo14119g();
        C4568h0 h0Var = new C4568h0();
        C4798g gVar = new C4798g(h0Var);
        C4789a aVar = new C4789a(fVar);
        C4791c cVar = new C4791c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{str}), bVar);
        String h = a0Var.mo14120h();
        String i = a0Var.mo14121i();
        String j = a0Var.mo14122j();
        String h2 = C4577n.m17379h(C4577n.m17385n(context), str, str3, str2);
        return new C4796f(context, new C4801j(str, h, i, j, a0Var, h2, str3, str2, C4608x.m17545e(g).mo14233g()), h0Var, gVar, aVar, cVar, wVar);
    }

    /* renamed from: m */
    private C4792d m18342m(C4795e eVar) {
        C4792d dVar = null;
        try {
            if (C4795e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                return null;
            }
            JSONObject b = this.f13519e.mo14690b();
            if (b != null) {
                C4792d b2 = this.f13517c.mo14704b(b);
                if (b2 != null) {
                    m18344q(b, "Loaded cached settings: ");
                    long a = this.f13518d.mo14142a();
                    if (!C4795e.IGNORE_CACHE_EXPIRATION.equals(eVar)) {
                        if (b2.mo14697a(a)) {
                            C4542f.m17259f().mo14110i("Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        C4542f.m17259f().mo14110i("Returning cached settings.");
                        return b2;
                    } catch (Exception e) {
                        e = e;
                        dVar = b2;
                        C4542f.m17259f().mo14107e("Failed to get cached settings", e);
                        return dVar;
                    }
                } else {
                    C4542f.m17259f().mo14107e("Failed to parse cached settings data.", (Throwable) null);
                    return null;
                }
            } else {
                C4542f.m17259f().mo14104b("No cached settings data found.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            C4542f.m17259f().mo14107e("Failed to get cached settings", e);
            return dVar;
        }
    }

    /* renamed from: n */
    private String m18343n() {
        return C4577n.m17389r(this.f13515a).getString("existing_instance_identifier", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m18344q(JSONObject jSONObject, String str) {
        C4542f f = C4542f.m17259f();
        f.mo14104b(str + jSONObject.toString());
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: r */
    public boolean m18345r(String str) {
        SharedPreferences.Editor edit = C4577n.m17389r(this.f13515a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    /* renamed from: a */
    public C8963l<C4792d> mo14698a() {
        return this.f13523i.get().mo22782a();
    }

    /* renamed from: b */
    public C4792d mo14699b() {
        return this.f13522h.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo14700k() {
        return !m18343n().equals(this.f13516b.f13531f);
    }

    /* renamed from: o */
    public C8963l<Void> mo14701o(C4795e eVar, Executor executor) {
        C4792d m;
        if (mo14700k() || (m = m18342m(eVar)) == null) {
            C4792d m2 = m18342m(C4795e.IGNORE_CACHE_EXPIRATION);
            if (m2 != null) {
                this.f13522h.set(m2);
                this.f13523i.get().mo22786e(m2);
            }
            return this.f13521g.mo14232j(executor).mo22781q(executor, new C4797a());
        }
        this.f13522h.set(m);
        this.f13523i.get().mo22786e(m);
        return C8969o.m29867f(null);
    }

    /* renamed from: p */
    public C8963l<Void> mo14702p(Executor executor) {
        return mo14701o(C4795e.USE_CACHE, executor);
    }
}
