package p174e.p199d.p217b;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: e.d.b.g */
public class C5706g extends Exception {

    /* renamed from: f */
    private final Throwable f16158f;

    public C5706g(String str) {
        this(str, (Throwable) null);
    }

    public C5706g(String str, Throwable th) {
        super(str);
        this.f16158f = th;
    }

    public C5706g(Throwable th) {
        this((String) null, th);
    }

    public void printStackTrace() {
        super.printStackTrace();
        if (this.f16158f != null) {
            System.err.println("--- inner exception ---");
            this.f16158f.printStackTrace();
        }
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f16158f != null) {
            printStream.println("--- inner exception ---");
            this.f16158f.printStackTrace(printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f16158f != null) {
            printWriter.println("--- inner exception ---");
            this.f16158f.printStackTrace(printWriter);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (this.f16158f != null) {
            sb.append("\n");
            sb.append("--- inner exception ---");
            sb.append("\n");
            sb.append(this.f16158f.toString());
        }
        return sb.toString();
    }
}
