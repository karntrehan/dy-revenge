package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;
import p174e.p247e.p253d.p258e.C6071a;

/* renamed from: com.facebook.react.t */
public class C2907t {

    /* renamed from: com.facebook.react.t$a */
    static class C2908a implements Iterable<ModuleHolder> {

        /* renamed from: f */
        final /* synthetic */ List f8185f;

        /* renamed from: com.facebook.react.t$a$a */
        class C2909a implements Iterator<ModuleHolder> {

            /* renamed from: f */
            int f8186f = 0;

            C2909a() {
            }

            /* renamed from: b */
            public ModuleHolder next() {
                List list = C2908a.this.f8185f;
                int i = this.f8186f;
                this.f8186f = i + 1;
                return new ModuleHolder((NativeModule) list.get(i));
            }

            public boolean hasNext() {
                return this.f8186f < C2908a.this.f8185f.size();
            }

            public void remove() {
                throw new UnsupportedOperationException("Cannot remove methods ");
            }
        }

        C2908a(List list) {
            this.f8185f = list;
        }

        public Iterator<ModuleHolder> iterator() {
            return new C2909a();
        }
    }

    /* renamed from: a */
    public static Iterable<ModuleHolder> m11484a(C2906s sVar, ReactApplicationContext reactApplicationContext, C2886o oVar) {
        C6071a.m22868b("ReactNative", sVar.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        return new C2908a(sVar instanceof C2903q ? ((C2903q) sVar).mo9336b(reactApplicationContext, oVar) : sVar.mo7574d(reactApplicationContext));
    }
}
