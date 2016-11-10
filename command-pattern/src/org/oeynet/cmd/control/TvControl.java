package org.oeynet.cmd.control;

import org.oeynet.cmd.abs.TvCommand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class TvControl {

    private Map<String, TvCommand> cmds;

    public TvControl() {
    	cmds=new HashMap<>();
    }

    public void push(TvCommand cmd, String key) {
        cmds.put(key, cmd);
    }

    public void excute(String cmd) {
        this.cmds.get(cmd).execute();
    }
    
    
    public void excute(String cmd,Object params) {
		this.cmds.get(cmd).execute(params);
	}

}
