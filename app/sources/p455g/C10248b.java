package p455g;

import java.io.PrintWriter;
import java.io.StringWriter;
import p455g.p466w.C10410b;
import p455g.p470y.p472d.C10457l;

/* renamed from: g.b */
class C10248b {
    /* renamed from: a */
    public static void m34834a(Throwable th, Throwable th2) {
        C10457l.m35320e(th, "<this>");
        C10457l.m35320e(th2, "exception");
        if (th != th2) {
            C10410b.f27602a.mo25804a(th, th2);
        }
    }

    /* renamed from: b */
    public static String m34835b(Throwable th) {
        C10457l.m35320e(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        C10457l.m35319d(stringWriter2, "sw.toString()");
        return stringWriter2;
    }
}
