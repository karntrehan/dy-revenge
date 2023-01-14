package p174e.p247e.p253d.p258e;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import okhttp3.HttpUrl;

/* renamed from: e.e.d.e.b */
public class C6072b implements C6073c {

    /* renamed from: a */
    public static final C6072b f16707a = new C6072b();

    /* renamed from: b */
    private String f16708b = "unknown";

    /* renamed from: c */
    private int f16709c = 5;

    private C6072b() {
    }

    /* renamed from: l */
    public static C6072b m22893l() {
        return f16707a;
    }

    /* renamed from: m */
    private static String m22894m(String str, Throwable th) {
        return str + 10 + m22895n(th);
    }

    /* renamed from: n */
    private static String m22895n(Throwable th) {
        if (th == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: o */
    private String m22896o(String str) {
        if (this.f16708b == null) {
            return str;
        }
        return this.f16708b + ":" + str;
    }

    /* renamed from: p */
    private void m22897p(int i, String str, String str2) {
        Log.println(i, m22896o(str), str2);
    }

    /* renamed from: q */
    private void m22898q(int i, String str, String str2, Throwable th) {
        Log.println(i, m22896o(str), m22894m(str2, th));
    }

    /* renamed from: a */
    public void mo18050a(String str, String str2, Throwable th) {
        m22898q(6, str, str2, th);
    }

    /* renamed from: b */
    public void mo18051b(String str, String str2) {
        m22897p(5, str, str2);
    }

    /* renamed from: c */
    public void mo18052c(String str, String str2, Throwable th) {
        m22898q(5, str, str2, th);
    }

    /* renamed from: d */
    public void mo18053d(String str, String str2) {
        m22897p(6, str, str2);
    }

    /* renamed from: e */
    public void mo18054e(String str, String str2) {
        m22897p(2, str, str2);
    }

    /* renamed from: f */
    public void mo18055f(String str, String str2) {
        m22897p(6, str, str2);
    }

    /* renamed from: g */
    public void mo18056g(String str, String str2, Throwable th) {
        m22898q(6, str, str2, th);
    }

    /* renamed from: h */
    public void mo18057h(String str, String str2) {
        m22897p(3, str, str2);
    }

    /* renamed from: i */
    public void mo18058i(String str, String str2, Throwable th) {
        m22898q(3, str, str2, th);
    }

    /* renamed from: j */
    public boolean mo18059j(int i) {
        return this.f16709c <= i;
    }

    /* renamed from: k */
    public void mo18060k(String str, String str2) {
        m22897p(4, str, str2);
    }
}
