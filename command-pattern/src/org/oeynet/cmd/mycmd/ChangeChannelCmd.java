package org.oeynet.cmd.mycmd;

import org.oeynet.cmd.abs.TvCommand;
import org.oeynet.cmd.obj.TvReceiver;

public class ChangeChannelCmd extends TvCommand {

	public ChangeChannelCmd(TvReceiver r) {
		super(r);
	}

	@Override
	public void execute(Object params) {
		super.tvReceiver.changeChannel((int) params);
	}
	

}
