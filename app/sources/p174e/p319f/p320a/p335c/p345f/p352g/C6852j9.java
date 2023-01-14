package p174e.p319f.p320a.p335c.p345f.p352g;

import java.io.IOException;

/* renamed from: e.f.a.c.f.g.j9 */
public class C6852j9 extends IOException {
    public C6852j9(String str) {
        super(str);
    }

    /* renamed from: a */
    static C6836i9 m25975a() {
        return new C6836i9("Protocol message tag had invalid wire type.");
    }

    /* renamed from: b */
    static C6852j9 m25976b() {
        return new C6852j9("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    static C6852j9 m25977c() {
        return new C6852j9("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    static C6852j9 m25978d() {
        return new C6852j9("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: e */
    static C6852j9 m25979e() {
        return new C6852j9("Failed to parse the message.");
    }

    /* renamed from: f */
    static C6852j9 m25980f() {
        return new C6852j9("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
