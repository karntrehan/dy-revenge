package okhttp3.internal;

import com.lwansbrough.RCTCamera.RCTCameraModule;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import p455g.C10323s;
import p455g.p456a0.C10243c;
import p455g.p459d0.C10283d;
import p455g.p459d0.C10286f;
import p455g.p460t.C10364y;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10443a0;
import p455g.p470y.p472d.C10456k;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10471z;
import p493i.C10598d0;
import p493i.C10603f;
import p493i.C10608g;
import p493i.C10615h;
import p493i.C10616i;
import p493i.C10628t;

public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.mo27229of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final C10628t UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final C10286f VERIFY_AS_IP_ADDRESS = new C10286f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final boolean assertionsEnabled = false;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.9.2";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        C10628t.C10629a aVar = C10628t.f28070o;
        C10616i.C10617a aVar2 = C10616i.f28050o;
        UNICODE_BOMS = aVar.mo26450d(aVar2.mo26426b("efbbbf"), aVar2.mo26426b("feff"), aVar2.mo26426b("fffe"), aVar2.mo26426b("0000ffff"), aVar2.mo26426b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        C10457l.m35317b(timeZone);
        UTC = timeZone;
        Class<OkHttpClient> cls = OkHttpClient.class;
        String name = OkHttpClient.class.getName();
        C10457l.m35319d(name, "OkHttpClient::class.java.name");
        okHttpName = C10300q.m34976g0(C10300q.m34975f0(name, "okhttp3."), "Client");
    }

    public static final <E> void addIfAbsent(List<E> list, E e) {
        C10457l.m35320e(list, "$this$addIfAbsent");
        if (!list.contains(e)) {
            list.add(e);
        }
    }

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final long and(int i, long j) {
        return ((long) i) & j;
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        C10457l.m35320e(eventListener, "$this$asFactory");
        return new Util$asFactory$1(eventListener);
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        C10457l.m35320e(obj, "$this$assertThreadDoesntHoldLock");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C10457l.m35319d(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        C10457l.m35320e(obj, "$this$assertThreadHoldsLock");
        if (assertionsEnabled && !Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            Thread currentThread = Thread.currentThread();
            C10457l.m35319d(currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    public static final boolean canParseAsIpAddress(String str) {
        C10457l.m35320e(str, "$this$canParseAsIpAddress");
        return VERIFY_AS_IP_ADDRESS.mo25595a(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        C10457l.m35320e(httpUrl, "$this$canReuseConnectionFor");
        C10457l.m35320e(httpUrl2, "other");
        return C10457l.m35316a(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && C10457l.m35316a(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        C10457l.m35320e(str, "name");
        boolean z = true;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= ((long) RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO)) {
                    if (millis == 0 && i > 0) {
                        z = false;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException((str + " too small.").toString());
                }
                throw new IllegalArgumentException((str + " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException((str + " < 0").toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        C10457l.m35320e(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        C10457l.m35320e(serverSocket, "$this$closeQuietly");
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(Socket socket) {
        C10457l.m35320e(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!C10457l.m35316a(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        C10457l.m35320e(strArr, "$this$concat");
        C10457l.m35320e(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C10457l.m35319d(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C10343h.m35088s(strArr2)] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        C10457l.m35320e(str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        C10457l.m35320e(str, "$this$delimiterOffset");
        C10457l.m35320e(str2, "delimiters");
        while (i < i2) {
            if (C10300q.m34949F(str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(C10598d0 d0Var, int i, TimeUnit timeUnit) {
        C10457l.m35320e(d0Var, "$this$discard");
        C10457l.m35320e(timeUnit, "timeUnit");
        try {
            return skipAll(d0Var, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, C10430l<? super T, Boolean> lVar) {
        C10457l.m35320e(iterable, "$this$filterList");
        C10457l.m35320e(lVar, "predicate");
        List<T> g = C10350l.m35138g();
        for (Object next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                if (g.isEmpty()) {
                    g = new ArrayList<>();
                }
                C10443a0.m35294b(g).add(next);
            }
        }
        return g;
    }

    public static final String format(String str, Object... objArr) {
        C10457l.m35320e(str, "format");
        C10457l.m35320e(objArr, "args");
        C10471z zVar = C10471z.f27629a;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C10457l.m35319d(format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C10457l.m35320e(strArr, "$this$hasIntersection");
        C10457l.m35320e(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        C10457l.m35320e(response, "$this$headersContentLength");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1);
        }
        return -1;
    }

    public static final void ignoreIoExceptions(C10419a<C10323s> aVar) {
        C10457l.m35320e(aVar, "block");
        try {
            aVar.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        C10457l.m35320e(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(C10350l.m35140i(Arrays.copyOf(objArr, objArr.length)));
        C10457l.m35319d(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        C10457l.m35320e(strArr, "$this$indexOf");
        C10457l.m35320e(str, "value");
        C10457l.m35320e(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        C10457l.m35320e(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (C10457l.m35322g(charAt, 31) <= 0 || C10457l.m35322g(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        C10457l.m35320e(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        C10457l.m35320e(str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        C10457l.m35320e(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C10457l.m35320e(strArr, "$this$intersect");
        C10457l.m35320e(strArr2, "other");
        C10457l.m35320e(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        p455g.p469x.C10416a.m35288a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2 = p455g.C10323s.f27547a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        p455g.p469x.C10416a.m35288a(r0, (java.lang.Throwable) null);
        r3.delete(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0019 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean isCivilized(okhttp3.internal.p509io.FileSystem r3, java.io.File r4) {
        /*
            java.lang.String r0 = "$this$isCivilized"
            p455g.p470y.p472d.C10457l.m35320e(r3, r0)
            java.lang.String r0 = "file"
            p455g.p470y.p472d.C10457l.m35320e(r4, r0)
            i.b0 r0 = r3.sink(r4)
            r1 = 0
            r3.delete(r4)     // Catch:{ IOException -> 0x0019 }
            r3 = 1
            p455g.p469x.C10416a.m35288a(r0, r1)
            return r3
        L_0x0017:
            r3 = move-exception
            goto L_0x0023
        L_0x0019:
            g.s r2 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0017 }
            p455g.p469x.C10416a.m35288a(r0, r1)
            r3.delete(r4)
            r3 = 0
            return r3
        L_0x0023:
            throw r3     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r4 = move-exception
            p455g.p469x.C10416a.m35288a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.isCivilized(okhttp3.internal.io.FileSystem, java.io.File):boolean");
    }

    public static final boolean isHealthy(Socket socket, C10615h hVar) {
        int soTimeout;
        C10457l.m35320e(socket, "$this$isHealthy");
        C10457l.m35320e(hVar, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z = !hVar.mo26390x();
            socket.setSoTimeout(soTimeout);
            return z;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    public static final boolean isSensitiveHeader(String str) {
        C10457l.m35320e(str, "name");
        return C10299p.m34929o(str, "Authorization", true) || C10299p.m34929o(str, "Cookie", true) || C10299p.m34929o(str, "Proxy-Authorization", true) || C10299p.m34929o(str, "Set-Cookie", true);
    }

    public static final void notify(Object obj) {
        C10457l.m35320e(obj, "$this$notify");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        C10457l.m35320e(obj, "$this$notifyAll");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static final String peerName(Socket socket) {
        C10457l.m35320e(socket, "$this$peerName");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        C10457l.m35319d(hostName, "address.hostName");
        return hostName;
    }

    public static final Charset readBomAsCharset(C10615h hVar, Charset charset) {
        Charset charset2;
        String str;
        C10457l.m35320e(hVar, "$this$readBomAsCharset");
        C10457l.m35320e(charset, "default");
        int t0 = hVar.mo26377t0(UNICODE_BOMS);
        if (t0 == -1) {
            return charset;
        }
        if (t0 == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (t0 == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else if (t0 == 2) {
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        } else if (t0 == 3) {
            return C10283d.f27504a.mo25589a();
        } else {
            if (t0 == 4) {
                return C10283d.f27504a.mo25590b();
            }
            throw new AssertionError();
        }
        C10457l.m35319d(charset2, str);
        return charset2;
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        Object readFieldOrNull;
        Class<Object> cls2 = Object.class;
        C10457l.m35320e(obj, "instance");
        C10457l.m35320e(cls, "fieldType");
        C10457l.m35320e(str, "fieldName");
        Class cls3 = obj.getClass();
        while (!C10457l.m35316a(cls3, cls2)) {
            try {
                Field declaredField = cls3.getDeclaredField(str);
                C10457l.m35319d(declaredField, "field");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(obj);
                if (!cls.isInstance(obj2)) {
                    return null;
                }
                return cls.cast(obj2);
            } catch (NoSuchFieldException unused) {
                cls3 = cls3.getSuperclass();
                C10457l.m35319d(cls3, "c.superclass");
            }
        }
        if (!(!C10457l.m35316a(str, "delegate")) || (readFieldOrNull = readFieldOrNull(obj, cls2, "delegate")) == null) {
            return null;
        }
        return readFieldOrNull(readFieldOrNull, cls, str);
    }

    public static final int readMedium(C10615h hVar) {
        C10457l.m35320e(hVar, "$this$readMedium");
        return and(hVar.readByte(), 255) | (and(hVar.readByte(), 255) << 16) | (and(hVar.readByte(), 255) << 8);
    }

    public static final int skipAll(C10603f fVar, byte b) {
        C10457l.m35320e(fVar, "$this$skipAll");
        int i = 0;
        while (!fVar.mo26390x() && fVar.mo26392y0(0) == b) {
            i++;
            fVar.readByte();
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        r11.timeout().clearDeadline();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        r11.timeout().deadlineNanoTime(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r5 != Long.MAX_VALUE) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        return r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean skipAll(p493i.C10598d0 r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            java.lang.String r0 = "$this$skipAll"
            p455g.p470y.p472d.C10457l.m35320e(r11, r0)
            java.lang.String r0 = "timeUnit"
            p455g.p470y.p472d.C10457l.m35320e(r13, r0)
            long r0 = java.lang.System.nanoTime()
            i.e0 r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            i.e0 r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            i.e0 r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            i.f r12 = new i.f     // Catch:{ InterruptedIOException -> 0x0076, all -> 0x0064 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x0076, all -> 0x0064 }
        L_0x003e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch:{ InterruptedIOException -> 0x0076, all -> 0x0064 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x004e
            r12.mo26366r()     // Catch:{ InterruptedIOException -> 0x0076, all -> 0x0064 }
            goto L_0x003e
        L_0x004e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
        L_0x0053:
            i.e0 r11 = r11.timeout()
            r11.clearDeadline()
            goto L_0x007d
        L_0x005b:
            i.e0 r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
            goto L_0x007d
        L_0x0064:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            i.e0 r11 = r11.timeout()
            if (r13 != 0) goto L_0x0071
            r11.clearDeadline()
            goto L_0x0075
        L_0x0071:
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L_0x0075:
            throw r12
        L_0x0076:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
            goto L_0x0053
        L_0x007d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.Util.skipAll(i.d0, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final ThreadFactory threadFactory(String str, boolean z) {
        C10457l.m35320e(str, "name");
        return new Util$threadFactory$1(str, z);
    }

    public static final void threadName(String str, C10419a<C10323s> aVar) {
        C10457l.m35320e(str, "name");
        C10457l.m35320e(aVar, "block");
        Thread currentThread = Thread.currentThread();
        C10457l.m35319d(currentThread, "currentThread");
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            aVar.invoke();
        } finally {
            C10456k.m35315b(1);
            currentThread.setName(name);
            C10456k.m35314a(1);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        C10457l.m35320e(headers, "$this$toHeaderList");
        C10243c i = C10247f.m34833i(0, headers.size());
        ArrayList arrayList = new ArrayList(C10351m.m35147p(i, 10));
        Iterator it = i.iterator();
        while (it.hasNext()) {
            int b = ((C10364y) it).mo25557b();
            arrayList.add(new Header(headers.name(b), headers.value(b)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        C10457l.m35320e(list, "$this$toHeaders");
        Headers.Builder builder = new Headers.Builder();
        for (Header next : list) {
            builder.addLenient$okhttp(next.component1().mo26422c0(), next.component2().mo26422c0());
        }
        return builder.build();
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        C10457l.m35319d(hexString, "Integer.toHexString(this)");
        return hexString;
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        C10457l.m35319d(hexString, "java.lang.Long.toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String str;
        C10457l.m35320e(httpUrl, "$this$toHostHeader");
        if (C10300q.m34950G(httpUrl.host(), ":", false, 2, (Object) null)) {
            str = '[' + httpUrl.host() + ']';
        } else {
            str = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return str;
        }
        return str + ':' + httpUrl.port();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        C10457l.m35320e(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(C10358t.m35173T(list));
        C10457l.m35319d(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        C10457l.m35320e(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return C10334c0.m35034d();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C10457l.m35319d(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j) {
        C10457l.m35320e(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO)) {
                    return RCTCameraModule.RCT_CAMERA_ORIENTATION_AUTO;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final String trimSubstring(String str, int i, int i2) {
        C10457l.m35320e(str, "$this$trimSubstring");
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String substring = str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
        C10457l.m35319d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void wait(Object obj) {
        C10457l.m35320e(obj, "$this$wait");
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        C10457l.m35320e(exc, "$this$withSuppressed");
        C10457l.m35320e(list, "suppressed");
        if (list.size() > 1) {
            System.out.println(list);
        }
        for (Exception a : list) {
            C10248b.m34834a(exc, a);
        }
        return exc;
    }

    public static final void writeMedium(C10608g gVar, int i) {
        C10457l.m35320e(gVar, "$this$writeMedium");
        gVar.writeByte((i >>> 16) & 255);
        gVar.writeByte((i >>> 8) & 255);
        gVar.writeByte(i & 255);
    }
}
