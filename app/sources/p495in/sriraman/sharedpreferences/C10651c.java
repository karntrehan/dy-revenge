package p495in.sriraman.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: in.sriraman.sharedpreferences.c */
public class C10651c {

    /* renamed from: a */
    private static C10651c f28120a;

    /* renamed from: b */
    private SharedPreferences f28121b;

    public C10651c(Context context, String str) {
        this.f28121b = context.getSharedPreferences(str, 0);
    }

    /* renamed from: d */
    public static C10651c m36265d() {
        return f28120a;
    }

    /* renamed from: f */
    public static void m36266f(Context context, String str) {
        if (f28120a == null) {
            f28120a = new C10651c(context, str);
        }
    }

    /* renamed from: a */
    public void mo26510a() {
        this.f28121b.edit().clear().commit();
    }

    /* renamed from: b */
    public void mo26511b(String str) {
        SharedPreferences.Editor edit = this.f28121b.edit();
        edit.remove(str);
        edit.commit();
    }

    /* renamed from: c */
    public Map<String, ?> mo26512c() {
        return this.f28121b.getAll();
    }

    /* renamed from: e */
    public String mo26513e(String str) {
        return this.f28121b.getString(str, (String) null);
    }

    /* renamed from: g */
    public void mo26514g(String str, Object obj) {
        SharedPreferences.Editor putFloat;
        SharedPreferences.Editor edit = this.f28121b.edit();
        if (obj instanceof String) {
            putFloat = edit.putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            putFloat = edit.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Integer) {
            putFloat = edit.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            putFloat = edit.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            putFloat = edit.putFloat(str, ((Float) obj).floatValue());
        } else {
            return;
        }
        putFloat.commit();
    }
}
