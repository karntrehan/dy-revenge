package com.swmansion.reanimated.layoutReanimation;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.C2981h;
import com.facebook.react.uimanager.C3022n;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.swmansion.reanimated.layoutReanimation.h */
public class C9947h {

    /* renamed from: a */
    public static ArrayList<String> f26632a;

    /* renamed from: b */
    public static ArrayList<String> f26633b;

    /* renamed from: c */
    public View f26634c;

    /* renamed from: d */
    public ViewGroup f26635d;

    /* renamed from: e */
    public ViewManager f26636e;

    /* renamed from: f */
    public ViewManager f26637f;

    /* renamed from: g */
    public int f26638g;

    /* renamed from: h */
    public int f26639h;

    /* renamed from: i */
    public int f26640i;

    /* renamed from: j */
    public int f26641j;

    /* renamed from: k */
    public int f26642k;

    /* renamed from: l */
    public int f26643l;

    C9947h(View view, C3022n nVar) {
        this.f26635d = (ViewGroup) view.getParent();
        try {
            this.f26636e = nVar.mo9787x(view.getId());
            this.f26637f = nVar.mo9787x(this.f26635d.getId());
        } catch (C2981h | NullPointerException unused) {
        }
        this.f26638g = view.getWidth();
        this.f26639h = view.getHeight();
        this.f26640i = view.getLeft();
        this.f26641j = view.getTop();
        this.f26634c = view;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f26642k = iArr[0];
        this.f26643l = iArr[1];
        f26632a = new ArrayList<>(Arrays.asList(new String[]{"targetWidth", "targetHeight", "targetOriginX", "targetOriginY", "targetGlobalOriginX", "targetGlobalOriginY"}));
        f26633b = new ArrayList<>(Arrays.asList(new String[]{"currentWidth", "currentHeight", "currentOriginX", "currentOriginY", "currentGlobalOriginX", "currentGlobalOriginY"}));
    }

    /* renamed from: a */
    private void m33881a(HashMap<String, Object> hashMap) {
        hashMap.put("currentOriginY", Integer.valueOf(this.f26641j));
        hashMap.put("currentOriginX", Integer.valueOf(this.f26640i));
        hashMap.put("currentGlobalOriginY", Integer.valueOf(this.f26643l));
        hashMap.put("currentGlobalOriginX", Integer.valueOf(this.f26642k));
        hashMap.put("currentHeight", Integer.valueOf(this.f26639h));
        hashMap.put("currentWidth", Integer.valueOf(this.f26638g));
    }

    /* renamed from: b */
    private void m33882b(HashMap<String, Object> hashMap) {
        hashMap.put("targetOriginY", Integer.valueOf(this.f26641j));
        hashMap.put("targetOriginX", Integer.valueOf(this.f26640i));
        hashMap.put("targetGlobalOriginY", Integer.valueOf(this.f26643l));
        hashMap.put("targetGlobalOriginX", Integer.valueOf(this.f26642k));
        hashMap.put("targetHeight", Integer.valueOf(this.f26639h));
        hashMap.put("targetWidth", Integer.valueOf(this.f26638g));
    }

    /* renamed from: c */
    public HashMap<String, Object> mo24850c() {
        HashMap<String, Object> hashMap = new HashMap<>();
        m33881a(hashMap);
        return hashMap;
    }

    /* renamed from: d */
    public HashMap<String, Object> mo24851d() {
        HashMap<String, Object> hashMap = new HashMap<>();
        m33882b(hashMap);
        return hashMap;
    }
}
