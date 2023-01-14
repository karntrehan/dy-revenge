package p455g.p462v.p464k.p465a;

import java.lang.reflect.Field;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.v.k.a.g */
public final class C10402g {
    /* renamed from: a */
    private static final void m35268a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }

    /* renamed from: b */
    private static final C10401f m35269b(C10396a aVar) {
        return (C10401f) aVar.getClass().getAnnotation(C10401f.class);
    }

    /* renamed from: c */
    private static final int m35270c(C10396a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: d */
    public static final StackTraceElement m35271d(C10396a aVar) {
        String str;
        C10457l.m35320e(aVar, "<this>");
        C10401f b = m35269b(aVar);
        if (b == null) {
            return null;
        }
        m35268a(1, b.mo25801v());
        int c = m35270c(aVar);
        int i = c < 0 ? -1 : b.mo25799l()[c];
        String b2 = C10404i.f27592a.mo25802b(aVar);
        if (b2 == null) {
            str = b.mo25797c();
        } else {
            str = b2 + '/' + b.mo25797c();
        }
        return new StackTraceElement(str, b.mo25800m(), b.mo25798f(), i);
    }
}
