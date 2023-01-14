package com.facebook.react.bridge;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p174e.p247e.p317m.p318a.C6410a;

@C6410a
public class ReactMarker {
    private static final List<FabricMarkerListener> sFabricMarkerListeners = new CopyOnWriteArrayList();
    private static final List<MarkerListener> sListeners = new CopyOnWriteArrayList();

    public interface FabricMarkerListener {
        void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i, long j);
    }

    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i);
    }

    @C6410a
    public static void addFabricListener(FabricMarkerListener fabricMarkerListener) {
        List<FabricMarkerListener> list = sFabricMarkerListeners;
        if (!list.contains(fabricMarkerListener)) {
            list.add(fabricMarkerListener);
        }
    }

    @C6410a
    public static void addListener(MarkerListener markerListener) {
        List<MarkerListener> list = sListeners;
        if (!list.contains(markerListener)) {
            list.add(markerListener);
        }
    }

    @C6410a
    public static void clearFabricMarkerListeners() {
        sFabricMarkerListeners.clear();
    }

    @C6410a
    public static void clearMarkerListeners() {
        sListeners.clear();
    }

    @C6410a
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        logFabricMarker(reactMarkerConstants, str, i, -1);
    }

    @C6410a
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i, long j) {
        for (FabricMarkerListener logFabricMarker : sFabricMarkerListeners) {
            logFabricMarker.logFabricMarker(reactMarkerConstants, str, i, j);
        }
    }

    @C6410a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        logMarker(reactMarkerConstants, (String) null, 0);
    }

    @C6410a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i) {
        logMarker(reactMarkerConstants, (String) null, i);
    }

    @C6410a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str) {
        logMarker(reactMarkerConstants, str, 0);
    }

    @C6410a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        logFabricMarker(reactMarkerConstants, str, i);
        for (MarkerListener logMarker : sListeners) {
            logMarker.logMarker(reactMarkerConstants, str, i);
        }
    }

    @C6410a
    public static void logMarker(String str) {
        logMarker(str, (String) null);
    }

    @C6410a
    public static void logMarker(String str, int i) {
        logMarker(str, (String) null, i);
    }

    @C6410a
    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    @C6410a
    public static void logMarker(String str, String str2, int i) {
        logMarker(ReactMarkerConstants.valueOf(str), str2, i);
    }

    @C6410a
    public static void removeFabricListener(FabricMarkerListener fabricMarkerListener) {
        sFabricMarkerListeners.remove(fabricMarkerListener);
    }

    @C6410a
    public static void removeListener(MarkerListener markerListener) {
        sListeners.remove(markerListener);
    }
}
