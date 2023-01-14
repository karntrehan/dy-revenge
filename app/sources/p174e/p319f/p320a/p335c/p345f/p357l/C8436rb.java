package p174e.p319f.p320a.p335c.p345f.p357l;

import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.l.rb */
final class C8436rb {
    /* renamed from: a */
    static int m28982a(byte[] bArr, int i, C8418qb qbVar) {
        int j = m28991j(bArr, i, qbVar);
        int i2 = qbVar.f22953a;
        if (i2 < 0) {
            throw C8366nd.m28887d();
        } else if (i2 > bArr.length - j) {
            throw C8366nd.m28889g();
        } else if (i2 == 0) {
            qbVar.f22955c = C8177dc.f22199f;
            return j;
        } else {
            qbVar.f22955c = C8177dc.m28419A(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: b */
    static int m28983b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: c */
    static int m28984c(C8511ve veVar, byte[] bArr, int i, int i2, int i3, C8418qb qbVar) {
        C8331le leVar = (C8331le) veVar;
        Object c = leVar.mo21977c();
        int D = leVar.mo21974D(c, bArr, i, i2, i3, qbVar);
        leVar.mo21976b(c);
        qbVar.f22955c = c;
        return D;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m28985d(p174e.p319f.p320a.p335c.p345f.p357l.C8511ve r6, byte[] r7, int r8, int r9, p174e.p319f.p320a.p335c.p345f.p357l.C8418qb r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = m28992k(r8, r7, r0, r10)
            int r8 = r10.f22953a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.mo21977c()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.mo21981g(r1, r2, r3, r4, r5)
            r6.mo21976b(r9)
            r10.f22955c = r9
            return r8
        L_0x0025:
            e.f.a.c.f.l.nd r6 = p174e.p319f.p320a.p335c.p345f.p357l.C8366nd.m28889g()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p319f.p320a.p335c.p345f.p357l.C8436rb.m28985d(e.f.a.c.f.l.ve, byte[], int, int, e.f.a.c.f.l.qb):int");
    }

    /* renamed from: e */
    static int m28986e(C8511ve<?> veVar, int i, byte[] bArr, int i2, int i3, C8292jd<?> jdVar, C8418qb qbVar) {
        int d = m28985d(veVar, bArr, i2, i3, qbVar);
        while (true) {
            jdVar.add(qbVar.f22955c);
            if (d >= i3) {
                break;
            }
            int j = m28991j(bArr, d, qbVar);
            if (i != qbVar.f22953a) {
                break;
            }
            d = m28985d(veVar, bArr, j, i3, qbVar);
        }
        return d;
    }

    /* renamed from: f */
    static int m28987f(byte[] bArr, int i, C8292jd<?> jdVar, C8418qb qbVar) {
        C8216fd fdVar = (C8216fd) jdVar;
        int j = m28991j(bArr, i, qbVar);
        int i2 = qbVar.f22953a + j;
        while (j < i2) {
            j = m28991j(bArr, j, qbVar);
            fdVar.mo21796h(qbVar.f22953a);
        }
        if (j == i2) {
            return j;
        }
        throw C8366nd.m28889g();
    }

    /* renamed from: g */
    static int m28988g(byte[] bArr, int i, C8418qb qbVar) {
        int j = m28991j(bArr, i, qbVar);
        int i2 = qbVar.f22953a;
        if (i2 < 0) {
            throw C8366nd.m28887d();
        } else if (i2 == 0) {
            qbVar.f22955c = HttpUrl.FRAGMENT_ENCODE_SET;
            return j;
        } else {
            qbVar.f22955c = new String(bArr, j, i2, C8311kd.f22725a);
            return j + i2;
        }
    }

    /* renamed from: h */
    static int m28989h(byte[] bArr, int i, C8418qb qbVar) {
        int j = m28991j(bArr, i, qbVar);
        int i2 = qbVar.f22953a;
        if (i2 < 0) {
            throw C8366nd.m28887d();
        } else if (i2 == 0) {
            qbVar.f22955c = HttpUrl.FRAGMENT_ENCODE_SET;
            return j;
        } else {
            qbVar.f22955c = C8584zf.m29352d(bArr, j, i2);
            return j + i2;
        }
    }

    /* renamed from: i */
    static int m28990i(int i, byte[] bArr, int i2, int i3, C8313kf kfVar, C8418qb qbVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int m = m28994m(bArr, i2, qbVar);
                kfVar.mo21933h(i, Long.valueOf(qbVar.f22954b));
                return m;
            } else if (i4 == 1) {
                kfVar.mo21933h(i, Long.valueOf(m28996o(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int j = m28991j(bArr, i2, qbVar);
                int i5 = qbVar.f22953a;
                if (i5 < 0) {
                    throw C8366nd.m28887d();
                } else if (i5 <= bArr.length - j) {
                    kfVar.mo21933h(i, i5 == 0 ? C8177dc.f22199f : C8177dc.m28419A(bArr, j, i5));
                    return j + i5;
                } else {
                    throw C8366nd.m28889g();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                C8313kf e = C8313kf.m28713e();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int j2 = m28991j(bArr, i2, qbVar);
                    int i8 = qbVar.f22953a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = j2;
                        break;
                    }
                    int i9 = m28990i(i7, bArr, j2, i3, e, qbVar);
                    i7 = i8;
                    i2 = i9;
                }
                if (i2 > i3 || i7 != i6) {
                    throw C8366nd.m28888e();
                }
                kfVar.mo21933h(i, e);
                return i2;
            } else if (i4 == 5) {
                kfVar.mo21933h(i, Integer.valueOf(m28983b(bArr, i2)));
                return i2 + 4;
            } else {
                throw C8366nd.m28885b();
            }
        } else {
            throw C8366nd.m28885b();
        }
    }

    /* renamed from: j */
    static int m28991j(byte[] bArr, int i, C8418qb qbVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m28992k(b, bArr, i2, qbVar);
        }
        qbVar.f22953a = b;
        return i2;
    }

    /* renamed from: k */
    static int m28992k(int i, byte[] bArr, int i2, C8418qb qbVar) {
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
                                qbVar.f22953a = i9;
                                return i10;
                            }
                        }
                    }
                }
            }
            qbVar.f22953a = i7 | i3;
            return i8;
        }
        qbVar.f22953a = i5 | i4;
        return i6;
    }

    /* renamed from: l */
    static int m28993l(int i, byte[] bArr, int i2, int i3, C8292jd<?> jdVar, C8418qb qbVar) {
        C8216fd fdVar = (C8216fd) jdVar;
        int j = m28991j(bArr, i2, qbVar);
        while (true) {
            fdVar.mo21796h(qbVar.f22953a);
            if (j >= i3) {
                break;
            }
            int j2 = m28991j(bArr, j, qbVar);
            if (i != qbVar.f22953a) {
                break;
            }
            j = m28991j(bArr, j2, qbVar);
        }
        return j;
    }

    /* renamed from: m */
    static int m28994m(byte[] bArr, int i, C8418qb qbVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j < 0) {
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
            qbVar.f22954b = j2;
            return i3;
        }
        qbVar.f22954b = j;
        return i2;
    }

    /* renamed from: n */
    static int m28995n(int i, byte[] bArr, int i2, int i3, C8418qb qbVar) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return m28994m(bArr, i2, qbVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return m28991j(bArr, i2, qbVar) + qbVar.f22953a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = m28991j(bArr, i2, qbVar);
                    i6 = qbVar.f22953a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = m28995n(i6, bArr, i2, i3, qbVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C8366nd.m28888e();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C8366nd.m28885b();
            }
        } else {
            throw C8366nd.m28885b();
        }
    }

    /* renamed from: o */
    static long m28996o(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
