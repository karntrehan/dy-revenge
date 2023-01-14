package com.imagepicker;

import android.app.Activity;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import androidx.core.content.C1135a;
import androidx.core.content.FileProvider;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p027c.p084n.p085a.C2049a;

/* renamed from: com.imagepicker.e */
public class C5078e {

    /* renamed from: a */
    public static String f14408a = "rn_image_picker_lib_temp_";

    /* renamed from: b */
    public static String f14409b = "camera_unavailable";

    /* renamed from: c */
    public static String f14410c = "permission";

    /* renamed from: d */
    public static String f14411d = "others";

    /* renamed from: e */
    public static String f14412e = "photo";

    /* renamed from: f */
    public static String f14413f = "video";

    /* renamed from: g */
    public static String f14414g = "This library does not require Manifest.permission.CAMERA, if you add this permission in manifest then you have to obtain the same.";

    /* renamed from: A */
    static boolean m19185A(Uri uri, Context context) {
        return m19214x("video/", uri, context);
    }

    /* renamed from: B */
    public static Uri m19186B(Uri uri, Context context, C5077d dVar) {
        try {
            int[] n = m19204n(uri, context);
            if (!m19190F(n[0], n[1], dVar)) {
                return uri;
            }
            int[] m = m19203m(n[0], n[1], dVar);
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            String q = m19207q(uri);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(openInputStream), m[0], m[1], true);
            String r = m19208r(uri, context);
            File c = m19193c(context, m19202l(q));
            createScaledBitmap.compress(m19198h(q), dVar.f14401e, context.getContentResolver().openOutputStream(Uri.fromFile(c)));
            m19189E(c, r, context);
            m19195e(uri);
            return Uri.fromFile(c);
        } catch (Exception e) {
            e.printStackTrace();
            return uri;
        }
    }

    /* renamed from: C */
    public static void m19187C(Uri uri, Context context, String str) {
        Uri uri2;
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        if (str.equals("video")) {
            contentValues.put("_display_name", UUID.randomUUID().toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentValues.put("_display_name", UUID.randomUUID().toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        m19192b(uri, contentResolver.insert(uri2, contentValues), contentResolver);
    }

    /* renamed from: D */
    public static void m19188D(Intent intent) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 22) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            if (i >= 26) {
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                return;
            }
            return;
        }
        intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
    }

    /* renamed from: E */
    static void m19189E(File file, String str, Context context) {
        if (!str.equals(String.valueOf(1)) && !str.equals(String.valueOf(0))) {
            C2049a aVar = new C2049a(file);
            aVar.mo6892c0("Orientation", str);
            aVar.mo6890X();
        }
    }

    /* renamed from: F */
    static boolean m19190F(int i, int i2, C5077d dVar) {
        int i3 = dVar.f14402f;
        if ((i3 == 0 || dVar.f14403g == 0) && dVar.f14401e == 100) {
            return false;
        }
        return i3 < i || dVar.f14403g < i2 || dVar.f14401e != 100;
    }

    /* renamed from: a */
    static List<Uri> m19191a(Intent intent) {
        if (intent.getClipData() == null) {
            return Collections.singletonList(intent.getData());
        }
        ClipData clipData = intent.getClipData();
        ArrayList arrayList = new ArrayList(clipData.getItemCount());
        for (int i = 0; i < clipData.getItemCount(); i++) {
            arrayList.add(clipData.getItemAt(i).getUri());
        }
        return arrayList;
    }

    /* renamed from: b */
    public static void m19192b(Uri uri, Uri uri2, ContentResolver contentResolver) {
        try {
            OutputStream openOutputStream = contentResolver.openOutputStream(uri2);
            InputStream openInputStream = contentResolver.openInputStream(uri);
            byte[] bArr = new byte[8192];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read != -1) {
                    openOutputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static File m19193c(Context context, String str) {
        try {
            File file = new File(context.getCacheDir(), f14408a + UUID.randomUUID() + "." + str);
            file.createNewFile();
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: d */
    public static Uri m19194d(File file, Context context) {
        return FileProvider.m4407e(context, context.getApplicationContext().getPackageName() + ".imagepickerprovider", file);
    }

    /* renamed from: e */
    static void m19195e(Uri uri) {
        new File(uri.getPath()).delete();
    }

    /* renamed from: f */
    public static Uri m19196f(Uri uri, Context context) {
        if (uri == null) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri fromFile = Uri.fromFile(m19193c(context, m19202l(contentResolver.getType(uri))));
        m19192b(uri, fromFile, contentResolver);
        return fromFile;
    }

    /* renamed from: g */
    static String m19197g(Uri uri, Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            byte[] bArr = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int read = openInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    static Bitmap.CompressFormat m19198h(String str) {
        str.hashCode();
        return !str.equals("image/jpeg") ? !str.equals("image/png") ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    /* renamed from: i */
    static ReadableMap m19199i() {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("didCancel", true);
        return createMap;
    }

    /* renamed from: j */
    static ReadableMap m19200j(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("errorCode", str);
        if (str2 != null) {
            createMap.putString("errorMessage", str2);
        }
        return createMap;
    }

    /* renamed from: k */
    static double m19201k(Uri uri, Context context) {
        try {
            return (double) context.getContentResolver().openFileDescriptor(uri, "r").getStatSize();
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: l */
    static String m19202l(String str) {
        return str == null ? "jpg" : !str.equals("image/gif") ? !str.equals("image/png") ? "jpg" : "png" : "gif";
    }

    /* renamed from: m */
    static int[] m19203m(int i, int i2, C5077d dVar) {
        int i3;
        int i4 = dVar.f14402f;
        if (i4 == 0 || (i3 = dVar.f14403g) == 0) {
            return new int[]{i, i2};
        }
        if (i4 < i) {
            i2 = (int) ((((float) i4) / ((float) i)) * ((float) i2));
            i = i4;
        }
        if (i3 < i2) {
            i = (int) ((((float) i3) / ((float) i2)) * ((float) i));
        } else {
            i3 = i2;
        }
        return new int[]{i, i3};
    }

    /* renamed from: n */
    public static int[] m19204n(Uri uri, Context context) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(openInputStream, (Rect) null, options);
            return new int[]{options.outWidth, options.outHeight};
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return new int[]{0, 0};
        }
    }

    /* renamed from: o */
    static ReadableMap m19205o(Uri uri, C5077d dVar, Context context) {
        String lastPathSegment = uri.getLastPathSegment();
        C5074a aVar = new C5074a(uri, context);
        int[] n = m19204n(uri, context);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("uri", uri.toString());
        createMap.putDouble("fileSize", m19201k(uri, context));
        createMap.putString("fileName", lastPathSegment);
        createMap.putString("type", m19207q(uri));
        createMap.putInt("width", n[0]);
        createMap.putInt("height", n[1]);
        createMap.putString("type", m19206p(uri, context));
        if (dVar.f14398b.booleanValue()) {
            createMap.putString("base64", m19197g(uri, context));
        }
        if (dVar.f14399c.booleanValue()) {
            createMap.putString("timestamp", aVar.mo15416b());
            createMap.putString("id", lastPathSegment);
        }
        return createMap;
    }

    /* renamed from: p */
    static String m19206p(Uri uri, Context context) {
        return uri.getScheme().equals("file") ? m19207q(uri) : context.getContentResolver().getType(uri);
    }

    /* renamed from: q */
    static String m19207q(Uri uri) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
    }

    /* renamed from: r */
    static String m19208r(Uri uri, Context context) {
        return new C2049a(context.getContentResolver().openInputStream(uri)).mo6895g("Orientation");
    }

    /* renamed from: s */
    static ReadableMap m19209s(List<Uri> list, C5077d dVar, Context context) {
        ReadableMap readableMap;
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < list.size(); i++) {
            Uri uri = list.get(i);
            if (m19215y(uri, context)) {
                if (uri.getScheme().contains("content")) {
                    uri = m19196f(uri, context);
                }
                readableMap = m19205o(m19186B(uri, context, dVar), dVar, context);
            } else if (m19185A(uri, context)) {
                readableMap = m19210t(uri, dVar, context);
            } else {
                throw new RuntimeException("Unsupported file type");
            }
            createArray.pushMap(readableMap);
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putArray("assets", createArray);
        return createMap;
    }

    /* renamed from: t */
    static ReadableMap m19210t(Uri uri, C5077d dVar, Context context) {
        String lastPathSegment = uri.getLastPathSegment();
        WritableMap createMap = Arguments.createMap();
        C5079f fVar = new C5079f(uri, context);
        createMap.putString("uri", uri.toString());
        createMap.putDouble("fileSize", m19201k(uri, context));
        createMap.putInt("duration", fVar.mo15420e());
        createMap.putInt("bitrate", fVar.mo15418c());
        createMap.putString("fileName", lastPathSegment);
        createMap.putString("type", m19206p(uri, context));
        createMap.putInt("width", fVar.mo15422g());
        createMap.putInt("height", fVar.mo15421f());
        if (dVar.f14399c.booleanValue()) {
            createMap.putString("timestamp", fVar.mo15419d());
            createMap.putString("id", lastPathSegment);
        }
        return createMap;
    }

    /* renamed from: u */
    static boolean m19211u(Activity activity) {
        return C1135a.m4415a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    /* renamed from: v */
    public static boolean m19212v(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera") || context.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    /* renamed from: w */
    public static boolean m19213w(Context context, Activity activity) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            return strArr == null || !Arrays.asList(strArr).contains("android.permission.CAMERA") || C1135a.m4415a(activity, "android.permission.CAMERA") == 0;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return true;
        }
    }

    /* renamed from: x */
    static boolean m19214x(String str, Uri uri, Context context) {
        String p = m19206p(uri, context);
        if (p != null) {
            return p.contains(str);
        }
        return false;
    }

    /* renamed from: y */
    static boolean m19215y(Uri uri, Context context) {
        return m19214x("image/", uri, context);
    }

    /* renamed from: z */
    static boolean m19216z(int i) {
        switch (i) {
            case ImagePickerModule.REQUEST_LAUNCH_IMAGE_CAPTURE:
            case ImagePickerModule.REQUEST_LAUNCH_VIDEO_CAPTURE:
            case ImagePickerModule.REQUEST_LAUNCH_LIBRARY:
                return true;
            default:
                return false;
        }
    }
}
