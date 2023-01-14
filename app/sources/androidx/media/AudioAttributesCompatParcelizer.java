package androidx.media;

import androidx.versionedparcelable.C1425a;

public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(C1425a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f3747c = (AudioAttributesImpl) aVar.mo5305v(audioAttributesCompat.f3747c, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, C1425a aVar) {
        aVar.mo5307x(false, false);
        aVar.mo5286M(audioAttributesCompat.f3747c, 1);
    }
}
