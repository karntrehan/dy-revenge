package p496io.invertase.firebase.common;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: io.invertase.firebase.common.j */
public class C10664j {

    /* renamed from: a */
    private static C10664j f28141a = new C10664j();

    /* renamed from: b */
    private JSONObject f28142b;

    private C10664j() {
        try {
            this.f28142b = new JSONObject("{\"crashlytics_debug_enabled\":true,\"crashlytics_disable_auto_disabler\":true,\"crashlytics_auto_collection_enabled\":true,\"crashlytics_is_error_generation_on_js_crash_enabled\":true,\"crashlytics_javascript_exception_handler_chaining_enabled\":true}");
        } catch (JSONException unused) {
        }
    }

    /* renamed from: f */
    public static C10664j m36298f() {
        return f28141a;
    }

    /* renamed from: a */
    public boolean mo26559a(String str) {
        JSONObject jSONObject = this.f28142b;
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.has(str);
    }

    /* renamed from: b */
    public WritableMap mo26560b() {
        WritableMap createMap = Arguments.createMap();
        JSONArray names = this.f28142b.names();
        for (int i = 0; i < names.length(); i++) {
            try {
                String string = names.getString(i);
                C10667m.m36321f(string, this.f28142b.get(string), createMap);
            } catch (JSONException unused) {
            }
        }
        return createMap;
    }

    /* renamed from: c */
    public boolean mo26561c(String str, boolean z) {
        JSONObject jSONObject = this.f28142b;
        return jSONObject == null ? z : jSONObject.optBoolean(str, z);
    }

    /* renamed from: d */
    public int mo26562d(String str, int i) {
        JSONObject jSONObject = this.f28142b;
        return jSONObject == null ? i : jSONObject.optInt(str, i);
    }

    /* renamed from: e */
    public String mo26563e() {
        return "{\"crashlytics_debug_enabled\":true,\"crashlytics_disable_auto_disabler\":true,\"crashlytics_auto_collection_enabled\":true,\"crashlytics_is_error_generation_on_js_crash_enabled\":true,\"crashlytics_javascript_exception_handler_chaining_enabled\":true}";
    }
}
