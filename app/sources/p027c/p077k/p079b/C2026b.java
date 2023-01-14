package p027c.p077k.p079b;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: c.k.b.b */
class C2026b {

    /* renamed from: c.k.b.b$a */
    public interface C2027a<T> {
        /* renamed from: a */
        void mo6752a(T t, Rect rect);
    }

    /* renamed from: c.k.b.b$b */
    public interface C2028b<T, V> {
        /* renamed from: a */
        V mo6754a(T t, int i);

        /* renamed from: b */
        int mo6755b(T t);
    }

    /* renamed from: c.k.b.b$c */
    private static class C2029c<T> implements Comparator<T> {

        /* renamed from: f */
        private final Rect f5822f = new Rect();

        /* renamed from: o */
        private final Rect f5823o = new Rect();

        /* renamed from: p */
        private final boolean f5824p;

        /* renamed from: q */
        private final C2027a<T> f5825q;

        C2029c(boolean z, C2027a<T> aVar) {
            this.f5824p = z;
            this.f5825q = aVar;
        }

        public int compare(T t, T t2) {
            Rect rect = this.f5822f;
            Rect rect2 = this.f5823o;
            this.f5825q.mo6752a(t, rect);
            this.f5825q.mo6752a(t2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i3 = rect.left;
            int i4 = rect2.left;
            if (i3 < i4) {
                return this.f5824p ? 1 : -1;
            }
            if (i3 > i4) {
                return this.f5824p ? -1 : 1;
            }
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                return this.f5824p ? 1 : -1;
            }
            if (i7 > i8) {
                return this.f5824p ? -1 : 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    private static boolean m8569a(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean b = m8570b(i, rect, rect2);
        if (m8570b(i, rect, rect3) || !b) {
            return false;
        }
        return !m8578j(i, rect, rect3) || i == 17 || i == 66 || m8579k(i, rect, rect2) < m8581m(i, rect, rect3);
    }

    /* renamed from: b */
    private static boolean m8570b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <L, T> T m8571c(L r7, p027c.p077k.p079b.C2026b.C2028b<L, T> r8, p027c.p077k.p079b.C2026b.C2027a<T> r9, T r10, android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L_0x0038
            r1 = 33
            if (r12 == r1) goto L_0x002e
            r1 = 66
            if (r12 == r1) goto L_0x0026
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L_0x001e
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
            goto L_0x0034
        L_0x001e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L_0x0026:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
            goto L_0x003e
        L_0x002e:
            int r1 = r11.height()
            int r1 = r1 + 1
        L_0x0034:
            r0.offset(r2, r1)
            goto L_0x0041
        L_0x0038:
            int r1 = r11.width()
            int r1 = r1 + 1
        L_0x003e:
            r0.offset(r1, r2)
        L_0x0041:
            r1 = 0
            int r3 = r8.mo6755b(r7)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
        L_0x004b:
            if (r2 >= r3) goto L_0x0064
            java.lang.Object r5 = r8.mo6754a(r7, r2)
            if (r5 != r10) goto L_0x0054
            goto L_0x0061
        L_0x0054:
            r9.mo6752a(r5, r4)
            boolean r6 = m8576h(r12, r11, r4, r0)
            if (r6 == 0) goto L_0x0061
            r0.set(r4)
            r1 = r5
        L_0x0061:
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p027c.p077k.p079b.C2026b.m8571c(java.lang.Object, c.k.b.b$b, c.k.b.b$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    /* renamed from: d */
    public static <L, T> T m8572d(L l, C2028b<L, T> bVar, C2027a<T> aVar, T t, int i, boolean z, boolean z2) {
        int b = bVar.mo6755b(l);
        ArrayList arrayList = new ArrayList(b);
        for (int i2 = 0; i2 < b; i2++) {
            arrayList.add(bVar.mo6754a(l, i2));
        }
        Collections.sort(arrayList, new C2029c(z, aVar));
        if (i == 1) {
            return m8574f(t, arrayList, z2);
        }
        if (i == 2) {
            return m8573e(t, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    /* renamed from: e */
    private static <T> T m8573e(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (t == null ? -1 : arrayList.lastIndexOf(t)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: f */
    private static <T> T m8574f(T t, ArrayList<T> arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (t == null ? size : arrayList.indexOf(t)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: g */
    private static int m8575g(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: h */
    private static boolean m8576h(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!m8577i(rect, rect2, i)) {
            return false;
        }
        if (m8577i(rect, rect3, i) && !m8569a(i, rect, rect2, rect3)) {
            return !m8569a(i, rect, rect3, rect2) && m8575g(m8579k(i, rect, rect2), m8583o(i, rect, rect2)) < m8575g(m8579k(i, rect, rect3), m8583o(i, rect, rect3));
        }
        return true;
    }

    /* renamed from: i */
    private static boolean m8577i(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* renamed from: j */
    private static boolean m8578j(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        }
        if (i == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i == 66) {
            return rect.right <= rect2.left;
        }
        if (i == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: k */
    private static int m8579k(int i, Rect rect, Rect rect2) {
        return Math.max(0, m8580l(i, rect, rect2));
    }

    /* renamed from: l */
    private static int m8580l(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: m */
    private static int m8581m(int i, Rect rect, Rect rect2) {
        return Math.max(1, m8582n(i, rect, rect2));
    }

    /* renamed from: n */
    private static int m8582n(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* renamed from: o */
    private static int m8583o(int i, Rect rect, Rect rect2) {
        int height;
        int i2;
        int height2;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            height = rect.left + (rect.width() / 2);
            i2 = rect2.left;
            height2 = rect2.width();
            return Math.abs(height - (i2 + (height2 / 2)));
        }
        height = rect.top + (rect.height() / 2);
        i2 = rect2.top;
        height2 = rect2.height();
        return Math.abs(height - (i2 + (height2 / 2)));
    }
}
