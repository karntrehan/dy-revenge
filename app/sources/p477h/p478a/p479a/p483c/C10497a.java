package p477h.p478a.p479a.p483c;

import java.io.IOException;

/* renamed from: h.a.a.c.a */
public class C10497a extends IOException {

    /* renamed from: f */
    private C10498a f27708f = C10498a.UNKNOWN;

    /* renamed from: h.a.a.c.a$a */
    public enum C10498a {
        WRONG_PASSWORD,
        TASK_CANCELLED_EXCEPTION,
        CHECKSUM_MISMATCH,
        UNKNOWN_COMPRESSION_METHOD,
        FILE_NOT_FOUND,
        UNSUPPORTED_ENCRYPTION,
        UNKNOWN
    }

    public C10497a(Exception exc) {
        super(exc);
    }

    public C10497a(String str) {
        super(str);
    }

    public C10497a(String str, C10498a aVar) {
        super(str);
        this.f27708f = aVar;
    }

    public C10497a(String str, Exception exc) {
        super(str, exc);
    }

    public C10497a(String str, Throwable th, C10498a aVar) {
        super(str, th);
        this.f27708f = aVar;
    }
}
