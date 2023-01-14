package p174e.p319f.p320a.p335c.p345f.p352g;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: e.f.a.c.f.g.sb */
abstract class C6998sb {

    /* renamed from: a */
    final Unsafe f18940a;

    C6998sb(Unsafe unsafe) {
        this.f18940a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo20107a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo20108b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo20109c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo20110d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo20111e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo20112f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo20113g(Object obj, long j);

    /* renamed from: h */
    public final int mo20159h(Class cls) {
        return this.f18940a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo20160i(Class cls) {
        return this.f18940a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo20161j(Object obj, long j) {
        return this.f18940a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo20162k(Object obj, long j) {
        return this.f18940a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo20163l(Field field) {
        return this.f18940a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo20164m(Object obj, long j) {
        return this.f18940a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo20165n(Object obj, long j, int i) {
        this.f18940a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo20166o(Object obj, long j, long j2) {
        this.f18940a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo20167p(Object obj, long j, Object obj2) {
        this.f18940a.putObject(obj, j, obj2);
    }
}
