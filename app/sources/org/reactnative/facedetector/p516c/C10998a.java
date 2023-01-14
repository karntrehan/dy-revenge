package org.reactnative.facedetector.p516c;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.reactnative.facedetector.C10996a;
import org.reactnative.facedetector.C10997b;
import p027c.p084n.p085a.C2049a;
import p174e.p319f.p406d.p411b.p414c.C9633a;
import p497j.p502b.p504b.C10679b;

/* renamed from: org.reactnative.facedetector.c.a */
public class C10998a extends AsyncTask<Void, Void, List<C9633a>> {

    /* renamed from: a */
    private String f28830a;

    /* renamed from: b */
    private String f28831b;

    /* renamed from: c */
    private Promise f28832c;

    /* renamed from: d */
    private int f28833d = 0;

    /* renamed from: e */
    private int f28834e = 0;

    /* renamed from: f */
    private Context f28835f;

    /* renamed from: g */
    private ReadableMap f28836g;

    /* renamed from: h */
    private int f28837h = 0;

    /* renamed from: i */
    private C10997b f28838i;

    public C10998a(Context context, ReadableMap readableMap, Promise promise) {
        this.f28830a = readableMap.getString("uri");
        this.f28832c = promise;
        this.f28836g = readableMap;
        this.f28835f = context;
    }

    /* renamed from: a */
    private static C10997b m37317a(ReadableMap readableMap, Context context) {
        C10997b bVar = new C10997b(context);
        bVar.mo29012i(false);
        if (readableMap.hasKey("mode")) {
            bVar.mo29011h(readableMap.getInt("mode"));
        }
        if (readableMap.hasKey("runClassifications")) {
            bVar.mo29009f(readableMap.getInt("runClassifications"));
        }
        if (readableMap.hasKey("detectLandmarks")) {
            bVar.mo29010g(readableMap.getInt("detectLandmarks"));
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public List<C9633a> doInBackground(Void... voidArr) {
        if (isCancelled()) {
            return null;
        }
        this.f28838i = m37317a(this.f28836g, this.f28835f);
        Bitmap decodeFile = BitmapFactory.decodeFile(this.f28831b);
        this.f28833d = decodeFile.getWidth();
        this.f28834e = decodeFile.getHeight();
        try {
            this.f28837h = new C2049a(this.f28831b).mo6897i("Orientation", 0);
        } catch (IOException e) {
            Log.e("E_FACE_DETECTION_FAILED", "Reading orientation from file `" + this.f28831b + "` failed.", e);
        }
        return this.f28838i.mo29006b(C10679b.m36350a(decodeFile));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void onPostExecute(List<C9633a> list) {
        super.onPostExecute(list);
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < list.size(); i++) {
            WritableMap f = C10996a.m37305f(list.get(i));
            f.putDouble("yawAngle", ((-f.getDouble("yawAngle")) + 360.0d) % 360.0d);
            f.putDouble("rollAngle", ((-f.getDouble("rollAngle")) + 360.0d) % 360.0d);
            createArray.pushMap(f);
        }
        createMap.putArray("faces", createArray);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("width", this.f28833d);
        createMap2.putInt("height", this.f28834e);
        createMap2.putInt("orientation", this.f28837h);
        createMap2.putString("uri", this.f28830a);
        createMap.putMap("image", createMap2);
        this.f28838i.mo29008d();
        this.f28832c.resolve(createMap);
    }

    /* access modifiers changed from: protected */
    public void onPreExecute() {
        Promise promise;
        String str;
        String str2 = this.f28830a;
        if (str2 == null) {
            promise = this.f28832c;
            str = "You have to provide an URI of an image.";
        } else {
            String path = Uri.parse(str2).getPath();
            this.f28831b = path;
            if (path == null) {
                promise = this.f28832c;
                str = "Invalid URI provided: `" + this.f28830a + "`.";
            } else {
                if (!(path.startsWith(this.f28835f.getCacheDir().getPath()) || this.f28831b.startsWith(this.f28835f.getFilesDir().getPath()))) {
                    promise = this.f28832c;
                    str = "The image has to be in the local app's directories.";
                } else if (!new File(this.f28831b).exists()) {
                    this.f28832c.reject("E_FACE_DETECTION_FAILED", "The file does not exist. Given path: `" + this.f28831b + "`.");
                    cancel(true);
                    return;
                } else {
                    return;
                }
            }
        }
        promise.reject("E_FACE_DETECTION_FAILED", str);
        cancel(true);
    }
}
