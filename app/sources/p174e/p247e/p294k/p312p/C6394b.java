package p174e.p247e.p294k.p312p;

/* renamed from: e.e.k.p.b */
public class C6394b {

    /* renamed from: a */
    public static final C6396b f17834a = new C6397c();

    /* renamed from: b */
    private static volatile C6398d f17835b = null;

    /* renamed from: e.e.k.p.b$b */
    public interface C6396b {
    }

    /* renamed from: e.e.k.p.b$c */
    private static final class C6397c implements C6396b {
        private C6397c() {
        }
    }

    /* renamed from: e.e.k.p.b$d */
    public interface C6398d {
        /* renamed from: a */
        void mo18981a(String str);

        /* renamed from: b */
        void mo18982b();

        boolean isTracing();
    }

    private C6394b() {
    }

    /* renamed from: a */
    public static void m24478a(String str) {
        m24480c().mo18981a(str);
    }

    /* renamed from: b */
    public static void m24479b() {
        m24480c().mo18982b();
    }

    /* renamed from: c */
    private static C6398d m24480c() {
        if (f17835b == null) {
            synchronized (C6394b.class) {
                if (f17835b == null) {
                    f17835b = new C6393a();
                }
            }
        }
        return f17835b;
    }

    /* renamed from: d */
    public static boolean m24481d() {
        return m24480c().isTracing();
    }
}
