package p493i;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.r */
final /* synthetic */ class C10626r {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f28069a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final C10590b0 m36166b(File file) {
        C10457l.m35320e(file, "$this$appendingSink");
        return C10625q.m36159g(new FileOutputStream(file, true));
    }

    /* renamed from: c */
    public static final boolean m36167c(AssertionError assertionError) {
        C10457l.m35320e(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C10300q.m34950G(message, "getsockname failed", false, 2, (Object) null) : false;
    }

    /* renamed from: d */
    public static final C10590b0 m36168d(File file, boolean z) {
        C10457l.m35320e(file, "$this$sink");
        return C10625q.m36159g(new FileOutputStream(file, z));
    }

    /* renamed from: e */
    public static final C10590b0 m36169e(OutputStream outputStream) {
        C10457l.m35320e(outputStream, "$this$sink");
        return new C10630u(outputStream, new C10600e0());
    }

    /* renamed from: f */
    public static final C10590b0 m36170f(Socket socket) {
        C10457l.m35320e(socket, "$this$sink");
        C10592c0 c0Var = new C10592c0(socket);
        OutputStream outputStream = socket.getOutputStream();
        C10457l.m35319d(outputStream, "getOutputStream()");
        return c0Var.sink(new C10630u(outputStream, c0Var));
    }

    /* renamed from: g */
    public static /* synthetic */ C10590b0 m36171g(File file, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return C10625q.m36158f(file, z);
    }

    /* renamed from: h */
    public static final C10598d0 m36172h(File file) {
        C10457l.m35320e(file, "$this$source");
        return C10625q.m36163k(new FileInputStream(file));
    }

    /* renamed from: i */
    public static final C10598d0 m36173i(InputStream inputStream) {
        C10457l.m35320e(inputStream, "$this$source");
        return new C10624p(inputStream, new C10600e0());
    }

    /* renamed from: j */
    public static final C10598d0 m36174j(Socket socket) {
        C10457l.m35320e(socket, "$this$source");
        C10592c0 c0Var = new C10592c0(socket);
        InputStream inputStream = socket.getInputStream();
        C10457l.m35319d(inputStream, "getInputStream()");
        return c0Var.source(new C10624p(inputStream, c0Var));
    }
}
