package p174e.p319f.p320a.p335c.p362h;

/* renamed from: e.f.a.c.h.d */
public final class C8947d extends IllegalStateException {
    private C8947d(String str, Throwable th) {
        super(str, th);
    }

    /* renamed from: a */
    public static IllegalStateException m29817a(C8963l<?> lVar) {
        String str;
        if (!lVar.mo22778n()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception k = lVar.mo22775k();
        if (k != null) {
            str = "failure";
        } else if (lVar.mo22779o()) {
            String valueOf = String.valueOf(lVar.mo22776l());
            valueOf.length();
            str = "result ".concat(valueOf);
        } else {
            str = lVar.mo22777m() ? "cancellation" : "unknown issue";
        }
        return new C8947d(str.length() != 0 ? "Complete with: ".concat(str) : new String("Complete with: "), k);
    }
}
