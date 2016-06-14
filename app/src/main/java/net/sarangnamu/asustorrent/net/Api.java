package net.sarangnamu.asustorrent.net;

/**
 * Created by <a href="mailto:aucd29@gmail.com">Burke Choi</a> on 2016. 6. 14.. <p/>
 */
public class Api {
    private static final org.slf4j.Logger mLog = org.slf4j.LoggerFactory.getLogger(Api.class);

    public static final String URI_STATUS = "http://%s/downloadmaster/dm_print_status.cgi?action_mode=All";
    public static final String URI_SEND_CMD  = "http://%s/downloadmaster/dm_apply.cgi?action_mode=DM_CTRL&dm_ctrl=%s&task_id=%s&download_type=BT";
    public static final String URI_GROUP_CMD = "http://%s/downloadmaster/dm_apply.cgi?action_mode=DM_CTRL&dm_ctrl=%s&download_type=ALL";
    public static final String URI_LINK_CMD  = "http://%s/downloadmaster/dm_apply.cgi?action_mode=DM_ADD&download_type=5&again=no&usb_dm_url=%s";

    public static final String URI_UPLOAD      = "http://%s/downloadmaster/dm_uploadbt.cgi";
    public static final String URI_UPLOAD_FILE = "http://%s/downloadmaster/dm_uploadbt.cgi?filename=%s&download_type=%s";

}
