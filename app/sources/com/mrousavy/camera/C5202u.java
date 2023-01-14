package com.mrousavy.camera;

/* renamed from: com.mrousavy.camera.u */
public final class C5202u extends C5152g {
    public C5202u(Throwable th) {
        super("capture", "inactive-source", "The recording failed because the source becomes inactive and stops sending frames.\nOne case is that if camera is closed due to lifecycle stopped, the active recording will be finalized with this error, and the output will be generated, containing the frames produced before camera closing. Attempting to start a new recording will be finalized immediately if the source remains inactive and no output will be generated.", th);
    }
}
