package com.rnziparchive;

import android.os.Build;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.rnziparchive.C9847b;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import p477h.p478a.p479a.C10483a;
import p477h.p478a.p479a.p483c.C10497a;
import p477h.p478a.p479a.p488f.C10543j;
import p477h.p478a.p479a.p488f.C10550q;
import p477h.p478a.p479a.p488f.p489r.C10552a;
import p477h.p478a.p479a.p488f.p489r.C10554c;
import p477h.p478a.p479a.p488f.p489r.C10555d;
import p477h.p478a.p479a.p488f.p489r.C10556e;

public class RNZipArchiveModule extends ReactContextBaseJavaModule {
    private static final String EVENT_KEY_FILENAME = "filePath";
    private static final String EVENT_KEY_PROGRESS = "progress";
    private static final String PROGRESS_EVENT_NAME = "zipArchiveProgressEvent";
    /* access modifiers changed from: private */
    public static final String TAG = "RNZipArchiveModule";

    /* renamed from: com.rnziparchive.RNZipArchiveModule$a */
    class C9840a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f26354f;

        /* renamed from: o */
        final /* synthetic */ String f26355o;

        /* renamed from: p */
        final /* synthetic */ Promise f26356p;

        /* renamed from: q */
        final /* synthetic */ String f26357q;

        C9840a(String str, String str2, Promise promise, String str3) {
            this.f26354f = str;
            this.f26355o = str2;
            this.f26356p = promise;
            this.f26357q = str3;
        }

        public void run() {
            try {
                C10483a aVar = new C10483a(this.f26354f);
                if (aVar.mo25870k()) {
                    aVar.mo25871m(this.f26355o.toCharArray());
                } else {
                    this.f26356p.reject((String) null, String.format("Zip file: %s is not password protected", new Object[]{this.f26354f}));
                }
                List<C10543j> i = aVar.mo25869i();
                ArrayList arrayList = new ArrayList();
                int size = i.size();
                RNZipArchiveModule.this.updateProgress(0, 1, this.f26354f);
                int i2 = 0;
                while (i2 < size) {
                    C10543j jVar = i.get(i2);
                    String canonicalPath = new File(this.f26357q, jVar.mo26042k()).getCanonicalPath();
                    if (canonicalPath.startsWith(new File(this.f26357q).getCanonicalPath() + File.separator)) {
                        if (!jVar.mo26050s()) {
                            aVar.mo25867g(jVar, this.f26357q);
                            arrayList.add(jVar.mo26042k());
                        }
                        int i3 = i2 + 1;
                        RNZipArchiveModule.this.updateProgress((long) i3, (long) size, this.f26354f);
                        i2 = i3;
                    } else {
                        throw new SecurityException(String.format("Found Zip Path Traversal Vulnerability with %s", new Object[]{canonicalPath}));
                    }
                }
                this.f26356p.resolve(Arguments.fromList(arrayList));
            } catch (Exception e) {
                RNZipArchiveModule.this.updateProgress(0, 1, this.f26354f);
                this.f26356p.reject((String) null, String.format("Failed to unzip file, due to: %s", new Object[]{RNZipArchiveModule.this.getStackTrace(e)}));
            }
        }
    }

    /* renamed from: com.rnziparchive.RNZipArchiveModule$b */
    class C9841b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f26359f;

        /* renamed from: o */
        final /* synthetic */ Promise f26360o;

        /* renamed from: p */
        final /* synthetic */ String f26361p;

        /* renamed from: q */
        final /* synthetic */ String f26362q;

        /* renamed from: com.rnziparchive.RNZipArchiveModule$b$a */
        class C9842a implements C9847b.C9848a {

            /* renamed from: a */
            final /* synthetic */ long[] f26364a;

            /* renamed from: b */
            final /* synthetic */ int[] f26365b;

            /* renamed from: c */
            final /* synthetic */ long f26366c;

            C9842a(long[] jArr, int[] iArr, long j) {
                this.f26364a = jArr;
                this.f26365b = iArr;
                this.f26366c = j;
            }

            /* renamed from: a */
            public void mo24630a(long j) {
                long[] jArr = this.f26364a;
                jArr[0] = jArr[0] + j;
                int[] iArr = this.f26365b;
                int i = iArr[0];
                long j2 = this.f26366c;
                int i2 = (int) ((((double) jArr[0]) * 100.0d) / ((double) j2));
                if (i2 > i) {
                    iArr[0] = i2;
                    C9841b bVar = C9841b.this;
                    RNZipArchiveModule.this.updateProgress(jArr[0], j2, bVar.f26359f);
                }
            }
        }

        C9841b(String str, Promise promise, String str2, String str3) {
            this.f26359f = str;
            this.f26360o = promise;
            this.f26361p = str2;
            this.f26362q = str3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:36:0x0102 A[SYNTHETIC, Splitter:B:36:0x0102] */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x0109 A[SYNTHETIC, Splitter:B:40:0x0109] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x007d A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r17 = this;
                r7 = r17
                java.io.File r0 = new java.io.File     // Catch:{ NullPointerException -> 0x015c }
                java.lang.String r1 = r7.f26359f     // Catch:{ NullPointerException -> 0x015c }
                r0.<init>(r1)     // Catch:{ NullPointerException -> 0x015c }
                com.rnziparchive.RNZipArchiveModule r0 = com.rnziparchive.RNZipArchiveModule.this     // Catch:{ Exception -> 0x0134 }
                java.lang.String r1 = r7.f26359f     // Catch:{ Exception -> 0x0134 }
                java.lang.String r2 = r7.f26361p     // Catch:{ Exception -> 0x0134 }
                long r9 = r0.getUncompressedSize(r1, r2)     // Catch:{ Exception -> 0x0134 }
                java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x0134 }
                java.lang.String r1 = r7.f26362q     // Catch:{ Exception -> 0x0134 }
                r0.<init>(r1)     // Catch:{ Exception -> 0x0134 }
                boolean r1 = r0.exists()     // Catch:{ Exception -> 0x0134 }
                if (r1 != 0) goto L_0x0023
                r0.mkdirs()     // Catch:{ Exception -> 0x0134 }
            L_0x0023:
                com.rnziparchive.RNZipArchiveModule r11 = com.rnziparchive.RNZipArchiveModule.this     // Catch:{ Exception -> 0x0134 }
                r12 = 0
                r14 = 1
                java.lang.String r0 = r7.f26359f     // Catch:{ Exception -> 0x0134 }
                r16 = r0
                r11.updateProgress(r12, r14, r16)     // Catch:{ Exception -> 0x0134 }
                r0 = 1
                long[] r11 = new long[r0]     // Catch:{ Exception -> 0x0134 }
                r1 = 0
                r12 = 0
                r11[r12] = r1     // Catch:{ Exception -> 0x0134 }
                int[] r13 = new int[r0]     // Catch:{ Exception -> 0x0134 }
                r13[r12] = r12     // Catch:{ Exception -> 0x0134 }
                int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0134 }
                r2 = 24
                if (r1 < r2) goto L_0x0050
                java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x0134 }
                java.lang.String r2 = r7.f26359f     // Catch:{ Exception -> 0x0134 }
                java.lang.String r3 = r7.f26361p     // Catch:{ Exception -> 0x0134 }
                java.nio.charset.Charset r3 = java.nio.charset.Charset.forName(r3)     // Catch:{ Exception -> 0x0134 }
                r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0134 }
                goto L_0x0057
            L_0x0050:
                java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x0134 }
                java.lang.String r2 = r7.f26359f     // Catch:{ Exception -> 0x0134 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0134 }
            L_0x0057:
                r14 = r1
                java.util.Enumeration r15 = r14.entries()     // Catch:{ Exception -> 0x0134 }
                java.lang.String r1 = com.rnziparchive.RNZipArchiveModule.TAG     // Catch:{ Exception -> 0x0134 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0134 }
                r2.<init>()     // Catch:{ Exception -> 0x0134 }
                java.lang.String r3 = "Zip has "
                r2.append(r3)     // Catch:{ Exception -> 0x0134 }
                int r3 = r14.size()     // Catch:{ Exception -> 0x0134 }
                r2.append(r3)     // Catch:{ Exception -> 0x0134 }
                java.lang.String r3 = " entries"
                r2.append(r3)     // Catch:{ Exception -> 0x0134 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0134 }
                android.util.Log.d(r1, r2)     // Catch:{ Exception -> 0x0134 }
            L_0x007d:
                boolean r1 = r15.hasMoreElements()     // Catch:{ Exception -> 0x0134 }
                if (r1 == 0) goto L_0x011e
                java.lang.Object r1 = r15.nextElement()     // Catch:{ Exception -> 0x0134 }
                r5 = r1
                java.util.zip.ZipEntry r5 = (java.util.zip.ZipEntry) r5     // Catch:{ Exception -> 0x0134 }
                boolean r1 = r5.isDirectory()     // Catch:{ Exception -> 0x0134 }
                if (r1 == 0) goto L_0x0091
                goto L_0x007d
            L_0x0091:
                com.rnziparchive.RNZipArchiveModule$b$a r6 = new com.rnziparchive.RNZipArchiveModule$b$a     // Catch:{ Exception -> 0x0134 }
                r1 = r6
                r2 = r17
                r3 = r11
                r4 = r13
                r16 = r5
                r8 = r6
                r5 = r9
                r1.<init>(r3, r4, r5)     // Catch:{ Exception -> 0x0134 }
                java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0134 }
                java.lang.String r2 = r7.f26362q     // Catch:{ Exception -> 0x0134 }
                java.lang.String r3 = r16.getName()     // Catch:{ Exception -> 0x0134 }
                r1.<init>(r2, r3)     // Catch:{ Exception -> 0x0134 }
                java.lang.String r2 = r1.getCanonicalPath()     // Catch:{ Exception -> 0x0134 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0134 }
                r3.<init>()     // Catch:{ Exception -> 0x0134 }
                java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x0134 }
                java.lang.String r5 = r7.f26362q     // Catch:{ Exception -> 0x0134 }
                r4.<init>(r5)     // Catch:{ Exception -> 0x0134 }
                java.lang.String r4 = r4.getCanonicalPath()     // Catch:{ Exception -> 0x0134 }
                r3.append(r4)     // Catch:{ Exception -> 0x0134 }
                java.lang.String r4 = java.io.File.separator     // Catch:{ Exception -> 0x0134 }
                r3.append(r4)     // Catch:{ Exception -> 0x0134 }
                java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0134 }
                boolean r3 = r2.startsWith(r3)     // Catch:{ Exception -> 0x0134 }
                if (r3 == 0) goto L_0x010e
                boolean r2 = r1.exists()     // Catch:{ Exception -> 0x0134 }
                if (r2 != 0) goto L_0x00e2
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0134 }
                java.lang.String r3 = r1.getParent()     // Catch:{ Exception -> 0x0134 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0134 }
                r2.mkdirs()     // Catch:{ Exception -> 0x0134 }
            L_0x00e2:
                r2 = r16
                java.io.InputStream r2 = r14.getInputStream(r2)     // Catch:{ IOException -> 0x00fe }
                java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x00ff }
                java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00ff }
                r4.<init>(r1)     // Catch:{ IOException -> 0x00ff }
                r3.<init>(r4)     // Catch:{ IOException -> 0x00ff }
                com.rnziparchive.C9847b.m33563a(r2, r3, r8)     // Catch:{ IOException -> 0x00fc }
                r3.close()     // Catch:{ IOException -> 0x00fc }
                r2.close()     // Catch:{ IOException -> 0x00fc }
                goto L_0x007d
            L_0x00fc:
                goto L_0x0100
            L_0x00fe:
                r2 = 0
            L_0x00ff:
                r3 = 0
            L_0x0100:
                if (r2 == 0) goto L_0x0107
                r2.close()     // Catch:{ Exception -> 0x0106 }
                goto L_0x0107
            L_0x0106:
            L_0x0107:
                if (r3 == 0) goto L_0x007d
                r3.close()     // Catch:{ Exception -> 0x007d }
                goto L_0x007d
            L_0x010e:
                java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ Exception -> 0x0134 }
                java.lang.String r3 = "Found Zip Path Traversal Vulnerability with %s"
                java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0134 }
                r0[r12] = r2     // Catch:{ Exception -> 0x0134 }
                java.lang.String r0 = java.lang.String.format(r3, r0)     // Catch:{ Exception -> 0x0134 }
                r1.<init>(r0)     // Catch:{ Exception -> 0x0134 }
                throw r1     // Catch:{ Exception -> 0x0134 }
            L_0x011e:
                r14.close()     // Catch:{ Exception -> 0x0134 }
                com.rnziparchive.RNZipArchiveModule r8 = com.rnziparchive.RNZipArchiveModule.this     // Catch:{ Exception -> 0x0134 }
                r9 = 1
                r11 = 1
                java.lang.String r13 = r7.f26359f     // Catch:{ Exception -> 0x0134 }
                r8.updateProgress(r9, r11, r13)     // Catch:{ Exception -> 0x0134 }
                com.facebook.react.bridge.Promise r0 = r7.f26360o     // Catch:{ Exception -> 0x0134 }
                java.lang.String r1 = r7.f26362q     // Catch:{ Exception -> 0x0134 }
                r0.resolve(r1)     // Catch:{ Exception -> 0x0134 }
                goto L_0x015b
            L_0x0134:
                r0 = move-exception
                com.rnziparchive.RNZipArchiveModule r1 = com.rnziparchive.RNZipArchiveModule.this
                r2 = 0
                r4 = 1
                java.lang.String r6 = r7.f26359f
                r1.updateProgress(r2, r4, r6)
                com.facebook.react.bridge.Promise r1 = r7.f26360o
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to extract file "
                r2.append(r3)
                java.lang.String r0 = r0.getLocalizedMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r2 = 0
                r1.reject((java.lang.String) r2, (java.lang.String) r0)
            L_0x015b:
                return
            L_0x015c:
                com.facebook.react.bridge.Promise r0 = r7.f26360o
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Couldn't open file "
                r1.append(r2)
                java.lang.String r2 = r7.f26359f
                r1.append(r2)
                java.lang.String r2 = ". "
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r2 = 0
                r0.reject((java.lang.String) r2, (java.lang.String) r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.rnziparchive.RNZipArchiveModule.C9841b.run():void");
        }
    }

    /* renamed from: com.rnziparchive.RNZipArchiveModule$c */
    class C9843c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f26368f;

        /* renamed from: o */
        final /* synthetic */ Promise f26369o;

        /* renamed from: p */
        final /* synthetic */ String f26370p;

        /* renamed from: com.rnziparchive.RNZipArchiveModule$c$a */
        class C9844a implements C9847b.C9848a {

            /* renamed from: a */
            final /* synthetic */ long[] f26372a;

            /* renamed from: b */
            final /* synthetic */ int[] f26373b;

            /* renamed from: c */
            final /* synthetic */ long f26374c;

            /* renamed from: d */
            final /* synthetic */ ZipEntry f26375d;

            C9844a(long[] jArr, int[] iArr, long j, ZipEntry zipEntry) {
                this.f26372a = jArr;
                this.f26373b = iArr;
                this.f26374c = j;
                this.f26375d = zipEntry;
            }

            /* renamed from: a */
            public void mo24630a(long j) {
                long[] jArr = this.f26372a;
                jArr[0] = jArr[0] + j;
                int[] iArr = this.f26373b;
                int i = iArr[0];
                long j2 = this.f26374c;
                int i2 = (int) ((((double) jArr[0]) * 100.0d) / ((double) j2));
                if (i2 > i) {
                    iArr[0] = i2;
                    RNZipArchiveModule.this.updateProgress(jArr[0], j2, this.f26375d.getName());
                }
            }
        }

        C9843c(String str, Promise promise, String str2) {
            this.f26368f = str;
            this.f26369o = promise;
            this.f26370p = str2;
        }

        public void run() {
            try {
                InputStream open = RNZipArchiveModule.this.getReactApplicationContext().getAssets().open(this.f26368f);
                long length = RNZipArchiveModule.this.getReactApplicationContext().getAssets().openFd(this.f26368f).getLength();
                try {
                    File file = new File(this.f26370p);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    ZipInputStream zipInputStream = new ZipInputStream(open);
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(zipInputStream);
                    long[] jArr = {0};
                    int[] iArr = {0};
                    RNZipArchiveModule.this.updateProgress(0, 1, this.f26368f);
                    while (true) {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            RNZipArchiveModule.this.updateProgress(1, 1, this.f26368f);
                            bufferedInputStream.close();
                            zipInputStream.close();
                            this.f26369o.resolve(this.f26370p);
                            return;
                        } else if (!nextEntry.isDirectory()) {
                            File file2 = new File(this.f26370p, nextEntry.getName());
                            String canonicalPath = file2.getCanonicalPath();
                            if (canonicalPath.startsWith(new File(this.f26370p).getCanonicalPath() + File.separator)) {
                                if (!file2.exists()) {
                                    new File(file2.getParent()).mkdirs();
                                }
                                C9844a aVar = r1;
                                C9844a aVar2 = new C9844a(jArr, iArr, length, nextEntry);
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                                C9847b.m33563a(bufferedInputStream, bufferedOutputStream, aVar);
                                bufferedOutputStream.close();
                                fileOutputStream.close();
                                iArr = iArr;
                            } else {
                                throw new SecurityException(String.format("Found Zip Path Traversal Vulnerability with %s", new Object[]{canonicalPath}));
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    RNZipArchiveModule.this.updateProgress(0, 1, this.f26368f);
                    throw new Exception(String.format("Couldn't extract %s", new Object[]{this.f26368f}));
                } catch (Exception e2) {
                    this.f26369o.reject((String) null, e2.getMessage());
                }
            } catch (IOException unused) {
                this.f26369o.reject((String) null, String.format("Asset file `%s` could not be opened", new Object[]{this.f26368f}));
            }
        }
    }

    /* renamed from: com.rnziparchive.RNZipArchiveModule$d */
    class C9845d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ char[] f26377f;

        /* renamed from: o */
        final /* synthetic */ String f26378o;

        /* renamed from: p */
        final /* synthetic */ ArrayList f26379p;

        /* renamed from: q */
        final /* synthetic */ C10550q f26380q;

        /* renamed from: r */
        final /* synthetic */ Promise f26381r;

        C9845d(char[] cArr, String str, ArrayList arrayList, C10550q qVar, Promise promise) {
            this.f26377f = cArr;
            this.f26378o = str;
            this.f26379p = arrayList;
            this.f26380q = qVar;
            this.f26381r = promise;
        }

        public void run() {
            try {
                char[] cArr = this.f26377f;
                C10483a aVar = cArr != null ? new C10483a(this.f26378o, cArr) : new C10483a(this.f26378o);
                RNZipArchiveModule.this.updateProgress(0, 100, this.f26378o);
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < this.f26379p.size(); i3++) {
                    File file = new File(this.f26379p.get(i3).toString());
                    if (!file.exists()) {
                        this.f26381r.reject((String) null, "File or folder does not exist");
                    } else if (file.isDirectory()) {
                        List asList = Arrays.asList(file.listFiles());
                        i += asList.size();
                        for (int i4 = 0; i4 < asList.size(); i4++) {
                            if (((File) asList.get(i4)).isDirectory()) {
                                aVar.mo25866c((File) asList.get(i4), this.f26380q);
                            } else {
                                aVar.mo25864a((File) asList.get(i4), this.f26380q);
                            }
                            i2++;
                            RNZipArchiveModule.this.updateProgress((long) i2, (long) i, this.f26378o);
                        }
                    } else {
                        i++;
                        aVar.mo25864a(file, this.f26380q);
                        i2++;
                        RNZipArchiveModule.this.updateProgress((long) i2, (long) i, this.f26378o);
                    }
                    RNZipArchiveModule.this.updateProgress(1, 1, this.f26378o);
                }
                this.f26381r.resolve(this.f26378o);
            } catch (Exception e) {
                this.f26381r.reject((String) null, e.getMessage());
            }
        }
    }

    public RNZipArchiveModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: private */
    public String getStackTrace(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* access modifiers changed from: private */
    public long getUncompressedSize(String str, String str2) {
        try {
            ZipFile zipFile = Build.VERSION.SDK_INT >= 24 ? new ZipFile(str, Charset.forName(str2)) : new ZipFile(str);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            long j = 0;
            while (entries.hasMoreElements()) {
                long size = ((ZipEntry) entries.nextElement()).getSize();
                if (size != -1) {
                    j += size;
                }
            }
            zipFile.close();
            return j;
        } catch (IOException unused) {
            return -1;
        }
    }

    private void processZip(ArrayList<Object> arrayList, String str, C10550q qVar, Promise promise, char[] cArr) {
        new Thread(new C9845d(cArr, str, arrayList, qVar, promise)).start();
    }

    private void zip(ArrayList<Object> arrayList, String str, Promise promise) {
        try {
            C10550q qVar = new C10550q();
            qVar.mo26189x(C10555d.DEFLATE);
            qVar.mo26188w(C10554c.NORMAL);
            processZip(arrayList, str, qVar, promise, (char[]) null);
        } catch (Exception e) {
            promise.reject((String) null, e.getMessage());
        }
    }

    private void zipWithPassword(ArrayList<Object> arrayList, String str, String str2, String str3, Promise promise) {
        String str4;
        String str5;
        try {
            C10550q qVar = new C10550q();
            qVar.mo26189x(C10555d.DEFLATE);
            qVar.mo26188w(C10554c.NORMAL);
            String[] split = str3.split("-");
            if (str2 == null || str2.isEmpty()) {
                promise.reject((String) null, "Password is empty");
            } else {
                qVar.mo26191z(true);
                if (split[0].equals("AES")) {
                    qVar.mo26159A(C10556e.AES);
                    qVar.mo26187v(split[1].equals("128") ? C10552a.KEY_STRENGTH_128 : split[1].equals("256") ? C10552a.KEY_STRENGTH_256 : C10552a.KEY_STRENGTH_128);
                } else {
                    if (str3.equals("STANDARD")) {
                        qVar.mo26159A(C10556e.ZIP_STANDARD_VARIANT_STRONG);
                        str4 = TAG;
                        str5 = "Standard Encryption";
                    } else {
                        qVar.mo26159A(C10556e.ZIP_STANDARD);
                        str4 = TAG;
                        str5 = "Encryption type not supported default to Standard Encryption";
                    }
                    Log.d(str4, str5);
                }
            }
            processZip(arrayList, str, qVar, promise, str2.toCharArray());
        } catch (Exception e) {
            promise.reject((String) null, e.getMessage());
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    public String getName() {
        return "RNZipArchive";
    }

    @ReactMethod
    public void isPasswordProtected(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new C10483a(str).mo25870k()));
        } catch (C10497a e) {
            promise.reject((String) null, String.format("Unable to check for encryption due to: %s", new Object[]{getStackTrace(e)}));
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void unzip(String str, String str2, String str3, Promise promise) {
        new Thread(new C9841b(str, promise, str3, str2)).start();
    }

    @ReactMethod
    public void unzipAssets(String str, String str2, Promise promise) {
        new Thread(new C9843c(str, promise, str2)).start();
    }

    @ReactMethod
    public void unzipWithPassword(String str, String str2, String str3, Promise promise) {
        new Thread(new C9840a(str, str3, promise, str2)).start();
    }

    /* access modifiers changed from: protected */
    public void updateProgress(long j, long j2, String str) {
        double min = Math.min(((double) j) / ((double) j2), 1.0d);
        Log.d(TAG, String.format("updateProgress: %.0f%%", new Object[]{Double.valueOf(100.0d * min)}));
        WritableMap createMap = Arguments.createMap();
        createMap.putString(EVENT_KEY_FILENAME, str);
        createMap.putDouble(EVENT_KEY_PROGRESS, min);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(PROGRESS_EVENT_NAME, createMap);
    }

    @ReactMethod
    public void zipFiles(ReadableArray readableArray, String str, Promise promise) {
        zip(readableArray.toArrayList(), str, promise);
    }

    @ReactMethod
    public void zipFilesWithPassword(ReadableArray readableArray, String str, String str2, String str3, Promise promise) {
        zipWithPassword(readableArray.toArrayList(), str, str2, str3, promise);
    }

    @ReactMethod
    public void zipFolder(String str, String str2, Promise promise) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        zip(arrayList, str2, promise);
    }

    @ReactMethod
    public void zipFolderWithPassword(String str, String str2, String str3, String str4, Promise promise) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        zipWithPassword(arrayList, str2, str3, str4, promise);
    }
}
