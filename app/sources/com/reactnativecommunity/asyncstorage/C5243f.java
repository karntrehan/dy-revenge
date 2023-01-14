package com.reactnativecommunity.asyncstorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import okhttp3.internal.p510ws.RealWebSocket;

/* renamed from: com.reactnativecommunity.asyncstorage.f */
public class C5243f extends SQLiteOpenHelper {

    /* renamed from: f */
    private static C5243f f14767f;

    /* renamed from: o */
    private Context f14768o;

    /* renamed from: p */
    private SQLiteDatabase f14769p;

    /* renamed from: q */
    private long f14770q = ((C5242e.f14766a.longValue() * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) * RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);

    private C5243f(Context context) {
        super(context, "RKStorage", (SQLiteDatabase.CursorFactory) null, 1);
        this.f14768o = context;
    }

    /* renamed from: E */
    public static C5243f m19579E(Context context) {
        if (f14767f == null) {
            f14767f = new C5243f(context.getApplicationContext());
        }
        return f14767f;
    }

    /* renamed from: o */
    private synchronized boolean m19580o() {
        mo15854h();
        return this.f14768o.deleteDatabase("RKStorage");
    }

    /* renamed from: A */
    public synchronized SQLiteDatabase mo15851A() {
        mo15857r();
        return this.f14769p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo15852a() {
        mo15851A().delete("catalystLocalStorage", (String) null, (String[]) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        throw new java.lang.RuntimeException("Clearing and deleting database RKStorage failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (m19580o() != false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        p174e.p247e.p253d.p258e.C6071a.m22868b("ReactNative", "Deleted Local Database RKStorage");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0012 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo15853b() {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.mo15852a()     // Catch:{ Exception -> 0x0012 }
            r2.mo15854h()     // Catch:{ Exception -> 0x0012 }
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Cleaned RKStorage"
            p174e.p247e.p253d.p258e.C6071a.m22868b(r0, r1)     // Catch:{ Exception -> 0x0012 }
            monitor-exit(r2)
            return
        L_0x0010:
            r0 = move-exception
            goto L_0x0029
        L_0x0012:
            boolean r0 = r2.m19580o()     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = "ReactNative"
            java.lang.String r1 = "Deleted Local Database RKStorage"
            p174e.p247e.p253d.p258e.C6071a.m22868b(r0, r1)     // Catch:{ all -> 0x0010 }
            monitor-exit(r2)
            return
        L_0x0021:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0010 }
            java.lang.String r1 = "Clearing and deleting database RKStorage failed"
            r0.<init>(r1)     // Catch:{ all -> 0x0010 }
            throw r0     // Catch:{ all -> 0x0010 }
        L_0x0029:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.asyncstorage.C5243f.mo15853b():void");
    }

    /* renamed from: h */
    public synchronized void mo15854h() {
        SQLiteDatabase sQLiteDatabase = this.f14769p;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            this.f14769p.close();
            this.f14769p = null;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE catalystLocalStorage (key TEXT PRIMARY KEY, value TEXT NOT NULL)");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i != i2) {
            m19580o();
            onCreate(sQLiteDatabase);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:15|16|17|18|19|20|34|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x002d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0026 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo15857r() {
        /*
            r5 = this;
            monitor-enter(r5)
            android.database.sqlite.SQLiteDatabase r0 = r5.f14769p     // Catch:{ all -> 0x003c }
            r1 = 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r5)
            return r1
        L_0x000e:
            r0 = 0
            r2 = 0
        L_0x0010:
            r3 = 2
            if (r2 >= r3) goto L_0x0030
            if (r2 <= 0) goto L_0x0018
            r5.m19580o()     // Catch:{ SQLiteException -> 0x001f }
        L_0x0018:
            android.database.sqlite.SQLiteDatabase r3 = r5.getWritableDatabase()     // Catch:{ SQLiteException -> 0x001f }
            r5.f14769p = r3     // Catch:{ SQLiteException -> 0x001f }
            goto L_0x0030
        L_0x001f:
            r0 = move-exception
            r3 = 30
            java.lang.Thread.sleep(r3)     // Catch:{ InterruptedException -> 0x0026 }
            goto L_0x002d
        L_0x0026:
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003c }
            r3.interrupt()     // Catch:{ all -> 0x003c }
        L_0x002d:
            int r2 = r2 + 1
            goto L_0x0010
        L_0x0030:
            android.database.sqlite.SQLiteDatabase r2 = r5.f14769p     // Catch:{ all -> 0x003c }
            if (r2 == 0) goto L_0x003b
            long r3 = r5.f14770q     // Catch:{ all -> 0x003c }
            r2.setMaximumSize(r3)     // Catch:{ all -> 0x003c }
            monitor-exit(r5)
            return r1
        L_0x003b:
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.asyncstorage.C5243f.mo15857r():boolean");
    }
}
