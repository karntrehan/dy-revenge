package okhttp3;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import p027c.p028a.C1444j;
import p455g.p456a0.C10240a;
import p455g.p459d0.C10286f;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p493i.C10603f;

public final class HttpUrl {
    public static final Companion Companion = new Companion((C10452g) null);
    public static final String FORM_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    public static final String FRAGMENT_ENCODE_SET = "";
    public static final String FRAGMENT_ENCODE_SET_URI = " \"#<>\\^`{|}";
    /* access modifiers changed from: private */
    public static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String PASSWORD_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET = " \"<>^`{}|/\\?#";
    public static final String PATH_SEGMENT_ENCODE_SET_URI = "[]";
    public static final String QUERY_COMPONENT_ENCODE_SET = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    public static final String QUERY_COMPONENT_ENCODE_SET_URI = "\\^`{|}";
    public static final String QUERY_COMPONENT_REENCODE_SET = " \"'<>#&=";
    public static final String QUERY_ENCODE_SET = " \"'<>#";
    public static final String USERNAME_ENCODE_SET = " \"':;<=>@[]^`{}|/\\?#";
    private final String fragment;
    private final String host;
    private final boolean isHttps;
    private final String password;
    private final List<String> pathSegments;
    private final int port;
    private final List<String> queryNamesAndValues;
    private final String scheme;
    private final String url;
    private final String username;

    public static final class Builder {
        public static final Companion Companion = new Companion((C10452g) null);
        public static final String INVALID_HOST = "Invalid URL host";
        private String encodedFragment;
        private String encodedPassword = HttpUrl.FRAGMENT_ENCODE_SET;
        private final List<String> encodedPathSegments;
        private List<String> encodedQueryNamesAndValues;
        private String encodedUsername = HttpUrl.FRAGMENT_ENCODE_SET;
        private String host;
        private int port = -1;
        private String scheme;

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(C10452g gVar) {
                this();
            }

            /* access modifiers changed from: private */
            public final int parsePort(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, false, (Charset) null, 248, (Object) null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* access modifiers changed from: private */
            public final int portColonOffset(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == ':') {
                        return i;
                    }
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i >= i2) {
                                break;
                            }
                        } while (str.charAt(i) == ']');
                    }
                    i++;
                }
                return i2;
            }

            /* access modifiers changed from: private */
            public final int schemeDelimiterOffset(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((C10457l.m35322g(charAt, 97) < 0 || C10457l.m35322g(charAt, C1444j.f4256L0) > 0) && (C10457l.m35322g(charAt, 65) < 0 || C10457l.m35322g(charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if (('a' > charAt2 || 'z' < charAt2) && (('A' > charAt2 || 'Z' < charAt2) && (('0' > charAt2 || '9' < charAt2) && charAt2 != '+' && charAt2 != '-' && charAt2 != '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                        return -1;
                    }
                }
            }

            /* access modifiers changed from: private */
            public final int slashCount(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }
        }

        public Builder() {
            ArrayList arrayList = new ArrayList();
            this.encodedPathSegments = arrayList;
            arrayList.add(HttpUrl.FRAGMENT_ENCODE_SET);
        }

        private final Builder addPathSegments(String str, boolean z) {
            int i = 0;
            do {
                int delimiterOffset = Util.delimiterOffset(str, "/\\", i, str.length());
                push(str, i, delimiterOffset, delimiterOffset < str.length(), z);
                i = delimiterOffset + 1;
            } while (i <= str.length());
            return this;
        }

        private final int effectivePort() {
            int i = this.port;
            if (i != -1) {
                return i;
            }
            Companion companion = HttpUrl.Companion;
            String str = this.scheme;
            C10457l.m35317b(str);
            return companion.defaultPort(str);
        }

        private final boolean isDot(String str) {
            return C10457l.m35316a(str, ".") || C10299p.m34929o(str, "%2e", true);
        }

        private final boolean isDotDot(String str) {
            return C10457l.m35316a(str, "..") || C10299p.m34929o(str, "%2e.", true) || C10299p.m34929o(str, ".%2e", true) || C10299p.m34929o(str, "%2e%2e", true);
        }

        private final void pop() {
            List<String> list = this.encodedPathSegments;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.encodedPathSegments.isEmpty())) {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
                return;
            }
            List<String> list2 = this.encodedPathSegments;
            list2.set(list2.size() - 1, HttpUrl.FRAGMENT_ENCODE_SET);
        }

        private final void push(String str, int i, int i2, boolean z, boolean z2) {
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i, i2, HttpUrl.PATH_SEGMENT_ENCODE_SET, z2, false, false, false, (Charset) null, 240, (Object) null);
            if (!isDot(canonicalize$okhttp$default)) {
                if (isDotDot(canonicalize$okhttp$default)) {
                    pop();
                    return;
                }
                List<String> list = this.encodedPathSegments;
                if (list.get(list.size() - 1).length() == 0) {
                    List<String> list2 = this.encodedPathSegments;
                    list2.set(list2.size() - 1, canonicalize$okhttp$default);
                } else {
                    this.encodedPathSegments.add(canonicalize$okhttp$default);
                }
                if (z) {
                    this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
                }
            }
        }

        private final void removeAllCanonicalQueryParameters(String str) {
            List<String> list = this.encodedQueryNamesAndValues;
            C10457l.m35317b(list);
            C10240a h = C10247f.m34832h(C10247f.m34831g(list.size() - 2, 0), 2);
            int b = h.mo25547b();
            int g = h.mo25549g();
            int h2 = h.mo25550h();
            if (h2 >= 0) {
                if (b > g) {
                    return;
                }
            } else if (b < g) {
                return;
            }
            while (true) {
                List<String> list2 = this.encodedQueryNamesAndValues;
                C10457l.m35317b(list2);
                if (C10457l.m35316a(str, list2.get(b))) {
                    List<String> list3 = this.encodedQueryNamesAndValues;
                    C10457l.m35317b(list3);
                    list3.remove(b + 1);
                    List<String> list4 = this.encodedQueryNamesAndValues;
                    C10457l.m35317b(list4);
                    list4.remove(b);
                    List<String> list5 = this.encodedQueryNamesAndValues;
                    C10457l.m35317b(list5);
                    if (list5.isEmpty()) {
                        this.encodedQueryNamesAndValues = null;
                        return;
                    }
                }
                if (b != g) {
                    b += h2;
                } else {
                    return;
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        private final void resolvePath(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.encodedPathSegments
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r11, (java.lang.String) r12, (int) r6, (int) r13)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.push(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.resolvePath(java.lang.String, int, int):void");
        }

        public final Builder addEncodedPathSegment(String str) {
            C10457l.m35320e(str, "encodedPathSegment");
            push(str, 0, str.length(), false, true);
            return this;
        }

        public final Builder addEncodedPathSegments(String str) {
            C10457l.m35320e(str, "encodedPathSegments");
            return addPathSegments(str, true);
        }

        public final Builder addEncodedQueryParameter(String str, String str2) {
            C10457l.m35320e(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            C10457l.m35317b(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            C10457l.m35317b(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null) : null);
            return this;
        }

        public final Builder addPathSegment(String str) {
            C10457l.m35320e(str, "pathSegment");
            push(str, 0, str.length(), false, false);
            return this;
        }

        public final Builder addPathSegments(String str) {
            C10457l.m35320e(str, "pathSegments");
            return addPathSegments(str, false);
        }

        public final Builder addQueryParameter(String str, String str2) {
            C10457l.m35320e(str, "name");
            if (this.encodedQueryNamesAndValues == null) {
                this.encodedQueryNamesAndValues = new ArrayList();
            }
            List<String> list = this.encodedQueryNamesAndValues;
            C10457l.m35317b(list);
            Companion companion = HttpUrl.Companion;
            list.add(Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null));
            List<String> list2 = this.encodedQueryNamesAndValues;
            C10457l.m35317b(list2);
            list2.add(str2 != null ? Companion.canonicalize$okhttp$default(companion, str2, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null) : null);
            return this;
        }

        public final HttpUrl build() {
            ArrayList arrayList;
            String str = this.scheme;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String percentDecode$okhttp$default = Companion.percentDecode$okhttp$default(companion, this.encodedUsername, 0, 0, false, 7, (Object) null);
                String percentDecode$okhttp$default2 = Companion.percentDecode$okhttp$default(companion, this.encodedPassword, 0, 0, false, 7, (Object) null);
                String str2 = this.host;
                if (str2 != null) {
                    int effectivePort = effectivePort();
                    List<String> list = this.encodedPathSegments;
                    ArrayList arrayList2 = new ArrayList(C10351m.m35147p(list, 10));
                    for (String percentDecode$okhttp$default3 : list) {
                        arrayList2.add(Companion.percentDecode$okhttp$default(HttpUrl.Companion, percentDecode$okhttp$default3, 0, 0, false, 7, (Object) null));
                    }
                    List<String> list2 = this.encodedQueryNamesAndValues;
                    if (list2 != null) {
                        arrayList = new ArrayList(C10351m.m35147p(list2, 10));
                        for (String str3 : list2) {
                            arrayList.add(str3 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str3, 0, 0, true, 3, (Object) null) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str4 = this.encodedFragment;
                    return new HttpUrl(str, percentDecode$okhttp$default, percentDecode$okhttp$default2, str2, effectivePort, arrayList2, arrayList, str4 != null ? Companion.percentDecode$okhttp$default(HttpUrl.Companion, str4, 0, 0, false, 7, (Object) null) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final Builder encodedFragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, (Charset) null, 179, (Object) null) : null;
            return this;
        }

        public final Builder encodedPassword(String str) {
            C10457l.m35320e(str, "encodedPassword");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 243, (Object) null);
            return this;
        }

        public final Builder encodedPath(String str) {
            C10457l.m35320e(str, "encodedPath");
            if (C10299p.m34926B(str, "/", false, 2, (Object) null)) {
                resolvePath(str, 0, str.length());
                return this;
            }
            throw new IllegalArgumentException(("unexpected encodedPath: " + str).toString());
        }

        public final Builder encodedQuery(String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder encodedUsername(String str) {
            C10457l.m35320e(str, "encodedUsername");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 243, (Object) null);
            return this;
        }

        public final Builder fragment(String str) {
            this.encodedFragment = str != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, false, false, false, true, (Charset) null, 187, (Object) null) : null;
            return this;
        }

        public final String getEncodedFragment$okhttp() {
            return this.encodedFragment;
        }

        public final String getEncodedPassword$okhttp() {
            return this.encodedPassword;
        }

        public final List<String> getEncodedPathSegments$okhttp() {
            return this.encodedPathSegments;
        }

        public final List<String> getEncodedQueryNamesAndValues$okhttp() {
            return this.encodedQueryNamesAndValues;
        }

        public final String getEncodedUsername$okhttp() {
            return this.encodedUsername;
        }

        public final String getHost$okhttp() {
            return this.host;
        }

        public final int getPort$okhttp() {
            return this.port;
        }

        public final String getScheme$okhttp() {
            return this.scheme;
        }

        public final Builder host(String str) {
            C10457l.m35320e(str, "host");
            String canonicalHost = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, 0, 0, false, 7, (Object) null));
            if (canonicalHost != null) {
                this.host = canonicalHost;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        public final Builder parse$okhttp(HttpUrl httpUrl, String str) {
            int i;
            int delimiterOffset;
            int i2;
            String str2;
            int i3;
            String str3;
            int i4;
            boolean z;
            boolean z2;
            String str4 = str;
            C10457l.m35320e(str4, "input");
            int indexOfFirstNonAsciiWhitespace$default = Util.indexOfFirstNonAsciiWhitespace$default(str4, 0, 0, 3, (Object) null);
            int indexOfLastNonAsciiWhitespace$default = Util.indexOfLastNonAsciiWhitespace$default(str4, indexOfFirstNonAsciiWhitespace$default, 0, 2, (Object) null);
            Companion companion = Companion;
            int access$schemeDelimiterOffset = companion.schemeDelimiterOffset(str4, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            String str5 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c = 65535;
            if (access$schemeDelimiterOffset != -1) {
                if (C10299p.m34939y(str4, "https:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "https";
                    indexOfFirstNonAsciiWhitespace$default += 6;
                } else if (C10299p.m34939y(str4, "http:", indexOfFirstNonAsciiWhitespace$default, true)) {
                    this.scheme = "http";
                    indexOfFirstNonAsciiWhitespace$default += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str4.substring(0, access$schemeDelimiterOffset);
                    C10457l.m35319d(substring, str5);
                    sb.append(substring);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (httpUrl != null) {
                this.scheme = httpUrl.scheme();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int access$slashCount = companion.slashCount(str4, indexOfFirstNonAsciiWhitespace$default, indexOfLastNonAsciiWhitespace$default);
            char c2 = '?';
            char c3 = '#';
            if (access$slashCount >= 2 || httpUrl == null || (!C10457l.m35316a(httpUrl.scheme(), this.scheme))) {
                int i5 = indexOfFirstNonAsciiWhitespace$default + access$slashCount;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    delimiterOffset = Util.delimiterOffset(str4, "@/\\?#", i5, indexOfLastNonAsciiWhitespace$default);
                    char charAt = delimiterOffset != indexOfLastNonAsciiWhitespace$default ? str4.charAt(delimiterOffset) : 65535;
                    if (charAt == c || charAt == c3 || charAt == '/' || charAt == '\\' || charAt == c2) {
                        String str6 = str5;
                        i = indexOfLastNonAsciiWhitespace$default;
                        int i6 = delimiterOffset;
                        Companion companion2 = Companion;
                        int access$portColonOffset = companion2.portColonOffset(str4, i5, i6);
                        int i7 = access$portColonOffset + 1;
                    } else {
                        if (charAt != '@') {
                            str3 = str5;
                            i3 = indexOfLastNonAsciiWhitespace$default;
                        } else {
                            if (!z3) {
                                int delimiterOffset2 = Util.delimiterOffset(str4, ':', i5, delimiterOffset);
                                Companion companion3 = HttpUrl.Companion;
                                String str7 = "%40";
                                int i8 = delimiterOffset;
                                int i9 = delimiterOffset2;
                                i3 = indexOfLastNonAsciiWhitespace$default;
                                String str8 = str5;
                                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion3, str, i5, delimiterOffset2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                if (z4) {
                                    canonicalize$okhttp$default = this.encodedUsername + str7 + canonicalize$okhttp$default;
                                }
                                this.encodedUsername = canonicalize$okhttp$default;
                                int i10 = i8;
                                int i11 = i9;
                                if (i11 != i10) {
                                    this.encodedPassword = Companion.canonicalize$okhttp$default(companion3, str, i11 + 1, i10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null);
                                    z2 = true;
                                } else {
                                    z2 = z3;
                                }
                                z3 = z2;
                                str3 = str8;
                                z = true;
                                i4 = i10;
                            } else {
                                i3 = indexOfLastNonAsciiWhitespace$default;
                                String str9 = str5;
                                int i12 = delimiterOffset;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(this.encodedPassword);
                                sb2.append("%40");
                                StringBuilder sb3 = sb2;
                                str3 = str9;
                                i4 = i12;
                                sb3.append(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, i5, i12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, (Charset) null, 240, (Object) null));
                                this.encodedPassword = sb3.toString();
                                z = z4;
                            }
                            i5 = i4 + 1;
                            z4 = z;
                        }
                        str5 = str3;
                        indexOfLastNonAsciiWhitespace$default = i3;
                        c3 = '#';
                        c2 = '?';
                        c = 65535;
                    }
                }
                String str62 = str5;
                i = indexOfLastNonAsciiWhitespace$default;
                int i62 = delimiterOffset;
                Companion companion22 = Companion;
                int access$portColonOffset2 = companion22.portColonOffset(str4, i5, i62);
                int i72 = access$portColonOffset2 + 1;
                if (i72 < i62) {
                    i2 = i5;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(HttpUrl.Companion, str, i5, access$portColonOffset2, false, 4, (Object) null));
                    int access$parsePort = companion22.parsePort(str4, i72, i62);
                    this.port = access$parsePort;
                    if (access$parsePort != -1) {
                        str2 = str62;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = str4.substring(i72, i62);
                        C10457l.m35319d(substring2, str62);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                } else {
                    i2 = i5;
                    str2 = str62;
                    Companion companion4 = HttpUrl.Companion;
                    this.host = HostnamesKt.toCanonicalHost(Companion.percentDecode$okhttp$default(companion4, str, i2, access$portColonOffset2, false, 4, (Object) null));
                    String str10 = this.scheme;
                    C10457l.m35317b(str10);
                    this.port = companion4.defaultPort(str10);
                }
                if (this.host != null) {
                    indexOfFirstNonAsciiWhitespace$default = i62;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = str4.substring(i2, access$portColonOffset2);
                    C10457l.m35319d(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
            } else {
                this.encodedUsername = httpUrl.encodedUsername();
                this.encodedPassword = httpUrl.encodedPassword();
                this.host = httpUrl.host();
                this.port = httpUrl.port();
                this.encodedPathSegments.clear();
                this.encodedPathSegments.addAll(httpUrl.encodedPathSegments());
                if (indexOfFirstNonAsciiWhitespace$default == indexOfLastNonAsciiWhitespace$default || str4.charAt(indexOfFirstNonAsciiWhitespace$default) == '#') {
                    encodedQuery(httpUrl.encodedQuery());
                }
                i = indexOfLastNonAsciiWhitespace$default;
            }
            int i13 = i;
            int delimiterOffset3 = Util.delimiterOffset(str4, "?#", indexOfFirstNonAsciiWhitespace$default, i13);
            resolvePath(str4, indexOfFirstNonAsciiWhitespace$default, delimiterOffset3);
            if (delimiterOffset3 < i13 && str4.charAt(delimiterOffset3) == '?') {
                int delimiterOffset4 = Util.delimiterOffset(str4, '#', delimiterOffset3, i13);
                Companion companion5 = HttpUrl.Companion;
                this.encodedQueryNamesAndValues = companion5.toQueryNamesAndValues$okhttp(Companion.canonicalize$okhttp$default(companion5, str, delimiterOffset3 + 1, delimiterOffset4, HttpUrl.QUERY_ENCODE_SET, true, false, true, false, (Charset) null, 208, (Object) null));
                delimiterOffset3 = delimiterOffset4;
            }
            if (delimiterOffset3 < i13 && str4.charAt(delimiterOffset3) == '#') {
                this.encodedFragment = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, delimiterOffset3 + 1, i13, HttpUrl.FRAGMENT_ENCODE_SET, true, false, false, true, (Charset) null, 176, (Object) null);
            }
            return this;
        }

        public final Builder password(String str) {
            C10457l.m35320e(str, "password");
            this.encodedPassword = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }

        public final Builder port(int i) {
            boolean z = true;
            if (1 > i || 65535 < i) {
                z = false;
            }
            if (z) {
                this.port = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }

        public final Builder query(String str) {
            List<String> list;
            if (str != null) {
                Companion companion = HttpUrl.Companion;
                String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(companion, str, 0, 0, HttpUrl.QUERY_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null);
                if (canonicalize$okhttp$default != null) {
                    list = companion.toQueryNamesAndValues$okhttp(canonicalize$okhttp$default);
                    this.encodedQueryNamesAndValues = list;
                    return this;
                }
            }
            list = null;
            this.encodedQueryNamesAndValues = list;
            return this;
        }

        public final Builder reencodeForUri$okhttp() {
            String str = this.host;
            String str2 = null;
            this.host = str != null ? new C10286f("[\"<>^`{|}]").mo25596b(str, HttpUrl.FRAGMENT_ENCODE_SET) : null;
            int size = this.encodedPathSegments.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.encodedPathSegments;
                list.set(i, Companion.canonicalize$okhttp$default(HttpUrl.Companion, list.get(i), 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, true, true, false, false, (Charset) null, 227, (Object) null));
            }
            List<String> list2 = this.encodedQueryNamesAndValues;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str3 = list2.get(i2);
                    list2.set(i2, str3 != null ? Companion.canonicalize$okhttp$default(HttpUrl.Companion, str3, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET_URI, true, true, true, false, (Charset) null, 195, (Object) null) : null);
                }
            }
            String str4 = this.encodedFragment;
            if (str4 != null) {
                str2 = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str4, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET_URI, true, true, false, true, (Charset) null, 163, (Object) null);
            }
            this.encodedFragment = str2;
            return this;
        }

        public final Builder removeAllEncodedQueryParameters(String str) {
            C10457l.m35320e(str, "encodedName");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_REENCODE_SET, true, false, true, false, (Charset) null, 211, (Object) null));
            return this;
        }

        public final Builder removeAllQueryParameters(String str) {
            C10457l.m35320e(str, "name");
            if (this.encodedQueryNamesAndValues == null) {
                return this;
            }
            removeAllCanonicalQueryParameters(Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.QUERY_COMPONENT_ENCODE_SET, false, false, true, false, (Charset) null, 219, (Object) null));
            return this;
        }

        public final Builder removePathSegment(int i) {
            this.encodedPathSegments.remove(i);
            if (this.encodedPathSegments.isEmpty()) {
                this.encodedPathSegments.add(HttpUrl.FRAGMENT_ENCODE_SET);
            }
            return this;
        }

        public final Builder scheme(String str) {
            C10457l.m35320e(str, "scheme");
            String str2 = "http";
            if (!C10299p.m34929o(str, str2, true)) {
                str2 = "https";
                if (!C10299p.m34929o(str, str2, true)) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.scheme = str2;
            return this;
        }

        public final void setEncodedFragment$okhttp(String str) {
            this.encodedFragment = str;
        }

        public final void setEncodedPassword$okhttp(String str) {
            C10457l.m35320e(str, "<set-?>");
            this.encodedPassword = str;
        }

        public final Builder setEncodedPathSegment(int i, String str) {
            C10457l.m35320e(str, "encodedPathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, true, false, false, false, (Charset) null, 243, (Object) null);
            this.encodedPathSegments.set(i, canonicalize$okhttp$default);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void setEncodedQueryNamesAndValues$okhttp(List<String> list) {
            this.encodedQueryNamesAndValues = list;
        }

        public final Builder setEncodedQueryParameter(String str, String str2) {
            C10457l.m35320e(str, "encodedName");
            removeAllEncodedQueryParameters(str);
            addEncodedQueryParameter(str, str2);
            return this;
        }

        public final void setEncodedUsername$okhttp(String str) {
            C10457l.m35320e(str, "<set-?>");
            this.encodedUsername = str;
        }

        public final void setHost$okhttp(String str) {
            this.host = str;
        }

        public final Builder setPathSegment(int i, String str) {
            C10457l.m35320e(str, "pathSegment");
            String canonicalize$okhttp$default = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, HttpUrl.PATH_SEGMENT_ENCODE_SET, false, false, false, false, (Charset) null, 251, (Object) null);
            if (!isDot(canonicalize$okhttp$default) && !isDotDot(canonicalize$okhttp$default)) {
                this.encodedPathSegments.set(i, canonicalize$okhttp$default);
                return this;
            }
            throw new IllegalArgumentException(("unexpected path segment: " + str).toString());
        }

        public final void setPort$okhttp(int i) {
            this.port = i;
        }

        public final Builder setQueryParameter(String str, String str2) {
            C10457l.m35320e(str, "name");
            removeAllQueryParameters(str);
            addQueryParameter(str, str2);
            return this;
        }

        public final void setScheme$okhttp(String str) {
            this.scheme = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
            if ((r6.encodedPassword.length() > 0) != false) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
            if (r1 != r3.defaultPort(r2)) goto L_0x0090;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L_0x000f
                r0.append(r1)
                java.lang.String r1 = "://"
                goto L_0x0011
            L_0x000f:
                java.lang.String r1 = "//"
            L_0x0011:
                r0.append(r1)
                java.lang.String r1 = r6.encodedUsername
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0020
                r1 = 1
                goto L_0x0021
            L_0x0020:
                r1 = 0
            L_0x0021:
                r4 = 58
                if (r1 != 0) goto L_0x0032
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x002f
                r1 = 1
                goto L_0x0030
            L_0x002f:
                r1 = 0
            L_0x0030:
                if (r1 == 0) goto L_0x0050
            L_0x0032:
                java.lang.String r1 = r6.encodedUsername
                r0.append(r1)
                java.lang.String r1 = r6.encodedPassword
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0040
                goto L_0x0041
            L_0x0040:
                r2 = 0
            L_0x0041:
                if (r2 == 0) goto L_0x004b
                r0.append(r4)
                java.lang.String r1 = r6.encodedPassword
                r0.append(r1)
            L_0x004b:
                r1 = 64
                r0.append(r1)
            L_0x0050:
                java.lang.String r1 = r6.host
                if (r1 == 0) goto L_0x0074
                p455g.p470y.p472d.C10457l.m35317b(r1)
                r2 = 2
                r5 = 0
                boolean r1 = p455g.p459d0.C10300q.m34949F(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L_0x006f
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.host
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0074
            L_0x006f:
                java.lang.String r1 = r6.host
                r0.append(r1)
            L_0x0074:
                int r1 = r6.port
                r2 = -1
                if (r1 != r2) goto L_0x007d
                java.lang.String r1 = r6.scheme
                if (r1 == 0) goto L_0x0096
            L_0x007d:
                int r1 = r6.effectivePort()
                java.lang.String r2 = r6.scheme
                if (r2 == 0) goto L_0x0090
                okhttp3.HttpUrl$Companion r3 = okhttp3.HttpUrl.Companion
                p455g.p470y.p472d.C10457l.m35317b(r2)
                int r2 = r3.defaultPort(r2)
                if (r1 == r2) goto L_0x0096
            L_0x0090:
                r0.append(r4)
                r0.append(r1)
            L_0x0096:
                okhttp3.HttpUrl$Companion r1 = okhttp3.HttpUrl.Companion
                java.util.List<java.lang.String> r2 = r6.encodedPathSegments
                r1.toPathString$okhttp(r2, r0)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                if (r2 == 0) goto L_0x00ae
                r2 = 63
                r0.append(r2)
                java.util.List<java.lang.String> r2 = r6.encodedQueryNamesAndValues
                p455g.p470y.p472d.C10457l.m35317b(r2)
                r1.toQueryString$okhttp(r2, r0)
            L_0x00ae:
                java.lang.String r1 = r6.encodedFragment
                if (r1 == 0) goto L_0x00bc
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.encodedFragment
                r0.append(r1)
            L_0x00bc:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                p455g.p470y.p472d.C10457l.m35319d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Builder.toString():java.lang.String");
        }

        public final Builder username(String str) {
            C10457l.m35320e(str, "username");
            this.encodedUsername = Companion.canonicalize$okhttp$default(HttpUrl.Companion, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251, (Object) null);
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }

        public static /* synthetic */ String canonicalize$okhttp$default(Companion companion, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            int i4 = i3;
            return companion.canonicalize$okhttp(str, (i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? str.length() : i2, str2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? null : charset);
        }

        private final boolean isPercentEncoded(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && Util.parseHexDigit(str.charAt(i + 1)) != -1 && Util.parseHexDigit(str.charAt(i3)) != -1;
        }

        public static /* synthetic */ String percentDecode$okhttp$default(Companion companion, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return companion.percentDecode$okhttp(str, i, i2, z);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0065, code lost:
            if (isPercentEncoded(r1, r5, r2) == false) goto L_0x0072;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void writeCanonicalized(p493i.C10603f r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00bf
                java.lang.String r7 = "null cannot be cast to non-null type java.lang.String"
                java.util.Objects.requireNonNull(r1, r7)
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x002e
                r8 = 9
                if (r7 == r8) goto L_0x0029
                r8 = 10
                if (r7 == r8) goto L_0x0029
                r8 = 12
                if (r7 == r8) goto L_0x0029
                r8 = 13
                if (r7 == r8) goto L_0x0029
                goto L_0x002e
            L_0x0029:
                r8 = r14
                r12 = r19
                goto L_0x00b8
            L_0x002e:
                r8 = 43
                if (r7 != r8) goto L_0x003f
                if (r22 == 0) goto L_0x003f
                if (r20 == 0) goto L_0x0039
                java.lang.String r8 = "+"
                goto L_0x003b
            L_0x0039:
                java.lang.String r8 = "%2B"
            L_0x003b:
                r15.mo26320K(r8)
                goto L_0x0029
            L_0x003f:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x006f
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x006f
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x004f
                if (r23 == 0) goto L_0x006f
            L_0x004f:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = p455g.p459d0.C10300q.m34949F(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L_0x006d
                if (r7 != r9) goto L_0x0068
                if (r20 == 0) goto L_0x006d
                if (r21 == 0) goto L_0x0068
                r8 = r14
                boolean r10 = r14.isPercentEncoded(r1, r5, r2)
                if (r10 != 0) goto L_0x0069
                goto L_0x0072
            L_0x0068:
                r8 = r14
            L_0x0069:
                r15.mo26352d1(r7)
                goto L_0x00b8
            L_0x006d:
                r8 = r14
                goto L_0x0072
            L_0x006f:
                r8 = r14
                r12 = r19
            L_0x0072:
                if (r6 != 0) goto L_0x0079
                i.f r6 = new i.f
                r6.<init>()
            L_0x0079:
                if (r3 == 0) goto L_0x008d
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = p455g.p470y.p472d.C10457l.m35316a(r3, r10)
                if (r10 == 0) goto L_0x0084
                goto L_0x008d
            L_0x0084:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.mo26345Z0(r1, r5, r10, r3)
                goto L_0x0090
            L_0x008d:
                r6.mo26352d1(r7)
            L_0x0090:
                boolean r10 = r6.mo26390x()
                if (r10 != 0) goto L_0x00b8
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = okhttp3.HttpUrl.HEX_DIGITS
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = okhttp3.HttpUrl.HEX_DIGITS
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L_0x0090
            L_0x00b8:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00bf:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.HttpUrl.Companion.writeCanonicalized(i.f, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void writePercentDecoded(C10603f fVar, String str, int i, int i2, boolean z) {
            int i3;
            while (i < i2) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                int codePointAt = str.codePointAt(i);
                if (codePointAt == 37 && (i3 = i + 2) < i2) {
                    int parseHexDigit = Util.parseHexDigit(str.charAt(i + 1));
                    int parseHexDigit2 = Util.parseHexDigit(str.charAt(i3));
                    if (!(parseHexDigit == -1 || parseHexDigit2 == -1)) {
                        fVar.writeByte((parseHexDigit << 4) + parseHexDigit2);
                        i = Character.charCount(codePointAt) + i3;
                    }
                } else if (codePointAt == 43 && z) {
                    fVar.writeByte(32);
                    i++;
                }
                fVar.mo26352d1(codePointAt);
                i += Character.charCount(codePointAt);
            }
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m37399deprecated_get(String str) {
            C10457l.m35320e(str, "url");
            return get(str);
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m37400deprecated_get(URI uri) {
            C10457l.m35320e(uri, "uri");
            return get(uri);
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final HttpUrl m37401deprecated_get(URL url) {
            C10457l.m35320e(url, "url");
            return get(url);
        }

        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final HttpUrl m37402deprecated_parse(String str) {
            C10457l.m35320e(str, "url");
            return parse(str);
        }

        public final String canonicalize$okhttp(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            String str3 = str;
            int i3 = i2;
            String str4 = str2;
            C10457l.m35320e(str, "$this$canonicalize");
            C10457l.m35320e(str4, "encodeSet");
            int i4 = i;
            while (i4 < i3) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !C10300q.m34949F(str4, (char) codePointAt, false, 2, (Object) null))) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2) {
                                if (!isPercentEncoded(str, i4, i3)) {
                                    C10603f fVar = new C10603f();
                                    int i5 = i;
                                    fVar.mo26328P(str, i, i4);
                                    writeCanonicalized(fVar, str, i4, i2, str2, z, z2, z3, z4, charset);
                                    return fVar.mo26319J0();
                                }
                                if (codePointAt == 43 || !z3) {
                                    i4 += Character.charCount(codePointAt);
                                } else {
                                    C10603f fVar2 = new C10603f();
                                    int i52 = i;
                                    fVar2.mo26328P(str, i, i4);
                                    writeCanonicalized(fVar2, str, i4, i2, str2, z, z2, z3, z4, charset);
                                    return fVar2.mo26319J0();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i4 += Character.charCount(codePointAt);
                }
                C10603f fVar22 = new C10603f();
                int i522 = i;
                fVar22.mo26328P(str, i, i4);
                writeCanonicalized(fVar22, str, i4, i2, str2, z, z2, z3, z4, charset);
                return fVar22.mo26319J0();
            }
            int i6 = i;
            String substring = str.substring(i, i2);
            C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final int defaultPort(String str) {
            C10457l.m35320e(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final HttpUrl get(String str) {
            C10457l.m35320e(str, "$this$toHttpUrl");
            return new Builder().parse$okhttp((HttpUrl) null, str).build();
        }

        public final HttpUrl get(URI uri) {
            C10457l.m35320e(uri, "$this$toHttpUrlOrNull");
            String uri2 = uri.toString();
            C10457l.m35319d(uri2, "toString()");
            return parse(uri2);
        }

        public final HttpUrl get(URL url) {
            C10457l.m35320e(url, "$this$toHttpUrlOrNull");
            String url2 = url.toString();
            C10457l.m35319d(url2, "toString()");
            return parse(url2);
        }

        public final HttpUrl parse(String str) {
            C10457l.m35320e(str, "$this$toHttpUrlOrNull");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String percentDecode$okhttp(String str, int i, int i2, boolean z) {
            C10457l.m35320e(str, "$this$percentDecode");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    C10603f fVar = new C10603f();
                    fVar.mo26328P(str, i, i3);
                    writePercentDecoded(fVar, str, i3, i2, z);
                    return fVar.mo26319J0();
                }
            }
            String substring = str.substring(i, i2);
            C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        public final void toPathString$okhttp(List<String> list, StringBuilder sb) {
            C10457l.m35320e(list, "$this$toPathString");
            C10457l.m35320e(sb, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }

        public final List<String> toQueryNamesAndValues$okhttp(String str) {
            String str2;
            C10457l.m35320e(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int Q = C10300q.m34960Q(str, '&', i, false, 4, (Object) null);
                if (Q == -1) {
                    Q = str.length();
                }
                int i2 = Q;
                int Q2 = C10300q.m34960Q(str, '=', i, false, 4, (Object) null);
                if (Q2 == -1 || Q2 > i2) {
                    String substring = str.substring(i, i2);
                    C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i, Q2);
                    C10457l.m35319d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str2 = str.substring(Q2 + 1, i2);
                    C10457l.m35319d(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                arrayList.add(str2);
                i = i2 + 1;
            }
            return arrayList;
        }

        public final void toQueryString$okhttp(List<String> list, StringBuilder sb) {
            C10457l.m35320e(list, "$this$toQueryString");
            C10457l.m35320e(sb, "out");
            C10240a h = C10247f.m34832h(C10247f.m34833i(0, list.size()), 2);
            int b = h.mo25547b();
            int g = h.mo25549g();
            int h2 = h.mo25550h();
            if (h2 >= 0) {
                if (b > g) {
                    return;
                }
            } else if (b < g) {
                return;
            }
            while (true) {
                String str = list.get(b);
                String str2 = list.get(b + 1);
                if (b > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (b != g) {
                    b += h2;
                } else {
                    return;
                }
            }
        }
    }

    public HttpUrl(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        C10457l.m35320e(str, "scheme");
        C10457l.m35320e(str2, "username");
        C10457l.m35320e(str3, "password");
        C10457l.m35320e(str4, "host");
        C10457l.m35320e(list, "pathSegments");
        C10457l.m35320e(str6, "url");
        this.scheme = str;
        this.username = str2;
        this.password = str3;
        this.host = str4;
        this.port = i;
        this.pathSegments = list;
        this.queryNamesAndValues = list2;
        this.fragment = str5;
        this.url = str6;
        this.isHttps = C10457l.m35316a(str, "https");
    }

    public static final int defaultPort(String str) {
        return Companion.defaultPort(str);
    }

    public static final HttpUrl get(String str) {
        return Companion.get(str);
    }

    public static final HttpUrl get(URI uri) {
        return Companion.get(uri);
    }

    public static final HttpUrl get(URL url2) {
        return Companion.get(url2);
    }

    public static final HttpUrl parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_encodedFragment  reason: not valid java name */
    public final String m37380deprecated_encodedFragment() {
        return encodedFragment();
    }

    /* renamed from: -deprecated_encodedPassword  reason: not valid java name */
    public final String m37381deprecated_encodedPassword() {
        return encodedPassword();
    }

    /* renamed from: -deprecated_encodedPath  reason: not valid java name */
    public final String m37382deprecated_encodedPath() {
        return encodedPath();
    }

    /* renamed from: -deprecated_encodedPathSegments  reason: not valid java name */
    public final List<String> m37383deprecated_encodedPathSegments() {
        return encodedPathSegments();
    }

    /* renamed from: -deprecated_encodedQuery  reason: not valid java name */
    public final String m37384deprecated_encodedQuery() {
        return encodedQuery();
    }

    /* renamed from: -deprecated_encodedUsername  reason: not valid java name */
    public final String m37385deprecated_encodedUsername() {
        return encodedUsername();
    }

    /* renamed from: -deprecated_fragment  reason: not valid java name */
    public final String m37386deprecated_fragment() {
        return this.fragment;
    }

    /* renamed from: -deprecated_host  reason: not valid java name */
    public final String m37387deprecated_host() {
        return this.host;
    }

    /* renamed from: -deprecated_password  reason: not valid java name */
    public final String m37388deprecated_password() {
        return this.password;
    }

    /* renamed from: -deprecated_pathSegments  reason: not valid java name */
    public final List<String> m37389deprecated_pathSegments() {
        return this.pathSegments;
    }

    /* renamed from: -deprecated_pathSize  reason: not valid java name */
    public final int m37390deprecated_pathSize() {
        return pathSize();
    }

    /* renamed from: -deprecated_port  reason: not valid java name */
    public final int m37391deprecated_port() {
        return this.port;
    }

    /* renamed from: -deprecated_query  reason: not valid java name */
    public final String m37392deprecated_query() {
        return query();
    }

    /* renamed from: -deprecated_queryParameterNames  reason: not valid java name */
    public final Set<String> m37393deprecated_queryParameterNames() {
        return queryParameterNames();
    }

    /* renamed from: -deprecated_querySize  reason: not valid java name */
    public final int m37394deprecated_querySize() {
        return querySize();
    }

    /* renamed from: -deprecated_scheme  reason: not valid java name */
    public final String m37395deprecated_scheme() {
        return this.scheme;
    }

    /* renamed from: -deprecated_uri  reason: not valid java name */
    public final URI m37396deprecated_uri() {
        return uri();
    }

    /* renamed from: -deprecated_url  reason: not valid java name */
    public final URL m37397deprecated_url() {
        return url();
    }

    /* renamed from: -deprecated_username  reason: not valid java name */
    public final String m37398deprecated_username() {
        return this.username;
    }

    public final String encodedFragment() {
        if (this.fragment == null) {
            return null;
        }
        String str = this.url;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(C10300q.m34960Q(this.url, '#', 0, false, 6, (Object) null) + 1);
        C10457l.m35319d(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String encodedPassword() {
        if (this.password.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        int Q = C10300q.m34960Q(this.url, '@', 0, false, 6, (Object) null);
        String str = this.url;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(C10300q.m34960Q(this.url, ':', this.scheme.length() + 3, false, 4, (Object) null) + 1, Q);
        C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedPath() {
        int Q = C10300q.m34960Q(this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", Q, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(Q, delimiterOffset);
        C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> encodedPathSegments() {
        int Q = C10300q.m34960Q(this.url, '/', this.scheme.length() + 3, false, 4, (Object) null);
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, "?#", Q, str.length());
        ArrayList arrayList = new ArrayList();
        while (Q < delimiterOffset) {
            int i = Q + 1;
            int delimiterOffset2 = Util.delimiterOffset(this.url, '/', i, delimiterOffset);
            String str2 = this.url;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i, delimiterOffset2);
            C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            Q = delimiterOffset2;
        }
        return arrayList;
    }

    public final String encodedQuery() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        int Q = C10300q.m34960Q(this.url, '?', 0, false, 6, (Object) null) + 1;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, '#', Q, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(Q, delimiterOffset);
        C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public final String encodedUsername() {
        if (this.username.length() == 0) {
            return FRAGMENT_ENCODE_SET;
        }
        int length = this.scheme.length() + 3;
        String str = this.url;
        int delimiterOffset = Util.delimiterOffset(str, ":@", length, str.length());
        String str2 = this.url;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, delimiterOffset);
        C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof HttpUrl) && C10457l.m35316a(((HttpUrl) obj).url, this.url);
    }

    public final String fragment() {
        return this.fragment;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final String host() {
        return this.host;
    }

    public final boolean isHttps() {
        return this.isHttps;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.setScheme$okhttp(this.scheme);
        builder.setEncodedUsername$okhttp(encodedUsername());
        builder.setEncodedPassword$okhttp(encodedPassword());
        builder.setHost$okhttp(this.host);
        builder.setPort$okhttp(this.port != Companion.defaultPort(this.scheme) ? this.port : -1);
        builder.getEncodedPathSegments$okhttp().clear();
        builder.getEncodedPathSegments$okhttp().addAll(encodedPathSegments());
        builder.encodedQuery(encodedQuery());
        builder.setEncodedFragment$okhttp(encodedFragment());
        return builder;
    }

    public final Builder newBuilder(String str) {
        C10457l.m35320e(str, "link");
        try {
            return new Builder().parse$okhttp(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String password() {
        return this.password;
    }

    public final List<String> pathSegments() {
        return this.pathSegments;
    }

    public final int pathSize() {
        return this.pathSegments.size();
    }

    public final int port() {
        return this.port;
    }

    public final String query() {
        if (this.queryNamesAndValues == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Companion.toQueryString$okhttp(this.queryNamesAndValues, sb);
        return sb.toString();
    }

    public final String queryParameter(String str) {
        C10457l.m35320e(str, "name");
        List<String> list = this.queryNamesAndValues;
        if (list == null) {
            return null;
        }
        C10240a h = C10247f.m34832h(C10247f.m34833i(0, list.size()), 2);
        int b = h.mo25547b();
        int g = h.mo25549g();
        int h2 = h.mo25550h();
        if (h2 < 0 ? b >= g : b <= g) {
            while (!C10457l.m35316a(str, this.queryNamesAndValues.get(b))) {
                if (b != g) {
                    b += h2;
                }
            }
            return this.queryNamesAndValues.get(b + 1);
        }
        return null;
    }

    public final String queryParameterName(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            String str = list.get(i * 2);
            C10457l.m35317b(str);
            return str;
        }
        throw new IndexOutOfBoundsException();
    }

    public final Set<String> queryParameterNames() {
        if (this.queryNamesAndValues == null) {
            return C10346i0.m35098b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C10240a h = C10247f.m34832h(C10247f.m34833i(0, this.queryNamesAndValues.size()), 2);
        int b = h.mo25547b();
        int g = h.mo25549g();
        int h2 = h.mo25550h();
        if (h2 < 0 ? b >= g : b <= g) {
            while (true) {
                String str = this.queryNamesAndValues.get(b);
                C10457l.m35317b(str);
                linkedHashSet.add(str);
                if (b == g) {
                    break;
                }
                b += h2;
            }
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        C10457l.m35319d(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final String queryParameterValue(int i) {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.get((i * 2) + 1);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List<String> queryParameterValues(String str) {
        C10457l.m35320e(str, "name");
        if (this.queryNamesAndValues == null) {
            return C10350l.m35138g();
        }
        ArrayList arrayList = new ArrayList();
        C10240a h = C10247f.m34832h(C10247f.m34833i(0, this.queryNamesAndValues.size()), 2);
        int b = h.mo25547b();
        int g = h.mo25549g();
        int h2 = h.mo25550h();
        if (h2 < 0 ? b >= g : b <= g) {
            while (true) {
                if (C10457l.m35316a(str, this.queryNamesAndValues.get(b))) {
                    arrayList.add(this.queryNamesAndValues.get(b + 1));
                }
                if (b == g) {
                    break;
                }
                b += h2;
            }
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        C10457l.m35319d(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }

    public final int querySize() {
        List<String> list = this.queryNamesAndValues;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    public final String redact() {
        Builder newBuilder = newBuilder("/...");
        C10457l.m35317b(newBuilder);
        return newBuilder.username(FRAGMENT_ENCODE_SET).password(FRAGMENT_ENCODE_SET).build().toString();
    }

    public final HttpUrl resolve(String str) {
        C10457l.m35320e(str, "link");
        Builder newBuilder = newBuilder(str);
        if (newBuilder != null) {
            return newBuilder.build();
        }
        return null;
    }

    public final String scheme() {
        return this.scheme;
    }

    public String toString() {
        return this.url;
    }

    public final String topPrivateDomain() {
        if (Util.canParseAsIpAddress(this.host)) {
            return null;
        }
        return PublicSuffixDatabase.Companion.get().getEffectiveTldPlusOne(this.host);
    }

    public final URI uri() {
        String builder = newBuilder().reencodeForUri$okhttp().toString();
        try {
            return new URI(builder);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new C10286f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").mo25596b(builder, FRAGMENT_ENCODE_SET));
                C10457l.m35319d(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final URL url() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final String username() {
        return this.username;
    }
}
