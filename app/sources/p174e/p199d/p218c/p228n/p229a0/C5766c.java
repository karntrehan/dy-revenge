package p174e.p199d.p218c.p228n.p229a0;

import java.text.DecimalFormat;
import java.util.HashMap;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.p510ws.WebSocketProtocol;
import p027c.p028a.C1444j;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.n.a0.c */
public class C5766c extends C5739i<C5769d> {

    /* renamed from: b */
    private static final HashMap<Integer, String> f16276b;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f16276b = hashMap;
        hashMap.put(1, "Canon EF 50mm f/1.8");
        hashMap.put(2, "Canon EF 28mm f/2.8");
        hashMap.put(3, "Canon EF 135mm f/2.8 Soft");
        hashMap.put(4, "Canon EF 35-105mm f/3.5-4.5 or Sigma Lens");
        hashMap.put(5, "Canon EF 35-70mm f/3.5-4.5");
        hashMap.put(6, "Canon EF 28-70mm f/3.5-4.5 or Sigma or Tokina Lens");
        hashMap.put(7, "Canon EF 100-300mm f/5.6L");
        hashMap.put(8, "Canon EF 100-300mm f/5.6 or Sigma or Tokina Lens");
        hashMap.put(9, "Canon EF 70-210mm f/4");
        hashMap.put(10, "Canon EF 50mm f/2.5 Macro or Sigma Lens");
        hashMap.put(11, "Canon EF 35mm f/2");
        hashMap.put(13, "Canon EF 15mm f/2.8 Fisheye");
        hashMap.put(14, "Canon EF 50-200mm f/3.5-4.5L");
        hashMap.put(15, "Canon EF 50-200mm f/3.5-4.5");
        hashMap.put(16, "Canon EF 35-135mm f/3.5-4.5");
        hashMap.put(17, "Canon EF 35-70mm f/3.5-4.5A");
        hashMap.put(18, "Canon EF 28-70mm f/3.5-4.5");
        hashMap.put(20, "Canon EF 100-200mm f/4.5A");
        hashMap.put(21, "Canon EF 80-200mm f/2.8L");
        hashMap.put(22, "Canon EF 20-35mm f/2.8L or Tokina Lens");
        hashMap.put(23, "Canon EF 35-105mm f/3.5-4.5");
        hashMap.put(24, "Canon EF 35-80mm f/4-5.6 Power Zoom");
        hashMap.put(25, "Canon EF 35-80mm f/4-5.6 Power Zoom");
        hashMap.put(26, "Canon EF 100mm f/2.8 Macro or Other Lens");
        hashMap.put(27, "Canon EF 35-80mm f/4-5.6");
        hashMap.put(28, "Canon EF 80-200mm f/4.5-5.6 or Tamron Lens");
        hashMap.put(29, "Canon EF 50mm f/1.8 II");
        hashMap.put(30, "Canon EF 35-105mm f/4.5-5.6");
        hashMap.put(31, "Canon EF 75-300mm f/4-5.6 or Tamron Lens");
        hashMap.put(32, "Canon EF 24mm f/2.8 or Sigma Lens");
        hashMap.put(33, "Voigtlander or Carl Zeiss Lens");
        hashMap.put(35, "Canon EF 35-80mm f/4-5.6");
        hashMap.put(36, "Canon EF 38-76mm f/4.5-5.6");
        hashMap.put(37, "Canon EF 35-80mm f/4-5.6 or Tamron Lens");
        hashMap.put(38, "Canon EF 80-200mm f/4.5-5.6");
        hashMap.put(39, "Canon EF 75-300mm f/4-5.6");
        hashMap.put(40, "Canon EF 28-80mm f/3.5-5.6");
        hashMap.put(41, "Canon EF 28-90mm f/4-5.6");
        hashMap.put(42, "Canon EF 28-200mm f/3.5-5.6 or Tamron Lens");
        hashMap.put(43, "Canon EF 28-105mm f/4-5.6");
        hashMap.put(44, "Canon EF 90-300mm f/4.5-5.6");
        hashMap.put(45, "Canon EF-S 18-55mm f/3.5-5.6 [II]");
        hashMap.put(46, "Canon EF 28-90mm f/4-5.6");
        hashMap.put(47, "Zeiss Milvus 35mm f/2 or 50mm f/2");
        hashMap.put(48, "Canon EF-S 18-55mm f/3.5-5.6 IS");
        hashMap.put(49, "Canon EF-S 55-250mm f/4-5.6 IS");
        hashMap.put(50, "Canon EF-S 18-200mm f/3.5-5.6 IS");
        hashMap.put(51, "Canon EF-S 18-135mm f/3.5-5.6 IS");
        hashMap.put(52, "Canon EF-S 18-55mm f/3.5-5.6 IS II");
        hashMap.put(53, "Canon EF-S 18-55mm f/3.5-5.6 III");
        hashMap.put(54, "Canon EF-S 55-250mm f/4-5.6 IS II");
        hashMap.put(94, "Canon TS-E 17mm f/4L");
        hashMap.put(95, "Canon TS-E 24.0mm f/3.5 L II");
        hashMap.put(Integer.valueOf(C1444j.f4266N0), "Canon MP-E 65mm f/2.8 1-5x Macro Photo");
        hashMap.put(125, "Canon TS-E 24mm f/3.5L");
        hashMap.put(Integer.valueOf(WebSocketProtocol.PAYLOAD_SHORT), "Canon TS-E 45mm f/2.8");
        hashMap.put(127, "Canon TS-E 90mm f/2.8");
        hashMap.put(129, "Canon EF 300mm f/2.8L");
        hashMap.put(130, "Canon EF 50mm f/1.0L");
        hashMap.put(131, "Canon EF 28-80mm f/2.8-4L or Sigma Lens");
        hashMap.put(132, "Canon EF 1200mm f/5.6L");
        hashMap.put(134, "Canon EF 600mm f/4L IS");
        hashMap.put(135, "Canon EF 200mm f/1.8L");
        hashMap.put(136, "Canon EF 300mm f/2.8L");
        hashMap.put(137, "Canon EF 85mm f/1.2L or Sigma or Tamron Lens");
        hashMap.put(138, "Canon EF 28-80mm f/2.8-4L");
        hashMap.put(139, "Canon EF 400mm f/2.8L");
        hashMap.put(140, "Canon EF 500mm f/4.5L");
        hashMap.put(141, "Canon EF 500mm f/4.5L");
        hashMap.put(142, "Canon EF 300mm f/2.8L IS");
        hashMap.put(143, "Canon EF 500mm f/4L IS or Sigma Lens");
        hashMap.put(144, "Canon EF 35-135mm f/4-5.6 USM");
        hashMap.put(145, "Canon EF 100-300mm f/4.5-5.6 USM");
        hashMap.put(146, "Canon EF 70-210mm f/3.5-4.5 USM");
        hashMap.put(147, "Canon EF 35-135mm f/4-5.6 USM");
        hashMap.put(148, "Canon EF 28-80mm f/3.5-5.6 USM");
        hashMap.put(149, "Canon EF 100mm f/2 USM");
        hashMap.put(150, "Canon EF 14mm f/2.8L or Sigma Lens");
        hashMap.put(151, "Canon EF 200mm f/2.8L");
        hashMap.put(152, "Canon EF 300mm f/4L IS or Sigma Lens");
        hashMap.put(153, "Canon EF 35-350mm f/3.5-5.6L or Sigma or Tamron Lens");
        hashMap.put(154, "Canon EF 20mm f/2.8 USM or Zeiss Lens");
        hashMap.put(155, "Canon EF 85mm f/1.8 USM");
        hashMap.put(156, "Canon EF 28-105mm f/3.5-4.5 USM or Tamron Lens");
        hashMap.put(160, "Canon EF 20-35mm f/3.5-4.5 USM or Tamron or Tokina Lens");
        hashMap.put(161, "Canon EF 28-70mm f/2.8L or Sigma or Tamron Lens");
        hashMap.put(162, "Canon EF 200mm f/2.8L");
        hashMap.put(163, "Canon EF 300mm f/4L");
        hashMap.put(164, "Canon EF 400mm f/5.6L");
        hashMap.put(165, "Canon EF 70-200mm f/2.8 L");
        hashMap.put(166, "Canon EF 70-200mm f/2.8 L + 1.4x");
        hashMap.put(167, "Canon EF 70-200mm f/2.8 L + 2x");
        hashMap.put(168, "Canon EF 28mm f/1.8 USM or Sigma Lens");
        hashMap.put(169, "Canon EF 17-35mm f/2.8L or Sigma Lens");
        hashMap.put(170, "Canon EF 200mm f/2.8L II");
        hashMap.put(171, "Canon EF 300mm f/4L");
        hashMap.put(172, "Canon EF 400mm f/5.6L or Sigma Lens");
        hashMap.put(173, "Canon EF 180mm Macro f/3.5L or Sigma Lens");
        hashMap.put(174, "Canon EF 135mm f/2L or Other Lens");
        hashMap.put(175, "Canon EF 400mm f/2.8L");
        hashMap.put(176, "Canon EF 24-85mm f/3.5-4.5 USM");
        hashMap.put(177, "Canon EF 300mm f/4L IS");
        hashMap.put(178, "Canon EF 28-135mm f/3.5-5.6 IS");
        hashMap.put(179, "Canon EF 24mm f/1.4L");
        hashMap.put(180, "Canon EF 35mm f/1.4L or Other Lens");
        hashMap.put(181, "Canon EF 100-400mm f/4.5-5.6L IS + 1.4x or Sigma Lens");
        hashMap.put(182, "Canon EF 100-400mm f/4.5-5.6L IS + 2x or Sigma Lens");
        hashMap.put(183, "Canon EF 100-400mm f/4.5-5.6L IS or Sigma Lens");
        hashMap.put(184, "Canon EF 400mm f/2.8L + 2x");
        hashMap.put(185, "Canon EF 600mm f/4L IS");
        hashMap.put(186, "Canon EF 70-200mm f/4L");
        hashMap.put(187, "Canon EF 70-200mm f/4L + 1.4x");
        hashMap.put(188, "Canon EF 70-200mm f/4L + 2x");
        hashMap.put(189, "Canon EF 70-200mm f/4L + 2.8x");
        hashMap.put(190, "Canon EF 100mm f/2.8 Macro USM");
        hashMap.put(191, "Canon EF 400mm f/4 DO IS");
        hashMap.put(193, "Canon EF 35-80mm f/4-5.6 USM");
        hashMap.put(194, "Canon EF 80-200mm f/4.5-5.6 USM");
        hashMap.put(195, "Canon EF 35-105mm f/4.5-5.6 USM");
        hashMap.put(196, "Canon EF 75-300mm f/4-5.6 USM");
        hashMap.put(197, "Canon EF 75-300mm f/4-5.6 IS USM");
        hashMap.put(198, "Canon EF 50mm f/1.4 USM or Zeiss Lens");
        hashMap.put(199, "Canon EF 28-80mm f/3.5-5.6 USM");
        hashMap.put(200, "Canon EF 75-300mm f/4-5.6 USM");
        hashMap.put(201, "Canon EF 28-80mm f/3.5-5.6 USM");
        hashMap.put(202, "Canon EF 28-80mm f/3.5-5.6 USM IV");
        hashMap.put(208, "Canon EF 22-55mm f/4-5.6 USM");
        hashMap.put(209, "Canon EF 55-200mm f/4.5-5.6");
        hashMap.put(210, "Canon EF 28-90mm f/4-5.6 USM");
        hashMap.put(211, "Canon EF 28-200mm f/3.5-5.6 USM");
        hashMap.put(212, "Canon EF 28-105mm f/4-5.6 USM");
        hashMap.put(213, "Canon EF 90-300mm f/4.5-5.6 USM or Tamron Lens");
        hashMap.put(214, "Canon EF-S 18-55mm f/3.5-5.6 USM");
        hashMap.put(215, "Canon EF 55-200mm f/4.5-5.6 II USM");
        hashMap.put(217, "Tamron AF 18-270mm f/3.5-6.3 Di II VC PZD");
        hashMap.put(224, "Canon EF 70-200mm f/2.8L IS");
        hashMap.put(225, "Canon EF 70-200mm f/2.8L IS + 1.4x");
        hashMap.put(226, "Canon EF 70-200mm f/2.8L IS + 2x");
        hashMap.put(227, "Canon EF 70-200mm f/2.8L IS + 2.8x");
        hashMap.put(228, "Canon EF 28-105mm f/3.5-4.5 USM");
        hashMap.put(229, "Canon EF 16-35mm f/2.8L");
        hashMap.put(230, "Canon EF 24-70mm f/2.8L");
        hashMap.put(231, "Canon EF 17-40mm f/4L");
        hashMap.put(232, "Canon EF 70-300mm f/4.5-5.6 DO IS USM");
        hashMap.put(233, "Canon EF 28-300mm f/3.5-5.6L IS");
        hashMap.put(234, "Canon EF-S 17-85mm f/4-5.6 IS USM or Tokina Lens");
        hashMap.put(235, "Canon EF-S 10-22mm f/3.5-4.5 USM");
        hashMap.put(236, "Canon EF-S 60mm f/2.8 Macro USM");
        hashMap.put(237, "Canon EF 24-105mm f/4L IS");
        hashMap.put(238, "Canon EF 70-300mm f/4-5.6 IS USM");
        hashMap.put(239, "Canon EF 85mm f/1.2L II");
        hashMap.put(240, "Canon EF-S 17-55mm f/2.8 IS USM");
        hashMap.put(241, "Canon EF 50mm f/1.2L");
        hashMap.put(242, "Canon EF 70-200mm f/4L IS");
        hashMap.put(243, "Canon EF 70-200mm f/4L IS + 1.4x");
        hashMap.put(244, "Canon EF 70-200mm f/4L IS + 2x");
        hashMap.put(245, "Canon EF 70-200mm f/4L IS + 2.8x");
        hashMap.put(246, "Canon EF 16-35mm f/2.8L II");
        hashMap.put(247, "Canon EF 14mm f/2.8L II USM");
        hashMap.put(248, "Canon EF 200mm f/2L IS or Sigma Lens");
        hashMap.put(249, "Canon EF 800mm f/5.6L IS");
        hashMap.put(250, "Canon EF 24mm f/1.4L II or Sigma Lens");
        hashMap.put(251, "Canon EF 70-200mm f/2.8L IS II USM");
        hashMap.put(252, "Canon EF 70-200mm f/2.8L IS II USM + 1.4x");
        hashMap.put(253, "Canon EF 70-200mm f/2.8L IS II USM + 2x");
        hashMap.put(254, "Canon EF 100mm f/2.8L Macro IS USM");
        hashMap.put(255, "Sigma 24-105mm f/4 DG OS HSM | A or Other Sigma Lens");
        hashMap.put(488, "Canon EF-S 15-85mm f/3.5-5.6 IS USM");
        hashMap.put(489, "Canon EF 70-300mm f/4-5.6L IS USM");
        hashMap.put(490, "Canon EF 8-15mm f/4L Fisheye USM");
        hashMap.put(491, "Canon EF 300mm f/2.8L IS II USM");
        hashMap.put(492, "Canon EF 400mm f/2.8L IS II USM");
        hashMap.put(493, "Canon EF 500mm f/4L IS II USM or EF 24-105mm f4L IS USM");
        hashMap.put(494, "Canon EF 600mm f/4.0L IS II USM");
        hashMap.put(495, "Canon EF 24-70mm f/2.8L II USM");
        hashMap.put(496, "Canon EF 200-400mm f/4L IS USM");
        hashMap.put(499, "Canon EF 200-400mm f/4L IS USM + 1.4x");
        hashMap.put(502, "Canon EF 28mm f/2.8 IS USM");
        hashMap.put(503, "Canon EF 24mm f/2.8 IS USM");
        hashMap.put(504, "Canon EF 24-70mm f/4L IS USM");
        hashMap.put(505, "Canon EF 35mm f/2 IS USM");
        hashMap.put(506, "Canon EF 400mm f/4 DO IS II USM");
        hashMap.put(507, "Canon EF 16-35mm f/4L IS USM");
        hashMap.put(508, "Canon EF 11-24mm f/4L USM");
        hashMap.put(747, "Canon EF 100-400mm f/4.5-5.6L IS II USM");
        hashMap.put(750, "Canon EF 35mm f/1.4L II USM");
        hashMap.put(4142, "Canon EF-S 18-135mm f/3.5-5.6 IS STM");
        hashMap.put(4143, "Canon EF-M 18-55mm f/3.5-5.6 IS STM or Tamron Lens");
        hashMap.put(4144, "Canon EF 40mm f/2.8 STM");
        hashMap.put(4145, "Canon EF-M 22mm f/2 STM");
        hashMap.put(4146, "Canon EF-S 18-55mm f/3.5-5.6 IS STM");
        hashMap.put(4147, "Canon EF-M 11-22mm f/4-5.6 IS STM");
        hashMap.put(4148, "Canon EF-S 55-250mm f/4-5.6 IS STM");
        hashMap.put(4149, "Canon EF-M 55-200mm f/4.5-6.3 IS STM");
        hashMap.put(4150, "Canon EF-S 10-18mm f/4.5-5.6 IS STM");
        hashMap.put(4152, "Canon EF 24-105mm f/3.5-5.6 IS STM");
        hashMap.put(4153, "Canon EF-M 15-45mm f/3.5-6.3 IS STM");
        hashMap.put(4154, "Canon EF-S 24mm f/2.8 STM");
        hashMap.put(4156, "Canon EF 50mm f/1.8 STM");
        hashMap.put(36912, "Canon EF-S 18-135mm f/3.5-5.6 IS USM");
        hashMap.put(Integer.valueOf(Settings.DEFAULT_INITIAL_WINDOW_SIZE), "N/A");
    }

    public C5766c(C5769d dVar) {
        super(dVar);
    }

    /* renamed from: v */
    private double m21612v(int i) {
        int i2;
        if (i < 0) {
            i = -i;
            i2 = -1;
        } else {
            i2 = 1;
        }
        int i3 = i & 31;
        int i4 = i - i3;
        if (i3 == 12) {
            i3 = 10;
        } else if (i3 == 20) {
            i3 = 21;
        }
        return ((double) (i2 * (i4 + i3))) / 32.0d;
    }

    /* renamed from: A */
    public String mo17313A() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49413);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            Integer l2 = ((C5769d) this.f16215a).mo17148l(49410);
            return l2 != null ? l2.intValue() == 0 ? "Single shot" : "Single shot with self-timer" : "Continuous";
        } else if (intValue == 1) {
            return "Continuous";
        } else {
            return "Unknown (" + l + ")";
        }
    }

    /* renamed from: B */
    public String mo17314B() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49421);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Normal";
        }
        if (intValue == 1) {
            return "High";
        }
        if (intValue == 65535) {
            return "Low";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: C */
    public String mo17315C() {
        return mo17194m(49420, "No digital zoom", "2x", "4x");
    }

    /* renamed from: D */
    public String mo17316D() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49441);
        if (l == null) {
            return null;
        }
        return l.intValue() == 65535 ? l.toString() : C5739i.m21432h((double) (((float) l.intValue()) / 10.0f));
    }

    /* renamed from: E */
    public String mo17317E() {
        return mo17194m(49419, "Full auto", "Manual", "Landscape", "Fast shutter", "Slow shutter", "Night", "B&W", "Sepia", "Portrait", "Sports", "Macro / Closeup", "Pan focus");
    }

    /* renamed from: F */
    public String mo17318F() {
        return mo17194m(49428, "Easy shooting", "Program", "Tv-priority", "Av-priority", "Manual", "A-DEP");
    }

    /* renamed from: G */
    public String mo17319G() {
        return mo17194m(49436, "Flash did not fire", "Flash fired");
    }

    /* renamed from: H */
    public String mo17320H() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49679);
        if (l == null) {
            return null;
        }
        boolean z = false;
        if (l.intValue() > 61440) {
            l = Integer.valueOf(Integer.valueOf(Settings.DEFAULT_INITIAL_WINDOW_SIZE - l.intValue()).intValue() + 1);
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "-" : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(Float.toString(((float) l.intValue()) / 32.0f));
        sb.append(" EV");
        return sb.toString();
    }

    /* renamed from: I */
    public String mo17321I() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49437);
        if (l == null) {
            return null;
        }
        if (((l.intValue() >> 14) & 1) != 0) {
            return "External E-TTL";
        }
        if (((l.intValue() >> 13) & 1) != 0) {
            return "Internal flash";
        }
        if (((l.intValue() >> 11) & 1) != 0) {
            return "FP sync used";
        }
        if (((l.intValue() >> 4) & 1) != 0) {
            return "FP sync enabled";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: J */
    public String mo17322J() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49412);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 16) {
            return "External flash";
        }
        switch (intValue) {
            case 0:
                return "No flash fired";
            case 1:
                return "Auto";
            case 2:
                return "On";
            case 3:
                return "Red-eye reduction";
            case 4:
                return "Slow-synchro";
            case 5:
                return "Auto and red-eye reduction";
            case 6:
                return "On and red-eye reduction";
            default:
                return "Unknown (" + l + ")";
        }
    }

    /* renamed from: K */
    public String mo17323K() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49433);
        if (l == null) {
            return null;
        }
        return l.intValue() != 0 ? Integer.toString(l.intValue()) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* renamed from: L */
    public String mo17324L() {
        return mo17193l(49438, 0, "Single", "Continuous", null, null, null, null, null, null, "Manual");
    }

    /* renamed from: M */
    public String mo17325M() {
        return mo17194m(49415, "One-shot", "AI Servo", "AI Focus", "Manual Focus", "Single", "Continuous", "Manual Focus");
    }

    /* renamed from: N */
    public String mo17326N() {
        return mo17194m(49440, "Single", "Continuous");
    }

    /* renamed from: O */
    public String mo17327O() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49426);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Manual";
        }
        if (intValue == 1) {
            return "Auto";
        }
        if (intValue == 3) {
            return "Close-up (Macro)";
        }
        if (intValue == 8) {
            return "Locked (Pan Mode)";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: P */
    public String mo17328P() {
        return mo17194m(49418, "Large", "Medium", "Small");
    }

    /* renamed from: Q */
    public String mo17329Q() {
        StringBuilder sb;
        Integer l = ((C5769d) this.f16215a).mo17148l(49424);
        if (l == null) {
            return null;
        }
        if ((l.intValue() & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            sb = new StringBuilder();
            sb.append(HttpUrl.FRAGMENT_ENCODE_SET);
            sb.append(l.intValue() & -16385);
        } else {
            int intValue = l.intValue();
            if (intValue != 0) {
                switch (intValue) {
                    case 15:
                        return "Auto";
                    case 16:
                        return "50";
                    case 17:
                        return "100";
                    case 18:
                        return "200";
                    case 19:
                        return "400";
                    default:
                        sb = new StringBuilder();
                        sb.append("Unknown (");
                        sb.append(l);
                        sb.append(")");
                        break;
                }
            } else {
                return "Not specified (see ISOSpeedRatings tag)";
            }
        }
        return sb.toString();
    }

    /* renamed from: R */
    public String mo17330R() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49430);
        if (l == null) {
            return null;
        }
        HashMap<Integer, String> hashMap = f16276b;
        if (hashMap.containsKey(l)) {
            return hashMap.get(l);
        }
        return String.format("Unknown (%d)", new Object[]{l});
    }

    /* renamed from: S */
    public String mo17331S() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49431);
        if (l == null) {
            return null;
        }
        String K = mo17323K();
        return Integer.toString(l.intValue()) + " " + K;
    }

    /* renamed from: T */
    public String mo17332T() {
        return mo17193l(49409, 1, "Macro", "Normal");
    }

    /* renamed from: U */
    public String mo17333U() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49447);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "n/a";
        }
        if (intValue == 1280) {
            return "Full";
        }
        if (intValue == 1282) {
            return "Medium";
        }
        if (intValue == 1284) {
            return "Low";
        }
        if (intValue == 32767) {
            return "n/a";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: V */
    public String mo17334V() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49434);
        if (l == null) {
            return null;
        }
        if (l.intValue() <= 512) {
            return C5739i.m21432h(Math.exp((m21612v(l.intValue()) * Math.log(2.0d)) / 2.0d));
        }
        return String.format("Unknown (%d)", new Object[]{l});
    }

    /* renamed from: W */
    public String mo17335W() {
        return mo17193l(49425, 3, "Evaluative", "Partial", "Centre weighted");
    }

    /* renamed from: X */
    public String mo17336X() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49435);
        if (l == null) {
            return null;
        }
        if (l.intValue() <= 512) {
            return C5739i.m21432h(Math.exp((m21612v(l.intValue()) * Math.log(2.0d)) / 2.0d));
        }
        return String.format("Unknown (%d)", new Object[]{l});
    }

    /* renamed from: Y */
    public String mo17337Y() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49446);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 100) {
            return "My Color Data";
        }
        switch (intValue) {
            case 0:
                return "Off";
            case 1:
                return "Vivid";
            case 2:
                return "Neutral";
            case 3:
                return "Smooth";
            case 4:
                return "Sepia";
            case 5:
                return "B&W";
            case 6:
                return "Custom";
            default:
                return "Unknown (" + l + ")";
        }
    }

    /* renamed from: Z */
    public String mo17338Z() {
        return mo17193l(49411, 2, "Normal", "Fine", null, "Superfine");
    }

    /* renamed from: a0 */
    public String mo17339a0() {
        return mo17193l(49417, 1, "JPEG", "CRW+THM", "AVI+THM", "TIF", "TIF+JPEG", "CR2", "CR2+JPEG", null, "MOV", "MP4");
    }

    /* renamed from: b0 */
    public String mo17340b0() {
        return mo17193l(49453, 0, "n/a", "sRAW1 (mRAW)", "sRAW2 (sRAW)");
    }

    /* renamed from: c0 */
    public String mo17341c0() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49422);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Normal";
        }
        if (intValue == 1) {
            return "High";
        }
        if (intValue == 65535) {
            return "Low";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: d0 */
    public String mo17342d0() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49410);
        if (l == null) {
            return null;
        }
        if (l.intValue() == 0) {
            return "Self timer not used";
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        return decimalFormat.format(((double) l.intValue()) * 0.1d) + " sec";
    }

    /* renamed from: e0 */
    public String mo17343e0() {
        Integer l = ((C5769d) this.f16215a).mo17148l(12);
        if (l == null) {
            return null;
        }
        return String.format("%04X%05d", new Object[]{Integer.valueOf((l.intValue() >> 8) & 255), Integer.valueOf(l.intValue() & 255)});
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        switch (i) {
            case 12:
                return mo17343e0();
            case 49415:
                return mo17325M();
            case 49449:
                return mo17352z();
            case 49453:
                return mo17340b0();
            case 49671:
                return mo17348j0();
            case 53770:
                return mo17347i0();
            default:
                switch (i) {
                    case 49409:
                        return mo17332T();
                    case 49410:
                        return mo17342d0();
                    case 49411:
                        return mo17338Z();
                    case 49412:
                        return mo17322J();
                    case 49413:
                        return mo17313A();
                    default:
                        switch (i) {
                            case 49417:
                                return mo17339a0();
                            case 49418:
                                return mo17328P();
                            case 49419:
                                return mo17317E();
                            case 49420:
                                return mo17315C();
                            case 49421:
                                return mo17314B();
                            case 49422:
                                return mo17341c0();
                            case 49423:
                                return mo17344f0();
                            case 49424:
                                return mo17329Q();
                            case 49425:
                                return mo17335W();
                            case 49426:
                                return mo17327O();
                            case 49427:
                                return mo17350x();
                            case 49428:
                                return mo17318F();
                            default:
                                switch (i) {
                                    case 49430:
                                        return mo17330R();
                                    case 49431:
                                        return mo17331S();
                                    case 49432:
                                        return mo17345g0();
                                    case 49433:
                                        return mo17323K();
                                    case 49434:
                                        return mo17334V();
                                    case 49435:
                                        return mo17336X();
                                    case 49436:
                                        return mo17319G();
                                    case 49437:
                                        return mo17321I();
                                    case 49438:
                                        return mo17324L();
                                    case 49439:
                                        return mo17349w();
                                    case 49440:
                                        return mo17326N();
                                    case 49441:
                                        return mo17316D();
                                    default:
                                        switch (i) {
                                            case 49445:
                                                return mo17346h0();
                                            case 49446:
                                                return mo17337Y();
                                            case 49447:
                                                return mo17333U();
                                            default:
                                                switch (i) {
                                                    case 49678:
                                                        return mo17351y();
                                                    case 49679:
                                                        return mo17320H();
                                                    default:
                                                        return super.mo17110f(i);
                                                }
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: f0 */
    public String mo17344f0() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49423);
        if (l == null) {
            return null;
        }
        int intValue = l.intValue();
        if (intValue == 0) {
            return "Normal";
        }
        if (intValue == 1) {
            return "High";
        }
        if (intValue == 65535) {
            return "Low";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: g0 */
    public String mo17345g0() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49432);
        if (l == null) {
            return null;
        }
        String K = mo17323K();
        return Integer.toString(l.intValue()) + " " + K;
    }

    /* renamed from: h0 */
    public String mo17346h0() {
        return mo17193l(49445, 0, "Center", "AF Point");
    }

    /* renamed from: i0 */
    public String mo17347i0() {
        Integer l = ((C5769d) this.f16215a).mo17148l(53770);
        if (l == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            if ((l.intValue() & (1 << i)) != 0) {
                if (sb.length() != 0) {
                    sb.append(',');
                }
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "None" : sb.toString();
    }

    /* renamed from: j0 */
    public String mo17348j0() {
        return mo17194m(49671, "Auto", "Sunny", "Cloudy", "Tungsten", "Florescent", "Flash", "Custom");
    }

    /* renamed from: w */
    public String mo17349w() {
        return mo17193l(49439, 0, "Normal AE", "Exposure Compensation", "AE Lock", "AE Lock + Exposure Comp.", "No AE");
    }

    /* renamed from: x */
    public String mo17350x() {
        return mo17193l(49427, 12288, "None (MF)", "Auto selected", "Right", "Centre", "Left");
    }

    /* renamed from: y */
    public String mo17351y() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49678);
        if (l == null) {
            return null;
        }
        if ((l.intValue() & 7) == 0) {
            return "Right";
        }
        if ((l.intValue() & 7) == 1) {
            return "Centre";
        }
        if ((l.intValue() & 7) == 2) {
            return "Left";
        }
        return "Unknown (" + l + ")";
    }

    /* renamed from: z */
    public String mo17352z() {
        Integer l = ((C5769d) this.f16215a).mo17148l(49449);
        if (l == null) {
            return null;
        }
        return l.intValue() == 32767 ? "n/a" : l.toString();
    }
}
