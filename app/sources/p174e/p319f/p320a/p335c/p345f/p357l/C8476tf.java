package p174e.p319f.p320a.p335c.p345f.p357l;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* renamed from: e.f.a.c.f.l.tf */
abstract class C8476tf {

    /* renamed from: a */
    final Unsafe f23099a;

    C8476tf(Unsafe unsafe) {
        this.f23099a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo22121a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo22122b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo22123c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo22124d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo22125e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo22126f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo22127g(Object obj, long j);

    /* renamed from: h */
    public final int mo22151h(Class<?> cls) {
        return this.f23099a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int mo22152i(Class<?> cls) {
        return this.f23099a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int mo22153j(Object obj, long j) {
        return this.f23099a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long mo22154k(Object obj, long j) {
        return this.f23099a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long mo22155l(Field field) {
        return this.f23099a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object mo22156m(Object obj, long j) {
        return this.f23099a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void mo22157n(Object obj, long j, int i) {
        this.f23099a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void mo22158o(Object obj, long j, long j2) {
        this.f23099a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void mo22159p(Object obj, long j, Object obj2) {
        this.f23099a.putObject(obj, j, obj2);
    }
}
