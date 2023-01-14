package androidx.camera.extensions;

import android.content.Context;
import androidx.camera.core.C0949o2;
import androidx.camera.core.C0961r1;
import androidx.camera.core.C0965s1;
import androidx.camera.core.impl.p014a3.C0722e;
import androidx.camera.core.impl.p014a3.p015n.C0744a;
import androidx.camera.core.impl.p014a3.p016o.C0768f;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.camera.extensions.p017f.C1040j;
import androidx.camera.extensions.p017f.C1051o;
import androidx.camera.extensions.p017f.C1052p;
import p027c.p061g.p062a.C1814b;
import p174e.p319f.p390b.p391a.p392a.C9172b;

public final class ExtensionsManager {

    /* renamed from: a */
    private static final Object f2872a = new Object();

    /* renamed from: b */
    private static C9172b<ExtensionsManager> f2873b;

    /* renamed from: c */
    private static C9172b<Void> f2874c;

    /* renamed from: d */
    private static ExtensionsManager f2875d;

    /* renamed from: e */
    private final ExtensionsAvailability f2876e;

    /* renamed from: f */
    private final C1027e f2877f;

    enum ExtensionsAvailability {
        LIBRARY_AVAILABLE,
        LIBRARY_UNAVAILABLE_ERROR_LOADING,
        LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION,
        NONE
    }

    private ExtensionsManager(ExtensionsAvailability extensionsAvailability, C0961r1 r1Var) {
        this.f2876e = extensionsAvailability;
        this.f2877f = new C1027e(r1Var);
    }

    /* renamed from: b */
    public static C9172b<ExtensionsManager> m3952b(Context context, C0961r1 r1Var) {
        return m3953c(context, r1Var, C1052p.m4069a());
    }

    /* renamed from: c */
    static C9172b<ExtensionsManager> m3953c(Context context, C0961r1 r1Var, C1052p pVar) {
        synchronized (f2872a) {
            C9172b<Void> bVar = f2874c;
            if (bVar != null) {
                if (!bVar.isDone()) {
                    throw new IllegalStateException("Not yet done deinitializing extensions");
                }
            }
            f2874c = null;
            if (C1040j.m4029b() == null) {
                C9172b<ExtensionsManager> g = C0768f.m3081g(m3954d(ExtensionsAvailability.NONE, r1Var));
                return g;
            } else if (C1040j.m4029b().compareTo(C1051o.f2942o) < 0) {
                C9172b<ExtensionsManager> g2 = C0768f.m3081g(m3954d(ExtensionsAvailability.LIBRARY_AVAILABLE, r1Var));
                return g2;
            } else {
                if (f2873b == null) {
                    f2873b = C1814b.m7736a(new C1023b(pVar, context, r1Var));
                }
                C9172b<ExtensionsManager> bVar2 = f2873b;
                return bVar2;
            }
        }
    }

    /* renamed from: d */
    static ExtensionsManager m3954d(ExtensionsAvailability extensionsAvailability, C0961r1 r1Var) {
        synchronized (f2872a) {
            ExtensionsManager extensionsManager = f2875d;
            if (extensionsManager != null) {
                return extensionsManager;
            }
            ExtensionsManager extensionsManager2 = new ExtensionsManager(extensionsAvailability, r1Var);
            f2875d = extensionsManager2;
            return extensionsManager2;
        }
    }

    /* renamed from: f */
    static /* synthetic */ Object m3955f(C1052p pVar, Context context, final C0961r1 r1Var, final C1814b.C1815a aVar) {
        ExtensionsAvailability extensionsAvailability;
        try {
            InitializerImpl.init(pVar.mo3347c(), C0722e.m2978a(context), new InitializerImpl.OnExtensionsInitializedCallback() {
                public void onFailure(int i) {
                    C0949o2.m3690c("ExtensionsManager", "Failed to initialize extensions");
                    C1814b.C1815a.this.mo6308c(ExtensionsManager.m3954d(ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, r1Var));
                }

                public void onSuccess() {
                    C0949o2.m3688a("ExtensionsManager", "Successfully initialized extensions");
                    C1814b.C1815a.this.mo6308c(ExtensionsManager.m3954d(ExtensionsAvailability.LIBRARY_AVAILABLE, r1Var));
                }
            }, C0744a.m3044a());
            return "Initialize extensions";
        } catch (AbstractMethodError | NoClassDefFoundError | NoSuchMethodError e) {
            C0949o2.m3690c("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e);
            extensionsAvailability = ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION;
        } catch (RuntimeException e2) {
            C0949o2.m3690c("ExtensionsManager", "Failed to initialize extensions. Something wents wrong when initializing the vendor library. " + e2);
            extensionsAvailability = ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING;
        }
        aVar.mo6308c(m3954d(extensionsAvailability, r1Var));
        return "Initialize extensions";
    }

    /* renamed from: a */
    public C0965s1 mo3306a(C0965s1 s1Var, int i) {
        if (i == 0) {
            return s1Var;
        }
        if (this.f2876e == ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return this.f2877f.mo3318b(s1Var, i);
        }
        throw new IllegalArgumentException("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
    }

    /* renamed from: e */
    public boolean mo3307e(C0965s1 s1Var, int i) {
        if (i == 0) {
            return true;
        }
        if (this.f2876e != ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        return this.f2877f.mo3319g(s1Var, i);
    }
}
