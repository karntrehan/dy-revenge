package com.facebook.react.modules.blob;

import android.util.Base64;
import com.facebook.fbreact.specs.NativeFileReaderModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.p109b0.p110a.C2639a;

@C2639a(name = "FileReaderModule")
public class FileReaderModule extends NativeFileReaderModuleSpec {
    private static final String ERROR_INVALID_BLOB = "ERROR_INVALID_BLOB";
    public static final String NAME = "FileReaderModule";

    public FileReaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private BlobModule getBlobModule(String str) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (BlobModule) reactApplicationContextIfActiveOrWarn.getNativeModule(BlobModule.class);
        }
        return null;
    }

    public String getName() {
        return NAME;
    }

    public void readAsDataURL(ReadableMap readableMap, Promise promise) {
        BlobModule blobModule = getBlobModule("readAsDataURL");
        if (blobModule == null) {
            promise.reject((Throwable) new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
            return;
        }
        byte[] resolve = blobModule.resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (resolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("data:");
            sb.append((!readableMap.hasKey("type") || readableMap.getString("type").isEmpty()) ? "application/octet-stream" : readableMap.getString("type"));
            sb.append(";base64,");
            sb.append(Base64.encodeToString(resolve, 2));
            promise.resolve(sb.toString());
        } catch (Exception e) {
            promise.reject((Throwable) e);
        }
    }

    public void readAsText(ReadableMap readableMap, String str, Promise promise) {
        BlobModule blobModule = getBlobModule("readAsText");
        if (blobModule == null) {
            promise.reject((Throwable) new IllegalStateException("Could not get BlobModule from ReactApplicationContext"));
            return;
        }
        byte[] resolve = blobModule.resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
        if (resolve == null) {
            promise.reject(ERROR_INVALID_BLOB, "The specified blob is invalid");
            return;
        }
        try {
            promise.resolve(new String(resolve, str));
        } catch (Exception e) {
            promise.reject((Throwable) e);
        }
    }
}
