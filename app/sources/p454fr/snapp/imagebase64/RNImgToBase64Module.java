package p454fr.snapp.imagebase64;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Base64;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: fr.snapp.imagebase64.RNImgToBase64Module */
public class RNImgToBase64Module extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    public RNImgToBase64Module(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private String bitmapToBase64(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    @ReactMethod
    public void getBase64String(String str, Promise promise) {
        try {
            Bitmap bitmapFromURL = str.contains("http") ? getBitmapFromURL(str) : MediaStore.Images.Media.getBitmap(this.reactContext.getContentResolver(), Uri.parse(str));
            if (bitmapFromURL == null) {
                promise.reject("Error", "Failed to decode Bitmap, uri: " + str);
                return;
            }
            promise.resolve(bitmapToBase64(bitmapFromURL));
        } catch (Error e) {
            promise.reject("Error", "Failed to decode Bitmap: " + e);
            e.printStackTrace();
        } catch (Exception e2) {
            promise.reject("Error", "Exception: " + e2);
            e2.printStackTrace();
        }
    }

    public Bitmap getBitmapFromURL(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getName() {
        return "RNImgToBase64";
    }
}
