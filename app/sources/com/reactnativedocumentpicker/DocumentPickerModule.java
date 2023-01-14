package com.reactnativedocumentpicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.p109b0.p110a.C2639a;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@C2639a(name = "RNDocumentPicker")
public class DocumentPickerModule extends ReactContextBaseJavaModule {
    private static final String E_ACTIVITY_DOES_NOT_EXIST = "ACTIVITY_DOES_NOT_EXIST";
    private static final String E_DOCUMENT_PICKER_CANCELED = "DOCUMENT_PICKER_CANCELED";
    private static final String E_FAILED_TO_SHOW_PICKER = "FAILED_TO_SHOW_PICKER";
    private static final String E_INVALID_DATA_RETURNED = "INVALID_DATA_RETURNED";
    private static final String E_UNABLE_TO_OPEN_FILE_TYPE = "UNABLE_TO_OPEN_FILE_TYPE";
    private static final String E_UNEXPECTED_EXCEPTION = "UNEXPECTED_EXCEPTION";
    private static final String E_UNKNOWN_ACTIVITY_RESULT = "UNKNOWN_ACTIVITY_RESULT";
    private static final String FIELD_COPY_ERROR = "copyError";
    private static final String FIELD_FILE_COPY_URI = "fileCopyUri";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_SIZE = "size";
    private static final String FIELD_TYPE = "type";
    private static final String FIELD_URI = "uri";
    public static final String NAME = "RNDocumentPicker";
    private static final String OPTION_COPY_TO = "copyTo";
    private static final String OPTION_MULTIPLE = "allowMultiSelection";
    private static final String OPTION_TYPE = "type";
    private static final int PICK_DIR_REQUEST_CODE = 42;
    private static final int READ_REQUEST_CODE = 41;
    private final ActivityEventListener activityEventListener;
    private String copyTo;
    /* access modifiers changed from: private */
    public Promise promise;

    /* renamed from: com.reactnativedocumentpicker.DocumentPickerModule$a */
    class C5332a extends BaseActivityEventListener {
        C5332a() {
        }

        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            Promise access$000 = DocumentPickerModule.this.promise;
            if (access$000 == null) {
                Log.e(DocumentPickerModule.NAME, "promise was null in onActivityResult");
            } else if (i == 41) {
                DocumentPickerModule.this.onShowActivityResult(i2, intent, access$000);
            } else if (i == 42) {
                DocumentPickerModule.this.onPickDirectoryResult(i2, intent);
            }
        }
    }

    /* renamed from: com.reactnativedocumentpicker.DocumentPickerModule$b */
    private static class C5333b extends GuardedResultAsyncTask<ReadableArray> {

        /* renamed from: a */
        private final WeakReference<Context> f14947a;

        /* renamed from: b */
        private final List<Uri> f14948b;

        /* renamed from: c */
        private final String f14949c;

        /* renamed from: d */
        private final Promise f14950d;

        protected C5333b(ReactContext reactContext, List<Uri> list, String str, Promise promise) {
            super(reactContext.getExceptionHandler());
            this.f14947a = new WeakReference<>(reactContext.getApplicationContext());
            this.f14948b = list;
            this.f14949c = str;
            this.f14950d = promise;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040 A[SYNTHETIC, Splitter:B:24:0x0040] */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0045 A[Catch:{ IOException -> 0x0048 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.String m19762a(android.content.Context r3, android.net.Uri r4, java.io.File r5) {
            /*
                r0 = 0
                android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x003c }
                java.io.InputStream r3 = r3.openInputStream(r4)     // Catch:{ Exception -> 0x003c }
                if (r3 == 0) goto L_0x0030
                java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0038 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0038 }
                r0 = 1024(0x400, float:1.435E-42)
                byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x002e }
            L_0x0014:
                int r1 = r3.read(r0)     // Catch:{ Exception -> 0x002e }
                if (r1 <= 0) goto L_0x001f
                r2 = 0
                r4.write(r0, r2, r1)     // Catch:{ Exception -> 0x002e }
                goto L_0x0014
            L_0x001f:
                r4.close()     // Catch:{ Exception -> 0x002e }
                r3.close()     // Catch:{ Exception -> 0x002e }
                java.net.URI r5 = r5.toURI()     // Catch:{ Exception -> 0x002e }
                java.lang.String r3 = r5.toString()     // Catch:{ Exception -> 0x002e }
                return r3
            L_0x002e:
                r5 = move-exception
                goto L_0x003a
            L_0x0030:
                java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0038 }
                java.lang.String r5 = "Invalid input stream"
                r4.<init>(r5)     // Catch:{ Exception -> 0x0038 }
                throw r4     // Catch:{ Exception -> 0x0038 }
            L_0x0038:
                r5 = move-exception
                r4 = r0
            L_0x003a:
                r0 = r3
                goto L_0x003e
            L_0x003c:
                r5 = move-exception
                r4 = r0
            L_0x003e:
                if (r0 == 0) goto L_0x0043
                r0.close()     // Catch:{ IOException -> 0x0048 }
            L_0x0043:
                if (r4 == 0) goto L_0x0048
                r4.close()     // Catch:{ IOException -> 0x0048 }
            L_0x0048:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativedocumentpicker.DocumentPickerModule.C5333b.m19762a(android.content.Context, android.net.Uri, java.io.File):java.lang.String");
        }

        /* renamed from: c */
        private WritableMap m19763c(Uri uri) {
            Context context = (Context) this.f14947a.get();
            if (context == null) {
                return Arguments.createMap();
            }
            ContentResolver contentResolver = context.getContentResolver();
            WritableMap createMap = Arguments.createMap();
            createMap.putString(DocumentPickerModule.FIELD_URI, uri.toString());
            createMap.putString("type", contentResolver.getType(uri));
            Cursor query = contentResolver.query(uri, (String[]) null, (String) null, (String[]) null, (String) null, (CancellationSignal) null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int columnIndex = query.getColumnIndex("_display_name");
                        if (!query.isNull(columnIndex)) {
                            createMap.putString(DocumentPickerModule.FIELD_NAME, query.getString(columnIndex));
                        }
                        int columnIndex2 = query.getColumnIndex("mime_type");
                        if (!query.isNull(columnIndex2)) {
                            createMap.putString("type", query.getString(columnIndex2));
                        }
                        int columnIndex3 = query.getColumnIndex("_size");
                        if (!query.isNull(columnIndex3)) {
                            createMap.putInt(DocumentPickerModule.FIELD_SIZE, query.getInt(columnIndex3));
                        }
                    }
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (query != null) {
                query.close();
            }
            m19764e(context, createMap, uri);
            return createMap;
            throw th;
        }

        /* renamed from: e */
        private void m19764e(Context context, WritableMap writableMap, Uri uri) {
            if (this.f14949c != null) {
                File cacheDir = context.getCacheDir();
                if (this.f14949c.equals("documentDirectory")) {
                    cacheDir = context.getFilesDir();
                }
                File file = new File(cacheDir, UUID.randomUUID().toString());
                try {
                    if (file.mkdir()) {
                        String string = writableMap.getString(DocumentPickerModule.FIELD_NAME);
                        if (string == null) {
                            string = String.valueOf(System.currentTimeMillis());
                        }
                        writableMap.putString(DocumentPickerModule.FIELD_FILE_COPY_URI, m19762a(context, uri, new File(file, string)));
                        return;
                    }
                    throw new IOException("failed to create directory at " + file.getAbsolutePath());
                } catch (Exception e) {
                    e.printStackTrace();
                    writableMap.putNull(DocumentPickerModule.FIELD_FILE_COPY_URI);
                    writableMap.putString(DocumentPickerModule.FIELD_COPY_ERROR, e.getLocalizedMessage());
                }
            } else {
                writableMap.putNull(DocumentPickerModule.FIELD_FILE_COPY_URI);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public ReadableArray doInBackgroundGuarded() {
            WritableArray createArray = Arguments.createArray();
            for (Uri c : this.f14948b) {
                createArray.pushMap(m19763c(c));
            }
            return createArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void onPostExecuteGuarded(ReadableArray readableArray) {
            this.f14950d.resolve(readableArray);
        }
    }

    public DocumentPickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        C5332a aVar = new C5332a();
        this.activityEventListener = aVar;
        reactApplicationContext.addActivityEventListener(aVar);
    }

    /* access modifiers changed from: private */
    public void onPickDirectoryResult(int i, Intent intent) {
        if (i == 0) {
            sendError(E_DOCUMENT_PICKER_CANCELED, "User canceled directory picker");
        } else if (i != -1) {
            sendError(E_UNKNOWN_ACTIVITY_RESULT, "Unknown activity result: " + i);
        } else if (intent == null || intent.getData() == null) {
            sendError(E_INVALID_DATA_RETURNED, "Invalid data returned by intent");
        } else {
            Uri data = intent.getData();
            WritableMap createMap = Arguments.createMap();
            createMap.putString(FIELD_URI, data.toString());
            this.promise.resolve(createMap);
        }
    }

    private String[] readableArrayToStringArray(ReadableArray readableArray) {
        int size = readableArray.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = readableArray.getString(i);
        }
        return strArr;
    }

    private void sendError(String str, String str2) {
        sendError(str, str2, (Exception) null);
    }

    private void sendError(String str, String str2, Exception exc) {
        Promise promise2 = this.promise;
        if (promise2 != null) {
            this.promise = null;
            promise2.reject(str, str2, (Throwable) exc);
        }
    }

    public String getName() {
        return NAME;
    }

    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
    }

    public void onShowActivityResult(int i, Intent intent, Promise promise2) {
        Uri uri;
        if (i == 0) {
            sendError(E_DOCUMENT_PICKER_CANCELED, "User canceled document picker");
        } else if (i == -1) {
            ClipData clipData = null;
            if (intent != null) {
                Uri data = intent.getData();
                ClipData clipData2 = intent.getClipData();
                uri = data;
                clipData = clipData2;
            } else {
                uri = null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                if (clipData != null && clipData.getItemCount() > 0) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        arrayList.add(clipData.getItemAt(i2).getUri());
                    }
                } else if (uri != null) {
                    arrayList.add(uri);
                } else {
                    sendError(E_INVALID_DATA_RETURNED, "Invalid data returned by intent");
                    return;
                }
                new C5333b(getReactApplicationContext(), arrayList, this.copyTo, promise2).execute(new Void[0]);
            } catch (Exception e) {
                sendError(E_UNEXPECTED_EXCEPTION, e.getLocalizedMessage(), e);
            }
        } else {
            sendError(E_UNKNOWN_ACTIVITY_RESULT, "Unknown activity result: " + i);
        }
    }

    @ReactMethod
    public void pick(ReadableMap readableMap, Promise promise2) {
        String str;
        String str2;
        ReadableArray array;
        Activity currentActivity = getCurrentActivity();
        this.promise = promise2;
        this.copyTo = readableMap.hasKey(OPTION_COPY_TO) ? readableMap.getString(OPTION_COPY_TO) : null;
        if (currentActivity == null) {
            sendError(E_ACTIVITY_DOES_NOT_EXIST, "Current activity does not exist");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            boolean z = false;
            if (!readableMap.isNull("type") && (array = readableMap.getArray("type")) != null) {
                if (array.size() > 1) {
                    intent.putExtra("android.intent.extra.MIME_TYPES", readableArrayToStringArray(array));
                } else if (array.size() == 1) {
                    intent.setType(array.getString(0));
                }
            }
            if (!readableMap.isNull(OPTION_MULTIPLE) && readableMap.getBoolean(OPTION_MULTIPLE)) {
                z = true;
            }
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z);
            currentActivity.startActivityForResult(Intent.createChooser(intent, (CharSequence) null), 41, Bundle.EMPTY);
        } catch (ActivityNotFoundException e) {
            str2 = e.getLocalizedMessage();
            str = E_UNABLE_TO_OPEN_FILE_TYPE;
            sendError(str, str2);
        } catch (Exception e2) {
            e2.printStackTrace();
            str2 = e2.getLocalizedMessage();
            str = E_FAILED_TO_SHOW_PICKER;
            sendError(str, str2);
        }
    }

    @ReactMethod
    public void pickDirectory(Promise promise2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise2.reject(E_ACTIVITY_DOES_NOT_EXIST, "Current activity does not exist");
            return;
        }
        this.promise = promise2;
        try {
            currentActivity.startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 42, (Bundle) null);
        } catch (Exception e) {
            sendError(E_FAILED_TO_SHOW_PICKER, "Failed to create directory picker", e);
        }
    }
}
