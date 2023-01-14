package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import com.google.android.gms.common.p133n.C3746c;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.common.util.a */
public class C3754a {
    @Deprecated
    /* renamed from: a */
    public static byte[] m14498a(Context context, String str) {
        MessageDigest b;
        PackageInfo d = C3746c.m14493a(context).mo11719d(str, 64);
        Signature[] signatureArr = d.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m14499b("SHA1")) == null) {
            return null;
        }
        return b.digest(d.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m14499b(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
