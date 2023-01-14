package com.reactnativeotpautofill;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.reactnativeotpautofill.c */
public class C5342c extends ContextWrapper {

    /* renamed from: a */
    public static final String f14967a = C5342c.class.getSimpleName();

    public C5342c(Context context) {
        super(context);
    }

    /* renamed from: b */
    private static String m19793b(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str3.getBytes(StandardCharsets.UTF_8));
            String substring = Base64.encodeToString(Arrays.copyOfRange(instance.digest(), 0, 9), 3).substring(0, 11);
            Log.d(f14967a, String.format("pkg: %s -- hash: %s", new Object[]{str, substring}));
            return substring;
        } catch (NoSuchAlgorithmException e) {
            Log.e(f14967a, "hash:NoSuchAlgorithm", e);
            return null;
        }
    }

    /* renamed from: a */
    public ArrayList<String> mo16117a() {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            String packageName = getPackageName();
            for (Signature charsString : getPackageManager().getPackageInfo(packageName, 64).signatures) {
                String b = m19793b(packageName, charsString.toCharsString());
                if (b != null) {
                    arrayList.add(String.format("%s", new Object[]{b}));
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(f14967a, "Unable to find package to obtain hash.", e);
        }
        return arrayList;
    }
}
