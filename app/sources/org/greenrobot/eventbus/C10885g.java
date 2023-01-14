package org.greenrobot.eventbus;

import java.io.PrintStream;
import java.util.logging.Level;
import org.greenrobot.eventbus.android.C10873a;

/* renamed from: org.greenrobot.eventbus.g */
public interface C10885g {

    /* renamed from: org.greenrobot.eventbus.g$a */
    public static class C10886a {
        /* renamed from: a */
        public static C10885g m37026a() {
            return C10873a.m36990a() ? C10873a.m36991b().f28435b : new C10887b();
        }
    }

    /* renamed from: org.greenrobot.eventbus.g$b */
    public static class C10887b implements C10885g {
        /* renamed from: a */
        public void mo28469a(Level level, String str) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
        }

        /* renamed from: b */
        public void mo28470b(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }

    /* renamed from: a */
    void mo28469a(Level level, String str);

    /* renamed from: b */
    void mo28470b(Level level, String str, Throwable th);
}
