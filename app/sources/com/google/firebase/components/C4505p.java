package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.p162p.C4927b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.firebase.components.p */
public final class C4505p<T> {

    /* renamed from: a */
    private final T f12821a;

    /* renamed from: b */
    private final C4508c<T> f12822b;

    /* renamed from: com.google.firebase.components.p$b */
    private static class C4507b implements C4508c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f12823a;

        private C4507b(Class<? extends Service> cls) {
            this.f12823a = cls;
        }

        /* renamed from: b */
        private Bundle m17151b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f12823a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f12823a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        /* renamed from: c */
        public List<String> mo14036a(Context context) {
            Bundle b = m17151b(context);
            if (b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* renamed from: com.google.firebase.components.p$c */
    interface C4508c<T> {
        /* renamed from: a */
        List<String> mo14036a(T t);
    }

    C4505p(T t, C4508c<T> cVar) {
        this.f12821a = t;
        this.f12822b = cVar;
    }

    /* renamed from: b */
    public static C4505p<Context> m17147b(Context context, Class<? extends Service> cls) {
        return new C4505p<>(context, new C4507b(cls));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static C4510r m17148c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (C4510r.class.isAssignableFrom(cls)) {
                return (C4510r) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C4522y(String.format("Class %s is not an instance of %s", new Object[]{str, "com.google.firebase.components.ComponentRegistrar"}));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", new Object[]{str}));
            return null;
        } catch (IllegalAccessException e) {
            throw new C4522y(String.format("Could not instantiate %s.", new Object[]{str}), e);
        } catch (InstantiationException e2) {
            throw new C4522y(String.format("Could not instantiate %s.", new Object[]{str}), e2);
        } catch (NoSuchMethodException e3) {
            throw new C4522y(String.format("Could not instantiate %s", new Object[]{str}), e3);
        } catch (InvocationTargetException e4) {
            throw new C4522y(String.format("Could not instantiate %s", new Object[]{str}), e4);
        }
    }

    /* renamed from: a */
    public List<C4927b<C4510r>> mo14035a() {
        ArrayList arrayList = new ArrayList();
        for (String cVar : this.f12822b.mo14036a(this.f12821a)) {
            arrayList.add(new C4486c(cVar));
        }
        return arrayList;
    }
}
