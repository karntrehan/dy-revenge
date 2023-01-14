package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.internal.C3505c;
import com.google.android.gms.common.internal.C3697p;
import com.google.android.gms.common.internal.C3705r;
import com.google.android.gms.common.util.C3756c;
import com.google.android.gms.common.util.C3765l;
import com.google.android.gms.common.util.C3766m;
import com.google.firebase.components.C4501n;
import com.google.firebase.components.C4505p;
import com.google.firebase.components.C4511s;
import com.google.firebase.components.C4523z;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.p160n.C4909c;
import com.google.firebase.p161o.C4917g;
import com.google.firebase.p162p.C4927b;
import com.google.firebase.p163q.C4928a;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;
import p027c.p060f.C1788a;
import p027c.p064i.p069g.C1865n;

/* renamed from: com.google.firebase.h */
public class C4825h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Object f13582a = new Object();

    /* renamed from: b */
    private static final Executor f13583b = new C4829d();

    /* renamed from: c */
    static final Map<String, C4825h> f13584c = new C1788a();

    /* renamed from: d */
    private final Context f13585d;

    /* renamed from: e */
    private final String f13586e;

    /* renamed from: f */
    private final C4872k f13587f;

    /* renamed from: g */
    private final C4511s f13588g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AtomicBoolean f13589h = new AtomicBoolean(false);

    /* renamed from: i */
    private final AtomicBoolean f13590i = new AtomicBoolean();

    /* renamed from: j */
    private final C4523z<C4928a> f13591j;

    /* renamed from: k */
    private final C4927b<C4917g> f13592k;

    /* renamed from: l */
    private final List<C4827b> f13593l = new CopyOnWriteArrayList();

    /* renamed from: m */
    private final List<C4831i> f13594m = new CopyOnWriteArrayList();

    /* renamed from: com.google.firebase.h$b */
    public interface C4827b {
        /* renamed from: a */
        void mo13997a(boolean z);
    }

    @TargetApi(14)
    /* renamed from: com.google.firebase.h$c */
    private static class C4828c implements C3505c.C3506a {

        /* renamed from: a */
        private static AtomicReference<C4828c> f13595a = new AtomicReference<>();

        private C4828c() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static void m18461c(Context context) {
            if (C3765l.m14523a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f13595a.get() == null) {
                    C4828c cVar = new C4828c();
                    if (f13595a.compareAndSet((Object) null, cVar)) {
                        C3505c.m13614c(application);
                        C3505c.m13613b().mo11269a(cVar);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo11265a(boolean z) {
            synchronized (C4825h.f13582a) {
                Iterator it = new ArrayList(C4825h.f13584c.values()).iterator();
                while (it.hasNext()) {
                    C4825h hVar = (C4825h) it.next();
                    if (hVar.f13589h.get()) {
                        hVar.m18428B(z);
                    }
                }
            }
        }
    }

    /* renamed from: com.google.firebase.h$d */
    private static class C4829d implements Executor {

        /* renamed from: f */
        private static final Handler f13596f = new Handler(Looper.getMainLooper());

        private C4829d() {
        }

        public void execute(Runnable runnable) {
            f13596f.post(runnable);
        }
    }

    @TargetApi(24)
    /* renamed from: com.google.firebase.h$e */
    private static class C4830e extends BroadcastReceiver {

        /* renamed from: a */
        private static AtomicReference<C4830e> f13597a = new AtomicReference<>();

        /* renamed from: b */
        private final Context f13598b;

        public C4830e(Context context) {
            this.f13598b = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m18464b(Context context) {
            if (f13597a.get() == null) {
                C4830e eVar = new C4830e(context);
                if (f13597a.compareAndSet((Object) null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void mo14743c() {
            this.f13598b.unregisterReceiver(this);
        }

        public void onReceive(Context context, Intent intent) {
            synchronized (C4825h.f13582a) {
                for (C4825h b : C4825h.f13584c.values()) {
                    b.m18439q();
                }
            }
            mo14743c();
        }
    }

    protected C4825h(Context context, String str, C4872k kVar) {
        this.f13585d = (Context) C3705r.m14346k(context);
        this.f13586e = C3705r.m14342g(str);
        this.f13587f = (C4872k) C3705r.m14346k(kVar);
        C4511s d = C4511s.m17156f(f13583b).mo14042c(C4505p.m17147b(context, ComponentDiscoveryService.class).mo14035a()).mo14041b(new FirebaseCommonRegistrar()).mo14040a(C4501n.m17126n(context, Context.class, new Class[0])).mo14040a(C4501n.m17126n(this, C4825h.class, new Class[0])).mo14040a(C4501n.m17126n(kVar, C4872k.class, new Class[0])).mo14043d();
        this.f13588g = d;
        this.f13591j = new C4523z<>(new C4480b(this, context));
        this.f13592k = d.mo14014b(C4917g.class);
        mo14728e(new C4465a(this));
    }

    /* renamed from: A */
    private static String m18427A(String str) {
        return str.trim();
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m18428B(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (C4827b a : this.f13593l) {
            a.mo13997a(z);
        }
    }

    /* renamed from: C */
    private void m18429C() {
        for (C4831i a : this.f13594m) {
            a.mo14745a(this.f13586e, this.f13587f);
        }
    }

    /* renamed from: f */
    private void m18434f() {
        C3705r.m14350o(!this.f13590i.get(), "FirebaseApp was deleted");
    }

    /* renamed from: i */
    private static List<String> m18435i() {
        ArrayList arrayList = new ArrayList();
        synchronized (f13582a) {
            for (C4825h n : f13584c.values()) {
                arrayList.add(n.mo14734n());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: k */
    public static List<C4825h> m18436k(Context context) {
        ArrayList arrayList;
        synchronized (f13582a) {
            arrayList = new ArrayList(f13584c.values());
        }
        return arrayList;
    }

    /* renamed from: l */
    public static C4825h m18437l() {
        C4825h hVar;
        synchronized (f13582a) {
            hVar = f13584c.get("[DEFAULT]");
            if (hVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C3766m.m14534a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return hVar;
    }

    /* renamed from: m */
    public static C4825h m18438m(String str) {
        C4825h hVar;
        String str2;
        synchronized (f13582a) {
            hVar = f13584c.get(m18427A(str));
            if (hVar != null) {
                hVar.f13592k.get().mo14923j();
            } else {
                List<String> i = m18435i();
                if (i.isEmpty()) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", i);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", new Object[]{str, str2}));
            }
        }
        return hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m18439q() {
        if (!C1865n.m7883a(this.f13585d)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + mo14734n());
            C4830e.m18464b(this.f13585d);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + mo14734n());
        this.f13588g.mo14038i(mo14739v());
        this.f13592k.get().mo14923j();
    }

    /* renamed from: r */
    public static C4825h m18440r(Context context) {
        synchronized (f13582a) {
            if (f13584c.containsKey("[DEFAULT]")) {
                C4825h l = m18437l();
                return l;
            }
            C4872k a = C4872k.m18636a(context);
            if (a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            C4825h s = m18441s(context, a);
            return s;
        }
    }

    /* renamed from: s */
    public static C4825h m18441s(Context context, C4872k kVar) {
        return m18442t(context, kVar, "[DEFAULT]");
    }

    /* renamed from: t */
    public static C4825h m18442t(Context context, C4872k kVar, String str) {
        C4825h hVar;
        C4828c.m18461c(context);
        String A = m18427A(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f13582a) {
            Map<String, C4825h> map = f13584c;
            boolean z = !map.containsKey(A);
            C3705r.m14350o(z, "FirebaseApp name " + A + " already exists!");
            C3705r.m14347l(context, "Application context cannot be null.");
            hVar = new C4825h(context, A, kVar);
            map.put(A, hVar);
        }
        hVar.m18439q();
        return hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ C4928a mo14740x(Context context) {
        return new C4928a(context, mo14736p(), (C4909c) this.f13588g.mo14013a(C4909c.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void mo14741z(boolean z) {
        if (!z) {
            this.f13592k.get().mo14923j();
        }
    }

    /* renamed from: D */
    public void mo14725D(boolean z) {
        boolean z2;
        m18434f();
        if (this.f13589h.compareAndSet(!z, z)) {
            boolean d = C3505c.m13613b().mo11270d();
            if (z && d) {
                z2 = true;
            } else if (!z && d) {
                z2 = false;
            } else {
                return;
            }
            m18428B(z2);
        }
    }

    /* renamed from: E */
    public void mo14726E(Boolean bool) {
        m18434f();
        this.f13591j.get().mo14936e(bool);
    }

    @Deprecated
    /* renamed from: F */
    public void mo14727F(boolean z) {
        mo14726E(Boolean.valueOf(z));
    }

    /* renamed from: e */
    public void mo14728e(C4827b bVar) {
        m18434f();
        if (this.f13589h.get() && C3505c.m13613b().mo11270d()) {
            bVar.mo13997a(true);
        }
        this.f13593l.add(bVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4825h)) {
            return false;
        }
        return this.f13586e.equals(((C4825h) obj).mo14734n());
    }

    /* renamed from: g */
    public void mo14730g() {
        if (this.f13590i.compareAndSet(false, true)) {
            synchronized (f13582a) {
                f13584c.remove(this.f13586e);
            }
            m18429C();
        }
    }

    /* renamed from: h */
    public <T> T mo14731h(Class<T> cls) {
        m18434f();
        return this.f13588g.mo14013a(cls);
    }

    public int hashCode() {
        return this.f13586e.hashCode();
    }

    /* renamed from: j */
    public Context mo14733j() {
        m18434f();
        return this.f13585d;
    }

    /* renamed from: n */
    public String mo14734n() {
        m18434f();
        return this.f13586e;
    }

    /* renamed from: o */
    public C4872k mo14735o() {
        m18434f();
        return this.f13587f;
    }

    /* renamed from: p */
    public String mo14736p() {
        return C3756c.m14503a(mo14734n().getBytes(Charset.defaultCharset())) + "+" + C3756c.m14503a(mo14735o().mo14828c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return C3697p.m14325d(this).mo11646a("name", this.f13586e).mo11646a("options", this.f13587f).toString();
    }

    /* renamed from: u */
    public boolean mo14738u() {
        m18434f();
        return this.f13591j.get().mo14935b();
    }

    /* renamed from: v */
    public boolean mo14739v() {
        return "[DEFAULT]".equals(mo14734n());
    }
}
