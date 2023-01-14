package p493i;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import p455g.p470y.p472d.C10457l;

/* renamed from: i.c0 */
final class C10592c0 extends C10593d {

    /* renamed from: a */
    private final Socket f28029a;

    public C10592c0(Socket socket) {
        C10457l.m35320e(socket, "socket");
        this.f28029a = socket;
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.AssertionError} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Exception} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Exception} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void timedOut() {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r1 = r5.f28029a     // Catch:{ Exception -> 0x001c, AssertionError -> 0x0008 }
            r1.close()     // Catch:{ Exception -> 0x001c, AssertionError -> 0x0008 }
            goto L_0x0037
        L_0x0008:
            r1 = move-exception
            boolean r2 = p493i.C10625q.m36157e(r1)
            if (r2 == 0) goto L_0x001b
            java.util.logging.Logger r2 = p493i.C10626r.f28069a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L_0x0028
        L_0x001b:
            throw r1
        L_0x001c:
            r1 = move-exception
            java.util.logging.Logger r2 = p493i.C10626r.f28069a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L_0x0028:
            r4.append(r0)
            java.net.Socket r0 = r5.f28029a
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0, r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p493i.C10592c0.timedOut():void");
    }
}
