package p495in.dataevolve.digiyatra;

import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import okhttp3.HttpUrl;
import org.hyperledger.aries.api.AriesController;
import org.hyperledger.aries.api.DIDExchangeController;
import org.hyperledger.aries.api.Handler;
import org.hyperledger.aries.api.IssueCredentialController;
import org.hyperledger.aries.api.PresentProofController;
import org.hyperledger.aries.ariesagent.Ariesagent;
import org.hyperledger.aries.config.Options;
import org.hyperledger.aries.models.RequestEnvelope;
import org.hyperledger.aries.models.ResponseEnvelope;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: in.dataevolve.digiyatra.AgentModule */
public class AgentModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public AriesController agent = null;
    int count = 0;

    /* renamed from: f */
    public String f28102f = HttpUrl.FRAGMENT_ENCODE_SET;
    public Handler handler = null;
    public Handler handler2 = null;
    public DeviceEventManagerModule.RCTDeviceEventEmitter mEmitter = null;
    String name = "hello";
    public String registrationID1 = HttpUrl.FRAGMENT_ENCODE_SET;
    public String registrationID2 = HttpUrl.FRAGMENT_ENCODE_SET;
    public String registrationID3 = HttpUrl.FRAGMENT_ENCODE_SET;

    /* renamed from: in.dataevolve.digiyatra.AgentModule$a */
    class C10639a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f28103f;

        /* renamed from: o */
        final /* synthetic */ String f28104o;

        /* renamed from: p */
        final /* synthetic */ String f28105p;

        C10639a(String str, String str2, String str3) {
            this.f28103f = str;
            this.f28104o = str2;
            this.f28105p = str3;
        }

        public void run() {
            try {
                JSONObject agentRequestMethod = AgentModule.this.agentRequestMethod(this.f28103f, this.f28104o, this.f28105p);
                agentRequestMethod.put("topic", this.f28104o);
                Log.d("Agent/response", agentRequestMethod.toString());
                AgentModule.this.sendEvent("message", agentRequestMethod.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: in.dataevolve.digiyatra.AgentModule$b */
    class C10640b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ String f28107f;

        /* renamed from: o */
        final /* synthetic */ String f28108o;

        /* renamed from: p */
        final /* synthetic */ String f28109p;

        /* renamed from: q */
        final /* synthetic */ Promise f28110q;

        C10640b(String str, String str2, String str3, Promise promise) {
            this.f28107f = str;
            this.f28108o = str2;
            this.f28109p = str3;
            this.f28110q = promise;
        }

        public void run() {
            try {
                String string = AgentModule.this.getReactApplicationContext().getSharedPreferences("credential", 0).getString(this.f28107f, HttpUrl.FRAGMENT_ENCODE_SET);
                Log.d("Agent/payload", string);
                JSONObject agentRequestMethod = AgentModule.this.agentRequestMethod(this.f28108o, this.f28109p, string);
                this.f28110q.resolve(agentRequestMethod.toString());
                Log.d("Agent/response", agentRequestMethod.toString());
            } catch (Exception e) {
                this.f28110q.reject("e");
                e.printStackTrace();
            }
        }
    }

    /* renamed from: in.dataevolve.digiyatra.AgentModule$c */
    class C10641c implements Handler {

        /* renamed from: f */
        private DeviceEventManagerModule.RCTDeviceEventEmitter f28112f = null;

        C10641c(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter) {
            this.f28112f = rCTDeviceEventEmitter;
        }

        /* renamed from: a */
        private void m36240a(String str, String str2) {
            WritableMap createMap = Arguments.createMap();
            SharedPreferences.Editor edit = AgentModule.this.getReactApplicationContext().getSharedPreferences("credential", 0).edit();
            String uuid = UUID.randomUUID().toString();
            edit.putString(uuid, str2);
            edit.commit();
            createMap.putString("message", uuid);
            if (AgentModule.this.f28102f.equals("1")) {
                this.f28112f.emit("message", createMap);
            }
        }

        public void handle(String str, byte[] bArr) {
            Log.d("topic: ", str);
            Log.d("topic payload: ", new String(bArr, StandardCharsets.UTF_8));
            m36240a(str, new String(bArr, StandardCharsets.UTF_8));
        }
    }

    AgentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addLifecycleEventListener(this);
        Log.d("Aries/", "in super initalized");
    }

    /* access modifiers changed from: private */
    public void sendEvent(String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", str2);
        if (this.mEmitter == null) {
            this.mEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        if (this.f28102f.equals("1")) {
            this.mEmitter.emit(str, createMap);
        }
    }

    @ReactMethod
    public void addListener(String str) {
        this.f28102f = "1";
        this.mEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    @ReactMethod
    public void agentMethod(String str, String str2, String str3) {
        new Thread(new C10639a(str, str2, str3)).start();
    }

    @ReactMethod
    public void agentMethod1(String str, String str2, String str3, Promise promise) {
        new Thread(new C10640b(str3, str, str2, promise)).start();
    }

    public JSONObject agentRequestMethod(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            byte[] bytes = str3.getBytes(StandardCharsets.UTF_8);
            RequestEnvelope requestEnvelope = new RequestEnvelope(bytes);
            Log.d("Agent/payload4/" + str2, str + "  " + str3);
            requestEnvelope.setPayload(bytes);
            ResponseEnvelope responseEnvelope = new ResponseEnvelope();
            if (str.equals("didexchange")) {
                DIDExchangeController dIDExchangeController = this.agent.getDIDExchangeController();
                if (str2.equals("receiveInvitation")) {
                    responseEnvelope = dIDExchangeController.receiveInvitation(requestEnvelope);
                }
                if (str2.equals("acceptInvitation")) {
                    responseEnvelope = dIDExchangeController.acceptInvitation(requestEnvelope);
                }
                if (str2.equals("queryConnectionByID")) {
                    responseEnvelope = dIDExchangeController.queryConnectionByID(requestEnvelope);
                }
                if (str2.equals("queryConnections")) {
                    responseEnvelope = dIDExchangeController.queryConnections(requestEnvelope);
                }
            }
            if (str.equals("issue-credential")) {
                IssueCredentialController issueCredentialController = this.agent.getIssueCredentialController();
                if (str2.equals("sendRequest")) {
                    responseEnvelope = issueCredentialController.sendRequest(requestEnvelope);
                }
            }
            if (str.equals("present-proof")) {
                PresentProofController presentProofController = this.agent.getPresentProofController();
                if (str2.equals("sendProposePresentation")) {
                    responseEnvelope = presentProofController.sendProposePresentation(requestEnvelope);
                }
                if (str2.equals("acceptRequestPresentation")) {
                    responseEnvelope = presentProofController.acceptRequestPresentation(requestEnvelope);
                }
            }
            Log.d("Agent/" + str2, responseEnvelope.toString());
            if (responseEnvelope.getError() == null || responseEnvelope.getError().getMessage().isEmpty()) {
                jSONObject.put("status", 1);
                jSONObject.put("payload", new JSONObject(new String(responseEnvelope.getPayload(), StandardCharsets.UTF_8)));
            } else {
                jSONObject.put("status", 0);
                jSONObject.put("payload", responseEnvelope.toString());
            }
        } catch (Exception e) {
            String stackTraceString = Log.getStackTraceString(e);
            Log.e("Agent/" + str2, stackTraceString);
            try {
                jSONObject.put("status", 0);
                jSONObject.put("payload", stackTraceString);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            e.printStackTrace();
        }
        return jSONObject;
    }

    @ReactMethod
    public void getMan(String str) {
        this.count++;
        Log.d("AgentModule", "Create event called with name: " + str + " and location: ");
        sendEvent("message", Integer.toString(this.count));
    }

    public String getName() {
        return "AgentModule";
    }

    public void initAgent() {
        if (this.agent == null) {
            this.mEmitter = (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
            Options options = new Options();
            options.setUseLocalAgent(true);
            options.addOutboundTransport("ws");
            options.setLoadRemoteDocuments(true);
            options.setLabel("user1");
            options.setTransportReturnRoute("all");
            options.addHTTPResolver("sidetree@https://44.234.85.195:32656/sidetree/v1/identifiers");
            try {
                this.agent = Ariesagent.new_(options);
                Log.d("Status", "Agent started----------------------------------------------------\n\n\n\n");
                this.handler = new C10641c(this.mEmitter);
                this.handler2 = new C10641c(this.mEmitter);
                this.registrationID3 = this.agent.registerHandler(this.handler, "present-proof_actions");
                this.registrationID1 = this.agent.registerHandler(this.handler, "issue-credential_actions");
                this.registrationID2 = this.agent.registerHandler(this.handler2, "didexchange_states");
                Log.d("Agent Handler", "started");
            } catch (Exception e) {
                e.printStackTrace();
                Log.d("Agent Status", e.getMessage());
            }
        }
    }

    @ReactMethod
    public void initializeAgent(Promise promise) {
        initAgent();
        promise.resolve("agent returned from bridge");
    }

    public void onCatalystInstanceDestroy() {
        AriesController ariesController;
        AriesController ariesController2;
        AriesController ariesController3;
        Log.d("YourModuleLog", "whatever yqou want");
        if (!this.registrationID1.equals(HttpUrl.FRAGMENT_ENCODE_SET) && (ariesController3 = this.agent) != null) {
            ariesController3.unregisterHandler(this.registrationID1);
        }
        if (!this.registrationID2.equals(HttpUrl.FRAGMENT_ENCODE_SET) && (ariesController2 = this.agent) != null) {
            ariesController2.unregisterHandler(this.registrationID2);
        }
        if (!this.registrationID3.equals(HttpUrl.FRAGMENT_ENCODE_SET) && (ariesController = this.agent) != null) {
            ariesController.unregisterHandler(this.registrationID3);
        }
        if (this.agent != null) {
            this.agent = null;
            this.handler = null;
            this.handler2 = null;
            this.registrationID1 = HttpUrl.FRAGMENT_ENCODE_SET;
            this.registrationID2 = HttpUrl.FRAGMENT_ENCODE_SET;
            this.registrationID3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    public void onHostDestroy() {
        Log.d("YourModuleLog", "whatever eyou want");
    }

    public void onHostPause() {
        Log.d("YourModuleLog", "whatever you wanwt");
    }

    public void onHostResume() {
    }

    @ReactMethod
    public void removeListeners(Integer num) {
        this.f28102f = "0";
    }

    @ReactMethod
    public void testMethod(String str, Promise promise) {
        promise.resolve(getReactApplicationContext().getSharedPreferences("name", 0).getString(str, "j"));
    }
}
