package com.sha256lib;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Sha256Module extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    public Sha256Module(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    /* access modifiers changed from: package-private */
    public String buildHash(String str, String str2, Integer num) {
        MessageDigest instance = MessageDigest.getInstance(str2);
        instance.update(str.getBytes("UTF-8"));
        byte[] digest = instance.digest();
        return String.format("%0" + num.toString() + "x", new Object[]{new BigInteger(1, digest)});
    }

    public String getName() {
        return "sha256Lib";
    }

    @ReactMethod
    public void sha1(String str, Promise promise) {
        String str2;
        try {
            promise.resolve(buildHash(str, "SHA-1", 40));
            return;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            str2 = e.getMessage();
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            str2 = e2.getMessage();
        }
        promise.reject("sha1", str2);
    }

    @ReactMethod
    public void sha256(String str, Promise promise) {
        String str2;
        try {
            promise.resolve(buildHash(str, "SHA-256", 64));
            return;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            str2 = e.getMessage();
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
            str2 = e2.getMessage();
        }
        promise.reject("sha256", str2);
    }
}
