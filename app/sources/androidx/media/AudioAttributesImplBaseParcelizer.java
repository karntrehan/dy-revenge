package androidx.media;

import androidx.versionedparcelable.C1425a;

public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(C1425a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3750a = aVar.mo5299p(audioAttributesImplBase.f3750a, 1);
        audioAttributesImplBase.f3751b = aVar.mo5299p(audioAttributesImplBase.f3751b, 2);
        audioAttributesImplBase.f3752c = aVar.mo5299p(audioAttributesImplBase.f3752c, 3);
        audioAttributesImplBase.f3753d = aVar.mo5299p(audioAttributesImplBase.f3753d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, C1425a aVar) {
        aVar.mo5307x(false, false);
        aVar.mo5279F(audioAttributesImplBase.f3750a, 1);
        aVar.mo5279F(audioAttributesImplBase.f3751b, 2);
        aVar.mo5279F(audioAttributesImplBase.f3752c, 3);
        aVar.mo5279F(audioAttributesImplBase.f3753d, 4);
    }
}
