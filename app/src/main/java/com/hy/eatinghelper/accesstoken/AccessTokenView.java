package com.hy.eatinghelper.accesstoken;

/**
 * Created by huyin on 2017/9/10.
 */

public interface AccessTokenView {
     void setAccessToken(AccessToken accessToken);

     void showOther();

     void showNotConnected();
}
