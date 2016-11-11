package org.oeynet.cmd.control;

import org.oeynet.cmd.cmds.TvCommand;

import java.util.HashMap;
import java.util.Map;

/**
 * Tv遥控板，充当控制器作用
 */
public class TvControl {

    //命令库
    private Map<String, TvCommand> _mCmdS;

    public TvControl() {
        this._mCmdS = new HashMap<String, TvCommand>();
    }

    //初始化控制器的一些命令
    public void push(TvCommand cmd, String key) {
        this._mCmdS.put(key, cmd);
    }

    //执行
    public void execute(String cmd) {
        this._mCmdS.get(cmd).execute();
    }


    //带参数的执行
    public void execute(String cmd, Object params) {
        this._mCmdS.get(cmd).execute(params);
    }

}
