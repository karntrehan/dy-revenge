package p174e.p319f.p320a.p382e.p383a.p385b;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: e.f.a.e.a.b.a */
public final class C9101a {

    /* renamed from: a */
    private final String f24987a;

    public C9101a(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        StringBuilder sb = new StringBuilder(39);
        sb.append("UID: [");
        sb.append(myUid);
        sb.append("]  PID: [");
        sb.append(myPid);
        sb.append("] ");
        String valueOf = String.valueOf(sb.toString());
        String valueOf2 = String.valueOf(str);
        this.f24987a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: f */
    private final int m30320f(int i, String str, Object[] objArr) {
        if (Log.isLoggable("PlayCore", i)) {
            return Log.i("PlayCore", m30321g(this.f24987a, str, objArr));
        }
        return 0;
    }

    /* renamed from: g */
    private static String m30321g(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo23080a(String str, Object... objArr) {
        m30320f(3, str, objArr);
    }

    /* renamed from: b */
    public final void mo23081b(String str, Object... objArr) {
        m30320f(6, str, objArr);
    }

    /* renamed from: c */
    public final void mo23082c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", m30321g(this.f24987a, str, objArr), th);
        }
    }

    /* renamed from: d */
    public final void mo23083d(String str, Object... objArr) {
        m30320f(4, str, objArr);
    }

    /* renamed from: e */
    public final void mo23084e(String str, Object... objArr) {
        m30320f(5, str, objArr);
    }
}
