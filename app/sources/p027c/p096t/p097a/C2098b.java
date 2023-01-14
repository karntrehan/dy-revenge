package p027c.p096t.p097a;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Objects;

/* renamed from: c.t.a.b */
public final class C2098b {

    /* renamed from: a */
    private final String f6124a;

    /* renamed from: b */
    private final KeyGenParameterSpec f6125b;

    /* renamed from: c.t.a.b$a */
    static /* synthetic */ class C2099a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6126a;

        static {
            int[] iArr = new int[C2101c.values().length];
            f6126a = iArr;
            try {
                iArr[C2101c.AES256_GCM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: c.t.a.b$b */
    public static final class C2100b {

        /* renamed from: a */
        private final String f6127a;

        /* renamed from: b */
        private KeyGenParameterSpec f6128b;

        /* renamed from: c */
        private C2101c f6129c;

        /* renamed from: d */
        private boolean f6130d;

        /* renamed from: e */
        private int f6131e;

        /* renamed from: f */
        private boolean f6132f;

        /* renamed from: g */
        private final Context f6133g;

        public C2100b(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public C2100b(Context context, String str) {
            this.f6133g = context.getApplicationContext();
            this.f6127a = str;
        }

        /* renamed from: b */
        private C2098b m8980b() {
            C2101c cVar = this.f6129c;
            if (cVar == null && this.f6128b == null) {
                throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
            }
            if (cVar == C2101c.AES256_GCM) {
                KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(this.f6127a, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256);
                if (this.f6130d) {
                    keySize.setUserAuthenticationRequired(true).setUserAuthenticationValidityDurationSeconds(this.f6131e);
                }
                if (Build.VERSION.SDK_INT >= 28 && this.f6132f && this.f6133g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    keySize.setIsStrongBoxBacked(true);
                }
                this.f6128b = keySize.build();
            }
            KeyGenParameterSpec keyGenParameterSpec = this.f6128b;
            Objects.requireNonNull(keyGenParameterSpec, "KeyGenParameterSpec was null after build() check");
            return new C2098b(C2102c.m8985c(keyGenParameterSpec), this.f6128b);
        }

        /* renamed from: a */
        public C2098b mo7053a() {
            return Build.VERSION.SDK_INT >= 23 ? m8980b() : new C2098b(this.f6127a, (Object) null);
        }

        /* renamed from: c */
        public C2100b mo7054c(C2101c cVar) {
            if (C2099a.f6126a[cVar.ordinal()] != 1) {
                throw new IllegalArgumentException("Unsupported scheme: " + cVar);
            } else if (Build.VERSION.SDK_INT < 23 || this.f6128b == null) {
                this.f6129c = cVar;
                return this;
            } else {
                throw new IllegalArgumentException("KeyScheme set after setting a KeyGenParamSpec");
            }
        }
    }

    /* renamed from: c.t.a.b$c */
    public enum C2101c {
        AES256_GCM
    }

    C2098b(String str, Object obj) {
        this.f6124a = str;
        if (Build.VERSION.SDK_INT >= 23) {
            this.f6125b = (KeyGenParameterSpec) obj;
        } else {
            this.f6125b = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo7050a() {
        return this.f6124a;
    }

    /* renamed from: b */
    public boolean mo7051b() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            return instance.containsAlias(this.f6124a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f6124a + ", isKeyStoreBacked=" + mo7051b() + "}";
    }
}
