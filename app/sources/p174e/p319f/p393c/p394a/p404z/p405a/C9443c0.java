package p174e.p319f.p393c.p394a.p404z.p405a;

import java.io.IOException;

/* renamed from: e.f.c.a.z.a.c0 */
public class C9443c0 extends IOException {

    /* renamed from: f */
    private C9537s0 f25311f = null;

    /* renamed from: e.f.c.a.z.a.c0$a */
    public static class C9444a extends C9443c0 {
        public C9444a(String str) {
            super(str);
        }
    }

    public C9443c0(String str) {
        super(str);
    }

    /* renamed from: a */
    static C9443c0 m31441a() {
        return new C9443c0("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: b */
    static C9443c0 m31442b() {
        return new C9443c0("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    static C9443c0 m31443c() {
        return new C9443c0("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    static C9444a m31444d() {
        return new C9444a("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    static C9443c0 m31445e() {
        return new C9443c0("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    static C9443c0 m31446f() {
        return new C9443c0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    static C9443c0 m31447g() {
        return new C9443c0("Failed to parse the message.");
    }

    /* renamed from: h */
    static C9443c0 m31448h() {
        return new C9443c0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: j */
    static C9443c0 m31449j() {
        return new C9443c0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: i */
    public C9443c0 mo23518i(C9537s0 s0Var) {
        this.f25311f = s0Var;
        return this;
    }
}
