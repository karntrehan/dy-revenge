package p174e.p319f.p320a.p335c.p345f.p352g;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import okhttp3.HttpUrl;

/* renamed from: e.f.a.c.f.g.ia */
final class C6837ia {
    /* renamed from: a */
    static String m25909a(C6805ga gaVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m25912d(gaVar, sb, 0);
        return sb.toString();
    }

    /* renamed from: b */
    static final void m25910b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object b : (List) obj) {
                m25910b(sb, i, str, b);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry b2 : ((Map) obj).entrySet()) {
                m25910b(sb, i, str, b2);
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
                sb.append(C6822hb.m25842a(C7106z7.m27075B((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C7106z7) {
                sb.append(": \"");
                sb.append(C6822hb.m25842a((C7106z7) obj));
                sb.append('\"');
            } else if (obj instanceof C6702a9) {
                sb.append(" {");
                m25912d((C6702a9) obj, sb, i + 2);
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
                m25910b(sb, i4, "key", entry.getKey());
                m25910b(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* renamed from: c */
    private static final String m25911c(String str) {
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
    private static void m25912d(C6805ga gaVar, StringBuilder sb, int i) {
        Object obj;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet<>();
        for (Method method : gaVar.getClass().getDeclaredMethods()) {
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
                String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m25910b(sb, i, m25911c(concat), C6702a9.m25416q(method2, gaVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m25910b(sb, i, m25911c(concat2), C6702a9.m25416q(method3, gaVar, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(substring))) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                Method method4 = (Method) hashMap.get("get".concat(substring));
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object q = C6702a9.m25416q(method4, gaVar, new Object[0]);
                    if (method5 == null) {
                        if (q instanceof Boolean) {
                            if (!((Boolean) q).booleanValue()) {
                            }
                        } else if (q instanceof Integer) {
                            if (((Integer) q).intValue() == 0) {
                            }
                        } else if (q instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) q).floatValue()) == 0) {
                            }
                        } else if (!(q instanceof Double)) {
                            if (q instanceof String) {
                                obj = HttpUrl.FRAGMENT_ENCODE_SET;
                            } else if (q instanceof C7106z7) {
                                obj = C7106z7.f19078f;
                            } else if (q instanceof C6805ga) {
                                if (q == ((C6805ga) q).mo19516d()) {
                                }
                            } else if ((q instanceof Enum) && ((Enum) q).ordinal() == 0) {
                            }
                            if (q.equals(obj)) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) q).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) C6702a9.m25416q(method5, gaVar, new Object[0])).booleanValue()) {
                    }
                    m25910b(sb, i, m25911c(concat3), q);
                }
            }
        }
        if (!(gaVar instanceof C7091y8)) {
            C6870kb kbVar = ((C6702a9) gaVar).zzc;
            if (kbVar != null) {
                kbVar.mo19930g(sb, i);
                return;
            }
            return;
        }
        C7091y8 y8Var = (C7091y8) gaVar;
        throw null;
    }
}
