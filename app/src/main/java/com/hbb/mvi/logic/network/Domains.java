package com.hbb.mvi.logic.network;

import com.hbb.mvi.common.Const;

import rxhttp.wrapper.annotation.DefaultDomain;
import rxhttp.wrapper.annotation.Domain;

/**
 * RxHttp配置- 网络请求域名
 */
public class Domains {
    @DefaultDomain //设置为默认域名
    public static String baseUrl = Const.ActionUrl.BASE_URL;


    @Domain(name = "BaseUrlBaidu") //非默认域名，并取别名为BaseUrlBaidu
    public static String baidu = "https://www.baidu.com/";

    @Domain(name = "BaseUrlBaoBab") //非默认域名，并取别名为BaseUrlBaidu
    public static String baoBabUrl = Const.ActionUrl.BAOBAB_URL;

}
