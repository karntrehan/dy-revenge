package com.reactnative.ivpusic.imagepicker;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.os.Environment;
import android.util.Log;
import android.util.Pair;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: com.reactnative.ivpusic.imagepicker.a */
class C5226a {
    C5226a() {
    }

    /* renamed from: a */
    private int m19526a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i > i3 || i2 > i4) {
            int i6 = i / 2;
            int i7 = i2 / 2;
            while (i6 / i5 >= i3 && i7 / i5 >= i4) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: b */
    private Pair<Integer, Integer> m19527b(int i, int i2, int i3, int i4) {
        if (i > i3) {
            i2 = (int) (((float) i2) * (((float) i3) / ((float) i)));
            i = i3;
        }
        if (i2 > i4) {
            i = (int) (((float) i) * (((float) i4) / ((float) i2)));
        } else {
            i4 = i2;
        }
        return Pair.create(Integer.valueOf(i), Integer.valueOf(i4));
    }

    /* renamed from: f */
    private boolean m19528f(String str) {
        return !str.equals(String.valueOf(1)) && !str.equals(String.valueOf(0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public File mo15828c(Context context, ReadableMap readableMap, String str, BitmapFactory.Options options) {
        ReadableMap readableMap2 = readableMap;
        BitmapFactory.Options options2 = options;
        Double d = null;
        Integer valueOf = readableMap2.hasKey("compressImageMaxWidth") ? Integer.valueOf(readableMap2.getInt("compressImageMaxWidth")) : null;
        Integer valueOf2 = readableMap2.hasKey("compressImageMaxHeight") ? Integer.valueOf(readableMap2.getInt("compressImageMaxHeight")) : null;
        if (readableMap2.hasKey("compressImageQuality")) {
            d = Double.valueOf(readableMap2.getDouble("compressImageQuality"));
        }
        boolean z = false;
        boolean z2 = d == null || d.doubleValue() == 1.0d;
        boolean z3 = valueOf == null || valueOf.intValue() >= options2.outWidth;
        boolean z4 = valueOf2 == null || valueOf2.intValue() >= options2.outHeight;
        List asList = Arrays.asList(new String[]{"image/jpeg", "image/jpg", "image/png", "image/gif", "image/tiff"});
        String str2 = options2.outMimeType;
        if (str2 != null && asList.contains(str2.toLowerCase())) {
            z = true;
        }
        if (!z2 || !z3 || !z4 || !z) {
            String str3 = str;
            Log.d("image-crop-picker", "Image compression activated");
            int doubleValue = d != null ? (int) (d.doubleValue() * 100.0d) : 100;
            Log.d("image-crop-picker", "Compressing image with quality " + doubleValue);
            if (valueOf == null) {
                valueOf = Integer.valueOf(options2.outWidth);
            }
            if (valueOf2 == null) {
                valueOf2 = Integer.valueOf(options2.outHeight);
            }
            return mo15830e(context, str, options2.outWidth, options2.outHeight, valueOf.intValue(), valueOf2.intValue(), doubleValue);
        }
        Log.d("image-crop-picker", "Skipping image compression");
        return new File(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized void mo15829d(Activity activity, ReadableMap readableMap, String str, String str2, Promise promise) {
        promise.resolve(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public File mo15830e(Context context, String str, int i, int i2, int i3, int i4, int i5) {
        Bitmap bitmap;
        Pair<Integer, Integer> b = m19527b(i, i2, i3, i4);
        int intValue = ((Integer) b.first).intValue();
        int intValue2 = ((Integer) b.second).intValue();
        if (i > i3 || i2 > i4) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = m19526a(i, i2, intValue, intValue2);
            bitmap = BitmapFactory.decodeFile(str, options);
        } else {
            bitmap = BitmapFactory.decodeFile(str);
        }
        String attribute = new ExifInterface(str).getAttribute("Orientation");
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, intValue, intValue2, true);
        File externalFilesDir = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        if (!externalFilesDir.exists()) {
            Log.d("image-crop-picker", "Pictures Directory is not existing. Will create this directory.");
            externalFilesDir.mkdirs();
        }
        File file = new File(externalFilesDir, UUID.randomUUID() + ".jpg");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, i5, bufferedOutputStream);
        if (m19528f(attribute)) {
            ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
            exifInterface.setAttribute("Orientation", attribute);
            exifInterface.saveAttributes();
        }
        bufferedOutputStream.close();
        createScaledBitmap.recycle();
        return file;
    }
}
