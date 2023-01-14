package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.C9911d;
import com.swmansion.reanimated.C9921h;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: com.swmansion.reanimated.nodes.g */
public class C9959g extends C9965m {

    /* renamed from: a */
    private static final NumberFormat f26661a;

    /* renamed from: b */
    private final int[] f26662b;

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        f26661a = instance;
        instance.setMinimumFractionDigits(0);
        instance.setGroupingUsed(false);
    }

    public C9959g(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.f26662b = C9921h.m33809a(readableMap.getArray("input"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String evaluate() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int[] iArr = this.f26662b;
            if (i >= iArr.length) {
                return sb.toString();
            }
            Object value = this.mNodesManager.mo24809r(iArr[i], C9965m.class).value();
            if (value instanceof Double) {
                value = f26661a.format((Double) value);
            }
            sb.append(value);
            i++;
        }
    }
}
