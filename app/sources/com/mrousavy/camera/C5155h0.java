package com.mrousavy.camera;

/* renamed from: com.mrousavy.camera.h0 */
public final class C5155h0 extends C5152g {
    public C5155h0(Throwable th) {
        super("capture", "recorder-error", "The recording failed because the Recorder is in an unrecoverable error state.\nWhen this happens and the output file is generated, the output file is not properly constructed. The application will need to clean up the output file, such as deleting the file. Such an error will usually require creating a new Recorder object to start a new recording.", th);
    }
}
