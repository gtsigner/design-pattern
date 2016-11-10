package org.oeynet.cmd.abs;

import org.oeynet.cmd.obj.TvReceiver;

/**
 * Created by zhaojunlike on 2016/11/10.
 */
public abstract class TvCommand {

    public void execute() {

    }

    public void execute(Object params) {

    }

    protected TvReceiver tvReceiver;

    public TvCommand(TvReceiver r) {
        this.tvReceiver = r;
    }
}
