package org.hyperledger.aries.config;

import java.util.Arrays;
import org.hyperledger.aries.api.LoggerProvider;
import org.hyperledger.aries.api.Provider;
import p476go.Seq;

public final class Options implements Seq.Proxy {
    private final int refnum;

    static {
        Config.touch();
    }

    public Options() {
        int __New = __New();
        this.refnum = __New;
        Seq.trackGoRef(__New, this);
    }

    Options(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    private static native int __New();

    public native void addHTTPResolver(String str);

    public native void addOutboundTransport(String str);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Options)) {
            return false;
        }
        Options options = (Options) obj;
        if (getUseLocalAgent() != options.getUseLocalAgent()) {
            return false;
        }
        String agentURL = getAgentURL();
        String agentURL2 = options.getAgentURL();
        if (agentURL == null) {
            if (agentURL2 != null) {
                return false;
            }
        } else if (!agentURL.equals(agentURL2)) {
            return false;
        }
        String aPIToken = getAPIToken();
        String aPIToken2 = options.getAPIToken();
        if (aPIToken == null) {
            if (aPIToken2 != null) {
                return false;
            }
        } else if (!aPIToken.equals(aPIToken2)) {
            return false;
        }
        String label = getLabel();
        String label2 = options.getLabel();
        if (label == null) {
            if (label2 != null) {
                return false;
            }
        } else if (!label.equals(label2)) {
            return false;
        }
        if (getAutoAccept() != options.getAutoAccept()) {
            return false;
        }
        String transportReturnRoute = getTransportReturnRoute();
        String transportReturnRoute2 = options.getTransportReturnRoute();
        if (transportReturnRoute == null) {
            if (transportReturnRoute2 != null) {
                return false;
            }
        } else if (!transportReturnRoute.equals(transportReturnRoute2)) {
            return false;
        }
        if (getLoadRemoteDocuments() != options.getLoadRemoteDocuments()) {
            return false;
        }
        String logLevel = getLogLevel();
        String logLevel2 = options.getLogLevel();
        if (logLevel == null) {
            if (logLevel2 != null) {
                return false;
            }
        } else if (!logLevel.equals(logLevel2)) {
            return false;
        }
        LoggerProvider logger = getLogger();
        LoggerProvider logger2 = options.getLogger();
        if (logger == null) {
            if (logger2 != null) {
                return false;
            }
        } else if (!logger.equals(logger2)) {
            return false;
        }
        Provider storage = getStorage();
        Provider storage2 = options.getStorage();
        if (storage == null) {
            if (storage2 != null) {
                return false;
            }
        } else if (!storage.equals(storage2)) {
            return false;
        }
        String websocketURL = getWebsocketURL();
        String websocketURL2 = options.getWebsocketURL();
        return websocketURL == null ? websocketURL2 == null : websocketURL.equals(websocketURL2);
    }

    public final native String getAPIToken();

    public final native String getAgentURL();

    public final native boolean getAutoAccept();

    public final native String getLabel();

    public final native boolean getLoadRemoteDocuments();

    public final native String getLogLevel();

    public final native LoggerProvider getLogger();

    public final native Provider getStorage();

    public final native String getTransportReturnRoute();

    public final native boolean getUseLocalAgent();

    public final native String getWebsocketURL();

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(getUseLocalAgent()), getAgentURL(), getAPIToken(), getLabel(), Boolean.valueOf(getAutoAccept()), getTransportReturnRoute(), Boolean.valueOf(getLoadRemoteDocuments()), getLogLevel(), getLogger(), getStorage(), getWebsocketURL()});
    }

    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public final native void setAPIToken(String str);

    public final native void setAgentURL(String str);

    public final native void setAutoAccept(boolean z);

    public final native void setLabel(String str);

    public final native void setLoadRemoteDocuments(boolean z);

    public final native void setLogLevel(String str);

    public final native void setLogger(LoggerProvider loggerProvider);

    public final native void setStorage(Provider provider);

    public final native void setTransportReturnRoute(String str);

    public final native void setUseLocalAgent(boolean z);

    public final native void setWebsocketURL(String str);

    public String toString() {
        return "Options" + "{" + "UseLocalAgent:" + getUseLocalAgent() + "," + "AgentURL:" + getAgentURL() + "," + "APIToken:" + getAPIToken() + "," + "Label:" + getLabel() + "," + "AutoAccept:" + getAutoAccept() + "," + "TransportReturnRoute:" + getTransportReturnRoute() + "," + "LoadRemoteDocuments:" + getLoadRemoteDocuments() + "," + "LogLevel:" + getLogLevel() + "," + "Logger:" + getLogger() + "," + "Storage:" + getStorage() + "," + "WebsocketURL:" + getWebsocketURL() + "," + "}";
    }
}
