package org.reactnative.camera;

import com.facebook.react.C2906s;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.lwansbrough.RCTCamera.RCTCameraViewManager;
import java.util.Arrays;
import java.util.List;
import org.reactnative.facedetector.FaceDetectorModule;

/* renamed from: org.reactnative.camera.c */
public class C10941c implements C2906s {
    /* renamed from: a */
    public List<ViewManager> mo7573a(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ViewManager[]{new RCTCameraViewManager(), new CameraViewManager()});
    }

    /* renamed from: d */
    public List<NativeModule> mo7574d(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new NativeModule[]{new RCTCameraModule(reactApplicationContext), new CameraModule(reactApplicationContext), new FaceDetectorModule(reactApplicationContext)});
    }
}
