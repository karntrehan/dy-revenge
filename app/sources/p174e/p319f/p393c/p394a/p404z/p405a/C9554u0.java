package p174e.p319f.p393c.p394a.p404z.p405a;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import okhttp3.HttpUrl;
import p174e.p319f.p393c.p394a.p404z.p405a.C9577z;

/* renamed from: e.f.c.a.z.a.u0 */
final class C9554u0 {
    /* renamed from: a */
    private static final String m32438a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m32439b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            obj2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else if (!(obj instanceof C9468i)) {
            return obj instanceof C9537s0 ? obj == ((C9537s0) obj).mo24005c() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
        } else {
            obj2 = C9468i.f25367f;
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    static final void m32440c(StringBuilder sb, int i, String str, Object obj) {
        String a;
        if (obj instanceof List) {
            for (Object c : (List) obj) {
                m32440c(sb, i, str, c);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c2 : ((Map) obj).entrySet()) {
                m32440c(sb, i, str, c2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                a = C9514m1.m32140c((String) obj);
            } else if (obj instanceof C9468i) {
                sb.append(": \"");
                a = C9514m1.m32138a((C9468i) obj);
            } else {
                if (obj instanceof C9577z) {
                    sb.append(" {");
                    m32441d((C9577z) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i4 = i + 2;
                    m32440c(sb, i4, "key", entry.getKey());
                    m32440c(sb, i4, "value", entry.getValue());
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    sb.append(obj.toString());
                    return;
                }
                sb.append("}");
                return;
            }
            sb.append(a);
            sb.append('\"');
        }
    }

    /* renamed from: d */
    private static void m32441d(C9537s0 s0Var, StringBuilder sb, int i) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : s0Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            boolean z = true;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String str2 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m32440c(sb, i, m32438a(str2), C9577z.m32639y(method2, s0Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String str3 = substring.substring(0, 1).toLowerCase() + substring.substring(1, substring.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m32440c(sb, i, m32438a(str3), C9577z.m32639y(method3, s0Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + substring)) != null) {
                if (substring.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                    }
                }
                String str4 = substring.substring(0, 1).toLowerCase() + substring.substring(1);
                Method method4 = (Method) hashMap.get("get" + substring);
                Method method5 = (Method) hashMap.get("has" + substring);
                if (method4 != null) {
                    Object y = C9577z.m32639y(method4, s0Var, new Object[0]);
                    if (method5 != null) {
                        z = ((Boolean) C9577z.m32639y(method5, s0Var, new Object[0])).booleanValue();
                    } else if (m32439b(y)) {
                        z = false;
                    }
                    if (z) {
                        m32440c(sb, i, m32438a(str4), y);
                    }
                }
            }
        }
        if (s0Var instanceof C9577z.C9580c) {
            Iterator<Map.Entry<C9577z.C9581d, Object>> r = ((C9577z.C9580c) s0Var).extensions.mo24024r();
            while (r.hasNext()) {
                Map.Entry next = r.next();
                m32440c(sb, i, "[" + ((C9577z.C9581d) next.getKey()).mo24030d() + "]", next.getValue());
            }
        }
        C9525p1 p1Var = ((C9577z) s0Var).unknownFields;
        if (p1Var != null) {
            p1Var.mo23924m(sb, i);
        }
    }

    /* renamed from: e */
    static String m32442e(C9537s0 s0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m32441d(s0Var, sb, 0);
        return sb.toString();
    }
}
