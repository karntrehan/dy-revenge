package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p174e.p319f.p320a.p322b.C6463b;
import p174e.p319f.p320a.p322b.p323i.C6571h;

/* renamed from: com.google.android.datatransport.cct.c */
public final class C3328c implements C6571h {

    /* renamed from: a */
    static final String f9403a;

    /* renamed from: b */
    static final String f9404b;

    /* renamed from: c */
    private static final String f9405c;

    /* renamed from: d */
    private static final Set<C6463b> f9406d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C6463b[]{C6463b.m24863b("proto"), C6463b.m24863b("json")})));

    /* renamed from: e */
    public static final C3328c f9407e;

    /* renamed from: f */
    public static final C3328c f9408f;

    /* renamed from: g */
    private final String f9409g;

    /* renamed from: h */
    private final String f9410h;

    static {
        String a = C3332e.m13071a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f9403a = a;
        String a2 = C3332e.m13071a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f9404b = a2;
        String a3 = C3332e.m13071a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f9405c = a3;
        f9407e = new C3328c(a, (String) null);
        f9408f = new C3328c(a2, a3);
    }

    public C3328c(String str, String str2) {
        this.f9409g = str;
        this.f9410h = str2;
    }

    /* renamed from: d */
    public static C3328c m13051d(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C3328c(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: a */
    public Set<C6463b> mo10840a() {
        return f9406d;
    }

    /* renamed from: b */
    public byte[] mo10841b() {
        return mo10842c();
    }

    /* renamed from: c */
    public byte[] mo10842c() {
        String str = this.f9410h;
        if (str == null && this.f9409g == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f9409g;
        objArr[2] = "\\";
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    /* renamed from: e */
    public String mo10843e() {
        return this.f9410h;
    }

    /* renamed from: f */
    public String mo10844f() {
        return this.f9409g;
    }

    public String getName() {
        return "cct";
    }
}
