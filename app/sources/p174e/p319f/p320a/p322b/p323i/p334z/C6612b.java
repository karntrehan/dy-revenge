package p174e.p319f.p320a.p322b.p323i.p334z;

/* renamed from: e.f.a.b.i.z.b */
public final class C6612b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m25248a(int i, TInput tinput, C6611a<TInput, TResult, TException> aVar, C6613c<TInput, TResult> cVar) {
        TResult apply;
        if (i < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.mo10838a(tinput, apply);
            if (tinput == null || i - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(tinput);
            tinput = cVar.mo10838a(tinput, apply);
            break;
        } while (i - 1 < 1);
        return apply;
    }
}
