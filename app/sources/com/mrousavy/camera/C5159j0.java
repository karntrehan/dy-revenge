package com.mrousavy.camera;

/* renamed from: com.mrousavy.camera.j0 */
public final class C5159j0 extends C5152g {
    public C5159j0(Throwable th) {
        super("capture", "encoder-error", "The recording failed while encoding.\nThis error may be generated when the video or audio codec encounters an error during encoding. When this happens and the output file is generated, the output file is not properly constructed. The application will need to clean up the output file, such as deleting the file.", th);
    }
}
