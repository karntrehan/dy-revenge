package p455g.p470y.p472d;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p455g.C10263c;
import p455g.C10314l;
import p455g.C10320p;
import p455g.p457b0.C10251c;
import p455g.p470y.C10417a;
import p455g.p470y.p471c.C10419a;
import p455g.p470y.p471c.C10420b;
import p455g.p470y.p471c.C10421c;
import p455g.p470y.p471c.C10422d;
import p455g.p470y.p471c.C10423e;
import p455g.p470y.p471c.C10424f;
import p455g.p470y.p471c.C10425g;
import p455g.p470y.p471c.C10426h;
import p455g.p470y.p471c.C10427i;
import p455g.p470y.p471c.C10428j;
import p455g.p470y.p471c.C10429k;
import p455g.p470y.p471c.C10430l;
import p455g.p470y.p471c.C10431m;
import p455g.p470y.p471c.C10432n;
import p455g.p470y.p471c.C10433o;
import p455g.p470y.p471c.C10434p;
import p455g.p470y.p471c.C10435q;
import p455g.p470y.p471c.C10436r;
import p455g.p470y.p471c.C10437s;
import p455g.p470y.p471c.C10438t;
import p455g.p470y.p471c.C10439u;
import p455g.p470y.p471c.C10440v;
import p455g.p470y.p471c.C10441w;

/* renamed from: g.y.d.e */
public final class C10449e implements C10251c<Object>, C10448d {

    /* renamed from: f */
    public static final C10450a f27610f = new C10450a((C10452g) null);

    /* renamed from: o */
    private static final Map<Class<? extends C10263c<?>>, Integer> f27611o;

    /* renamed from: p */
    private static final HashMap<String, String> f27612p;

    /* renamed from: q */
    private static final HashMap<String, String> f27613q;

    /* renamed from: r */
    private static final HashMap<String, String> f27614r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final Map<String, String> f27615s;

    /* renamed from: t */
    private final Class<?> f27616t;

    /* renamed from: g.y.d.e$a */
    public static final class C10450a {
        private C10450a() {
        }

        public /* synthetic */ C10450a(C10452g gVar) {
            this();
        }

        /* renamed from: a */
        public final String mo25820a(Class<?> cls) {
            String str;
            C10457l.m35320e(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        C10457l.m35319d(simpleName, "name");
                        String x0 = C10300q.m34993x0(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
                        if (x0 != null) {
                            return x0;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    C10457l.m35319d(simpleName, "name");
                    if (enclosingConstructor == null) {
                        return C10300q.m34992w0(simpleName, '$', (String) null, 2, (Object) null);
                    }
                    return C10300q.m34993x0(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) C10449e.f27615s.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) C10449e.f27615s.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }
    }

    static {
        int i = 0;
        List i2 = C10350l.m35140i(C10419a.class, C10430l.class, C10434p.class, C10435q.class, C10436r.class, C10437s.class, C10438t.class, C10439u.class, C10440v.class, C10441w.class, C10420b.class, C10421c.class, C10422d.class, C10423e.class, C10424f.class, C10425g.class, C10426h.class, C10427i.class, C10428j.class, C10429k.class, C10431m.class, C10432n.class, C10433o.class);
        ArrayList arrayList = new ArrayList(C10351m.m35147p(i2, 10));
        for (Object next : i2) {
            int i3 = i + 1;
            if (i < 0) {
                C10350l.m35146o();
            }
            arrayList.add(C10320p.m35019a((Class) next, Integer.valueOf(i)));
            i = i3;
        }
        f27611o = C10334c0.m35040j(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f27612p = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f27613q = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C10457l.m35319d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            C10457l.m35319d(str, "kotlinName");
            sb.append(C10300q.m34995z0(str, '.', (String) null, 2, (Object) null));
            sb.append("CompanionObject");
            String sb2 = sb.toString();
            C10314l a = C10320p.m35019a(sb2, str + ".Companion");
            hashMap3.put(a.mo25611c(), a.mo25612d());
        }
        for (Map.Entry next2 : f27611o.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f27614r = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10332b0.m35030a(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), C10300q.m34995z0((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f27615s = linkedHashMap;
    }

    public C10449e(Class<?> cls) {
        C10457l.m35320e(cls, "jClass");
        this.f27616t = cls;
    }

    /* renamed from: a */
    public String mo25574a() {
        return f27610f.mo25820a(mo25816b());
    }

    /* renamed from: b */
    public Class<?> mo25816b() {
        return this.f27616t;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10449e) && C10457l.m35316a(C10417a.m35289a(this), C10417a.m35289a((C10251c) obj));
    }

    public int hashCode() {
        return C10417a.m35289a(this).hashCode();
    }

    public String toString() {
        return mo25816b().toString() + " (Kotlin reflection is not available)";
    }
}
