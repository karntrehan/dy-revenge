package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.o */
public class C5794o extends C5739i<C5796p> {
    public C5794o(C5796p pVar) {
        super(pVar);
    }

    /* renamed from: A */
    private String m21977A() {
        return mo17193l(768, 1, "User Profile 1", "User Profile 2", "User Profile 3", "User Profile 0 (Dynamic)");
    }

    /* renamed from: B */
    private String m21978B() {
        return mo17194m(772, "Auto or Manual", "Daylight", "Fluorescent", "Tungsten", "Flash", "Cloudy", "Shadow");
    }

    /* renamed from: v */
    private String m21979v() {
        return mo17200s(787);
    }

    /* renamed from: w */
    private String m21980w() {
        return mo17191j(800, "%d C");
    }

    /* renamed from: x */
    private String m21981x() {
        return mo17200s(785);
    }

    /* renamed from: y */
    private String m21982y() {
        return mo17200s(786);
    }

    /* renamed from: z */
    private String m21983z() {
        return mo17193l(768, 1, "Fine", "Basic");
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i == 768) {
            return m21983z();
        }
        if (i == 770) {
            return m21977A();
        }
        if (i == 772) {
            return m21978B();
        }
        if (i == 800) {
            return m21980w();
        }
        switch (i) {
            case 785:
                return m21981x();
            case 786:
                return m21982y();
            case 787:
                return m21979v();
            default:
                switch (i) {
                    case 802:
                    case 803:
                    case 804:
                        return mo17200s(i);
                    default:
                        return super.mo17110f(i);
                }
        }
    }
}
