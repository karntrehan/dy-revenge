package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p472d.C10452g;
import p455g.p470y.p472d.C10457l;

public final class PublicSuffixDatabase {
    public static final Companion Companion = new Companion((C10452g) null);
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE = C10349k.m35133b("*");
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final byte[] WILDCARD_LABEL = {(byte) 42};
    /* access modifiers changed from: private */
    public static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private byte[] publicSuffixExceptionListBytes;
    /* access modifiers changed from: private */
    public byte[] publicSuffixListBytes;
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C10452g gVar) {
            this();
        }

        /* access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int and;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        z = z2;
                        i3 = Util.and(bArr4[i9][i10], 255);
                    }
                    and = i3 - Util.and(bArr3[i6 + i11], 255);
                    if (and == 0) {
                        i11++;
                        i10++;
                        if (i11 == i8) {
                            break;
                        } else if (bArr4[i9].length != i10) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            z2 = true;
                            i10 = -1;
                        }
                    } else {
                        break;
                    }
                }
                if (and >= 0) {
                    if (and <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr4[i9].length - i10;
                        int length3 = bArr4.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr4[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                C10457l.m35319d(charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    public static final /* synthetic */ byte[] access$getPublicSuffixListBytes$p(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.publicSuffixListBytes;
        if (bArr == null) {
            C10457l.m35332q("publicSuffixListBytes");
        }
        return bArr;
    }

    private final List<String> findMatchingRule(List<String> list) {
        String str;
        String str2;
        String str3;
        List<String> list2;
        List<String> list3;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        if (this.publicSuffixListBytes != null) {
            int size = list.size();
            byte[][] bArr = new byte[size][];
            for (int i = 0; i < size; i++) {
                String str4 = list.get(i);
                Charset charset = StandardCharsets.UTF_8;
                C10457l.m35319d(charset, "UTF_8");
                Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                byte[] bytes = str4.getBytes(charset);
                C10457l.m35319d(bytes, "(this as java.lang.String).getBytes(charset)");
                bArr[i] = bytes;
            }
            int i2 = 0;
            while (true) {
                str = null;
                if (i2 >= size) {
                    str2 = null;
                    break;
                }
                Companion companion = Companion;
                byte[] bArr2 = this.publicSuffixListBytes;
                if (bArr2 == null) {
                    C10457l.m35332q("publicSuffixListBytes");
                }
                str2 = companion.binarySearch(bArr2, bArr, i2);
                if (str2 != null) {
                    break;
                }
                i2++;
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    bArr3[i3] = WILDCARD_LABEL;
                    Companion companion2 = Companion;
                    byte[] bArr4 = this.publicSuffixListBytes;
                    if (bArr4 == null) {
                        C10457l.m35332q("publicSuffixListBytes");
                    }
                    String access$binarySearch = companion2.binarySearch(bArr4, bArr3, i3);
                    if (access$binarySearch != null) {
                        str3 = access$binarySearch;
                        break;
                    }
                    i3++;
                }
            }
            str3 = null;
            if (str3 != null) {
                int i4 = size - 1;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        break;
                    }
                    Companion companion3 = Companion;
                    byte[] bArr5 = this.publicSuffixExceptionListBytes;
                    if (bArr5 == null) {
                        C10457l.m35332q("publicSuffixExceptionListBytes");
                    }
                    String access$binarySearch2 = companion3.binarySearch(bArr5, bArr, i5);
                    if (access$binarySearch2 != null) {
                        str = access$binarySearch2;
                        break;
                    }
                    i5++;
                }
            }
            if (str != null) {
                return C10300q.m34983n0(EXCEPTION_MARKER + str, new char[]{'.'}, false, 0, 6, (Object) null);
            } else if (str2 == null && str3 == null) {
                return PREVAILING_RULE;
            } else {
                if (str2 == null || (list2 = C10300q.m34983n0(str2, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
                    list2 = C10350l.m35138g();
                }
                if (str3 == null || (list3 = C10300q.m34983n0(str3, new char[]{'.'}, false, 0, 6, (Object) null)) == null) {
                    list3 = C10350l.m35138g();
                }
                return list2.size() > list3.size() ? list2 : list3;
            }
        } else {
            throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        p455g.p469x.C10416a.m35288a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readTheList() {
        /*
            r5 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x004b
            i.n r1 = new i.n
            i.d0 r0 = p493i.C10625q.m36163k(r0)
            r1.<init>(r0)
            i.h r0 = p493i.C10625q.m36156d(r1)
            r1 = 0
            int r2 = r0.readInt()     // Catch:{ all -> 0x0044 }
            long r2 = (long) r2     // Catch:{ all -> 0x0044 }
            byte[] r2 = r0.mo26344Z(r2)     // Catch:{ all -> 0x0044 }
            int r3 = r0.readInt()     // Catch:{ all -> 0x0044 }
            long r3 = (long) r3     // Catch:{ all -> 0x0044 }
            byte[] r3 = r0.mo26344Z(r3)     // Catch:{ all -> 0x0044 }
            g.s r4 = p455g.C10323s.f27547a     // Catch:{ all -> 0x0044 }
            p455g.p469x.C10416a.m35288a(r0, r1)
            monitor-enter(r5)
            p455g.p470y.p472d.C10457l.m35317b(r2)     // Catch:{ all -> 0x0041 }
            r5.publicSuffixListBytes = r2     // Catch:{ all -> 0x0041 }
            p455g.p470y.p472d.C10457l.m35317b(r3)     // Catch:{ all -> 0x0041 }
            r5.publicSuffixExceptionListBytes = r3     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)
            java.util.concurrent.CountDownLatch r0 = r5.readCompleteLatch
            r0.countDown()
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r2 = move-exception
            p455g.p469x.C10416a.m35288a(r0, r1)
            throw r2
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheList():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readTheListUninterruptibly() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.readTheList()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x000e }
            okhttp3.internal.platform.Platform r2 = r2.get()     // Catch:{ all -> 0x000e }
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.log(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheListUninterruptibly():void");
    }

    private final List<String> splitDomain(String str) {
        List<String> n0 = C10300q.m34983n0(str, new char[]{'.'}, false, 0, 6, (Object) null);
        return C10457l.m35316a((String) C10358t.m35162I(n0), HttpUrl.FRAGMENT_ENCODE_SET) ? C10358t.m35178z(n0, 1) : n0;
    }

    public final String getEffectiveTldPlusOne(String str) {
        C10457l.m35320e(str, "domain");
        String unicode = IDN.toUnicode(str);
        C10457l.m35319d(unicode, "unicodeDomain");
        List<String> splitDomain = splitDomain(unicode);
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        char charAt = findMatchingRule.get(0).charAt(0);
        int size = splitDomain.size();
        int size2 = findMatchingRule.size();
        if (charAt != '!') {
            size2++;
        }
        return C10275j.m34855g(C10275j.m34852d(C10358t.m35175w(splitDomain(str)), size - size2), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C10430l) null, 62, (Object) null);
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        C10457l.m35320e(bArr, "publicSuffixListBytes");
        C10457l.m35320e(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
