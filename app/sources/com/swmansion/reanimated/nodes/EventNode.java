package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.reanimated.C9911d;
import java.util.ArrayList;
import java.util.List;

public class EventNode extends C9965m implements RCTEventEmitter {
    private final List<C9948a> mMapping;

    /* renamed from: com.swmansion.reanimated.nodes.EventNode$a */
    private static class C9948a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f26644a;

        /* renamed from: b */
        private final String[] f26645b;

        public C9948a(ReadableArray readableArray) {
            int size = readableArray.size() - 1;
            this.f26645b = new String[size];
            for (int i = 0; i < size; i++) {
                this.f26645b[i] = readableArray.getString(i);
            }
            this.f26644a = readableArray.getInt(size);
        }

        /* renamed from: b */
        public Double mo24853b(ReadableMap readableMap) {
            int i = 0;
            while (readableMap != null) {
                String[] strArr = this.f26645b;
                if (i >= strArr.length - 1) {
                    break;
                }
                String str = strArr[i];
                readableMap = readableMap.hasKey(str) ? readableMap.getMap(str) : null;
                i++;
            }
            if (readableMap == null) {
                return null;
            }
            String[] strArr2 = this.f26645b;
            String str2 = strArr2[strArr2.length - 1];
            if (readableMap.hasKey(str2)) {
                return Double.valueOf(readableMap.getDouble(str2));
            }
            return null;
        }
    }

    public EventNode(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.mMapping = processMapping(readableMap.getArray("argMapping"));
    }

    private static List<C9948a> processMapping(ReadableArray readableArray) {
        int size = readableArray.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C9948a(readableArray.getArray(i)));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public Double evaluate() {
        return C9965m.ZERO;
    }

    public void receiveEvent(int i, String str, WritableMap writableMap) {
        if (writableMap != null) {
            for (int i2 = 0; i2 < this.mMapping.size(); i2++) {
                C9948a aVar = this.mMapping.get(i2);
                Double b = aVar.mo24853b(writableMap);
                if (b != null) {
                    ((C10013u) this.mNodesManager.mo24809r(aVar.f26644a, C10013u.class)).mo24870b(b);
                }
            }
            return;
        }
        throw new IllegalArgumentException("Animated events must have event data.");
    }

    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        throw new RuntimeException("receiveTouches is not support by animated events");
    }
}
