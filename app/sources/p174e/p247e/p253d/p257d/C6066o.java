package p174e.p247e.p253d.p257d;

/* renamed from: e.e.d.d.o */
public class C6066o {

    /* renamed from: a */
    public static final C6065n<Boolean> f16703a = new C6068b();

    /* renamed from: b */
    public static final C6065n<Boolean> f16704b = new C6069c();

    /* renamed from: e.e.d.d.o$a */
    static class C6067a implements C6065n<T> {

        /* renamed from: a */
        final /* synthetic */ Object f16705a;

        C6067a(Object obj) {
            this.f16705a = obj;
        }

        public T get() {
            return this.f16705a;
        }
    }

    /* renamed from: e.e.d.d.o$b */
    static class C6068b implements C6065n<Boolean> {
        C6068b() {
        }

        /* renamed from: a */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: e.e.d.d.o$c */
    static class C6069c implements C6065n<Boolean> {
        C6069c() {
        }

        /* renamed from: a */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public static <T> C6065n<T> m22847a(T t) {
        return new C6067a(t);
    }
}
