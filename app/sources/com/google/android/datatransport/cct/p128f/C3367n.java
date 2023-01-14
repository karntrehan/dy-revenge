package com.google.android.datatransport.cct.p128f;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: com.google.android.datatransport.cct.f.n */
public abstract class C3367n {
    /* renamed from: a */
    static C3367n m13223a(long j) {
        return new C3355h(j);
    }

    /* renamed from: b */
    public static C3367n m13224b(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return m13223a(Long.parseLong(jsonReader.nextString()));
                } else {
                    C3367n a = m13223a(jsonReader.nextLong());
                    jsonReader.close();
                    return a;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: c */
    public abstract long mo10933c();
}
