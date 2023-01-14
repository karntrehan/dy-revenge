package androidx.lifecycle;

/* renamed from: androidx.lifecycle.r */
public class C1307r {

    /* renamed from: a */
    private final C1308a f3742a;

    /* renamed from: b */
    private final C1311s f3743b;

    /* renamed from: androidx.lifecycle.r$a */
    public interface C1308a {
        /* renamed from: a */
        <T extends C1306q> T mo4196a(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.r$b */
    static abstract class C1309b extends C1310c implements C1308a {
        C1309b() {
        }

        /* renamed from: a */
        public <T extends C1306q> T mo4196a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: c */
        public abstract <T extends C1306q> T mo4377c(String str, Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.r$c */
    static class C1310c {
        C1310c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4378b(C1306q qVar) {
        }
    }

    public C1307r(C1311s sVar, C1308a aVar) {
        this.f3742a = aVar;
        this.f3743b = sVar;
    }

    /* renamed from: a */
    public <T extends C1306q> T mo4375a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo4376b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: b */
    public <T extends C1306q> T mo4376b(String str, Class<T> cls) {
        T b = this.f3743b.mo4380b(str);
        if (cls.isInstance(b)) {
            C1308a aVar = this.f3742a;
            if (aVar instanceof C1310c) {
                ((C1310c) aVar).mo4378b(b);
            }
            return b;
        }
        C1308a aVar2 = this.f3742a;
        T c = aVar2 instanceof C1309b ? ((C1309b) aVar2).mo4377c(str, cls) : aVar2.mo4196a(cls);
        this.f3743b.mo4382d(str, c);
        return c;
    }
}
