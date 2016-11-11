package org.oeynet.cmd.cmds;

import org.oeynet.cmd.obj.TvReceiver;

/**
 * 命令
 */
public class ChangeChannelCmd extends TvCommand {

    public ChangeChannelCmd(TvReceiver r) {
        super(r);
    }

    @Override
    public void execute(Object params) {
        int channel = (Integer) params;
        super.tvReceiver.changeChannel(channel);
    }


}
