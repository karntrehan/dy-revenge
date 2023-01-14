package androidx.core.util;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* renamed from: androidx.core.util.c */
public class C1172c extends Writer {

    /* renamed from: f */
    private final String f3260f;

    /* renamed from: o */
    private StringBuilder f3261o = new StringBuilder(128);

    public C1172c(String str) {
        this.f3260f = str;
    }

    /* renamed from: a */
    private void m4571a() {
        if (this.f3261o.length() > 0) {
            Log.d(this.f3260f, this.f3261o.toString());
            StringBuilder sb = this.f3261o;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m4571a();
    }

    public void flush() {
        m4571a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m4571a();
            } else {
                this.f3261o.append(c);
            }
        }
    }
}
