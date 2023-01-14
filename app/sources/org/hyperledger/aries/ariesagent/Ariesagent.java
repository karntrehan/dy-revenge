package org.hyperledger.aries.ariesagent;

import org.hyperledger.aries.api.Api;
import org.hyperledger.aries.api.AriesController;
import org.hyperledger.aries.command.Command;
import org.hyperledger.aries.config.Config;
import org.hyperledger.aries.config.Options;
import org.hyperledger.aries.logger.Logger;
import org.hyperledger.aries.rest.Rest;
import p476go.Seq;

public abstract class Ariesagent {
    static {
        Seq.touch();
        Api.touch();
        Command.touch();
        Config.touch();
        Logger.touch();
        Rest.touch();
        _init();
    }

    private Ariesagent() {
    }

    private static native void _init();

    public static native AriesController new_(Options options);

    public static void touch() {
    }
}
