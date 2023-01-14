package p174e.p319f.p393c.p394a.p399v.p400a;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9234m;
import p174e.p319f.p393c.p394a.p395a0.C9211u;
import p174e.p319f.p393c.p394a.p395a0.C9214w;

/* renamed from: e.f.c.a.v.a.c */
public final class C9292c implements C9234m {

    /* renamed from: a */
    private static final String f25212a = "c";

    /* renamed from: b */
    private final String f25213b;

    /* renamed from: c */
    private KeyStore f25214c;

    /* renamed from: e.f.c.a.v.a.c$b */
    public static final class C9294b {

        /* renamed from: a */
        String f25215a = null;

        /* renamed from: b */
        KeyStore f25216b = null;

        public C9294b() {
            if (C9292c.m30952f()) {
                try {
                    KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                    this.f25216b = instance;
                    instance.load((KeyStore.LoadStoreParameter) null);
                } catch (IOException | GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            } else {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
        }

        /* renamed from: a */
        public C9292c mo23330a() {
            return new C9292c(this);
        }

        /* renamed from: b */
        public C9294b mo23331b(KeyStore keyStore) {
            if (keyStore != null) {
                this.f25216b = keyStore;
                return this;
            }
            throw new IllegalArgumentException("val cannot be null");
        }
    }

    public C9292c() {
        this(new C9294b());
    }

    private C9292c(C9294b bVar) {
        this.f25213b = bVar.f25215a;
        this.f25214c = bVar.f25216b;
    }

    /* renamed from: d */
    public static void m30951d(String str) {
        if (!new C9292c().mo23329e(str)) {
            String b = C9214w.m30606b("android-keystore://", str);
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder(b, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
            instance.generateKey();
            return;
        }
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static boolean m30952f() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* renamed from: g */
    private static C9175a m30953g(C9175a aVar) {
        byte[] c = C9211u.m30601c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c, aVar.mo23154b(aVar.mo23153a(c, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo23226a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f25213b     // Catch:{ all -> 0x0024 }
            r1 = 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r2)
            return r1
        L_0x000e:
            java.lang.String r0 = r2.f25213b     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0021
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0024 }
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch:{ all -> 0x0024 }
            if (r3 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            r1 = 0
        L_0x0022:
            monitor-exit(r2)
            return r1
        L_0x0024:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p399v.p400a.C9292c.mo23226a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public synchronized C9175a mo23227b(String str) {
        String str2 = this.f25213b;
        if (str2 != null) {
            if (!str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", new Object[]{this.f25213b, str}));
            }
        }
        return m30953g(new C9291b(C9214w.m30606b("android-keystore://", str), this.f25214c));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        java.lang.Thread.sleep(20);
        r0 = java.security.KeyStore.getInstance("AndroidKeyStore");
        r2.f25214c = r0;
        r0.load((java.security.KeyStore.LoadStoreParameter) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        return r2.f25214c.containsAlias(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        throw new java.security.GeneralSecurityException(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        android.util.Log.w(f25212a, "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000f */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo23329e(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "android-keystore://"
            java.lang.String r3 = p174e.p319f.p393c.p394a.p395a0.C9214w.m30606b(r0, r3)     // Catch:{ all -> 0x0036 }
            java.security.KeyStore r0 = r2.f25214c     // Catch:{ NullPointerException -> 0x000f }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ NullPointerException -> 0x000f }
            monitor-exit(r2)
            return r3
        L_0x000f:
            java.lang.String r0 = f25212a     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again."
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0036 }
            r0 = 20
            java.lang.Thread.sleep(r0)     // Catch:{ IOException -> 0x002f, InterruptedException -> 0x0027 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ IOException -> 0x002f, InterruptedException -> 0x0027 }
            r2.f25214c = r0     // Catch:{ IOException -> 0x002f, InterruptedException -> 0x0027 }
            r1 = 0
            r0.load(r1)     // Catch:{ IOException -> 0x002f, InterruptedException -> 0x0027 }
        L_0x0027:
            java.security.KeyStore r0 = r2.f25214c     // Catch:{ all -> 0x0036 }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ all -> 0x0036 }
            monitor-exit(r2)
            return r3
        L_0x002f:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0036 }
            r0.<init>(r3)     // Catch:{ all -> 0x0036 }
            throw r0     // Catch:{ all -> 0x0036 }
        L_0x0036:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p393c.p394a.p399v.p400a.C9292c.mo23329e(java.lang.String):boolean");
    }
}
