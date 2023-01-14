package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.C1425a;

public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(C1425a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3748a = (AudioAttributes) aVar.mo5301r(audioAttributesImplApi21.f3748a, 1);
        audioAttributesImplApi21.f3749b = aVar.mo5299p(audioAttributesImplApi21.f3749b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, C1425a aVar) {
        aVar.mo5307x(false, false);
        aVar.mo5281H(audioAttributesImplApi21.f3748a, 1);
        aVar.mo5279F(audioAttributesImplApi21.f3749b, 2);
    }
}
