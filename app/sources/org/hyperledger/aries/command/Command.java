package org.hyperledger.aries.command;

import org.hyperledger.aries.api.Api;
import org.hyperledger.aries.config.Config;
import org.hyperledger.aries.config.Options;
import org.hyperledger.aries.models.Models;
import org.hyperledger.aries.notifier.Notifier;
import org.hyperledger.aries.storage.Storage;
import p476go.Seq;

public abstract class Command {
    static {
        Seq.touch();
        Api.touch();
        Config.touch();
        Notifier.touch();
        Storage.touch();
        Models.touch();
        _init();
    }

    private Command() {
    }

    private static native void _init();

    public static native Aries newAries(Options options);

    public static void touch() {
    }
}
