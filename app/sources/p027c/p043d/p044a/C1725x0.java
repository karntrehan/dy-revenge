package p027c.p043d.p044a;

import android.content.Context;
import androidx.camera.core.impl.p014a3.C0722e;
import androidx.core.content.C1143c;
import androidx.core.util.C1170a;
import androidx.core.util.C1177h;
import java.util.concurrent.Executor;

/* renamed from: c.d.a.x0 */
public final class C1725x0 {

    /* renamed from: a */
    private final Context f5133a;

    /* renamed from: b */
    private final C1502a1 f5134b;

    /* renamed from: c */
    private final C1721v0 f5135c;

    /* renamed from: d */
    private C1170a<C1549i1> f5136d;

    /* renamed from: e */
    private Executor f5137e;

    /* renamed from: f */
    private boolean f5138f = false;

    C1725x0(Context context, C1502a1 a1Var, C1721v0 v0Var) {
        this.f5133a = C0722e.m2978a(context);
        this.f5134b = a1Var;
        this.f5135c = v0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Context mo5954a() {
        return this.f5133a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C1170a<C1549i1> mo5955b() {
        return this.f5136d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Executor mo5956c() {
        return this.f5137e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1721v0 mo5957d() {
        return this.f5135c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1502a1 mo5958e() {
        return this.f5134b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo5959f() {
        return this.f5138f;
    }

    /* renamed from: g */
    public C1516b1 mo5960g(Executor executor, C1170a<C1549i1> aVar) {
        C1177h.m4584f(executor, "Listener Executor can't be null.");
        C1177h.m4584f(aVar, "Event listener can't be null");
        this.f5137e = executor;
        this.f5136d = aVar;
        return this.f5134b.mo5590u0(this);
    }

    /* renamed from: h */
    public C1725x0 mo5961h() {
        if (C1143c.m4441b(this.f5133a, "android.permission.RECORD_AUDIO") != -1) {
            C1177h.m4586h(this.f5134b.mo5586p(), "The Recorder this recording is associated to doesn't support audio.");
            this.f5138f = true;
            return this;
        }
        throw new SecurityException("Attempted to enable audio for recording but application does not have RECORD_AUDIO permission granted.");
    }
}
