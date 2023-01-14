package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.C2776a;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;

/* renamed from: com.facebook.react.x */
public abstract class C3252x implements C2906s {

    /* renamed from: com.facebook.react.x$a */
    class C3253a implements Iterable<ModuleHolder> {

        /* renamed from: f */
        final /* synthetic */ Iterator f9212f;

        /* renamed from: o */
        final /* synthetic */ ReactApplicationContext f9213o;

        /* renamed from: com.facebook.react.x$a$a */
        class C3254a implements Iterator<ModuleHolder> {

            /* renamed from: f */
            Map.Entry<String, ReactModuleInfo> f9215f = null;

            C3254a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:2:0x000a  */
            /* renamed from: b */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private void m12765b() {
                /*
                    r3 = this;
                L_0x0000:
                    com.facebook.react.x$a r0 = com.facebook.react.C3252x.C3253a.this
                    java.util.Iterator r0 = r0.f9212f
                    boolean r0 = r0.hasNext()
                    if (r0 == 0) goto L_0x0028
                    com.facebook.react.x$a r0 = com.facebook.react.C3252x.C3253a.this
                    java.util.Iterator r0 = r0.f9212f
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r1 = r0.getValue()
                    com.facebook.react.module.model.ReactModuleInfo r1 = (com.facebook.react.module.model.ReactModuleInfo) r1
                    boolean r2 = com.facebook.react.p126z.C3257a.f9220a
                    if (r2 == 0) goto L_0x0025
                    boolean r1 = r1.mo9086e()
                    if (r1 == 0) goto L_0x0025
                    goto L_0x0000
                L_0x0025:
                    r3.f9215f = r0
                    return
                L_0x0028:
                    r0 = 0
                    r3.f9215f = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.C3252x.C3253a.C3254a.m12765b():void");
            }

            /* renamed from: c */
            public ModuleHolder next() {
                if (this.f9215f == null) {
                    m12765b();
                }
                Map.Entry<String, ReactModuleInfo> entry = this.f9215f;
                if (entry != null) {
                    m12765b();
                    C3253a aVar = C3253a.this;
                    return new ModuleHolder(entry.getValue(), new C3255b(entry.getKey(), aVar.f9213o));
                }
                throw new NoSuchElementException("ModuleHolder not found");
            }

            public boolean hasNext() {
                if (this.f9215f == null) {
                    m12765b();
                }
                return this.f9215f != null;
            }

            public void remove() {
                throw new UnsupportedOperationException("Cannot remove native modules from the list");
            }
        }

        C3253a(Iterator it, ReactApplicationContext reactApplicationContext) {
            this.f9212f = it;
            this.f9213o = reactApplicationContext;
        }

        public Iterator<ModuleHolder> iterator() {
            return new C3254a();
        }
    }

    /* renamed from: com.facebook.react.x$b */
    private class C3255b implements Provider<NativeModule> {

        /* renamed from: a */
        private final String f9217a;

        /* renamed from: b */
        private final ReactApplicationContext f9218b;

        public C3255b(String str, ReactApplicationContext reactApplicationContext) {
            this.f9217a = str;
            this.f9218b = reactApplicationContext;
        }

        /* renamed from: a */
        public NativeModule get() {
            return C3252x.this.mo8382e(this.f9217a, this.f9218b);
        }
    }

    /* renamed from: a */
    public List<ViewManager> mo7573a(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> h = mo10712h(reactApplicationContext);
        if (h == null || h.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec provider : h) {
            arrayList.add((ViewManager) provider.getProvider().get());
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<NativeModule> mo7574d(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
    }

    /* renamed from: e */
    public abstract NativeModule mo8382e(String str, ReactApplicationContext reactApplicationContext);

    /* renamed from: f */
    public Iterable<ModuleHolder> mo10711f(ReactApplicationContext reactApplicationContext) {
        return new C3253a(mo8383g().mo8384a().entrySet().iterator(), reactApplicationContext);
    }

    /* renamed from: g */
    public abstract C2776a mo8383g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public List<ModuleSpec> mo10712h(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
