package p174e.p199d.p218c.p234s;

import p174e.p199d.p217b.C5717r;
import p174e.p199d.p218c.C5739i;

/* renamed from: e.d.c.s.a */
public class C5864a extends C5739i<C5865b> {
    public C5864a(C5865b bVar) {
        super(bVar);
    }

    /* renamed from: A */
    public String mo17782A() {
        return mo17793w(549);
    }

    /* renamed from: B */
    public String mo17783B() {
        return mo17790I(550);
    }

    /* renamed from: C */
    public String mo17784C() {
        Integer l = ((C5865b) this.f16215a).mo17148l(276);
        if (l == null) {
            return null;
        }
        switch (l.intValue()) {
            case 0:
                return "No ObjectData";
            case 1:
                return "IPTC-NAA Digital Newsphoto Parameter Record";
            case 2:
                return "IPTC7901 Recommended Message Format";
            case 3:
                return "Tagged Image File Format (Adobe/Aldus Image data)";
            case 4:
                return "Illustrator (Adobe Graphics data)";
            case 5:
                return "AppleSingle (Apple Computer Inc)";
            case 6:
                return "NAA 89-3 (ANPA 1312)";
            case 7:
                return "MacBinary II";
            case 8:
                return "IPTC Unstructured Character Oriented File Format (UCOFF)";
            case 9:
                return "United Press International ANPA 1312 variant";
            case 10:
                return "United Press International Down-Load Message";
            case 11:
                return "JPEG File Interchange (JFIF)";
            case 12:
                return "Photo-CD Image-Pac (Eastman Kodak)";
            case 13:
                return "Bit Mapped Graphics File [.BMP] (Microsoft)";
            case 14:
                return "Digital Audio File [.WAV] (Microsoft & Creative Labs)";
            case 15:
                return "Audio plus Moving Video [.AVI] (Microsoft)";
            case 16:
                return "PC DOS/Windows Executable Files [.COM][.EXE]";
            case 17:
                return "Compressed Binary File [.ZIP] (PKWare Inc)";
            case 18:
                return "Audio Interchange File Format AIFF (Apple Computer Inc)";
            case 19:
                return "RIFF Wave (Microsoft Corporation)";
            case 20:
                return "Freehand (Macromedia/Aldus)";
            case 21:
                return "Hypertext Markup Language [.HTML] (The Internet Society)";
            case 22:
                return "MPEG 2 Audio Layer 2 (Musicom), ISO/IEC";
            case 23:
                return "MPEG 2 Audio Layer 3, ISO/IEC";
            case 24:
                return "Portable Document File [.PDF] Adobe";
            case 25:
                return "News Industry Text Format (NITF)";
            case 26:
                return "Tape Archive [.TAR]";
            case 27:
                return "Tidningarnas Telegrambyra NITF version (TTNITF DTD)";
            case 28:
                return "Ritzaus Bureau NITF version (RBNITF DTD)";
            case 29:
                return "Corel Draw [.CDR]";
            default:
                return String.format("Unknown (%d)", new Object[]{l});
        }
    }

    /* renamed from: D */
    public String mo17785D() {
        String[] s = ((C5865b) this.f16215a).mo17154s(537);
        if (s == null) {
            return null;
        }
        return C5717r.m21301b(s, ";");
    }

    /* renamed from: E */
    public String mo17786E() {
        return mo17793w(559);
    }

    /* renamed from: F */
    public String mo17787F() {
        return mo17793w(542);
    }

    /* renamed from: G */
    public String mo17788G() {
        return mo17790I(547);
    }

    /* renamed from: H */
    public String mo17789H() {
        return mo17790I(572);
    }

    /* renamed from: I */
    public String mo17790I(int i) {
        String r = ((C5865b) this.f16215a).mo17153r(i);
        if (r == null) {
            return null;
        }
        if (r.length() != 6 && r.length() != 11) {
            return r;
        }
        return r.substring(0, 2) + ':' + r.substring(2, 4) + ':' + r.substring(4);
    }

    /* renamed from: J */
    public String mo17791J() {
        return mo17790I(336);
    }

    /* renamed from: f */
    public String mo17110f(int i) {
        return i != 276 ? i != 326 ? i != 336 ? i != 537 ? i != 542 ? i != 547 ? i != 559 ? i != 567 ? i != 572 ? i != 549 ? i != 550 ? i != 574 ? i != 575 ? super.mo17110f(i) : mo17796z() : mo17795y() : mo17783B() : mo17782A() : mo17789H() : mo17792v() : mo17786E() : mo17788G() : mo17787F() : mo17785D() : mo17791J() : mo17794x() : mo17784C();
    }

    /* renamed from: v */
    public String mo17792v() {
        return mo17793w(567);
    }

    /* renamed from: w */
    public String mo17793w(int i) {
        String r = ((C5865b) this.f16215a).mo17153r(i);
        if (r == null) {
            return null;
        }
        if (r.length() != 8) {
            return r;
        }
        return r.substring(0, 4) + ':' + r.substring(4, 6) + ':' + r.substring(6);
    }

    /* renamed from: x */
    public String mo17794x() {
        return mo17793w(326);
    }

    /* renamed from: y */
    public String mo17795y() {
        return mo17793w(574);
    }

    /* renamed from: z */
    public String mo17796z() {
        return mo17790I(575);
    }
}
