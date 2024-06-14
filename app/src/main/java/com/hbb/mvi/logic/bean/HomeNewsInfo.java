package com.hbb.mvi.logic.bean;

import java.util.List;

public class HomeNewsInfo {

    @Override
    public String toString() {
        return "HomeNewsInfo{" +
                "data=" + data +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    /**
     * data : {"curPage":771,"datas":[{"adminAdd":false,"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":4427,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzA5MzI3NjE2MA==&mid=205893577&idx=1&sn=a0e04052a6e30a1337e6e140c73abe78&scene=38#wechat_redirect","niceDate":"2015-05-22 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1432224000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"《见证Android推送时刻》视频系列教程已完结","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5352,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=209446915&idx=1&sn=ce29d24c37d4ceb4d90504a7b5e82281&scene=38#wechat_redirect","niceDate":"2015-05-17 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1431792000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"玩转CSDN之自定义博客栏目","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5334,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=209229339&idx=1&sn=c0d097a5db549bb0837e1c7f3634b2cd&scene=38#wechat_redirect","niceDate":"2015-05-11 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1431273600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"解放双手\u2014\u2014Android自动化测试","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5192,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=208737252&idx=1&sn=8cd2a24776d735dee916ba7d97dff1ed&scene=38#wechat_redirect","niceDate":"2015-04-27 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1430064000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"Android必学\u2014AsyncTask基础","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5283,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=208705270&idx=1&sn=381c758f95ded4a2ad7c079cad380559&scene=38#wechat_redirect","niceDate":"2015-04-26 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1429977600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"数据可视化是如何被创造出来的","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5269,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=208487318&idx=1&sn=d4ff8ce210d1075e868a385173e91abd&scene=38#wechat_redirect","niceDate":"2015-04-19 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1429372800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"如何快乐的翻墙","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5348,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=208303075&idx=1&sn=b5dbd9f1b9d1c5d6d905c786a9c5c144&scene=38#wechat_redirect","niceDate":"2015-04-13 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1428854400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"Android必学\u2014BaseAdapter的使用与优化","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7321,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=205670272&idx=1&sn=1885ffeef09d74e58843eb3611f340cf&scene=38#wechat_redirect","niceDate":"2015-04-01 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1427817600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【美团技术团队博客】Linux资源管理之cgroups简介","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5341,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=207941252&idx=1&sn=0f970dd13e133c840b3638a83dca4c5c&scene=38#wechat_redirect","niceDate":"2015-04-01 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1427817600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"Android异步任务处理从零开始","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5366,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=207844195&idx=1&sn=7c4520fd891d9c5b9fe2dc149aa3297d&scene=38#wechat_redirect","niceDate":"2015-03-29 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1427558400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"Android图像处理-变换莫测的图像","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":3619,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxMTI4MTkwNQ==&mid=204062726&idx=1&sn=bac796f4abf109209798b7a344c24200&scene=38#wechat_redirect","niceDate":"2015-03-19 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1426694400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android FoldingLayout 折叠布局 原理及实现（二）","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":4684,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzA5MzI3NjE2MA==&mid=203857944&idx=1&sn=20880edde19449d0f91bbaedb6d9fb95&scene=38#wechat_redirect","niceDate":"2015-03-16 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1426435200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"LitePal 1.2.0版本已发布","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":4047,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxMTI4MTkwNQ==&mid=203967906&idx=1&sn=1b43c4f8bbd12213a79dc27ad3021ed9&scene=38#wechat_redirect","niceDate":"2015-03-16 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1426435200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android FoldingLayout 折叠布局 原理及实现（一）","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7176,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=204808180&idx=2&sn=2104ae2a233e937ce43d526cc83dee51&scene=38#wechat_redirect","niceDate":"2015-03-10 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1425916800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【美团技术博客】Docker 入门介绍","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7303,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=204808180&idx=1&sn=bb2d725c2be2802e2e21733936f5b00f&scene=38#wechat_redirect","niceDate":"2015-03-10 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1425916800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【美团技术博客】Docker系列之二：基于容器的自动构建","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":3844,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxMTI4MTkwNQ==&mid=203568648&idx=1&sn=62651b7a722533d4c26a6bf49744fb89&scene=38#wechat_redirect","niceDate":"2015-03-05 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1425484800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"ColorTrackView","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7047,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=204581622&idx=2&sn=5f9cd20ecefd375ca7b9d3298b3e1cab&scene=38#wechat_redirect","niceDate":"2015-03-04 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1425398400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【美团技术团队博客】序列化和反序列化","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7167,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=204581622&idx=1&sn=167708e3baad013729143e0ec40c3565&scene=38#wechat_redirect","niceDate":"2015-03-04 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1425398400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【美团技术团队博客】Dive into Category","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7161,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=204004662&idx=1&sn=1adab47957337d6c58dda747ca1953e6&scene=38#wechat_redirect","niceDate":"2015-02-15 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1423929600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【机器学习InAction系列】数据清洗与特征处理综述","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7261,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=203878310&idx=1&sn=5b39e110a836a81ce9069b3e21627680&scene=38#wechat_redirect","niceDate":"2015-02-10 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1423497600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【机器学习InAction系列】机器学习如何解决问题","type":0,"userId":-1,"visible":1,"zan":0}],"offset":15400,"over":false,"pageCount":772,"size":20,"total":15440}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "curPage=" + curPage +
                    ", offset=" + offset +
                    ", over=" + over +
                    ", pageCount=" + pageCount +
                    ", size=" + size +
                    ", total=" + total +
                    ", datas=" + datas +
                    '}';
        }

        /**
         * curPage : 771
         * datas : [{"adminAdd":false,"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":4427,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzA5MzI3NjE2MA==&mid=205893577&idx=1&sn=a0e04052a6e30a1337e6e140c73abe78&scene=38#wechat_redirect","niceDate":"2015-05-22 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1432224000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"《见证Android推送时刻》视频系列教程已完结","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5352,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=209446915&idx=1&sn=ce29d24c37d4ceb4d90504a7b5e82281&scene=38#wechat_redirect","niceDate":"2015-05-17 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1431792000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"玩转CSDN之自定义博客栏目","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5334,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=209229339&idx=1&sn=c0d097a5db549bb0837e1c7f3634b2cd&scene=38#wechat_redirect","niceDate":"2015-05-11 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1431273600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"解放双手\u2014\u2014Android自动化测试","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5192,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=208737252&idx=1&sn=8cd2a24776d735dee916ba7d97dff1ed&scene=38#wechat_redirect","niceDate":"2015-04-27 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1430064000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"Android必学\u2014AsyncTask基础","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5283,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=208705270&idx=1&sn=381c758f95ded4a2ad7c079cad380559&scene=38#wechat_redirect","niceDate":"2015-04-26 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1429977600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"数据可视化是如何被创造出来的","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5269,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=208487318&idx=1&sn=d4ff8ce210d1075e868a385173e91abd&scene=38#wechat_redirect","niceDate":"2015-04-19 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1429372800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"如何快乐的翻墙","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5348,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=208303075&idx=1&sn=b5dbd9f1b9d1c5d6d905c786a9c5c144&scene=38#wechat_redirect","niceDate":"2015-04-13 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1428854400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"Android必学\u2014BaseAdapter的使用与优化","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7321,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=205670272&idx=1&sn=1885ffeef09d74e58843eb3611f340cf&scene=38#wechat_redirect","niceDate":"2015-04-01 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1427817600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【美团技术团队博客】Linux资源管理之cgroups简介","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5341,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=207941252&idx=1&sn=0f970dd13e133c840b3638a83dca4c5c&scene=38#wechat_redirect","niceDate":"2015-04-01 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1427817600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"Android异步任务处理从零开始","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"Android群英传","canEdit":false,"chapterId":413,"chapterName":"Android群英传","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":5366,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxNzMxNzk5OQ==&mid=207844195&idx=1&sn=7c4520fd891d9c5b9fe2dc149aa3297d&scene=38#wechat_redirect","niceDate":"2015-03-29 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1427558400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/413/1"}],"title":"Android图像处理-变换莫测的图像","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":3619,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxMTI4MTkwNQ==&mid=204062726&idx=1&sn=bac796f4abf109209798b7a344c24200&scene=38#wechat_redirect","niceDate":"2015-03-19 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1426694400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android FoldingLayout 折叠布局 原理及实现（二）","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":4684,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzA5MzI3NjE2MA==&mid=203857944&idx=1&sn=20880edde19449d0f91bbaedb6d9fb95&scene=38#wechat_redirect","niceDate":"2015-03-16 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1426435200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"LitePal 1.2.0版本已发布","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":4047,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxMTI4MTkwNQ==&mid=203967906&idx=1&sn=1b43c4f8bbd12213a79dc27ad3021ed9&scene=38#wechat_redirect","niceDate":"2015-03-16 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1426435200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android FoldingLayout 折叠布局 原理及实现（一）","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7176,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=204808180&idx=2&sn=2104ae2a233e937ce43d526cc83dee51&scene=38#wechat_redirect","niceDate":"2015-03-10 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1425916800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【美团技术博客】Docker 入门介绍","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7303,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=204808180&idx=1&sn=bb2d725c2be2802e2e21733936f5b00f&scene=38#wechat_redirect","niceDate":"2015-03-10 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1425916800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【美团技术博客】Docker系列之二：基于容器的自动构建","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":3844,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MzAxMTI4MTkwNQ==&mid=203568648&idx=1&sn=62651b7a722533d4c26a6bf49744fb89&scene=38#wechat_redirect","niceDate":"2015-03-05 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1425484800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"ColorTrackView","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7047,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=204581622&idx=2&sn=5f9cd20ecefd375ca7b9d3298b3e1cab&scene=38#wechat_redirect","niceDate":"2015-03-04 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1425398400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【美团技术团队博客】序列化和反序列化","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7167,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=204581622&idx=1&sn=167708e3baad013729143e0ec40c3565&scene=38#wechat_redirect","niceDate":"2015-03-04 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1425398400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【美团技术团队博客】Dive into Category","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7161,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=204004662&idx=1&sn=1adab47957337d6c58dda747ca1953e6&scene=38#wechat_redirect","niceDate":"2015-02-15 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1423929600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【机器学习InAction系列】数据清洗与特征处理综述","type":0,"userId":-1,"visible":1,"zan":0},{"adminAdd":false,"apkLink":"","audit":1,"author":"美团技术团队","canEdit":false,"chapterId":417,"chapterName":"美团技术团队","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":7261,"isAdminAdd":false,"link":"http://mp.weixin.qq.com/s?__biz=MjM5NjQ5MTI5OA==&mid=203878310&idx=1&sn=5b39e110a836a81ce9069b3e21627680&scene=38#wechat_redirect","niceDate":"2015-02-10 00:00","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1423497600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/417/1"}],"title":"【机器学习InAction系列】机器学习如何解决问题","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 15400
         * over : false
         * pageCount : 772
         * size : 20
         * total : 15440
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {

            @Override
            public String toString() {
                return "DatasBean{" +
                        "adminAdd=" + adminAdd +
                        ", apkLink='" + apkLink + '\'' +
                        ", audit=" + audit +
                        ", author='" + author + '\'' +
                        ", canEdit=" + canEdit +
                        ", chapterId=" + chapterId +
                        ", chapterName='" + chapterName + '\'' +
                        ", collect=" + collect +
                        ", courseId=" + courseId +
                        ", desc='" + desc + '\'' +
                        ", descMd='" + descMd + '\'' +
                        ", envelopePic='" + envelopePic + '\'' +
                        ", fresh=" + fresh +
                        ", host='" + host + '\'' +
                        ", id=" + id +
                        ", isAdminAdd=" + isAdminAdd +
                        ", link='" + link + '\'' +
                        ", niceDate='" + niceDate + '\'' +
                        ", niceShareDate='" + niceShareDate + '\'' +
                        ", origin='" + origin + '\'' +
                        ", prefix='" + prefix + '\'' +
                        ", projectLink='" + projectLink + '\'' +
                        ", publishTime=" + publishTime +
                        ", realSuperChapterId=" + realSuperChapterId +
                        ", selfVisible=" + selfVisible +
                        ", shareDate=" + shareDate +
                        ", shareUser='" + shareUser + '\'' +
                        ", superChapterId=" + superChapterId +
                        ", superChapterName='" + superChapterName + '\'' +
                        ", title='" + title + '\'' +
                        ", type=" + type +
                        ", userId=" + userId +
                        ", visible=" + visible +
                        ", zan=" + zan +
                        ", tags=" + tags +
                        '}';
            }

            /**
             * adminAdd : false
             * apkLink :
             * audit : 1
             * author : 郭霖
             * canEdit : false
             * chapterId : 409
             * chapterName : 郭霖
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : false
             * host :
             * id : 4427
             * isAdminAdd : false
             * link : http://mp.weixin.qq.com/s?__biz=MzA5MzI3NjE2MA==&mid=205893577&idx=1&sn=a0e04052a6e30a1337e6e140c73abe78&scene=38#wechat_redirect
             * niceDate : 2015-05-22 00:00
             * niceShareDate : 未知时间
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1432224000000
             * realSuperChapterId : 407
             * selfVisible : 0
             * shareDate : null
             * shareUser :
             * superChapterId : 408
             * superChapterName : 公众号
             * tags : [{"name":"公众号","url":"/wxarticle/list/409/1"}]
             * title : 《见证Android推送时刻》视频系列教程已完结
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            private boolean adminAdd;
            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private String host;
            private int id;
            private boolean isAdminAdd;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int realSuperChapterId;
            private int selfVisible;
            private Object shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<TagsBean> tags;

            public boolean isAdminAdd() {
                return adminAdd;
            }

            public void setAdminAdd(boolean adminAdd) {
                this.adminAdd = adminAdd;
            }

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public String getHost() {
                return host;
            }

            public void setHost(String host) {
                this.host = host;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public boolean isIsAdminAdd() {
                return isAdminAdd;
            }

            public void setIsAdminAdd(boolean isAdminAdd) {
                this.isAdminAdd = isAdminAdd;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getRealSuperChapterId() {
                return realSuperChapterId;
            }

            public void setRealSuperChapterId(int realSuperChapterId) {
                this.realSuperChapterId = realSuperChapterId;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public Object getShareDate() {
                return shareDate;
            }

            public void setShareDate(Object shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * name : 公众号
                 * url : /wxarticle/list/409/1
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
