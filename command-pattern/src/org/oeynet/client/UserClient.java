package org.oeynet.client;

import org.oeynet.cmd.control.TvControl;
import org.oeynet.cmd.cmds.ChangeChannelCmd;
import org.oeynet.cmd.cmds.TurnOffCmd;
import org.oeynet.cmd.cmds.TurnOnCmd;
import org.oeynet.cmd.obj.TvReceiver;

/**
 * Created by zhaojunlike on 2016/11/10.
 * 用户客户端，初始化control和tv实体
 */
public class UserClient {

    private TvReceiver tv;
    private TvControl control;

    public UserClient() {
        this._init();
    }

    public TvControl getControl() {
        return this.control;
    }

    private void _init() {
        this.tv = new TvReceiver();
        this.control = new TvControl();
        this.initCmd(control);
    }

    private void initCmd(TvControl control) {
        TurnOffCmd cmd1 = new TurnOffCmd(this.tv);
        TurnOnCmd cmd2 = new TurnOnCmd(this.tv);
        ChangeChannelCmd cmd3 = new ChangeChannelCmd(this.tv);
        control.push(cmd1, "close");
        control.push(cmd2, "open");
        control.push(cmd3, "change");
    }
}
