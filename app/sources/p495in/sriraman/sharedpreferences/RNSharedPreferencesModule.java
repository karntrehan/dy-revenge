package p495in.sriraman.sharedpreferences;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.widget.ListView;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.ArrayList;

/* renamed from: in.sriraman.sharedpreferences.RNSharedPreferencesModule */
public class RNSharedPreferencesModule extends ReactContextBaseJavaModule {
    final int BT_ACTION_REQUEST_ENABLE = 1;
    private BluetoothAdapter bt_adapter = null;
    private ArrayList<BluetoothDevice> bt_device_list = null;
    private BroadcastReceiver bt_info_receiver = null;
    private ListView bt_list_view;
    private boolean bt_scanning = false;
    private boolean is_watch = false;
    private String shared_name = "wit_player_shared_preferences";

    public RNSharedPreferencesModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private void initSharedHandler() {
        C10651c.m36266f(getReactApplicationContext(), this.shared_name);
    }

    @ReactMethod
    public void clear() {
        initSharedHandler();
        C10650b.m36258a();
    }

    @ReactMethod
    public void getAll(Callback callback) {
        initSharedHandler();
        String[][] d = C10650b.m36261d();
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i = 0; i < d.length; i++) {
            WritableNativeArray writableNativeArray2 = new WritableNativeArray();
            writableNativeArray2.pushString(d[i][0]);
            writableNativeArray2.pushString(d[i][1]);
            writableNativeArray.pushArray(writableNativeArray2);
        }
        callback.invoke(writableNativeArray);
    }

    @ReactMethod
    public void getAllKeys(Callback callback) {
        initSharedHandler();
        String[] c = C10650b.m36260c();
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (String pushString : c) {
            writableNativeArray.pushString(pushString);
        }
        callback.invoke(writableNativeArray);
    }

    @ReactMethod
    public void getItem(String str, Callback callback) {
        initSharedHandler();
        callback.invoke(C10650b.m36263f(str));
    }

    @ReactMethod
    public void getItems(ReadableArray readableArray, Callback callback) {
        initSharedHandler();
        String[] strArr = new String[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            strArr[i] = readableArray.getString(i);
        }
        String[][] e = C10650b.m36262e(strArr);
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            writableNativeArray.pushString(e[i2][1]);
        }
        callback.invoke(writableNativeArray);
    }

    public String getName() {
        return "SharedPreferences";
    }

    public void onCreate(Bundle bundle) {
    }

    @ReactMethod
    public void removeItem(String str) {
        initSharedHandler();
        C10650b.m36259b(str);
    }

    @ReactMethod
    public void setItem(String str, String str2) {
        initSharedHandler();
        C10650b.m36264g(str, str2);
    }

    @ReactMethod
    public void setName(String str) {
        this.shared_name = str;
    }
}
