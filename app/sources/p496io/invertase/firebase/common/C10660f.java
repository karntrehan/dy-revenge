package p496io.invertase.firebase.common;

import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.C4825h;
import com.google.firebase.C4872k;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.invertase.firebase.common.f */
public class C10660f {
    /* renamed from: a */
    public static Map<String, Object> m36276a(C4825h hVar) {
        String n = hVar.mo14734n();
        C4872k o = hVar.mo14735o();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("name", n);
        hashMap3.put("automaticDataCollectionEnabled", Boolean.valueOf(hVar.mo14738u()));
        hashMap2.put("apiKey", o.mo14827b());
        hashMap2.put("appId", o.mo14828c());
        hashMap2.put("projectId", o.mo14833g());
        hashMap2.put("databaseURL", o.mo14829d());
        hashMap2.put("gaTrackingId", o.mo14830e());
        hashMap2.put("messagingSenderId", o.mo14832f());
        hashMap2.put("storageBucket", o.mo14834h());
        hashMap.put("options", hashMap2);
        hashMap.put("appConfig", hashMap3);
        return hashMap;
    }

    /* renamed from: b */
    public static WritableMap m36277b(C4825h hVar) {
        return Arguments.makeNativeMap(m36276a(hVar));
    }

    /* renamed from: c */
    public static C4825h m36278c(ReadableMap readableMap, ReadableMap readableMap2, Context context) {
        C4872k.C4874b bVar = new C4872k.C4874b();
        String string = readableMap2.getString("name");
        bVar.mo14838b(readableMap.getString("apiKey"));
        bVar.mo14839c(readableMap.getString("appId"));
        bVar.mo14843g(readableMap.getString("projectId"));
        bVar.mo14840d(readableMap.getString("databaseURL"));
        if (readableMap.hasKey("gaTrackingId")) {
            bVar.mo14841e(readableMap.getString("gaTrackingId"));
        }
        bVar.mo14844h(readableMap.getString("storageBucket"));
        bVar.mo14842f(readableMap.getString("messagingSenderId"));
        C4825h s = string.equals("[DEFAULT]") ? C4825h.m18441s(context, bVar.mo14837a()) : C4825h.m18442t(context, bVar.mo14837a(), string);
        if (readableMap2.hasKey("automaticDataCollectionEnabled")) {
            s.mo14727F(readableMap2.getBoolean("automaticDataCollectionEnabled"));
        }
        if (readableMap2.hasKey("automaticResourceManagement")) {
            s.mo14725D(readableMap2.getBoolean("automaticResourceManagement"));
        }
        return s;
    }

    /* renamed from: d */
    public static WritableMap m36279d(ReadableMap readableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        return createMap;
    }
}
