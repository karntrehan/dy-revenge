package com.google.firebase.installations.p152m;

import com.google.firebase.C4825h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.internal.http2.Http2;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.m.c */
public class C4851c {

    /* renamed from: a */
    private File f13651a;

    /* renamed from: b */
    private final C4825h f13652b;

    /* renamed from: com.google.firebase.installations.m.c$a */
    public enum C4852a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public C4851c(C4825h hVar) {
        this.f13652b = hVar;
    }

    /* renamed from: a */
    private File m18538a() {
        if (this.f13651a == null) {
            synchronized (this) {
                if (this.f13651a == null) {
                    File filesDir = this.f13652b.mo14733j().getFilesDir();
                    this.f13651a = new File(filesDir, "PersistedInstallation." + this.f13652b.mo14736p() + ".json");
                }
            }
        }
        return this.f13651a;
    }

    /* renamed from: c */
    private JSONObject m18539c() {
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            fileInputStream = new FileInputStream(m18538a());
            while (true) {
                int read = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                if (read < 0) {
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                    fileInputStream.close();
                    return jSONObject;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (IOException | JSONException unused) {
            return new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: b */
    public C4853d mo14785b(C4853d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", dVar.mo14766d());
            jSONObject.put("Status", dVar.mo14770g().ordinal());
            jSONObject.put("AuthToken", dVar.mo14764b());
            jSONObject.put("RefreshToken", dVar.mo14769f());
            jSONObject.put("TokenCreationEpochInSecs", dVar.mo14771h());
            jSONObject.put("ExpiresInSecs", dVar.mo14765c());
            jSONObject.put("FisError", dVar.mo14767e());
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.f13652b.mo14733j().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(m18538a())) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: d */
    public C4853d mo14786d() {
        JSONObject c = m18539c();
        String optString = c.optString("Fid", (String) null);
        int optInt = c.optInt("Status", C4852a.ATTEMPT_MIGRATION.ordinal());
        String optString2 = c.optString("AuthToken", (String) null);
        String optString3 = c.optString("RefreshToken", (String) null);
        long optLong = c.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = c.optLong("ExpiresInSecs", 0);
        return C4853d.m18542a().mo14778d(optString).mo14781g(C4852a.values()[optInt]).mo14776b(optString2).mo14780f(optString3).mo14782h(optLong).mo14777c(optLong2).mo14779e(c.optString("FisError", (String) null)).mo14775a();
    }
}
