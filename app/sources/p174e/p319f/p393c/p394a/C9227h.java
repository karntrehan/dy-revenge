package p174e.p319f.p393c.p394a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p174e.p319f.p393c.p394a.p398u.C9282a;
import p174e.p319f.p393c.p394a.p403y.C9419y;
import p174e.p319f.p393c.p394a.p404z.p405a.C9468i;
import p174e.p319f.p393c.p394a.p404z.p405a.C9537s0;

/* renamed from: e.f.c.a.h */
public abstract class C9227h<KeyProtoT extends C9537s0> {

    /* renamed from: a */
    private final Class<KeyProtoT> f25139a;

    /* renamed from: b */
    private final Map<Class<?>, C9229b<?, KeyProtoT>> f25140b;

    /* renamed from: c */
    private final Class<?> f25141c;

    /* renamed from: e.f.c.a.h$a */
    public static abstract class C9228a<KeyFormatProtoT extends C9537s0, KeyT> {

        /* renamed from: a */
        private final Class<KeyFormatProtoT> f25142a;

        public C9228a(Class<KeyFormatProtoT> cls) {
            this.f25142a = cls;
        }

        /* renamed from: a */
        public abstract KeyT mo23207a(KeyFormatProtoT keyformatprotot);

        /* renamed from: b */
        public final Class<KeyFormatProtoT> mo23208b() {
            return this.f25142a;
        }

        /* renamed from: c */
        public abstract KeyFormatProtoT mo23209c(C9468i iVar);

        /* renamed from: d */
        public abstract void mo23210d(KeyFormatProtoT keyformatprotot);
    }

    /* renamed from: e.f.c.a.h$b */
    protected static abstract class C9229b<PrimitiveT, KeyT> {

        /* renamed from: a */
        private final Class<PrimitiveT> f25143a;

        public C9229b(Class<PrimitiveT> cls) {
            this.f25143a = cls;
        }

        /* renamed from: a */
        public abstract PrimitiveT mo23211a(KeyT keyt);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final Class<PrimitiveT> mo23212b() {
            return this.f25143a;
        }
    }

    @SafeVarargs
    protected C9227h(Class<KeyProtoT> cls, C9229b<?, KeyProtoT>... bVarArr) {
        this.f25139a = cls;
        HashMap hashMap = new HashMap();
        int length = bVarArr.length;
        int i = 0;
        while (i < length) {
            C9282a.C9283a aVar = bVarArr[i];
            if (!hashMap.containsKey(aVar.mo23212b())) {
                hashMap.put(aVar.mo23212b(), aVar);
                i++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + aVar.mo23212b().getCanonicalName());
            }
        }
        this.f25141c = bVarArr.length > 0 ? bVarArr[0].mo23212b() : Void.class;
        this.f25140b = Collections.unmodifiableMap(hashMap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Class<?> mo23198a() {
        return this.f25141c;
    }

    /* renamed from: b */
    public final Class<KeyProtoT> mo23199b() {
        return this.f25139a;
    }

    /* renamed from: c */
    public abstract String mo23200c();

    /* renamed from: d */
    public final <P> P mo23201d(KeyProtoT keyprotot, Class<P> cls) {
        C9229b bVar = this.f25140b.get(cls);
        if (bVar != null) {
            return bVar.mo23211a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    /* renamed from: e */
    public abstract C9228a<?, KeyProtoT> mo23202e();

    /* renamed from: f */
    public abstract C9419y.C9422c mo23203f();

    /* renamed from: g */
    public abstract KeyProtoT mo23204g(C9468i iVar);

    /* renamed from: h */
    public final Set<Class<?>> mo23205h() {
        return this.f25140b.keySet();
    }

    /* renamed from: i */
    public abstract void mo23206i(KeyProtoT keyprotot);
}
