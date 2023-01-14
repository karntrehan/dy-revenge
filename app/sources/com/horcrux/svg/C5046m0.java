package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.m0 */
enum C5046m0 {
    Normal("normal"),
    Bold("bold"),
    w100("100"),
    w200("200"),
    w300("300"),
    w400("400"),
    w500("500"),
    w600("600"),
    w700("700"),
    w800("800"),
    w900("900"),
    Bolder("bolder"),
    Lighter("lighter");
    

    /* renamed from: A */
    private static final Map<String, C5046m0> f14194A = null;

    /* renamed from: C */
    private final String f14209C;

    static {
        int i;
        f14194A = new HashMap();
        for (C5046m0 m0Var : values()) {
            f14194A.put(m0Var.f14209C, m0Var);
        }
    }

    private C5046m0(String str) {
        this.f14209C = str;
    }

    /* renamed from: g */
    static C5046m0 m19087g(String str) {
        return f14194A.get(str);
    }

    /* renamed from: h */
    static boolean m19088h(String str) {
        return f14194A.containsKey(str);
    }

    public String toString() {
        return this.f14209C;
    }
}
