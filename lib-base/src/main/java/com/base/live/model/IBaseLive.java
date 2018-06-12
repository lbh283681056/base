package com.base.live.model;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

/**
 */

public interface IBaseLive {
    /**
     * 绑定数据
     * 属性 activity
     * 属性 bundle
     */
    void bindData(Activity activity, Bundle bundle);


    /**
     * 创建播放
     */
    void onCreate( View playView);

    /**
     * 销毁播放
     */
    void onDestroy();
    /**
     * 开始播放
     */
    void start(String url);
    /**
     * 停止播放
     */
    void stop();

    /**
     * 重新开播
     * 属性 url
     */
    void reStar(String url);
    /**
     * 设置回调
     */
    void setCallBack(Handler callBackHandler);

    /**
     * 截图
     * 属性 path
     */
    void capturePicture(String path);
    /**
     * 禁止音频
     * 属性 enable
     */
    void setAudioEnable(boolean enable);

    /**
     * 禁止音视频
     * 属性 enable
     */
    void  setVideoEnable(boolean enable);
}
