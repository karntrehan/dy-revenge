package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1289e;
import androidx.lifecycle.C1291g;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
final class Recreator implements C1289e {

    /* renamed from: f */
    private final C1423b f4153f;

    /* renamed from: androidx.savedstate.Recreator$a */
    static final class C1418a implements SavedStateRegistry.C1421b {

        /* renamed from: a */
        final Set<String> f4154a = new HashSet();

        C1418a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.mo5263d("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo5258a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f4154a));
            return bundle;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5259b(String str) {
            this.f4154a.add(str);
        }
    }

    Recreator(C1423b bVar) {
        this.f4153f = bVar;
    }

    /* renamed from: a */
    private void m6359a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.C1420a.class);
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.C1420a) declaredConstructor.newInstance(new Object[0])).mo4324a(this.f4153f);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    /* renamed from: h */
    public void mo137h(C1291g gVar, C1286d.C1287a aVar) {
        if (aVar == C1286d.C1287a.ON_CREATE) {
            gVar.getLifecycle().mo4340c(this);
            Bundle a = this.f4153f.mo131j().mo5260a("androidx.savedstate.Restarter");
            if (a != null) {
                ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        m6359a(it.next());
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
