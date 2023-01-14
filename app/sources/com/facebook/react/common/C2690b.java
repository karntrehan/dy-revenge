package com.facebook.react.common;

import android.net.Uri;
import okhttp3.HttpUrl;

/* renamed from: com.facebook.react.common.b */
public class C2690b extends RuntimeException {

    /* renamed from: f */
    private final String f7778f;

    public C2690b(String str, Throwable th) {
        super(str, th);
        this.f7778f = str;
    }

    /* renamed from: a */
    public static C2690b m10901a(String str, String str2, String str3, Throwable th) {
        String replace = "\n\nTry the following to fix the issue:\n• Ensure that Metro is running\n• Ensure that your device/emulator is connected to your machine and has USB debugging enabled - run 'adb devices' to see a list of connected devices\n• Ensure Airplane Mode is disabled\n• If you're on a physical device connected to the same machine, run 'adb reverse tcp:<PORT> tcp:<PORT>' to forward requests from your device\n• If your device is on the same Wi-Fi network, set 'Debug server host & port for device' in 'Dev settings' to your machine's IP address and the port of the local dev server - e.g. 10.0.1.1:<PORT>\n\n".replace("<PORT>", String.valueOf(Uri.parse(str).getPort()));
        return new C2690b(str2 + replace + str3, th);
    }

    /* renamed from: b */
    public static C2690b m10902b(String str, String str2, Throwable th) {
        return m10901a(str, str2, HttpUrl.FRAGMENT_ENCODE_SET, th);
    }
}
