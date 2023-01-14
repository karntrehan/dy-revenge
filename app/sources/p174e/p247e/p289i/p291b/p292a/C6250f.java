package p174e.p247e.p289i.p291b.p292a;

import android.net.Uri;
import p174e.p247e.p253d.p257d.C6053e;

/* renamed from: e.e.i.b.a.f */
public abstract class C6250f {
    /* renamed from: a */
    public static <T> Uri m23697a(T t, T t2, T[] tArr, C6053e<T, Uri> eVar) {
        Uri apply;
        Uri apply2;
        if (t != null && (apply2 = eVar.apply(t)) != null) {
            return apply2;
        }
        if (tArr != null && tArr.length > 0 && tArr[0] != null && (apply = eVar.apply(tArr[0])) != null) {
            return apply;
        }
        if (t2 != null) {
            return eVar.apply(t2);
        }
        return null;
    }
}
