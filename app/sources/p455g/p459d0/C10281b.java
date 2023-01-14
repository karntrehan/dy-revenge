package p455g.p459d0;

import p455g.p456a0.C10243c;

/* renamed from: g.d0.b */
class C10281b {
    /* renamed from: a */
    public static int m34863a(int i) {
        if (new C10243c(2, 36).mo25559o(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C10243c(2, 36));
    }

    /* renamed from: b */
    public static final int m34864b(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: c */
    public static final boolean m34865c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
