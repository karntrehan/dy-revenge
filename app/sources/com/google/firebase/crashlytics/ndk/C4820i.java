package com.google.firebase.crashlytics.ndk;

import java.util.HashMap;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.ndk.i */
class C4820i {
    /* renamed from: a */
    private static String m18419a(String str) {
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* renamed from: b */
    static String m18420b(String str, String str2, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("session_id", str);
        hashMap.put("generator", str2);
        hashMap.put("started_at_seconds", Long.valueOf(j));
        return new JSONObject(hashMap).toString();
    }

    /* renamed from: c */
    static String m18421c(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_identifier", str);
        hashMap.put("version_code", str2);
        hashMap.put("version_name", str3);
        hashMap.put("install_uuid", str4);
        hashMap.put("delivery_mechanism", Integer.valueOf(i));
        hashMap.put("development_platform", m18419a(str5));
        hashMap.put("development_platform_version", m18419a(str6));
        return new JSONObject(hashMap).toString();
    }

    /* renamed from: d */
    static String m18422d(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("arch", Integer.valueOf(i));
        hashMap.put("build_model", str);
        hashMap.put("available_processors", Integer.valueOf(i2));
        hashMap.put("total_ram", Long.valueOf(j));
        hashMap.put("disk_space", Long.valueOf(j2));
        hashMap.put("is_emulator", Boolean.valueOf(z));
        hashMap.put("state", Integer.valueOf(i3));
        hashMap.put("build_manufacturer", str2);
        hashMap.put("build_product", str3);
        return new JSONObject(hashMap).toString();
    }

    /* renamed from: e */
    static String m18423e(String str, String str2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("version", str);
        hashMap.put("build_version", str2);
        hashMap.put("is_rooted", Boolean.valueOf(z));
        return new JSONObject(hashMap).toString();
    }
}
