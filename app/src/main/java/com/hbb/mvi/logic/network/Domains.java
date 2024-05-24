package com.hbb.mvi.logic.network;

import rxhttp.wrapper.annotation.DefaultDomain;
import rxhttp.wrapper.annotation.Domain;

/**
 * 网络请求域名
 */
public class Domains {
    @DefaultDomain //设置为默认域名
    public static String baseUrl = "https://www.wanandroid.com/";


    @Domain(name = "BaseUrlBaidu") //非默认域名，并取别名为BaseUrlBaidu
    public static String baidu = "https://www.baidu.com/";

}
