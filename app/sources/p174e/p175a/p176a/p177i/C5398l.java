package p174e.p175a.p176a.p177i;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import p174e.p175a.p176a.C5377b;
import p174e.p175a.p176a.C5379d;
import p174e.p175a.p176a.p179j.C5412d;

/* renamed from: e.a.a.i.l */
public class C5398l {

    /* renamed from: a */
    private static final Object f15077a = new Object();

    /* renamed from: b */
    private static DocumentBuilderFactory f15078b = m19996a();

    /* renamed from: a */
    private static DocumentBuilderFactory m19996a() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        newInstance.setIgnoringComments(true);
        try {
            newInstance.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true);
            newInstance.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#disallow-doctype-decl", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            newInstance.setFeature("http://xerces.apache.org/xerces2-j/features.html#external-parameter-entities", false);
            newInstance.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false);
            newInstance.setXIncludeAware(false);
            newInstance.setExpandEntityReferences(false);
        } catch (Exception unused) {
        }
        return newInstance;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Object[] m19997b(org.w3c.dom.Node r7, boolean r8, java.lang.Object[] r9) {
        /*
            org.w3c.dom.NodeList r7 = r7.getChildNodes()
            r0 = 0
            r1 = 0
        L_0x0006:
            int r2 = r7.getLength()
            if (r1 >= r2) goto L_0x0089
            org.w3c.dom.Node r2 = r7.item(r1)
            short r3 = r2.getNodeType()
            r4 = 7
            if (r4 != r3) goto L_0x0030
            r3 = r2
            org.w3c.dom.ProcessingInstruction r3 = (org.w3c.dom.ProcessingInstruction) r3
            java.lang.String r5 = r3.getTarget()
            java.lang.String r6 = "xpacket"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x0030
            if (r9 == 0) goto L_0x0085
            r2 = 2
            java.lang.String r3 = r3.getData()
            r9[r2] = r3
            goto L_0x0085
        L_0x0030:
            r3 = 3
            short r5 = r2.getNodeType()
            if (r3 == r5) goto L_0x0085
            short r3 = r2.getNodeType()
            if (r4 == r3) goto L_0x0085
            java.lang.String r3 = r2.getNamespaceURI()
            java.lang.String r4 = r2.getLocalName()
            java.lang.String r5 = "xmpmeta"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "xapmeta"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x0062
        L_0x0055:
            java.lang.String r5 = "adobe:ns:meta/"
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0062
            java.lang.Object[] r7 = m19997b(r2, r0, r9)
            return r7
        L_0x0062:
            if (r8 != 0) goto L_0x007e
            java.lang.String r5 = "RDF"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x007e
            java.lang.String r4 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x007e
            if (r9 == 0) goto L_0x007d
            r9[r0] = r2
            java.lang.Object r7 = f15077a
            r8 = 1
            r9[r8] = r7
        L_0x007d:
            return r9
        L_0x007e:
            java.lang.Object[] r2 = m19997b(r2, r8, r9)
            if (r2 == 0) goto L_0x0085
            return r2
        L_0x0085:
            int r1 = r1 + 1
            goto L_0x0006
        L_0x0089:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p175a.p176a.p177i.C5398l.m19997b(org.w3c.dom.Node, boolean, java.lang.Object[]):java.lang.Object[]");
    }

    /* renamed from: c */
    public static C5379d m19998c(Object obj, C5412d dVar) {
        C5388e.m19919b(obj);
        if (dVar == null) {
            dVar = new C5412d();
        }
        Object[] b = m19997b(m20000e(obj, dVar), dVar.mo16335l(), new Object[3]);
        if (b == null || b[1] != f15077a) {
            return new C5397k();
        }
        C5397k i = C5389f.m19932i((Node) b[0]);
        i.mo16249d((String) b[2]);
        return !dVar.mo16334k() ? C5402o.m20072h(i, dVar) : i;
    }

    /* renamed from: d */
    private static Document m19999d(InputSource inputSource) {
        try {
            DocumentBuilder newDocumentBuilder = f15078b.newDocumentBuilder();
            newDocumentBuilder.setErrorHandler((ErrorHandler) null);
            return newDocumentBuilder.parse(inputSource);
        } catch (SAXException e) {
            throw new C5377b("XML parsing failure", 201, e);
        } catch (ParserConfigurationException e2) {
            throw new C5377b("XML Parser not correctly configured", 0, e2);
        } catch (IOException e3) {
            throw new C5377b("Error reading the XML-file", 204, e3);
        }
    }

    /* renamed from: e */
    private static Document m20000e(Object obj, C5412d dVar) {
        return obj instanceof InputStream ? m20002g((InputStream) obj, dVar) : obj instanceof byte[] ? m20001f(new C5384a((byte[]) obj), dVar) : m20003h((String) obj, dVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(2:4|5)|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0017 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.w3c.dom.Document m20001f(p174e.p175a.p176a.p177i.C5384a r4, p174e.p175a.p176a.p179j.C5412d r5) {
        /*
            org.xml.sax.InputSource r0 = new org.xml.sax.InputSource
            java.io.InputStream r1 = r4.mo16218f()
            r0.<init>(r1)
            boolean r1 = r5.mo16332i()     // Catch:{ b -> 0x001c }
            if (r1 == 0) goto L_0x0017
            javax.xml.parsers.DocumentBuilderFactory r1 = f15078b     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "http://apache.org/xml/features/disallow-doctype-decl"
            r3 = 1
            r1.setFeature(r2, r3)     // Catch:{ all -> 0x0017 }
        L_0x0017:
            org.w3c.dom.Document r4 = m19999d(r0)     // Catch:{ b -> 0x001c }
            return r4
        L_0x001c:
            r0 = move-exception
            int r1 = r0.mo16206a()
            r2 = 201(0xc9, float:2.82E-43)
            if (r1 == r2) goto L_0x002f
            int r1 = r0.mo16206a()
            r2 = 204(0xcc, float:2.86E-43)
            if (r1 != r2) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            throw r0
        L_0x002f:
            boolean r1 = r5.mo16331h()
            if (r1 == 0) goto L_0x0039
            e.a.a.i.a r4 = p174e.p175a.p176a.p177i.C5387d.m19916a(r4)
        L_0x0039:
            boolean r5 = r5.mo16333j()
            if (r5 == 0) goto L_0x0065
            java.lang.String r5 = r4.mo16219g()     // Catch:{ UnsupportedEncodingException -> 0x005b }
            e.a.a.i.b r1 = new e.a.a.i.b     // Catch:{ UnsupportedEncodingException -> 0x005b }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x005b }
            java.io.InputStream r4 = r4.mo16218f()     // Catch:{ UnsupportedEncodingException -> 0x005b }
            r2.<init>(r4, r5)     // Catch:{ UnsupportedEncodingException -> 0x005b }
            r1.<init>(r2)     // Catch:{ UnsupportedEncodingException -> 0x005b }
            org.xml.sax.InputSource r4 = new org.xml.sax.InputSource     // Catch:{ UnsupportedEncodingException -> 0x005b }
            r4.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x005b }
            org.w3c.dom.Document r4 = m19999d(r4)     // Catch:{ UnsupportedEncodingException -> 0x005b }
            return r4
        L_0x005b:
            e.a.a.b r4 = new e.a.a.b
            r5 = 9
            java.lang.String r1 = "Unsupported Encoding"
            r4.<init>(r1, r5, r0)
            throw r4
        L_0x0065:
            org.xml.sax.InputSource r5 = new org.xml.sax.InputSource
            java.io.InputStream r4 = r4.mo16218f()
            r5.<init>(r4)
            org.w3c.dom.Document r4 = m19999d(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p175a.p176a.p177i.C5398l.m20001f(e.a.a.i.a, e.a.a.j.d):org.w3c.dom.Document");
    }

    /* renamed from: g */
    private static Document m20002g(InputStream inputStream, C5412d dVar) {
        if (!dVar.mo16331h() && !dVar.mo16333j()) {
            return m19999d(new InputSource(inputStream));
        }
        try {
            return m20001f(new C5384a(inputStream), dVar);
        } catch (IOException e) {
            throw new C5377b("Error reading the XML-file", 204, e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|(2:4|5)|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0018 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.w3c.dom.Document m20003h(java.lang.String r3, p174e.p175a.p176a.p179j.C5412d r4) {
        /*
            org.xml.sax.InputSource r0 = new org.xml.sax.InputSource
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r3)
            r0.<init>(r1)
            boolean r0 = r4.mo16332i()     // Catch:{ b -> 0x0027 }
            if (r0 == 0) goto L_0x0018
            javax.xml.parsers.DocumentBuilderFactory r0 = f15078b     // Catch:{ all -> 0x0018 }
            java.lang.String r1 = "http://apache.org/xml/features/disallow-doctype-decl"
            r2 = 1
            r0.setFeature(r1, r2)     // Catch:{ all -> 0x0018 }
        L_0x0018:
            org.xml.sax.InputSource r0 = new org.xml.sax.InputSource     // Catch:{ b -> 0x0027 }
            java.io.StringReader r1 = new java.io.StringReader     // Catch:{ b -> 0x0027 }
            r1.<init>(r3)     // Catch:{ b -> 0x0027 }
            r0.<init>(r1)     // Catch:{ b -> 0x0027 }
            org.w3c.dom.Document r3 = m19999d(r0)     // Catch:{ b -> 0x0027 }
            return r3
        L_0x0027:
            r0 = move-exception
            int r1 = r0.mo16206a()
            r2 = 201(0xc9, float:2.82E-43)
            if (r1 != r2) goto L_0x004a
            boolean r4 = r4.mo16333j()
            if (r4 == 0) goto L_0x004a
            org.xml.sax.InputSource r4 = new org.xml.sax.InputSource
            e.a.a.i.b r0 = new e.a.a.i.b
            java.io.StringReader r1 = new java.io.StringReader
            r1.<init>(r3)
            r0.<init>(r1)
            r4.<init>(r0)
            org.w3c.dom.Document r3 = m19999d(r4)
            return r3
        L_0x004a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p175a.p176a.p177i.C5398l.m20003h(java.lang.String, e.a.a.j.d):org.w3c.dom.Document");
    }
}
