package p174e.p319f.p320a.p335c.p345f.p357l;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.l.ke */
final class C8312ke {
    /* renamed from: a */
    static String m28707a(C8274ie ieVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m28710d(ieVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static final void m28708b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m28708b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m28708b(sb, i, str, b2);
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
                sb.append(C8256hf.m28549a(C8177dc.m28420B((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C8177dc) {
                sb.append(": \"");
                sb.append(C8256hf.m28549a((C8177dc) obj));
                sb.append('\"');
            } else if (obj instanceof C8197ed) {
                sb.append(" {");
                m28710d((C8197ed) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m28708b(sb, i4, "key", entry.getKey());
                m28708b(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: c */
    private static final String m28709c(String str) {
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

    /* renamed from: d */
    private static void m28710d(C8274ie ieVar, StringBuilder sb, int i) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : ieVar.getClass().getDeclaredMethods()) {
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
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m28708b(sb, i, m28709c(concat), C8197ed.m28467h(method2, ieVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m28708b(sb, i, m28709c(concat2), C8197ed.m28467h(method3, ieVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object h = C8197ed.m28467h(method4, ieVar, new Object[0]);
                    if (method5 == null) {
                        if (h instanceof Boolean) {
                            if (!((Boolean) h).booleanValue()) {
                            }
                        } else if (h instanceof Integer) {
                            if (((Integer) h).intValue() == 0) {
                            }
                        } else if (h instanceof Float) {
                            if (((Float) h).floatValue() == 0.0f) {
                            }
                        } else if (!(h instanceof Double)) {
                            if (h instanceof String) {
                                obj = HttpUrl.FRAGMENT_ENCODE_SET;
                            } else if (h instanceof C8177dc) {
                                obj = C8177dc.f22199f;
                            } else if (h instanceof C8274ie) {
                                if (h == ((C8274ie) h).mo21769t()) {
                                }
                            } else if ((h instanceof Enum) && ((Enum) h).ordinal() == 0) {
                            }
                            if (h.equals(obj)) {
                            }
                        } else if (((Double) h).doubleValue() == 0.0d) {
                        }
                    } else if (!((Boolean) C8197ed.m28467h(method5, ieVar, new Object[0])).booleanValue()) {
                    }
                    m28708b(sb, i, m28709c(concat3), h);
                }
            }
        }
        if (ieVar instanceof C8140bd) {
            Iterator<Map.Entry<C8159cd, Object>> f = ((C8140bd) ieVar).zzb.mo22209f();
            while (f.hasNext()) {
                Map.Entry next = f.next();
                C8159cd cdVar = (C8159cd) next.getKey();
                m28708b(sb, i, "[202056002]", next.getValue());
            }
        }
        C8313kf kfVar = ((C8197ed) ieVar).zzc;
        if (kfVar != null) {
            kfVar.mo21932g(sb, i);
        }
    }
}
