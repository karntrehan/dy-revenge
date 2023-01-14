package p174e.p247e.p294k.p302f;

import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;
import okhttp3.HttpUrl;
import p174e.p247e.p253d.p258e.C6071a;
import p174e.p247e.p253d.p261h.C6088a;
import p174e.p247e.p253d.p261h.C6098h;
import p174e.p247e.p253d.p261h.C6099i;
import p174e.p247e.p294k.p304h.C6352a;

/* renamed from: e.e.k.f.a */
public class C6319a {

    /* renamed from: a */
    private final C6088a.C6091c f17479a;

    /* renamed from: e.e.k.f.a$a */
    class C6320a implements C6088a.C6091c {

        /* renamed from: a */
        final /* synthetic */ C6352a f17480a;

        C6320a(C6352a aVar) {
            this.f17480a = aVar;
        }

        /* renamed from: a */
        public void mo18086a(C6099i<Object> iVar, Throwable th) {
            this.f17480a.mo18853b(iVar, th);
            Object f = iVar.mo18093f();
            C6071a.m22861I("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(iVar)), f != null ? f.getClass().getName() : "<value is null>", C6319a.m23935d(th));
        }

        /* renamed from: b */
        public boolean mo18087b() {
            return this.f17480a.mo18852a();
        }
    }

    public C6319a(C6352a aVar) {
        this.f17479a = new C6320a(aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m23935d(Throwable th) {
        if (th == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    public <U extends Closeable> C6088a<U> mo18697b(U u) {
        return C6088a.m22941B0(u, this.f17479a);
    }

    /* renamed from: c */
    public <T> C6088a<T> mo18698c(T t, C6098h<T> hVar) {
        return C6088a.m22943D0(t, hVar, this.f17479a);
    }
}
