package com.reactnativecommunity.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.facebook.react.bridge.ContextBaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.p109b0.p110a.C2639a;
import okhttp3.HttpUrl;

@C2639a(name = "RNCClipboard")
public class ClipboardModule extends ContextBaseJavaModule {
    public static final String NAME = "RNCClipboard";

    public ClipboardModule(Context context) {
        super(context);
    }

    private ClipboardManager getClipboardService() {
        Context context = getContext();
        getContext();
        return (ClipboardManager) context.getSystemService("clipboard");
    }

    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getString(Promise promise) {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipData primaryClip = clipboardService.getPrimaryClip();
            if (primaryClip != null) {
                if (primaryClip.getItemCount() >= 1) {
                    ClipData.Item itemAt = clipboardService.getPrimaryClip().getItemAt(0);
                    promise.resolve(HttpUrl.FRAGMENT_ENCODE_SET + itemAt.getText());
                    return;
                }
            }
            promise.resolve(HttpUrl.FRAGMENT_ENCODE_SET);
        } catch (Exception e) {
            promise.reject((Throwable) e);
        }
    }

    @ReactMethod
    public void hasString(Promise promise) {
        try {
            ClipData primaryClip = getClipboardService().getPrimaryClip();
            boolean z = true;
            if (primaryClip == null || primaryClip.getItemCount() < 1) {
                z = false;
            }
            promise.resolve(Boolean.valueOf(z));
        } catch (Exception e) {
            promise.reject((Throwable) e);
        }
    }

    @ReactMethod
    public void setString(String str) {
        getClipboardService().setPrimaryClip(ClipData.newPlainText((CharSequence) null, str));
    }
}
