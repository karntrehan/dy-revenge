package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.C1286d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.s */
public abstract class C1252s {

    /* renamed from: a */
    private final C1226h f3579a;

    /* renamed from: b */
    private final ClassLoader f3580b;

    /* renamed from: c */
    ArrayList<C1253a> f3581c = new ArrayList<>();

    /* renamed from: d */
    int f3582d;

    /* renamed from: e */
    int f3583e;

    /* renamed from: f */
    int f3584f;

    /* renamed from: g */
    int f3585g;

    /* renamed from: h */
    int f3586h;

    /* renamed from: i */
    boolean f3587i;

    /* renamed from: j */
    boolean f3588j = true;

    /* renamed from: k */
    String f3589k;

    /* renamed from: l */
    int f3590l;

    /* renamed from: m */
    CharSequence f3591m;

    /* renamed from: n */
    int f3592n;

    /* renamed from: o */
    CharSequence f3593o;

    /* renamed from: p */
    ArrayList<String> f3594p;

    /* renamed from: q */
    ArrayList<String> f3595q;

    /* renamed from: r */
    boolean f3596r = false;

    /* renamed from: s */
    ArrayList<Runnable> f3597s;

    /* renamed from: androidx.fragment.app.s$a */
    static final class C1253a {

        /* renamed from: a */
        int f3598a;

        /* renamed from: b */
        Fragment f3599b;

        /* renamed from: c */
        int f3600c;

        /* renamed from: d */
        int f3601d;

        /* renamed from: e */
        int f3602e;

        /* renamed from: f */
        int f3603f;

        /* renamed from: g */
        C1286d.C1288b f3604g;

        /* renamed from: h */
        C1286d.C1288b f3605h;

        C1253a() {
        }

        C1253a(int i, Fragment fragment) {
            this.f3598a = i;
            this.f3599b = fragment;
            C1286d.C1288b bVar = C1286d.C1288b.RESUMED;
            this.f3604g = bVar;
            this.f3605h = bVar;
        }
    }

    C1252s(C1226h hVar, ClassLoader classLoader) {
        this.f3579a = hVar;
        this.f3580b = classLoader;
    }

    /* renamed from: b */
    public C1252s mo4242b(int i, Fragment fragment) {
        mo3975l(i, fragment, (String) null, 1);
        return this;
    }

    /* renamed from: c */
    public C1252s mo4243c(int i, Fragment fragment, String str) {
        mo3975l(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1252s mo4244d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f3376T = viewGroup;
        return mo4243c(viewGroup.getId(), fragment, str);
    }

    /* renamed from: e */
    public C1252s mo4245e(Fragment fragment, String str) {
        mo3975l(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4246f(C1253a aVar) {
        this.f3581c.add(aVar);
        aVar.f3600c = this.f3582d;
        aVar.f3601d = this.f3583e;
        aVar.f3602e = this.f3584f;
        aVar.f3603f = this.f3585g;
    }

    /* renamed from: g */
    public abstract int mo3971g();

    /* renamed from: h */
    public abstract int mo3972h();

    /* renamed from: i */
    public abstract void mo3973i();

    /* renamed from: j */
    public abstract void mo3974j();

    /* renamed from: k */
    public C1252s mo4247k() {
        if (!this.f3587i) {
            this.f3588j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo3975l(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f3368L;
            if (str2 == null || str.equals(str2)) {
                fragment.f3368L = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f3368L + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f3366J;
                if (i3 == 0 || i3 == i) {
                    fragment.f3366J = i;
                    fragment.f3367K = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f3366J + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo4246f(new C1253a(i2, fragment));
    }

    /* renamed from: m */
    public C1252s mo3976m(Fragment fragment) {
        mo4246f(new C1253a(3, fragment));
        return this;
    }

    /* renamed from: n */
    public C1252s mo4248n(int i, Fragment fragment) {
        return mo4249o(i, fragment, (String) null);
    }

    /* renamed from: o */
    public C1252s mo4249o(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo3975l(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: p */
    public C1252s mo4250p(Runnable runnable) {
        mo4247k();
        if (this.f3597s == null) {
            this.f3597s = new ArrayList<>();
        }
        this.f3597s.add(runnable);
        return this;
    }

    /* renamed from: q */
    public C1252s mo4251q(int i, int i2) {
        return mo4252r(i, i2, 0, 0);
    }

    /* renamed from: r */
    public C1252s mo4252r(int i, int i2, int i3, int i4) {
        this.f3582d = i;
        this.f3583e = i2;
        this.f3584f = i3;
        this.f3585g = i4;
        return this;
    }

    /* renamed from: s */
    public C1252s mo4253s(boolean z) {
        this.f3596r = z;
        return this;
    }
}
