package com.facebook.react.bridge;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.p126z.C3257a;
import com.facebook.systrace.C3294a;
import com.facebook.systrace.C3296b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class JavaModuleWrapper {
    private static final String TAG = "JavaModuleWrapper";
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();
    private final JSInstance mJSInstance;
    private final ArrayList<NativeModule.NativeMethod> mMethods = new ArrayList<>();
    private final ModuleHolder mModuleHolder;

    @C6410a
    public class MethodDescriptor {
        @C6410a
        Method method;
        @C6410a
        String name;
        @C6410a
        String signature;
        @C6410a
        String type;

        public MethodDescriptor() {
        }
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    @C6410a
    private void findMethods() {
        C3294a.m12881c(0, "findMethods");
        HashSet hashSet = new HashSet();
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (!hashSet.contains(name)) {
                    MethodDescriptor methodDescriptor = new MethodDescriptor();
                    JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                    methodDescriptor.name = name;
                    String type = javaMethodWrapper.getType();
                    methodDescriptor.type = type;
                    if (type == BaseJavaModule.METHOD_TYPE_SYNC) {
                        methodDescriptor.signature = javaMethodWrapper.getSignature();
                        methodDescriptor.method = method;
                    }
                    this.mMethods.add(javaMethodWrapper);
                    this.mDescs.add(methodDescriptor);
                } else {
                    throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                }
            }
        }
        C3294a.m12885g(0);
    }

    @C6410a
    public NativeMap getConstants() {
        if (C3257a.f9221b) {
            String str = TAG;
            ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Calling getConstants() on Java NativeModule (name = \"" + this.mModuleHolder.getName() + "\", className = " + this.mModuleHolder.getClassName() + ")."));
        }
        if (!this.mModuleHolder.getHasConstants()) {
            return null;
        }
        String name = getName();
        C3296b.m12892a(0, "JavaModuleWrapper.getConstants").mo10751b("moduleName", name).mo10752c();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        C3294a.m12881c(0, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        C3294a.m12885g(0);
        C3294a.m12881c(0, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            C3294a.m12885g(0);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            C3296b.m12893b(0).mo10752c();
        }
    }

    @C6410a
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @C6410a
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @C6410a
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @C6410a
    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        if (C3257a.f9221b) {
            String str = TAG;
            ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Calling method on Java NativeModule (name = \"" + this.mModuleHolder.getName() + "\", className = " + this.mModuleHolder.getClassName() + ")."));
        }
        ArrayList<NativeModule.NativeMethod> arrayList = this.mMethods;
        if (arrayList != null && i < arrayList.size()) {
            if (C3257a.f9221b) {
                String str2 = TAG;
                ReactSoftExceptionLogger.logSoftException(str2, new ReactNoCrashSoftException("Calling " + this.mDescs.get(i).name + "() on Java NativeModule (name = \"" + this.mModuleHolder.getName() + "\", className = " + this.mModuleHolder.getClassName() + ")."));
            }
            this.mMethods.get(i).invoke(this.mJSInstance, readableNativeArray);
        }
    }
}
