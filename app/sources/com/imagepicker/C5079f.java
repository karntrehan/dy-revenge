package com.imagepicker;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.imagepicker.f */
public class C5079f extends C5076c {

    /* renamed from: d */
    private int f14415d;

    /* renamed from: e */
    private int f14416e;

    public C5079f(Uri uri, Context context) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        Bitmap b = m19217b(uri, context, mediaMetadataRetriever);
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(20);
        String extractMetadata3 = mediaMetadataRetriever.extractMetadata(5);
        if (extractMetadata != null) {
            this.f14415d = Math.round(Float.parseFloat(extractMetadata)) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
        }
        if (extractMetadata2 != null) {
            this.f14416e = Integer.parseInt(extractMetadata2);
        }
        if (extractMetadata3 != null) {
            this.f14394a = mo15417a(extractMetadata3.substring(0, extractMetadata3.indexOf(".")).replace("T", " "), "yyyyMMdd HHmmss");
        }
        if (b != null) {
            this.f14396c = b.getWidth();
            this.f14395b = b.getHeight();
        }
        mediaMetadataRetriever.release();
    }

    /* renamed from: b */
    private Bitmap m19217b(Uri uri, Context context, MediaMetadataRetriever mediaMetadataRetriever) {
        try {
            mediaMetadataRetriever.setDataSource(new FileInputStream(context.getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor()).getFD());
            return mediaMetadataRetriever.getFrameAtTime();
        } catch (IOException | RuntimeException e) {
            Log.e("RNIP", "Could not retrieve width and height from video: " + e.getMessage());
            return null;
        }
    }

    /* renamed from: c */
    public int mo15418c() {
        return this.f14416e;
    }

    /* renamed from: d */
    public String mo15419d() {
        return this.f14394a;
    }

    /* renamed from: e */
    public int mo15420e() {
        return this.f14415d;
    }

    /* renamed from: f */
    public int mo15421f() {
        return this.f14395b;
    }

    /* renamed from: g */
    public int mo15422g() {
        return this.f14396c;
    }
}
