package com.google.firebase.crashlytics.p139h.p144l.p145d0;

import android.util.Base64;
import android.util.JsonReader;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.firebase.crashlytics.p139h.p144l.C4633a;
import com.google.firebase.crashlytics.p139h.p144l.C4655a0;
import com.google.firebase.crashlytics.p139h.p144l.C4699b0;
import com.google.firebase.p156m.C4876a;
import com.google.firebase.p156m.p158i.C4890d;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;

/* renamed from: com.google.firebase.crashlytics.h.l.d0.g */
public class C4716g {

    /* renamed from: a */
    private static final C4876a f13271a = new C4890d().mo14863g(C4633a.f13108a).mo14864h(true).mo14862f();

    /* renamed from: com.google.firebase.crashlytics.h.l.d0.g$a */
    private interface C4717a<T> {
        /* renamed from: a */
        T mo14582a(JsonReader jsonReader);
    }

    /* renamed from: A */
    private static C4655a0 m18011A(JsonReader jsonReader) {
        C4655a0.C4658b b = C4655a0.m17693b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b.mo14336f(m18036y(jsonReader));
                    break;
                case 1:
                    b.mo14338h(jsonReader.nextString());
                    break;
                case 2:
                    b.mo14332b(jsonReader.nextString());
                    break;
                case 3:
                    b.mo14334d(jsonReader.nextString());
                    break;
                case 4:
                    b.mo14335e(jsonReader.nextString());
                    break;
                case 5:
                    b.mo14337g(jsonReader.nextInt());
                    break;
                case 6:
                    b.mo14333c(jsonReader.nextString());
                    break;
                case 7:
                    b.mo14339i(m18012B(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.mo14331a();
    }

    /* renamed from: B */
    private static C4655a0.C4665e m18012B(JsonReader jsonReader) {
        C4655a0.C4665e.C4669b a = C4655a0.C4665e.m17751a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = 9;
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14396l(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo14394j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a.mo14389e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    a.mo14388d(m18024m(jsonReader));
                    break;
                case 4:
                    a.mo14390f(m18022k(jsonReader, C4710a.f13265a));
                    break;
                case 5:
                    a.mo14395k(m18037z(jsonReader));
                    break;
                case 6:
                    a.mo14386b(m18020i(jsonReader));
                    break;
                case 7:
                    a.mo14397m(m18013C(jsonReader));
                    break;
                case 8:
                    a.mo14391g(jsonReader.nextString());
                    break;
                case 9:
                    a.mo14387c(jsonReader.nextBoolean());
                    break;
                case 10:
                    a.mo14392h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14385a();
    }

    /* renamed from: C */
    private static C4655a0.C4665e.C4694f m18013C(JsonReader jsonReader) {
        C4655a0.C4665e.C4694f.C4695a a = C4655a0.C4665e.C4694f.m17934a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                a.mo14526b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo14525a();
    }

    /* renamed from: i */
    private static C4655a0.C4665e.C4666a m18020i(JsonReader jsonReader) {
        C4655a0.C4665e.C4666a.C4667a a = C4655a0.C4665e.C4666a.m17767a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14381e(jsonReader.nextString());
                    break;
                case 1:
                    a.mo14378b(jsonReader.nextString());
                    break;
                case 2:
                    a.mo14379c(jsonReader.nextString());
                    break;
                case 3:
                    a.mo14383g(jsonReader.nextString());
                    break;
                case 4:
                    a.mo14382f(jsonReader.nextString());
                    break;
                case 5:
                    a.mo14380d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14377a();
    }

    /* renamed from: j */
    private static C4655a0.C4656a m18021j(JsonReader jsonReader) {
        C4655a0.C4656a.C4657a a = C4655a0.C4656a.m17706a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 0;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 1;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 3;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 4;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 5;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14324c(jsonReader.nextInt());
                    break;
                case 1:
                    a.mo14326e(jsonReader.nextLong());
                    break;
                case 2:
                    a.mo14328g(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo14329h(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo14325d(jsonReader.nextString());
                    break;
                case 5:
                    a.mo14327f(jsonReader.nextInt());
                    break;
                case 6:
                    a.mo14330i(jsonReader.nextString());
                    break;
                case 7:
                    a.mo14323b(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14322a();
    }

    /* renamed from: k */
    private static <T> C4699b0<T> m18022k(JsonReader jsonReader, C4717a<T> aVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo14582a(jsonReader));
        }
        jsonReader.endArray();
        return C4699b0.m17956b(arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static C4655a0.C4659c m18023l(JsonReader jsonReader) {
        C4655a0.C4659c.C4660a a = C4655a0.C4659c.m17733a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                a.mo14343b(jsonReader.nextString());
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                a.mo14344c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo14342a();
    }

    /* renamed from: m */
    private static C4655a0.C4665e.C4670c m18024m(JsonReader jsonReader) {
        C4655a0.C4665e.C4670c.C4671a a = C4655a0.C4665e.C4670c.m17796a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14415i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a.mo14411e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo14414h(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo14408b(jsonReader.nextInt());
                    break;
                case 4:
                    a.mo14410d(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo14409c(jsonReader.nextInt());
                    break;
                case 6:
                    a.mo14412f(jsonReader.nextString());
                    break;
                case 7:
                    a.mo14416j(jsonReader.nextInt());
                    break;
                case 8:
                    a.mo14413g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14407a();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static C4655a0.C4665e.C4672d m18025n(JsonReader jsonReader) {
        C4655a0.C4665e.C4672d.C4687b a = C4655a0.C4665e.C4672d.m17816a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14495c(m18028q(jsonReader));
                    break;
                case 1:
                    a.mo14494b(m18026o(jsonReader));
                    break;
                case 2:
                    a.mo14496d(m18032u(jsonReader));
                    break;
                case 3:
                    a.mo14498f(jsonReader.nextString());
                    break;
                case 4:
                    a.mo14497e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14493a();
    }

    /* renamed from: o */
    private static C4655a0.C4665e.C4672d.C4673a m18026o(JsonReader jsonReader) {
        C4655a0.C4665e.C4672d.C4673a.C4674a a = C4655a0.C4665e.C4672d.C4673a.m17823a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals(AppStateModule.APP_STATE_BACKGROUND)) {
                        c = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14430b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    a.mo14432d(m18029r(jsonReader));
                    break;
                case 2:
                    a.mo14433e(m18022k(jsonReader, C4715f.f13270a));
                    break;
                case 3:
                    a.mo14431c(m18022k(jsonReader, C4715f.f13270a));
                    break;
                case 4:
                    a.mo14434f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14429a();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a m18027p(JsonReader jsonReader) {
        C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a.C4677a a = C4655a0.C4665e.C4672d.C4673a.C4675b.C4676a.m17842a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14447c(jsonReader.nextString());
                    break;
                case 1:
                    a.mo14448d(jsonReader.nextLong());
                    break;
                case 2:
                    a.mo14450f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a.mo14446b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14445a();
    }

    /* renamed from: q */
    private static C4655a0.C4665e.C4672d.C4688c m18028q(JsonReader jsonReader) {
        C4655a0.C4665e.C4672d.C4688c.C4689a a = C4655a0.C4665e.C4672d.C4688c.m17906a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14506b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a.mo14507c(jsonReader.nextInt());
                    break;
                case 2:
                    a.mo14509e(jsonReader.nextInt());
                    break;
                case 3:
                    a.mo14508d(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo14511g(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo14510f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14505a();
    }

    /* renamed from: r */
    private static C4655a0.C4665e.C4672d.C4673a.C4675b m18029r(JsonReader jsonReader) {
        C4655a0.C4665e.C4672d.C4673a.C4675b.C4678b a = C4655a0.C4665e.C4672d.C4673a.C4675b.m17836a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14452b(m18021j(jsonReader));
                    break;
                case 1:
                    a.mo14456f(m18022k(jsonReader, C4712c.f13267a));
                    break;
                case 2:
                    a.mo14455e(m18033v(jsonReader));
                    break;
                case 3:
                    a.mo14453c(m18022k(jsonReader, C4714e.f13269a));
                    break;
                case 4:
                    a.mo14454d(m18030s(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14451a();
    }

    /* renamed from: s */
    private static C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c m18030s(JsonReader jsonReader) {
        C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c.C4680a a = C4655a0.C4665e.C4672d.C4673a.C4675b.C4679c.m17860a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14464c(m18022k(jsonReader, C4711b.f13266a));
                    break;
                case 1:
                    a.mo14466e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo14467f(jsonReader.nextString());
                    break;
                case 3:
                    a.mo14463b(m18030s(jsonReader));
                    break;
                case 4:
                    a.mo14465d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14462a();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b m18031t(JsonReader jsonReader) {
        C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b.C4686a a = C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4685b.m17888a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14490d(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo14492f(jsonReader.nextString());
                    break;
                case 2:
                    a.mo14491e(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo14488b(jsonReader.nextString());
                    break;
                case 4:
                    a.mo14489c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14487a();
    }

    /* renamed from: u */
    private static C4655a0.C4665e.C4672d.C4690d m18032u(JsonReader jsonReader) {
        C4655a0.C4665e.C4672d.C4690d.C4691a a = C4655a0.C4665e.C4672d.C4690d.m17920a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("content")) {
                jsonReader.skipValue();
            } else {
                a.mo14514b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo14513a();
    }

    /* renamed from: v */
    private static C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d m18033v(JsonReader jsonReader) {
        C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d.C4682a a = C4655a0.C4665e.C4672d.C4673a.C4675b.C4681d.m17872a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals("address")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14472b(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo14473c(jsonReader.nextString());
                    break;
                case 2:
                    a.mo14474d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14471a();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e m18034w(JsonReader jsonReader) {
        C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.C4684a a = C4655a0.C4665e.C4672d.C4673a.C4675b.C4683e.m17880a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals("name")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14479b(m18022k(jsonReader, C4711b.f13266a));
                    break;
                case 1:
                    a.mo14481d(jsonReader.nextString());
                    break;
                case 2:
                    a.mo14480c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14478a();
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static C4655a0.C4661d.C4663b m18035x(JsonReader jsonReader) {
        C4655a0.C4661d.C4663b.C4664a a = C4655a0.C4661d.C4663b.m17745a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a.mo14354c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                a.mo14353b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a.mo14352a();
    }

    /* renamed from: y */
    private static C4655a0.C4661d m18036y(JsonReader jsonReader) {
        C4655a0.C4661d.C4662a a = C4655a0.C4661d.m17739a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                a.mo14348b(m18022k(jsonReader, C4713d.f13268a));
            } else if (!nextName.equals("orgId")) {
                jsonReader.skipValue();
            } else {
                a.mo14349c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo14347a();
    }

    /* renamed from: z */
    private static C4655a0.C4665e.C4692e m18037z(JsonReader jsonReader) {
        C4655a0.C4665e.C4692e.C4693a a = C4655a0.C4665e.C4692e.m17924a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo14520b(jsonReader.nextString());
                    break;
                case 1:
                    a.mo14521c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a.mo14523e(jsonReader.nextString());
                    break;
                case 3:
                    a.mo14522d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo14519a();
    }

    /* renamed from: D */
    public C4655a0 mo14583D(String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            C4655a0 A = m18011A(jsonReader);
            jsonReader.close();
            return A;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: E */
    public String mo14584E(C4655a0 a0Var) {
        return f13271a.mo14846b(a0Var);
    }

    /* renamed from: a */
    public C4655a0.C4665e.C4672d mo14585a(String str) {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            C4655a0.C4665e.C4672d n = m18025n(jsonReader);
            jsonReader.close();
            return n;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: b */
    public String mo14586b(C4655a0.C4665e.C4672d dVar) {
        return f13271a.mo14846b(dVar);
    }
}
