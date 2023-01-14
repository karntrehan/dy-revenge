package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.p121k1.C2996a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.animated.m */
class C2624m extends C2611b {

    /* renamed from: e */
    private int f7717e = -1;

    /* renamed from: f */
    private final C2621l f7718f;

    /* renamed from: g */
    private final Map<String, Integer> f7719g;

    /* renamed from: h */
    private final JavaOnlyMap f7720h;

    /* renamed from: i */
    private UIManager f7721i;

    C2624m(ReadableMap readableMap, C2621l lVar) {
        ReadableMap map = readableMap.getMap("props");
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.f7719g = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.f7719g.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.f7720h = new JavaOnlyMap();
        this.f7718f = lVar;
    }

    /* renamed from: d */
    public String mo8421d() {
        StringBuilder sb = new StringBuilder();
        sb.append("PropsAnimatedNode[");
        sb.append(this.f7660d);
        sb.append("] connectedViewTag: ");
        sb.append(this.f7717e);
        sb.append(" mPropNodeMapping: ");
        Map<String, Integer> map = this.f7719g;
        String str = "null";
        sb.append(map != null ? map.toString() : str);
        sb.append(" mPropMap: ");
        JavaOnlyMap javaOnlyMap = this.f7720h;
        if (javaOnlyMap != null) {
            str = javaOnlyMap.toString();
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: h */
    public void mo8455h(int i, UIManager uIManager) {
        if (this.f7717e == -1) {
            this.f7717e = i;
            this.f7721i = uIManager;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node " + this.f7660d + " is already attached to a view: " + this.f7717e);
    }

    /* renamed from: i */
    public void mo8456i(int i) {
        int i2 = this.f7717e;
        if (i2 == i || i2 == -1) {
            this.f7717e = -1;
            return;
        }
        throw new JSApplicationIllegalArgumentException("Attempting to disconnect view that has not been connected with the given animated node: " + i + " but is connected to view " + this.f7717e);
    }

    /* renamed from: j */
    public void mo8457j() {
        int i = this.f7717e;
        if (i != -1 && C2996a.m11878a(i) != 2) {
            ReadableMapKeySetIterator keySetIterator = this.f7720h.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                this.f7720h.putNull(keySetIterator.nextKey());
            }
            this.f7721i.synchronouslyUpdateViewOnUIThread(this.f7717e, this.f7720h);
        }
    }

    /* renamed from: k */
    public final void mo8458k() {
        if (this.f7717e != -1) {
            for (Map.Entry next : this.f7719g.entrySet()) {
                C2611b o = this.f7718f.mo8442o(((Integer) next.getValue()).intValue());
                if (o == null) {
                    throw new IllegalArgumentException("Mapped property node does not exists");
                } else if (o instanceof C2628o) {
                    ((C2628o) o).mo8459h(this.f7720h);
                } else if (o instanceof C2636s) {
                    C2636s sVar = (C2636s) o;
                    Object j = sVar.mo8463j();
                    if (j instanceof String) {
                        this.f7720h.putString((String) next.getKey(), (String) j);
                    } else {
                        this.f7720h.putDouble((String) next.getKey(), sVar.mo8464k());
                    }
                } else {
                    throw new IllegalArgumentException("Unsupported type of node used in property node " + o.getClass());
                }
            }
            this.f7721i.synchronouslyUpdateViewOnUIThread(this.f7717e, this.f7720h);
        }
    }
}
