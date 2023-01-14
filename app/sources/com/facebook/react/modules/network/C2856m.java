package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import p174e.p247e.p253d.p258e.C6071a;
import p493i.C10598d0;
import p493i.C10608g;
import p493i.C10616i;
import p493i.C10625q;

/* renamed from: com.facebook.react.modules.network.m */
class C2856m {

    /* renamed from: com.facebook.react.modules.network.m$a */
    static class C2857a extends RequestBody {

        /* renamed from: a */
        final /* synthetic */ MediaType f8030a;

        /* renamed from: b */
        final /* synthetic */ InputStream f8031b;

        C2857a(MediaType mediaType, InputStream inputStream) {
            this.f8030a = mediaType;
            this.f8031b = inputStream;
        }

        public long contentLength() {
            try {
                return (long) this.f8031b.available();
            } catch (IOException unused) {
                return 0;
            }
        }

        public MediaType contentType() {
            return this.f8030a;
        }

        public void writeTo(C10608g gVar) {
            C10598d0 d0Var = null;
            try {
                d0Var = C10625q.m36163k(this.f8031b);
                gVar.mo26330Q(d0Var);
            } finally {
                Util.closeQuietly((Closeable) d0Var);
            }
        }
    }

    /* renamed from: a */
    public static RequestBody m11317a(MediaType mediaType, InputStream inputStream) {
        return new C2857a(mediaType, inputStream);
    }

    /* renamed from: b */
    public static RequestBody m11318b(MediaType mediaType, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return RequestBody.create(mediaType, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static C2850i m11319c(RequestBody requestBody, C2849h hVar) {
        return new C2850i(requestBody, hVar);
    }

    /* renamed from: d */
    private static InputStream m11320d(Context context, Uri uri) {
        FileOutputStream fileOutputStream;
        File createTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        createTempFile.deleteOnExit();
        InputStream openStream = new URL(uri.toString()).openStream();
        try {
            ReadableByteChannel newChannel = Channels.newChannel(openStream);
            try {
                fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.getChannel().transferFrom(newChannel, 0, Long.MAX_VALUE);
                FileInputStream fileInputStream = new FileInputStream(createTempFile);
                fileOutputStream.close();
                newChannel.close();
                return fileInputStream;
            } catch (Throwable th) {
                newChannel.close();
                throw th;
            }
        } finally {
            openStream.close();
        }
    }

    /* renamed from: e */
    public static RequestBody m11321e(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return RequestBody.create((MediaType) null, C10616i.f28049f);
        }
        return null;
    }

    /* renamed from: f */
    public static InputStream m11322f(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            return parse.getScheme().startsWith("http") ? m11320d(context, parse) : context.getContentResolver().openInputStream(parse);
        } catch (Exception e) {
            C6071a.m22876j("ReactNative", "Could not retrieve file for contentUri " + str, e);
            return null;
        }
    }

    /* renamed from: g */
    public static boolean m11323g(String str) {
        return "gzip".equalsIgnoreCase(str);
    }
}
