package p455g.p470y;

import p455g.p457b0.C10251c;
import p455g.p470y.p472d.C10448d;
import p455g.p470y.p472d.C10457l;
import p455g.p470y.p472d.C10468w;

/* renamed from: g.y.a */
public final class C10417a {
    /* renamed from: a */
    public static final <T> Class<T> m35289a(C10251c<T> cVar) {
        C10457l.m35320e(cVar, "<this>");
        Class b = ((C10448d) cVar).mo25816b();
        if (!b.isPrimitive()) {
            C10457l.m35318c(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return b;
        }
        String name = b.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    b = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    b = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    b = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    b = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    b = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    b = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    b = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    b = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    b = Short.class;
                    break;
                }
                break;
        }
        C10457l.m35318c(b, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return b;
    }

    /* renamed from: b */
    public static final <T> C10251c<T> m35290b(Class<T> cls) {
        C10457l.m35320e(cls, "<this>");
        return C10468w.m35335b(cls);
    }
}
