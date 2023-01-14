package com.mrousavy.camera;

/* renamed from: com.mrousavy.camera.e0 */
public final class C5143e0 extends C5152g {
    public C5143e0(Throwable th) {
        super("capture", "no-valid-data", "The recording failed because no valid data was produced to be recorded.\nThis error is generated when the essential data for a recording to be played correctly is missing, for example, a recording must contain at least one key frame. The application will need to clean up the output file, such as deleting the file.", th);
    }
}
