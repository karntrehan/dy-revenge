package p027c.p064i.p071i;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: c.i.i.a */
public final class C1888a {

    /* renamed from: a */
    static final C1895d f5552a;

    /* renamed from: b */
    private static final String f5553b = Character.toString(8206);

    /* renamed from: c */
    private static final String f5554c = Character.toString(8207);

    /* renamed from: d */
    static final C1888a f5555d;

    /* renamed from: e */
    static final C1888a f5556e;

    /* renamed from: f */
    private final boolean f5557f;

    /* renamed from: g */
    private final int f5558g;

    /* renamed from: h */
    private final C1895d f5559h;

    /* renamed from: c.i.i.a$a */
    public static final class C1889a {

        /* renamed from: a */
        private boolean f5560a;

        /* renamed from: b */
        private int f5561b;

        /* renamed from: c */
        private C1895d f5562c;

        public C1889a() {
            m7939c(C1888a.m7932e(Locale.getDefault()));
        }

        /* renamed from: b */
        private static C1888a m7938b(boolean z) {
            return z ? C1888a.f5556e : C1888a.f5555d;
        }

        /* renamed from: c */
        private void m7939c(boolean z) {
            this.f5560a = z;
            this.f5562c = C1888a.f5552a;
            this.f5561b = 2;
        }

        /* renamed from: a */
        public C1888a mo6405a() {
            return (this.f5561b == 2 && this.f5562c == C1888a.f5552a) ? m7938b(this.f5560a) : new C1888a(this.f5560a, this.f5561b, this.f5562c);
        }
    }

    /* renamed from: c.i.i.a$b */
    private static class C1890b {

        /* renamed from: a */
        private static final byte[] f5563a = new byte[1792];

        /* renamed from: b */
        private final CharSequence f5564b;

        /* renamed from: c */
        private final boolean f5565c;

        /* renamed from: d */
        private final int f5566d;

        /* renamed from: e */
        private int f5567e;

        /* renamed from: f */
        private char f5568f;

        static {
            for (int i = 0; i < 1792; i++) {
                f5563a[i] = Character.getDirectionality(i);
            }
        }

        C1890b(CharSequence charSequence, boolean z) {
            this.f5564b = charSequence;
            this.f5565c = z;
            this.f5566d = charSequence.length();
        }

        /* renamed from: c */
        private static byte m7941c(char c) {
            return c < 1792 ? f5563a[c] : Character.getDirectionality(c);
        }

        /* renamed from: f */
        private byte m7942f() {
            char charAt;
            int i = this.f5567e;
            do {
                int i2 = this.f5567e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f5564b;
                int i3 = i2 - 1;
                this.f5567e = i3;
                charAt = charSequence.charAt(i3);
                this.f5568f = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.f5567e = i;
            this.f5568f = ';';
            return 13;
        }

        /* renamed from: g */
        private byte m7943g() {
            char charAt;
            do {
                int i = this.f5567e;
                if (i >= this.f5566d) {
                    return 12;
                }
                CharSequence charSequence = this.f5564b;
                this.f5567e = i + 1;
                charAt = charSequence.charAt(i);
                this.f5568f = charAt;
            } while (charAt != ';');
            return 12;
        }

        /* renamed from: h */
        private byte m7944h() {
            char charAt;
            int i = this.f5567e;
            while (true) {
                int i2 = this.f5567e;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f5564b;
                int i3 = i2 - 1;
                this.f5567e = i3;
                char charAt2 = charSequence.charAt(i3);
                this.f5568f = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.f5567e;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f5564b;
                        int i5 = i4 - 1;
                        this.f5567e = i5;
                        charAt = charSequence2.charAt(i5);
                        this.f5568f = charAt;
                    } while (charAt != charAt2);
                }
            }
            this.f5567e = i;
            this.f5568f = '>';
            return 13;
        }

        /* renamed from: i */
        private byte m7945i() {
            char charAt;
            int i = this.f5567e;
            while (true) {
                int i2 = this.f5567e;
                if (i2 < this.f5566d) {
                    CharSequence charSequence = this.f5564b;
                    this.f5567e = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.f5568f = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.f5567e;
                            if (i3 >= this.f5566d) {
                                break;
                            }
                            CharSequence charSequence2 = this.f5564b;
                            this.f5567e = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.f5568f = charAt;
                        } while (charAt != charAt2);
                    }
                } else {
                    this.f5567e = i;
                    this.f5568f = '<';
                    return 13;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public byte mo6406a() {
            char charAt = this.f5564b.charAt(this.f5567e - 1);
            this.f5568f = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f5564b, this.f5567e);
                this.f5567e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f5567e--;
            byte c = m7941c(this.f5568f);
            if (!this.f5565c) {
                return c;
            }
            char c2 = this.f5568f;
            return c2 == '>' ? m7944h() : c2 == ';' ? m7942f() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public byte mo6407b() {
            char charAt = this.f5564b.charAt(this.f5567e);
            this.f5568f = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.f5564b, this.f5567e);
                this.f5567e += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.f5567e++;
            byte c = m7941c(this.f5568f);
            if (!this.f5565c) {
                return c;
            }
            char c2 = this.f5568f;
            return c2 == '<' ? m7945i() : c2 == '&' ? m7943g() : c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public int mo6408d() {
            this.f5567e = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.f5567e < this.f5566d && i == 0) {
                byte b = mo6407b();
                if (b != 0) {
                    if (b == 1 || b == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b != 9) {
                        switch (b) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.f5567e > 0) {
                switch (mo6406a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            r1 = r1 - 1;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo6409e() {
            /*
                r7 = this;
                int r0 = r7.f5566d
                r7.f5567e = r0
                r0 = 0
                r1 = 0
                r2 = 0
            L_0x0007:
                int r3 = r7.f5567e
                if (r3 <= 0) goto L_0x003b
                byte r3 = r7.mo6406a()
                r4 = -1
                if (r3 == 0) goto L_0x0034
                r5 = 1
                if (r3 == r5) goto L_0x002e
                r6 = 2
                if (r3 == r6) goto L_0x002e
                r6 = 9
                if (r3 == r6) goto L_0x0007
                switch(r3) {
                    case 14: goto L_0x0028;
                    case 15: goto L_0x0028;
                    case 16: goto L_0x0025;
                    case 17: goto L_0x0025;
                    case 18: goto L_0x0022;
                    default: goto L_0x001f;
                }
            L_0x001f:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0022:
                int r1 = r1 + 1
                goto L_0x0007
            L_0x0025:
                if (r2 != r1) goto L_0x002b
                return r5
            L_0x0028:
                if (r2 != r1) goto L_0x002b
                return r4
            L_0x002b:
                int r1 = r1 + -1
                goto L_0x0007
            L_0x002e:
                if (r1 != 0) goto L_0x0031
                return r5
            L_0x0031:
                if (r2 != 0) goto L_0x0007
                goto L_0x0039
            L_0x0034:
                if (r1 != 0) goto L_0x0037
                return r4
            L_0x0037:
                if (r2 != 0) goto L_0x0007
            L_0x0039:
                r2 = r1
                goto L_0x0007
            L_0x003b:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p027c.p064i.p071i.C1888a.C1890b.mo6409e():int");
        }
    }

    static {
        C1895d dVar = C1896e.f5586c;
        f5552a = dVar;
        f5555d = new C1888a(false, 2, dVar);
        f5556e = new C1888a(true, 2, dVar);
    }

    C1888a(boolean z, int i, C1895d dVar) {
        this.f5557f = z;
        this.f5558g = i;
        this.f5559h = dVar;
    }

    /* renamed from: a */
    private static int m7929a(CharSequence charSequence) {
        return new C1890b(charSequence, false).mo6408d();
    }

    /* renamed from: b */
    private static int m7930b(CharSequence charSequence) {
        return new C1890b(charSequence, false).mo6409e();
    }

    /* renamed from: c */
    public static C1888a m7931c() {
        return new C1889a().mo6405a();
    }

    /* renamed from: e */
    static boolean m7932e(Locale locale) {
        return C1903f.m7976b(locale) == 1;
    }

    /* renamed from: f */
    private String m7933f(CharSequence charSequence, C1895d dVar) {
        boolean a = dVar.mo6435a(charSequence, 0, charSequence.length());
        return (this.f5557f || (!a && m7930b(charSequence) != 1)) ? this.f5557f ? (!a || m7930b(charSequence) == -1) ? f5554c : HttpUrl.FRAGMENT_ENCODE_SET : HttpUrl.FRAGMENT_ENCODE_SET : f5553b;
    }

    /* renamed from: g */
    private String m7934g(CharSequence charSequence, C1895d dVar) {
        boolean a = dVar.mo6435a(charSequence, 0, charSequence.length());
        return (this.f5557f || (!a && m7929a(charSequence) != 1)) ? this.f5557f ? (!a || m7929a(charSequence) == -1) ? f5554c : HttpUrl.FRAGMENT_ENCODE_SET : HttpUrl.FRAGMENT_ENCODE_SET : f5553b;
    }

    /* renamed from: d */
    public boolean mo6402d() {
        return (this.f5558g & 2) != 0;
    }

    /* renamed from: h */
    public CharSequence mo6403h(CharSequence charSequence) {
        return mo6404i(charSequence, this.f5559h, true);
    }

    /* renamed from: i */
    public CharSequence mo6404i(CharSequence charSequence, C1895d dVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a = dVar.mo6435a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (mo6402d() && z) {
            spannableStringBuilder.append(m7934g(charSequence, a ? C1896e.f5585b : C1896e.f5584a));
        }
        if (a != this.f5557f) {
            spannableStringBuilder.append(a ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append(m7933f(charSequence, a ? C1896e.f5585b : C1896e.f5584a));
        }
        return spannableStringBuilder;
    }
}
