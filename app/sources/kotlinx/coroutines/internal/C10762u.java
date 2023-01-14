package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.coroutines.C10699d0;
import p455g.C10314l;
import p455g.C10315m;
import p455g.C10318n;
import p455g.C10320p;
import p455g.p462v.p464k.p465a.C10400e;
import p455g.p470y.p472d.C10457l;

/* renamed from: kotlinx.coroutines.internal.u */
public final class C10762u {

    /* renamed from: a */
    private static final String f28267a;

    /* renamed from: b */
    private static final String f28268b;

    static {
        Object obj;
        Object obj2;
        try {
            C10315m.C10316a aVar = C10315m.f27541f;
            obj = C10315m.m35012a(Class.forName("g.v.k.a.a").getCanonicalName());
        } catch (Throwable th) {
            C10315m.C10316a aVar2 = C10315m.f27541f;
            obj = C10315m.m35012a(C10318n.m35016a(th));
        }
        if (C10315m.m35013b(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f28267a = (String) obj;
        try {
            C10315m.C10316a aVar3 = C10315m.f27541f;
            obj2 = C10315m.m35012a(Class.forName("kotlinx.coroutines.internal.u").getCanonicalName());
        } catch (Throwable th2) {
            C10315m.C10316a aVar4 = C10315m.f27541f;
            obj2 = C10315m.m35012a(C10318n.m35016a(th2));
        }
        if (C10315m.m35013b(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f28268b = (String) obj2;
    }

    /* renamed from: b */
    public static final StackTraceElement m36585b(String str) {
        return new StackTraceElement(C10457l.m35326k("\b\b\b(", str), "\b", "\b", -1);
    }

    /* renamed from: c */
    private static final <E extends Throwable> C10314l<E, StackTraceElement[]> m36586c(E e) {
        boolean z;
        Throwable cause = e.getCause();
        if (cause == null || !C10457l.m35316a(cause.getClass(), e.getClass())) {
            return C10320p.m35019a(e, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (m36591h(stackTrace[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        return z ? C10320p.m35019a(cause, stackTrace) : C10320p.m35019a(e, new StackTraceElement[0]);
    }

    /* renamed from: d */
    private static final <E extends Throwable> E m36587d(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m36585b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e.getStackTrace();
        int g = m36590g(stackTrace, f28267a);
        int i = 0;
        if (g == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            e2.setStackTrace((StackTraceElement[]) array);
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + g)];
        if (g > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                stackTraceElementArr[i2] = stackTrace[i2];
                if (i3 >= g) {
                    break;
                }
                i2 = i3;
            }
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i4 = i + 1;
            stackTraceElementArr[i + g] = it.next();
            i = i4;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0013  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* renamed from: e */
    private static final java.util.ArrayDeque<java.lang.StackTraceElement> m36588e(p455g.p462v.p464k.p465a.C10400e r2) {
        /*
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.StackTraceElement r1 = r2.mo25790g()
            if (r1 != 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r0.add(r1)
        L_0x000f:
            if (r2 != 0) goto L_0x0013
            r2 = 0
            goto L_0x0017
        L_0x0013:
            g.v.k.a.e r2 = r2.mo25789c()
        L_0x0017:
            if (r2 != 0) goto L_0x001a
            return r0
        L_0x001a:
            java.lang.StackTraceElement r1 = r2.mo25790g()
            if (r1 != 0) goto L_0x000c
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C10762u.m36588e(g.v.k.a.e):java.util.ArrayDeque");
    }

    /* renamed from: f */
    private static final boolean m36589f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C10457l.m35316a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && C10457l.m35316a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && C10457l.m35316a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    /* renamed from: g */
    private static final int m36590g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (C10457l.m35316a(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static final boolean m36591h(StackTraceElement stackTraceElement) {
        return C10299p.m34926B(stackTraceElement.getClassName(), "\b\b\b", false, 2, (Object) null);
    }

    /* renamed from: i */
    private static final void m36592i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (m36591h(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 <= length2) {
            while (true) {
                int i3 = length2 - 1;
                if (m36589f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2 = i3;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final <E extends Throwable> E m36593j(E e, C10400e eVar) {
        C10314l c = m36586c(e);
        E e2 = (Throwable) c.mo25609a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c.mo25610b();
        Throwable k = m36594k(e2);
        if (k == null) {
            return e;
        }
        ArrayDeque e3 = m36588e(eVar);
        if (e3.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            m36592i(stackTraceElementArr, e3);
        }
        return m36587d(e2, k, e3);
    }

    /* renamed from: k */
    private static final <E extends Throwable> E m36594k(E e) {
        E e2 = C10738g.m36515e(e);
        if (e2 == null) {
            return null;
        }
        if ((e instanceof C10699d0) || C10457l.m35316a(e2.getMessage(), e.getMessage())) {
            return e2;
        }
        return null;
    }

    /* renamed from: l */
    public static final <E extends Throwable> E m36595l(E e) {
        E cause = e.getCause();
        if (cause != null && C10457l.m35316a(cause.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (m36591h(stackTrace[i])) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return cause;
            }
        }
        return e;
    }
}
