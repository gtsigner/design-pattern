package org.oeynet;

import org.oeynet.client.UserClient;
import org.oeynet.cmd.control.TvControl;

/**
 * Created by zhaojunlike on 2016/11/10.
 */
public class Start {

    public static void main(String[] params) {
        UserClient client = new UserClient();
        TvControl control = client.getControl();
        control.excute("open");
        control.excute("close");
        control.excute("change", 3);
    }
}
