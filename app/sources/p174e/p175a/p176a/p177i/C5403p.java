package p174e.p175a.p176a.p177i;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import p174e.p175a.p176a.C5377b;
import p174e.p175a.p176a.C5381f;
import p174e.p175a.p176a.p179j.C5409a;
import p174e.p175a.p176a.p180k.C5414a;

/* renamed from: e.a.a.i.p */
public final class C5403p implements C5381f {

    /* renamed from: a */
    private Map f15092a = new HashMap();

    /* renamed from: b */
    private Map f15093b = new HashMap();

    /* renamed from: c */
    private Map f15094c = new HashMap();

    /* renamed from: d */
    private Pattern f15095d = Pattern.compile("[/*?\\[\\]]");

    /* renamed from: e.a.a.i.p$a */
    class C5404a implements C5414a {

        /* renamed from: a */
        final /* synthetic */ String f15096a;

        /* renamed from: b */
        final /* synthetic */ String f15097b;

        /* renamed from: c */
        final /* synthetic */ String f15098c;

        /* renamed from: d */
        final /* synthetic */ C5409a f15099d;

        C5404a(String str, String str2, String str3, C5409a aVar) {
            this.f15096a = str;
            this.f15097b = str2;
            this.f15098c = str3;
            this.f15099d = aVar;
        }

        /* renamed from: a */
        public String mo16294a() {
            return this.f15096a;
        }

        /* renamed from: b */
        public String mo16295b() {
            return this.f15097b;
        }

        /* renamed from: c */
        public String mo16296c() {
            return this.f15098c;
        }

        /* renamed from: d */
        public C5409a mo16297d() {
            return this.f15099d;
        }

        public String toString() {
            return this.f15097b + this.f15098c + " NS(" + this.f15096a + "), FORM (" + mo16297d() + ")";
        }
    }

    public C5403p() {
        try {
            m20078g();
            m20077f();
        } catch (C5377b unused) {
            throw new RuntimeException("The XMPSchemaRegistry cannot be initialized!");
        }
    }

    /* renamed from: f */
    private void m20077f() {
        C5409a l = new C5409a().mo16317l(true);
        C5409a k = new C5409a().mo16316k(true);
        mo16293e("http://ns.adobe.com/xap/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", l);
        mo16293e("http://ns.adobe.com/xap/1.0/", "Authors", "http://purl.org/dc/elements/1.1/", "creator", (C5409a) null);
        mo16293e("http://ns.adobe.com/xap/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", (C5409a) null);
        mo16293e("http://ns.adobe.com/xap/1.0/", "Format", "http://purl.org/dc/elements/1.1/", "format", (C5409a) null);
        mo16293e("http://ns.adobe.com/xap/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", (C5409a) null);
        mo16293e("http://ns.adobe.com/xap/1.0/", "Locale", "http://purl.org/dc/elements/1.1/", "language", (C5409a) null);
        mo16293e("http://ns.adobe.com/xap/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", (C5409a) null);
        mo16293e("http://ns.adobe.com/xap/1.0/rights/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", (C5409a) null);
        mo16293e("http://ns.adobe.com/pdf/1.3/", "Author", "http://purl.org/dc/elements/1.1/", "creator", l);
        mo16293e("http://ns.adobe.com/pdf/1.3/", "BaseURL", "http://ns.adobe.com/xap/1.0/", "BaseURL", (C5409a) null);
        mo16293e("http://ns.adobe.com/pdf/1.3/", "CreationDate", "http://ns.adobe.com/xap/1.0/", "CreateDate", (C5409a) null);
        mo16293e("http://ns.adobe.com/pdf/1.3/", "Creator", "http://ns.adobe.com/xap/1.0/", "CreatorTool", (C5409a) null);
        mo16293e("http://ns.adobe.com/pdf/1.3/", "ModDate", "http://ns.adobe.com/xap/1.0/", "ModifyDate", (C5409a) null);
        C5409a aVar = k;
        mo16293e("http://ns.adobe.com/pdf/1.3/", "Subject", "http://purl.org/dc/elements/1.1/", "description", aVar);
        mo16293e("http://ns.adobe.com/pdf/1.3/", "Title", "http://purl.org/dc/elements/1.1/", "title", aVar);
        mo16293e("http://ns.adobe.com/photoshop/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", l);
        mo16293e("http://ns.adobe.com/photoshop/1.0/", "Caption", "http://purl.org/dc/elements/1.1/", "description", aVar);
        mo16293e("http://ns.adobe.com/photoshop/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", aVar);
        mo16293e("http://ns.adobe.com/photoshop/1.0/", "Keywords", "http://purl.org/dc/elements/1.1/", "subject", (C5409a) null);
        mo16293e("http://ns.adobe.com/photoshop/1.0/", "Marked", "http://ns.adobe.com/xap/1.0/rights/", "Marked", (C5409a) null);
        mo16293e("http://ns.adobe.com/photoshop/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", k);
        mo16293e("http://ns.adobe.com/photoshop/1.0/", "WebStatement", "http://ns.adobe.com/xap/1.0/rights/", "WebStatement", (C5409a) null);
        mo16293e("http://ns.adobe.com/tiff/1.0/", "Artist", "http://purl.org/dc/elements/1.1/", "creator", l);
        mo16293e("http://ns.adobe.com/tiff/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", (C5409a) null);
        mo16293e("http://ns.adobe.com/tiff/1.0/", "DateTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", (C5409a) null);
        mo16293e("http://ns.adobe.com/tiff/1.0/", "ImageDescription", "http://purl.org/dc/elements/1.1/", "description", (C5409a) null);
        mo16293e("http://ns.adobe.com/tiff/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", (C5409a) null);
        mo16293e("http://ns.adobe.com/png/1.0/", "Author", "http://purl.org/dc/elements/1.1/", "creator", l);
        mo16293e("http://ns.adobe.com/png/1.0/", "Copyright", "http://purl.org/dc/elements/1.1/", "rights", k);
        mo16293e("http://ns.adobe.com/png/1.0/", "CreationTime", "http://ns.adobe.com/xap/1.0/", "CreateDate", (C5409a) null);
        mo16293e("http://ns.adobe.com/png/1.0/", "Description", "http://purl.org/dc/elements/1.1/", "description", k);
        mo16293e("http://ns.adobe.com/png/1.0/", "ModificationTime", "http://ns.adobe.com/xap/1.0/", "ModifyDate", (C5409a) null);
        mo16293e("http://ns.adobe.com/png/1.0/", "Software", "http://ns.adobe.com/xap/1.0/", "CreatorTool", (C5409a) null);
        mo16293e("http://ns.adobe.com/png/1.0/", "Title", "http://purl.org/dc/elements/1.1/", "title", k);
    }

    /* renamed from: g */
    private void m20078g() {
        mo16212c("http://www.w3.org/XML/1998/namespace", "xml");
        mo16212c("http://www.w3.org/1999/02/22-rdf-syntax-ns#", "rdf");
        mo16212c("http://purl.org/dc/elements/1.1/", "dc");
        mo16212c("http://iptc.org/std/Iptc4xmpCore/1.0/xmlns/", "Iptc4xmpCore");
        mo16212c("http://iptc.org/std/Iptc4xmpExt/2008-02-29/", "Iptc4xmpExt");
        mo16212c("http://ns.adobe.com/DICOM/", "DICOM");
        mo16212c("http://ns.useplus.org/ldf/xmp/1.0/", "plus");
        mo16212c("adobe:ns:meta/", "x");
        mo16212c("http://ns.adobe.com/iX/1.0/", "iX");
        mo16212c("http://ns.adobe.com/xap/1.0/", "xmp");
        mo16212c("http://ns.adobe.com/xap/1.0/rights/", "xmpRights");
        mo16212c("http://ns.adobe.com/xap/1.0/mm/", "xmpMM");
        mo16212c("http://ns.adobe.com/xap/1.0/bj/", "xmpBJ");
        mo16212c("http://ns.adobe.com/xmp/note/", "xmpNote");
        mo16212c("http://ns.adobe.com/pdf/1.3/", "pdf");
        mo16212c("http://ns.adobe.com/pdfx/1.3/", "pdfx");
        mo16212c("http://www.npes.org/pdfx/ns/id/", "pdfxid");
        mo16212c("http://www.aiim.org/pdfa/ns/schema#", "pdfaSchema");
        mo16212c("http://www.aiim.org/pdfa/ns/property#", "pdfaProperty");
        mo16212c("http://www.aiim.org/pdfa/ns/type#", "pdfaType");
        mo16212c("http://www.aiim.org/pdfa/ns/field#", "pdfaField");
        mo16212c("http://www.aiim.org/pdfa/ns/id/", "pdfaid");
        mo16212c("http://www.aiim.org/pdfa/ns/extension/", "pdfaExtension");
        mo16212c("http://ns.adobe.com/photoshop/1.0/", "photoshop");
        mo16212c("http://ns.adobe.com/album/1.0/", "album");
        mo16212c("http://ns.adobe.com/exif/1.0/", "exif");
        mo16212c("http://cipa.jp/exif/1.0/", "exifEX");
        mo16212c("http://ns.adobe.com/exif/1.0/aux/", "aux");
        mo16212c("http://ns.adobe.com/tiff/1.0/", "tiff");
        mo16212c("http://ns.adobe.com/png/1.0/", "png");
        mo16212c("http://ns.adobe.com/jpeg/1.0/", "jpeg");
        mo16212c("http://ns.adobe.com/jp2k/1.0/", "jp2k");
        mo16212c("http://ns.adobe.com/camera-raw-settings/1.0/", "crs");
        mo16212c("http://ns.adobe.com/StockPhoto/1.0/", "bmsp");
        mo16212c("http://ns.adobe.com/creatorAtom/1.0/", "creatorAtom");
        mo16212c("http://ns.adobe.com/asf/1.0/", "asf");
        mo16212c("http://ns.adobe.com/xmp/wav/1.0/", "wav");
        mo16212c("http://ns.adobe.com/bwf/bext/1.0/", "bext");
        mo16212c("http://ns.adobe.com/riff/info/", "riffinfo");
        mo16212c("http://ns.adobe.com/xmp/1.0/Script/", "xmpScript");
        mo16212c("http://ns.adobe.com/TransformXMP/", "txmp");
        mo16212c("http://ns.adobe.com/swf/1.0/", "swf");
        mo16212c("http://ns.adobe.com/xmp/1.0/DynamicMedia/", "xmpDM");
        mo16212c("http://ns.adobe.com/xmp/transient/1.0/", "xmpx");
        mo16212c("http://ns.adobe.com/xap/1.0/t/", "xmpT");
        mo16212c("http://ns.adobe.com/xap/1.0/t/pg/", "xmpTPg");
        mo16212c("http://ns.adobe.com/xap/1.0/g/", "xmpG");
        mo16212c("http://ns.adobe.com/xap/1.0/g/img/", "xmpGImg");
        mo16212c("http://ns.adobe.com/xap/1.0/sType/Font#", "stFnt");
        mo16212c("http://ns.adobe.com/xap/1.0/sType/Dimensions#", "stDim");
        mo16212c("http://ns.adobe.com/xap/1.0/sType/ResourceEvent#", "stEvt");
        mo16212c("http://ns.adobe.com/xap/1.0/sType/ResourceRef#", "stRef");
        mo16212c("http://ns.adobe.com/xap/1.0/sType/Version#", "stVer");
        mo16212c("http://ns.adobe.com/xap/1.0/sType/Job#", "stJob");
        mo16212c("http://ns.adobe.com/xap/1.0/sType/ManifestItem#", "stMfs");
        mo16212c("http://ns.adobe.com/xmp/Identifier/qual/1.0/", "xmpidq");
    }

    /* renamed from: a */
    public synchronized String mo16210a(String str) {
        return (String) this.f15092a.get(str);
    }

    /* renamed from: b */
    public synchronized String mo16211b(String str) {
        if (str != null) {
            if (!str.endsWith(":")) {
                str = str + ":";
            }
        }
        return (String) this.f15093b.get(str);
    }

    /* renamed from: c */
    public synchronized String mo16212c(String str, String str2) {
        C5388e.m19922e(str);
        C5388e.m19920c(str2);
        if (str2.charAt(str2.length() - 1) != ':') {
            str2 = str2 + ':';
        }
        if (C5391h.m19958g(str2.substring(0, str2.length() - 1))) {
            String str3 = (String) this.f15092a.get(str);
            String str4 = (String) this.f15093b.get(str2);
            if (str3 != null) {
                return str3;
            }
            if (str4 != null) {
                String str5 = str2;
                int i = 1;
                while (this.f15093b.containsKey(str5)) {
                    str5 = str2.substring(0, str2.length() - 1) + "_" + i + "_:";
                    i++;
                }
                str2 = str5;
            }
            this.f15093b.put(str2, str);
            this.f15092a.put(str, str2);
            return str2;
        }
        throw new C5377b("The prefix is a bad XML name", 201);
    }

    /* renamed from: d */
    public synchronized C5414a mo16213d(String str) {
        return (C5414a) this.f15094c.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public synchronized void mo16293e(String str, String str2, String str3, String str4, C5409a aVar) {
        C5388e.m19922e(str);
        C5388e.m19921d(str2);
        C5388e.m19922e(str3);
        C5388e.m19921d(str4);
        C5409a aVar2 = aVar != null ? new C5409a(C5401n.m20064p(aVar.mo16318m(), (Object) null).mo16325d()) : new C5409a();
        if (this.f15095d.matcher(str2).find() || this.f15095d.matcher(str4).find()) {
            throw new C5377b("Alias and actual property names must be simple", 102);
        }
        String a = mo16210a(str);
        String a2 = mo16210a(str3);
        if (a == null) {
            throw new C5377b("Alias namespace is not registered", 101);
        } else if (a2 != null) {
            String str5 = a + str2;
            if (!this.f15094c.containsKey(str5)) {
                if (!this.f15094c.containsKey(a2 + str4)) {
                    this.f15094c.put(str5, new C5404a(str3, a2, str4, aVar2));
                } else {
                    throw new C5377b("Actual property is already an alias, use the base property", 4);
                }
            } else {
                throw new C5377b("Alias is already existing", 4);
            }
        } else {
            throw new C5377b("Actual namespace is not registered", 101);
        }
    }
}
