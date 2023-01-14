package com.google.firebase.p161o;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.firebase.C4825h;
import com.google.firebase.components.C4501n;
import com.google.firebase.components.C4504o;
import com.google.firebase.components.C4518u;
import com.google.firebase.p162p.C4927b;
import com.google.firebase.p164r.C4938i;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import p027c.p064i.p069g.C1865n;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8969o;

/* renamed from: com.google.firebase.o.g */
public class C4917g implements C4921j, C4922k {

    /* renamed from: a */
    private static final ThreadFactory f13774a = C4914d.f13770a;

    /* renamed from: b */
    private final C4927b<C4923l> f13775b;

    /* renamed from: c */
    private final Context f13776c;

    /* renamed from: d */
    private final C4927b<C4938i> f13777d;

    /* renamed from: e */
    private final Set<C4918h> f13778e;

    /* renamed from: f */
    private final Executor f13779f;

    private C4917g(Context context, String str, Set<C4918h> set, C4927b<C4938i> bVar) {
        this(new C4911a(context, str), set, new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f13774a), bVar, context);
    }

    C4917g(C4927b<C4923l> bVar, Set<C4918h> set, Executor executor, C4927b<C4938i> bVar2, Context context) {
        this.f13775b = bVar;
        this.f13778e = set;
        this.f13779f = executor;
        this.f13777d = bVar2;
        this.f13776c = context;
    }

    /* renamed from: b */
    public static C4501n<C4917g> m18762b() {
        return C4501n.m17121b(C4917g.class, C4921j.class, C4922k.class).mo14031b(C4518u.m17193i(Context.class)).mo14031b(C4518u.m17193i(C4825h.class)).mo14031b(C4518u.m17195k(C4918h.class)).mo14031b(C4518u.m17194j(C4938i.class)).mo14034e(C4912b.f13768a).mo14032c();
    }

    /* renamed from: c */
    static /* synthetic */ C4917g m18763c(C4504o oVar) {
        return new C4917g((Context) oVar.mo14013a(Context.class), ((C4825h) oVar.mo14013a(C4825h.class)).mo14736p(), oVar.mo14016d(C4918h.class), oVar.mo14014b(C4938i.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ String mo14921e() {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            C4923l lVar = this.f13775b.get();
            List<C4924m> c = lVar.mo14925c();
            lVar.mo14924b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < c.size(); i++) {
                C4924m mVar = c.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", mVar.mo14916c());
                jSONObject.put("dates", new JSONArray(mVar.mo14915b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
    }

    /* renamed from: f */
    static /* synthetic */ C4923l m18765f(Context context, String str) {
        return new C4923l(context, str);
    }

    /* renamed from: g */
    private /* synthetic */ Void m18766g() {
        synchronized (this) {
            this.f13775b.get().mo14926e(System.currentTimeMillis(), this.f13777d.get().mo14942a());
        }
        return null;
    }

    /* renamed from: i */
    static /* synthetic */ Thread m18767i(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    /* renamed from: a */
    public C8963l<String> mo14920a() {
        return C1865n.m7883a(this.f13776c) ^ true ? C8969o.m29867f(HttpUrl.FRAGMENT_ENCODE_SET) : C8969o.m29864c(this.f13779f, new C4913c(this));
    }

    /* renamed from: h */
    public /* synthetic */ Void mo14922h() {
        m18766g();
        return null;
    }

    /* renamed from: j */
    public C8963l<Void> mo14923j() {
        return this.f13778e.size() <= 0 ? C8969o.m29867f(null) : C1865n.m7883a(this.f13776c) ^ true ? C8969o.m29867f(null) : C8969o.m29864c(this.f13779f, new C4915e(this));
    }
}
