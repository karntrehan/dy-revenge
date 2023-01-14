package com.reactnativecommunity.asyncstorage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.p109b0.p110a.C2639a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p258e.C6071a;

@C2639a(name = "RNC_AsyncSQLiteDBStorage")
public final class AsyncStorageModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNC_AsyncSQLiteDBStorage";
    private final C5244g executor;
    /* access modifiers changed from: private */
    public C5243f mReactDatabaseSupplier;
    private boolean mShuttingDown;

    /* renamed from: com.reactnativecommunity.asyncstorage.AsyncStorageModule$a */
    class C5232a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Callback f14750a;

        /* renamed from: b */
        final /* synthetic */ ReadableArray f14751b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5232a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f14750a = callback;
            this.f14751b = readableArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f14750a.invoke(C5239b.m19566a((String) null), null);
                return;
            }
            String[] strArr = {"key", "value"};
            HashSet hashSet = new HashSet();
            WritableArray createArray = Arguments.createArray();
            int i = 0;
            while (i < this.f14751b.size()) {
                int min = Math.min(this.f14751b.size() - i, AsyncStorageModule.MAX_SQL_KEYS);
                int i2 = min;
                int i3 = i;
                Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().query("catalystLocalStorage", strArr, C5238a.m19560a(min), C5238a.m19561b(this.f14751b, i, min), (String) null, (String) null, (String) null);
                hashSet.clear();
                try {
                    if (query.getCount() != this.f14751b.size()) {
                        for (int i4 = i3; i4 < i3 + i2; i4++) {
                            hashSet.add(this.f14751b.getString(i4));
                        }
                    }
                    if (query.moveToFirst()) {
                        do {
                            WritableArray createArray2 = Arguments.createArray();
                            createArray2.pushString(query.getString(0));
                            createArray2.pushString(query.getString(1));
                            createArray.pushArray(createArray2);
                            hashSet.remove(query.getString(0));
                        } while (query.moveToNext());
                    }
                    query.close();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        WritableArray createArray3 = Arguments.createArray();
                        createArray3.pushString((String) it.next());
                        createArray3.pushNull();
                        createArray.pushArray(createArray3);
                    }
                    hashSet.clear();
                    i = i3 + AsyncStorageModule.MAX_SQL_KEYS;
                } catch (Exception e) {
                    C6071a.m22860H("ReactNative", e.getMessage(), e);
                    this.f14750a.invoke(C5239b.m19567b((String) null, e.getMessage()), null);
                    query.close();
                    return;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            this.f14750a.invoke(null, createArray);
        }
    }

    /* renamed from: com.reactnativecommunity.asyncstorage.AsyncStorageModule$b */
    class C5233b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Callback f14753a;

        /* renamed from: b */
        final /* synthetic */ ReadableArray f14754b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5233b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f14753a = callback;
            this.f14754b = readableArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f14753a.invoke(C5239b.m19566a((String) null));
                return;
            }
            SQLiteStatement compileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().beginTransaction();
                int i = 0;
                while (i < this.f14754b.size()) {
                    if (this.f14754b.getArray(i).size() != 2) {
                        WritableMap d = C5239b.m19569d((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                            return;
                        } catch (Exception e) {
                            C6071a.m22860H("ReactNative", e.getMessage(), e);
                            if (d == null) {
                                C5239b.m19567b((String) null, e.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f14754b.getArray(i).getString(0) == null) {
                        WritableMap c = C5239b.m19568c((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                            return;
                        } catch (Exception e2) {
                            C6071a.m22860H("ReactNative", e2.getMessage(), e2);
                            if (c == null) {
                                C5239b.m19567b((String) null, e2.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f14754b.getArray(i).getString(1) == null) {
                        WritableMap d2 = C5239b.m19569d((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                            return;
                        } catch (Exception e3) {
                            C6071a.m22860H("ReactNative", e3.getMessage(), e3);
                            if (d2 == null) {
                                C5239b.m19567b((String) null, e3.getMessage());
                                return;
                            }
                            return;
                        }
                    } else {
                        compileStatement.clearBindings();
                        compileStatement.bindString(1, this.f14754b.getArray(i).getString(0));
                        compileStatement.bindString(2, this.f14754b.getArray(i).getString(1));
                        compileStatement.execute();
                        i++;
                    }
                }
                AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().setTransactionSuccessful();
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                } catch (Exception e4) {
                    C6071a.m22860H("ReactNative", e4.getMessage(), e4);
                    writableMap = C5239b.m19567b((String) null, e4.getMessage());
                }
            } catch (Exception e5) {
                C6071a.m22860H("ReactNative", e5.getMessage(), e5);
                WritableMap b = C5239b.m19567b((String) null, e5.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                } catch (Exception e6) {
                    C6071a.m22860H("ReactNative", e6.getMessage(), e6);
                    if (b == null) {
                        writableMap = C5239b.m19567b((String) null, e6.getMessage());
                    }
                }
                writableMap = b;
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                } catch (Exception e7) {
                    C6071a.m22860H("ReactNative", e7.getMessage(), e7);
                    C5239b.m19567b((String) null, e7.getMessage());
                }
                throw th;
            }
            Callback callback = this.f14753a;
            if (writableMap != null) {
                callback.invoke(writableMap);
                return;
            }
            callback.invoke(new Object[0]);
        }
    }

    /* renamed from: com.reactnativecommunity.asyncstorage.AsyncStorageModule$c */
    class C5234c extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Callback f14756a;

        /* renamed from: b */
        final /* synthetic */ ReadableArray f14757b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5234c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f14756a = callback;
            this.f14757b = readableArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f14756a.invoke(C5239b.m19566a((String) null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().beginTransaction();
                for (int i = 0; i < this.f14757b.size(); i += AsyncStorageModule.MAX_SQL_KEYS) {
                    int min = Math.min(this.f14757b.size() - i, AsyncStorageModule.MAX_SQL_KEYS);
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().delete("catalystLocalStorage", C5238a.m19560a(min), C5238a.m19561b(this.f14757b, i, min));
                }
                AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().setTransactionSuccessful();
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                } catch (Exception e) {
                    C6071a.m22860H("ReactNative", e.getMessage(), e);
                    writableMap = C5239b.m19567b((String) null, e.getMessage());
                }
            } catch (Exception e2) {
                C6071a.m22860H("ReactNative", e2.getMessage(), e2);
                WritableMap b = C5239b.m19567b((String) null, e2.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                } catch (Exception e3) {
                    C6071a.m22860H("ReactNative", e3.getMessage(), e3);
                    if (b == null) {
                        writableMap = C5239b.m19567b((String) null, e3.getMessage());
                    }
                }
                writableMap = b;
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                } catch (Exception e4) {
                    C6071a.m22860H("ReactNative", e4.getMessage(), e4);
                    C5239b.m19567b((String) null, e4.getMessage());
                }
                throw th;
            }
            Callback callback = this.f14756a;
            if (writableMap != null) {
                callback.invoke(writableMap);
                return;
            }
            callback.invoke(new Object[0]);
        }
    }

    /* renamed from: com.reactnativecommunity.asyncstorage.AsyncStorageModule$d */
    class C5235d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Callback f14759a;

        /* renamed from: b */
        final /* synthetic */ ReadableArray f14760b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5235d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f14759a = callback;
            this.f14760b = readableArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f14759a.invoke(C5239b.m19566a((String) null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().beginTransaction();
                int i = 0;
                while (i < this.f14760b.size()) {
                    if (this.f14760b.getArray(i).size() != 2) {
                        WritableMap d = C5239b.m19569d((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                            return;
                        } catch (Exception e) {
                            C6071a.m22860H("ReactNative", e.getMessage(), e);
                            if (d == null) {
                                C5239b.m19567b((String) null, e.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f14760b.getArray(i).getString(0) == null) {
                        WritableMap c = C5239b.m19568c((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                            return;
                        } catch (Exception e2) {
                            C6071a.m22860H("ReactNative", e2.getMessage(), e2);
                            if (c == null) {
                                C5239b.m19567b((String) null, e2.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f14760b.getArray(i).getString(1) == null) {
                        WritableMap d2 = C5239b.m19569d((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                            return;
                        } catch (Exception e3) {
                            C6071a.m22860H("ReactNative", e3.getMessage(), e3);
                            if (d2 == null) {
                                C5239b.m19567b((String) null, e3.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (!C5238a.m19564e(AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A(), this.f14760b.getArray(i).getString(0), this.f14760b.getArray(i).getString(1))) {
                        WritableMap a = C5239b.m19566a((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                            return;
                        } catch (Exception e4) {
                            C6071a.m22860H("ReactNative", e4.getMessage(), e4);
                            if (a == null) {
                                C5239b.m19567b((String) null, e4.getMessage());
                                return;
                            }
                            return;
                        }
                    } else {
                        i++;
                    }
                }
                AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().setTransactionSuccessful();
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                } catch (Exception e5) {
                    C6071a.m22860H("ReactNative", e5.getMessage(), e5);
                    writableMap = C5239b.m19567b((String) null, e5.getMessage());
                }
            } catch (Exception e6) {
                C6071a.m22860H("ReactNative", e6.getMessage(), e6);
                WritableMap b = C5239b.m19567b((String) null, e6.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                } catch (Exception e7) {
                    C6071a.m22860H("ReactNative", e7.getMessage(), e7);
                    if (b == null) {
                        writableMap = C5239b.m19567b((String) null, e7.getMessage());
                    }
                }
                writableMap = b;
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().endTransaction();
                } catch (Exception e8) {
                    C6071a.m22860H("ReactNative", e8.getMessage(), e8);
                    C5239b.m19567b((String) null, e8.getMessage());
                }
                throw th;
            }
            Callback callback = this.f14759a;
            if (writableMap != null) {
                callback.invoke(writableMap);
                return;
            }
            callback.invoke(new Object[0]);
        }
    }

    /* renamed from: com.reactnativecommunity.asyncstorage.AsyncStorageModule$e */
    class C5236e extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Callback f14762a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5236e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f14762a = callback;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.mo15857r()) {
                this.f14762a.invoke(C5239b.m19566a((String) null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.mo15852a();
                this.f14762a.invoke(new Object[0]);
            } catch (Exception e) {
                C6071a.m22860H("ReactNative", e.getMessage(), e);
                this.f14762a.invoke(C5239b.m19567b((String) null, e.getMessage()));
            }
        }
    }

    /* renamed from: com.reactnativecommunity.asyncstorage.AsyncStorageModule$f */
    class C5237f extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Callback f14764a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C5237f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f14764a = callback;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f14764a.invoke(C5239b.m19566a((String) null), null);
                return;
            }
            WritableArray createArray = Arguments.createArray();
            Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.mo15851A().query("catalystLocalStorage", new String[]{"key"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            try {
                if (query.moveToFirst()) {
                    do {
                        createArray.pushString(query.getString(0));
                    } while (query.moveToNext());
                }
                query.close();
                this.f14764a.invoke(null, createArray);
            } catch (Exception e) {
                C6071a.m22860H("ReactNative", e.getMessage(), e);
                this.f14764a.invoke(C5239b.m19567b((String) null, e.getMessage()), null);
                query.close();
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor2) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        C5240c.m19576g(reactApplicationContext);
        this.executor = new C5244g(executor2);
        reactApplicationContext.addLifecycleEventListener(this);
        this.mReactDatabaseSupplier = C5243f.m19579E(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.mo15857r();
    }

    @ReactMethod
    public void clear(Callback callback) {
        new C5236e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.mo15853b();
    }

    @ReactMethod
    public void getAllKeys(Callback callback) {
        new C5237f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    @ReactMethod
    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(C5239b.m19568c((String) null), null);
            return;
        }
        new C5232a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new C5235d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    @ReactMethod
    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new C5234c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    @ReactMethod
    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(new Object[0]);
        } else {
            new C5233b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
        }
    }

    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
    }

    public void onHostDestroy() {
        this.mReactDatabaseSupplier.mo15854h();
    }

    public void onHostPause() {
    }

    public void onHostResume() {
    }
}
