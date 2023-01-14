package p174e.p175a.p176a.p177i;

import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.HttpUrl;
import org.w3c.dom.Attr;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import p174e.p175a.p176a.C5377b;
import p174e.p175a.p176a.C5380e;
import p174e.p175a.p176a.C5381f;
import p174e.p175a.p176a.p179j.C5413e;

/* renamed from: e.a.a.i.f */
public class C5389f {
    /* renamed from: a */
    private static C5399m m19924a(C5397k kVar, C5399m mVar, Node node, String str, boolean z) {
        C5381f a = C5380e.m19891a();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI != null) {
            if ("http://purl.org/dc/1.1/".equals(namespaceURI)) {
                namespaceURI = "http://purl.org/dc/elements/1.1/";
            }
            String a2 = a.mo16210a(namespaceURI);
            if (a2 == null) {
                a2 = a.mo16212c(namespaceURI, node.getPrefix() != null ? node.getPrefix() : "_dflt");
            }
            String str2 = a2 + node.getLocalName();
            C5413e eVar = new C5413e();
            boolean z2 = false;
            if (z) {
                mVar = C5401n.m20057i(kVar.mo16247c(), namespaceURI, "_dflt", true);
                mVar.mo16285r0(false);
                if (a.mo16213d(str2) != null) {
                    kVar.mo16247c().mo16283p0(true);
                    mVar.mo16283p0(true);
                    z2 = true;
                }
            }
            boolean equals = "rdf:li".equals(str2);
            boolean equals2 = "rdf:value".equals(str2);
            C5399m mVar2 = new C5399m(str2, str, eVar);
            mVar2.mo16282o0(z2);
            if (!equals2) {
                mVar.mo16272g(mVar2);
            } else {
                mVar.mo16271e(1, mVar2);
            }
            if (equals2) {
                if (z || !mVar.mo16259T().mo16349q()) {
                    throw new C5377b("Misplaced rdf:value element", 202);
                }
                mVar.mo16284q0(true);
            }
            if (equals) {
                if (mVar.mo16259T().mo16341i()) {
                    mVar2.mo16286s0(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                } else {
                    throw new C5377b("Misplaced rdf:li element", 202);
                }
            }
            return mVar2;
        }
        throw new C5377b("XML namespace required for all elements and attributes", 202);
    }

    /* renamed from: b */
    private static C5399m m19925b(C5399m mVar, String str, String str2) {
        if ("xml:lang".equals(str)) {
            str2 = C5391h.m19959h(str2);
        }
        C5399m mVar2 = new C5399m(str, str2, (C5413e) null);
        mVar.mo16274h(mVar2);
        return mVar2;
    }

    /* renamed from: c */
    private static void m19926c(C5399m mVar) {
        C5399m N = mVar.mo16254N(1);
        if (N.mo16259T().mo16340h()) {
            if (!mVar.mo16259T().mo16340h()) {
                C5399m V = N.mo16261V(1);
                N.mo16279l0(V);
                mVar.mo16274h(V);
            } else {
                throw new C5377b("Redundant xml:lang for rdf:value element", 203);
            }
        }
        for (int i = 1; i <= N.mo16262X(); i++) {
            mVar.mo16274h(N.mo16261V(i));
        }
        for (int i2 = 2; i2 <= mVar.mo16255P(); i2++) {
            mVar.mo16274h(mVar.mo16254N(i2));
        }
        mVar.mo16284q0(false);
        mVar.mo16259T().mo16338B(false);
        mVar.mo16259T().mo16350r(N.mo16259T());
        mVar.mo16289v0(N.mo16264Z());
        mVar.mo16278k0();
        Iterator g0 = N.mo16273g0();
        while (g0.hasNext()) {
            mVar.mo16272g((C5399m) g0.next());
        }
    }

    /* renamed from: d */
    private static int m19927d(Node node) {
        String localName = node.getLocalName();
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI == null && (("about".equals(localName) || "ID".equals(localName)) && (node instanceof Attr) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(((Attr) node).getOwnerElement().getNamespaceURI()))) {
            namespaceURI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#";
        }
        if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
            return 0;
        }
        if ("li".equals(localName)) {
            return 9;
        }
        if ("parseType".equals(localName)) {
            return 4;
        }
        if ("Description".equals(localName)) {
            return 8;
        }
        if ("about".equals(localName)) {
            return 3;
        }
        if ("resource".equals(localName)) {
            return 5;
        }
        if ("RDF".equals(localName)) {
            return 1;
        }
        if ("ID".equals(localName)) {
            return 2;
        }
        if ("nodeID".equals(localName)) {
            return 6;
        }
        if ("datatype".equals(localName)) {
            return 7;
        }
        if ("aboutEach".equals(localName)) {
            return 10;
        }
        if ("aboutEachPrefix".equals(localName)) {
            return 11;
        }
        return "bagID".equals(localName) ? 12 : 0;
    }

    /* renamed from: e */
    private static boolean m19928e(int i) {
        return 1 <= i && i <= 7;
    }

    /* renamed from: f */
    private static boolean m19929f(int i) {
        return 10 <= i && i <= 12;
    }

    /* renamed from: g */
    private static boolean m19930g(int i) {
        if (i == 8 || m19929f(i)) {
            return false;
        }
        return !m19928e(i);
    }

    /* renamed from: h */
    private static boolean m19931h(Node node) {
        if (node.getNodeType() != 3) {
            return false;
        }
        String nodeValue = node.getNodeValue();
        for (int i = 0; i < nodeValue.length(); i++) {
            if (!Character.isWhitespace(nodeValue.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i */
    static C5397k m19932i(Node node) {
        C5397k kVar = new C5397k();
        m19944u(kVar, node);
        return kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ee  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m19933j(p174e.p175a.p176a.p177i.C5397k r16, p174e.p175a.p176a.p177i.C5399m r17, org.w3c.dom.Node r18, boolean r19) {
        /*
            r0 = r16
            boolean r1 = r18.hasChildNodes()
            r2 = 202(0xca, float:2.83E-43)
            if (r1 != 0) goto L_0x0157
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x0010:
            org.w3c.dom.NamedNodeMap r9 = r18.getAttributes()
            int r9 = r9.getLength()
            java.lang.String r10 = "Unrecognized attribute of empty property element"
            r11 = 6
            r12 = 5
            r13 = 2
            java.lang.String r14 = "xml:lang"
            java.lang.String r15 = "xmlns"
            if (r4 >= r9) goto L_0x00b2
            org.w3c.dom.NamedNodeMap r9 = r18.getAttributes()
            org.w3c.dom.Node r9 = r9.item(r4)
            java.lang.String r1 = r9.getPrefix()
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L_0x00ae
            java.lang.String r1 = r9.getPrefix()
            if (r1 != 0) goto L_0x0047
            java.lang.String r1 = r9.getNodeName()
            boolean r1 = r15.equals(r1)
            if (r1 == 0) goto L_0x0047
            goto L_0x00ae
        L_0x0047:
            int r1 = m19927d(r9)
            java.lang.String r15 = "Empty property element can't have both rdf:value and rdf:resource"
            if (r1 == 0) goto L_0x007e
            if (r1 == r13) goto L_0x00ae
            java.lang.String r13 = "Empty property element can't have both rdf:resource and rdf:nodeID"
            if (r1 == r12) goto L_0x0067
            if (r1 != r11) goto L_0x0061
            if (r6 != 0) goto L_0x005b
            r8 = 1
            goto L_0x00ae
        L_0x005b:
            e.a.a.b r0 = new e.a.a.b
            r0.<init>(r13, r2)
            throw r0
        L_0x0061:
            e.a.a.b r0 = new e.a.a.b
            r0.<init>(r10, r2)
            throw r0
        L_0x0067:
            if (r8 != 0) goto L_0x0078
            if (r5 != 0) goto L_0x0070
            if (r5 != 0) goto L_0x006e
            r3 = r9
        L_0x006e:
            r6 = 1
            goto L_0x00ae
        L_0x0070:
            e.a.a.b r0 = new e.a.a.b
            r1 = 203(0xcb, float:2.84E-43)
            r0.<init>(r15, r1)
            throw r0
        L_0x0078:
            e.a.a.b r0 = new e.a.a.b
            r0.<init>(r13, r2)
            throw r0
        L_0x007e:
            java.lang.String r1 = r9.getLocalName()
            java.lang.String r10 = "value"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x00a3
            java.lang.String r1 = r9.getNamespaceURI()
            java.lang.String r10 = "http://www.w3.org/1999/02/22-rdf-syntax-ns#"
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x00a3
            if (r6 != 0) goto L_0x009b
            r3 = r9
            r5 = 1
            goto L_0x00ae
        L_0x009b:
            e.a.a.b r0 = new e.a.a.b
            r1 = 203(0xcb, float:2.84E-43)
            r0.<init>(r15, r1)
            throw r0
        L_0x00a3:
            java.lang.String r1 = r9.getNodeName()
            boolean r1 = r14.equals(r1)
            if (r1 != 0) goto L_0x00ae
            r7 = 1
        L_0x00ae:
            int r4 = r4 + 1
            goto L_0x0010
        L_0x00b2:
            java.lang.String r1 = ""
            r4 = r17
            r8 = r18
            r9 = r19
            e.a.a.i.m r4 = m19924a(r0, r4, r8, r1, r9)
            if (r5 != 0) goto L_0x00cf
            if (r6 == 0) goto L_0x00c3
            goto L_0x00cf
        L_0x00c3:
            if (r7 == 0) goto L_0x00e2
            e.a.a.j.e r1 = r4.mo16259T()
            r6 = 1
            r1.mo16338B(r6)
            r1 = 1
            goto L_0x00e3
        L_0x00cf:
            r6 = 1
            if (r3 == 0) goto L_0x00d6
            java.lang.String r1 = r3.getNodeValue()
        L_0x00d6:
            r4.mo16289v0(r1)
            if (r5 != 0) goto L_0x00e2
            e.a.a.j.e r1 = r4.mo16259T()
            r1.mo16339C(r6)
        L_0x00e2:
            r1 = 0
        L_0x00e3:
            r5 = 0
        L_0x00e4:
            org.w3c.dom.NamedNodeMap r6 = r18.getAttributes()
            int r6 = r6.getLength()
            if (r5 >= r6) goto L_0x0156
            org.w3c.dom.NamedNodeMap r6 = r18.getAttributes()
            org.w3c.dom.Node r6 = r6.item(r5)
            if (r6 == r3) goto L_0x0152
            java.lang.String r7 = r6.getPrefix()
            boolean r7 = r15.equals(r7)
            if (r7 != 0) goto L_0x0152
            java.lang.String r7 = r6.getPrefix()
            if (r7 != 0) goto L_0x0113
            java.lang.String r7 = r6.getNodeName()
            boolean r7 = r15.equals(r7)
            if (r7 == 0) goto L_0x0113
            goto L_0x0152
        L_0x0113:
            int r7 = m19927d(r6)
            if (r7 == 0) goto L_0x0130
            if (r7 == r13) goto L_0x0152
            if (r7 == r12) goto L_0x0126
            if (r7 != r11) goto L_0x0120
            goto L_0x0152
        L_0x0120:
            e.a.a.b r0 = new e.a.a.b
            r0.<init>(r10, r2)
            throw r0
        L_0x0126:
            java.lang.String r6 = r6.getNodeValue()
            java.lang.String r7 = "rdf:resource"
        L_0x012c:
            m19925b(r4, r7, r6)
            goto L_0x0152
        L_0x0130:
            java.lang.String r7 = r6.getNodeName()
            if (r1 != 0) goto L_0x013b
            java.lang.String r6 = r6.getNodeValue()
            goto L_0x012c
        L_0x013b:
            boolean r7 = r14.equals(r7)
            if (r7 == 0) goto L_0x0149
            java.lang.String r6 = r6.getNodeValue()
            m19925b(r4, r14, r6)
            goto L_0x0152
        L_0x0149:
            java.lang.String r7 = r6.getNodeValue()
            r9 = 0
            m19924a(r0, r4, r6, r7, r9)
            goto L_0x0153
        L_0x0152:
            r9 = 0
        L_0x0153:
            int r5 = r5 + 1
            goto L_0x00e4
        L_0x0156:
            return
        L_0x0157:
            e.a.a.b r0 = new e.a.a.b
            java.lang.String r1 = "Nested content not allowed with rdf:resource or property attributes"
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p174e.p175a.p176a.p177i.C5389f.m19933j(e.a.a.i.k, e.a.a.i.m, org.w3c.dom.Node, boolean):void");
    }

    /* renamed from: k */
    private static void m19934k(C5397k kVar, C5399m mVar, Node node, boolean z) {
        C5399m a = m19924a(kVar, mVar, node, (String) null, z);
        int i = 0;
        for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
            Node item = node.getAttributes().item(i2);
            if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                String namespaceURI = item.getNamespaceURI();
                String localName = item.getLocalName();
                if ("xml:lang".equals(item.getNodeName())) {
                    m19925b(a, "xml:lang", item.getNodeValue());
                } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) || (!"ID".equals(localName) && !"datatype".equals(localName))) {
                    throw new C5377b("Invalid attribute for literal property element", 202);
                }
            }
        }
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        while (i < node.getChildNodes().getLength()) {
            Node item2 = node.getChildNodes().item(i);
            if (item2.getNodeType() == 3) {
                str = str + item2.getNodeValue();
                i++;
            } else {
                throw new C5377b("Invalid child of literal property element", 202);
            }
        }
        a.mo16289v0(str);
    }

    /* renamed from: l */
    private static void m19935l(C5397k kVar, C5399m mVar, Node node, boolean z) {
        int d = m19927d(node);
        if (d != 8 && d != 0) {
            throw new C5377b("Node element must be rdf:Description or typed node", 202);
        } else if (!z || d != 0) {
            m19936m(kVar, mVar, node, z);
            m19943t(kVar, mVar, node, z);
        } else {
            throw new C5377b("Top level typed node not allowed", 203);
        }
    }

    /* renamed from: m */
    private static void m19936m(C5397k kVar, C5399m mVar, Node node, boolean z) {
        int i = 0;
        for (int i2 = 0; i2 < node.getAttributes().getLength(); i2++) {
            Node item = node.getAttributes().item(i2);
            if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                int d = m19927d(item);
                if (d == 0) {
                    m19924a(kVar, mVar, item, item.getNodeValue(), z);
                } else if (d != 6 && d != 2 && d != 3) {
                    throw new C5377b("Invalid nodeElement attribute", 202);
                } else if (i <= 0) {
                    i++;
                    if (z && d == 3) {
                        if (mVar.mo16258S() == null || mVar.mo16258S().length() <= 0) {
                            mVar.mo16286s0(item.getNodeValue());
                        } else if (!mVar.mo16258S().equals(item.getNodeValue())) {
                            throw new C5377b("Mismatched top level rdf:about values", 203);
                        }
                    }
                } else {
                    throw new C5377b("Mutally exclusive about, ID, nodeID attributes", 202);
                }
            }
        }
    }

    /* renamed from: n */
    private static void m19937n(C5397k kVar, C5399m mVar, Node node) {
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node item = node.getChildNodes().item(i);
            if (!m19931h(item)) {
                m19935l(kVar, mVar, item, true);
            }
        }
    }

    /* renamed from: o */
    private static void m19938o() {
        throw new C5377b("ParseTypeCollection property element not allowed", 203);
    }

    /* renamed from: p */
    private static void m19939p() {
        throw new C5377b("ParseTypeLiteral property element not allowed", 203);
    }

    /* renamed from: q */
    private static void m19940q() {
        throw new C5377b("ParseTypeOther property element not allowed", 203);
    }

    /* renamed from: r */
    private static void m19941r(C5397k kVar, C5399m mVar, Node node, boolean z) {
        C5399m a = m19924a(kVar, mVar, node, HttpUrl.FRAGMENT_ENCODE_SET, z);
        a.mo16259T().mo16338B(true);
        for (int i = 0; i < node.getAttributes().getLength(); i++) {
            Node item = node.getAttributes().item(i);
            if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                String localName = item.getLocalName();
                String namespaceURI = item.getNamespaceURI();
                if ("xml:lang".equals(item.getNodeName())) {
                    m19925b(a, "xml:lang", item.getNodeValue());
                } else if (!"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI) || (!"ID".equals(localName) && !"parseType".equals(localName))) {
                    throw new C5377b("Invalid attribute for ParseTypeResource property element", 202);
                }
            }
        }
        m19943t(kVar, a, node, false);
        if (a.mo16257R()) {
            m19926c(a);
        }
    }

    /* renamed from: s */
    private static void m19942s(C5397k kVar, C5399m mVar, Node node, boolean z) {
        if (m19930g(m19927d(node))) {
            NamedNodeMap attributes = node.getAttributes();
            ArrayList<String> arrayList = null;
            for (int i = 0; i < attributes.getLength(); i++) {
                Node item = attributes.item(i);
                if ("xmlns".equals(item.getPrefix()) || (item.getPrefix() == null && "xmlns".equals(item.getNodeName()))) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(item.getNodeName());
                }
            }
            if (arrayList != null) {
                for (String removeNamedItem : arrayList) {
                    attributes.removeNamedItem(removeNamedItem);
                }
            }
            if (attributes.getLength() <= 3) {
                int i2 = 0;
                while (i2 < attributes.getLength()) {
                    Node item2 = attributes.item(i2);
                    String localName = item2.getLocalName();
                    String namespaceURI = item2.getNamespaceURI();
                    String nodeValue = item2.getNodeValue();
                    if ("xml:lang".equals(item2.getNodeName()) && (!"ID".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI))) {
                        i2++;
                    } else if ("datatype".equals(localName) && "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        m19934k(kVar, mVar, node, z);
                        return;
                    } else if (!"parseType".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        m19933j(kVar, mVar, node, z);
                        return;
                    } else if ("Literal".equals(nodeValue)) {
                        m19939p();
                        return;
                    } else if ("Resource".equals(nodeValue)) {
                        m19941r(kVar, mVar, node, z);
                        return;
                    } else if ("Collection".equals(nodeValue)) {
                        m19938o();
                        return;
                    } else {
                        m19940q();
                        return;
                    }
                }
                if (node.hasChildNodes()) {
                    for (int i3 = 0; i3 < node.getChildNodes().getLength(); i3++) {
                        if (node.getChildNodes().item(i3).getNodeType() != 3) {
                            m19945v(kVar, mVar, node, z);
                            return;
                        }
                    }
                    m19934k(kVar, mVar, node, z);
                    return;
                }
            }
            m19933j(kVar, mVar, node, z);
            return;
        }
        throw new C5377b("Invalid property element name", 202);
    }

    /* renamed from: t */
    private static void m19943t(C5397k kVar, C5399m mVar, Node node, boolean z) {
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
            Node item = node.getChildNodes().item(i);
            if (!m19931h(item)) {
                if (item.getNodeType() == 1) {
                    m19942s(kVar, mVar, item, z);
                } else {
                    throw new C5377b("Expected property element node not found", 202);
                }
            }
        }
    }

    /* renamed from: u */
    static void m19944u(C5397k kVar, Node node) {
        if (node.hasAttributes()) {
            m19937n(kVar, kVar.mo16247c(), node);
            return;
        }
        throw new C5377b("Invalid attributes of rdf:RDF element", 202);
    }

    /* renamed from: v */
    private static void m19945v(C5397k kVar, C5399m mVar, Node node, boolean z) {
        C5377b bVar;
        if (!z || !"iX:changes".equals(node.getNodeName())) {
            C5399m a = m19924a(kVar, mVar, node, HttpUrl.FRAGMENT_ENCODE_SET, z);
            for (int i = 0; i < node.getAttributes().getLength(); i++) {
                Node item = node.getAttributes().item(i);
                if (!"xmlns".equals(item.getPrefix()) && (item.getPrefix() != null || !"xmlns".equals(item.getNodeName()))) {
                    String localName = item.getLocalName();
                    String namespaceURI = item.getNamespaceURI();
                    if ("xml:lang".equals(item.getNodeName())) {
                        m19925b(a, "xml:lang", item.getNodeValue());
                    } else if (!"ID".equals(localName) || !"http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(namespaceURI)) {
                        throw new C5377b("Invalid attribute for resource property element", 202);
                    }
                }
            }
            boolean z2 = false;
            for (int i2 = 0; i2 < node.getChildNodes().getLength(); i2++) {
                Node item2 = node.getChildNodes().item(i2);
                if (!m19931h(item2)) {
                    if (item2.getNodeType() == 1 && !z2) {
                        boolean equals = "http://www.w3.org/1999/02/22-rdf-syntax-ns#".equals(item2.getNamespaceURI());
                        String localName2 = item2.getLocalName();
                        if (equals && "Bag".equals(localName2)) {
                            a.mo16259T().mo16351s(true);
                        } else if (equals && "Seq".equals(localName2)) {
                            a.mo16259T().mo16351s(true).mo16354v(true);
                        } else if (!equals || !"Alt".equals(localName2)) {
                            a.mo16259T().mo16338B(true);
                            if (!equals && !"Description".equals(localName2)) {
                                String namespaceURI2 = item2.getNamespaceURI();
                                if (namespaceURI2 != null) {
                                    m19925b(a, "rdf:type", namespaceURI2 + ':' + localName2);
                                } else {
                                    throw new C5377b("All XML elements must be in a namespace", 203);
                                }
                            }
                        } else {
                            a.mo16259T().mo16351s(true).mo16354v(true).mo16353u(true);
                        }
                        m19935l(kVar, a, item2, false);
                        if (a.mo16257R()) {
                            m19926c(a);
                        } else if (a.mo16259T().mo16343k()) {
                            C5401n.m20052d(a);
                        }
                        z2 = true;
                    } else if (z2) {
                        throw bVar;
                    } else {
                        bVar = new C5377b("Children of resource property element must be XML elements", 202);
                        throw bVar;
                    }
                }
            }
            if (!z2) {
                throw new C5377b("Missing child of resource property element", 202);
            }
        }
    }
}
