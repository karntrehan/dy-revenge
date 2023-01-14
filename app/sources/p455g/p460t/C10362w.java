package p455g.p460t;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.p473b0.C10445a;

/* renamed from: g.t.w */
final class C10362w implements Map, Serializable, C10445a {

    /* renamed from: f */
    public static final C10362w f27562f = new C10362w();

    private C10362w() {
    }

    /* renamed from: a */
    public boolean mo25722a(Void voidR) {
        C10457l.m35320e(voidR, "value");
        return false;
    }

    /* renamed from: b */
    public Void get(Object obj) {
        return null;
    }

    /* renamed from: c */
    public Set<Map.Entry> mo25724c() {
        return C10363x.f27563f;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        return mo25722a((Void) obj);
    }

    /* renamed from: d */
    public Set<Object> mo25728d() {
        return C10363x.f27563f;
    }

    /* renamed from: e */
    public int mo25729e() {
        return 0;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return mo25724c();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public Collection mo25732f() {
        return C10361v.f27561f;
    }

    /* renamed from: g */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return mo25728d();
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo25729e();
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return mo25732f();
    }
}
