package p174e.p319f.p320a.p382e.p383a.p384a;

import okhttp3.HttpUrl;
import p174e.p319f.p320a.p382e.p383a.p384a.C9077d;

/* renamed from: e.f.a.e.a.a.v */
final class C9096v extends C9077d.C9078a {

    /* renamed from: a */
    private Integer f24975a;

    /* renamed from: b */
    private Boolean f24976b;

    C9096v() {
    }

    /* renamed from: a */
    public final C9077d mo23060a() {
        Integer num = this.f24975a;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (num == null) {
            str = str.concat(" appUpdateType");
        }
        if (this.f24976b == null) {
            str = String.valueOf(str).concat(" allowAssetPackDeletion");
        }
        if (str.isEmpty()) {
            return new C9097w(this.f24975a.intValue(), this.f24976b.booleanValue());
        }
        throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
    }

    /* renamed from: b */
    public final C9077d.C9078a mo23061b(boolean z) {
        this.f24976b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c */
    public final C9077d.C9078a mo23073c(int i) {
        this.f24975a = Integer.valueOf(i);
        return this;
    }
}
