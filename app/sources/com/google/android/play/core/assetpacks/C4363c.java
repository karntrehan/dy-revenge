package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.c */
public abstract class C4363c {
    /* renamed from: a */
    public static C4363c m16786a(long j, Map<String, AssetPackState> map) {
        return new C4356a0(j, map);
    }

    /* renamed from: b */
    public static C4363c m16787b(Bundle bundle, C4412o0 o0Var) {
        return m16788c(bundle, o0Var, new ArrayList());
    }

    /* renamed from: c */
    public static C4363c m16788c(Bundle bundle, C4412o0 o0Var, List<String> list) {
        return m16789d(bundle, o0Var, list, C4435u.f12657a);
    }

    /* renamed from: d */
    private static C4363c m16789d(Bundle bundle, C4412o0 o0Var, List<String> list, C4431t tVar) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AssetPackState.m16743d(bundle, str, o0Var, tVar));
        }
        for (String next : list) {
            hashMap.put(next, AssetPackState.m16742b(next, 4, 0, 0, 0, 0.0d, 1));
        }
        return m16786a(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    /* renamed from: e */
    public abstract Map<String, AssetPackState> mo13801e();

    /* renamed from: f */
    public abstract long mo13803f();
}
