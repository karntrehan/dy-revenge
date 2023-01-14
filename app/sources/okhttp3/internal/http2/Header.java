package okhttp3.internal.http2;

import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10616i;

public final class Header {
    public static final Companion Companion = new Companion((C10452g) null);
    public static final C10616i PSEUDO_PREFIX;
    public static final C10616i RESPONSE_STATUS;
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final C10616i TARGET_AUTHORITY;
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final C10616i TARGET_METHOD;
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final C10616i TARGET_PATH;
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final C10616i TARGET_SCHEME;
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final C10616i name;
    public final C10616i value;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    static {
        C10616i.C10617a aVar = C10616i.f28050o;
        PSEUDO_PREFIX = aVar.mo26428d(":");
        RESPONSE_STATUS = aVar.mo26428d(RESPONSE_STATUS_UTF8);
        TARGET_METHOD = aVar.mo26428d(TARGET_METHOD_UTF8);
        TARGET_PATH = aVar.mo26428d(TARGET_PATH_UTF8);
        TARGET_SCHEME = aVar.mo26428d(TARGET_SCHEME_UTF8);
        TARGET_AUTHORITY = aVar.mo26428d(TARGET_AUTHORITY_UTF8);
    }

    public Header(C10616i iVar, C10616i iVar2) {
        C10457l.m35320e(iVar, "name");
        C10457l.m35320e(iVar2, "value");
        this.name = iVar;
        this.value = iVar2;
        this.hpackSize = iVar.mo26420Y() + 32 + iVar2.mo26420Y();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Header(C10616i iVar, String str) {
        this(iVar, C10616i.f28050o.mo26428d(str));
        C10457l.m35320e(iVar, "name");
        C10457l.m35320e(str, "value");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Header(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            p455g.p470y.p472d.C10457l.m35320e(r2, r0)
            java.lang.String r0 = "value"
            p455g.p470y.p472d.C10457l.m35320e(r3, r0)
            i.i$a r0 = p493i.C10616i.f28050o
            i.i r2 = r0.mo26428d(r2)
            i.i r3 = r0.mo26428d(r3)
            r1.<init>((p493i.C10616i) r2, (p493i.C10616i) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Header.<init>(java.lang.String, java.lang.String):void");
    }

    public static /* synthetic */ Header copy$default(Header header, C10616i iVar, C10616i iVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = header.name;
        }
        if ((i & 2) != 0) {
            iVar2 = header.value;
        }
        return header.copy(iVar, iVar2);
    }

    public final C10616i component1() {
        return this.name;
    }

    public final C10616i component2() {
        return this.value;
    }

    public final Header copy(C10616i iVar, C10616i iVar2) {
        C10457l.m35320e(iVar, "name");
        C10457l.m35320e(iVar2, "value");
        return new Header(iVar, iVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return C10457l.m35316a(this.name, header.name) && C10457l.m35316a(this.value, header.value);
    }

    public int hashCode() {
        C10616i iVar = this.name;
        int i = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        C10616i iVar2 = this.value;
        if (iVar2 != null) {
            i = iVar2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.name.mo26422c0() + ": " + this.value.mo26422c0();
    }
}
