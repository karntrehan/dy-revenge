package p174e.p199d.p218c.p228n.p229a0;

import okhttp3.internal.p510ws.WebSocketProtocol;
import p027c.p028a.C1444j;
import p174e.p199d.p218c.C5739i;
import p174e.p319f.p320a.p363d.C9024k;

/* renamed from: e.d.c.n.a0.c1 */
public class C5768c1 extends C5739i<C5771d1> {
    public C5768c1(C5771d1 d1Var) {
        super(d1Var);
    }

    /* renamed from: A */
    public String mo17362A() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45097);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        switch (intValue) {
            case 0:
                return "Standard";
            case 1:
                return "Vivid";
            case 2:
                return "Portrait";
            case 3:
                return "Landscape";
            case 4:
                return "Sunset";
            case 5:
                return "Night Portrait";
            case 6:
                return "Black & White";
            case 7:
                return "Adobe RGB";
            default:
                switch (intValue) {
                    case 12:
                        return "Neutral";
                    case 13:
                        return "Clear";
                    case 14:
                        return "Deep";
                    case 15:
                        return "Light";
                    case 16:
                        return "Autumn";
                    case 17:
                        return "Sepia";
                    default:
                        switch (intValue) {
                            case 100:
                                return "Neutral";
                            case 101:
                                return "Clear";
                            case 102:
                                return "Deep";
                            case 103:
                                return "Light";
                            case 104:
                                return "Night View";
                            case 105:
                                return "Autumn Leaves";
                            default:
                                return String.format("Unknown (%d)", new Object[]{l});
                        }
                }
        }
    }

    /* renamed from: B */
    public String mo17363B() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45089);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return "Auto";
        }
        return String.format("%d K", new Object[]{Integer.valueOf(((l.intValue() & -16777216) >> 24) | ((l.intValue() & 16711680) >> 8))});
    }

    /* renamed from: C */
    public String mo17364C() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(8211);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == -1) {
            return "N/A";
        }
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 2) {
            return "Auto";
        }
        return String.format("Unknown (%d)", new Object[]{l});
    }

    /* renamed from: D */
    public String mo17365D() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45093);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "Standard";
        }
        if (intValue == 2) {
            return "Advanced Auto";
        }
        if (intValue == 3) {
            return "Auto";
        }
        switch (intValue) {
            case 8:
                return "Advanced LV1";
            case 9:
                return "Advanced LV2";
            case 10:
                return "Advanced LV3";
            case 11:
                return "Advanced LV4";
            case 12:
                return "Advanced LV5";
            default:
                switch (intValue) {
                    case 16:
                        return "LV1";
                    case 17:
                        return "LV2";
                    case 18:
                        return "LV3";
                    case 19:
                        return "LV4";
                    case 20:
                        return "LV5";
                    default:
                        return String.format("Unknown (%d)", new Object[]{l});
                }
        }
    }

    /* renamed from: E */
    public String mo17366E() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45121);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 29) {
            return "Underwater";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        switch (intValue) {
            case 0:
                return "Program";
            case 1:
                return "Portrait";
            case 2:
                return "Beach";
            case 3:
                return "Sports";
            case 4:
                return "Snow";
            case 5:
                return "Landscape";
            case 6:
                return "Auto";
            case 7:
                return "Aperture Priority";
            case 8:
                return "Shutter Priority";
            case 9:
                return "Night Scene / Twilight";
            case 10:
                return "Hi-Speed Shutter";
            case 11:
                return "Twilight Portrait";
            case 12:
                return "Soft Snap/Portrait";
            case 13:
                return "Fireworks";
            case 14:
                return "Smile Shutter";
            case 15:
                return "Manual";
            default:
                switch (intValue) {
                    case 18:
                        return "High Sensitivity";
                    case 19:
                        return "Macro";
                    case 20:
                        return "Advanced Sports Shooting";
                    default:
                        switch (intValue) {
                            case 33:
                                return "Food";
                            case 34:
                                return "Panorama";
                            case 35:
                                return "Handheld Night Shot";
                            case C9024k.f24704g4 /*36*/:
                                return "Anti Motion Blur";
                            case 37:
                                return "Pet";
                            case 38:
                                return "Backlight Correction HDR";
                            case 39:
                                return "Superior Auto";
                            case C9024k.f24728k4 /*40*/:
                                return "Background Defocus";
                            case C9024k.f24734l4 /*41*/:
                                return "Soft Skin";
                            case C9024k.f24740m4 /*42*/:
                                return "3D Image";
                            default:
                                return String.format("Unknown (%d)", new Object[]{l});
                        }
                }
        }
    }

    /* renamed from: F */
    public String mo17367F() {
        return mo17191j(260, "%d EV");
    }

    /* renamed from: G */
    public String mo17368G() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45128);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == -32768) {
            return "Low";
        }
        if (intValue == 128) {
            return "n/a";
        }
        if (intValue == 32767) {
            return "High";
        }
        switch (intValue) {
            case -3:
                return "-3/3";
            case -2:
                return "-2/3";
            case -1:
                return "-1/3";
            case 0:
                return "Normal";
            case 1:
                return "+1/3";
            case 2:
                return "+2/3";
            case 3:
                return "+3/3";
            default:
                return "Unknown (" + l + ")";
        }
    }

    /* renamed from: H */
    public String mo17369H() {
        return mo17194m(8219, "Manual", null, "AF-A", "AF-C", "AF-S", null, "DMF", "AF-D");
    }

    /* renamed from: I */
    public String mo17370I() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(8201);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "On";
        }
        if (intValue == 2) {
            return "Normal";
        }
        if (intValue == 3) {
            return "High";
        }
        if (intValue == 256) {
            return "Auto";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        return String.format("Unknown (%d)", new Object[]{l});
    }

    /* renamed from: J */
    public String mo17371J() {
        return mo17194m(258, "RAW", "Super Fine", "Fine", "Standard", "Economy", "Extra Fine", "RAW + JPEG", "Compressed RAW", "Compressed RAW + JPEG");
    }

    /* renamed from: K */
    public String mo17372K() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45094);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        return intValue != 0 ? intValue != 1 ? "N/A" : "On" : "Off";
    }

    /* renamed from: L */
    public String mo17373L() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45127);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Normal";
        }
        if (intValue == 1) {
            return "Fine";
        }
        if (intValue == 2) {
            return "Extra Fine";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        return String.format("Unknown (%d)", new Object[]{l});
    }

    /* renamed from: M */
    public String mo17374M() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(8210);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == -1) {
            return "N/A";
        }
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 2) {
            return "Auto";
        }
        return String.format("Unknown (%d)", new Object[]{l});
    }

    /* renamed from: N */
    public String mo17375N() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45134);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "On";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        return String.format("Unknown (%d)", new Object[]{l});
    }

    /* renamed from: O */
    public String mo17376O() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45120);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "On";
        }
        if (intValue == 2) {
            return "Magnifying Glass/Super Macro";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        return String.format("Unknown (%d)", new Object[]{l});
    }

    /* renamed from: P */
    public String mo17377P() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(8206);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 13) {
            return "High Contrast Monochrome";
        }
        if (intValue == 80) {
            return "Rich-tone Monochrome";
        }
        if (intValue == 97) {
            return "Water Color";
        }
        if (intValue == 98) {
            return "Water Color 2";
        }
        switch (intValue) {
            case 0:
                return "Off";
            case 1:
                return "Toy Camera";
            case 2:
                return "Pop Color";
            case 3:
                return "Posterization";
            case 4:
                return "Posterization B/W";
            case 5:
                return "Retro Photo";
            case 6:
                return "Soft High Key";
            case 7:
                return "Partial Color (red)";
            case 8:
                return "Partial Color (green)";
            case 9:
                return "Partial Color (blue)";
            case 10:
                return "Partial Color (yellow)";
            default:
                switch (intValue) {
                    case 16:
                        return "Toy Camera (normal)";
                    case 17:
                        return "Toy Camera (cool)";
                    case 18:
                        return "Toy Camera (warm)";
                    case 19:
                        return "Toy Camera (green)";
                    case 20:
                        return "Toy Camera (magenta)";
                    default:
                        switch (intValue) {
                            case 32:
                                return "Soft Focus (low)";
                            case 33:
                                return "Soft Focus";
                            case 34:
                                return "Soft Focus (high)";
                            default:
                                switch (intValue) {
                                    case C9024k.f24764q4 /*48*/:
                                        return "Miniature (auto)";
                                    case C9024k.f24770r4 /*49*/:
                                        return "Miniature (top)";
                                    case 50:
                                        return "Miniature (middle horizontal)";
                                    case 51:
                                        return "Miniature (bottom)";
                                    case 52:
                                        return "Miniature (left)";
                                    case 53:
                                        return "Miniature (middle vertical)";
                                    case 54:
                                        return "Miniature (right)";
                                    default:
                                        switch (intValue) {
                                            case WebSocketProtocol.B0_FLAG_RSV1 /*64*/:
                                                return "HDR Painting (low)";
                                            case 65:
                                                return "HDR Painting";
                                            case 66:
                                                return "HDR Painting (high)";
                                            default:
                                                switch (intValue) {
                                                    case 112:
                                                        return "Illustration (low)";
                                                    case 113:
                                                        return "Illustration";
                                                    case C1444j.f4216D0:
                                                        return "Illustration (high)";
                                                    default:
                                                        return String.format("Unknown (%d)", new Object[]{l});
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: Q */
    public String mo17378Q() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45129);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Normal";
        }
        if (intValue == 2) {
            return "Continuous";
        }
        if (intValue == 65535) {
            return "n/a";
        }
        if (intValue == 5) {
            return "Exposure Bracketing";
        }
        if (intValue == 6) {
            return "White Balance Bracketing";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: R */
    public String mo17379R() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45091);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        switch (intValue) {
            case 0:
                return "Standard";
            case 1:
                return "Portrait";
            case 2:
                return "Text";
            case 3:
                return "Night Scene";
            case 4:
                return "Sunset";
            case 5:
                return "Sports";
            case 6:
                return "Landscape";
            case 7:
                return "Night Portrait";
            case 8:
                return "Macro";
            case 9:
                return "Super Macro";
            default:
                switch (intValue) {
                    case 16:
                        return "Auto";
                    case 17:
                        return "Night View/Portrait";
                    case 18:
                        return "Sweep Panorama";
                    case 19:
                        return "Handheld Night Shot";
                    case 20:
                        return "Anti Motion Blur";
                    case 21:
                        return "Cont. Priority AE";
                    case 22:
                        return "Auto+";
                    case 23:
                        return "3D Sweep Panorama";
                    case 24:
                        return "Superior Auto";
                    case 25:
                        return "High Sensitivity";
                    case 26:
                        return "Fireworks";
                    case 27:
                        return "Food";
                    case 28:
                        return "Pet";
                    default:
                        return "Unknown (" + l + ")";
                }
        }
    }

    /* renamed from: S */
    public String mo17380S() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45129);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        return intValue != 0 ? intValue != 65535 ? l.toString() : "n/a" : "Single";
    }

    /* renamed from: T */
    public String mo17381T() {
        return mo17194m(8207, "Off", "Low", "Mid", "High");
    }

    /* renamed from: U */
    public String mo17382U() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45057);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 2) {
            return "DSC-R1";
        }
        if (intValue == 269) {
            return "DSLR-A850";
        }
        if (intValue == 270) {
            return "DSLR-A850 (APS-C mode)";
        }
        switch (intValue) {
            case 256:
                return "DSLR-A100";
            case 257:
                return "DSLR-A900";
            case 258:
                return "DSLR-A700";
            case 259:
                return "DSLR-A200";
            case 260:
                return "DSLR-A350";
            case 261:
                return "DSLR-A300";
            case 262:
                return "DSLR-A900 (APS-C mode)";
            case 263:
                return "DSLR-A380/A390";
            case 264:
                return "DSLR-A330";
            case 265:
                return "DSLR-A230";
            case 266:
                return "DSLR-A290";
            default:
                switch (intValue) {
                    case 273:
                        return "DSLR-A550";
                    case 274:
                        return "DSLR-A500";
                    case 275:
                        return "DSLR-A450";
                    default:
                        switch (intValue) {
                            case 278:
                                return "NEX-5";
                            case 279:
                                return "NEX-3";
                            case 280:
                                return "SLT-A33";
                            case 281:
                                return "SLT-A55V";
                            case 282:
                                return "DSLR-A560";
                            case 283:
                                return "DSLR-A580";
                            case 284:
                                return "NEX-C3";
                            case 285:
                                return "SLT-A35";
                            case 286:
                                return "SLT-A65V";
                            case 287:
                                return "SLT-A77V";
                            case 288:
                                return "NEX-5N";
                            case 289:
                                return "NEX-7";
                            case 290:
                                return "NEX-VG20E";
                            case 291:
                                return "SLT-A37";
                            case 292:
                                return "SLT-A57";
                            case 293:
                                return "NEX-F3";
                            case 294:
                                return "SLT-A99V";
                            case 295:
                                return "NEX-6";
                            case 296:
                                return "NEX-5R";
                            case 297:
                                return "DSC-RX100";
                            case 298:
                                return "DSC-RX1";
                            default:
                                return "Unknown (" + l + ")";
                        }
                }
        }
    }

    /* renamed from: V */
    public String mo17383V() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(261);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "None";
        }
        if (intValue == 72) {
            return "Minolta/Sony AF 2x APO (D)";
        }
        if (intValue == 80) {
            return "Minolta AF 2x APO II";
        }
        if (intValue == 96) {
            return "Minolta AF 2x APO";
        }
        if (intValue == 136) {
            return "Minolta/Sony AF 1.4x APO (D)";
        }
        if (intValue == 144) {
            return "Minolta AF 1.4x APO II";
        }
        if (intValue == 160) {
            return "Minolta AF 1.4x APO";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: W */
    public String mo17384W() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(8209);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == -1) {
            return "N/A";
        }
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 2) {
            return "Auto";
        }
        return String.format("Unknown (%d)", new Object[]{l});
    }

    /* renamed from: X */
    public String mo17385X() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(277);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Auto";
        }
        if (intValue == 1) {
            return "Color Temperature/Color Filter";
        }
        if (intValue == 16) {
            return "Daylight";
        }
        if (intValue == 32) {
            return "Cloudy";
        }
        if (intValue == 48) {
            return "Shade";
        }
        if (intValue == 64) {
            return "Tungsten";
        }
        if (intValue == 80) {
            return "Flash";
        }
        if (intValue == 96) {
            return "Fluorescent";
        }
        if (intValue == 112) {
            return "Custom";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: Y */
    public String mo17386Y() {
        return mo17194m(45092, "ISO Setting Used", "High Key", "Low Key");
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        switch (i) {
            case 258:
                return mo17371J();
            case 260:
                return mo17367F();
            case 261:
                return mo17383V();
            case 277:
                return mo17385X();
            case 8201:
                return mo17370I();
            case 8206:
                return mo17377P();
            case 8207:
                return mo17381T();
            case 8209:
                return mo17384W();
            case 8210:
                return mo17374M();
            case 8211:
                return mo17364C();
            case 8214:
                return mo17391z();
            case 8219:
                return mo17369H();
            case 8222:
                return mo17389x();
            case 45057:
                return mo17382U();
            case 45089:
                return mo17363B();
            case 45091:
                return mo17379R();
            case 45092:
                return mo17386Y();
            case 45093:
                return mo17365D();
            case 45094:
                return mo17372K();
            case 45097:
                return mo17362A();
            case 45120:
                return mo17376O();
            case 45121:
                return mo17366E();
            case 45123:
                return mo17388w();
            case 45124:
                return mo17387v();
            case 45127:
                return mo17373L();
            case 45128:
                return mo17368G();
            case 45129:
                return mo17378Q();
            case 45130:
                return mo17380S();
            case 45131:
                return mo17390y();
            case 45134:
                return mo17375N();
            default:
                return super.mo17110f(i);
        }
    }

    /* renamed from: v */
    public String mo17387v() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45124);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "Auto";
        }
        if (intValue == 65535) {
            return "n/a";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: w */
    public String mo17388w() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45123);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Default";
        }
        if (intValue == 1) {
            return "Multi";
        }
        if (intValue == 2) {
            return "Center";
        }
        if (intValue == 3) {
            return "Spot";
        }
        if (intValue == 4) {
            return "Flexible Spot";
        }
        if (intValue == 6) {
            return "Touch";
        }
        if (intValue == 65535) {
            return "n/a";
        }
        if (intValue == 14) {
            return "Manual Focus";
        }
        if (intValue == 15) {
            return "Face Detected";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: x */
    public String mo17389x() {
        return mo17194m(8222, "Auto", "Center", "Top", "Upper-right", "Right", "Lower-right", "Bottom", "Lower-left", "Left", "Upper-left\t  \t", "Far Right", "Far Left", "Upper-middle", "Near Right", "Lower-middle", "Near Left", "Upper Far Right", "Lower Far Right", "Lower Far Left", "Upper Far Left");
    }

    /* renamed from: y */
    public String mo17390y() {
        Integer l = ((C5771d1) this.f16215a).mo17148l(45131);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "On (Continuous)";
        }
        if (intValue == 2) {
            return "On (Shooting)";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        return String.format("Unknown (%d)", new Object[]{l});
    }

    /* renamed from: z */
    public String mo17391z() {
        return mo17194m(8214, "No", "Yes");
    }
}
