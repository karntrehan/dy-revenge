package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.datatransport.runtime.backends.k */
class C3387k implements C3379e {

    /* renamed from: a */
    private final C3388a f9604a;

    /* renamed from: b */
    private final C3385i f9605b;

    /* renamed from: c */
    private final Map<String, C3390m> f9606c;

    /* renamed from: com.google.android.datatransport.runtime.backends.k$a */
    static class C3388a {

        /* renamed from: a */
        private final Context f9607a;

        /* renamed from: b */
        private Map<String, String> f9608b = null;

        C3388a(Context context) {
            this.f9607a = context;
        }

        /* renamed from: a */
        private Map<String, String> m13268a(Context context) {
            Bundle d = m13270d(context);
            if (d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : d.keySet()) {
                Object obj = d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String trim : ((String) obj).split(",", -1)) {
                        String trim2 = trim.trim();
                        if (!trim2.isEmpty()) {
                            hashMap.put(trim2, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m13269c() {
            if (this.f9608b == null) {
                this.f9608b = m13268a(this.f9607a);
            }
            return this.f9608b;
        }

        /* renamed from: d */
        private static Bundle m13270d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3378d mo10973b(String str) {
            String str2;
            String str3;
            String str4 = m13269c().get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (C3378d) Class.forName(str4).asSubclass(C3378d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                e = e;
                str2 = String.format("Class %s is not found.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (IllegalAccessException e2) {
                e = e2;
                str2 = String.format("Could not instantiate %s.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (InstantiationException e3) {
                e = e3;
                str2 = String.format("Could not instantiate %s.", new Object[]{str4});
                Log.w("BackendRegistry", str2, e);
                return null;
            } catch (NoSuchMethodException e4) {
                e = e4;
                str3 = String.format("Could not instantiate %s", new Object[]{str4});
                Log.w("BackendRegistry", str3, e);
                return null;
            } catch (InvocationTargetException e5) {
                e = e5;
                str3 = String.format("Could not instantiate %s", new Object[]{str4});
                Log.w("BackendRegistry", str3, e);
                return null;
            }
        }
    }

    C3387k(Context context, C3385i iVar) {
        this(new C3388a(context), iVar);
    }

    C3387k(C3388a aVar, C3385i iVar) {
        this.f9606c = new HashMap();
        this.f9604a = aVar;
        this.f9605b = iVar;
    }

    public synchronized C3390m get(String str) {
        if (this.f9606c.containsKey(str)) {
            return this.f9606c.get(str);
        }
        C3378d b = this.f9604a.mo10973b(str);
        if (b == null) {
            return null;
        }
        C3390m create = b.create(this.f9605b.mo10971a(str));
        this.f9606c.put(str, create);
        return create;
    }
}
