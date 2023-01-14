package okhttp3;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import p455g.C10314l;
import p455g.C10320p;
import p455g.p456a0.C10240a;
import p455g.p470y.p472d.C10444b;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10471z;
import p455g.p470y.p472d.p473b0.C10445a;

public final class Headers implements Iterable<C10314l<? extends String, ? extends String>>, C10445a {
    public static final Companion Companion = new Companion((C10452g) null);
    private final String[] namesAndValues;

    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            C10457l.m35320e(str, "line");
            int Q = C10300q.m34960Q(str, ':', 0, false, 6, (Object) null);
            if (Q != -1) {
                String substring = str.substring(0, Q);
                C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Objects.requireNonNull(substring, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = C10300q.m34948E0(substring).toString();
                String substring2 = str.substring(Q + 1);
                C10457l.m35319d(substring2, "(this as java.lang.String).substring(startIndex)");
                add(obj, substring2);
                return this;
            }
            throw new IllegalArgumentException(("Unexpected header: " + str).toString());
        }

        public final Builder add(String str, String str2) {
            C10457l.m35320e(str, "name");
            C10457l.m35320e(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, Instant instant) {
            C10457l.m35320e(str, "name");
            C10457l.m35320e(instant, "value");
            add(str, new Date(instant.toEpochMilli()));
            return this;
        }

        public final Builder add(String str, Date date) {
            C10457l.m35320e(str, "name");
            C10457l.m35320e(date, "value");
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        public final Builder addAll(Headers headers) {
            C10457l.m35320e(headers, "headers");
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String str) {
            C10457l.m35320e(str, "line");
            int Q = C10300q.m34960Q(str, ':', 1, false, 4, (Object) null);
            if (Q != -1) {
                String substring = str.substring(0, Q);
                C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                String substring2 = str.substring(Q + 1);
                C10457l.m35319d(substring2, "(this as java.lang.String).substring(startIndex)");
                addLenient$okhttp(substring, substring2);
            } else {
                if (str.charAt(0) == ':') {
                    str = str.substring(1);
                    C10457l.m35319d(str, "(this as java.lang.String).substring(startIndex)");
                }
                addLenient$okhttp(HttpUrl.FRAGMENT_ENCODE_SET, str);
            }
            return this;
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            C10457l.m35320e(str, "name");
            C10457l.m35320e(str2, "value");
            this.namesAndValues.add(str);
            this.namesAndValues.add(C10300q.m34948E0(str2).toString());
            return this;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            C10457l.m35320e(str, "name");
            C10457l.m35320e(str2, "value");
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new Headers((String[]) array, (C10452g) null);
        }

        public final String get(String str) {
            C10457l.m35320e(str, "name");
            C10240a h = C10247f.m34832h(C10247f.m34831g(this.namesAndValues.size() - 2, 0), 2);
            int b = h.mo25547b();
            int g = h.mo25549g();
            int h2 = h.mo25550h();
            if (h2 >= 0) {
                if (b > g) {
                    return null;
                }
            } else if (b < g) {
                return null;
            }
            while (!C10299p.m34929o(str, this.namesAndValues.get(b), true)) {
                if (b == g) {
                    return null;
                }
                b += h2;
            }
            return this.namesAndValues.get(b + 1);
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String str) {
            C10457l.m35320e(str, "name");
            int i = 0;
            while (i < this.namesAndValues.size()) {
                if (C10299p.m34929o(str, this.namesAndValues.get(i), true)) {
                    this.namesAndValues.remove(i);
                    this.namesAndValues.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final Builder set(String str, String str2) {
            C10457l.m35320e(str, "name");
            C10457l.m35320e(str2, "value");
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder set(String str, Instant instant) {
            C10457l.m35320e(str, "name");
            C10457l.m35320e(instant, "value");
            return set(str, new Date(instant.toEpochMilli()));
        }

        public final Builder set(String str, Date date) {
            C10457l.m35320e(str, "name");
            C10457l.m35320e(date, "value");
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final void checkName(String str) {
            if (str.length() > 0) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && '~' >= charAt) {
                        i++;
                    } else {
                        throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* access modifiers changed from: private */
        public final void checkValue(String str, String str2) {
            String str3;
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (!(charAt == 9 || (' ' <= charAt && '~' >= charAt))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Util.format("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i), str2));
                    if (Util.isSensitiveHeader(str2)) {
                        str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        str3 = ": " + str;
                    }
                    sb.append(str3);
                    throw new IllegalArgumentException(sb.toString().toString());
                }
            }
        }

        /* access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            C10240a h = C10247f.m34832h(C10247f.m34831g(strArr.length - 2, 0), 2);
            int b = h.mo25547b();
            int g = h.mo25549g();
            int h2 = h.mo25550h();
            if (h2 >= 0) {
                if (b > g) {
                    return null;
                }
            } else if (b < g) {
                return null;
            }
            while (!C10299p.m34929o(str, strArr[b], true)) {
                if (b == g) {
                    return null;
                }
                b += h2;
            }
            return strArr[b + 1];
        }

        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m37378deprecated_of(Map<String, String> map) {
            C10457l.m35320e(map, "headers");
            return mo27228of(map);
        }

        /* renamed from: -deprecated_of  reason: not valid java name */
        public final Headers m37379deprecated_of(String... strArr) {
            C10457l.m35320e(strArr, "namesAndValues");
            return mo27229of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        /* renamed from: of */
        public final Headers mo27228of(Map<String, String> map) {
            C10457l.m35320e(map, "$this$toHeaders");
            String[] strArr = new String[(map.size() * 2)];
            int i = 0;
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                String str2 = (String) next.getValue();
                Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = C10300q.m34948E0(str).toString();
                Objects.requireNonNull(str2, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj2 = C10300q.m34948E0(str2).toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i] = obj;
                strArr[i + 1] = obj2;
                i += 2;
            }
            return new Headers(strArr, (C10452g) null);
        }

        /* renamed from: of */
        public final Headers mo27229of(String... strArr) {
            C10457l.m35320e(strArr, "namesAndValues");
            if (strArr.length % 2 == 0) {
                Object clone = strArr.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr2 = (String[]) clone;
                int length = strArr2.length;
                int i = 0;
                while (i < length) {
                    if (strArr2[i] != null) {
                        String str = strArr2[i];
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        strArr2[i] = C10300q.m34948E0(str).toString();
                        i++;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                C10240a h = C10247f.m34832h(C10343h.m35087r(strArr2), 2);
                int b = h.mo25547b();
                int g = h.mo25549g();
                int h2 = h.mo25550h();
                if (h2 < 0 ? b >= g : b <= g) {
                    while (true) {
                        String str2 = strArr2[b];
                        String str3 = strArr2[b + 1];
                        checkName(str2);
                        checkValue(str3, str2);
                        if (b == g) {
                            break;
                        }
                        b += h2;
                    }
                }
                return new Headers(strArr2, (C10452g) null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public /* synthetic */ Headers(String[] strArr, C10452g gVar) {
        this(strArr);
    }

    /* renamed from: of */
    public static final Headers m36981of(Map<String, String> map) {
        return Companion.mo27228of(map);
    }

    /* renamed from: of */
    public static final Headers m36982of(String... strArr) {
        return Companion.mo27229of(strArr);
    }

    /* renamed from: -deprecated_size  reason: not valid java name */
    public final int m37377deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = (long) (strArr.length * 2);
        int length2 = strArr.length;
        for (int i = 0; i < length2; i++) {
            length += (long) this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues);
    }

    public final String get(String str) {
        C10457l.m35320e(str, "name");
        return Companion.get(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        C10457l.m35320e(str, "name");
        String str2 = get(str);
        if (str2 != null) {
            return DatesKt.toHttpDateOrNull(str2);
        }
        return null;
    }

    public final Instant getInstant(String str) {
        C10457l.m35320e(str, "name");
        Date date = getDate(str);
        if (date != null) {
            return date.toInstant();
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    public Iterator<C10314l<String, String>> iterator() {
        int size = size();
        C10314l[] lVarArr = new C10314l[size];
        for (int i = 0; i < size; i++) {
            lVarArr[i] = C10320p.m35019a(name(i), value(i));
        }
        return C10444b.m35304a(lVarArr);
    }

    public final String name(int i) {
        return this.namesAndValues[i * 2];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(C10299p.m34930p(C10471z.f27629a));
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        Set<String> unmodifiableSet = Collections.unmodifiableSet(treeSet);
        C10457l.m35319d(unmodifiableSet, "Collections.unmodifiableSet(result)");
        return unmodifiableSet;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        boolean unused = C10355q.m35150s(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(C10299p.m34930p(C10471z.f27629a));
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            Locale locale = Locale.US;
            C10457l.m35319d(locale, "Locale.US");
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase(locale);
            C10457l.m35319d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i));
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String name = name(i);
            String value = value(i);
            sb.append(name);
            sb.append(": ");
            if (Util.isSensitiveHeader(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        C10457l.m35319d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    public final List<String> values(String str) {
        C10457l.m35320e(str, "name");
        int size = size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (C10299p.m34929o(str, name(i), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
        }
        if (arrayList == null) {
            return C10350l.m35138g();
        }
        List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
        C10457l.m35319d(unmodifiableList, "Collections.unmodifiableList(result)");
        return unmodifiableList;
    }
}
