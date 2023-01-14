package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import p455g.p470y.p472d.C10457l;
import p493i.C10616i;

public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        return basic$default(str, str2, (Charset) null, 4, (Object) null);
    }

    public static final String basic(String str, String str2, Charset charset) {
        C10457l.m35320e(str, "username");
        C10457l.m35320e(str2, "password");
        C10457l.m35320e(charset, "charset");
        String e = C10616i.f28050o.mo26427c(str + ':' + str2, charset).mo26270e();
        return "Basic " + e;
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            C10457l.m35319d(charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }
}
