package com.facebook.react.fabric.events;

import android.util.Pair;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.C2765c;
import com.facebook.react.uimanager.events.C2958k;
import com.facebook.react.uimanager.events.RCTModernEventEmitter;
import com.facebook.systrace.C3294a;
import java.util.HashSet;
import p174e.p247e.p253d.p258e.C6071a;

public class FabricEventEmitter implements RCTModernEventEmitter {
    private static final String TAG = "FabricEventEmitter";
    private final C2765c mUIManager;

    public FabricEventEmitter(C2765c cVar) {
    }

    private WritableArray copyWritableArray(WritableArray writableArray) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i = 0; i < writableArray.size(); i++) {
            writableNativeArray.pushMap(getWritableMap(writableArray.getMap(i)));
        }
        return writableNativeArray;
    }

    private static int getTouchCategory(String str) {
        if (C2958k.MOVE.mo9671g().equals(str)) {
            return 4;
        }
        if (C2958k.START.mo9671g().equals(str)) {
            return 0;
        }
        return (C2958k.END.mo9671g().equals(str) || C2958k.CANCEL.mo9671g().equals(str)) ? 1 : 2;
    }

    private WritableMap getWritableMap(ReadableMap readableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.merge(readableMap);
        return writableNativeMap;
    }

    private Pair<WritableArray, WritableArray> removeTouchesAtIndices(WritableArray writableArray, WritableArray writableArray2) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < writableArray2.size(); i++) {
            int i2 = writableArray2.getInt(i);
            writableNativeArray.pushMap(getWritableMap(writableArray.getMap(i2)));
            hashSet.add(Integer.valueOf(i2));
        }
        for (int i3 = 0; i3 < writableArray.size(); i3++) {
            if (!hashSet.contains(Integer.valueOf(i3))) {
                writableNativeArray2.pushMap(getWritableMap(writableArray.getMap(i3)));
            }
        }
        return new Pair<>(writableNativeArray, writableNativeArray2);
    }

    private Pair<WritableArray, WritableArray> touchSubsequence(WritableArray writableArray, WritableArray writableArray2) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i = 0; i < writableArray2.size(); i++) {
            writableNativeArray.pushMap(getWritableMap(writableArray.getMap(writableArray2.getInt(i))));
        }
        return new Pair<>(writableNativeArray, writableArray);
    }

    public void receiveEvent(int i, int i2, String str, WritableMap writableMap) {
        receiveEvent(i, i2, str, false, 0, writableMap, 2);
    }

    public void receiveEvent(int i, int i2, String str, boolean z, int i3, WritableMap writableMap, int i4) {
        C3294a.m12881c(0, "FabricEventEmitter.receiveEvent('" + str + "')");
        throw null;
    }

    public void receiveEvent(int i, String str, WritableMap writableMap) {
        receiveEvent(-1, i, str, writableMap);
    }

    public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        int i;
        String str2 = str;
        WritableArray writableArray3 = writableArray;
        WritableArray writableArray4 = writableArray2;
        C3294a.m12881c(0, "FabricEventEmitter.receiveTouches('" + str2 + "')");
        Pair<WritableArray, WritableArray> removeTouchesAtIndices = C2958k.END.mo9671g().equalsIgnoreCase(str2) || C2958k.CANCEL.mo9671g().equalsIgnoreCase(str2) ? removeTouchesAtIndices(writableArray3, writableArray4) : touchSubsequence(writableArray3, writableArray4);
        WritableArray writableArray5 = (WritableArray) removeTouchesAtIndices.first;
        WritableArray writableArray6 = (WritableArray) removeTouchesAtIndices.second;
        int touchCategory = getTouchCategory(str);
        for (int i2 = 0; i2 < writableArray5.size(); i2++) {
            WritableMap writableMap = getWritableMap(writableArray5.getMap(i2));
            writableMap.putArray("changedTouches", copyWritableArray(writableArray5));
            writableMap.putArray("touches", copyWritableArray(writableArray6));
            int i3 = writableMap.getInt("targetSurface");
            int i4 = writableMap.getInt("target");
            if (i4 < 1) {
                C6071a.m22875i(TAG, "A view is reporting that a touch occurred on tag zero.");
                i = 0;
            } else {
                i = i4;
            }
            receiveEvent(i3, i, str, false, 0, writableMap, touchCategory);
        }
        C3294a.m12885g(0);
    }
}
