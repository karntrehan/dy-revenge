package org.pgsqlite;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p174e.p247e.p253d.p258e.C6071a;

public class SQLitePlugin extends ReactContextBaseJavaModule {
    private static final Pattern FIRST_WORD = Pattern.compile("^\\s*(\\S+)", 2);
    private static final String PLUGIN_NAME = "SQLite";
    public static final String TAG = "SQLitePlugin";
    static ConcurrentHashMap<String, C10906d> dbrmap = new ConcurrentHashMap<>();
    protected Context context = null;
    protected ExecutorService threadPool;

    /* renamed from: org.pgsqlite.SQLitePlugin$a */
    static /* synthetic */ class C10903a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28521a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.pgsqlite.SQLitePlugin$b[] r0 = org.pgsqlite.SQLitePlugin.C10904b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28521a = r0
                org.pgsqlite.SQLitePlugin$b r1 = org.pgsqlite.SQLitePlugin.C10904b.echoStringValue     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f28521a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.pgsqlite.SQLitePlugin$b r1 = org.pgsqlite.SQLitePlugin.C10904b.open     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f28521a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.pgsqlite.SQLitePlugin$b r1 = org.pgsqlite.SQLitePlugin.C10904b.close     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f28521a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.pgsqlite.SQLitePlugin$b r1 = org.pgsqlite.SQLitePlugin.C10904b.attach     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f28521a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.pgsqlite.SQLitePlugin$b r1 = org.pgsqlite.SQLitePlugin.C10904b.delete     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f28521a     // Catch:{ NoSuchFieldError -> 0x0049 }
                org.pgsqlite.SQLitePlugin$b r1 = org.pgsqlite.SQLitePlugin.C10904b.executeSqlBatch     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f28521a     // Catch:{ NoSuchFieldError -> 0x0054 }
                org.pgsqlite.SQLitePlugin$b r1 = org.pgsqlite.SQLitePlugin.C10904b.backgroundExecuteSqlBatch     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.pgsqlite.SQLitePlugin.C10903a.<clinit>():void");
        }
    }

    /* renamed from: org.pgsqlite.SQLitePlugin$b */
    private enum C10904b {
        open,
        close,
        attach,
        delete,
        executeSqlBatch,
        backgroundExecuteSqlBatch,
        echoStringValue
    }

    /* renamed from: org.pgsqlite.SQLitePlugin$c */
    private final class C10905c {

        /* renamed from: a */
        final boolean f28530a;

        /* renamed from: b */
        final boolean f28531b;

        /* renamed from: c */
        final boolean f28532c;

        /* renamed from: d */
        final String[] f28533d;

        /* renamed from: e */
        final String[] f28534e;

        /* renamed from: f */
        final ReadableArray[] f28535f;

        /* renamed from: g */
        final C10908a f28536g;

        C10905c() {
            this.f28530a = true;
            this.f28531b = false;
            this.f28532c = false;
            this.f28533d = null;
            this.f28534e = null;
            this.f28535f = null;
            this.f28536g = null;
        }

        C10905c(boolean z, C10908a aVar) {
            this.f28530a = true;
            this.f28531b = true;
            this.f28532c = z;
            this.f28533d = null;
            this.f28534e = null;
            this.f28535f = null;
            this.f28536g = aVar;
        }

        C10905c(String[] strArr, String[] strArr2, ReadableArray[] readableArrayArr, C10908a aVar) {
            this.f28530a = false;
            this.f28531b = false;
            this.f28532c = false;
            this.f28533d = strArr;
            this.f28534e = strArr2;
            this.f28535f = readableArrayArr;
            this.f28536g = aVar;
        }
    }

    /* renamed from: org.pgsqlite.SQLitePlugin$d */
    private class C10906d implements Runnable {

        /* renamed from: f */
        final String f28538f;

        /* renamed from: o */
        final int f28539o;

        /* renamed from: p */
        private String f28540p;

        /* renamed from: q */
        private boolean f28541q;

        /* renamed from: r */
        final BlockingQueue<C10905c> f28542r;

        /* renamed from: s */
        final C10908a f28543s;

        /* renamed from: t */
        SQLiteDatabase f28544t;

        C10906d(String str, ReadableMap readableMap, C10908a aVar) {
            this.f28538f = str;
            int i = 268435456;
            try {
                String e = C10909b.m37063e(readableMap, "assetFilename", (String) null);
                this.f28540p = e;
                if (e != null && e.length() > 0 && C10909b.m37061c(readableMap, "readOnly", false)) {
                    i = 1;
                }
            } catch (Exception e2) {
                C6071a.m22876j(SQLitePlugin.TAG, "Error retrieving assetFilename or mode from options:", e2);
            }
            this.f28539o = i;
            boolean c = C10909b.m37061c(readableMap, "androidLockWorkaround", false);
            this.f28541q = c;
            if (c) {
                C6071a.m22880n(SQLitePlugin.TAG, "Android db closing/locking workaround applied");
            }
            this.f28542r = new LinkedBlockingQueue();
            this.f28543s = aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0077 A[SYNTHETIC, Splitter:B:25:0x0077] */
        /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r11 = this;
                java.lang.String r0 = "couldn't delete database"
                java.lang.String r1 = "Can't open database."
                org.pgsqlite.SQLitePlugin r2 = org.pgsqlite.SQLitePlugin.this     // Catch:{ SQLiteException -> 0x010b, Exception -> 0x00e5 }
                java.lang.String r3 = r11.f28538f     // Catch:{ SQLiteException -> 0x010b, Exception -> 0x00e5 }
                java.lang.String r4 = r11.f28540p     // Catch:{ SQLiteException -> 0x010b, Exception -> 0x00e5 }
                int r5 = r11.f28539o     // Catch:{ SQLiteException -> 0x010b, Exception -> 0x00e5 }
                org.pgsqlite.a r6 = r11.f28543s     // Catch:{ SQLiteException -> 0x010b, Exception -> 0x00e5 }
                android.database.sqlite.SQLiteDatabase r2 = r2.openDatabase(r3, r4, r5, r6)     // Catch:{ SQLiteException -> 0x010b, Exception -> 0x00e5 }
                r11.f28544t = r2     // Catch:{ SQLiteException -> 0x010b, Exception -> 0x00e5 }
                r1 = 0
                java.util.concurrent.BlockingQueue<org.pgsqlite.SQLitePlugin$c> r2 = r11.f28542r     // Catch:{ Exception -> 0x0066 }
                java.lang.Object r2 = r2.take()     // Catch:{ Exception -> 0x0066 }
                org.pgsqlite.SQLitePlugin$c r2 = (org.pgsqlite.SQLitePlugin.C10905c) r2     // Catch:{ Exception -> 0x0066 }
            L_0x001d:
                boolean r3 = r2.f28530a     // Catch:{ Exception -> 0x0064 }
                if (r3 != 0) goto L_0x0071
                org.pgsqlite.SQLitePlugin r4 = org.pgsqlite.SQLitePlugin.this     // Catch:{ Exception -> 0x0064 }
                java.lang.String r5 = r11.f28538f     // Catch:{ Exception -> 0x0064 }
                java.lang.String[] r6 = r2.f28533d     // Catch:{ Exception -> 0x0064 }
                com.facebook.react.bridge.ReadableArray[] r7 = r2.f28535f     // Catch:{ Exception -> 0x0064 }
                java.lang.String[] r8 = r2.f28534e     // Catch:{ Exception -> 0x0064 }
                org.pgsqlite.a r9 = r2.f28536g     // Catch:{ Exception -> 0x0064 }
                r4.executeSqlBatch(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0064 }
                boolean r3 = r11.f28541q     // Catch:{ Exception -> 0x0064 }
                if (r3 == 0) goto L_0x005a
                java.lang.String[] r3 = r2.f28533d     // Catch:{ Exception -> 0x0064 }
                int r4 = r3.length     // Catch:{ Exception -> 0x0064 }
                r5 = 1
                if (r4 != r5) goto L_0x005a
                r4 = 0
                r3 = r3[r4]     // Catch:{ Exception -> 0x0064 }
                java.lang.String r4 = "COMMIT"
                boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x0064 }
                if (r3 == 0) goto L_0x005a
                org.pgsqlite.SQLitePlugin r3 = org.pgsqlite.SQLitePlugin.this     // Catch:{ Exception -> 0x0064 }
                java.lang.String r4 = r11.f28538f     // Catch:{ Exception -> 0x0064 }
                r3.closeDatabaseNow(r4)     // Catch:{ Exception -> 0x0064 }
                org.pgsqlite.SQLitePlugin r3 = org.pgsqlite.SQLitePlugin.this     // Catch:{ Exception -> 0x0064 }
                java.lang.String r4 = r11.f28538f     // Catch:{ Exception -> 0x0064 }
                java.lang.String r5 = ""
                int r6 = r11.f28539o     // Catch:{ Exception -> 0x0064 }
                android.database.sqlite.SQLiteDatabase r3 = r3.openDatabase(r4, r5, r6, r1)     // Catch:{ Exception -> 0x0064 }
                r11.f28544t = r3     // Catch:{ Exception -> 0x0064 }
            L_0x005a:
                java.util.concurrent.BlockingQueue<org.pgsqlite.SQLitePlugin$c> r3 = r11.f28542r     // Catch:{ Exception -> 0x0064 }
                java.lang.Object r3 = r3.take()     // Catch:{ Exception -> 0x0064 }
                org.pgsqlite.SQLitePlugin$c r3 = (org.pgsqlite.SQLitePlugin.C10905c) r3     // Catch:{ Exception -> 0x0064 }
                r2 = r3
                goto L_0x001d
            L_0x0064:
                r1 = move-exception
                goto L_0x006a
            L_0x0066:
                r2 = move-exception
                r10 = r2
                r2 = r1
                r1 = r10
            L_0x006a:
                java.lang.String r3 = org.pgsqlite.SQLitePlugin.TAG
                java.lang.String r4 = "unexpected error"
                p174e.p247e.p253d.p258e.C6071a.m22876j(r3, r4, r1)
            L_0x0071:
                if (r2 == 0) goto L_0x00e4
                boolean r1 = r2.f28531b
                if (r1 == 0) goto L_0x00e4
                org.pgsqlite.SQLitePlugin r1 = org.pgsqlite.SQLitePlugin.this     // Catch:{ Exception -> 0x00c4 }
                java.lang.String r3 = r11.f28538f     // Catch:{ Exception -> 0x00c4 }
                r1.closeDatabaseNow(r3)     // Catch:{ Exception -> 0x00c4 }
                java.util.concurrent.ConcurrentHashMap<java.lang.String, org.pgsqlite.SQLitePlugin$d> r1 = org.pgsqlite.SQLitePlugin.dbrmap     // Catch:{ Exception -> 0x00c4 }
                java.lang.String r3 = r11.f28538f     // Catch:{ Exception -> 0x00c4 }
                r1.remove(r3)     // Catch:{ Exception -> 0x00c4 }
                boolean r1 = r2.f28532c     // Catch:{ Exception -> 0x00c4 }
                java.lang.String r3 = "database removed"
                if (r1 != 0) goto L_0x0091
                org.pgsqlite.a r0 = r2.f28536g     // Catch:{ Exception -> 0x00c4 }
                r0.mo28874c(r3)     // Catch:{ Exception -> 0x00c4 }
                goto L_0x00e4
            L_0x0091:
                org.pgsqlite.SQLitePlugin r1 = org.pgsqlite.SQLitePlugin.this     // Catch:{ Exception -> 0x00a7 }
                java.lang.String r4 = r11.f28538f     // Catch:{ Exception -> 0x00a7 }
                boolean r1 = r1.deleteDatabaseNow(r4)     // Catch:{ Exception -> 0x00a7 }
                if (r1 == 0) goto L_0x00a1
                org.pgsqlite.a r1 = r2.f28536g     // Catch:{ Exception -> 0x00a7 }
                r1.mo28874c(r3)     // Catch:{ Exception -> 0x00a7 }
                goto L_0x00e4
            L_0x00a1:
                org.pgsqlite.a r1 = r2.f28536g     // Catch:{ Exception -> 0x00a7 }
                r1.mo28872a(r0)     // Catch:{ Exception -> 0x00a7 }
                goto L_0x00e4
            L_0x00a7:
                r1 = move-exception
                java.lang.String r3 = org.pgsqlite.SQLitePlugin.TAG     // Catch:{ Exception -> 0x00c4 }
                p174e.p247e.p253d.p258e.C6071a.m22876j(r3, r0, r1)     // Catch:{ Exception -> 0x00c4 }
                org.pgsqlite.a r0 = r2.f28536g     // Catch:{ Exception -> 0x00c4 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c4 }
                r3.<init>()     // Catch:{ Exception -> 0x00c4 }
                java.lang.String r4 = "couldn't delete database: "
                r3.append(r4)     // Catch:{ Exception -> 0x00c4 }
                r3.append(r1)     // Catch:{ Exception -> 0x00c4 }
                java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x00c4 }
                r0.mo28872a(r1)     // Catch:{ Exception -> 0x00c4 }
                goto L_0x00e4
            L_0x00c4:
                r0 = move-exception
                java.lang.String r1 = org.pgsqlite.SQLitePlugin.TAG
                java.lang.String r3 = "couldn't close database"
                p174e.p247e.p253d.p258e.C6071a.m22876j(r1, r3, r0)
                org.pgsqlite.a r1 = r2.f28536g
                if (r1 == 0) goto L_0x00e4
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "couldn't close database: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.mo28872a(r0)
            L_0x00e4:
                return
            L_0x00e5:
                r0 = move-exception
                java.lang.String r2 = org.pgsqlite.SQLitePlugin.TAG
                java.lang.String r3 = "Unexpected error opening database, stopping db thread"
                p174e.p247e.p253d.p258e.C6071a.m22876j(r2, r3, r0)
                org.pgsqlite.a r2 = r11.f28543s
                if (r2 == 0) goto L_0x0103
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
            L_0x00f6:
                r3.append(r1)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.mo28872a(r0)
            L_0x0103:
                java.util.concurrent.ConcurrentHashMap<java.lang.String, org.pgsqlite.SQLitePlugin$d> r0 = org.pgsqlite.SQLitePlugin.dbrmap
                java.lang.String r1 = r11.f28538f
                r0.remove(r1)
                return
            L_0x010b:
                r0 = move-exception
                java.lang.String r2 = org.pgsqlite.SQLitePlugin.TAG
                java.lang.String r3 = "SQLite error opening database, stopping db thread"
                p174e.p247e.p253d.p258e.C6071a.m22876j(r2, r3, r0)
                org.pgsqlite.a r2 = r11.f28543s
                if (r2 == 0) goto L_0x0103
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                goto L_0x00f6
            */
            throw new UnsupportedOperationException("Method not decompiled: org.pgsqlite.SQLitePlugin.C10906d.run():void");
        }
    }

    /* renamed from: org.pgsqlite.SQLitePlugin$e */
    private enum C10907e {
        update,
        insert,
        delete,
        select,
        begin,
        commit,
        rollback,
        other
    }

    public SQLitePlugin(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.context = reactApplicationContext.getApplicationContext();
        this.threadPool = Executors.newCachedThreadPool();
    }

    private void attachDatabase(String str, String str2, String str3, C10908a aVar) {
        String str4;
        C10906d dVar = dbrmap.get(str);
        if (dVar != null) {
            try {
                dVar.f28542r.put(new C10905c(new String[]{"ATTACH DATABASE '" + getContext().getDatabasePath(str2).getAbsolutePath() + "' AS " + str3}, new String[]{"1111"}, (ReadableArray[]) null, aVar));
            } catch (InterruptedException unused) {
                str4 = "Can't put query in the queue. Interrupted.";
            }
        } else {
            str4 = "Database " + str + "i s not created yet";
            aVar.mo28872a(str4);
        }
    }

    private void bindArgsToStatement(SQLiteStatement sQLiteStatement, ReadableArray readableArray) {
        for (int i = 0; i < readableArray.size(); i++) {
            if (readableArray.getType(i) == ReadableType.Number) {
                double d = readableArray.getDouble(i);
                long j = (long) d;
                if (d == ((double) j)) {
                    sQLiteStatement.bindLong(i + 1, j);
                } else {
                    sQLiteStatement.bindDouble(i + 1, d);
                }
            } else if (readableArray.isNull(i)) {
                sQLiteStatement.bindNull(i + 1);
            } else {
                sQLiteStatement.bindString(i + 1, C10909b.m37062d(readableArray, i, HttpUrl.FRAGMENT_ENCODE_SET));
            }
        }
    }

    @SuppressLint({"NewApi"})
    private void bindRow(WritableMap writableMap, String str, Cursor cursor, int i) {
        double d;
        int type = cursor.getType(i);
        if (type != 0) {
            if (type == 1) {
                d = (double) cursor.getLong(i);
            } else if (type == 2) {
                d = cursor.getDouble(i);
            } else if (type != 4) {
                writableMap.putString(str, cursor.getString(i));
                return;
            } else {
                writableMap.putString(str, new String(Base64.encode(cursor.getBlob(i), 0)));
                return;
            }
            writableMap.putDouble(str, d);
            return;
        }
        writableMap.putNull(str);
    }

    private void closeDatabase(String str, C10908a aVar) {
        C10906d dVar = dbrmap.get(str);
        if (dVar != null) {
            try {
                dVar.f28542r.put(new C10905c(false, aVar));
            } catch (Exception e) {
                if (aVar != null) {
                    aVar.mo28872a("couldn't close database" + e);
                }
                C6071a.m22876j(TAG, "couldn't close database", e);
            }
        } else if (aVar != null) {
            aVar.mo28874c("database closed");
        }
    }

    /* access modifiers changed from: private */
    public void closeDatabaseNow(String str) {
        SQLiteDatabase database = getDatabase(str);
        if (database != null) {
            database.close();
        }
    }

    private void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private void createFromAssets(String str, File file, InputStream inputStream) {
        FileOutputStream fileOutputStream = null;
        try {
            C6071a.m22853A(TAG, "Copying pre-populated DB content");
            String absolutePath = file.getAbsolutePath();
            String substring = absolutePath.substring(0, absolutePath.lastIndexOf("/") + 1);
            File file2 = new File(substring);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            File file3 = new File(substring + str);
            FileOutputStream fileOutputStream2 = new FileOutputStream(file3);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream2.write(bArr, 0, read);
                    } else {
                        String str2 = TAG;
                        C6071a.m22853A(str2, "Copied pre-populated DB asset to: " + file3.getAbsolutePath());
                        closeQuietly(fileOutputStream2);
                        return;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream = fileOutputStream2;
                th = th;
                closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            closeQuietly(fileOutputStream);
            throw th;
        }
    }

    private void deleteDatabase(String str, C10908a aVar) {
        C10906d dVar = dbrmap.get(str);
        if (dVar != null) {
            try {
                dVar.f28542r.put(new C10905c(true, aVar));
            } catch (Exception e) {
                if (aVar != null) {
                    aVar.mo28872a("couldn't close database" + e);
                }
                C6071a.m22876j(TAG, "couldn't close database", e);
            }
        } else if (deleteDatabaseNow(str)) {
            aVar.mo28874c("database deleted");
        } else {
            aVar.mo28872a("couldn't delete database");
        }
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    public boolean deleteDatabaseNow(String str) {
        return SQLiteDatabase.deleteDatabase(getContext().getDatabasePath(str));
    }

    private boolean executeAndPossiblyThrow(C10904b bVar, ReadableMap readableMap, C10908a aVar) {
        ReadableArray[] readableArrayArr;
        String[] strArr;
        String[] strArr2;
        ReadableMap readableMap2 = readableMap;
        C10908a aVar2 = aVar;
        switch (C10903a.f28521a[bVar.ordinal()]) {
            case 1:
                aVar2.mo28874c(C10909b.m37063e(readableMap, "value", HttpUrl.FRAGMENT_ENCODE_SET));
                return true;
            case 2:
                startDatabase(C10909b.m37063e(readableMap, "name", HttpUrl.FRAGMENT_ENCODE_SET), readableMap, aVar2);
                return true;
            case 3:
                closeDatabase(C10909b.m37063e(readableMap, "path", HttpUrl.FRAGMENT_ENCODE_SET), aVar2);
                return true;
            case 4:
                attachDatabase(C10909b.m37063e(readableMap, "path", HttpUrl.FRAGMENT_ENCODE_SET), C10909b.m37063e(readableMap, "dbName", HttpUrl.FRAGMENT_ENCODE_SET), C10909b.m37063e(readableMap, "dbAlias", HttpUrl.FRAGMENT_ENCODE_SET), aVar2);
                return true;
            case 5:
                deleteDatabase(C10909b.m37063e(readableMap, "path", HttpUrl.FRAGMENT_ENCODE_SET), aVar2);
                return true;
            case 6:
            case 7:
                String e = C10909b.m37063e((ReadableMap) C10909b.m37060b(readableMap, "dbargs", (Object) null), "dbname", HttpUrl.FRAGMENT_ENCODE_SET);
                ReadableArray readableArray = (ReadableArray) C10909b.m37060b(readableMap, "executes", (Object) null);
                if (readableArray.isNull(0)) {
                    strArr2 = new String[0];
                    strArr = null;
                    readableArrayArr = null;
                } else {
                    int size = readableArray.size();
                    String[] strArr3 = new String[size];
                    String[] strArr4 = new String[size];
                    ReadableArray[] readableArrayArr2 = new ReadableArray[size];
                    for (int i = 0; i < size; i++) {
                        ReadableMap readableMap3 = (ReadableMap) C10909b.m37059a(readableArray, i, (Object) null);
                        strArr3[i] = C10909b.m37063e(readableMap3, "sql", HttpUrl.FRAGMENT_ENCODE_SET);
                        strArr4[i] = C10909b.m37063e(readableMap3, "qid", HttpUrl.FRAGMENT_ENCODE_SET);
                        readableArrayArr2[i] = (ReadableArray) C10909b.m37060b(readableMap3, "params", (Object) null);
                    }
                    strArr2 = strArr3;
                    strArr = strArr4;
                    readableArrayArr = readableArrayArr2;
                }
                C10905c cVar = new C10905c(strArr2, strArr, readableArrayArr, aVar);
                C10906d dVar = dbrmap.get(e);
                if (dVar != null) {
                    try {
                        dVar.f28542r.put(cVar);
                        return true;
                    } catch (Exception e2) {
                        C6071a.m22876j(TAG, "couldn't add to queue", e2);
                        aVar2.mo28872a("couldn't add to queue");
                        return true;
                    }
                } else {
                    aVar2.mo28872a("database not open");
                    return true;
                }
            default:
                return true;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0123 A[Catch:{ Exception -> 0x013f }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x012b A[Catch:{ Exception -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x012f A[Catch:{ Exception -> 0x00aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0169  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeSqlBatch(java.lang.String r20, java.lang.String[] r21, com.facebook.react.bridge.ReadableArray[] r22, java.lang.String[] r23, org.pgsqlite.C10908a r24) {
        /*
            r19 = this;
            r1 = r19
            r2 = r21
            r3 = r24
            android.database.sqlite.SQLiteDatabase r4 = r19.getDatabase(r20)
            if (r4 != 0) goto L_0x0012
            java.lang.String r0 = "database has been closed"
            r3.mo28872a(r0)
            return
        L_0x0012:
            int r5 = r2.length
            com.facebook.react.bridge.WritableArray r6 = com.facebook.react.bridge.Arguments.createArray()
            r8 = 0
        L_0x0018:
            if (r8 >= r5) goto L_0x0188
            r9 = r23[r8]
            java.lang.String r0 = "unknown"
            r11 = r2[r8]     // Catch:{ Exception -> 0x013f }
            org.pgsqlite.SQLitePlugin$e r12 = r1.getQueryType(r11)     // Catch:{ Exception -> 0x013f }
            org.pgsqlite.SQLitePlugin$e r13 = org.pgsqlite.SQLitePlugin.C10907e.update     // Catch:{ Exception -> 0x013f }
            java.lang.String r15 = "rowsAffected"
            if (r12 == r13) goto L_0x00f3
            org.pgsqlite.SQLitePlugin$e r13 = org.pgsqlite.SQLitePlugin.C10907e.delete     // Catch:{ Exception -> 0x013f }
            if (r12 != r13) goto L_0x0030
            goto L_0x00f3
        L_0x0030:
            org.pgsqlite.SQLitePlugin$e r13 = org.pgsqlite.SQLitePlugin.C10907e.insert     // Catch:{ Exception -> 0x013f }
            if (r12 != r13) goto L_0x0085
            if (r22 == 0) goto L_0x0085
            java.lang.String r12 = "executeSqlBatch"
            java.lang.String r13 = "INSERT"
            p174e.p247e.p253d.p258e.C6071a.m22868b(r12, r13)     // Catch:{ Exception -> 0x013f }
            android.database.sqlite.SQLiteStatement r12 = r4.compileStatement(r11)     // Catch:{ Exception -> 0x013f }
            r13 = r22[r8]     // Catch:{ Exception -> 0x013f }
            r1.bindArgsToStatement(r12, r13)     // Catch:{ Exception -> 0x013f }
            r13 = r11
            long r10 = r12.executeInsert()     // Catch:{ SQLiteException -> 0x006b, all -> 0x0068 }
            com.facebook.react.bridge.WritableMap r7 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ SQLiteException -> 0x006b, all -> 0x0068 }
            r16 = -1
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x0062
            java.lang.String r14 = "insertId"
            double r10 = (double) r10     // Catch:{ SQLiteException -> 0x0060 }
            r7.putDouble(r14, r10)     // Catch:{ SQLiteException -> 0x0060 }
            r10 = 1
        L_0x005c:
            r7.putInt(r15, r10)     // Catch:{ SQLiteException -> 0x0060 }
            goto L_0x0064
        L_0x0060:
            r0 = move-exception
            goto L_0x006d
        L_0x0062:
            r10 = 0
            goto L_0x005c
        L_0x0064:
            r1.closeQuietly(r12)     // Catch:{ Exception -> 0x00aa }
            goto L_0x0096
        L_0x0068:
            r0 = move-exception
            r10 = 0
            goto L_0x007e
        L_0x006b:
            r0 = move-exception
            r7 = 0
        L_0x006d:
            java.lang.String r10 = r0.getMessage()     // Catch:{ all -> 0x007c }
            java.lang.String r11 = TAG     // Catch:{ all -> 0x007c }
            java.lang.String r14 = "SQLiteDatabase.executeInsert() failed"
            p174e.p247e.p253d.p258e.C6071a.m22876j(r11, r14, r0)     // Catch:{ all -> 0x007c }
            r1.closeQuietly(r12)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00a8
        L_0x007c:
            r0 = move-exception
            r10 = r7
        L_0x007e:
            r1.closeQuietly(r12)     // Catch:{ Exception -> 0x0082 }
            throw r0     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            goto L_0x0141
        L_0x0085:
            r13 = r11
            r10 = 1
            org.pgsqlite.SQLitePlugin$e r7 = org.pgsqlite.SQLitePlugin.C10907e.begin     // Catch:{ Exception -> 0x013f }
            if (r12 != r7) goto L_0x00ae
            r4.beginTransaction()     // Catch:{ SQLiteException -> 0x009b }
            com.facebook.react.bridge.WritableMap r7 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ SQLiteException -> 0x009b }
            r10 = 0
            r7.putInt(r15, r10)     // Catch:{ SQLiteException -> 0x0099 }
        L_0x0096:
            r10 = r13
            goto L_0x012c
        L_0x0099:
            r0 = move-exception
            goto L_0x009d
        L_0x009b:
            r0 = move-exception
            r7 = 0
        L_0x009d:
            java.lang.String r10 = r0.getMessage()     // Catch:{ Exception -> 0x00aa }
            java.lang.String r11 = TAG     // Catch:{ Exception -> 0x00aa }
            java.lang.String r12 = "SQLiteDatabase.beginTransaction() failed"
        L_0x00a5:
            p174e.p247e.p253d.p258e.C6071a.m22876j(r11, r12, r0)     // Catch:{ Exception -> 0x00aa }
        L_0x00a8:
            r0 = r10
            goto L_0x0096
        L_0x00aa:
            r0 = move-exception
            r10 = r7
            goto L_0x0141
        L_0x00ae:
            org.pgsqlite.SQLitePlugin$e r7 = org.pgsqlite.SQLitePlugin.C10907e.commit     // Catch:{ Exception -> 0x013f }
            if (r12 != r7) goto L_0x00ce
            r4.setTransactionSuccessful()     // Catch:{ SQLiteException -> 0x00c3 }
            r4.endTransaction()     // Catch:{ SQLiteException -> 0x00c3 }
            com.facebook.react.bridge.WritableMap r7 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ SQLiteException -> 0x00c3 }
            r10 = 0
            r7.putInt(r15, r10)     // Catch:{ SQLiteException -> 0x00c1 }
            goto L_0x0096
        L_0x00c1:
            r0 = move-exception
            goto L_0x00c5
        L_0x00c3:
            r0 = move-exception
            r7 = 0
        L_0x00c5:
            java.lang.String r10 = r0.getMessage()     // Catch:{ Exception -> 0x00aa }
            java.lang.String r11 = TAG     // Catch:{ Exception -> 0x00aa }
            java.lang.String r12 = "SQLiteDatabase.setTransactionSuccessful/endTransaction() failed"
            goto L_0x00a5
        L_0x00ce:
            org.pgsqlite.SQLitePlugin$e r7 = org.pgsqlite.SQLitePlugin.C10907e.rollback     // Catch:{ Exception -> 0x013f }
            if (r12 != r7) goto L_0x00ef
            r4.endTransaction()     // Catch:{ SQLiteException -> 0x00e0 }
            com.facebook.react.bridge.WritableMap r7 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ SQLiteException -> 0x00e0 }
            r11 = 0
            r7.putInt(r15, r11)     // Catch:{ SQLiteException -> 0x00de }
            goto L_0x0096
        L_0x00de:
            r0 = move-exception
            goto L_0x00e3
        L_0x00e0:
            r0 = move-exception
            r11 = 0
            r7 = 0
        L_0x00e3:
            java.lang.String r10 = r0.getMessage()     // Catch:{ Exception -> 0x00aa }
            java.lang.String r12 = TAG     // Catch:{ Exception -> 0x00aa }
            java.lang.String r14 = "SQLiteDatabase.endTransaction() failed"
            p174e.p247e.p253d.p258e.C6071a.m22876j(r12, r14, r0)     // Catch:{ Exception -> 0x00aa }
            goto L_0x00a8
        L_0x00ef:
            r10 = r13
            r7 = 0
            r14 = 1
            goto L_0x012d
        L_0x00f3:
            r13 = r11
            r11 = 0
            r7 = -1
            r10 = r13
            android.database.sqlite.SQLiteStatement r12 = r4.compileStatement(r10)     // Catch:{ SQLiteException -> 0x010f, all -> 0x010c }
            if (r22 == 0) goto L_0x0102
            r13 = r22[r8]     // Catch:{ SQLiteException -> 0x010a }
            r1.bindArgsToStatement(r12, r13)     // Catch:{ SQLiteException -> 0x010a }
        L_0x0102:
            int r13 = r12.executeUpdateDelete()     // Catch:{ SQLiteException -> 0x010a }
            r1.closeQuietly(r12)     // Catch:{ Exception -> 0x013f }
            goto L_0x0121
        L_0x010a:
            r0 = move-exception
            goto L_0x0111
        L_0x010c:
            r0 = move-exception
            r12 = 0
            goto L_0x013b
        L_0x010f:
            r0 = move-exception
            r12 = 0
        L_0x0111:
            java.lang.String r13 = r0.getMessage()     // Catch:{ all -> 0x013a }
            java.lang.String r14 = TAG     // Catch:{ all -> 0x013a }
            java.lang.String r11 = "SQLiteStatement.executeUpdateDelete() failed"
            p174e.p247e.p253d.p258e.C6071a.m22876j(r14, r11, r0)     // Catch:{ all -> 0x013a }
            r1.closeQuietly(r12)     // Catch:{ Exception -> 0x013f }
            r0 = r13
            r13 = -1
        L_0x0121:
            if (r13 == r7) goto L_0x012b
            com.facebook.react.bridge.WritableMap r7 = com.facebook.react.bridge.Arguments.createMap()     // Catch:{ Exception -> 0x013f }
            r7.putInt(r15, r13)     // Catch:{ Exception -> 0x00aa }
            goto L_0x012c
        L_0x012b:
            r7 = 0
        L_0x012c:
            r14 = 0
        L_0x012d:
            if (r14 == 0) goto L_0x014e
            if (r22 == 0) goto L_0x0134
            r11 = r22[r8]     // Catch:{ Exception -> 0x00aa }
            goto L_0x0135
        L_0x0134:
            r11 = 0
        L_0x0135:
            com.facebook.react.bridge.WritableMap r7 = r1.executeSqlStatementQuery(r4, r10, r11, r3)     // Catch:{ Exception -> 0x00aa }
            goto L_0x014e
        L_0x013a:
            r0 = move-exception
        L_0x013b:
            r1.closeQuietly(r12)     // Catch:{ Exception -> 0x013f }
            throw r0     // Catch:{ Exception -> 0x013f }
        L_0x013f:
            r0 = move-exception
            r10 = 0
        L_0x0141:
            java.lang.String r7 = r0.getMessage()
            java.lang.String r11 = TAG
            java.lang.String r12 = "SQLitePlugin.executeSql[Batch](): failed"
            p174e.p247e.p253d.p258e.C6071a.m22876j(r11, r12, r0)
            r0 = r7
            r7 = r10
        L_0x014e:
            java.lang.String r10 = "result"
            java.lang.String r11 = "type"
            java.lang.String r12 = "qid"
            if (r7 == 0) goto L_0x0169
            com.facebook.react.bridge.WritableMap r0 = com.facebook.react.bridge.Arguments.createMap()
            r0.putString(r12, r9)
            java.lang.String r9 = "success"
            r0.putString(r11, r9)
            r0.putMap(r10, r7)
            r6.pushMap(r0)
            goto L_0x0184
        L_0x0169:
            com.facebook.react.bridge.WritableMap r7 = com.facebook.react.bridge.Arguments.createMap()
            r7.putString(r12, r9)
            java.lang.String r9 = "error"
            r7.putString(r11, r9)
            com.facebook.react.bridge.WritableMap r9 = com.facebook.react.bridge.Arguments.createMap()
            java.lang.String r11 = "message"
            r9.putString(r11, r0)
            r7.putMap(r10, r9)
            r6.pushMap(r7)
        L_0x0184:
            int r8 = r8 + 1
            goto L_0x0018
        L_0x0188:
            r3.mo28873b(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pgsqlite.SQLitePlugin.executeSqlBatch(java.lang.String, java.lang.String[], com.facebook.react.bridge.ReadableArray[], java.lang.String[], org.pgsqlite.a):void");
    }

    private WritableMap executeSqlStatementQuery(SQLiteDatabase sQLiteDatabase, String str, ReadableArray readableArray, C10908a aVar) {
        WritableMap createMap = Arguments.createMap();
        Cursor cursor = null;
        try {
            String[] strArr = new String[0];
            if (readableArray != null) {
                int size = readableArray.size();
                String[] strArr2 = new String[size];
                for (int i = 0; i < size; i++) {
                    if (readableArray.isNull(i)) {
                        strArr2[i] = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        strArr2[i] = C10909b.m37062d(readableArray, i, HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                }
                strArr = strArr2;
            }
            cursor = sQLiteDatabase.rawQuery(str, strArr);
            if (cursor != null) {
                if (cursor.moveToFirst()) {
                    WritableArray createArray = Arguments.createArray();
                    int columnCount = cursor.getColumnCount();
                    do {
                        WritableMap createMap2 = Arguments.createMap();
                        for (int i2 = 0; i2 < columnCount; i2++) {
                            bindRow(createMap2, cursor.getColumnName(i2), cursor, i2);
                        }
                        createArray.pushMap(createMap2);
                    } while (cursor.moveToNext());
                    createMap.putArray("rows", createArray);
                }
            }
            closeQuietly(cursor);
            return createMap;
        } catch (Exception e) {
            C6071a.m22876j(TAG, "SQLitePlugin.executeSql[Batch]() failed", e);
            throw e;
        } catch (Throwable th) {
            closeQuietly(cursor);
            throw th;
        }
    }

    private SQLiteDatabase getDatabase(String str) {
        C10906d dVar = dbrmap.get(str);
        if (dVar == null) {
            return null;
        }
        return dVar.f28544t;
    }

    private C10907e getQueryType(String str) {
        Matcher matcher = FIRST_WORD.matcher(str);
        if (matcher.find()) {
            try {
                return C10907e.valueOf(matcher.group(1).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
            }
        }
        return C10907e.other;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:43|44) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:57|58|59|64|65|47) */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r3 = TAG;
        r13 = "pre-populated DB asset NOT FOUND in app bundle www subdirectory: " + r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00ba */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0115 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:64:0x0115=Splitter:B:64:0x0115, B:27:0x0068=Splitter:B:27:0x0068, B:43:0x00ba=Splitter:B:43:0x00ba} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.sqlite.SQLiteDatabase openDatabase(java.lang.String r12, java.lang.String r13, int r14, org.pgsqlite.C10908a r15) {
        /*
            r11 = this;
            java.lang.String r0 = "Error importing pre-populated DB asset"
            java.lang.String r1 = "Unable to import pre-populated db asset"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r11.getDatabase(r12)     // Catch:{ all -> 0x01a5 }
            if (r3 == 0) goto L_0x001a
            boolean r3 = r3.isOpen()     // Catch:{ all -> 0x01a5 }
            if (r3 != 0) goto L_0x0012
            goto L_0x001a
        L_0x0012:
            java.lang.Exception r12 = new java.lang.Exception     // Catch:{ all -> 0x01a5 }
            java.lang.String r13 = "Database already open"
            r12.<init>(r13)     // Catch:{ all -> 0x01a5 }
            throw r12     // Catch:{ all -> 0x01a5 }
        L_0x001a:
            r3 = 0
            r4 = 1
            if (r13 == 0) goto L_0x0026
            int r5 = r13.length()     // Catch:{ all -> 0x01a5 }
            if (r5 <= 0) goto L_0x0026
            r5 = 1
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            if (r5 == 0) goto L_0x012c
            java.lang.String r6 = "1"
            int r6 = r13.compareTo(r6)     // Catch:{ all -> 0x01a5 }
            java.lang.String r7 = "pre-populated DB asset NOT FOUND in app bundle www subdirectory: "
            if (r6 != 0) goto L_0x007a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a5 }
            r13.<init>()     // Catch:{ all -> 0x01a5 }
            java.lang.String r6 = "www/"
            r13.append(r6)     // Catch:{ all -> 0x01a5 }
            r13.append(r12)     // Catch:{ all -> 0x01a5 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x01a5 }
            android.content.Context r6 = r11.getContext()     // Catch:{ Exception -> 0x0067 }
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch:{ Exception -> 0x0067 }
            java.io.InputStream r6 = r6.open(r13)     // Catch:{ Exception -> 0x0067 }
            java.lang.String r8 = TAG     // Catch:{ Exception -> 0x0068 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0068 }
            r9.<init>()     // Catch:{ Exception -> 0x0068 }
            java.lang.String r10 = "Pre-populated DB asset FOUND  in app bundle www subdirectory: "
            r9.append(r10)     // Catch:{ Exception -> 0x0068 }
            r9.append(r13)     // Catch:{ Exception -> 0x0068 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0068 }
            p174e.p247e.p253d.p258e.C6071a.m22853A(r8, r9)     // Catch:{ Exception -> 0x0068 }
            goto L_0x00b6
        L_0x0067:
            r6 = r2
        L_0x0068:
            java.lang.String r3 = TAG     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            r8.<init>()     // Catch:{ all -> 0x01a2 }
            r8.append(r7)     // Catch:{ all -> 0x01a2 }
            r8.append(r13)     // Catch:{ all -> 0x01a2 }
            java.lang.String r13 = r8.toString()     // Catch:{ all -> 0x01a2 }
            goto L_0x00cb
        L_0x007a:
            char r6 = r13.charAt(r3)     // Catch:{ all -> 0x01a5 }
            r8 = 126(0x7e, float:1.77E-43)
            if (r6 != r8) goto L_0x00d1
            java.lang.String r6 = "~/"
            boolean r6 = r13.startsWith(r6)     // Catch:{ all -> 0x01a5 }
            if (r6 == 0) goto L_0x0090
            r6 = 2
            java.lang.String r13 = r13.substring(r6)     // Catch:{ all -> 0x01a5 }
            goto L_0x0094
        L_0x0090:
            java.lang.String r13 = r13.substring(r4)     // Catch:{ all -> 0x01a5 }
        L_0x0094:
            android.content.Context r6 = r11.getContext()     // Catch:{ Exception -> 0x00b9 }
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch:{ Exception -> 0x00b9 }
            java.io.InputStream r6 = r6.open(r13)     // Catch:{ Exception -> 0x00b9 }
            java.lang.String r8 = TAG     // Catch:{ Exception -> 0x00ba }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ba }
            r9.<init>()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r10 = "Pre-populated DB asset FOUND in app bundle subdirectory: "
            r9.append(r10)     // Catch:{ Exception -> 0x00ba }
            r9.append(r13)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x00ba }
            p174e.p247e.p253d.p258e.C6071a.m22853A(r8, r9)     // Catch:{ Exception -> 0x00ba }
        L_0x00b6:
            r7 = r2
            goto L_0x012e
        L_0x00b9:
            r6 = r2
        L_0x00ba:
            java.lang.String r3 = TAG     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            r8.<init>()     // Catch:{ all -> 0x01a2 }
            r8.append(r7)     // Catch:{ all -> 0x01a2 }
            r8.append(r13)     // Catch:{ all -> 0x01a2 }
            java.lang.String r13 = r8.toString()     // Catch:{ all -> 0x01a2 }
        L_0x00cb:
            p174e.p247e.p253d.p258e.C6071a.m22875i(r3, r13)     // Catch:{ all -> 0x01a2 }
            r7 = r2
        L_0x00cf:
            r3 = 1
            goto L_0x012e
        L_0x00d1:
            android.content.Context r6 = r11.getContext()     // Catch:{ all -> 0x01a5 }
            java.io.File r6 = r6.getFilesDir()     // Catch:{ all -> 0x01a5 }
            java.lang.String r7 = "/"
            boolean r7 = r13.startsWith(r7)     // Catch:{ all -> 0x01a5 }
            if (r7 == 0) goto L_0x00e5
            java.lang.String r13 = r13.substring(r4)     // Catch:{ all -> 0x01a5 }
        L_0x00e5:
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0113 }
            r7.<init>(r6, r13)     // Catch:{ Exception -> 0x0113 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0113 }
            r6.<init>(r7)     // Catch:{ Exception -> 0x0113 }
            java.lang.String r8 = TAG     // Catch:{ Exception -> 0x0111 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0111 }
            r9.<init>()     // Catch:{ Exception -> 0x0111 }
            java.lang.String r10 = "Pre-populated DB asset FOUND in Files subdirectory: "
            r9.append(r10)     // Catch:{ Exception -> 0x0111 }
            java.lang.String r10 = r7.getCanonicalPath()     // Catch:{ Exception -> 0x0111 }
            r9.append(r10)     // Catch:{ Exception -> 0x0111 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0111 }
            p174e.p247e.p253d.p258e.C6071a.m22853A(r8, r9)     // Catch:{ Exception -> 0x0111 }
            if (r14 != r4) goto L_0x00b6
            java.lang.String r9 = "Detected read-only mode request for external asset."
            p174e.p247e.p253d.p258e.C6071a.m22853A(r8, r9)     // Catch:{ Exception -> 0x0115 }
            goto L_0x012e
        L_0x0111:
            r7 = r2
            goto L_0x0115
        L_0x0113:
            r6 = r2
            r7 = r6
        L_0x0115:
            java.lang.String r3 = TAG     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            r8.<init>()     // Catch:{ all -> 0x01a2 }
            java.lang.String r9 = "Error opening pre-populated DB asset in app bundle www subdirectory: "
            r8.append(r9)     // Catch:{ all -> 0x01a2 }
            r8.append(r13)     // Catch:{ all -> 0x01a2 }
            java.lang.String r13 = r8.toString()     // Catch:{ all -> 0x01a2 }
            p174e.p247e.p253d.p258e.C6071a.m22875i(r3, r13)     // Catch:{ all -> 0x01a2 }
            goto L_0x00cf
        L_0x012c:
            r6 = r2
            r7 = r6
        L_0x012e:
            if (r7 != 0) goto L_0x0175
            r14 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Context r13 = r11.getContext()     // Catch:{ all -> 0x01a2 }
            java.io.File r7 = r13.getDatabasePath(r12)     // Catch:{ all -> 0x01a2 }
            boolean r13 = r7.exists()     // Catch:{ all -> 0x01a2 }
            if (r13 != 0) goto L_0x0168
            if (r5 == 0) goto L_0x0168
            if (r3 != 0) goto L_0x015d
            if (r6 == 0) goto L_0x015d
            java.lang.String r13 = TAG     // Catch:{ all -> 0x01a2 }
            java.lang.String r1 = "Copying pre-populated db asset to destination"
            p174e.p247e.p253d.p258e.C6071a.m22853A(r13, r1)     // Catch:{ all -> 0x01a2 }
            r11.createFromAssets(r12, r7, r6)     // Catch:{ Exception -> 0x0151 }
            goto L_0x0168
        L_0x0151:
            r12 = move-exception
            java.lang.String r13 = TAG     // Catch:{ all -> 0x01a2 }
            p174e.p247e.p253d.p258e.C6071a.m22876j(r13, r0, r12)     // Catch:{ all -> 0x01a2 }
            java.lang.Exception r12 = new java.lang.Exception     // Catch:{ all -> 0x01a2 }
            r12.<init>(r0)     // Catch:{ all -> 0x01a2 }
            throw r12     // Catch:{ all -> 0x01a2 }
        L_0x015d:
            java.lang.String r12 = TAG     // Catch:{ all -> 0x01a2 }
            p174e.p247e.p253d.p258e.C6071a.m22875i(r12, r1)     // Catch:{ all -> 0x01a2 }
            java.lang.Exception r12 = new java.lang.Exception     // Catch:{ all -> 0x01a2 }
            r12.<init>(r1)     // Catch:{ all -> 0x01a2 }
            throw r12     // Catch:{ all -> 0x01a2 }
        L_0x0168:
            boolean r12 = r7.exists()     // Catch:{ all -> 0x01a2 }
            if (r12 != 0) goto L_0x0175
            java.io.File r12 = r7.getParentFile()     // Catch:{ all -> 0x01a2 }
            r12.mkdirs()     // Catch:{ all -> 0x01a2 }
        L_0x0175:
            java.lang.String r12 = TAG     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a2 }
            r13.<init>()     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = "DB file is ready, proceeding to OPEN SQLite DB: "
            r13.append(r0)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ all -> 0x01a2 }
            r13.append(r0)     // Catch:{ all -> 0x01a2 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x01a2 }
            p174e.p247e.p253d.p258e.C6071a.m22853A(r12, r13)     // Catch:{ all -> 0x01a2 }
            java.lang.String r12 = r7.getAbsolutePath()     // Catch:{ all -> 0x01a2 }
            android.database.sqlite.SQLiteDatabase r12 = android.database.sqlite.SQLiteDatabase.openDatabase(r12, r2, r14)     // Catch:{ all -> 0x01a2 }
            if (r15 == 0) goto L_0x019e
            java.lang.String r13 = "Database opened"
            r15.mo28874c(r13)     // Catch:{ all -> 0x01a2 }
        L_0x019e:
            r11.closeQuietly(r6)
            return r12
        L_0x01a2:
            r12 = move-exception
            r2 = r6
            goto L_0x01a6
        L_0x01a5:
            r12 = move-exception
        L_0x01a6:
            r11.closeQuietly(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pgsqlite.SQLitePlugin.openDatabase(java.lang.String, java.lang.String, int, org.pgsqlite.a):android.database.sqlite.SQLiteDatabase");
    }

    private void startDatabase(String str, ReadableMap readableMap, C10908a aVar) {
        if (dbrmap.get(str) != null) {
            aVar.mo28874c("database started");
            return;
        }
        C10906d dVar = new C10906d(str, readableMap, aVar);
        dbrmap.put(str, dVar);
        getThreadPool().execute(dVar);
    }

    @ReactMethod
    public void attach(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute("attach", readableMap, new C10908a(callback, callback2));
        } catch (Exception e) {
            callback2.invoke("Unexpected error" + e.getMessage());
        }
    }

    @ReactMethod
    public void backgroundExecuteSqlBatch(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute("backgroundExecuteSqlBatch", readableMap, new C10908a(callback, callback2));
        } catch (Exception e) {
            callback2.invoke("Unexpected error" + e.getMessage());
        }
    }

    @ReactMethod
    public void close(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute("close", readableMap, new C10908a(callback, callback2));
        } catch (Exception e) {
            callback2.invoke("Unexpected error" + e.getMessage());
        }
    }

    public void closeAllOpenDatabases() {
        while (!dbrmap.isEmpty()) {
            String next = dbrmap.keySet().iterator().next();
            closeDatabaseNow(next);
            try {
                dbrmap.get(next).f28542r.put(new C10905c());
            } catch (Exception e) {
                String str = TAG;
                C6071a.m22876j(str, "couldn't stop db thread for db: " + next, e);
            }
            dbrmap.remove(next);
        }
    }

    @ReactMethod
    public void delete(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute("delete", readableMap, new C10908a(callback, callback2));
        } catch (Exception e) {
            callback2.invoke("Unexpected error" + e.getMessage());
        }
    }

    @ReactMethod
    public void echoStringValue(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute("echoStringValue", readableMap, new C10908a(callback, callback2));
        } catch (Exception unused) {
            callback2.invoke("Unexpected error");
        }
    }

    /* access modifiers changed from: protected */
    public boolean execute(String str, ReadableMap readableMap, C10908a aVar) {
        try {
            try {
                return executeAndPossiblyThrow(C10904b.valueOf(str), readableMap, aVar);
            } catch (Exception e) {
                C6071a.m22876j(TAG, "unexpected error", e);
                aVar.mo28872a("Unexpected error executing processing SQLite query");
                throw e;
            }
        } catch (IllegalArgumentException e2) {
            C6071a.m22876j(TAG, "unexpected error", e2);
            aVar.mo28872a("Unexpected error executing processing SQLite query");
            throw e2;
        }
    }

    @ReactMethod
    public void executeSqlBatch(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute("executeSqlBatch", readableMap, new C10908a(callback, callback2));
        } catch (Exception unused) {
            callback2.invoke("Unexpected error");
        }
    }

    /* access modifiers changed from: protected */
    public Context getContext() {
        return this.context;
    }

    public String getName() {
        return PLUGIN_NAME;
    }

    /* access modifiers changed from: protected */
    public ExecutorService getThreadPool() {
        return this.threadPool;
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Callback callback, Callback callback2) {
        try {
            execute("open", readableMap, new C10908a(callback, callback2));
        } catch (Exception e) {
            callback2.invoke("Unexpected error:" + e.getMessage());
        }
    }
}
