package p027c.p064i.p071i;

import java.util.Locale;

/* renamed from: c.i.i.e */
public final class C1896e {

    /* renamed from: a */
    public static final C1895d f5584a = new C1901e((C1899c) null, false);

    /* renamed from: b */
    public static final C1895d f5585b = new C1901e((C1899c) null, true);

    /* renamed from: c */
    public static final C1895d f5586c;

    /* renamed from: d */
    public static final C1895d f5587d;

    /* renamed from: e */
    public static final C1895d f5588e = new C1901e(C1897a.f5590a, false);

    /* renamed from: f */
    public static final C1895d f5589f = C1902f.f5595b;

    /* renamed from: c.i.i.e$a */
    private static class C1897a implements C1899c {

        /* renamed from: a */
        static final C1897a f5590a = new C1897a(true);

        /* renamed from: b */
        private final boolean f5591b;

        private C1897a(boolean z) {
            this.f5591b = z;
        }

        /* renamed from: a */
        public int mo6436a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C1896e.m7965a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.f5591b) {
                        return 1;
                    }
                } else if (this.f5591b) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.f5591b ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: c.i.i.e$b */
    private static class C1898b implements C1899c {

        /* renamed from: a */
        static final C1898b f5592a = new C1898b();

        private C1898b() {
        }

        /* renamed from: a */
        public int mo6436a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C1896e.m7966b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: c.i.i.e$c */
    private interface C1899c {
        /* renamed from: a */
        int mo6436a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: c.i.i.e$d */
    private static abstract class C1900d implements C1895d {

        /* renamed from: a */
        private final C1899c f5593a;

        C1900d(C1899c cVar) {
            this.f5593a = cVar;
        }

        /* renamed from: c */
        private boolean m7970c(CharSequence charSequence, int i, int i2) {
            int a = this.f5593a.mo6436a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo6437b();
            }
            return false;
        }

        /* renamed from: a */
        public boolean mo6435a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                return this.f5593a == null ? mo6437b() : m7970c(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract boolean mo6437b();
    }

    /* renamed from: c.i.i.e$e */
    private static class C1901e extends C1900d {

        /* renamed from: b */
        private final boolean f5594b;

        C1901e(C1899c cVar, boolean z) {
            super(cVar);
            this.f5594b = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo6437b() {
            return this.f5594b;
        }
    }

    /* renamed from: c.i.i.e$f */
    private static class C1902f extends C1900d {

        /* renamed from: b */
        static final C1902f f5595b = new C1902f();

        C1902f() {
            super((C1899c) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public boolean mo6437b() {
            return C1903f.m7976b(Locale.getDefault()) == 1;
        }
    }

    static {
        C1898b bVar = C1898b.f5592a;
        f5586c = new C1901e(bVar, false);
        f5587d = new C1901e(bVar, true);
    }

    /* renamed from: a */
    static int m7965a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m7966b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
