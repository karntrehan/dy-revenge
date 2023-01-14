package p496io.invertase.firebase.common;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.invertase.firebase.common.m */
public class C10667m {
    /* renamed from: a */
    public static void m36316a(Object obj, WritableArray writableArray) {
        double floatValue;
        if (obj == null || obj == JSONObject.NULL) {
            writableArray.pushNull();
            return;
        }
        String name = obj.getClass().getName();
        if (!name.equals("java.lang.Integer")) {
            if (!name.equals("java.lang.Float")) {
                if (name.equals("org.json.JSONArray$1")) {
                    writableArray.pushArray(m36318c((JSONArray) obj));
                    return;
                } else if (name.equals("java.lang.Boolean")) {
                    writableArray.pushBoolean(((Boolean) obj).booleanValue());
                    return;
                } else if (name.equals("java.lang.Long")) {
                    floatValue = (double) ((Long) obj).longValue();
                } else if (name.equals("java.lang.Double")) {
                    floatValue = ((Double) obj).doubleValue();
                } else if (name.equals("java.lang.String")) {
                    writableArray.pushString((String) obj);
                    return;
                } else if (name.equals("org.json.JSONObject$1")) {
                    try {
                        writableArray.pushMap(m36319d((JSONObject) obj));
                        return;
                    } catch (JSONException unused) {
                    }
                } else if (List.class.isAssignableFrom(obj.getClass())) {
                    writableArray.pushArray(m36320e((List) obj));
                    return;
                } else if (Map.class.isAssignableFrom(obj.getClass())) {
                    writableArray.pushMap(m36322g((Map) obj));
                    return;
                } else {
                    Log.d("Utils", "utils:arrayPushValue:unknownType:" + name);
                }
                writableArray.pushNull();
                return;
            }
            floatValue = (double) ((Float) obj).floatValue();
            writableArray.pushDouble(floatValue);
            return;
        }
        writableArray.pushInt(((Integer) obj).intValue());
    }

    /* renamed from: b */
    public static WritableMap m36317b(Exception exc) {
        WritableMap createMap = Arguments.createMap();
        String message = exc.getMessage();
        createMap.putString("code", "unknown");
        createMap.putString("nativeErrorCode", "unknown");
        createMap.putString("message", message);
        createMap.putString("nativeErrorMessage", message);
        return createMap;
    }

    /* renamed from: c */
    public static WritableArray m36318c(JSONArray jSONArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createArray.pushDouble(jSONArray.getDouble(i));
            } else if (obj instanceof Number) {
                createArray.pushInt(jSONArray.getInt(i));
            } else if (obj instanceof String) {
                createArray.pushString(jSONArray.getString(i));
            } else if (obj instanceof JSONObject) {
                createArray.pushMap(m36319d(jSONArray.getJSONObject(i)));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(m36318c(jSONArray.getJSONArray(i)));
            } else if (obj == JSONObject.NULL) {
                createArray.pushNull();
            }
        }
        return createArray;
    }

    /* renamed from: d */
    public static WritableMap m36319d(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        WritableMap createMap = Arguments.createMap();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                createMap.putDouble(next, jSONObject.getDouble(next));
            } else if (obj instanceof Number) {
                createMap.putInt(next, jSONObject.getInt(next));
            } else if (obj instanceof String) {
                createMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                createMap.putMap(next, m36319d(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(next, m36318c(jSONObject.getJSONArray(next)));
            } else if (obj == JSONObject.NULL) {
                createMap.putNull(next);
            }
        }
        return createMap;
    }

    /* renamed from: e */
    private static WritableArray m36320e(List<Object> list) {
        WritableArray createArray = Arguments.createArray();
        for (Object a : list) {
            m36316a(a, createArray);
        }
        return createArray;
    }

    /* renamed from: f */
    public static void m36321f(String str, Object obj, WritableMap writableMap) {
        double floatValue;
        if (obj == null || obj == JSONObject.NULL) {
            writableMap.putNull(str);
            return;
        }
        String name = obj.getClass().getName();
        if (!name.equals("java.lang.Integer")) {
            if (!name.equals("java.lang.Float")) {
                if (name.equals("org.json.JSONArray$1")) {
                    writableMap.putArray(str, m36318c((JSONArray) obj));
                    return;
                } else if (name.equals("java.lang.Boolean")) {
                    writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
                    return;
                } else if (name.equals("java.lang.Long")) {
                    floatValue = (double) ((Long) obj).longValue();
                } else if (name.equals("java.lang.Double")) {
                    floatValue = ((Double) obj).doubleValue();
                } else if (name.equals("java.lang.String")) {
                    writableMap.putString(str, (String) obj);
                    return;
                } else if (name.equals("org.json.JSONObject$1")) {
                    try {
                        writableMap.putMap(str, m36319d((JSONObject) obj));
                        return;
                    } catch (JSONException unused) {
                    }
                } else if (List.class.isAssignableFrom(obj.getClass())) {
                    writableMap.putArray(str, m36320e((List) obj));
                    return;
                } else if (Map.class.isAssignableFrom(obj.getClass())) {
                    writableMap.putMap(str, m36322g((Map) obj));
                    return;
                } else {
                    Log.d("Utils", "utils:mapPutValue:unknownType:" + name);
                }
                writableMap.putNull(str);
                return;
            }
            floatValue = (double) ((Float) obj).floatValue();
            writableMap.putDouble(str, floatValue);
            return;
        }
        writableMap.putInt(str, ((Integer) obj).intValue());
    }

    /* renamed from: g */
    public static WritableMap m36322g(Map<String, Object> map) {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry next : map.entrySet()) {
            m36321f((String) next.getKey(), next.getValue(), createMap);
        }
        return createMap;
    }
}
