package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.C2776a;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.systrace.C3296b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.react.c */
public abstract class C2683c implements C2906s {

    /* renamed from: com.facebook.react.c$a */
    class C2684a implements Iterable<ModuleHolder> {

        /* renamed from: f */
        final /* synthetic */ List f7764f;

        /* renamed from: o */
        final /* synthetic */ Map f7765o;

        /* renamed from: com.facebook.react.c$a$a */
        class C2685a implements Iterator<ModuleHolder> {

            /* renamed from: f */
            int f7767f = 0;

            C2685a() {
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: b */
            public ModuleHolder next() {
                List list = C2684a.this.f7764f;
                int i = this.f7767f;
                this.f7767f = i + 1;
                ModuleSpec moduleSpec = (ModuleSpec) list.get(i);
                String name = moduleSpec.getName();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) C2684a.this.f7765o.get(name);
                if (reactModuleInfo != null) {
                    return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
                }
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
                try {
                    NativeModule nativeModule = (NativeModule) moduleSpec.getProvider().get();
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                    return new ModuleHolder(nativeModule);
                } catch (Throwable th) {
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                    throw th;
                }
            }

            public boolean hasNext() {
                return this.f7767f < C2684a.this.f7764f.size();
            }

            public void remove() {
                throw new UnsupportedOperationException("Cannot remove native modules from the list");
            }
        }

        C2684a(List list, Map map) {
            this.f7764f = list;
            this.f7765o = map;
        }

        public Iterator<ModuleHolder> iterator() {
            return new C2685a();
        }
    }

    /* renamed from: a */
    public List<ViewManager> mo7573a(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> f = mo8801f(reactApplicationContext);
        if (f == null || f.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec provider : f) {
            arrayList.add((ViewManager) provider.getProvider().get());
        }
        return arrayList;
    }

    /* renamed from: b */
    public Iterable<ModuleHolder> mo8798b(ReactApplicationContext reactApplicationContext) {
        return new C2684a(mo8799c(reactApplicationContext), mo8800e().mo8384a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List<ModuleSpec> mo8799c(ReactApplicationContext reactApplicationContext);

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public final List<NativeModule> mo7574d(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec next : mo8799c(reactApplicationContext)) {
            C3296b.m12892a(0, "createNativeModule").mo10751b("module", next.getType()).mo10752c();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, next.getName());
            try {
                NativeModule nativeModule = (NativeModule) next.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                C3296b.m12893b(0).mo10752c();
                arrayList.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                C3296b.m12893b(0).mo10752c();
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public abstract C2776a mo8800e();

    /* renamed from: f */
    public List<ModuleSpec> mo8801f(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
