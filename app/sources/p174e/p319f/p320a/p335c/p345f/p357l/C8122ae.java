package p174e.p319f.p320a.p335c.p345f.p357l;

/* renamed from: e.f.a.c.f.l.ae */
final class C8122ae implements C8529we {

    /* renamed from: a */
    private static final C8236ge f22047a = new C8564yd();

    /* renamed from: b */
    private final C8236ge f22048b;

    public C8122ae() {
        C8236ge geVar;
        C8236ge[] geVarArr = new C8236ge[2];
        geVarArr[0] = C8563yc.m29317c();
        try {
            geVar = (C8236ge) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            geVar = f22047a;
        }
        geVarArr[1] = geVar;
        C8582zd zdVar = new C8582zd(geVarArr);
        C8311kd.m28702f(zdVar, "messageInfoFactory");
        this.f22048b = zdVar;
    }

    /* renamed from: b */
    private static boolean m28318b(C8217fe feVar) {
        return feVar.mo21803a() == 1;
    }

    /* renamed from: a */
    public final <T> C8511ve<T> mo21661a(Class<T> cls) {
        C8179de deVar;
        C8437rc<?> rcVar;
        C8294jf<?, ?> jfVar;
        C8528wd wdVar;
        C8403pe peVar;
        C8437rc<?> rcVar2;
        C8294jf<?, ?> b0;
        C8437rc<?> a;
        Class<C8197ed> cls2 = C8197ed.class;
        C8547xe.m29287g(cls);
        C8217fe a2 = this.f22048b.mo21833a(cls);
        if (a2.zzb()) {
            if (cls2.isAssignableFrom(cls)) {
                b0 = C8547xe.m29281b();
                a = C8473tc.m29056b();
            } else {
                b0 = C8547xe.m29282b0();
                a = C8473tc.m29055a();
            }
            return C8349me.m28846j(b0, a, a2.zza());
        }
        if (cls2.isAssignableFrom(cls)) {
            boolean b = m28318b(a2);
            peVar = C8421qe.m28970b();
            wdVar = C8528wd.m29222d();
            jfVar = C8547xe.m29281b();
            rcVar = b ? C8473tc.m29056b() : null;
            deVar = C8198ee.m28485b();
        } else {
            boolean b2 = m28318b(a2);
            peVar = C8421qe.m28969a();
            wdVar = C8528wd.m29221c();
            if (b2) {
                jfVar = C8547xe.m29282b0();
                rcVar2 = C8473tc.m29055a();
            } else {
                jfVar = C8547xe.m29279a();
                rcVar2 = null;
            }
            deVar = C8198ee.m28484a();
        }
        return C8331le.m28778F(cls, a2, peVar, wdVar, jfVar, rcVar, deVar);
    }
}
