package com.swmansion.reanimated.p441k;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.C2981h;
import com.facebook.react.uimanager.C3022n;
import com.facebook.react.uimanager.C3039r0;
import com.facebook.react.uimanager.UIManagerModule;
import p027c.p100v.C2224z;

/* renamed from: com.swmansion.reanimated.k.c */
public class C9935c {

    /* renamed from: a */
    private final UIManagerModule f26586a;

    /* renamed from: com.swmansion.reanimated.k.c$a */
    class C9936a implements C3039r0 {

        /* renamed from: a */
        final /* synthetic */ int f26587a;

        /* renamed from: b */
        final /* synthetic */ ReadableMap f26588b;

        C9936a(int i, ReadableMap readableMap) {
            this.f26587a = i;
            this.f26588b = readableMap;
        }

        /* renamed from: a */
        public void mo8417a(C3022n nVar) {
            try {
                View w = nVar.mo9786w(this.f26587a);
                if (w instanceof ViewGroup) {
                    ReadableArray array = this.f26588b.getArray("transitions");
                    int size = array.size();
                    for (int i = 0; i < size; i++) {
                        C2224z.m9415a((ViewGroup) w, C9937d.m33845c(array.getMap(i)));
                    }
                }
            } catch (C2981h unused) {
            }
        }
    }

    public C9935c(UIManagerModule uIManagerModule) {
        this.f26586a = uIManagerModule;
    }

    /* renamed from: a */
    public void mo24829a(int i, ReadableMap readableMap) {
        this.f26586a.prependUIBlock(new C9936a(i, readableMap));
    }
}
