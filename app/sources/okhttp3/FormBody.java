package okhttp3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10603f;
import p493i.C10608g;

public final class FormBody extends RequestBody {
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get("application/x-www-form-urlencoded");
    public static final Companion Companion = new Companion((C10452g) null);
    private final List<String> encodedNames;
    private final List<String> encodedValues;

    public static final class Builder {
        private final Charset charset;
        private final List<String> names;
        private final List<String> values;

        public Builder() {
            this((Charset) null, 1, (C10452g) null);
        }

        public Builder(Charset charset2) {
            this.charset = charset2;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Builder(Charset charset2, int i, C10452g gVar) {
            this((i & 1) != 0 ? null : charset2);
        }

        public final Builder add(String str, String str2) {
            String str3 = str;
            C10457l.m35320e(str3, "name");
            C10457l.m35320e(str2, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str3, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, (Object) null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, (Object) null));
            return this;
        }

        public final Builder addEncoded(String str, String str2) {
            String str3 = str;
            C10457l.m35320e(str3, "name");
            C10457l.m35320e(str2, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str3, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, (Object) null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, (Object) null));
            return this;
        }

        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }
    }

    public FormBody(List<String> list, List<String> list2) {
        C10457l.m35320e(list, "encodedNames");
        C10457l.m35320e(list2, "encodedValues");
        this.encodedNames = Util.toImmutableList(list);
        this.encodedValues = Util.toImmutableList(list2);
    }

    private final long writeOrCountBytes(C10608g gVar, boolean z) {
        C10603f fVar;
        if (z) {
            fVar = new C10603f();
        } else {
            C10457l.m35317b(gVar);
            fVar = gVar.mo26350d();
        }
        int size = this.encodedNames.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                fVar.writeByte(38);
            }
            fVar.mo26320K(this.encodedNames.get(i));
            fVar.writeByte(61);
            fVar.mo26320K(this.encodedValues.get(i));
        }
        if (!z) {
            return 0;
        }
        long size2 = fVar.size();
        fVar.mo26366r();
        return size2;
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m37369deprecated_size() {
        return size();
    }

    public long contentLength() {
        return writeOrCountBytes((C10608g) null, true);
    }

    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    public final String encodedName(int i) {
        return this.encodedNames.get(i);
    }

    public final String encodedValue(int i) {
        return this.encodedValues.get(i);
    }

    public final String name(int i) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedName(i), 0, 0, true, 3, (Object) null);
    }

    public final int size() {
        return this.encodedNames.size();
    }

    public final String value(int i) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedValue(i), 0, 0, true, 3, (Object) null);
    }

    public void writeTo(C10608g gVar) {
        C10457l.m35320e(gVar, "sink");
        writeOrCountBytes(gVar, false);
    }
}
