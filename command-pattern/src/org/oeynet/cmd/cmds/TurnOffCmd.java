package org.oeynet.cmd.cmds;

import org.oeynet.cmd.obj.TvReceiver;

/**
 * Created by zhaojunlike on 2016/11/10.
 */
public class TurnOffCmd extends TvCommand {

    public TurnOffCmd(TvReceiver r) {
        super(r);
    }

    @Override
    public void execute() {
    	super.tvReceiver.turnOff();
    }
}
