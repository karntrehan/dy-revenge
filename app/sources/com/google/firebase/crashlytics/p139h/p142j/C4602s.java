package com.google.firebase.crashlytics.p139h.p142j;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import com.google.firebase.crashlytics.p139h.p144l.C4699b0;
import com.google.firebase.crashlytics.p139h.p150q.C4807d;
import com.google.firebase.crashlytics.p139h.p150q.C4808e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.firebase.crashlytics.h.j.s */
public class C4602s {

    /* renamed from: a */
    private static final Map<String, Integer> f13026a;

    /* renamed from: b */
    static final String f13027b = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.2.12"});

    /* renamed from: c */
    private final Context f13028c;

    /* renamed from: d */
    private final C4554a0 f13029d;

    /* renamed from: e */
    private final C4567h f13030e;

    /* renamed from: f */
    private final C4807d f13031f;

    static {
        HashMap hashMap = new HashMap();
        f13026a = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public C4602s(Context context, C4554a0 a0Var, C4567h hVar, C4807d dVar) {
        this.f13028c = context;
        this.f13029d = a0Var;
        this.f13030e = hVar;
        this.f13031f = dVar;
    }

    /* renamed from: a */
    private C4655a0.C4658b m17503a() {
        return C4655a0.m17693b().mo14338h("18.2.12").mo14334d(this.f13030e.f12910a).mo14335e(this.f13029d.mo14117a()).mo14332b(this.f13030e.f12914e).mo14333c(this.f13030e.f12915f).mo14337g(4);
    }

    /* renamed from: e */
    private static int m17504e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f13026a.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    /* renamed from: f */
    private C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a m17505f() {
        return C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a.m17842a().mo14446b(0).mo14448d(0).mo14447c(this.f13030e.f12913d).mo14449e(this.f13030e.f12911b).mo14445a();
    }

    /* renamed from: g */
    private C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a> m17506g() {
        return C4699b0.m17957g(m17505f());
    }

    /* renamed from: h */
    private C4655a0.C4665e.C4672d.C4673a m17507h(int i, C4655a0.C4656a aVar) {
        return C4655a0.C4665e.C4672d.C4673a.m17823a().mo14430b(Boolean.valueOf(aVar.mo14314b() != 100)).mo14434f(i).mo14432d(m17512m(aVar)).mo14429a();
    }

    /* renamed from: i */
    private C4655a0.C4665e.C4672d.C4673a m17508i(int i, C4808e eVar, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo j = C4577n.m17381j(this.f13030e.f12913d, this.f13028c);
        if (j != null) {
            bool = Boolean.valueOf(j.importance != 100);
        } else {
            bool = null;
        }
        return C4655a0.C4665e.C4672d.C4673a.m17823a().mo14430b(bool).mo14434f(i).mo14432d(m17513n(eVar, thread, i2, i3, z)).mo14429a();
    }

    /* renamed from: j */
    private C4655a0.C4665e.C4672d.C4688c m17509j(int i) {
        C4574k a = C4574k.m17354a(this.f13028c);
        Float b = a.mo14153b();
        Double valueOf = b != null ? Double.valueOf(b.doubleValue()) : null;
        int c = a.mo14154c();
        boolean o = C4577n.m17386o(this.f13028c);
        return C4655a0.C4665e.C4672d.C4688c.m17906a().mo14506b(valueOf).mo14507c(c).mo14510f(o).mo14509e(i).mo14511g(C4577n.m17390s() - C4577n.m17372a(this.f13028c)).mo14508d(C4577n.m17373b(Environment.getDataDirectory().getPath())).mo14505a();
    }

    /* renamed from: k */
    private C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c m17510k(C4808e eVar, int i, int i2) {
        return m17511l(eVar, i, i2, 0);
    }

    /* renamed from: l */
    private C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c m17511l(C4808e eVar, int i, int i2, int i3) {
        String str = eVar.f13541b;
        String str2 = eVar.f13540a;
        StackTraceElement[] stackTraceElementArr = eVar.f13542c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C4808e eVar2 = eVar.f13543d;
        if (i3 >= i2) {
            C4808e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f13543d;
                i4++;
            }
        }
        C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c.C4680a d = C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c.m17860a().mo14467f(str).mo14466e(str2).mo14464c(C4699b0.m17956b(m17515p(stackTraceElementArr, i))).mo14465d(i4);
        if (eVar2 != null && i4 == 0) {
            d.mo14463b(m17511l(eVar2, i, i2, i3 + 1));
        }
        return d.mo14462a();
    }

    /* renamed from: m */
    private C4655a0.C4665e.C4672d.C4673a.C4675b m17512m(C4655a0.C4656a aVar) {
        return C4655a0.C4665e.C4672d.C4673a.C4675b.m17836a().mo14452b(aVar).mo14455e(m17520u()).mo14453c(m17506g()).mo14451a();
    }

    /* renamed from: n */
    private C4655a0.C4665e.C4672d.C4673a.C4675b m17513n(C4808e eVar, Thread thread, int i, int i2, boolean z) {
        return C4655a0.C4665e.C4672d.C4673a.C4675b.m17836a().mo14456f(m17523x(eVar, thread, i, z)).mo14454d(m17510k(eVar, i, i2)).mo14455e(m17520u()).mo14453c(m17506g()).mo14451a();
    }

    /* renamed from: o */
    private C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b m17514o(StackTraceElement stackTraceElement, C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b.C4686a aVar) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = (long) stackTraceElement.getLineNumber();
        }
        return aVar.mo14491e(max).mo14492f(str).mo14488b(fileName).mo14490d(j).mo14487a();
    }

    /* renamed from: p */
    private C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b> m17515p(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement o : stackTraceElementArr) {
            arrayList.add(m17514o(o, C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b.m17888a().mo14489c(i)));
        }
        return C4699b0.m17956b(arrayList);
    }

    /* renamed from: q */
    private C4655a0.C4665e.C4666a m17516q() {
        return C4655a0.C4665e.C4666a.m17767a().mo14381e(this.f13029d.mo14118f()).mo14383g(this.f13030e.f12914e).mo14380d(this.f13030e.f12915f).mo14382f(this.f13029d.mo14117a()).mo14378b(this.f13030e.f12916g.mo14102d()).mo14379c(this.f13030e.f12916g.mo14103e()).mo14377a();
    }

    /* renamed from: r */
    private C4655a0.C4665e m17517r(String str, long j) {
        return C4655a0.C4665e.m17751a().mo14396l(j).mo14393i(str).mo14391g(f13027b).mo14386b(m17516q()).mo14395k(m17519t()).mo14388d(m17518s()).mo14392h(3).mo14385a();
    }

    /* renamed from: s */
    private C4655a0.C4665e.C4670c m17518s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int e = m17504e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long s = C4577n.m17390s();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean y = C4577n.m17396y();
        int m = C4577n.m17384m();
        String str = Build.MANUFACTURER;
        return C4655a0.C4665e.C4670c.m17796a().mo14408b(e).mo14412f(Build.MODEL).mo14409c(availableProcessors).mo14414h(s).mo14410d(blockCount).mo14415i(y).mo14416j(m).mo14411e(str).mo14413g(Build.PRODUCT).mo14407a();
    }

    /* renamed from: t */
    private C4655a0.C4665e.C4692e m17519t() {
        return C4655a0.C4665e.C4692e.m17924a().mo14522d(3).mo14523e(Build.VERSION.RELEASE).mo14520b(Build.VERSION.CODENAME).mo14521c(C4577n.m17397z()).mo14519a();
    }

    /* renamed from: u */
    private C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d m17520u() {
        return C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d.m17872a().mo14474d("0").mo14473c("0").mo14472b(0).mo14471a();
    }

    /* renamed from: v */
    private C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e m17521v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m17522w(thread, stackTraceElementArr, 0);
    }

    /* renamed from: w */
    private C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e m17522w(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.m17880a().mo14481d(thread.getName()).mo14480c(i).mo14479b(C4699b0.m17956b(m17515p(stackTraceElementArr, i))).mo14478a();
    }

    /* renamed from: x */
    private C4699b0<C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e> m17523x(C4808e eVar, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m17522w(thread, eVar.f13542c, i));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(m17521v(thread2, this.f13031f.mo14705a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return C4699b0.m17956b(arrayList);
    }

    /* renamed from: b */
    public C4655a0.C4665e.C4672d mo14223b(C4655a0.C4656a aVar) {
        int i = this.f13028c.getResources().getConfiguration().orientation;
        return C4655a0.C4665e.C4672d.m17816a().mo14498f("anr").mo14497e(aVar.mo14320h()).mo14494b(m17507h(i, aVar)).mo14495c(m17509j(i)).mo14493a();
    }

    /* renamed from: c */
    public C4655a0.C4665e.C4672d mo14224c(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f13028c.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        String str2 = str;
        long j2 = j;
        return C4655a0.C4665e.C4672d.m17816a().mo14498f(str).mo14497e(j).mo14494b(m17508i(i3, new C4808e(th, this.f13031f), thread, i, i2, z)).mo14495c(m17509j(i3)).mo14493a();
    }

    /* renamed from: d */
    public C4655a0 mo14225d(String str, long j) {
        return m17503a().mo14339i(m17517r(str, j)).mo14331a();
    }
}
