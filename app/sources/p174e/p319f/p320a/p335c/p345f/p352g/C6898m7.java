package p174e.p319f.p320a.p335c.p345f.p352g;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.m7 */
final class C6898m7 {
    /* renamed from: a */
    static int m26126a(byte[] bArr, int i, C6882l7 l7Var) {
        int j = m26135j(bArr, i, l7Var);
        int i2 = l7Var.f18612a;
        if (i2 < 0) {
            throw C6852j9.m25978d();
        } else if (i2 > bArr.length - j) {
            throw C6852j9.m25980f();
        } else if (i2 == 0) {
            l7Var.f18614c = C7106z7.f19078f;
            return j;
        } else {
            l7Var.f18614c = C7106z7.m27074A(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m26127b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m26128c(C6981ra raVar, byte[] bArr, int i, int i2, int i3, C6882l7 l7Var) {
        C6853ja jaVar = (C6853ja) raVar;
        Object c = jaVar.mo19894c();
        int D = jaVar.mo19891D(c, bArr, i, i2, i3, l7Var);
        jaVar.mo19893b(c);
        l7Var.f18614c = c;
        return D;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m26129d(p174e.p319f.p320a.p335c.p345f.p352g.C6981ra r6, byte[] r7, int r8, int r9, p174e.p319f.p320a.p335c.p345f.p352g.C6882l7 r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m26136k(r8, r7, r0, r10)
            int r8 = r10.f18612a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo19894c()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo19899h(r1, r2, r3, r4, r5)
            r6.mo19893b(r9)
            r10.f18614c = r9
            return r8
        L_0x0025:
            e.f.a.c.f.g.j9 r6 = p174e.p319f.p320a.p335c.p345f.p352g.C6852j9.m25980f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p352g.C6898m7.m26129d(e.f.a.c.f.g.ra, byte[], int, int, e.f.a.c.f.g.l7):int");
    }

    /* renamed from: e */
    static int m26130e(C6981ra raVar, int i, byte[] bArr, int i2, int i3, C6804g9 g9Var, C6882l7 l7Var) {
        int d = m26129d(raVar, bArr, i2, i3, l7Var);
        while (true) {
            g9Var.add(l7Var.f18614c);
            if (d >= i3) {
                break;
            }
            int j = m26135j(bArr, d, l7Var);
            if (i != l7Var.f18612a) {
                break;
            }
            d = m26129d(raVar, bArr, j, i3, l7Var);
        }
        return d;
    }

    /* renamed from: f */
    static int m26131f(byte[] bArr, int i, C6804g9 g9Var, C6882l7 l7Var) {
        C6719b9 b9Var = (C6719b9) g9Var;
        int j = m26135j(bArr, i, l7Var);
        int i2 = l7Var.f18612a + j;
        while (j < i2) {
            j = m26135j(bArr, j, l7Var);
            b9Var.mo19575j(l7Var.f18612a);
        }
        if (j == i2) {
            return j;
        }
        throw C6852j9.m25980f();
    }

    /* renamed from: g */
    static int m26132g(byte[] bArr, int i, C6882l7 l7Var) {
        int j = m26135j(bArr, i, l7Var);
        int i2 = l7Var.f18612a;
        if (i2 < 0) {
            throw C6852j9.m25978d();
        } else if (i2 == 0) {
            l7Var.f18614c = HttpUrl.FRAGMENT_ENCODE_SET;
            return j;
        } else {
            l7Var.f18614c = new String(bArr, j, i2, C6820h9.f18520b);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m26133h(byte[] bArr, int i, C6882l7 l7Var) {
        int j = m26135j(bArr, i, l7Var);
        int i2 = l7Var.f18612a;
        if (i2 < 0) {
            throw C6852j9.m25978d();
        } else if (i2 == 0) {
            l7Var.f18614c = HttpUrl.FRAGMENT_ENCODE_SET;
            return j;
        } else {
            l7Var.f18614c = C7110zb.m27092d(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m26134i(int i, byte[] bArr, int i2, int i3, C6870kb kbVar, C6882l7 l7Var) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m26138m(bArr, i2, l7Var);
                kbVar.mo19931h(i, Long.valueOf(l7Var.f18613b));
                return m;
            } else if (i4 == 1) {
                kbVar.mo19931h(i, Long.valueOf(m26139n(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m26135j(bArr, i2, l7Var);
                int i5 = l7Var.f18612a;
                if (i5 < 0) {
                    throw C6852j9.m25978d();
                } else if (i5 <= bArr.length - j) {
                    kbVar.mo19931h(i, i5 == 0 ? C7106z7.f19078f : C7106z7.m27074A(bArr, j, i5));
                    return j + i5;
                } else {
                    throw C6852j9.m25980f();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C6870kb e = C6870kb.m26081e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m26135j(bArr, i2, l7Var);
                    int i8 = l7Var.f18612a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = j2;
                        break;
                    }
                    int i9 = m26134i(i7, bArr, j2, i3, e, l7Var);
                    i7 = i8;
                    i2 = i9;
                }
                if (i2 > i3 || i7 != i6) {
                    throw C6852j9.m25979e();
                }
                kbVar.mo19931h(i, e);
                return i2;
            } else if (i4 == 5) {
                kbVar.mo19931h(i, Integer.valueOf(m26127b(bArr, i2)));
                return i2 + 4;
            } else {
                throw C6852j9.m25976b();
            }
        } else {
            throw C6852j9.m25976b();
        }
    }

    /* renamed from: j */
    static int m26135j(byte[] bArr, int i, C6882l7 l7Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m26136k(b, bArr, i2, l7Var);
        }
        l7Var.f18612a = b;
        return i2;
    }

    /* renamed from: k */
    static int m26136k(int i, byte[] bArr, int i2, C6882l7 l7Var) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] < 0) {
                                i8 = i10;
                            } else {
                                l7Var.f18612a = i9;
                                return i10;
                            }
                        }
                    }
                }
            }
            l7Var.f18612a = i7 | i3;
            return i8;
        }
        l7Var.f18612a = i5 | i4;
        return i6;
    }

    /* renamed from: l */
    static int m26137l(int i, byte[] bArr, int i2, int i3, C6804g9 g9Var, C6882l7 l7Var) {
        C6719b9 b9Var = (C6719b9) g9Var;
        int j = m26135j(bArr, i2, l7Var);
        while (true) {
            b9Var.mo19575j(l7Var.f18612a);
            if (j >= i3) {
                break;
            }
            int j2 = m26135j(bArr, j, l7Var);
            if (i != l7Var.f18612a) {
                break;
            }
            j = m26135j(bArr, j2, l7Var);
        }
        return j;
    }

    /* renamed from: m */
    static int m26138m(byte[] bArr, int i, C6882l7 l7Var) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            l7Var.f18613b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        l7Var.f18613b = j2;
        return i3;
    }

    /* renamed from: n */
    static long m26139n(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
