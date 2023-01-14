package p174e.p199d.p218c.p228n.p229a0;

import p174e.p199d.p217b.C5712m;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.i */
public class C5782i extends C5739i<C5784j> {
    public C5782i(C5784j jVar) {
        super(jVar);
    }

    /* renamed from: M */
    private String m21842M() {
        return mo17202u(0, 2);
    }

    /* renamed from: A */
    public String mo17515A() {
        return mo17193l(5120, 1, "Standard", null, "Wide");
    }

    /* renamed from: B */
    public String mo17516B() {
        Integer l = ((C5784j) this.f16215a).mo17148l(5122);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Auto (100-400%)";
        }
        if (intValue == 1) {
            return "Manual";
        }
        if (intValue == 256) {
            return "Standard (100%)";
        }
        if (intValue == 32768) {
            return "Film Simulation";
        }
        if (intValue == 512) {
            return "Wide 1 (230%)";
        }
        if (intValue == 513) {
            return "Wide 2 (400%)";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: C */
    public String mo17517C() {
        return mo17194m(4147, "Auto", "Manual");
    }

    /* renamed from: D */
    public String mo17518D() {
        Integer l = ((C5784j) this.f16215a).mo17148l(4148);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 256) {
            return "HR (High Resolution)";
        }
        if (intValue == 512) {
            return "SN (Signal to Noise Priority)";
        }
        if (intValue == 768) {
            return "DR (Dynamic Range Priority)";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: E */
    public String mo17519E() {
        Integer l = ((C5784j) this.f16215a).mo17148l(5121);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "F0/Standard (Provia) ";
        }
        if (intValue == 256) {
            return "F1/Studio Portrait";
        }
        if (intValue == 272) {
            return "F1a/Studio Portrait Enhanced Saturation";
        }
        if (intValue == 288) {
            return "F1b/Studio Portrait Smooth Skin Tone (Astia)";
        }
        if (intValue == 304) {
            return "F1c/Studio Portrait Increased Sharpness";
        }
        if (intValue == 512) {
            return "F2/Fujichrome (Velvia)";
        }
        if (intValue == 768) {
            return "F3/Studio Portrait Ex";
        }
        if (intValue == 1024) {
            return "F4/Velvia";
        }
        if (intValue == 1280) {
            return "Pro Neg. Std";
        }
        if (intValue == 1281) {
            return "Pro Neg. Hi";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: F */
    public String mo17520F() {
        Integer l = ((C5784j) this.f16215a).mo17148l(4624);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Standard";
        }
        if (intValue == 16) {
            return "Chrome";
        }
        if (intValue == 48) {
            return "B&W";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: G */
    public String mo17521G() {
        C5712m p = ((C5784j) this.f16215a).mo17151p(4113);
        if (p == null) {
            return null;
        }
        return p.mo17064K(false) + " EV (Apex)";
    }

    /* renamed from: H */
    public String mo17522H() {
        return mo17194m(4112, "Auto", "On", "Off", "Red-eye Reduction", "External");
    }

    /* renamed from: I */
    public String mo17523I() {
        return mo17194m(4129, "Auto Focus", "Manual Focus");
    }

    /* renamed from: J */
    public String mo17524J() {
        return mo17194m(4865, "Good Focus", "Out Of Focus");
    }

    /* renamed from: K */
    public String mo17525K() {
        Integer l = ((C5784j) this.f16215a).mo17148l(4110);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Normal";
        }
        if (intValue == 256) {
            return "Strong";
        }
        if (intValue == 512) {
            return "Weak";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: L */
    public String mo17526L() {
        return mo17194m(4128, "Off", "On");
    }

    /* renamed from: N */
    public String mo17527N() {
        Integer l = ((C5784j) this.f16215a).mo17148l(4107);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 64) {
            return "Low";
        }
        if (intValue == 128) {
            return "Normal";
        }
        if (intValue == 256) {
            return "N/A";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: O */
    public String mo17528O() {
        Integer l = ((C5784j) this.f16215a).mo17148l(4145);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 27) {
            return "Dog Face Detection";
        }
        if (intValue == 28) {
            return "Cat Face Detection";
        }
        if (intValue == 256) {
            return "Aperture priority AE";
        }
        if (intValue == 512) {
            return "Shutter priority AE";
        }
        if (intValue == 768) {
            return "Manual exposure";
        }
        switch (intValue) {
            case 0:
                return "Auto";
            case 1:
                return "Portrait scene";
            case 2:
                return "Landscape scene";
            case 3:
                return "Macro";
            case 4:
                return "Sports scene";
            case 5:
                return "Night scene";
            case 6:
                return "Program AE";
            case 7:
                return "Natural Light";
            case 8:
                return "Anti-blur";
            case 9:
                return "Beach & Snow";
            case 10:
                return "Sunset";
            case 11:
                return "Museum";
            case 12:
                return "Party";
            case 13:
                return "Flower";
            case 14:
                return "Text";
            case 15:
                return "Natural Light & Flash";
            case 16:
                return "Beach";
            case 17:
                return "Snow";
            case 18:
                return "Fireworks";
            case 19:
                return "Underwater";
            case 20:
                return "Portrait with Skin Correction";
            default:
                switch (intValue) {
                    case 22:
                        return "Panorama";
                    case 23:
                        return "Night (Tripod)";
                    case 24:
                        return "Pro Low-light";
                    case 25:
                        return "Pro Focus";
                    default:
                        return "Unknown (" + l + ")";
                }
        }
    }

    /* renamed from: P */
    public String mo17529P() {
        Integer l = ((C5784j) this.f16215a).mo17148l(4097);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 1) {
            return "Softest";
        }
        if (intValue == 2) {
            return "Soft";
        }
        if (intValue == 3) {
            return "Normal";
        }
        if (intValue == 4) {
            return "Hard";
        }
        if (intValue == 5) {
            return "Hardest";
        }
        if (intValue == 130) {
            return "Medium Soft";
        }
        if (intValue == 132) {
            return "Medium Hard";
        }
        if (intValue == 32768) {
            return "Film Simulation";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: Q */
    public String mo17530Q() {
        return mo17194m(4144, "Off", "On");
    }

    /* renamed from: R */
    public String mo17531R() {
        Integer l = ((C5784j) this.f16215a).mo17148l(4100);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Normal";
        }
        if (intValue == 128) {
            return "Medium High";
        }
        if (intValue == 256) {
            return "High";
        }
        if (intValue == 384) {
            return "Medium Low";
        }
        if (intValue == 512) {
            return "Low";
        }
        if (intValue == 768) {
            return "None (B&W)";
        }
        if (intValue == 32768) {
            return "Film Simulation";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: S */
    public String mo17532S() {
        Integer l = ((C5784j) this.f16215a).mo17148l(4098);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Auto";
        }
        if (intValue == 256) {
            return "Daylight";
        }
        if (intValue == 512) {
            return "Cloudy";
        }
        if (intValue == 1024) {
            return "Incandescence";
        }
        if (intValue == 1280) {
            return "Flash";
        }
        if (intValue == 4080) {
            return "Kelvin";
        }
        switch (intValue) {
            case 768:
                return "Daylight Fluorescent";
            case 769:
                return "Day White Fluorescent";
            case 770:
                return "White Fluorescent";
            case 771:
                return "Warm White Fluorescent";
            case 772:
                return "Living Room Warm White Fluorescent";
            default:
                switch (intValue) {
                    case 3840:
                        return "Custom White Balance";
                    case 3841:
                        return "Custom White Balance 2";
                    case 3842:
                        return "Custom White Balance 3";
                    case 3843:
                        return "Custom White Balance 4";
                    case 3844:
                        return "Custom White Balance 5";
                    default:
                        return "Unknown (" + l + ")";
                }
        }
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        if (i == 0) {
            return m21842M();
        }
        if (i == 4102) {
            return mo17537z();
        }
        if (i == 4107) {
            return mo17527N();
        }
        if (i == 4110) {
            return mo17525K();
        }
        if (i == 4352) {
            return mo17533v();
        }
        if (i == 4624) {
            return mo17520F();
        }
        if (i == 4112) {
            return mo17522H();
        }
        if (i == 4113) {
            return mo17521G();
        }
        if (i == 4128) {
            return mo17526L();
        }
        if (i == 4129) {
            return mo17523I();
        }
        if (i == 4144) {
            return mo17530Q();
        }
        if (i == 4145) {
            return mo17528O();
        }
        if (i == 4147) {
            return mo17517C();
        }
        if (i == 4148) {
            return mo17518D();
        }
        switch (i) {
            case 4097:
                return mo17529P();
            case 4098:
                return mo17532S();
            case 4099:
                return mo17536y();
            case 4100:
                return mo17531R();
            default:
                switch (i) {
                    case 4864:
                        return mo17535x();
                    case 4865:
                        return mo17524J();
                    case 4866:
                        return mo17534w();
                    default:
                        switch (i) {
                            case 5120:
                                return mo17515A();
                            case 5121:
                                return mo17519E();
                            case 5122:
                                return mo17516B();
                            default:
                                return super.mo17110f(i);
                        }
                }
        }
    }

    /* renamed from: v */
    public String mo17533v() {
        return mo17194m(4352, "Off", "On", "No Flash & Flash");
    }

    /* renamed from: w */
    public String mo17534w() {
        return mo17194m(4866, "AE Good", "Over Exposed");
    }

    /* renamed from: x */
    public String mo17535x() {
        return mo17194m(4864, "No Blur Warning", "Blur warning");
    }

    /* renamed from: y */
    public String mo17536y() {
        Integer l = ((C5784j) this.f16215a).mo17148l(4099);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Normal";
        }
        if (intValue == 128) {
            return "Medium High";
        }
        if (intValue == 256) {
            return "High";
        }
        if (intValue == 384) {
            return "Medium Low";
        }
        if (intValue == 512) {
            return "Low";
        }
        if (intValue == 32768) {
            return "Film Simulation";
        }
        switch (intValue) {
            case 768:
                return "None (B&W)";
            case 769:
                return "B&W Green Filter";
            case 770:
                return "B&W Yellow Filter";
            case 771:
                return "B&W Blue Filter";
            case 772:
                return "B&W Sepia";
            default:
                return "Unknown (" + l + ")";
        }
    }

    /* renamed from: z */
    public String mo17537z() {
        Integer l = ((C5784j) this.f16215a).mo17148l(4102);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Normal";
        }
        if (intValue == 256) {
            return "High";
        }
        if (intValue == 768) {
            return "Low";
        }
        return "Unknown (" + l + ")";
    }
}
