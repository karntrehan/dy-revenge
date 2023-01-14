package com.google.firebase.crashlytics.p139h.p142j;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p143k.C4618e;
import com.google.firebase.crashlytics.p139h.p143k.C4631i;
import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import com.google.firebase.crashlytics.p139h.p144l.C4699b0;
import com.google.firebase.crashlytics.p139h.p147n.C4781e;
import com.google.firebase.crashlytics.p139h.p147n.C4782f;
import com.google.firebase.crashlytics.p139h.p148o.C4785c;
import com.google.firebase.crashlytics.p139h.p149p.C4800i;
import com.google.firebase.crashlytics.p139h.p150q.C4807d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import p174e.p319f.p320a.p335c.p362h.C8963l;
import p174e.p319f.p320a.p335c.p362h.C8969o;

/* renamed from: com.google.firebase.crashlytics.h.j.g0 */
public class C4566g0 {

    /* renamed from: a */
    private final C4602s f12905a;

    /* renamed from: b */
    private final C4781e f12906b;

    /* renamed from: c */
    private final C4785c f12907c;

    /* renamed from: d */
    private final C4618e f12908d;

    /* renamed from: e */
    private final C4631i f12909e;

    C4566g0(C4602s sVar, C4781e eVar, C4785c cVar, C4618e eVar2, C4631i iVar) {
        this.f12905a = sVar;
        this.f12906b = eVar;
        this.f12907c = cVar;
        this.f12908d = eVar2;
        this.f12909e = iVar;
    }

    /* renamed from: a */
    private C4655a0.C4665e.C4672d m17317a(C4655a0.C4665e.C4672d dVar) {
        return m17318b(dVar, this.f12908d, this.f12909e);
    }

    /* renamed from: b */
    private C4655a0.C4665e.C4672d m17318b(C4655a0.C4665e.C4672d dVar, C4618e eVar, C4631i iVar) {
        C4655a0.C4665e.C4672d.C4687b g = dVar.mo14422g();
        String c = eVar.mo14248c();
        if (c != null) {
            g.mo14496d(C4655a0.C4665e.C4672d.C4690d.m17920a().mo14514b(c).mo14513a());
        } else {
            C4542f.m17259f().mo14110i("No log data to include with this event.");
        }
        List<C4655a0.C4659c> i = m17323i(iVar.mo14272d());
        List<C4655a0.C4659c> i2 = m17323i(iVar.mo14273e());
        if (!i.isEmpty() || !i2.isEmpty()) {
            g.mo14494b(dVar.mo14417b().mo14428g().mo14431c(C4699b0.m17956b(i)).mo14433e(C4699b0.m17956b(i2)).mo14429a());
        }
        return g.mo14493a();
    }

    /* renamed from: c */
    private static C4655a0.C4656a m17319c(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = m17320d(traceInputStream);
            }
        } catch (IOException e) {
            C4542f f = C4542f.m17259f();
            f.mo14112k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e);
        }
        return C4655a0.C4656a.m17706a().mo14323b(applicationExitInfo.getImportance()).mo14325d(applicationExitInfo.getProcessName()).mo14327f(applicationExitInfo.getReason()).mo14329h(applicationExitInfo.getTimestamp()).mo14324c(applicationExitInfo.getPid()).mo14326e(applicationExitInfo.getPss()).mo14328g(applicationExitInfo.getRss()).mo14330i(str).mo14322a();
    }

    /* renamed from: d */
    public static String m17320d(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: e */
    public static C4566g0 m17321e(Context context, C4554a0 a0Var, C4782f fVar, C4567h hVar, C4618e eVar, C4631i iVar, C4807d dVar, C4800i iVar2, C4564f0 f0Var) {
        return new C4566g0(new C4602s(context, a0Var, hVar, dVar), new C4781e(fVar, iVar2), C4785c.m18302a(context, iVar2, f0Var), eVar, iVar);
    }

    /* renamed from: h */
    private ApplicationExitInfo m17322h(String str, List<ApplicationExitInfo> list) {
        long m = this.f12906b.mo14666m(str);
        for (ApplicationExitInfo next : list) {
            if (next.getTimestamp() < m) {
                return null;
            }
            if (next.getReason() == 6) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    private static List<C4655a0.C4659c> m17323i(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(C4655a0.C4659c.m17733a().mo14343b((String) next.getKey()).mo14344c((String) next.getValue()).mo14342a());
        }
        Collections.sort(arrayList, C4559d.f12899f);
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public boolean m17326o(C8963l<C4603t> lVar) {
        if (lVar.mo22779o()) {
            C4603t l = lVar.mo22776l();
            C4542f f = C4542f.m17259f();
            f.mo14104b("Crashlytics report successfully enqueued to DataTransport: " + l.mo14145d());
            File c = l.mo14144c();
            if (c.delete()) {
                C4542f f2 = C4542f.m17259f();
                f2.mo14104b("Deleted report file: " + c.getPath());
                return true;
            }
            C4542f f3 = C4542f.m17259f();
            f3.mo14112k("Crashlytics could not delete report file: " + c.getPath());
            return true;
        }
        C4542f.m17259f().mo14113l("Crashlytics report could not be enqueued to DataTransport", lVar.mo22775k());
        return false;
    }

    /* renamed from: p */
    private void m17327p(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        boolean equals = str2.equals("crash");
        C4655a0.C4665e.C4672d c = this.f12905a.mo14224c(th, thread, str2, j, 4, 8, z);
        String str3 = str;
        this.f12906b.mo14669w(m17317a(c), str, equals);
    }

    /* renamed from: f */
    public void mo14131f(String str, List<C4560d0> list) {
        C4542f.m17259f().mo14104b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        for (C4560d0 c : list) {
            C4655a0.C4661d.C4663b c2 = c.mo14127c();
            if (c2 != null) {
                arrayList.add(c2);
            }
        }
        this.f12906b.mo14664h(str, C4655a0.C4661d.m17739a().mo14348b(C4699b0.m17956b(arrayList)).mo14347a());
    }

    /* renamed from: g */
    public void mo14132g(long j, String str) {
        this.f12906b.mo14663g(str, j);
    }

    /* renamed from: j */
    public boolean mo14133j() {
        return this.f12906b.mo14667n();
    }

    /* renamed from: m */
    public SortedSet<String> mo14134m() {
        return this.f12906b.mo14665l();
    }

    /* renamed from: n */
    public void mo14135n(String str, long j) {
        this.f12906b.mo14670x(this.f12905a.mo14225d(str, j));
    }

    /* renamed from: q */
    public void mo14136q(Throwable th, Thread thread, String str, long j) {
        C4542f f = C4542f.m17259f();
        f.mo14110i("Persisting fatal event for session " + str);
        m17327p(th, thread, str, "crash", j, true);
    }

    /* renamed from: r */
    public void mo14137r(Throwable th, Thread thread, String str, long j) {
        C4542f f = C4542f.m17259f();
        f.mo14110i("Persisting non-fatal event for session " + str);
        m17327p(th, thread, str, "error", j, false);
    }

    /* renamed from: s */
    public void mo14138s(String str, List<ApplicationExitInfo> list, C4618e eVar, C4631i iVar) {
        ApplicationExitInfo h = m17322h(str, list);
        if (h == null) {
            C4542f f = C4542f.m17259f();
            f.mo14110i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        C4655a0.C4665e.C4672d b = this.f12905a.mo14223b(m17319c(h));
        C4542f f2 = C4542f.m17259f();
        f2.mo14104b("Persisting anr for session " + str);
        this.f12906b.mo14669w(m17318b(b, eVar, iVar), str, true);
    }

    /* renamed from: t */
    public void mo14139t() {
        this.f12906b.mo14662e();
    }

    /* renamed from: u */
    public C8963l<Void> mo14140u(Executor executor) {
        return mo14141v(executor, (String) null);
    }

    /* renamed from: v */
    public C8963l<Void> mo14141v(Executor executor, String str) {
        List<C4603t> u = this.f12906b.mo14668u();
        ArrayList arrayList = new ArrayList();
        for (C4603t next : u) {
            if (str == null || str.equals(next.mo14145d())) {
                arrayList.add(this.f12907c.mo14687b(next, str != null).mo22773i(executor, new C4557c(this)));
            }
        }
        return C8969o.m29868g(arrayList);
    }
}
