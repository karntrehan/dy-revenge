package androidx.camera.core.impl.p014a3;

import android.os.Build;
import androidx.camera.core.C0949o2;
import androidx.camera.core.impl.C0819i0;
import androidx.core.util.C1177h;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;

/* renamed from: androidx.camera.core.impl.a3.h */
public class C0731h {

    /* renamed from: a */
    static final String[] f2246a = {HttpUrl.FRAGMENT_ENCODE_SET, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: b */
    private static final C0740j[] f2247b;

    /* renamed from: c */
    private static final C0740j[] f2248c;

    /* renamed from: d */
    private static final C0740j[] f2249d;

    /* renamed from: e */
    static final C0740j[] f2250e = {new C0740j("SubIFDPointer", 330, 4), new C0740j("ExifIFDPointer", 34665, 4), new C0740j("GPSInfoIFDPointer", 34853, 4), new C0740j("InteroperabilityIFDPointer", 40965, 4)};

    /* renamed from: f */
    private static final C0740j[] f2251f;

    /* renamed from: g */
    static final C0740j[][] f2252g;

    /* renamed from: h */
    static final HashSet<String> f2253h = new HashSet<>(Arrays.asList(new String[]{"FNumber", "ExposureTime", "GPSTimeStamp"}));

    /* renamed from: i */
    private final List<Map<String, C0730g>> f2254i;

    /* renamed from: j */
    private final ByteOrder f2255j;

    /* renamed from: androidx.camera.core.impl.a3.h$a */
    static /* synthetic */ class C0732a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2256a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2257b;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                androidx.camera.core.impl.a3.h$c[] r0 = androidx.camera.core.impl.p014a3.C0731h.C0737c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2257b = r0
                r1 = 1
                androidx.camera.core.impl.a3.h$c r2 = androidx.camera.core.impl.p014a3.C0731h.C0737c.AUTO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f2257b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.a3.h$c r3 = androidx.camera.core.impl.p014a3.C0731h.C0737c.MANUAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                androidx.camera.core.impl.i0[] r2 = androidx.camera.core.impl.C0819i0.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f2256a = r2
                androidx.camera.core.impl.i0 r3 = androidx.camera.core.impl.C0819i0.READY     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f2256a     // Catch:{ NoSuchFieldError -> 0x0038 }
                androidx.camera.core.impl.i0 r2 = androidx.camera.core.impl.C0819i0.NONE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f2256a     // Catch:{ NoSuchFieldError -> 0x0043 }
                androidx.camera.core.impl.i0 r1 = androidx.camera.core.impl.C0819i0.FIRED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.p014a3.C0731h.C0732a.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.h$b */
    public static final class C0733b {

        /* renamed from: a */
        private static final Pattern f2258a = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: b */
        private static final Pattern f2259b = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: c */
        private static final Pattern f2260c = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

        /* renamed from: d */
        static final List<HashMap<String, C0740j>> f2261d = Collections.list(new C0734a());

        /* renamed from: e */
        final List<Map<String, C0730g>> f2262e = Collections.list(new C0735b());

        /* renamed from: f */
        private final ByteOrder f2263f;

        /* renamed from: androidx.camera.core.impl.a3.h$b$a */
        class C0734a implements Enumeration<HashMap<String, C0740j>> {

            /* renamed from: a */
            int f2264a = 0;

            C0734a() {
            }

            /* renamed from: a */
            public HashMap<String, C0740j> nextElement() {
                HashMap<String, C0740j> hashMap = new HashMap<>();
                for (C0740j jVar : C0731h.f2252g[this.f2264a]) {
                    hashMap.put(jVar.f2280b, jVar);
                }
                this.f2264a++;
                return hashMap;
            }

            public boolean hasMoreElements() {
                return this.f2264a < C0731h.f2252g.length;
            }
        }

        /* renamed from: androidx.camera.core.impl.a3.h$b$b */
        class C0735b implements Enumeration<Map<String, C0730g>> {

            /* renamed from: a */
            int f2265a = 0;

            C0735b() {
            }

            /* renamed from: a */
            public Map<String, C0730g> nextElement() {
                this.f2265a++;
                return new HashMap();
            }

            public boolean hasMoreElements() {
                return this.f2265a < C0731h.f2252g.length;
            }
        }

        /* renamed from: androidx.camera.core.impl.a3.h$b$c */
        class C0736c implements Enumeration<Map<String, C0730g>> {

            /* renamed from: a */
            final Enumeration<Map<String, C0730g>> f2267a;

            C0736c() {
                this.f2267a = Collections.enumeration(C0733b.this.f2262e);
            }

            /* renamed from: a */
            public Map<String, C0730g> nextElement() {
                return new HashMap(this.f2267a.nextElement());
            }

            public boolean hasMoreElements() {
                return this.f2267a.hasMoreElements();
            }
        }

        C0733b(ByteOrder byteOrder) {
            this.f2263f = byteOrder;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:67|68|69) */
        /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
            java.lang.Double.parseDouble(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
            return new android.util.Pair<>(12, -1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
            return new android.util.Pair<>(2, -1);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013c */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.util.Pair<java.lang.Integer, java.lang.Integer> m3019b(java.lang.String r10) {
            /*
                java.lang.String r0 = ","
                boolean r1 = r10.contains(r0)
                r2 = 0
                r3 = 1
                r4 = 2
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r6 = -1
                java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
                if (r1 == 0) goto L_0x00a6
                java.lang.String[] r10 = r10.split(r0, r6)
                r0 = r10[r2]
                android.util.Pair r0 = m3019b(r0)
                java.lang.Object r1 = r0.first
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                if (r1 != r4) goto L_0x0029
                return r0
            L_0x0029:
                int r1 = r10.length
                if (r3 >= r1) goto L_0x00a5
                r1 = r10[r3]
                android.util.Pair r1 = m3019b(r1)
                java.lang.Object r2 = r1.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r4 = r0.first
                boolean r2 = r2.equals(r4)
                if (r2 != 0) goto L_0x004d
                java.lang.Object r2 = r1.second
                java.lang.Integer r2 = (java.lang.Integer) r2
                java.lang.Object r4 = r0.first
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x004b
                goto L_0x004d
            L_0x004b:
                r2 = -1
                goto L_0x0055
            L_0x004d:
                java.lang.Object r2 = r0.first
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
            L_0x0055:
                java.lang.Object r4 = r0.second
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                if (r4 == r6) goto L_0x0080
                java.lang.Object r4 = r1.first
                java.lang.Integer r4 = (java.lang.Integer) r4
                java.lang.Object r8 = r0.second
                boolean r4 = r4.equals(r8)
                if (r4 != 0) goto L_0x0077
                java.lang.Object r1 = r1.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                java.lang.Object r4 = r0.second
                boolean r1 = r1.equals(r4)
                if (r1 == 0) goto L_0x0080
            L_0x0077:
                java.lang.Object r1 = r0.second
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                goto L_0x0081
            L_0x0080:
                r1 = -1
            L_0x0081:
                if (r2 != r6) goto L_0x008b
                if (r1 != r6) goto L_0x008b
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            L_0x008b:
                if (r2 != r6) goto L_0x0097
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.<init>(r1, r7)
                goto L_0x00a2
            L_0x0097:
                if (r1 != r6) goto L_0x00a2
                android.util.Pair r0 = new android.util.Pair
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0.<init>(r1, r7)
            L_0x00a2:
                int r3 = r3 + 1
                goto L_0x0029
            L_0x00a5:
                return r0
            L_0x00a6:
                java.lang.String r0 = "/"
                boolean r1 = r10.contains(r0)
                r8 = 0
                if (r1 == 0) goto L_0x0105
                java.lang.String[] r10 = r10.split(r0, r6)
                int r0 = r10.length
                if (r0 != r4) goto L_0x00ff
                r0 = r10[r2]     // Catch:{ NumberFormatException -> 0x00ff }
                double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
                long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
                r10 = r10[r3]     // Catch:{ NumberFormatException -> 0x00ff }
                double r2 = java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x00ff }
                long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
                r10 = 10
                int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r4 < 0) goto L_0x00f5
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 >= 0) goto L_0x00d0
                goto L_0x00f5
            L_0x00d0:
                r4 = 5
                r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
                int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r6 > 0) goto L_0x00eb
                int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r0 <= 0) goto L_0x00dd
                goto L_0x00eb
            L_0x00dd:
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
                r0.<init>(r10, r1)     // Catch:{ NumberFormatException -> 0x00ff }
                return r0
            L_0x00eb:
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
                return r10
            L_0x00f5:
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x00ff }
                r0.<init>(r10, r7)     // Catch:{ NumberFormatException -> 0x00ff }
                return r0
            L_0x00ff:
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            L_0x0105:
                long r0 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x013c }
                r2 = 4
                int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r3 < 0) goto L_0x0124
                r8 = 65535(0xffff, double:3.23786E-319)
                int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
                if (r4 > 0) goto L_0x0124
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                r1 = 3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x0124:
                if (r3 >= 0) goto L_0x0132
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                r1 = 9
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x0132:
                android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x013c }
                r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
                return r0
            L_0x013c:
                java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x014b }
                android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014b }
                r0 = 12
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014b }
                r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x014b }
                return r10
            L_0x014b:
                android.util.Pair r10 = new android.util.Pair
                r10.<init>(r5, r7)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.p014a3.C0731h.C0733b.m3019b(java.lang.String):android.util.Pair");
        }

        /* renamed from: d */
        private void m3020d(String str, String str2, List<Map<String, C0730g>> list) {
            for (Map<String, C0730g> containsKey : list) {
                if (containsKey.containsKey(str)) {
                    return;
                }
            }
            m3021e(str, str2, list);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:56:0x018a, code lost:
            if (r7 != r0) goto L_0x02cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x021f, code lost:
            r0.put(r4, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x02c8, code lost:
            r0.put(r4, r6);
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m3021e(java.lang.String r18, java.lang.String r19, java.util.List<java.util.Map<java.lang.String, androidx.camera.core.impl.p014a3.C0730g>> r20) {
            /*
                r17 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                r3 = r20
                java.lang.String r4 = "DateTime"
                boolean r4 = r4.equals(r0)
                java.lang.String r5 = " : "
                java.lang.String r6 = "Invalid value for "
                java.lang.String r7 = "ExifData"
                if (r4 != 0) goto L_0x0026
                java.lang.String r4 = "DateTimeOriginal"
                boolean r4 = r4.equals(r0)
                if (r4 != 0) goto L_0x0026
                java.lang.String r4 = "DateTimeDigitized"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x006d
            L_0x0026:
                if (r2 == 0) goto L_0x006d
                java.util.regex.Pattern r4 = f2259b
                java.util.regex.Matcher r4 = r4.matcher(r2)
                boolean r4 = r4.find()
                java.util.regex.Pattern r8 = f2260c
                java.util.regex.Matcher r8 = r8.matcher(r2)
                boolean r8 = r8.find()
                int r9 = r19.length()
                r10 = 19
                if (r9 != r10) goto L_0x0054
                if (r4 != 0) goto L_0x0049
                if (r8 != 0) goto L_0x0049
                goto L_0x0054
            L_0x0049:
                if (r8 == 0) goto L_0x006d
                java.lang.String r4 = "-"
                java.lang.String r8 = ":"
                java.lang.String r2 = r2.replaceAll(r4, r8)
                goto L_0x006d
            L_0x0054:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r6)
                r3.append(r0)
                r3.append(r5)
                r3.append(r2)
                java.lang.String r0 = r3.toString()
                androidx.camera.core.C0949o2.m3698k(r7, r0)
                return
            L_0x006d:
                java.lang.String r4 = "ISOSpeedRatings"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L_0x0077
                java.lang.String r0 = "PhotographicSensitivity"
            L_0x0077:
                r4 = r0
                r0 = 2
                r8 = 1
                if (r2 == 0) goto L_0x0124
                java.util.HashSet<java.lang.String> r9 = androidx.camera.core.impl.p014a3.C0731h.f2253h
                boolean r9 = r9.contains(r4)
                if (r9 == 0) goto L_0x0124
                java.lang.String r9 = "GPSTimeStamp"
                boolean r9 = r4.equals(r9)
                if (r9 == 0) goto L_0x00fc
                java.util.regex.Pattern r9 = f2258a
                java.util.regex.Matcher r9 = r9.matcher(r2)
                boolean r10 = r9.find()
                if (r10 != 0) goto L_0x00b1
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r6)
                r0.append(r4)
                r0.append(r5)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                androidx.camera.core.C0949o2.m3698k(r7, r0)
                return
            L_0x00b1:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = r9.group(r8)
                java.lang.Object r5 = androidx.core.util.C1177h.m4583e(r5)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = java.lang.Integer.parseInt(r5)
                r2.append(r5)
                java.lang.String r5 = "/1,"
                r2.append(r5)
                java.lang.String r6 = r9.group(r0)
                java.lang.Object r6 = androidx.core.util.C1177h.m4583e(r6)
                java.lang.String r6 = (java.lang.String) r6
                int r6 = java.lang.Integer.parseInt(r6)
                r2.append(r6)
                r2.append(r5)
                r5 = 3
                java.lang.String r5 = r9.group(r5)
                java.lang.Object r5 = androidx.core.util.C1177h.m4583e(r5)
                java.lang.String r5 = (java.lang.String) r5
                int r5 = java.lang.Integer.parseInt(r5)
                r2.append(r5)
                java.lang.String r5 = "/1"
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                goto L_0x0124
            L_0x00fc:
                double r9 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x010a }
                androidx.camera.core.impl.a3.k r11 = new androidx.camera.core.impl.a3.k     // Catch:{ NumberFormatException -> 0x010a }
                r11.<init>(r9)     // Catch:{ NumberFormatException -> 0x010a }
                java.lang.String r2 = r11.toString()     // Catch:{ NumberFormatException -> 0x010a }
                goto L_0x0124
            L_0x010a:
                r0 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r6)
                r3.append(r4)
                r3.append(r5)
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                androidx.camera.core.C0949o2.m3699l(r7, r2, r0)
                return
            L_0x0124:
                r5 = 0
                r6 = 0
            L_0x0126:
                androidx.camera.core.impl.a3.j[][] r7 = androidx.camera.core.impl.p014a3.C0731h.f2252g
                int r7 = r7.length
                if (r6 >= r7) goto L_0x02d5
                java.util.List<java.util.HashMap<java.lang.String, androidx.camera.core.impl.a3.j>> r7 = f2261d
                java.lang.Object r7 = r7.get(r6)
                java.util.HashMap r7 = (java.util.HashMap) r7
                java.lang.Object r7 = r7.get(r4)
                androidx.camera.core.impl.a3.j r7 = (androidx.camera.core.impl.p014a3.C0740j) r7
                if (r7 == 0) goto L_0x02cc
                if (r2 != 0) goto L_0x0148
                java.lang.Object r7 = r3.get(r6)
                java.util.Map r7 = (java.util.Map) r7
                r7.remove(r4)
                goto L_0x02cc
            L_0x0148:
                android.util.Pair r9 = m3019b(r2)
                int r10 = r7.f2281c
                java.lang.Object r11 = r9.first
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                r12 = -1
                if (r10 == r11) goto L_0x018d
                int r10 = r7.f2281c
                java.lang.Object r11 = r9.second
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                if (r10 != r11) goto L_0x0166
                goto L_0x018d
            L_0x0166:
                int r10 = r7.f2282d
                if (r10 == r12) goto L_0x0183
                java.lang.Object r11 = r9.first
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                if (r10 == r11) goto L_0x0180
                int r10 = r7.f2282d
                java.lang.Object r9 = r9.second
                java.lang.Integer r9 = (java.lang.Integer) r9
                int r9 = r9.intValue()
                if (r10 != r9) goto L_0x0183
            L_0x0180:
                int r7 = r7.f2282d
                goto L_0x018f
            L_0x0183:
                int r7 = r7.f2281c
                if (r7 == r8) goto L_0x018f
                r9 = 7
                if (r7 == r9) goto L_0x018f
                if (r7 != r0) goto L_0x02cc
                goto L_0x018f
            L_0x018d:
                int r7 = r7.f2281c
            L_0x018f:
                java.lang.String r9 = "/"
                java.lang.String r10 = ","
                switch(r7) {
                    case 1: goto L_0x02bc;
                    case 2: goto L_0x02af;
                    case 3: goto L_0x028a;
                    case 4: goto L_0x0265;
                    case 5: goto L_0x0224;
                    case 6: goto L_0x0196;
                    case 7: goto L_0x02af;
                    case 8: goto L_0x0196;
                    case 9: goto L_0x01fd;
                    case 10: goto L_0x01bf;
                    case 11: goto L_0x0196;
                    case 12: goto L_0x0198;
                    default: goto L_0x0196;
                }
            L_0x0196:
                goto L_0x02cc
            L_0x0198:
                java.lang.String[] r7 = r2.split(r10, r12)
                int r9 = r7.length
                double[] r9 = new double[r9]
                r10 = 0
            L_0x01a0:
                int r11 = r7.length
                if (r10 >= r11) goto L_0x01ae
                r11 = r7[r10]
                double r11 = java.lang.Double.parseDouble(r11)
                r9[r10] = r11
                int r10 = r10 + 1
                goto L_0x01a0
            L_0x01ae:
                java.lang.Object r7 = r3.get(r6)
                java.util.Map r7 = (java.util.Map) r7
                java.nio.ByteOrder r10 = r1.f2263f
                androidx.camera.core.impl.a3.g r9 = androidx.camera.core.impl.p014a3.C0730g.m3007b(r9, r10)
                r7.put(r4, r9)
                goto L_0x02cc
            L_0x01bf:
                java.lang.String[] r7 = r2.split(r10, r12)
                int r10 = r7.length
                androidx.camera.core.impl.a3.k[] r10 = new androidx.camera.core.impl.p014a3.C0741k[r10]
                r11 = 0
            L_0x01c7:
                int r13 = r7.length
                if (r11 >= r13) goto L_0x01ee
                r13 = r7[r11]
                java.lang.String[] r13 = r13.split(r9, r12)
                androidx.camera.core.impl.a3.k r14 = new androidx.camera.core.impl.a3.k
                r15 = r13[r5]
                double r0 = java.lang.Double.parseDouble(r15)
                long r0 = (long) r0
                r13 = r13[r8]
                r15 = r9
                double r8 = java.lang.Double.parseDouble(r13)
                long r8 = (long) r8
                r14.<init>(r0, r8)
                r10[r11] = r14
                int r11 = r11 + 1
                r9 = r15
                r0 = 2
                r8 = 1
                r1 = r17
                goto L_0x01c7
            L_0x01ee:
                java.lang.Object r0 = r3.get(r6)
                java.util.Map r0 = (java.util.Map) r0
                r1 = r17
                java.nio.ByteOrder r7 = r1.f2263f
                androidx.camera.core.impl.a3.g r7 = androidx.camera.core.impl.p014a3.C0730g.m3009d(r10, r7)
                goto L_0x021f
            L_0x01fd:
                java.lang.String[] r0 = r2.split(r10, r12)
                int r7 = r0.length
                int[] r7 = new int[r7]
                r8 = 0
            L_0x0205:
                int r9 = r0.length
                if (r8 >= r9) goto L_0x0213
                r9 = r0[r8]
                int r9 = java.lang.Integer.parseInt(r9)
                r7[r8] = r9
                int r8 = r8 + 1
                goto L_0x0205
            L_0x0213:
                java.lang.Object r0 = r3.get(r6)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r8 = r1.f2263f
                androidx.camera.core.impl.a3.g r7 = androidx.camera.core.impl.p014a3.C0730g.m3008c(r7, r8)
            L_0x021f:
                r0.put(r4, r7)
                goto L_0x02cc
            L_0x0224:
                r15 = r9
                java.lang.String[] r0 = r2.split(r10, r12)
                int r7 = r0.length
                androidx.camera.core.impl.a3.k[] r7 = new androidx.camera.core.impl.p014a3.C0741k[r7]
                r8 = 0
            L_0x022d:
                int r9 = r0.length
                if (r8 >= r9) goto L_0x0256
                r9 = r0[r8]
                r10 = r15
                java.lang.String[] r9 = r9.split(r10, r12)
                androidx.camera.core.impl.a3.k r11 = new androidx.camera.core.impl.a3.k
                r13 = r9[r5]
                double r13 = java.lang.Double.parseDouble(r13)
                long r13 = (long) r13
                r15 = 1
                r9 = r9[r15]
                r16 = r6
                double r5 = java.lang.Double.parseDouble(r9)
                long r5 = (long) r5
                r11.<init>(r13, r5)
                r7[r8] = r11
                int r8 = r8 + 1
                r15 = r10
                r6 = r16
                r5 = 0
                goto L_0x022d
            L_0x0256:
                r5 = r6
                r15 = 1
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r6 = r1.f2263f
                androidx.camera.core.impl.a3.g r6 = androidx.camera.core.impl.p014a3.C0730g.m3013h(r7, r6)
                goto L_0x02c8
            L_0x0265:
                r5 = r6
                r15 = 1
                java.lang.String[] r0 = r2.split(r10, r12)
                int r6 = r0.length
                long[] r6 = new long[r6]
                r7 = 0
            L_0x026f:
                int r8 = r0.length
                if (r7 >= r8) goto L_0x027d
                r8 = r0[r7]
                long r8 = java.lang.Long.parseLong(r8)
                r6[r7] = r8
                int r7 = r7 + 1
                goto L_0x026f
            L_0x027d:
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r7 = r1.f2263f
                androidx.camera.core.impl.a3.g r6 = androidx.camera.core.impl.p014a3.C0730g.m3012g(r6, r7)
                goto L_0x02c8
            L_0x028a:
                r5 = r6
                r15 = 1
                java.lang.String[] r0 = r2.split(r10, r12)
                int r6 = r0.length
                int[] r6 = new int[r6]
                r7 = 0
            L_0x0294:
                int r8 = r0.length
                if (r7 >= r8) goto L_0x02a2
                r8 = r0[r7]
                int r8 = java.lang.Integer.parseInt(r8)
                r6[r7] = r8
                int r7 = r7 + 1
                goto L_0x0294
            L_0x02a2:
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                java.nio.ByteOrder r7 = r1.f2263f
                androidx.camera.core.impl.a3.g r6 = androidx.camera.core.impl.p014a3.C0730g.m3014i(r6, r7)
                goto L_0x02c8
            L_0x02af:
                r5 = r6
                r15 = 1
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                androidx.camera.core.impl.a3.g r6 = androidx.camera.core.impl.p014a3.C0730g.m3010e(r2)
                goto L_0x02c8
            L_0x02bc:
                r5 = r6
                r15 = 1
                java.lang.Object r0 = r3.get(r5)
                java.util.Map r0 = (java.util.Map) r0
                androidx.camera.core.impl.a3.g r6 = androidx.camera.core.impl.p014a3.C0730g.m3006a(r2)
            L_0x02c8:
                r0.put(r4, r6)
                goto L_0x02ce
            L_0x02cc:
                r5 = r6
                r15 = 1
            L_0x02ce:
                int r6 = r5 + 1
                r0 = 2
                r5 = 0
                r8 = 1
                goto L_0x0126
            L_0x02d5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.p014a3.C0731h.C0733b.m3021e(java.lang.String, java.lang.String, java.util.List):void");
        }

        /* renamed from: a */
        public C0731h mo2852a() {
            ArrayList list = Collections.list(new C0736c());
            if (!((Map) list.get(1)).isEmpty()) {
                m3020d("ExposureProgram", String.valueOf(0), list);
                m3020d("ExifVersion", "0230", list);
                m3020d("ComponentsConfiguration", "1,2,3,0", list);
                m3020d("MeteringMode", String.valueOf(0), list);
                m3020d("LightSource", String.valueOf(0), list);
                m3020d("FlashpixVersion", "0100", list);
                m3020d("FocalPlaneResolutionUnit", String.valueOf(2), list);
                m3020d("FileSource", String.valueOf(3), list);
                m3020d("SceneType", String.valueOf(1), list);
                m3020d("CustomRendered", String.valueOf(0), list);
                m3020d("SceneCaptureType", String.valueOf(0), list);
                m3020d("Contrast", String.valueOf(0), list);
                m3020d("Saturation", String.valueOf(0), list);
                m3020d("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                m3020d("GPSVersionID", "2300", list);
                m3020d("GPSSpeedRef", "K", list);
                m3020d("GPSTrackRef", "T", list);
                m3020d("GPSImgDirectionRef", "T", list);
                m3020d("GPSDestBearingRef", "T", list);
                m3020d("GPSDestDistanceRef", "K", list);
            }
            return new C0731h(this.f2263f, list);
        }

        /* renamed from: c */
        public C0733b mo2853c(String str, String str2) {
            m3021e(str, str2, this.f2262e);
            return this;
        }

        /* renamed from: f */
        public C0733b mo2854f(long j) {
            return mo2853c("ExposureTime", String.valueOf(((double) j) / ((double) TimeUnit.SECONDS.toNanos(1))));
        }

        /* renamed from: g */
        public C0733b mo2855g(C0819i0 i0Var) {
            int i;
            if (i0Var == C0819i0.UNKNOWN) {
                return this;
            }
            int i2 = C0732a.f2256a[i0Var.ordinal()];
            if (i2 == 1) {
                i = 0;
            } else if (i2 == 2) {
                i = 32;
            } else if (i2 != 3) {
                C0949o2.m3698k("ExifData", "Unknown flash state: " + i0Var);
                return this;
            } else {
                i = 1;
            }
            if ((i & 1) == 1) {
                mo2853c("LightSource", String.valueOf(4));
            }
            return mo2853c("Flash", String.valueOf(i));
        }

        /* renamed from: h */
        public C0733b mo2856h(float f) {
            return mo2853c("FocalLength", new C0741k((long) (f * 1000.0f), 1000).toString());
        }

        /* renamed from: i */
        public C0733b mo2857i(int i) {
            return mo2853c("ImageLength", String.valueOf(i));
        }

        /* renamed from: j */
        public C0733b mo2858j(int i) {
            return mo2853c("ImageWidth", String.valueOf(i));
        }

        /* renamed from: k */
        public C0733b mo2859k(int i) {
            return mo2853c("SensitivityType", String.valueOf(3)).mo2853c("PhotographicSensitivity", String.valueOf(Math.min(Settings.DEFAULT_INITIAL_WINDOW_SIZE, i)));
        }

        /* renamed from: l */
        public C0733b mo2860l(float f) {
            return mo2853c("FNumber", String.valueOf(f));
        }

        /* renamed from: m */
        public C0733b mo2861m(int i) {
            int i2;
            if (i == 0) {
                i2 = 1;
            } else if (i == 90) {
                i2 = 6;
            } else if (i == 180) {
                i2 = 3;
            } else if (i != 270) {
                C0949o2.m3698k("ExifData", "Unexpected orientation value: " + i + ". Must be one of 0, 90, 180, 270.");
                i2 = 0;
            } else {
                i2 = 8;
            }
            return mo2853c("Orientation", String.valueOf(i2));
        }

        /* renamed from: n */
        public C0733b mo2862n(C0737c cVar) {
            int i = C0732a.f2257b[cVar.ordinal()];
            return mo2853c("WhiteBalance", i != 1 ? i != 2 ? null : String.valueOf(1) : String.valueOf(0));
        }
    }

    /* renamed from: androidx.camera.core.impl.a3.h$c */
    public enum C0737c {
        AUTO,
        MANUAL
    }

    static {
        C0740j[] jVarArr = {new C0740j("ImageWidth", 256, 3, 4), new C0740j("ImageLength", 257, 3, 4), new C0740j("Make", 271, 2), new C0740j("Model", 272, 2), new C0740j("Orientation", 274, 3), new C0740j("XResolution", 282, 5), new C0740j("YResolution", 283, 5), new C0740j("ResolutionUnit", 296, 3), new C0740j("Software", 305, 2), new C0740j("DateTime", 306, 2), new C0740j("YCbCrPositioning", 531, 3), new C0740j("SubIFDPointer", 330, 4), new C0740j("ExifIFDPointer", 34665, 4), new C0740j("GPSInfoIFDPointer", 34853, 4)};
        f2247b = jVarArr;
        C0740j[] jVarArr2 = {new C0740j("ExposureTime", 33434, 5), new C0740j("FNumber", 33437, 5), new C0740j("ExposureProgram", 34850, 3), new C0740j("PhotographicSensitivity", 34855, 3), new C0740j("SensitivityType", 34864, 3), new C0740j("ExifVersion", 36864, 2), new C0740j("DateTimeOriginal", 36867, 2), new C0740j("DateTimeDigitized", 36868, 2), new C0740j("ComponentsConfiguration", 37121, 7), new C0740j("ShutterSpeedValue", 37377, 10), new C0740j("ApertureValue", 37378, 5), new C0740j("BrightnessValue", 37379, 10), new C0740j("ExposureBiasValue", 37380, 10), new C0740j("MaxApertureValue", 37381, 5), new C0740j("MeteringMode", 37383, 3), new C0740j("LightSource", 37384, 3), new C0740j("Flash", 37385, 3), new C0740j("FocalLength", 37386, 5), new C0740j("SubSecTime", 37520, 2), new C0740j("SubSecTimeOriginal", 37521, 2), new C0740j("SubSecTimeDigitized", 37522, 2), new C0740j("FlashpixVersion", 40960, 7), new C0740j("ColorSpace", 40961, 3), new C0740j("PixelXDimension", 40962, 3, 4), new C0740j("PixelYDimension", 40963, 3, 4), new C0740j("InteroperabilityIFDPointer", 40965, 4), new C0740j("FocalPlaneResolutionUnit", 41488, 3), new C0740j("SensingMethod", 41495, 3), new C0740j("FileSource", 41728, 7), new C0740j("SceneType", 41729, 7), new C0740j("CustomRendered", 41985, 3), new C0740j("ExposureMode", 41986, 3), new C0740j("WhiteBalance", 41987, 3), new C0740j("SceneCaptureType", 41990, 3), new C0740j("Contrast", 41992, 3), new C0740j("Saturation", 41993, 3), new C0740j("Sharpness", 41994, 3)};
        f2248c = jVarArr2;
        C0740j[] jVarArr3 = {new C0740j("GPSVersionID", 0, 1), new C0740j("GPSLatitudeRef", 1, 2), new C0740j("GPSLatitude", 2, 5, 10), new C0740j("GPSLongitudeRef", 3, 2), new C0740j("GPSLongitude", 4, 5, 10), new C0740j("GPSAltitudeRef", 5, 1), new C0740j("GPSAltitude", 6, 5), new C0740j("GPSTimeStamp", 7, 5), new C0740j("GPSSpeedRef", 12, 2), new C0740j("GPSTrackRef", 14, 2), new C0740j("GPSImgDirectionRef", 16, 2), new C0740j("GPSDestBearingRef", 23, 2), new C0740j("GPSDestDistanceRef", 25, 2)};
        f2249d = jVarArr3;
        C0740j[] jVarArr4 = {new C0740j("InteroperabilityIndex", 1, 2)};
        f2251f = jVarArr4;
        f2252g = new C0740j[][]{jVarArr, jVarArr2, jVarArr3, jVarArr4};
    }

    C0731h(ByteOrder byteOrder, List<Map<String, C0730g>> list) {
        C1177h.m4586h(list.size() == f2252g.length, "Malformed attributes list. Number of IFDs mismatch.");
        this.f2255j = byteOrder;
        this.f2254i = list;
    }

    /* renamed from: a */
    public static C0733b m3016a() {
        return new C0733b(ByteOrder.BIG_ENDIAN).mo2853c("Orientation", String.valueOf(1)).mo2853c("XResolution", "72/1").mo2853c("YResolution", "72/1").mo2853c("ResolutionUnit", String.valueOf(2)).mo2853c("YCbCrPositioning", String.valueOf(1)).mo2853c("Make", Build.MANUFACTURER).mo2853c("Model", Build.MODEL);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Map<String, C0730g> mo2850b(int i) {
        int length = f2252g.length;
        C1177h.m4581c(i, 0, length, "Invalid IFD index: " + i + ". Index should be between [0, EXIF_TAGS.length] ");
        return this.f2254i.get(i);
    }

    /* renamed from: c */
    public ByteOrder mo2851c() {
        return this.f2255j;
    }
}
