package com.mrousavy.camera;

/* renamed from: com.mrousavy.camera.v */
public final class C5203v extends C5152g {
    public C5203v(Throwable th) {
        super("capture", "insufficient-storage", "The recording failed due to insufficient storage space.\nThere are two possible cases that will cause this error.\n1. The storage is already full before the recording starts, so no output file will be generated.\n2. The storage becomes full during recording, so the output file will be generated.", th);
    }
}
