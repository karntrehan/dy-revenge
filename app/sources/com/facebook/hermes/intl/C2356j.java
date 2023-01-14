package com.facebook.hermes.intl;

import okhttp3.HttpUrl;

/* renamed from: com.facebook.hermes.intl.j */
class C2356j {

    /* renamed from: a */
    private CharSequence f7039a;

    /* renamed from: b */
    int f7040b = 0;

    /* renamed from: c */
    int f7041c = -1;

    /* renamed from: com.facebook.hermes.intl.j$a */
    public class C2357a {

        /* renamed from: a */
        private CharSequence f7042a = HttpUrl.FRAGMENT_ENCODE_SET;

        /* renamed from: b */
        private int f7043b = 0;

        /* renamed from: c */
        private int f7044c = 0;

        C2357a(CharSequence charSequence, int i, int i2) {
            this.f7042a = charSequence;
            this.f7043b = i;
            this.f7044c = i2;
        }

        /* renamed from: a */
        public boolean mo8004a() {
            return C2349f.m9702h(this.f7042a, this.f7043b, this.f7044c);
        }

        /* renamed from: b */
        public boolean mo8005b() {
            return C2349f.m9703i(this.f7042a, this.f7043b, this.f7044c);
        }

        /* renamed from: c */
        public boolean mo8006c() {
            return C2349f.m9704j(this.f7042a, this.f7043b, this.f7044c);
        }

        /* renamed from: d */
        public boolean mo8007d() {
            return C2349f.m9705k(this.f7042a, this.f7043b, this.f7044c);
        }

        /* renamed from: e */
        public boolean mo8008e() {
            return C2349f.m9706l(this.f7042a, this.f7043b, this.f7044c);
        }

        /* renamed from: f */
        public boolean mo8009f() {
            return C2349f.m9707m(this.f7042a, this.f7043b, this.f7044c);
        }

        /* renamed from: g */
        public boolean mo8010g() {
            return C2349f.m9708n(this.f7042a, this.f7043b, this.f7044c);
        }

        /* renamed from: h */
        public boolean mo8011h() {
            return C2349f.m9709o(this.f7042a, this.f7043b, this.f7044c);
        }

        /* renamed from: i */
        public boolean mo8012i() {
            return C2349f.m9710p(this.f7042a, this.f7043b, this.f7044c);
        }

        /* renamed from: j */
        public boolean mo8013j() {
            return C2349f.m9711q(this.f7042a, this.f7043b, this.f7044c);
        }

        /* renamed from: k */
        public boolean mo8014k() {
            return C2349f.m9712r(this.f7042a, this.f7043b, this.f7044c);
        }

        /* renamed from: l */
        public boolean mo8015l() {
            return C2349f.m9713s(this.f7042a, this.f7043b, this.f7044c);
        }

        /* renamed from: m */
        public String mo8016m() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = this.f7043b; i <= this.f7044c; i++) {
                stringBuffer.append(Character.toLowerCase(this.f7042a.charAt(i)));
            }
            return stringBuffer.toString();
        }

        /* renamed from: n */
        public String mo8017n() {
            StringBuffer stringBuffer = new StringBuffer();
            int i = this.f7043b;
            while (i <= this.f7044c) {
                stringBuffer.append(i == this.f7043b ? Character.toUpperCase(this.f7042a.charAt(i)) : Character.toLowerCase(this.f7042a.charAt(i)));
                i++;
            }
            return stringBuffer.toString();
        }

        /* renamed from: o */
        public String mo8018o() {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = this.f7043b; i <= this.f7044c; i++) {
                stringBuffer.append(Character.toUpperCase(this.f7042a.charAt(i)));
            }
            return stringBuffer.toString();
        }

        public String toString() {
            return this.f7042a.subSequence(this.f7043b, this.f7044c + 1).toString();
        }
    }

    /* renamed from: com.facebook.hermes.intl.j$b */
    public class C2358b extends Exception {
        public C2358b() {
        }
    }

    public C2356j(CharSequence charSequence) {
        this.f7039a = charSequence;
    }

    /* renamed from: b */
    private static boolean m9732b(char c) {
        return c == '-';
    }

    /* renamed from: a */
    public boolean mo8002a() {
        return this.f7039a.length() > 0 && this.f7041c < this.f7039a.length() - 1;
    }

    /* renamed from: c */
    public C2357a mo8003c() {
        if (mo8002a()) {
            int i = this.f7041c;
            if (i >= this.f7040b) {
                if (!m9732b(this.f7039a.charAt(i + 1))) {
                    throw new C2358b();
                } else if (this.f7041c + 2 != this.f7039a.length()) {
                    this.f7040b = this.f7041c + 2;
                } else {
                    throw new C2358b();
                }
            }
            int i2 = this.f7040b;
            while (true) {
                this.f7041c = i2;
                if (this.f7041c >= this.f7039a.length() || m9732b(this.f7039a.charAt(this.f7041c))) {
                    int i3 = this.f7041c;
                    int i4 = this.f7040b;
                } else {
                    i2 = this.f7041c + 1;
                }
            }
            int i32 = this.f7041c;
            int i42 = this.f7040b;
            if (i32 > i42) {
                int i5 = i32 - 1;
                this.f7041c = i5;
                return new C2357a(this.f7039a, i42, i5);
            }
            throw new C2358b();
        }
        throw new C2358b();
    }
}
