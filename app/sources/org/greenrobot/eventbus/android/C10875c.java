package org.greenrobot.eventbus.android;

import android.util.Log;
import java.util.logging.Level;
import org.greenrobot.eventbus.C10885g;

/* renamed from: org.greenrobot.eventbus.android.c */
public class C10875c implements C10885g {

    /* renamed from: a */
    private final String f28437a;

    public C10875c(String str) {
        this.f28437a = str;
    }

    /* renamed from: c */
    private int m36995c(Level level) {
        int intValue = level.intValue();
        if (intValue < 800) {
            return intValue < 500 ? 2 : 3;
        }
        if (intValue < 900) {
            return 4;
        }
        return intValue < 1000 ? 5 : 6;
    }

    /* renamed from: a */
    public void mo28469a(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(m36995c(level), this.f28437a, str);
        }
    }

    /* renamed from: b */
    public void mo28470b(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            int c = m36995c(level);
            String str2 = this.f28437a;
            Log.println(c, str2, str + "\n" + Log.getStackTraceString(th));
        }
    }
}
