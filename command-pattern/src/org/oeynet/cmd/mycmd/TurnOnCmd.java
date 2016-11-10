package org.oeynet.cmd.mycmd;

import org.oeynet.cmd.abs.TvCommand;
import org.oeynet.cmd.obj.TvReceiver;

/**
 * Created by zhaojunlike on 2016/11/10.
 */
public class TurnOnCmd extends TvCommand {

	public TurnOnCmd(TvReceiver r) {
		super(r);
	}

	@Override
	public void execute() {
		super.tvReceiver.turnOn();
	}
}
