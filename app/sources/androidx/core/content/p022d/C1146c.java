package androidx.core.content.p022d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p027c.p064i.C1826c;
import p027c.p064i.p070h.C1872d;

/* renamed from: androidx.core.content.d.c */
public class C1146c {

    /* renamed from: androidx.core.content.d.c$a */
    public interface C1147a {
    }

    /* renamed from: androidx.core.content.d.c$b */
    public static final class C1148b implements C1147a {

        /* renamed from: a */
        private final C1149c[] f3204a;

        public C1148b(C1149c[] cVarArr) {
            this.f3204a = cVarArr;
        }

        /* renamed from: a */
        public C1149c[] mo3628a() {
            return this.f3204a;
        }
    }

    /* renamed from: androidx.core.content.d.c$c */
    public static final class C1149c {

        /* renamed from: a */
        private final String f3205a;

        /* renamed from: b */
        private int f3206b;

        /* renamed from: c */
        private boolean f3207c;

        /* renamed from: d */
        private String f3208d;

        /* renamed from: e */
        private int f3209e;

        /* renamed from: f */
        private int f3210f;

        public C1149c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f3205a = str;
            this.f3206b = i;
            this.f3207c = z;
            this.f3208d = str2;
            this.f3209e = i2;
            this.f3210f = i3;
        }

        /* renamed from: a */
        public String mo3629a() {
            return this.f3205a;
        }

        /* renamed from: b */
        public int mo3630b() {
            return this.f3210f;
        }

        /* renamed from: c */
        public int mo3631c() {
            return this.f3209e;
        }

        /* renamed from: d */
        public String mo3632d() {
            return this.f3208d;
        }

        /* renamed from: e */
        public int mo3633e() {
            return this.f3206b;
        }

        /* renamed from: f */
        public boolean mo3634f() {
            return this.f3207c;
        }
    }

    /* renamed from: androidx.core.content.d.c$d */
    public static final class C1150d implements C1147a {

        /* renamed from: a */
        private final C1872d f3211a;

        /* renamed from: b */
        private final int f3212b;

        /* renamed from: c */
        private final int f3213c;

        /* renamed from: d */
        private final String f3214d;

        public C1150d(C1872d dVar, int i, int i2, String str) {
            this.f3211a = dVar;
            this.f3213c = i;
            this.f3212b = i2;
            this.f3214d = str;
        }

        /* renamed from: a */
        public int mo3635a() {
            return this.f3213c;
        }

        /* renamed from: b */
        public C1872d mo3636b() {
            return this.f3211a;
        }

        /* renamed from: c */
        public String mo3637c() {
            return this.f3214d;
        }

        /* renamed from: d */
        public int mo3638d() {
            return this.f3212b;
        }
    }

    /* renamed from: a */
    private static int m4462a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    public static androidx.core.content.p022d.C1146c.C1147a m4463b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.d.c$a r3 = m4465d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p022d.C1146c.m4463b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.d.c$a");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m4464c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m4462a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m4469h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m4469h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    private static C1147a m4465d(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m4466e(xmlPullParser, resources);
        }
        m4468g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    private static C1147a m4466e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C1826c.f5432f);
        String string = obtainAttributes.getString(C1826c.f5433g);
        String string2 = obtainAttributes.getString(C1826c.f5437k);
        String string3 = obtainAttributes.getString(C1826c.f5438l);
        int resourceId = obtainAttributes.getResourceId(C1826c.f5434h, 0);
        int integer = obtainAttributes.getInteger(C1826c.f5435i, 1);
        int integer2 = obtainAttributes.getInteger(C1826c.f5436j, 500);
        String string4 = obtainAttributes.getString(C1826c.f5439m);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m4467f(xmlPullParser, resources));
                    } else {
                        m4468g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C1148b((C1149c[]) arrayList.toArray(new C1149c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m4468g(xmlPullParser);
        }
        return new C1150d(new C1872d(string, string2, string3, m4464c(resources, resourceId)), integer, integer2, string4);
    }

    /* renamed from: f */
    private static C1149c m4467f(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C1826c.f5440n);
        int i = C1826c.f5449w;
        if (!obtainAttributes.hasValue(i)) {
            i = C1826c.f5442p;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = C1826c.f5447u;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = C1826c.f5443q;
        }
        boolean z = 1 == obtainAttributes.getInt(i3, 0);
        int i4 = C1826c.f5450x;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = C1826c.f5444r;
        }
        int i5 = C1826c.f5448v;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = C1826c.f5445s;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = C1826c.f5446t;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = C1826c.f5441o;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m4468g(xmlPullParser);
        }
        return new C1149c(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    private static void m4468g(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    private static List<byte[]> m4469h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
