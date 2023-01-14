package p027c.p064i.p070h;

import android.util.Base64;
import androidx.core.util.C1177h;
import java.util.List;

/* renamed from: c.i.h.d */
public final class C1872d {

    /* renamed from: a */
    private final String f5514a;

    /* renamed from: b */
    private final String f5515b;

    /* renamed from: c */
    private final String f5516c;

    /* renamed from: d */
    private final List<List<byte[]>> f5517d;

    /* renamed from: e */
    private final int f5518e = 0;

    /* renamed from: f */
    private final String f5519f;

    public C1872d(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f5514a = (String) C1177h.m4583e(str);
        this.f5515b = (String) C1177h.m4583e(str2);
        this.f5516c = (String) C1177h.m4583e(str3);
        this.f5517d = (List) C1177h.m4583e(list);
        this.f5519f = m7895a(str, str2, str3);
    }

    /* renamed from: a */
    private String m7895a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    /* renamed from: b */
    public List<List<byte[]>> mo6377b() {
        return this.f5517d;
    }

    /* renamed from: c */
    public int mo6378c() {
        return this.f5518e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo6379d() {
        return this.f5519f;
    }

    /* renamed from: e */
    public String mo6380e() {
        return this.f5514a;
    }

    /* renamed from: f */
    public String mo6381f() {
        return this.f5515b;
    }

    /* renamed from: g */
    public String mo6382g() {
        return this.f5516c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f5514a + ", mProviderPackage: " + this.f5515b + ", mQuery: " + this.f5516c + ", mCertificates:");
        for (int i = 0; i < this.f5517d.size(); i++) {
            sb.append(" [");
            List list = this.f5517d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f5518e);
        return sb.toString();
    }
}
