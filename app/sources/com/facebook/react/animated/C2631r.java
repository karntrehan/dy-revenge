package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.react.animated.r */
class C2631r extends C2611b {

    /* renamed from: e */
    private final C2621l f7749e;

    /* renamed from: f */
    private final List<C2635d> f7750f;

    /* renamed from: com.facebook.react.animated.r$b */
    private class C2633b extends C2635d {

        /* renamed from: c */
        public int f7751c;

        private C2633b() {
            super();
        }
    }

    /* renamed from: com.facebook.react.animated.r$c */
    private class C2634c extends C2635d {

        /* renamed from: c */
        public double f7753c;

        private C2634c() {
            super();
        }
    }

    /* renamed from: com.facebook.react.animated.r$d */
    private class C2635d {

        /* renamed from: a */
        public String f7755a;

        private C2635d() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.facebook.react.animated.r$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.facebook.react.animated.r$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.facebook.react.animated.r$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.facebook.react.animated.r$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C2631r(com.facebook.react.bridge.ReadableMap r6, com.facebook.react.animated.C2621l r7) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r0 = "transforms"
            com.facebook.react.bridge.ReadableArray r6 = r6.getArray(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r6.size()
            r0.<init>(r1)
            r5.f7750f = r0
            r0 = 0
        L_0x0015:
            int r1 = r6.size()
            if (r0 >= r1) goto L_0x005b
            com.facebook.react.bridge.ReadableMap r1 = r6.getMap(r0)
            java.lang.String r2 = "property"
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r3 = "type"
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r4 = "animated"
            boolean r3 = r3.equals(r4)
            r4 = 0
            if (r3 == 0) goto L_0x0044
            com.facebook.react.animated.r$b r3 = new com.facebook.react.animated.r$b
            r3.<init>()
            r3.f7755a = r2
            java.lang.String r2 = "nodeTag"
            int r1 = r1.getInt(r2)
            r3.f7751c = r1
            goto L_0x0053
        L_0x0044:
            com.facebook.react.animated.r$c r3 = new com.facebook.react.animated.r$c
            r3.<init>()
            r3.f7755a = r2
            java.lang.String r2 = "value"
            double r1 = r1.getDouble(r2)
            r3.f7753c = r1
        L_0x0053:
            java.util.List<com.facebook.react.animated.r$d> r1 = r5.f7750f
            r1.add(r3)
            int r0 = r0 + 1
            goto L_0x0015
        L_0x005b:
            r5.f7749e = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.animated.C2631r.<init>(com.facebook.react.bridge.ReadableMap, com.facebook.react.animated.l):void");
    }

    /* renamed from: d */
    public String mo8421d() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransformAnimatedNode[");
        sb.append(this.f7660d);
        sb.append("]: mTransformConfigs: ");
        List<C2635d> list = this.f7750f;
        sb.append(list != null ? list.toString() : "null");
        return sb.toString();
    }

    /* renamed from: h */
    public void mo8460h(JavaOnlyMap javaOnlyMap) {
        double d;
        ArrayList arrayList = new ArrayList(this.f7750f.size());
        for (C2635d next : this.f7750f) {
            if (next instanceof C2633b) {
                C2611b o = this.f7749e.mo8442o(((C2633b) next).f7751c);
                if (o == null) {
                    throw new IllegalArgumentException("Mapped style node does not exists");
                } else if (o instanceof C2636s) {
                    d = ((C2636s) o).mo8464k();
                } else {
                    throw new IllegalArgumentException("Unsupported type of node used as a transform child node " + o.getClass());
                }
            } else {
                d = ((C2634c) next).f7753c;
            }
            arrayList.add(JavaOnlyMap.m10886of(next.f7755a, Double.valueOf(d)));
        }
        javaOnlyMap.putArray("transform", JavaOnlyArray.from(arrayList));
    }
}
