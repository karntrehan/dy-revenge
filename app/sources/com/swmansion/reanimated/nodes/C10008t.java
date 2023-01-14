package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.swmansion.reanimated.C9911d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.swmansion.reanimated.nodes.t */
public class C10008t extends C9965m {

    /* renamed from: a */
    private List<C10012d> f26715a;

    /* renamed from: com.swmansion.reanimated.nodes.t$b */
    private static class C10010b extends C10012d {

        /* renamed from: b */
        public int f26716b;

        private C10010b() {
            super();
        }

        /* renamed from: a */
        public Object mo24884a(C9911d dVar) {
            return dVar.mo24813v(this.f26716b);
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.t$c */
    private static class C10011c extends C10012d {

        /* renamed from: b */
        public Object f26717b;

        private C10011c() {
            super();
        }

        /* renamed from: a */
        public Object mo24884a(C9911d dVar) {
            return this.f26717b;
        }
    }

    /* renamed from: com.swmansion.reanimated.nodes.t$d */
    private static abstract class C10012d {

        /* renamed from: a */
        public String f26718a;

        private C10012d() {
        }

        /* renamed from: a */
        public abstract Object mo24884a(C9911d dVar);
    }

    public C10008t(int i, ReadableMap readableMap, C9911d dVar) {
        super(i, readableMap, dVar);
        this.f26715a = m33955c(readableMap.getArray("transform"));
    }

    /* renamed from: c */
    private static List<C10012d> m33955c(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            String string = map.getString("property");
            if (map.hasKey("nodeID")) {
                C10010b bVar = new C10010b();
                bVar.f26718a = string;
                bVar.f26716b = map.getInt("nodeID");
                arrayList.add(bVar);
            } else {
                C10011c cVar = new C10011c();
                cVar.f26718a = string;
                ReadableType type = map.getType("value");
                cVar.f26717b = type == ReadableType.String ? map.getString("value") : type == ReadableType.Array ? map.getArray("value") : Double.valueOf(map.getDouble("value"));
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public WritableArray evaluate() {
        ArrayList arrayList = new ArrayList(this.f26715a.size());
        for (C10012d next : this.f26715a) {
            arrayList.add(JavaOnlyMap.m10886of(next.f26718a, next.mo24884a(this.mNodesManager)));
        }
        return JavaOnlyArray.from(arrayList);
    }
}
