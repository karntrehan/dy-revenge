package com.RNFetchBlob;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;

/* renamed from: com.RNFetchBlob.h */
public class C2298h {

    /* renamed from: com.RNFetchBlob.h$a */
    class C2299a implements X509TrustManager {
        C2299a() {
        }

        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* renamed from: com.RNFetchBlob.h$b */
    class C2300b implements HostnameVerifier {
        C2300b() {
        }

        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    /* renamed from: a */
    public static void m9607a(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", "warn");
        createMap.putString("detail", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) C2264RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFetchBlobMessage", createMap);
    }

    /* renamed from: b */
    public static String m9608b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                sb.append(String.format("%02x", new Object[]{Integer.valueOf(digest[i] & 255)}));
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: c */
    public static OkHttpClient.Builder m9609c(OkHttpClient okHttpClient) {
        try {
            C2299a aVar = new C2299a();
            SSLContext instance = SSLContext.getInstance("SSL");
            instance.init((KeyManager[]) null, new TrustManager[]{aVar}, new SecureRandom());
            SSLSocketFactory socketFactory = instance.getSocketFactory();
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            newBuilder.sslSocketFactory(socketFactory, aVar);
            newBuilder.hostnameVerifier(new C2300b());
            return newBuilder;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
