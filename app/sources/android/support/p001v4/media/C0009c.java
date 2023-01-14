package android.support.p001v4.media;

import android.media.MediaDescription;
import android.net.Uri;

/* renamed from: android.support.v4.media.c */
class C0009c {

    /* renamed from: android.support.v4.media.c$a */
    static class C0010a {
        /* renamed from: a */
        public static void m44a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m43a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
