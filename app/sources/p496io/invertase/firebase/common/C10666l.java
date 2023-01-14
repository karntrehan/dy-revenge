package p496io.invertase.firebase.common;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import java.util.Map;
import p496io.invertase.firebase.app.C10652a;

/* renamed from: io.invertase.firebase.common.l */
public class C10666l {

    /* renamed from: a */
    private static C10666l f28144a = new C10666l();

    /* renamed from: b */
    private SharedPreferences f28145b;

    /* renamed from: e */
    private SharedPreferences m36308e() {
        if (this.f28145b == null) {
            this.f28145b = C10652a.m36272a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f28145b;
    }

    /* renamed from: f */
    public static C10666l m36309f() {
        return f28144a;
    }

    /* renamed from: a */
    public void mo26566a() {
        m36308e().edit().clear().apply();
    }

    /* renamed from: b */
    public boolean mo26567b(String str) {
        return m36308e().contains(str);
    }

    /* renamed from: c */
    public WritableMap mo26568c() {
        WritableMap createMap = Arguments.createMap();
        for (Map.Entry next : m36308e().getAll().entrySet()) {
            C10667m.m36321f((String) next.getKey(), next.getValue(), createMap);
        }
        return createMap;
    }

    /* renamed from: d */
    public boolean mo26569d(String str, boolean z) {
        return m36308e().getBoolean(str, z);
    }

    /* renamed from: g */
    public void mo26570g(String str, boolean z) {
        m36308e().edit().putBoolean(str, z).apply();
    }

    /* renamed from: h */
    public void mo26571h(String str, String str2) {
        m36308e().edit().putString(str, str2).apply();
    }
}
