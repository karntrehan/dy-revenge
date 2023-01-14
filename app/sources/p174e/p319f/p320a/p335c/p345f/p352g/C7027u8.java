package p174e.p319f.p320a.p335c.p345f.p352g;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: e.f.a.c.f.g.u8 */
abstract class C7027u8 {

    /* renamed from: a */
    private static final Logger f18985a = Logger.getLogger(C6819h8.class.getName());

    /* renamed from: b */
    private static final String f18986b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C7027u8() {
    }

    /* renamed from: b */
    static C6899m8 m26737b(Class cls) {
        String str;
        Class<C7027u8> cls2 = C7027u8.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C6899m8.class)) {
            str = f18986b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C6899m8) cls.cast(((C7027u8) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo20290a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((C7027u8) it.next()).mo20290a()));
                } catch (ServiceConfigurationError e5) {
                    f18985a.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), e5);
                }
            }
            if (arrayList.size() == 1) {
                return (C6899m8) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C6899m8) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C6899m8 mo20290a();
}
