package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C1286d;
import androidx.lifecycle.C1289e;
import androidx.lifecycle.C1291g;
import androidx.savedstate.Recreator;
import java.util.Map;
import p027c.p036b.p037a.p039b.C1486b;

@SuppressLint({"RestrictedApi"})
public final class SavedStateRegistry {

    /* renamed from: a */
    private C1486b<String, C1421b> f4155a = new C1486b<>();

    /* renamed from: b */
    private Bundle f4156b;

    /* renamed from: c */
    private boolean f4157c;

    /* renamed from: d */
    private Recreator.C1418a f4158d;

    /* renamed from: e */
    boolean f4159e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    public interface C1420a {
        /* renamed from: a */
        void mo4324a(C1423b bVar);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    public interface C1421b {
        /* renamed from: a */
        Bundle mo5258a();
    }

    SavedStateRegistry() {
    }

    /* renamed from: a */
    public Bundle mo5260a(String str) {
        if (this.f4157c) {
            Bundle bundle = this.f4156b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f4156b.remove(str);
            if (this.f4156b.isEmpty()) {
                this.f4156b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5261b(C1286d dVar, Bundle bundle) {
        if (!this.f4157c) {
            if (bundle != null) {
                this.f4156b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            dVar.mo4338a(new C1289e() {
                /* renamed from: h */
                public void mo137h(C1291g gVar, C1286d.C1287a aVar) {
                    SavedStateRegistry savedStateRegistry;
                    boolean z;
                    if (aVar == C1286d.C1287a.ON_START) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = true;
                    } else if (aVar == C1286d.C1287a.ON_STOP) {
                        savedStateRegistry = SavedStateRegistry.this;
                        z = false;
                    } else {
                        return;
                    }
                    savedStateRegistry.f4159e = z;
                }
            });
            this.f4157c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5262c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f4156b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1486b<K, V>.d j = this.f4155a.mo5530j();
        while (j.hasNext()) {
            Map.Entry entry = (Map.Entry) j.next();
            bundle2.putBundle((String) entry.getKey(), ((C1421b) entry.getValue()).mo5258a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void mo5263d(String str, C1421b bVar) {
        if (this.f4155a.mo5522p(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void mo5264e(Class<? extends C1420a> cls) {
        if (this.f4159e) {
            if (this.f4158d == null) {
                this.f4158d = new Recreator.C1418a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f4158d.mo5259b(cls.getName());
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
