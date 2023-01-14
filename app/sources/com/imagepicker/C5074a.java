package com.imagepicker;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import p027c.p084n.p085a.C2049a;

/* renamed from: com.imagepicker.a */
public class C5074a extends C5076c {
    public C5074a(Uri uri, Context context) {
        try {
            String g = new C2049a(context.getContentResolver().openInputStream(uri)).mo6895g("DateTime");
            if (g != null) {
                this.f14394a = mo15417a(g, "yyyy:MM:dd HH:mm:ss");
            }
        } catch (Exception e) {
            Log.e("RNIP", "Could not load image metadata: " + e.getMessage());
        }
    }

    /* renamed from: b */
    public String mo15416b() {
        return this.f14394a;
    }
}
