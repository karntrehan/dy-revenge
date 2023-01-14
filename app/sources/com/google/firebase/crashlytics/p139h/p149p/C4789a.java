package com.google.firebase.crashlytics.p139h.p149p;

import com.google.firebase.crashlytics.p139h.C4542f;
import com.google.firebase.crashlytics.p139h.p142j.C4577n;
import com.google.firebase.crashlytics.p139h.p147n.C4782f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import org.json.JSONObject;

/* renamed from: com.google.firebase.crashlytics.h.p.a */
public class C4789a {

    /* renamed from: a */
    private final File f13495a;

    public C4789a(C4782f fVar) {
        this.f13495a = fVar.mo14674e("com.crashlytics.settings.json");
    }

    /* renamed from: a */
    private File m18319a() {
        return this.f13495a;
    }

    /* renamed from: b */
    public JSONObject mo14690b() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        C4542f.m17259f().mo14104b("Checking for cached settings...");
        FileInputStream fileInputStream2 = null;
        try {
            File a = m18319a();
            if (a.exists()) {
                fileInputStream = new FileInputStream(a);
                try {
                    jSONObject = new JSONObject(C4577n.m17371C(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception e) {
                    e = e;
                    try {
                        C4542f.m17259f().mo14107e("Failed to fetch cached settings", e);
                        C4577n.m17376e(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        C4577n.m17376e(fileInputStream, "Error while closing settings cache file.");
                        throw th;
                    }
                }
            } else {
                C4542f.m17259f().mo14110i("Settings file does not exist.");
                jSONObject = null;
            }
            C4577n.m17376e(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
            C4542f.m17259f().mo14107e("Failed to fetch cached settings", e);
            C4577n.m17376e(fileInputStream, "Error while closing settings cache file.");
            return null;
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
            C4577n.m17376e(fileInputStream, "Error while closing settings cache file.");
            throw th;
        }
    }

    /* renamed from: c */
    public void mo14691c(long j, JSONObject jSONObject) {
        C4542f.m17259f().mo14110i("Writing settings to cache file...");
        if (jSONObject != null) {
            FileWriter fileWriter = null;
            try {
                jSONObject.put("expires_at", j);
                FileWriter fileWriter2 = new FileWriter(m18319a());
                try {
                    fileWriter2.write(jSONObject.toString());
                    fileWriter2.flush();
                    C4577n.m17376e(fileWriter2, "Failed to close settings writer.");
                } catch (Exception e) {
                    e = e;
                    fileWriter = fileWriter2;
                    try {
                        C4542f.m17259f().mo14107e("Failed to cache settings", e);
                        C4577n.m17376e(fileWriter, "Failed to close settings writer.");
                    } catch (Throwable th) {
                        th = th;
                        C4577n.m17376e(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    C4577n.m17376e(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                C4542f.m17259f().mo14107e("Failed to cache settings", e);
                C4577n.m17376e(fileWriter, "Failed to close settings writer.");
            }
        }
    }
}
