package p174e.p319f.p320a.p335c.p345f.p357l;

import java.io.IOException;

/* renamed from: e.f.a.c.f.l.nd */
public class C8366nd extends IOException {

    /* renamed from: f */
    private C8274ie f22837f = null;

    public C8366nd(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public C8366nd(String str) {
        super(str);
    }

    /* renamed from: a */
    static C8330ld m28884a() {
        return new C8330ld("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static C8366nd m28885b() {
        return new C8366nd("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    static C8366nd m28886c() {
        return new C8366nd("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    static C8366nd m28887d() {
        return new C8366nd("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    static C8366nd m28888e() {
        return new C8366nd("Failed to parse the message.");
    }

    /* renamed from: g */
    static C8366nd m28889g() {
        return new C8366nd("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: f */
    public final C8366nd mo22033f(C8274ie ieVar) {
        this.f22837f = ieVar;
        return this;
    }
}
