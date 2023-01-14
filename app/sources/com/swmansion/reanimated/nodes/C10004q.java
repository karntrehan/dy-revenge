package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.C2962f0;
import com.facebook.react.uimanager.C3041s0;
import com.swmansion.reanimated.C9911d;
import com.swmansion.reanimated.C9921h;
import java.util.Map;

/* renamed from: com.swmansion.reanimated.nodes.q */
public class C10004q extends C9965m implements C9962j {

    /* renamed from: a */
    private final Map<String, Integer> f26706a;

    /* renamed from: b */
    private final C3041s0 f26707b;

    /* renamed from: c */
    private int f26708c = -1;

    /* renamed from: d */
    private final JavaOnlyMap f26709d;

    /* renamed from: e */
    private final C2962f0 f26710e;

    /* renamed from: com.swmansion.reanimated.nodes.q$a */
    static /* synthetic */ class C10005a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26711a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.react.bridge.ReadableType[] r0 = com.facebook.react.bridge.ReadableType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26711a = r0
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Number     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26711a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.String     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26711a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.react.bridge.ReadableType r1 = com.facebook.react.bridge.ReadableType.Array     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.swmansion.reanimated.nodes.C10004q.C10005a.<clinit>():void");
        }
    }

    public C10004q(int i, ReadableMap readableMap, C9911d dVar, C3041s0 s0Var) {
        super(i, readableMap, dVar);
        this.f26706a = C9921h.m33810b(readableMap.getMap("props"));
        this.f26707b = s0Var;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        this.f26709d = javaOnlyMap;
        this.f26710e = new C2962f0(javaOnlyMap);
    }

    /* renamed from: b */
    private static void m33950b(WritableMap writableMap, String str, Object obj) {
        double doubleValue;
        if (obj == null) {
            writableMap.putNull(str);
            return;
        }
        if (obj instanceof Double) {
            doubleValue = ((Double) obj).doubleValue();
        } else if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        } else if (obj instanceof Number) {
            doubleValue = ((Number) obj).doubleValue();
        } else if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
            return;
        } else if (obj instanceof WritableArray) {
            writableMap.putArray(str, (WritableArray) obj);
            return;
        } else if (obj instanceof WritableMap) {
            writableMap.putMap(str, (WritableMap) obj);
            return;
        } else {
            throw new IllegalStateException("Unknown type of animated value");
        }
        writableMap.putDouble(str, doubleValue);
    }

    /* renamed from: a */
    public void mo24854a() {
        if (this.f26708c != -1) {
            value();
        }
    }

    /* renamed from: c */
    public void mo24880c(int i) {
        this.f26708c = i;
        dangerouslyRescheduleEvaluate();
    }

    /* renamed from: d */
    public void mo24881d(int i) {
        this.f26708c = -1;
    }

    /* access modifiers changed from: protected */
    public Double evaluate() {
        boolean z;
        boolean z2;
        boolean z3;
        WritableMap writableMap;
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        for (Map.Entry next : this.f26706a.entrySet()) {
            C9965m r = this.mNodesManager.mo24809r(((Integer) next.getValue()).intValue(), C9965m.class);
            if (r instanceof C10007s) {
                WritableMap writableMap2 = (WritableMap) r.value();
                ReadableMapKeySetIterator keySetIterator = writableMap2.keySetIterator();
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    if (this.mNodesManager.f26525t.contains(nextKey)) {
                        writableMap = this.f26709d;
                        z = z6;
                        z2 = z5;
                        z3 = true;
                    } else if (this.mNodesManager.f26526u.contains(nextKey)) {
                        z3 = z4;
                        z = z6;
                        z2 = true;
                        writableMap = createMap2;
                    } else {
                        z2 = z5;
                        z = true;
                        z3 = z4;
                        writableMap = createMap;
                    }
                    ReadableType type = writableMap2.getType(nextKey);
                    int i = C10005a.f26711a[type.ordinal()];
                    if (i == 1) {
                        writableMap.putDouble(nextKey, writableMap2.getDouble(nextKey));
                    } else if (i == 2) {
                        writableMap.putString(nextKey, writableMap2.getString(nextKey));
                    } else if (i == 3) {
                        writableMap.putArray(nextKey, (WritableArray) writableMap2.getArray(nextKey));
                    } else {
                        throw new IllegalArgumentException("Unexpected type " + type);
                    }
                    z4 = z3;
                    z5 = z2;
                    z6 = z;
                }
                continue;
            } else {
                String str = (String) next.getKey();
                Object value = r.value();
                if (this.mNodesManager.f26525t.contains(str)) {
                    m33950b(this.f26709d, str, value);
                    z4 = true;
                } else {
                    m33950b(createMap2, str, value);
                    z5 = true;
                }
            }
        }
        int i2 = this.f26708c;
        if (i2 != -1) {
            if (z4) {
                this.f26707b.mo9835a0(i2, this.f26710e);
            }
            if (z5) {
                this.mNodesManager.mo24808q(this.f26708c, createMap2, false);
            }
            if (z6) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putInt("viewTag", this.f26708c);
                createMap3.putMap("props", createMap);
                this.mNodesManager.mo24795L("onReanimatedPropsChange", createMap3);
            }
        }
        return C9965m.ZERO;
    }
}
