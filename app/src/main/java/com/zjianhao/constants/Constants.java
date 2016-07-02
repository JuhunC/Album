package com.zjianhao.constants;

/**
 * Created by zjianhao on 15-9-17.
 */
public class Constants {

    public static final String SERVER_IP = "192.168.1.102";
    public static final String PROJECT_URL = "http://"+SERVER_IP+":8080/Album";
    public static final String LOGIN_URL = PROJECT_URL+"/userLogin.action";
    public static final String REGIST_URL = PROJECT_URL+"/userRegist.action";

    public static final String UPLOAD_URL = PROJECT_URL+"/upload.action";
    public static final String CLOUD_PHOTO = PROJECT_URL+"/photoAction.action";
    public static final String APP_DIRECT = "http://192.168.1.102:8080/Album/photoAction.action";
}
