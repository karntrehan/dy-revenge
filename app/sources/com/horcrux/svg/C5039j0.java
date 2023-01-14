package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.horcrux.svg.j0 */
enum C5039j0 {
    baseline("baseline"),
    textBottom("text-bottom"),
    alphabetic("alphabetic"),
    ideographic("ideographic"),
    middle("middle"),
    central("central"),
    mathematical("mathematical"),
    textTop("text-top"),
    bottom("bottom"),
    center("center"),
    top("top"),
    textBeforeEdge("text-before-edge"),
    textAfterEdge("text-after-edge"),
    beforeEdge("before-edge"),
    afterEdge("after-edge"),
    hanging("hanging");
    

    /* renamed from: D */
    private static final Map<String, C5039j0> f14155D = null;

    /* renamed from: F */
    private final String f14170F;

    static {
        int i;
        f14155D = new HashMap();
        for (C5039j0 j0Var : values()) {
            f14155D.put(j0Var.f14170F, j0Var);
        }
    }

    private C5039j0(String str) {
        this.f14170F = str;
    }

    /* renamed from: g */
    static C5039j0 m19058g(String str) {
        Map<String, C5039j0> map = f14155D;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException("Unknown String Value: " + str);
    }

    public String toString() {
        return this.f14170F;
    }
}
