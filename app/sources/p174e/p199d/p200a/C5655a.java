package p174e.p199d.p200a;

/* renamed from: e.d.a.a */
public enum C5655a {
    Unknown("Unknown", "Unknown", (String) null, new String[0]),
    Jpeg("JPEG", "Joint Photographic Experts Group", "image/jpeg", "jpg", "jpeg", "jpe"),
    Tiff("TIFF", "Tagged Image File Format", "image/tiff", "tiff", "tif"),
    Psd("PSD", "Photoshop Document", "image/vnd.adobe.photoshop", "psd"),
    Png("PNG", "Portable Network Graphics", "image/png", "png"),
    Bmp("BMP", "Device Independent Bitmap", "image/bmp", "bmp"),
    Gif("GIF", "Graphics Interchange Format", "image/gif", "gif"),
    Ico("ICO", "Windows Icon", "image/x-icon", "ico"),
    Pcx("PCX", "PiCture eXchange", "image/x-pcx", "pcx"),
    Riff("RIFF", "Resource Interchange File Format", (String) null, new String[0]),
    Wav("WAV", "Waveform Audio File Format", "audio/vnd.wave", "wav", "wave"),
    Avi("AVI", "Audio Video Interleaved", "video/vnd.avi", "avi"),
    WebP("WebP", "WebP", "image/webp", "webp"),
    Mov("MOV", "QuickTime Movie", "video/quicktime", "mov", "qt"),
    Mp4("MP4", "MPEG-4 Part 14", "video/mp4", "mp4", "m4a", "m4p", "m4b", "m4r", "m4v"),
    Heif("HEIF", "High Efficiency Image File Format", "image/heif", "heif", "heic"),
    Eps("EPS", "Encapsulated PostScript", "application/postscript", "eps", "epsf", "epsi"),
    Arw("ARW", "Sony Camera Raw", (String) null, "arw"),
    Crw("CRW", "Canon Camera Raw", (String) null, "crw"),
    Cr2("CR2", "Canon Camera Raw", (String) null, "cr2"),
    Nef("NEF", "Nikon Camera Raw", (String) null, "nef"),
    Orf("ORF", "Olympus Camera Raw", (String) null, "orf"),
    Raf("RAF", "FujiFilm Camera Raw", (String) null, "raf"),
    Rw2("RW2", "Panasonic Camera Raw", (String) null, "rw2"),
    Aac("AAC", "Advanced Audio Coding", "audio/aac", "m4a"),
    Asf("ASF", "Advanced Systems Format", "video/x-ms-asf", "asf", "wma", "wmv"),
    Cfbf("CFBF", "Compound File Binary Format", (String) null, (String) null),
    Flv("FLV", "Flash Video", "video/x-flv", ".flv", ".f4v,"),
    Indd("INDD", "INDesign Document", "application/octet-stream", ".indd"),
    Mxf("MXF", "Material Exchange Format", "application/mxf", "mxf"),
    Pdf("PDF", "Portable Document Format", "application/pdf", "pdf"),
    Qxp("QXP", "Quark XPress Document", (String) null, "qzp", "qxd"),
    Ram("RAM", "RealAudio", "audio/vnd.rn-realaudio", "aac", "ra"),
    Rtf("RTF", "Rich Text Format", "application/rtf", "rtf"),
    Sit("SIT", "Stuffit Archive", "application/x-stuffit", "sit"),
    Sitx("SITX", "Stuffit X Archive", "application/x-stuffitx", "sitx"),
    Swf("SWF", "Small Web Format", "application/vnd.adobe.flash-movie", "swf"),
    Vob("VOB", "Video Object", "video/dvd", ".vob"),
    Zip("ZIP", "ZIP Archive", "application/zip", ".zip", ".zipx");
    

    /* renamed from: b0 */
    private final String f16023b0;

    /* renamed from: c0 */
    private final String f16024c0;

    /* renamed from: d0 */
    private final String f16025d0;

    /* renamed from: e0 */
    private final String[] f16026e0;

    private C5655a(String str, String str2, String str3, String... strArr) {
        this.f16023b0 = str;
        this.f16024c0 = str2;
        this.f16025d0 = str3;
        this.f16026e0 = strArr;
    }

    /* renamed from: e */
    public String mo16934e() {
        String[] strArr = this.f16026e0;
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return strArr[0];
    }

    /* renamed from: g */
    public String mo16935g() {
        return this.f16024c0;
    }

    /* renamed from: h */
    public String mo16936h() {
        return this.f16025d0;
    }

    /* renamed from: v */
    public String mo16937v() {
        return this.f16023b0;
    }
}
