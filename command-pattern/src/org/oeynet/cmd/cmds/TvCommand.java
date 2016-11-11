package org.oeynet.cmd.cmds;

import org.oeynet.cmd.obj.TvReceiver;

/**
 * Created by zhaojunlike on 2016/11/10.
 * 命令抽象类
 */
public abstract class TvCommand {

    public void execute() {
        System.out.println("执行没有参数的命令");
    }

    public void execute(Object params) {
        System.out.println("执行带有参数的命令");
    }

    protected TvReceiver tvReceiver;

    public TvCommand(TvReceiver r) {
        this.tvReceiver = r;
    }
}
