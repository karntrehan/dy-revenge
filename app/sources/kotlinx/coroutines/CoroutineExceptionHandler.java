package kotlinx.coroutines;

import p455g.p462v.C10381g;

public interface CoroutineExceptionHandler extends C10381g.C10384b {

    /* renamed from: m */
    public static final C10680a f28165m = C10680a.f28166f;

    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    public static final class C10680a implements C10381g.C10386c<CoroutineExceptionHandler> {

        /* renamed from: f */
        static final /* synthetic */ C10680a f28166f = new C10680a();

        private C10680a() {
        }
    }

    void handleException(C10381g gVar, Throwable th);
}
