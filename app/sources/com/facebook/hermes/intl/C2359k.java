package com.facebook.hermes.intl;

import com.facebook.hermes.intl.C2356j;
import com.facebook.hermes.intl.C2368r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

/* renamed from: com.facebook.hermes.intl.k */
public class C2359k {
    /* renamed from: a */
    private static void m9750a(String str, C2368r.C2369a aVar) {
        ArrayList<String> arrayList = aVar.f7068d;
        if (arrayList != null) {
            int binarySearch = Collections.binarySearch(arrayList, str);
            if (binarySearch < 0) {
                aVar.f7068d.add((binarySearch * -1) - 1, str);
                return;
            }
            throw new C2354h("Duplicate variant");
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        aVar.f7068d = arrayList2;
        arrayList2.add(str);
    }

    /* renamed from: b */
    static String m9751b(String str) {
        return C2362m.m9773b(str).mo7932a();
    }

    /* renamed from: c */
    static boolean m9752c(CharSequence charSequence, C2356j jVar, C2356j.C2357a aVar, boolean z, C2368r rVar) {
        if (z && aVar.mo8007d()) {
            m9759j(charSequence, jVar, aVar, rVar);
            return true;
        } else if (!aVar.mo8004a()) {
            return false;
        } else {
            if (!z) {
                m9753d(charSequence, aVar, jVar, rVar);
                return true;
            }
            throw new C2354h(String.format("Extension singletons in transformed extension language tag: %s", new Object[]{charSequence}));
        }
    }

    /* renamed from: d */
    static void m9753d(CharSequence charSequence, C2356j.C2357a aVar, C2356j jVar, C2368r rVar) {
        if (jVar.mo8002a()) {
            char charAt = aVar.toString().charAt(0);
            if (charAt == 'u') {
                m9761l(charSequence, jVar, rVar);
            } else if (charAt == 't') {
                m9760k(charSequence, jVar, rVar);
            } else if (charAt == 'x') {
                m9758i(charSequence, jVar, rVar);
            } else {
                m9757h(charSequence, jVar, rVar, charAt);
            }
        } else {
            throw new C2354h("Extension sequence expected.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062 A[Catch:{ b -> 0x00a2 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m9754e(java.lang.CharSequence r5, com.facebook.hermes.intl.C2356j r6, com.facebook.hermes.intl.C2356j.C2357a r7, boolean r8, com.facebook.hermes.intl.C2368r r9) {
        /*
            com.facebook.hermes.intl.r$a r0 = new com.facebook.hermes.intl.r$a
            r0.<init>()
            if (r8 == 0) goto L_0x000a
            r9.f7061d = r0
            goto L_0x000c
        L_0x000a:
            r9.f7058a = r0
        L_0x000c:
            r1 = 0
            r2 = 1
            boolean r3 = r7.mo8012i()     // Catch:{ b -> 0x00a2 }
            r4 = 2
            if (r3 == 0) goto L_0x008c
            java.lang.String r7 = r7.mo8016m()     // Catch:{ b -> 0x00a2 }
            r0.f7065a = r7     // Catch:{ b -> 0x00a2 }
            boolean r7 = r6.mo8002a()     // Catch:{ b -> 0x00a2 }
            if (r7 != 0) goto L_0x0022
            return
        L_0x0022:
            com.facebook.hermes.intl.j$a r7 = r6.mo8003c()     // Catch:{ b -> 0x00a2 }
            boolean r3 = m9752c(r5, r6, r7, r8, r9)     // Catch:{ b -> 0x00a2 }
            if (r3 == 0) goto L_0x002d
            return
        L_0x002d:
            boolean r3 = r7.mo8014k()     // Catch:{ b -> 0x00a2 }
            if (r3 == 0) goto L_0x0044
            java.lang.String r7 = r7.mo8017n()     // Catch:{ b -> 0x00a2 }
            r0.f7066b = r7     // Catch:{ b -> 0x00a2 }
            boolean r7 = r6.mo8002a()     // Catch:{ b -> 0x00a2 }
            if (r7 != 0) goto L_0x0040
            return
        L_0x0040:
            com.facebook.hermes.intl.j$a r7 = r6.mo8003c()     // Catch:{ b -> 0x00a2 }
        L_0x0044:
            boolean r3 = r7.mo8013j()     // Catch:{ b -> 0x00a2 }
            if (r3 == 0) goto L_0x005b
            java.lang.String r7 = r7.mo8018o()     // Catch:{ b -> 0x00a2 }
            r0.f7067c = r7     // Catch:{ b -> 0x00a2 }
            boolean r7 = r6.mo8002a()     // Catch:{ b -> 0x00a2 }
            if (r7 != 0) goto L_0x0057
            return
        L_0x0057:
            com.facebook.hermes.intl.j$a r7 = r6.mo8003c()     // Catch:{ b -> 0x00a2 }
        L_0x005b:
            boolean r3 = m9752c(r5, r6, r7, r8, r9)     // Catch:{ b -> 0x00a2 }
            if (r3 == 0) goto L_0x0062
            return
        L_0x0062:
            boolean r3 = r7.mo8015l()     // Catch:{ b -> 0x00a2 }
            if (r3 == 0) goto L_0x0076
            java.lang.String r7 = r7.toString()     // Catch:{ b -> 0x00a2 }
            m9750a(r7, r0)     // Catch:{ b -> 0x00a2 }
            boolean r7 = r6.mo8002a()     // Catch:{ b -> 0x00a2 }
            if (r7 != 0) goto L_0x0057
            return
        L_0x0076:
            com.facebook.hermes.intl.h r6 = new com.facebook.hermes.intl.h     // Catch:{ b -> 0x00a2 }
            java.lang.String r8 = "Unknown token [%s] found in locale id: %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ b -> 0x00a2 }
            java.lang.String r7 = r7.toString()     // Catch:{ b -> 0x00a2 }
            r9[r1] = r7     // Catch:{ b -> 0x00a2 }
            r9[r2] = r5     // Catch:{ b -> 0x00a2 }
            java.lang.String r7 = java.lang.String.format(r8, r9)     // Catch:{ b -> 0x00a2 }
            r6.<init>(r7)     // Catch:{ b -> 0x00a2 }
            throw r6     // Catch:{ b -> 0x00a2 }
        L_0x008c:
            com.facebook.hermes.intl.h r6 = new com.facebook.hermes.intl.h     // Catch:{ b -> 0x00a2 }
            java.lang.String r8 = "Language subtag expected at %s: %s"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ b -> 0x00a2 }
            java.lang.String r7 = r7.toString()     // Catch:{ b -> 0x00a2 }
            r9[r1] = r7     // Catch:{ b -> 0x00a2 }
            r9[r2] = r5     // Catch:{ b -> 0x00a2 }
            java.lang.String r7 = java.lang.String.format(r8, r9)     // Catch:{ b -> 0x00a2 }
            r6.<init>(r7)     // Catch:{ b -> 0x00a2 }
            throw r6     // Catch:{ b -> 0x00a2 }
        L_0x00a2:
            com.facebook.hermes.intl.h r6 = new com.facebook.hermes.intl.h
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r1] = r5
            java.lang.String r5 = "Locale Identifier subtag iteration failed: %s"
            java.lang.String r5 = java.lang.String.format(r5, r7)
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.hermes.intl.C2359k.m9754e(java.lang.CharSequence, com.facebook.hermes.intl.j, com.facebook.hermes.intl.j$a, boolean, com.facebook.hermes.intl.r):void");
    }

    /* renamed from: f */
    static C2368r m9755f(String str) {
        int binarySearch;
        String[] strArr = C2355i.f7021a;
        if (strArr != null && (binarySearch = Arrays.binarySearch(strArr, str.toString())) >= 0) {
            str = C2355i.f7022b[binarySearch];
        }
        String lowerCase = str.toLowerCase();
        return m9756g(lowerCase, new C2356j(lowerCase));
    }

    /* renamed from: g */
    static C2368r m9756g(String str, C2356j jVar) {
        C2368r rVar = new C2368r();
        try {
            if (jVar.mo8002a()) {
                m9754e(str, jVar, jVar.mo8003c(), false, rVar);
                return rVar;
            }
            throw new C2354h(String.format("Language subtag not found: %s", new Object[]{str}));
        } catch (C2356j.C2358b unused) {
            throw new C2354h(String.format("Locale Identifier subtag iteration failed: %s", new Object[]{str}));
        }
    }

    /* renamed from: h */
    static void m9757h(CharSequence charSequence, C2356j jVar, C2368r rVar, char c) {
        if (jVar.mo8002a()) {
            C2356j.C2357a c2 = jVar.mo8003c();
            if (rVar.f7063f == null) {
                rVar.f7063f = new TreeMap<>();
            }
            ArrayList arrayList = new ArrayList();
            rVar.f7063f.put(new Character(c), arrayList);
            while (c2.mo8005b()) {
                arrayList.add(c2.toString());
                if (jVar.mo8002a()) {
                    c2 = jVar.mo8003c();
                } else {
                    return;
                }
            }
            if (c2.mo8004a()) {
                m9753d(charSequence, c2, jVar, rVar);
                return;
            }
            throw new C2354h("Malformed sequence expected.");
        }
        throw new C2354h("Extension sequence expected.");
    }

    /* renamed from: i */
    static void m9758i(CharSequence charSequence, C2356j jVar, C2368r rVar) {
        if (jVar.mo8002a()) {
            C2356j.C2357a c = jVar.mo8003c();
            if (rVar.f7064g == null) {
                rVar.f7064g = new ArrayList<>();
            }
            while (c.mo8006c()) {
                rVar.f7064g.add(c.toString());
                if (jVar.mo8002a()) {
                    c = jVar.mo8003c();
                } else {
                    return;
                }
            }
            throw new C2354h("Tokens are not expected after pu extension.");
        }
        throw new C2354h("Extension sequence expected.");
    }

    /* renamed from: j */
    static void m9759j(CharSequence charSequence, C2356j jVar, C2356j.C2357a aVar, C2368r rVar) {
        if (aVar.mo8007d()) {
            TreeMap<String, ArrayList<String>> treeMap = rVar.f7062e;
            if (treeMap == null) {
                if (treeMap == null) {
                    rVar.f7062e = new TreeMap<>();
                }
                do {
                    String aVar2 = aVar.toString();
                    ArrayList arrayList = new ArrayList();
                    rVar.f7062e.put(aVar2, arrayList);
                    if (jVar.mo8002a()) {
                        while (true) {
                            aVar = jVar.mo8003c();
                            if (!aVar.mo8008e()) {
                                break;
                            }
                            arrayList.add(aVar.toString());
                            if (!jVar.mo8002a()) {
                                return;
                            }
                        }
                    } else {
                        throw new C2354h(String.format("Malformated transformed key in : %s", new Object[]{charSequence}));
                    }
                } while (aVar.mo8007d());
                break;
            } else {
                throw new C2354h(String.format("Duplicate transformed extension sequence in [%s]", new Object[]{charSequence}));
            }
        }
        if (aVar.mo8004a()) {
            m9753d(charSequence, aVar, jVar, rVar);
            return;
        }
        throw new C2354h("Malformed extension sequence.");
    }

    /* renamed from: k */
    static void m9760k(CharSequence charSequence, C2356j jVar, C2368r rVar) {
        if (jVar.mo8002a()) {
            C2356j.C2357a c = jVar.mo8003c();
            if (c.mo8012i()) {
                m9754e(charSequence, jVar, c, true, rVar);
            } else if (c.mo8007d()) {
                m9759j(charSequence, jVar, c, rVar);
            } else {
                throw new C2354h(String.format("Unexpected token [%s] in transformed extension sequence [%s]", new Object[]{c.toString(), charSequence}));
            }
        } else {
            throw new C2354h("Extension sequence expected.");
        }
    }

    /* renamed from: l */
    static void m9761l(CharSequence charSequence, C2356j jVar, C2368r rVar) {
        if (jVar.mo8002a()) {
            C2356j.C2357a c = jVar.mo8003c();
            if (rVar.f7059b == null && rVar.f7060c == null) {
                while (c.mo8009f()) {
                    if (rVar.f7059b == null) {
                        rVar.f7059b = new ArrayList<>();
                    }
                    rVar.f7059b.add(c.toString());
                    if (jVar.mo8002a()) {
                        c = jVar.mo8003c();
                    } else {
                        return;
                    }
                }
                if (c.mo8010g()) {
                    if (rVar.f7060c == null) {
                        rVar.f7060c = new TreeMap<>();
                    }
                    do {
                        String aVar = c.toString();
                        ArrayList arrayList = new ArrayList();
                        rVar.f7060c.put(aVar, arrayList);
                        if (jVar.mo8002a()) {
                            while (true) {
                                c = jVar.mo8003c();
                                if (!c.mo8011h()) {
                                    break;
                                }
                                arrayList.add(c.toString());
                                if (!jVar.mo8002a()) {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } while (c.mo8010g());
                    break;
                }
                if (c.mo8004a()) {
                    m9753d(charSequence, c, jVar, rVar);
                    return;
                }
                throw new C2354h("Malformed sequence expected.");
            }
            throw new C2354h(String.format("Duplicate unicode extension sequence in [%s]", new Object[]{charSequence}));
        }
        throw new C2354h("Extension sequence expected.");
    }

    /* renamed from: m */
    public static void m9762m(StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        if (C2355i.f7023c != null) {
            if (stringBuffer.length() == 2) {
                strArr6 = C2355i.f7023c;
                strArr5 = C2355i.f7024d;
                strArr4 = C2355i.f7027g;
                strArr3 = C2355i.f7028h;
                strArr2 = C2355i.f7029i;
                strArr = C2355i.f7030j;
            } else {
                strArr6 = C2355i.f7025e;
                strArr5 = C2355i.f7026f;
                strArr4 = C2355i.f7031k;
                strArr3 = C2355i.f7032l;
                strArr2 = C2355i.f7033m;
                strArr = C2355i.f7034n;
            }
            int binarySearch = Arrays.binarySearch(strArr6, stringBuffer.toString());
            if (binarySearch >= 0) {
                stringBuffer.delete(0, stringBuffer.length());
                stringBuffer.append(strArr5[binarySearch]);
                return;
            }
            int binarySearch2 = Arrays.binarySearch(strArr4, stringBuffer.toString());
            if (binarySearch2 >= 0) {
                String str = strArr3[binarySearch2];
                String str2 = strArr2[binarySearch2];
                String str3 = strArr[binarySearch2];
                stringBuffer.delete(0, stringBuffer.length());
                stringBuffer.append(str);
                if (stringBuffer2.length() == 0 && str2 != null) {
                    stringBuffer2.append(str2);
                }
                if (stringBuffer3.length() == 0 && str3 != null) {
                    stringBuffer3.append(str3);
                }
            }
        }
    }

    /* renamed from: n */
    public static String m9763n(StringBuffer stringBuffer) {
        if (C2355i.f7035o == null) {
            return stringBuffer.toString();
        }
        if (stringBuffer.length() == 2) {
            int binarySearch = Arrays.binarySearch(C2355i.f7035o, stringBuffer.toString());
            return binarySearch >= 0 ? C2355i.f7036p[binarySearch] : stringBuffer.toString();
        }
        int binarySearch2 = Arrays.binarySearch(C2355i.f7037q, stringBuffer.toString());
        return binarySearch2 >= 0 ? C2355i.f7038r[binarySearch2] : stringBuffer.toString();
    }
}
