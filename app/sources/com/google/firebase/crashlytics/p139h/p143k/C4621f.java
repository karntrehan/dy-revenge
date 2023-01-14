package com.google.firebase.crashlytics.p139h.p143k;

import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p142j.C4577n;
import com.google.firebase.crashlytics.p139h.p147n.C4782f;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.h.k.f */
class C4621f {

    /* renamed from: a */
    private static final Charset f13070a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final C4782f f13071b;

    /* renamed from: com.google.firebase.crashlytics.h.k.f$a */
    class C4622a extends JSONObject {

        /* renamed from: a */
        final /* synthetic */ String f13072a;

        C4622a(String str) {
            this.f13072a = str;
            put("userId", str);
        }
    }

    public C4621f(C4782f fVar) {
        this.f13071b = fVar;
    }

    /* renamed from: d */
    private static Map<String, String> m17580d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, m17585k(jSONObject, next));
        }
        return hashMap;
    }

    /* renamed from: e */
    private String m17581e(String str) {
        return m17585k(new JSONObject(str), "userId");
    }

    /* renamed from: f */
    private static String m17582f(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    /* renamed from: i */
    private static void m17583i(File file) {
        if (file.exists() && file.delete()) {
            C4542f f = C4542f.m17259f();
            f.mo14108g("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    /* renamed from: j */
    private static String m17584j(String str) {
        return new C4622a(str).toString();
    }

    /* renamed from: k */
    private static String m17585k(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    /* renamed from: a */
    public File mo14252a(String str) {
        return this.f13071b.mo14683o(str, "internal-keys");
    }

    /* renamed from: b */
    public File mo14253b(String str) {
        return this.f13071b.mo14683o(str, "keys");
    }

    /* renamed from: c */
    public File mo14254c(String str) {
        return this.f13071b.mo14683o(str, "user-data");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Map<String, String> mo14255g(String str, boolean z) {
        Exception e;
        FileInputStream fileInputStream;
        File a = z ? mo14252a(str) : mo14253b(str);
        if (!a.exists() || a.length() == 0) {
            m17583i(a);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(a);
            try {
                Map<String, String> d = m17580d(C4577n.m17371C(fileInputStream));
                C4577n.m17376e(fileInputStream, "Failed to close user metadata file.");
                return d;
            } catch (Exception e2) {
                e = e2;
                try {
                    C4542f.m17259f().mo14113l("Error deserializing user metadata.", e);
                    m17583i(a);
                    C4577n.m17376e(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    C4577n.m17376e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            Exception exc = e3;
            fileInputStream = null;
            e = exc;
            C4542f.m17259f().mo14113l("Error deserializing user metadata.", e);
            m17583i(a);
            C4577n.m17376e(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th2) {
            th = th2;
            C4577n.m17376e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* renamed from: h */
    public String mo14256h(String str) {
        FileInputStream fileInputStream;
        File c = mo14254c(str);
        FileInputStream fileInputStream2 = null;
        if (!c.exists() || c.length() == 0) {
            C4542f.m17259f().mo14104b("No userId set for session " + str);
            m17583i(c);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(c);
            try {
                String e = m17581e(C4577n.m17371C(fileInputStream));
                C4542f.m17259f().mo14104b("Loaded userId " + e + " for session " + str);
                C4577n.m17376e(fileInputStream, "Failed to close user metadata file.");
                return e;
            } catch (Exception e2) {
                e = e2;
                try {
                    C4542f.m17259f().mo14113l("Error deserializing user metadata.", e);
                    m17583i(c);
                    C4577n.m17376e(fileInputStream, "Failed to close user metadata file.");
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    C4577n.m17376e(fileInputStream2, "Failed to close user metadata file.");
                    throw th;
                }
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
            C4542f.m17259f().mo14113l("Error deserializing user metadata.", e);
            m17583i(c);
            C4577n.m17376e(fileInputStream, "Failed to close user metadata file.");
            return null;
        } catch (Throwable th2) {
            th = th2;
            C4577n.m17376e(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* renamed from: l */
    public void mo14257l(String str, Map<String, String> map, boolean z) {
        File a = z ? mo14252a(str) : mo14253b(str);
        BufferedWriter bufferedWriter = null;
        try {
            String f = m17582f(map);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a), f13070a));
            try {
                bufferedWriter2.write(f);
                bufferedWriter2.flush();
                C4577n.m17376e(bufferedWriter2, "Failed to close key/value metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C4542f.m17259f().mo14113l("Error serializing key/value metadata.", e);
                    m17583i(a);
                    C4577n.m17376e(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    C4577n.m17376e(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C4577n.m17376e(bufferedWriter, "Failed to close key/value metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C4542f.m17259f().mo14113l("Error serializing key/value metadata.", e);
            m17583i(a);
            C4577n.m17376e(bufferedWriter, "Failed to close key/value metadata file.");
        }
    }

    /* renamed from: m */
    public void mo14258m(String str, String str2) {
        File c = mo14254c(str);
        BufferedWriter bufferedWriter = null;
        try {
            String j = m17584j(str2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c), f13070a));
            try {
                bufferedWriter2.write(j);
                bufferedWriter2.flush();
                C4577n.m17376e(bufferedWriter2, "Failed to close user metadata file.");
            } catch (Exception e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C4542f.m17259f().mo14113l("Error serializing user metadata.", e);
                    C4577n.m17376e(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    C4577n.m17376e(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                C4577n.m17376e(bufferedWriter, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            C4542f.m17259f().mo14113l("Error serializing user metadata.", e);
            C4577n.m17376e(bufferedWriter, "Failed to close user metadata file.");
        }
    }
}
