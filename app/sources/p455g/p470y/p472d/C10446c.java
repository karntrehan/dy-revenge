package p455g.p470y.p472d;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p455g.p457b0.C10250b;
import p455g.p457b0.C10252d;
import p455g.p457b0.C10261j;
import p455g.p457b0.C10262k;
import p455g.p470y.C10418b;

/* renamed from: g.y.d.c */
public abstract class C10446c implements C10250b, Serializable {
    public static final Object NO_RECEIVER = C10447a.f27609f;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient C10250b reflected;
    private final String signature;

    /* renamed from: g.y.d.c$a */
    private static class C10447a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C10447a f27609f = new C10447a();

        private C10447a() {
        }
    }

    public C10446c() {
        this(NO_RECEIVER);
    }

    protected C10446c(Object obj) {
        this(obj, (Class) null, (String) null, (String) null, false);
    }

    protected C10446c(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public C10250b compute() {
        C10250b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        C10250b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    /* access modifiers changed from: protected */
    public abstract C10250b computeReflected();

    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public C10252d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? C10468w.m35336c(cls) : C10468w.m35335b(cls);
    }

    public List<?> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public C10250b getReflected() {
        C10250b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C10418b();
    }

    public C10261j getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    public List<?> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    public C10262k getVisibility() {
        return getReflected().getVisibility();
    }

    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    public boolean isFinal() {
        return getReflected().isFinal();
    }

    public boolean isOpen() {
        return getReflected().isOpen();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
