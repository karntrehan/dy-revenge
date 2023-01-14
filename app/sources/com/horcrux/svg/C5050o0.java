package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.o0 */
enum C5050o0 {
    None("none"),
    Underline("underline"),
    Overline("overline"),
    LineThrough("line-through"),
    Blink("blink");
    

    /* renamed from: s */
    private static final Map<String, C5050o0> f14231s = null;

    /* renamed from: u */
    private final String f14233u;

    static {
        int i;
        f14231s = new HashMap();
        for (C5050o0 o0Var : values()) {
            f14231s.put(o0Var.f14233u, o0Var);
        }
    }

    private C5050o0(String str) {
        this.f14233u = str;
    }

    /* renamed from: g */
    static C5050o0 m19093g(String str) {
        Map<String, C5050o0> map = f14231s;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    public String toString() {
        return this.f14233u;
    }
}
