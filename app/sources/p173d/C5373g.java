package p173d;

/* renamed from: d.g */
public class C5373g<TResult> {

    /* renamed from: a */
    private final C5368f<TResult> f15027a = new C5368f<>();

    /* renamed from: a */
    public C5368f<TResult> mo16177a() {
        return this.f15027a;
    }

    /* renamed from: b */
    public void mo16178b() {
        if (!mo16181e()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* renamed from: c */
    public void mo16179c(Exception exc) {
        if (!mo16182f(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    /* renamed from: d */
    public void mo16180d(TResult tresult) {
        if (!mo16183g(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    /* renamed from: e */
    public boolean mo16181e() {
        return this.f15027a.mo16170p();
    }

    /* renamed from: f */
    public boolean mo16182f(Exception exc) {
        return this.f15027a.mo16171q(exc);
    }

    /* renamed from: g */
    public boolean mo16183g(TResult tresult) {
        return this.f15027a.mo16172r(tresult);
    }
}
