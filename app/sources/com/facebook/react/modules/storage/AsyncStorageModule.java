package com.facebook.react.modules.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.os.AsyncTask;
import com.facebook.fbreact.specs.NativeAsyncSQLiteDBStorageSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.p109b0.p110a.C2639a;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p174e.p247e.p253d.p258e.C6071a;

@C2639a(name = "AsyncSQLiteDBStorage")
public final class AsyncStorageModule extends NativeAsyncSQLiteDBStorageSpec {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "AsyncSQLiteDBStorage";
    private final C2873g executor;
    /* access modifiers changed from: private */
    public C2877c mReactDatabaseSupplier;
    private boolean mShuttingDown;

    /* renamed from: com.facebook.react.modules.storage.AsyncStorageModule$a */
    class C2867a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Callback f8054a;

        /* renamed from: b */
        final /* synthetic */ ReadableArray f8055b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2867a(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f8054a = callback;
            this.f8055b = readableArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f8054a.invoke(C2876b.m11345a((String) null), null);
                return;
            }
            String[] strArr = {"key", "value"};
            HashSet hashSet = new HashSet();
            WritableArray createArray = Arguments.createArray();
            int i = 0;
            while (i < this.f8055b.size()) {
                int min = Math.min(this.f8055b.size() - i, AsyncStorageModule.MAX_SQL_KEYS);
                int i2 = min;
                int i3 = i;
                Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().query("catalystLocalStorage", strArr, C2875a.m11339a(min), C2875a.m11340b(this.f8055b, i, min), (String) null, (String) null, (String) null);
                hashSet.clear();
                try {
                    if (query.getCount() != this.f8055b.size()) {
                        for (int i4 = i3; i4 < i3 + i2; i4++) {
                            hashSet.add(this.f8055b.getString(i4));
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
                    this.f8054a.invoke(C2876b.m11346b((String) null, e.getMessage()), null);
                    query.close();
                    return;
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            this.f8054a.invoke(null, createArray);
        }
    }

    /* renamed from: com.facebook.react.modules.storage.AsyncStorageModule$b */
    class C2868b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Callback f8057a;

        /* renamed from: b */
        final /* synthetic */ ReadableArray f8058b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2868b(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f8057a = callback;
            this.f8058b = readableArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f8057a.invoke(C2876b.m11345a((String) null));
                return;
            }
            SQLiteStatement compileStatement = AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().compileStatement("INSERT OR REPLACE INTO catalystLocalStorage VALUES (?, ?);");
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().beginTransaction();
                int i = 0;
                while (i < this.f8058b.size()) {
                    if (this.f8058b.getArray(i).size() != 2) {
                        WritableMap d = C2876b.m11348d((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                            return;
                        } catch (Exception e) {
                            C6071a.m22860H("ReactNative", e.getMessage(), e);
                            if (d == null) {
                                C2876b.m11346b((String) null, e.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f8058b.getArray(i).getString(0) == null) {
                        WritableMap c = C2876b.m11347c((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                            return;
                        } catch (Exception e2) {
                            C6071a.m22860H("ReactNative", e2.getMessage(), e2);
                            if (c == null) {
                                C2876b.m11346b((String) null, e2.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f8058b.getArray(i).getString(1) == null) {
                        WritableMap d2 = C2876b.m11348d((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                            return;
                        } catch (Exception e3) {
                            C6071a.m22860H("ReactNative", e3.getMessage(), e3);
                            if (d2 == null) {
                                C2876b.m11346b((String) null, e3.getMessage());
                                return;
                            }
                            return;
                        }
                    } else {
                        compileStatement.clearBindings();
                        compileStatement.bindString(1, this.f8058b.getArray(i).getString(0));
                        compileStatement.bindString(2, this.f8058b.getArray(i).getString(1));
                        compileStatement.execute();
                        i++;
                    }
                }
                AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().setTransactionSuccessful();
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                } catch (Exception e4) {
                    C6071a.m22860H("ReactNative", e4.getMessage(), e4);
                    writableMap = C2876b.m11346b((String) null, e4.getMessage());
                }
            } catch (Exception e5) {
                C6071a.m22860H("ReactNative", e5.getMessage(), e5);
                WritableMap b = C2876b.m11346b((String) null, e5.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                } catch (Exception e6) {
                    C6071a.m22860H("ReactNative", e6.getMessage(), e6);
                    if (b == null) {
                        writableMap = C2876b.m11346b((String) null, e6.getMessage());
                    }
                }
                writableMap = b;
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                } catch (Exception e7) {
                    C6071a.m22860H("ReactNative", e7.getMessage(), e7);
                    C2876b.m11346b((String) null, e7.getMessage());
                }
                throw th;
            }
            Callback callback = this.f8057a;
            if (writableMap != null) {
                callback.invoke(writableMap);
                return;
            }
            callback.invoke(new Object[0]);
        }
    }

    /* renamed from: com.facebook.react.modules.storage.AsyncStorageModule$c */
    class C2869c extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Callback f8060a;

        /* renamed from: b */
        final /* synthetic */ ReadableArray f8061b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2869c(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f8060a = callback;
            this.f8061b = readableArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f8060a.invoke(C2876b.m11345a((String) null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().beginTransaction();
                for (int i = 0; i < this.f8061b.size(); i += AsyncStorageModule.MAX_SQL_KEYS) {
                    int min = Math.min(this.f8061b.size() - i, AsyncStorageModule.MAX_SQL_KEYS);
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().delete("catalystLocalStorage", C2875a.m11339a(min), C2875a.m11340b(this.f8061b, i, min));
                }
                AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().setTransactionSuccessful();
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                } catch (Exception e) {
                    C6071a.m22860H("ReactNative", e.getMessage(), e);
                    writableMap = C2876b.m11346b((String) null, e.getMessage());
                }
            } catch (Exception e2) {
                C6071a.m22860H("ReactNative", e2.getMessage(), e2);
                WritableMap b = C2876b.m11346b((String) null, e2.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                } catch (Exception e3) {
                    C6071a.m22860H("ReactNative", e3.getMessage(), e3);
                    if (b == null) {
                        writableMap = C2876b.m11346b((String) null, e3.getMessage());
                    }
                }
                writableMap = b;
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                } catch (Exception e4) {
                    C6071a.m22860H("ReactNative", e4.getMessage(), e4);
                    C2876b.m11346b((String) null, e4.getMessage());
                }
                throw th;
            }
            Callback callback = this.f8060a;
            if (writableMap != null) {
                callback.invoke(writableMap);
                return;
            }
            callback.invoke(new Object[0]);
        }
    }

    /* renamed from: com.facebook.react.modules.storage.AsyncStorageModule$d */
    class C2870d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Callback f8063a;

        /* renamed from: b */
        final /* synthetic */ ReadableArray f8064b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2870d(ReactContext reactContext, Callback callback, ReadableArray readableArray) {
            super(reactContext);
            this.f8063a = callback;
            this.f8064b = readableArray;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap writableMap = null;
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f8063a.invoke(C2876b.m11345a((String) null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().beginTransaction();
                int i = 0;
                while (i < this.f8064b.size()) {
                    if (this.f8064b.getArray(i).size() != 2) {
                        WritableMap d = C2876b.m11348d((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                            return;
                        } catch (Exception e) {
                            C6071a.m22860H("ReactNative", e.getMessage(), e);
                            if (d == null) {
                                C2876b.m11346b((String) null, e.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f8064b.getArray(i).getString(0) == null) {
                        WritableMap c = C2876b.m11347c((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                            return;
                        } catch (Exception e2) {
                            C6071a.m22860H("ReactNative", e2.getMessage(), e2);
                            if (c == null) {
                                C2876b.m11346b((String) null, e2.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (this.f8064b.getArray(i).getString(1) == null) {
                        WritableMap d2 = C2876b.m11348d((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                            return;
                        } catch (Exception e3) {
                            C6071a.m22860H("ReactNative", e3.getMessage(), e3);
                            if (d2 == null) {
                                C2876b.m11346b((String) null, e3.getMessage());
                                return;
                            }
                            return;
                        }
                    } else if (!C2875a.m11343e(AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A(), this.f8064b.getArray(i).getString(0), this.f8064b.getArray(i).getString(1))) {
                        WritableMap a = C2876b.m11345a((String) null);
                        try {
                            AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                            return;
                        } catch (Exception e4) {
                            C6071a.m22860H("ReactNative", e4.getMessage(), e4);
                            if (a == null) {
                                C2876b.m11346b((String) null, e4.getMessage());
                                return;
                            }
                            return;
                        }
                    } else {
                        i++;
                    }
                }
                AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().setTransactionSuccessful();
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                } catch (Exception e5) {
                    C6071a.m22860H("ReactNative", e5.getMessage(), e5);
                    writableMap = C2876b.m11346b((String) null, e5.getMessage());
                }
            } catch (Exception e6) {
                C6071a.m22860H("ReactNative", e6.getMessage(), e6);
                WritableMap b = C2876b.m11346b((String) null, e6.getMessage());
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                } catch (Exception e7) {
                    C6071a.m22860H("ReactNative", e7.getMessage(), e7);
                    if (b == null) {
                        writableMap = C2876b.m11346b((String) null, e7.getMessage());
                    }
                }
                writableMap = b;
            } catch (Throwable th) {
                try {
                    AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().endTransaction();
                } catch (Exception e8) {
                    C6071a.m22860H("ReactNative", e8.getMessage(), e8);
                    C2876b.m11346b((String) null, e8.getMessage());
                }
                throw th;
            }
            Callback callback = this.f8063a;
            if (writableMap != null) {
                callback.invoke(writableMap);
                return;
            }
            callback.invoke(new Object[0]);
        }
    }

    /* renamed from: com.facebook.react.modules.storage.AsyncStorageModule$e */
    class C2871e extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Callback f8066a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2871e(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f8066a = callback;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.mReactDatabaseSupplier.mo9250r()) {
                this.f8066a.invoke(C2876b.m11345a((String) null));
                return;
            }
            try {
                AsyncStorageModule.this.mReactDatabaseSupplier.mo9246a();
                this.f8066a.invoke(new Object[0]);
            } catch (Exception e) {
                C6071a.m22860H("ReactNative", e.getMessage(), e);
                this.f8066a.invoke(C2876b.m11346b((String) null, e.getMessage()));
            }
        }
    }

    /* renamed from: com.facebook.react.modules.storage.AsyncStorageModule$f */
    class C2872f extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final /* synthetic */ Callback f8068a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2872f(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f8068a = callback;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            if (!AsyncStorageModule.this.ensureDatabase()) {
                this.f8068a.invoke(C2876b.m11345a((String) null), null);
                return;
            }
            WritableArray createArray = Arguments.createArray();
            Cursor query = AsyncStorageModule.this.mReactDatabaseSupplier.mo9245A().query("catalystLocalStorage", new String[]{"key"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            try {
                if (query.moveToFirst()) {
                    do {
                        createArray.pushString(query.getString(0));
                    } while (query.moveToNext());
                }
                query.close();
                this.f8068a.invoke(null, createArray);
            } catch (Exception e) {
                C6071a.m22860H("ReactNative", e.getMessage(), e);
                this.f8068a.invoke(C2876b.m11346b((String) null, e.getMessage()), null);
                query.close();
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
    }

    /* renamed from: com.facebook.react.modules.storage.AsyncStorageModule$g */
    private class C2873g implements Executor {

        /* renamed from: f */
        private final ArrayDeque<Runnable> f8070f = new ArrayDeque<>();

        /* renamed from: o */
        private Runnable f8071o;

        /* renamed from: p */
        private final Executor f8072p;

        /* renamed from: com.facebook.react.modules.storage.AsyncStorageModule$g$a */
        class C2874a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ Runnable f8074f;

            C2874a(Runnable runnable) {
                this.f8074f = runnable;
            }

            public void run() {
                try {
                    this.f8074f.run();
                } finally {
                    C2873g.this.mo9242a();
                }
            }
        }

        C2873g(Executor executor) {
            this.f8072p = executor;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo9242a() {
            Runnable poll = this.f8070f.poll();
            this.f8071o = poll;
            if (poll != null) {
                this.f8072p.execute(poll);
            }
        }

        public synchronized void execute(Runnable runnable) {
            this.f8070f.offer(new C2874a(runnable));
            if (this.f8071o == null) {
                mo9242a();
            }
        }
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor2) {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        this.executor = new C2873g(executor2);
        this.mReactDatabaseSupplier = C2877c.m11349E(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public boolean ensureDatabase() {
        return !this.mShuttingDown && this.mReactDatabaseSupplier.mo9250r();
    }

    public void clear(Callback callback) {
        new C2871e(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public void clearSensitiveData() {
        this.mReactDatabaseSupplier.mo9247b();
    }

    public void getAllKeys(Callback callback) {
        new C2872f(getReactApplicationContext(), callback).executeOnExecutor(this.executor, new Void[0]);
    }

    public String getName() {
        return NAME;
    }

    public void initialize() {
        super.initialize();
        this.mShuttingDown = false;
    }

    public void invalidate() {
        this.mShuttingDown = true;
    }

    public void multiGet(ReadableArray readableArray, Callback callback) {
        if (readableArray == null) {
            callback.invoke(C2876b.m11347c((String) null), null);
            return;
        }
        new C2867a(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    public void multiMerge(ReadableArray readableArray, Callback callback) {
        new C2870d(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    public void multiRemove(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(C2876b.m11347c((String) null));
            return;
        }
        new C2869c(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }

    public void multiSet(ReadableArray readableArray, Callback callback) {
        if (readableArray.size() == 0) {
            callback.invoke(C2876b.m11347c((String) null));
            return;
        }
        new C2868b(getReactApplicationContext(), callback, readableArray).executeOnExecutor(this.executor, new Void[0]);
    }
}
