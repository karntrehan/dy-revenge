package p027c.p096t.p097a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p027c.p060f.C1790b;
import p174e.p319f.p393c.p394a.C9175a;
import p174e.p319f.p393c.p394a.C9220d;
import p174e.p319f.p393c.p394a.C9224g;
import p174e.p319f.p393c.p394a.C9230i;
import p174e.p319f.p393c.p394a.p395a0.C9185f;
import p174e.p319f.p393c.p394a.p396t.C9248a;
import p174e.p319f.p393c.p394a.p396t.C9261f;
import p174e.p319f.p393c.p394a.p398u.C9282a;
import p174e.p319f.p393c.p394a.p398u.C9285b;
import p174e.p319f.p393c.p394a.p399v.p400a.C9288a;

/* renamed from: c.t.a.a */
public final class C2092a implements SharedPreferences {

    /* renamed from: a */
    final SharedPreferences f6099a;

    /* renamed from: b */
    final List<SharedPreferences.OnSharedPreferenceChangeListener> f6100b = new ArrayList();

    /* renamed from: c */
    final String f6101c;

    /* renamed from: d */
    final String f6102d;

    /* renamed from: e */
    final C9175a f6103e;

    /* renamed from: f */
    final C9220d f6104f;

    /* renamed from: c.t.a.a$a */
    static /* synthetic */ class C2093a {

        /* renamed from: a */
        static final /* synthetic */ int[] f6105a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                c.t.a.a$c[] r0 = p027c.p096t.p097a.C2092a.C2095c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6105a = r0
                c.t.a.a$c r1 = p027c.p096t.p097a.C2092a.C2095c.STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6105a     // Catch:{ NoSuchFieldError -> 0x001d }
                c.t.a.a$c r1 = p027c.p096t.p097a.C2092a.C2095c.INT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f6105a     // Catch:{ NoSuchFieldError -> 0x0028 }
                c.t.a.a$c r1 = p027c.p096t.p097a.C2092a.C2095c.LONG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f6105a     // Catch:{ NoSuchFieldError -> 0x0033 }
                c.t.a.a$c r1 = p027c.p096t.p097a.C2092a.C2095c.FLOAT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f6105a     // Catch:{ NoSuchFieldError -> 0x003e }
                c.t.a.a$c r1 = p027c.p096t.p097a.C2092a.C2095c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f6105a     // Catch:{ NoSuchFieldError -> 0x0049 }
                c.t.a.a$c r1 = p027c.p096t.p097a.C2092a.C2095c.STRING_SET     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p096t.p097a.C2092a.C2093a.<clinit>():void");
        }
    }

    /* renamed from: c.t.a.a$b */
    private static final class C2094b implements SharedPreferences.Editor {

        /* renamed from: a */
        private final C2092a f6106a;

        /* renamed from: b */
        private final SharedPreferences.Editor f6107b;

        /* renamed from: c */
        private final List<String> f6108c;

        /* renamed from: d */
        private AtomicBoolean f6109d = new AtomicBoolean(false);

        C2094b(C2092a aVar, SharedPreferences.Editor editor) {
            this.f6106a = aVar;
            this.f6107b = editor;
            this.f6108c = new CopyOnWriteArrayList();
        }

        /* renamed from: a */
        private void m8971a() {
            if (this.f6109d.getAndSet(false)) {
                for (String next : this.f6106a.getAll().keySet()) {
                    if (!this.f6108c.contains(next) && !this.f6106a.mo7027g(next)) {
                        this.f6107b.remove(this.f6106a.mo7024d(next));
                    }
                }
            }
        }

        /* renamed from: b */
        private void m8972b() {
            for (SharedPreferences.OnSharedPreferenceChangeListener next : this.f6106a.f6100b) {
                for (String onSharedPreferenceChanged : this.f6108c) {
                    next.onSharedPreferenceChanged(this.f6106a, onSharedPreferenceChanged);
                }
            }
        }

        /* renamed from: c */
        private void m8973c(String str, byte[] bArr) {
            if (!this.f6106a.mo7027g(str)) {
                this.f6108c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    Pair<String, String> e = this.f6106a.mo7025e(str, bArr);
                    this.f6107b.putString((String) e.first, (String) e.second);
                } catch (GeneralSecurityException e2) {
                    throw new SecurityException("Could not encrypt data: " + e2.getMessage(), e2);
                }
            } else {
                throw new SecurityException(str + " is a reserved key for the encryption keyset.");
            }
        }

        public void apply() {
            m8971a();
            this.f6107b.apply();
            m8972b();
            this.f6108c.clear();
        }

        public SharedPreferences.Editor clear() {
            this.f6109d.set(true);
            return this;
        }

        public boolean commit() {
            m8971a();
            try {
                return this.f6107b.commit();
            } finally {
                m8972b();
                this.f6108c.clear();
            }
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(C2095c.BOOLEAN.mo7047g());
            allocate.put(z ? (byte) 1 : 0);
            m8973c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(C2095c.FLOAT.mo7047g());
            allocate.putFloat(f);
            m8973c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(C2095c.INT.mo7047g());
            allocate.putInt(i);
            m8973c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(C2095c.LONG.mo7047g());
            allocate.putLong(j);
            m8973c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(C2095c.STRING.mo7047g());
            allocate.putInt(length);
            allocate.put(bytes);
            m8973c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            if (set == null) {
                set = new C1790b<>();
                set.add("__NULL__");
            }
            ArrayList<byte[]> arrayList = new ArrayList<>(set.size());
            int size = set.size() * 4;
            for (String bytes : set) {
                byte[] bytes2 = bytes.getBytes(StandardCharsets.UTF_8);
                arrayList.add(bytes2);
                size += bytes2.length;
            }
            ByteBuffer allocate = ByteBuffer.allocate(size + 4);
            allocate.putInt(C2095c.STRING_SET.mo7047g());
            for (byte[] bArr : arrayList) {
                allocate.putInt(bArr.length);
                allocate.put(bArr);
            }
            m8973c(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor remove(String str) {
            if (!this.f6106a.mo7027g(str)) {
                this.f6107b.remove(this.f6106a.mo7024d(str));
                this.f6108c.remove(str);
                return this;
            }
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* renamed from: c.t.a.a$c */
    private enum C2095c {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        

        /* renamed from: u */
        private final int f6117u;

        private C2095c(int i) {
            this.f6117u = i;
        }

        /* renamed from: e */
        public static C2095c m8974e(int i) {
            if (i == 0) {
                return STRING;
            }
            if (i == 1) {
                return STRING_SET;
            }
            if (i == 2) {
                return INT;
            }
            if (i == 3) {
                return LONG;
            }
            if (i == 4) {
                return FLOAT;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }

        /* renamed from: g */
        public int mo7047g() {
            return this.f6117u;
        }
    }

    /* renamed from: c.t.a.a$d */
    public enum C2096d {
        AES256_SIV(C9282a.m30902j());
        

        /* renamed from: p */
        private final C9224g f6120p;

        private C2096d(C9224g gVar) {
            this.f6120p = gVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C9224g mo7048e() {
            return this.f6120p;
        }
    }

    /* renamed from: c.t.a.a$e */
    public enum C2097e {
        AES256_GCM(C9261f.m30789j());
        

        /* renamed from: p */
        private final C9224g f6123p;

        private C2097e(C9224g gVar) {
            this.f6123p = gVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C9224g mo7049e() {
            return this.f6123p;
        }
    }

    C2092a(String str, String str2, SharedPreferences sharedPreferences, C9175a aVar, C9220d dVar) {
        this.f6101c = str;
        this.f6099a = sharedPreferences;
        this.f6102d = str2;
        this.f6103e = aVar;
        this.f6104f = dVar;
    }

    /* renamed from: a */
    public static SharedPreferences m8964a(Context context, String str, C2098b bVar, C2096d dVar, C2097e eVar) {
        return m8965b(str, bVar.mo7050a(), context, dVar, eVar);
    }

    @Deprecated
    /* renamed from: b */
    public static SharedPreferences m8965b(String str, String str2, Context context, C2096d dVar, C2097e eVar) {
        C9285b.m30922b();
        C9248a.m30728b();
        Context applicationContext = context.getApplicationContext();
        C9288a.C9290b j = new C9288a.C9290b().mo23326h(dVar.mo7048e()).mo23328j(applicationContext, "__androidx_security_crypto_encrypted_prefs_key_keyset__", str);
        C9230i c = j.mo23327i("android-keystore://" + str2).mo23325d().mo23324c();
        C9288a.C9290b j2 = new C9288a.C9290b().mo23326h(eVar.mo7049e()).mo23328j(applicationContext, "__androidx_security_crypto_encrypted_prefs_value_keyset__", str);
        C9175a aVar = (C9175a) j2.mo23327i("android-keystore://" + str2).mo23325d().mo23324c().mo23215h(C9175a.class);
        return new C2092a(str, str2, applicationContext.getSharedPreferences(str, 0), aVar, (C9220d) c.mo23215h(C9220d.class));
    }

    /* renamed from: f */
    private Object m8966f(String str) {
        if (!mo7027g(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String d = mo7024d(str);
                String string = this.f6099a.getString(d, (String) null);
                if (string == null) {
                    return null;
                }
                boolean z = false;
                ByteBuffer wrap = ByteBuffer.wrap(this.f6103e.mo23154b(C9185f.m30521a(string, 0), d.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                switch (C2093a.f6105a[C2095c.m8974e(wrap.getInt()).ordinal()]) {
                    case 1:
                        int i = wrap.getInt();
                        ByteBuffer slice = wrap.slice();
                        wrap.limit(i);
                        String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                        if (charBuffer.equals("__NULL__")) {
                            return null;
                        }
                        return charBuffer;
                    case 2:
                        return Integer.valueOf(wrap.getInt());
                    case 3:
                        return Long.valueOf(wrap.getLong());
                    case 4:
                        return Float.valueOf(wrap.getFloat());
                    case 5:
                        if (wrap.get() != 0) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 6:
                        C1790b bVar = new C1790b();
                        while (wrap.hasRemaining()) {
                            int i2 = wrap.getInt();
                            ByteBuffer slice2 = wrap.slice();
                            slice2.limit(i2);
                            wrap.position(wrap.position() + i2);
                            bVar.add(StandardCharsets.UTF_8.decode(slice2).toString());
                        }
                        if (bVar.size() != 1 || !"__NULL__".equals(bVar.mo6152r(0))) {
                            return bVar;
                        }
                        return null;
                    default:
                        return null;
                }
            } catch (GeneralSecurityException e) {
                throw new SecurityException("Could not decrypt value. " + e.getMessage(), e);
            }
        } else {
            throw new SecurityException(str + " is a reserved key for the encryption keyset.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo7022c(String str) {
        try {
            String str2 = new String(this.f6104f.mo23166b(C9185f.m30521a(str, 0), this.f6101c.getBytes()), StandardCharsets.UTF_8);
            if (str2.equals("__NULL__")) {
                return null;
            }
            return str2;
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not decrypt key. " + e.getMessage(), e);
        }
    }

    public boolean contains(String str) {
        if (!mo7027g(str)) {
            return this.f6099a.contains(mo7024d(str));
        }
        throw new SecurityException(str + " is a reserved key for the encryption keyset.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo7024d(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return C9185f.m30524d(this.f6104f.mo23165a(str.getBytes(StandardCharsets.UTF_8), this.f6101c.getBytes()));
        } catch (GeneralSecurityException e) {
            throw new SecurityException("Could not encrypt key. " + e.getMessage(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Pair<String, String> mo7025e(String str, byte[] bArr) {
        String d = mo7024d(str);
        return new Pair<>(d, C9185f.m30524d(this.f6103e.mo23153a(bArr, d.getBytes(StandardCharsets.UTF_8))));
    }

    public SharedPreferences.Editor edit() {
        return new C2094b(this, this.f6099a.edit());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo7027g(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f6099a.getAll().entrySet()) {
            if (!mo7027g((String) next.getKey())) {
                String c = mo7022c((String) next.getKey());
                hashMap.put(c, m8966f(c));
            }
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        Object f = m8966f(str);
        return (f == null || !(f instanceof Boolean)) ? z : ((Boolean) f).booleanValue();
    }

    public float getFloat(String str, float f) {
        Object f2 = m8966f(str);
        return (f2 == null || !(f2 instanceof Float)) ? f : ((Float) f2).floatValue();
    }

    public int getInt(String str, int i) {
        Object f = m8966f(str);
        return (f == null || !(f instanceof Integer)) ? i : ((Integer) f).intValue();
    }

    public long getLong(String str, long j) {
        Object f = m8966f(str);
        return (f == null || !(f instanceof Long)) ? j : ((Long) f).longValue();
    }

    public String getString(String str, String str2) {
        Object f = m8966f(str);
        return (f == null || !(f instanceof String)) ? str2 : (String) f;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        Object f = m8966f(str);
        Set<String> bVar = f instanceof Set ? (Set) f : new C1790b<>();
        return bVar.size() > 0 ? bVar : set;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f6100b.add(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f6100b.remove(onSharedPreferenceChangeListener);
    }
}
