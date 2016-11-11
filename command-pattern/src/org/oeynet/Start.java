package org.oeynet;

import org.oeynet.client.UserClient;
import org.oeynet.cmd.control.TvControl;

/**
 * Created by zhaojunlike on 2016/11/10.
 * 启动器
 */
public class Start {

    public static void main(String[] params) {
        UserClient client = new UserClient();
        TvControl control = client.getControl();
        control.execute("open");
        control.execute("close");
        control.execute("change", 3);
    }
}
