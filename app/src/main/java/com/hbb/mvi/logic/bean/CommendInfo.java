package com.hbb.mvi.logic.bean;

import java.util.List;

public class CommendInfo {

    @Override
    public String toString() {
        return "CommendInfo{" +
                "count=" + count +
                ", total=" + total +
                ", nextPageUrl='" + nextPageUrl + '\'' +
                ", adExist=" + adExist +
                ", itemList=" + itemList +
                '}';
    }

    /**
     * itemList : [{"type":"horizontalScrollCard","data":{"dataType":"ItemCollection","header":null,"itemList":[{"type":"squareCardOfCommunityContent","data":{"dataType":"SquareContentCard","title":"主题创作广场","subTitle":"发布你的作品和日常","bgPicture":"http://img.kaiyanapp.com/04eef7e9f3b14a597bd04a8d81a4c8f3.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://community/tagSquare?tabIndex=0"},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"squareCardOfCommunityContent","data":{"dataType":"SquareContentCard","title":"话题讨论大厅","subTitle":"分享你的故事和观点","bgPicture":"http://img.kaiyanapp.com/ccd8be3b1a97cc34c55f9897b06d47e8.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://webview/?title=&url=https%3a%2f%2fm.eyepetizer.net%2fu2%2funiversal-card%3fpage_label%3dtopic_square%26page_type%3dcard"},"trackingData":null,"tag":null,"id":0,"adIndex":-1}],"count":2,"adTrack":null,"footer":null},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"horizontalScrollCard","data":{"dataType":"HorizontalScrollCard","itemList":[{"type":"banner","data":{"dataType":"Banner","id":2340,"title":"","description":"","image":"http://img.kaiyanapp.com/c0ba8253fa66e296d61ff8903f67083b.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://topic/detail?id=450","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2266,"title":"","description":"","image":"http://img.kaiyanapp.com/f42bb45aa0c08ca9bb394f1876b4fe94.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://topic/detail?id=438","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2261,"title":"","description":"","image":"http://img.kaiyanapp.com/3301ea081957934e8916b514ba4aa02a.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://lightTopic/detail/540?title=%E5%87%BA%E9%80%83%E4%B8%A4%E6%97%A5%E5%8F%88%E5%A6%82%E4%BD%95&url=","adTrack":[],"shade":false,"label":{"text":"广告","card":"广告","detail":null},"labelList":[{"text":"广告","actionUrl":null}],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2324,"title":"","description":"","image":"http://img.kaiyanapp.com/8fb8bbe73f74a96e6f8da4a272fb31f2.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://tag/1547?tabIndex=1","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2336,"title":"","description":"","image":"http://img.kaiyanapp.com/63ce01d5a8f78cbe2690e3b590d62a56.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://topic/detail?id=449","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2322,"title":"","description":"","image":"http://img.kaiyanapp.com/a7e7404d3174f752fc06211a9e516bda.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://topic/detail?id=446","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2329,"title":"","description":"","image":"http://img.kaiyanapp.com/11489a2b27b36e18ad457c44ee9092d5.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://tag/1550?tabIndex=1","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2346,"title":"","description":"","image":"http://img.kaiyanapp.com/3a12e0b16ecd55236bd057fcbf2289bb.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://webview/?title=%E5%BD%93%E4%BB%A3%E5%A4%9C%E7%8C%AB%E5%AD%90%E5%9B%BE%E9%89%B4%EF%BC%8C%E4%BD%A0%E6%98%AF%E5%93%AA%E4%B8%80%E7%A7%8D%E7%B1%BB%E5%9E%8B%E7%9A%84%E7%86%AC%E5%A4%9C%E9%80%89%E6%89%8B%EF%BC%9F&url=https%3A%2F%2Fh5.eyepetizer.net%2Fv1%2Ftopic-vote%3Fcollection_id%3D4781","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2321,"title":"","description":"","image":"http://img.kaiyanapp.com/63387ab458f7162c27b909d5fc57175a.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://topic/detail?id=445","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2302,"title":"","description":"","image":"http://img.kaiyanapp.com/9673d3ed09ee63f9b9cb6ea0b5509677.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://topic/detail?id=441","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2337,"title":"","description":"","image":"http://img.kaiyanapp.com/b1e2c14c067f824a361a295c4d4738e3.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://tag/1553?tabIndex=1","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2339,"title":"","description":"","image":"http://img.kaiyanapp.com/7d5a7090100007b7d1c9dcfc6762f1e6.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://webview/?title=%F0%9F%8E%81%E3%80%8A%E5%90%8D%E4%BE%A6%E6%8E%A2%E6%9F%AF%E5%8D%97%E3%80%8B%E4%B8%AD%EF%BC%8C%E5%93%AA%E4%B8%AA%E7%BB%8F%E5%85%B8%E6%A1%88%E4%BB%B6%E8%AE%A9%E4%BD%A0%E5%8D%B0%E8%B1%A1%E6%B7%B1%E5%88%BB%EF%BC%9F&url=https%3A%2F%2Fh5.eyepetizer.net%2Fv1%2Ftopic-vote%3Fcollection_id%3D4780","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2325,"title":"","description":"","image":"http://img.kaiyanapp.com/cf857a6d72e2ab4b7ba6f0ee79f106e0.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://tag/1548?tabIndex=1","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2328,"title":"","description":"","image":"http://img.kaiyanapp.com/67ac1d67ae077650d1ef35f2312452dc.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://tag/1549?tabIndex=1","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2334,"title":"","description":"","image":"http://img.kaiyanapp.com/199f78c83b6fbde6424d9689ed6fd0c3.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://tag/1552?tabIndex=1","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2343,"title":"","description":"","image":"http://img.kaiyanapp.com/56ed7021cf51bf271898403e189c1346.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://webview/?title=&url=https%3A%2F%2Fwww.kaiyanapp.com%2Fnew_article.html%3Fnid%3D2629%26shareable%3Dtrue%26type%3DarticleTopic%26cid%3D2343","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"banner","data":{"dataType":"Banner","id":2332,"title":"","description":"","image":"http://img.kaiyanapp.com/9ebe17384ba85e84c8b608c28f67f70e.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://topic/detail?id=448","adTrack":[],"shade":false,"label":{"text":"","card":"","detail":null},"labelList":[],"header":{"id":0,"title":null,"font":null,"subTitle":null,"subTitleFont":null,"textAlign":"left","cover":null,"label":null,"actionUrl":null,"labelList":null,"rightText":null,"icon":null,"description":null},"autoPlay":false},"trackingData":null,"tag":null,"id":0,"adIndex":-1}],"count":17},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"communityColumnsCard","data":{"dataType":"FollowCard","header":{"id":315396,"actionUrl":"eyepetizer://pgc/detail/303343704/?title=%E4%B9%8C%E8%8B%8F%E5%B0%91%E5%B9%B4&userType=NORMAL&tabIndex=0","labelList":null,"icon":"http://ali-img.kaiyanapp.com/f7892c6ac9d6e9611cbad07deeef172f.jpeg?image_process=image/auto-orient,1/resize,w_360/format,webp/interlace,1/quality,q_80","iconType":"round","time":1661916434000,"showHateVideo":false,"followType":"user","tagId":0,"tagName":null,"issuerName":"乌苏少年","topShow":false},"content":{"type":"video","data":{"dataType":"UgcVideoBean","id":315396,"title":"","description":"时隔六年，他的声音，再次唤醒了我们对平凡生活的向往。","library":"DEFAULT","tags":[{"id":1604,"name":"跟着电影去旅行","actionUrl":"eyepetizer://tag/1604/?title=%E8%B7%9F%E7%9D%80%E7%94%B5%E5%BD%B1%E5%8E%BB%E6%97%85%E8%A1%8C","adTrack":null,"desc":"打卡荧幕上的同款风景","bgPicture":"http://img.kaiyanapp.com/0c5a833dd888f324ec20458babce2ed0.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/0c5a833dd888f324ec20458babce2ed0.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":2}],"consumption":{"collectionCount":64,"shareCount":0,"replyCount":0,"realCollectionCount":5},"resourceType":"ugc_video","uid":303343704,"createTime":1661916434000,"updateTime":1662480155000,"collected":false,"reallyCollected":false,"owner":{"uid":303343704,"nickname":"乌苏少年","avatar":"http://ali-img.kaiyanapp.com/f7892c6ac9d6e9611cbad07deeef172f.jpeg?image_process=image/auto-orient,1/resize,w_360/format,webp/interlace,1/quality,q_80","userType":"NORMAL","ifPgc":false,"description":"人生就是一场孤独的旅行","area":null,"gender":"male","registDate":1571538610000,"releaseDate":1715220706000,"cover":"http://ali-img.kaiyanapp.com/f9a3fddd3f0941404f4b1d30235c2952.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://pgc/detail/303343704/?title=%E4%B9%8C%E8%8B%8F%E5%B0%91%E5%B9%B4&userType=NORMAL&tabIndex=0","followed":false,"limitVideoOpen":false,"library":"BLOCK","birthday":0,"country":"中国","city":"成都市","university":"","job":"自由职业者","expert":false},"cover":{"feed":"http://ali-img.kaiyanapp.com/b91c10d2018fc84b2c7678c23693fc7d.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://ali-img.kaiyanapp.com/b91c10d2018fc84b2c7678c23693fc7d.jpeg?imageMogr2/quality/60/format/jpg","blurred":null,"sharing":null,"homepage":null},"selectedTime":null,"checkStatus":"CHECKED","area":"成都市","city":"成都市","longitude":104.1779758,"latitude":30.5690633,"ifMock":false,"validateStatus":"SUBMIT","validateResult":"DEFAULT","width":1920,"height":1080,"addWatermark":true,"recentOnceReply":null,"privateMessageActionUrl":null,"source":"","playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=315396&resourceType=ugc_video&editionType=default&source=aliyun&playUrlType=url_oss&udid=","status":"ONLINE","releaseTime":1661916434000,"duration":99,"transId":null,"type":"COMMON","validateTaskId":"vi7TDqQqeQ4YZ4Eh9gipw9so-1wL7Mj","playUrlWatermark":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=315396&resourceType=ugc_video&editionType=default&source=aliyun&playUrlType=play_url_watermark&udid="},"trackingData":null,"tag":null,"id":0,"adIndex":-1},"adTrack":null},"trackingData":null,"tag":null,"id":315396,"adIndex":-1},{"type":"communityColumnsCard","data":{"dataType":"FollowCard","header":{"id":837358,"actionUrl":"eyepetizer://pgc/detail/303420109/?title=LC-%E8%80%81%E4%B8%91&userType=NORMAL&tabIndex=0","labelList":null,"icon":"http://img.kaiyanapp.com/f3ec7a77a0281973b45be72f36033b89.png","iconType":"round","time":1661860116000,"showHateVideo":false,"followType":"user","tagId":0,"tagName":null,"issuerName":"LC-老丑","topShow":false},"content":{"type":"ugcPicture","data":{"dataType":"UgcPictureBean","id":837358,"title":"","description":"一方净土","library":"DEFAULT","tags":[{"id":930,"name":"摄影师日常","actionUrl":"eyepetizer://tag/930/?title=%E6%91%84%E5%BD%B1%E5%B8%88%E6%97%A5%E5%B8%B8","adTrack":null,"desc":"透过镜头，我看到了更加真实的世界","bgPicture":"http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":12}],"consumption":{"collectionCount":82,"shareCount":0,"replyCount":0,"realCollectionCount":0},"resourceType":"ugc_picture","uid":303420109,"createTime":1661860116000,"updateTime":1662480277000,"collected":false,"reallyCollected":false,"owner":{"uid":303420109,"nickname":"LC-老丑","avatar":"http://ali-img.kaiyanapp.com/f3ec7a77a0281973b45be72f36033b89.png","userType":"NORMAL","ifPgc":false,"description":"陌上花开，缓缓归矣","area":null,"gender":"male","registDate":1574554082000,"releaseDate":1718094872000,"cover":"http://img.kaiyanapp.com/f9a3fddd3f0941404f4b1d30235c2952.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://pgc/detail/303420109/?title=LC-%E8%80%81%E4%B8%91&userType=NORMAL&tabIndex=0","followed":false,"limitVideoOpen":false,"library":"BLOCK","birthday":820857600000,"country":"中国","city":"广州市","university":"","job":"学生","expert":false},"cover":{"feed":"http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png?imageMogr2/quality/60/format/jpg","detail":"http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png?imageMogr2/quality/60/format/jpg","blurred":null,"sharing":null,"homepage":null},"selectedTime":null,"checkStatus":"CHECKED","area":"","city":"","longitude":0,"latitude":0,"ifMock":false,"validateStatus":"SUBMIT","validateResult":"DEFAULT","width":1080,"height":1440,"addWatermark":true,"recentOnceReply":null,"privateMessageActionUrl":null,"source":"","url":"http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png?imageMogr2/quality/100!/format/jpg","urls":["http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png"],"status":1,"releaseTime":1661860116000,"urlsWithWatermark":["http://img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png"]},"trackingData":null,"tag":null,"id":0,"adIndex":-1},"adTrack":null},"trackingData":null,"tag":null,"id":837358,"adIndex":-1},{"type":"communityColumnsCard","data":{"dataType":"FollowCard","header":{"id":837221,"actionUrl":"eyepetizer://pgc/detail/304875539/?title=%E8%AF%9A%E5%AE%9E%E5%8F%AF%E7%88%B1%E5%B0%8F%E7%8B%BC%E7%8B%97&userType=NORMAL&tabIndex=0","labelList":null,"icon":"http://img.kaiyanapp.com/b15f2a654ef669ede42d40a5e9d84a06.jpeg","iconType":"round","time":1661826932000,"showHateVideo":false,"followType":"user","tagId":0,"tagName":null,"issuerName":"诚实可爱小狼狗","topShow":false},"content":{"type":"ugcPicture","data":{"dataType":"UgcPictureBean","id":837221,"title":"","description":"扫街时随手拍的一张","library":"DEFAULT","tags":[{"id":930,"name":"摄影师日常","actionUrl":"eyepetizer://tag/930/?title=%E6%91%84%E5%BD%B1%E5%B8%88%E6%97%A5%E5%B8%B8","adTrack":null,"desc":"透过镜头，我看到了更加真实的世界","bgPicture":"http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":12}],"consumption":{"collectionCount":64,"shareCount":0,"replyCount":0,"realCollectionCount":2},"resourceType":"ugc_picture","uid":304875539,"createTime":1661826932000,"updateTime":1662481085000,"collected":false,"reallyCollected":false,"owner":{"uid":304875539,"nickname":"诚实可爱小狼狗","avatar":"http://ali-img.kaiyanapp.com/b15f2a654ef669ede42d40a5e9d84a06.jpeg","userType":"NORMAL","ifPgc":false,"description":"记录时间，记录空间，最终，记录记忆。","area":null,"gender":"male","registDate":1661535207000,"releaseDate":1664640382000,"cover":"http://img.kaiyanapp.com/f9a3fddd3f0941404f4b1d30235c2952.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://pgc/detail/304875539/?title=%E8%AF%9A%E5%AE%9E%E5%8F%AF%E7%88%B1%E5%B0%8F%E7%8B%BC%E7%8B%97&userType=NORMAL&tabIndex=0","followed":false,"limitVideoOpen":false,"library":"BLOCK","birthday":null,"country":"","city":"","university":"","job":"","expert":false},"cover":{"feed":"http://ali-img.kaiyanapp.com/0-ab881461a3d61ae992da0abf2e023421.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://ali-img.kaiyanapp.com/0-ab881461a3d61ae992da0abf2e023421.jpeg?imageMogr2/quality/60/format/jpg","blurred":null,"sharing":null,"homepage":null},"selectedTime":null,"checkStatus":"CHECKED","area":"","city":"","longitude":0,"latitude":0,"ifMock":false,"validateStatus":"SUBMIT","validateResult":"DEFAULT","width":4000,"height":6000,"addWatermark":true,"recentOnceReply":null,"privateMessageActionUrl":null,"source":"","url":"http://ali-img.kaiyanapp.com/0-ab881461a3d61ae992da0abf2e023421.jpeg?imageMogr2/quality/100!/format/jpg","urls":["http://ali-img.kaiyanapp.com/0-ab881461a3d61ae992da0abf2e023421.jpeg"],"status":1,"releaseTime":1661826932000,"urlsWithWatermark":["http://img.kaiyanapp.com/0-ab881461a3d61ae992da0abf2e023421.jpeg"]},"trackingData":null,"tag":null,"id":0,"adIndex":-1},"adTrack":null},"trackingData":null,"tag":null,"id":837221,"adIndex":-1},{"type":"communityColumnsCard","data":{"dataType":"FollowCard","header":{"id":837192,"actionUrl":"eyepetizer://pgc/detail/302572670/?title=%E7%83%A6%E7%9D%80%E5%91%A2&userType=NORMAL&tabIndex=0","labelList":null,"icon":"http://img.kaiyanapp.com/1a108ded72da5a723f658f77b3afda5e.jpeg?imageMogr2/quality/60/format/jpg","iconType":"round","time":1661818902000,"showHateVideo":false,"followType":"user","tagId":0,"tagName":null,"issuerName":"烦着呢","topShow":false},"content":{"type":"ugcPicture","data":{"dataType":"UgcPictureBean","id":837192,"title":"","description":"收获了白刺果","library":"DEFAULT","tags":null,"consumption":{"collectionCount":116,"shareCount":0,"replyCount":0,"realCollectionCount":0},"resourceType":"ugc_picture","uid":302572670,"createTime":1661818902000,"updateTime":1662481156000,"collected":false,"reallyCollected":false,"owner":{"uid":302572670,"nickname":"烦着呢","avatar":"http://ali-img.kaiyanapp.com/1a108ded72da5a723f658f77b3afda5e.jpeg?imageMogr2/quality/60/format/jpg","userType":"NORMAL","ifPgc":false,"description":"总之，谢谢大家喜欢！","area":null,"gender":"","registDate":1553436601000,"releaseDate":1713318326000,"cover":"http://img.kaiyanapp.com/b28adf7712ebe2c8583c41421b3630e1.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://pgc/detail/302572670/?title=%E7%83%A6%E7%9D%80%E5%91%A2&userType=NORMAL&tabIndex=0","followed":false,"limitVideoOpen":false,"library":"BLOCK","birthday":0,"country":"","city":"","university":"","job":"","expert":false},"cover":{"feed":"http://ali-img.kaiyanapp.com/65b295964fe5d5e55807966a3d032f40.png?imageMogr2/quality/60/format/jpg","detail":"http://ali-img.kaiyanapp.com/65b295964fe5d5e55807966a3d032f40.png?imageMogr2/quality/60/format/jpg","blurred":null,"sharing":null,"homepage":null},"selectedTime":null,"checkStatus":"CHECKED","area":"","city":"","longitude":0,"latitude":0,"ifMock":false,"validateStatus":"SUBMIT","validateResult":"DEFAULT","width":3000,"height":4000,"addWatermark":true,"recentOnceReply":null,"privateMessageActionUrl":null,"source":"","url":"http://ali-img.kaiyanapp.com/65b295964fe5d5e55807966a3d032f40.png?imageMogr2/quality/100!/format/jpg","urls":["http://ali-img.kaiyanapp.com/65b295964fe5d5e55807966a3d032f40.png"],"status":1,"releaseTime":1661818902000,"urlsWithWatermark":["http://img.kaiyanapp.com/65b295964fe5d5e55807966a3d032f40.png"]},"trackingData":null,"tag":null,"id":0,"adIndex":-1},"adTrack":null},"trackingData":null,"tag":null,"id":837192,"adIndex":-1},{"type":"communityColumnsCard","data":{"dataType":"FollowCard","header":{"id":837169,"actionUrl":"eyepetizer://pgc/detail/304878328/?title=%E6%9F%B3%E6%AD%86%E9%A2%9C&userType=NORMAL&tabIndex=0","labelList":null,"icon":"https://thirdwx.qlogo.cn/mmopen/vi_32/hpa9CB4lT0PiaWjha2WJPaYn0dl5C8VRKZJcYHtGKy79yJnVzYlcOZicw2HMYu5f7hRnCib7X39E3Nnh2sM8mUBrA/132","iconType":"round","time":1661789613000,"showHateVideo":false,"followType":"user","tagId":0,"tagName":null,"issuerName":"柳歆颜","topShow":false},"content":{"type":"ugcPicture","data":{"dataType":"UgcPictureBean","id":837169,"title":"","description":"我的山，藏匿在渺渺的人间烟火里，开阔在书香外，沉溺在晚霞中。","library":"DEFAULT","tags":[{"id":1569,"name":"跨越四季的山","actionUrl":"eyepetizer://tag/1569/?title=%E8%B7%A8%E8%B6%8A%E5%9B%9B%E5%AD%A3%E7%9A%84%E5%B1%B1","adTrack":null,"desc":"一年四季，每一季山都有不同的模样","bgPicture":"http://img.kaiyanapp.com/dab6dd65645e434c7cc988ed3acc03ed.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/dab6dd65645e434c7cc988ed3acc03ed.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":2}],"consumption":{"collectionCount":119,"shareCount":0,"replyCount":1,"realCollectionCount":0},"resourceType":"ugc_picture","uid":304878328,"createTime":1661789613000,"updateTime":1662481207000,"collected":false,"reallyCollected":false,"owner":{"uid":304878328,"nickname":"柳歆颜","avatar":"https://thirdwx.qlogo.cn/mmopen/vi_32/hpa9CB4lT0PiaWjha2WJPaYn0dl5C8VRKZJcYHtGKy79yJnVzYlcOZicw2HMYu5f7hRnCib7X39E3Nnh2sM8mUBrA/132","userType":"NORMAL","ifPgc":false,"description":null,"area":null,"gender":"unknown","registDate":1661788611000,"releaseDate":1662569177000,"cover":"http://img.kaiyanapp.com/f9a3fddd3f0941404f4b1d30235c2952.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://pgc/detail/304878328/?title=%E6%9F%B3%E6%AD%86%E9%A2%9C&userType=NORMAL&tabIndex=0","followed":false,"limitVideoOpen":false,"library":"BLOCK","birthday":null,"country":"","city":null,"university":null,"job":null,"expert":false},"cover":{"feed":"http://ali-img.kaiyanapp.com/6fc168c1659670cf24c68604d985658e.png?imageMogr2/quality/60/format/jpg","detail":"http://ali-img.kaiyanapp.com/6fc168c1659670cf24c68604d985658e.png?imageMogr2/quality/60/format/jpg","blurred":null,"sharing":null,"homepage":null},"selectedTime":null,"checkStatus":"CHECKED","area":"","city":"","longitude":0,"latitude":0,"ifMock":false,"validateStatus":"SUBMIT","validateResult":"DEFAULT","width":2304,"height":1728,"addWatermark":true,"recentOnceReply":{"dataType":"SimpleHotReplyCard","message":"往往这种就是最吸引人的","nickname":"叫我啥","actionUrl":"eyepetizer://pgc/detail/301331974/?title=%E5%8F%AB%E6%88%91%E5%95%A5&userType=NORMAL&tabIndex=0","contentType":null},"privateMessageActionUrl":null,"source":"","url":"http://ali-img.kaiyanapp.com/6fc168c1659670cf24c68604d985658e.png?imageMogr2/quality/100!/format/jpg","urls":["http://ali-img.kaiyanapp.com/6fc168c1659670cf24c68604d985658e.png","http://ali-img.kaiyanapp.com/d0b91f8adae84ff6feb935feaeaf14a6.png","http://ali-img.kaiyanapp.com/9f087bc707b569571f7d7f32574646dd.png"],"status":1,"releaseTime":1661789613000,"urlsWithWatermark":["http://img.kaiyanapp.com/6fc168c1659670cf24c68604d985658e.png","http://img.kaiyanapp.com/d0b91f8adae84ff6feb935feaeaf14a6.png","http://img.kaiyanapp.com/9f087bc707b569571f7d7f32574646dd.png"]},"trackingData":null,"tag":null,"id":0,"adIndex":-1},"adTrack":null},"trackingData":null,"tag":null,"id":837169,"adIndex":-1},{"type":"communityColumnsCard","data":{"dataType":"FollowCard","header":{"id":837152,"actionUrl":"eyepetizer://pgc/detail/304878270/?title=%E9%A2%93%E5%BA%9F%E7%9A%84%E4%BA%BA&userType=NORMAL&tabIndex=0","labelList":null,"icon":"http://img.kaiyanapp.com/11531c2d74c824911bc333dbc1cf78f4.png","iconType":"round","time":1661786045000,"showHateVideo":false,"followType":"user","tagId":0,"tagName":null,"issuerName":"颓废的人","topShow":false},"content":{"type":"ugcPicture","data":{"dataType":"UgcPictureBean","id":837152,"title":"","description":"星空的轨迹","library":"DEFAULT","tags":null,"consumption":{"collectionCount":14,"shareCount":0,"replyCount":0,"realCollectionCount":1},"resourceType":"ugc_picture","uid":304878270,"createTime":1661786045000,"updateTime":1662481243000,"collected":false,"reallyCollected":false,"owner":{"uid":304878270,"nickname":"颓废的人","avatar":"http://ali-img.kaiyanapp.com/11531c2d74c824911bc333dbc1cf78f4.png","userType":"NORMAL","ifPgc":false,"description":"不自律的人","area":null,"gender":"male","registDate":1661785825000,"releaseDate":1661786046000,"cover":"http://img.kaiyanapp.com/f9a3fddd3f0941404f4b1d30235c2952.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://pgc/detail/304878270/?title=%E9%A2%93%E5%BA%9F%E7%9A%84%E4%BA%BA&userType=NORMAL&tabIndex=0","followed":false,"limitVideoOpen":false,"library":"BLOCK","birthday":1200326400000,"country":"爱尔兰","city":"","university":"","job":"学生","expert":false},"cover":{"feed":"http://ali-img.kaiyanapp.com/423b8255bc92b1f375fe49ff28afc9de.png?imageMogr2/quality/60/format/jpg","detail":"http://ali-img.kaiyanapp.com/423b8255bc92b1f375fe49ff28afc9de.png?imageMogr2/quality/60/format/jpg","blurred":null,"sharing":null,"homepage":null},"selectedTime":null,"checkStatus":"CHECKED","area":"","city":"","longitude":0,"latitude":0,"ifMock":false,"validateStatus":"SUBMIT","validateResult":"DEFAULT","width":4000,"height":3000,"addWatermark":true,"recentOnceReply":null,"privateMessageActionUrl":null,"source":"","url":"http://ali-img.kaiyanapp.com/423b8255bc92b1f375fe49ff28afc9de.png?imageMogr2/quality/100!/format/jpg","urls":["http://ali-img.kaiyanapp.com/423b8255bc92b1f375fe49ff28afc9de.png"],"status":1,"releaseTime":1661786045000,"urlsWithWatermark":["http://img.kaiyanapp.com/423b8255bc92b1f375fe49ff28afc9de.png"]},"trackingData":null,"tag":null,"id":0,"adIndex":-1},"adTrack":null},"trackingData":null,"tag":null,"id":837152,"adIndex":-1},{"type":"communityColumnsCard","data":{"dataType":"FollowCard","header":{"id":837075,"actionUrl":"eyepetizer://pgc/detail/303509033/?title=%E8%95%BE%E5%AD%90%20%E6%98%AF%E7%9A%84%E5%91%80&userType=NORMAL&tabIndex=0","labelList":null,"icon":"http://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTK1ibmFwgZoVZAJQoOMkmnTqYlRFa7POgnib901TTj4VfibJaRGdAwticKIr9uSHibQHaRGUULIpXtqKhQ/132","iconType":"round","time":1661768366000,"showHateVideo":false,"followType":"user","tagId":0,"tagName":null,"issuerName":"蕾子 是的呀","topShow":false},"content":{"type":"ugcPicture","data":{"dataType":"UgcPictureBean","id":837075,"title":"","description":"骤雨骤凉","library":"DEFAULT","tags":[{"id":930,"name":"摄影师日常","actionUrl":"eyepetizer://tag/930/?title=%E6%91%84%E5%BD%B1%E5%B8%88%E6%97%A5%E5%B8%B8","adTrack":null,"desc":"透过镜头，我看到了更加真实的世界","bgPicture":"http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":12}],"consumption":{"collectionCount":70,"shareCount":0,"replyCount":0,"realCollectionCount":0},"resourceType":"ugc_picture","uid":303509033,"createTime":1661768366000,"updateTime":1662481358000,"collected":false,"reallyCollected":false,"owner":{"uid":303509033,"nickname":"蕾子 是的呀","avatar":"http://thirdwx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTK1ibmFwgZoVZAJQoOMkmnTqYlRFa7POgnib901TTj4VfibJaRGdAwticKIr9uSHibQHaRGUULIpXtqKhQ/132","userType":"NORMAL","ifPgc":false,"description":"","area":null,"gender":"female","registDate":1578120273000,"releaseDate":1718334616000,"cover":"http://img.kaiyanapp.com/f9a3fddd3f0941404f4b1d30235c2952.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://pgc/detail/303509033/?title=%E8%95%BE%E5%AD%90%20%E6%98%AF%E7%9A%84%E5%91%80&userType=NORMAL&tabIndex=0","followed":false,"limitVideoOpen":false,"library":"BLOCK","birthday":null,"country":"中国","city":"西安市","university":"","job":"","expert":false},"cover":{"feed":"http://ali-img.kaiyanapp.com/25fba88cba6fd6d357946eb1a57e498a.png?imageMogr2/quality/60/format/jpg","detail":"http://ali-img.kaiyanapp.com/25fba88cba6fd6d357946eb1a57e498a.png?imageMogr2/quality/60/format/jpg","blurred":null,"sharing":null,"homepage":null},"selectedTime":null,"checkStatus":"CHECKED","area":"","city":"","longitude":0,"latitude":0,"ifMock":false,"validateStatus":"SUBMIT","validateResult":"DEFAULT","width":3072,"height":4080,"addWatermark":true,"recentOnceReply":null,"privateMessageActionUrl":null,"source":"","url":"http://ali-img.kaiyanapp.com/25fba88cba6fd6d357946eb1a57e498a.png?imageMogr2/quality/100!/format/jpg","urls":["http://ali-img.kaiyanapp.com/25fba88cba6fd6d357946eb1a57e498a.png"],"status":1,"releaseTime":1661768366000,"urlsWithWatermark":["http://img.kaiyanapp.com/25fba88cba6fd6d357946eb1a57e498a.png"]},"trackingData":null,"tag":null,"id":0,"adIndex":-1},"adTrack":null},"trackingData":null,"tag":null,"id":837075,"adIndex":-1},{"type":"communityColumnsCard","data":{"dataType":"FollowCard","header":{"id":315172,"actionUrl":"eyepetizer://pgc/detail/303663623/?title=%E7%A5%9E%E7%A7%98%E7%9A%84%E5%B8%8C%E5%B8%8C&userType=NORMAL&tabIndex=0","labelList":null,"icon":"http://img.kaiyanapp.com/48d3024b5b65da2565506ca67e31aac0.jpeg?imageMogr2/quality/60/format/jpg","iconType":"round","time":1661733691000,"showHateVideo":false,"followType":"user","tagId":0,"tagName":null,"issuerName":"神秘的希希","topShow":false},"content":{"type":"video","data":{"dataType":"UgcVideoBean","id":315172,"title":"","description":"日常Vlog","library":"DEFAULT","tags":null,"consumption":{"collectionCount":45,"shareCount":0,"replyCount":1,"realCollectionCount":2},"resourceType":"ugc_video","uid":303663623,"createTime":1661733691000,"updateTime":1662481511000,"collected":false,"reallyCollected":false,"owner":{"uid":303663623,"nickname":"神秘的希希","avatar":"http://ali-img.kaiyanapp.com/48d3024b5b65da2565506ca67e31aac0.jpeg?imageMogr2/quality/60/format/jpg","userType":"NORMAL","ifPgc":false,"description":"嗯～也想我们能当朋友","area":null,"gender":"female","registDate":1582584686000,"releaseDate":1713329920000,"cover":"http://img.kaiyanapp.com/e01ff82cc37aa21e36db63db8984476c.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://pgc/detail/303663623/?title=%E7%A5%9E%E7%A7%98%E7%9A%84%E5%B8%8C%E5%B8%8C&userType=NORMAL&tabIndex=0","followed":false,"limitVideoOpen":false,"library":"BLOCK","birthday":1562428800000,"country":"","city":"","university":"","job":"","expert":false},"cover":{"feed":"http://ali-img.kaiyanapp.com/3b2941f544ec1ce2660a316f77431b62.jpeg?imageMogr2/quality/60/format/jpg","detail":"http://ali-img.kaiyanapp.com/3b2941f544ec1ce2660a316f77431b62.jpeg?imageMogr2/quality/60/format/jpg","blurred":null,"sharing":null,"homepage":null},"selectedTime":null,"checkStatus":"CHECKED","area":"","city":"","longitude":0,"latitude":0,"ifMock":false,"validateStatus":"SUBMIT","validateResult":"DEFAULT","width":1080,"height":1440,"addWatermark":true,"recentOnceReply":{"dataType":"SimpleHotReplyCard","message":"1","nickname":"别离亦是离别","actionUrl":"eyepetizer://pgc/detail/304902576/?title=%E5%88%AB%E7%A6%BB%E4%BA%A6%E6%98%AF%E7%A6%BB%E5%88%AB&userType=NORMAL&tabIndex=0","contentType":null},"privateMessageActionUrl":null,"source":"","playUrl":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=315172&resourceType=ugc_video&editionType=default&source=aliyun&playUrlType=url_oss&udid=","status":"ONLINE","releaseTime":1661733691000,"duration":6,"transId":null,"type":"COMMON","validateTaskId":"vi7JPeElhTAqj7F9NhsyhvnE-1wKsbU","playUrlWatermark":"http://baobab.kaiyanapp.com/api/v1/playUrl?vid=315172&resourceType=ugc_video&editionType=default&source=aliyun&playUrlType=play_url_watermark&udid="},"trackingData":null,"tag":null,"id":0,"adIndex":-1},"adTrack":null},"trackingData":null,"tag":null,"id":315172,"adIndex":-1},{"type":"communityColumnsCard","data":{"dataType":"FollowCard","header":{"id":836923,"actionUrl":"eyepetizer://pgc/detail/300915332/?title=%E5%81%B6%E8%A7%89%E5%9B%B0&userType=NORMAL&tabIndex=0","labelList":null,"icon":"http://img.kaiyanapp.com/13b8ce9209b7c717b6a45ce810bc0caf.jpeg?imageMogr2/quality/60/format/jpg","iconType":"round","time":1661712555000,"showHateVideo":false,"followType":"user","tagId":0,"tagName":null,"issuerName":"偶觉困","topShow":false},"content":{"type":"ugcPicture","data":{"dataType":"UgcPictureBean","id":836923,"title":"","description":"猫猫","library":"DEFAULT","tags":[{"id":1162,"name":"手机里的猫片","actionUrl":"eyepetizer://tag/1162/?title=%E6%89%8B%E6%9C%BA%E9%87%8C%E7%9A%84%E7%8C%AB%E7%89%87","adTrack":null,"desc":"喵，喵喵，喵喵喵","bgPicture":"http://img.kaiyanapp.com/fdec31867c21fb77b48c7a1f881142b9.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/fdec31867c21fb77b48c7a1f881142b9.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":true,"newestEndTime":1587555537000,"communityIndex":20}],"consumption":{"collectionCount":123,"shareCount":0,"replyCount":2,"realCollectionCount":0},"resourceType":"ugc_picture","uid":300915332,"createTime":1661712555000,"updateTime":1662481525000,"collected":false,"reallyCollected":false,"owner":{"uid":300915332,"nickname":"偶觉困","avatar":"http://ali-img.kaiyanapp.com/13b8ce9209b7c717b6a45ce810bc0caf.jpeg?imageMogr2/quality/60/format/jpg","userType":"NORMAL","ifPgc":false,"description":"在路上，柳絮飞。","area":null,"gender":"female","registDate":1501392211000,"releaseDate":1717340962000,"cover":"http://img.kaiyanapp.com/a357011cb26b21801848268dc188f371.jpeg?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://pgc/detail/300915332/?title=%E5%81%B6%E8%A7%89%E5%9B%B0&userType=NORMAL&tabIndex=0","followed":false,"limitVideoOpen":true,"library":"BLOCK","birthday":0,"country":"","city":"","university":"","job":"","expert":false},"cover":{"feed":"http://ali-img.kaiyanapp.com/e870106ee3dbc1d0bbb5e4ae53509c26.png?imageMogr2/quality/60/format/jpg","detail":"http://ali-img.kaiyanapp.com/e870106ee3dbc1d0bbb5e4ae53509c26.png?imageMogr2/quality/60/format/jpg","blurred":null,"sharing":null,"homepage":null},"selectedTime":null,"checkStatus":"CHECKED","area":"","city":"","longitude":0,"latitude":0,"ifMock":false,"validateStatus":"SUBMIT","validateResult":"DEFAULT","width":3648,"height":2736,"addWatermark":true,"recentOnceReply":{"dataType":"SimpleHotReplyCard","message":"是吖 她很可爱的","nickname":"偶觉困","actionUrl":"eyepetizer://pgc/detail/300915332/?title=%E5%81%B6%E8%A7%89%E5%9B%B0&userType=NORMAL&tabIndex=0","contentType":null},"privateMessageActionUrl":null,"source":"","url":"http://ali-img.kaiyanapp.com/e870106ee3dbc1d0bbb5e4ae53509c26.png?imageMogr2/quality/100!/format/jpg","urls":["http://ali-img.kaiyanapp.com/e870106ee3dbc1d0bbb5e4ae53509c26.png"],"status":1,"releaseTime":1661712555000,"urlsWithWatermark":["http://img.kaiyanapp.com/e870106ee3dbc1d0bbb5e4ae53509c26.png"]},"trackingData":null,"tag":null,"id":0,"adIndex":-1},"adTrack":null},"trackingData":null,"tag":null,"id":836923,"adIndex":-1}]
     * count : 11
     * total : 0
     * nextPageUrl : http://baobab.kaiyanapp.com/api/v7/community/tab/rec?startScore=1661712555000&pageCount=2
     * adExist : false
     */



    private int count;
    private int total;
    private String nextPageUrl;
    private boolean adExist;
    private List<ItemListBeanX> itemList;

    private boolean isAdd = false;

    public boolean isAdd() {
        return isAdd;
    }

    public void setAdd(boolean add) {
        isAdd = add;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getNextPageUrl() {
        return nextPageUrl;
    }

    public void setNextPageUrl(String nextPageUrl) {
        this.nextPageUrl = nextPageUrl;
    }

    public boolean isAdExist() {
        return adExist;
    }

    public void setAdExist(boolean adExist) {
        this.adExist = adExist;
    }

    public List<ItemListBeanX> getItemList() {
        return itemList;
    }

    public void setItemList(List<ItemListBeanX> itemList) {
        this.itemList = itemList;
    }

    public static class ItemListBeanX {
        @Override
        public String toString() {
            return "ItemListBeanX{" +
                    "type='" + type + '\'' +
                    ", data=" + data +
                    ", trackingData=" + trackingData +
                    ", tag=" + tag +
                    ", id=" + id +
                    ", adIndex=" + adIndex +
                    '}';
        }

        /**
         * type : horizontalScrollCard
         * data : {"dataType":"ItemCollection","header":null,"itemList":[{"type":"squareCardOfCommunityContent","data":{"dataType":"SquareContentCard","title":"主题创作广场","subTitle":"发布你的作品和日常","bgPicture":"http://img.kaiyanapp.com/04eef7e9f3b14a597bd04a8d81a4c8f3.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://community/tagSquare?tabIndex=0"},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"squareCardOfCommunityContent","data":{"dataType":"SquareContentCard","title":"话题讨论大厅","subTitle":"分享你的故事和观点","bgPicture":"http://img.kaiyanapp.com/ccd8be3b1a97cc34c55f9897b06d47e8.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://webview/?title=&url=https%3a%2f%2fm.eyepetizer.net%2fu2%2funiversal-card%3fpage_label%3dtopic_square%26page_type%3dcard"},"trackingData":null,"tag":null,"id":0,"adIndex":-1}],"count":2,"adTrack":null,"footer":null}
         * trackingData : null
         * tag : null
         * id : 0
         * adIndex : -1
         */

        private String type;
        private DataBeanX data;
        private Object trackingData;
        private Object tag;
        private int id;
        private int adIndex;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public DataBeanX getData() {
            return data;
        }

        public void setData(DataBeanX data) {
            this.data = data;
        }

        public Object getTrackingData() {
            return trackingData;
        }

        public void setTrackingData(Object trackingData) {
            this.trackingData = trackingData;
        }

        public Object getTag() {
            return tag;
        }

        public void setTag(Object tag) {
            this.tag = tag;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAdIndex() {
            return adIndex;
        }

        public void setAdIndex(int adIndex) {
            this.adIndex = adIndex;
        }

        public static class DataBeanX {
            @Override
            public String toString() {
                return "DataBeanX{" +
                        "dataType='" + dataType + '\'' +
                        ", header=" + header +
                        ", content=" + content +
                        ", count=" + count +
                        ", adTrack=" + adTrack +
                        ", footer=" + footer +
                        ", itemList=" + itemList +
                        '}';
            }

            /**
             * dataType : ItemCollection
             * header : null
             * itemList : [{"type":"squareCardOfCommunityContent","data":{"dataType":"SquareContentCard","title":"主题创作广场","subTitle":"发布你的作品和日常","bgPicture":"http://img.kaiyanapp.com/04eef7e9f3b14a597bd04a8d81a4c8f3.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://community/tagSquare?tabIndex=0"},"trackingData":null,"tag":null,"id":0,"adIndex":-1},{"type":"squareCardOfCommunityContent","data":{"dataType":"SquareContentCard","title":"话题讨论大厅","subTitle":"分享你的故事和观点","bgPicture":"http://img.kaiyanapp.com/ccd8be3b1a97cc34c55f9897b06d47e8.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://webview/?title=&url=https%3a%2f%2fm.eyepetizer.net%2fu2%2funiversal-card%3fpage_label%3dtopic_square%26page_type%3dcard"},"trackingData":null,"tag":null,"id":0,"adIndex":-1}]
             * count : 2
             * adTrack : null
             * footer : null
             */

            private String dataType;
            private HeaderBean header;
            private ContentBean content;
            private int count;
            private Object adTrack;
            private Object footer;
            private List<ItemListBean> itemList;


            public HeaderBean getHeader() {
                return header;
            }

            public void setHeader(HeaderBean header) {
                this.header = header;
            }

            public ContentBean getContent() {
                return content;
            }

            public void setContent(ContentBean content) {
                this.content = content;
            }

            public String getDataType() {
                return dataType;
            }

            public void setDataType(String dataType) {
                this.dataType = dataType;
            }


            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public Object getAdTrack() {
                return adTrack;
            }

            public void setAdTrack(Object adTrack) {
                this.adTrack = adTrack;
            }

            public Object getFooter() {
                return footer;
            }

            public void setFooter(Object footer) {
                this.footer = footer;
            }

            public List<ItemListBean> getItemList() {
                return itemList;
            }

            public void setItemList(List<ItemListBean> itemList) {
                this.itemList = itemList;
            }

            public static class ContentBean {
                @Override
                public String toString() {
                    return "ContentBean{" +
                            "type='" + type + '\'' +
                            ", data=" + data +
                            ", trackingData=" + trackingData +
                            ", tag=" + tag +
                            ", id=" + id +
                            ", adIndex=" + adIndex +
                            '}';
                }

                /**
                 * type : ugcPicture
                 * data : {"dataType":"UgcPictureBean","id":837358,"title":"","description":"一方净土","library":"DEFAULT","tags":[{"id":930,"name":"摄影师日常","actionUrl":"eyepetizer://tag/930/?title=%E6%91%84%E5%BD%B1%E5%B8%88%E6%97%A5%E5%B8%B8","adTrack":null,"desc":"透过镜头，我看到了更加真实的世界","bgPicture":"http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":12}],"consumption":{"collectionCount":82,"shareCount":0,"replyCount":0,"realCollectionCount":0},"resourceType":"ugc_picture","uid":303420109,"createTime":1661860116000,"updateTime":1662480277000,"collected":false,"reallyCollected":false,"owner":{"uid":303420109,"nickname":"LC-老丑","avatar":"http://ali-img.kaiyanapp.com/f3ec7a77a0281973b45be72f36033b89.png","userType":"NORMAL","ifPgc":false,"description":"陌上花开，缓缓归矣","area":null,"gender":"male","registDate":1574554082000,"releaseDate":1718094872000,"cover":"http://img.kaiyanapp.com/f9a3fddd3f0941404f4b1d30235c2952.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://pgc/detail/303420109/?title=LC-%E8%80%81%E4%B8%91&userType=NORMAL&tabIndex=0","followed":false,"limitVideoOpen":false,"library":"BLOCK","birthday":820857600000,"country":"中国","city":"广州市","university":"","job":"学生","expert":false},"cover":{"feed":"http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png?imageMogr2/quality/60/format/jpg","detail":"http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png?imageMogr2/quality/60/format/jpg","blurred":null,"sharing":null,"homepage":null},"selectedTime":null,"checkStatus":"CHECKED","area":"","city":"","longitude":0,"latitude":0,"ifMock":false,"validateStatus":"SUBMIT","validateResult":"DEFAULT","width":1080,"height":1440,"addWatermark":true,"recentOnceReply":null,"privateMessageActionUrl":null,"source":"","url":"http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png?imageMogr2/quality/100!/format/jpg","urls":["http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png"],"status":1,"releaseTime":1661860116000,"urlsWithWatermark":["http://img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png"]}
                 * trackingData : null
                 * tag : null
                 * id : 0
                 * adIndex : -1
                 */

                private String type;
                private DataBean data;
                private Object trackingData;
                private Object tag;
                private int id;
                private int adIndex;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public DataBean getData() {
                    return data;
                }

                public void setData(DataBean data) {
                    this.data = data;
                }

                public Object getTrackingData() {
                    return trackingData;
                }

                public void setTrackingData(Object trackingData) {
                    this.trackingData = trackingData;
                }

                public Object getTag() {
                    return tag;
                }

                public void setTag(Object tag) {
                    this.tag = tag;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getAdIndex() {
                    return adIndex;
                }

                public void setAdIndex(int adIndex) {
                    this.adIndex = adIndex;
                }

                public static class DataBean {
                    /**
                     * dataType : UgcPictureBean
                     * id : 837358
                     * title :
                     * description : 一方净土
                     * library : DEFAULT
                     * tags : [{"id":930,"name":"摄影师日常","actionUrl":"eyepetizer://tag/930/?title=%E6%91%84%E5%BD%B1%E5%B8%88%E6%97%A5%E5%B8%B8","adTrack":null,"desc":"透过镜头，我看到了更加真实的世界","bgPicture":"http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg","headerImage":"http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg","tagRecType":"NORMAL","childTagList":null,"childTagIdList":null,"haveReward":false,"ifNewest":false,"newestEndTime":null,"communityIndex":12}]
                     * consumption : {"collectionCount":82,"shareCount":0,"replyCount":0,"realCollectionCount":0}
                     * resourceType : ugc_picture
                     * uid : 303420109
                     * createTime : 1661860116000
                     * updateTime : 1662480277000
                     * collected : false
                     * reallyCollected : false
                     * owner : {"uid":303420109,"nickname":"LC-老丑","avatar":"http://ali-img.kaiyanapp.com/f3ec7a77a0281973b45be72f36033b89.png","userType":"NORMAL","ifPgc":false,"description":"陌上花开，缓缓归矣","area":null,"gender":"male","registDate":1574554082000,"releaseDate":1718094872000,"cover":"http://img.kaiyanapp.com/f9a3fddd3f0941404f4b1d30235c2952.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://pgc/detail/303420109/?title=LC-%E8%80%81%E4%B8%91&userType=NORMAL&tabIndex=0","followed":false,"limitVideoOpen":false,"library":"BLOCK","birthday":820857600000,"country":"中国","city":"广州市","university":"","job":"学生","expert":false}
                     * cover : {"feed":"http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png?imageMogr2/quality/60/format/jpg","detail":"http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png?imageMogr2/quality/60/format/jpg","blurred":null,"sharing":null,"homepage":null}
                     * selectedTime : null
                     * checkStatus : CHECKED
                     * area :
                     * city :
                     * longitude : 0.0
                     * latitude : 0.0
                     * ifMock : false
                     * validateStatus : SUBMIT
                     * validateResult : DEFAULT
                     * width : 1080
                     * height : 1440
                     * addWatermark : true
                     * recentOnceReply : null
                     * privateMessageActionUrl : null
                     * source :
                     * url : http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png?imageMogr2/quality/100!/format/jpg
                     * urls : ["http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png"]
                     * status : 1
                     * releaseTime : 1661860116000
                     * urlsWithWatermark : ["http://img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png"]
                     */

                    private String dataType;
                    private int id;
                    private String title;
                    private String description;
                    private String library;
                    private ConsumptionBean consumption;
                    private String resourceType;
                    private int uid;
                    private long createTime;
                    private long updateTime;
                    private boolean collected;
                    private boolean reallyCollected;
                    private OwnerBean owner;
                    private CoverBean cover;
                    private Object selectedTime;
                    private String checkStatus;
                    private String area;
                    private String city;
                    private double longitude;
                    private double latitude;
                    private boolean ifMock;
                    private String validateStatus;
                    private String validateResult;
                    private int width;
                    private int height;
                    private boolean addWatermark;
                    private Object recentOnceReply;
                    private Object privateMessageActionUrl;
                    private String source;
                    private String url;
                    private String status;

                    private String playUrl;
                    private long releaseTime;
                    private List<TagsBean> tags;
                    private List<String> urls;
                    private List<String> urlsWithWatermark;

                    public String getPlayUrl() {
                        return playUrl;
                    }

                    public void setPlayUrl(String playUrl) {
                        this.playUrl = playUrl;
                    }

                    public String getDataType() {
                        return dataType;
                    }

                    public void setDataType(String dataType) {
                        this.dataType = dataType;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public String getLibrary() {
                        return library;
                    }

                    public void setLibrary(String library) {
                        this.library = library;
                    }

                    public ConsumptionBean getConsumption() {
                        return consumption;
                    }

                    public void setConsumption(ConsumptionBean consumption) {
                        this.consumption = consumption;
                    }

                    public String getResourceType() {
                        return resourceType;
                    }

                    public void setResourceType(String resourceType) {
                        this.resourceType = resourceType;
                    }

                    public int getUid() {
                        return uid;
                    }

                    public void setUid(int uid) {
                        this.uid = uid;
                    }

                    public long getCreateTime() {
                        return createTime;
                    }

                    public void setCreateTime(long createTime) {
                        this.createTime = createTime;
                    }

                    public long getUpdateTime() {
                        return updateTime;
                    }

                    public void setUpdateTime(long updateTime) {
                        this.updateTime = updateTime;
                    }

                    public boolean isCollected() {
                        return collected;
                    }

                    public void setCollected(boolean collected) {
                        this.collected = collected;
                    }

                    public boolean isReallyCollected() {
                        return reallyCollected;
                    }

                    public void setReallyCollected(boolean reallyCollected) {
                        this.reallyCollected = reallyCollected;
                    }

                    public OwnerBean getOwner() {
                        return owner;
                    }

                    public void setOwner(OwnerBean owner) {
                        this.owner = owner;
                    }

                    public CoverBean getCover() {
                        return cover;
                    }

                    public void setCover(CoverBean cover) {
                        this.cover = cover;
                    }

                    public Object getSelectedTime() {
                        return selectedTime;
                    }

                    public void setSelectedTime(Object selectedTime) {
                        this.selectedTime = selectedTime;
                    }

                    public String getCheckStatus() {
                        return checkStatus;
                    }

                    public void setCheckStatus(String checkStatus) {
                        this.checkStatus = checkStatus;
                    }

                    public String getArea() {
                        return area;
                    }

                    public void setArea(String area) {
                        this.area = area;
                    }

                    public String getCity() {
                        return city;
                    }

                    public void setCity(String city) {
                        this.city = city;
                    }

                    public double getLongitude() {
                        return longitude;
                    }

                    public void setLongitude(double longitude) {
                        this.longitude = longitude;
                    }

                    public double getLatitude() {
                        return latitude;
                    }

                    public void setLatitude(double latitude) {
                        this.latitude = latitude;
                    }

                    public boolean isIfMock() {
                        return ifMock;
                    }

                    public void setIfMock(boolean ifMock) {
                        this.ifMock = ifMock;
                    }

                    public String getValidateStatus() {
                        return validateStatus;
                    }

                    public void setValidateStatus(String validateStatus) {
                        this.validateStatus = validateStatus;
                    }

                    public String getValidateResult() {
                        return validateResult;
                    }

                    public void setValidateResult(String validateResult) {
                        this.validateResult = validateResult;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public boolean isAddWatermark() {
                        return addWatermark;
                    }

                    public void setAddWatermark(boolean addWatermark) {
                        this.addWatermark = addWatermark;
                    }

                    public Object getRecentOnceReply() {
                        return recentOnceReply;
                    }

                    public void setRecentOnceReply(Object recentOnceReply) {
                        this.recentOnceReply = recentOnceReply;
                    }

                    public Object getPrivateMessageActionUrl() {
                        return privateMessageActionUrl;
                    }

                    public void setPrivateMessageActionUrl(Object privateMessageActionUrl) {
                        this.privateMessageActionUrl = privateMessageActionUrl;
                    }

                    public String getSource() {
                        return source;
                    }

                    public void setSource(String source) {
                        this.source = source;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public long getReleaseTime() {
                        return releaseTime;
                    }

                    public void setReleaseTime(long releaseTime) {
                        this.releaseTime = releaseTime;
                    }

                    public List<TagsBean> getTags() {
                        return tags;
                    }

                    public void setTags(List<TagsBean> tags) {
                        this.tags = tags;
                    }

                    public List<String> getUrls() {
                        return urls;
                    }

                    public void setUrls(List<String> urls) {
                        this.urls = urls;
                    }

                    public List<String> getUrlsWithWatermark() {
                        return urlsWithWatermark;
                    }

                    public void setUrlsWithWatermark(List<String> urlsWithWatermark) {
                        this.urlsWithWatermark = urlsWithWatermark;
                    }

                    public static class ConsumptionBean {
                        /**
                         * collectionCount : 82
                         * shareCount : 0
                         * replyCount : 0
                         * realCollectionCount : 0
                         */

                        private int collectionCount;
                        private int shareCount;
                        private int replyCount;
                        private int realCollectionCount;

                        public int getCollectionCount() {
                            return collectionCount;
                        }

                        public void setCollectionCount(int collectionCount) {
                            this.collectionCount = collectionCount;
                        }

                        public int getShareCount() {
                            return shareCount;
                        }

                        public void setShareCount(int shareCount) {
                            this.shareCount = shareCount;
                        }

                        public int getReplyCount() {
                            return replyCount;
                        }

                        public void setReplyCount(int replyCount) {
                            this.replyCount = replyCount;
                        }

                        public int getRealCollectionCount() {
                            return realCollectionCount;
                        }

                        public void setRealCollectionCount(int realCollectionCount) {
                            this.realCollectionCount = realCollectionCount;
                        }
                    }

                    public static class OwnerBean {
                        /**
                         * uid : 303420109
                         * nickname : LC-老丑
                         * avatar : http://ali-img.kaiyanapp.com/f3ec7a77a0281973b45be72f36033b89.png
                         * userType : NORMAL
                         * ifPgc : false
                         * description : 陌上花开，缓缓归矣
                         * area : null
                         * gender : male
                         * registDate : 1574554082000
                         * releaseDate : 1718094872000
                         * cover : http://img.kaiyanapp.com/f9a3fddd3f0941404f4b1d30235c2952.png?imageMogr2/quality/60/format/jpg
                         * actionUrl : eyepetizer://pgc/detail/303420109/?title=LC-%E8%80%81%E4%B8%91&userType=NORMAL&tabIndex=0
                         * followed : false
                         * limitVideoOpen : false
                         * library : BLOCK
                         * birthday : 820857600000
                         * country : 中国
                         * city : 广州市
                         * university :
                         * job : 学生
                         * expert : false
                         */

                        private int uid;
                        private String nickname;
                        private String avatar;
                        private String userType;
                        private boolean ifPgc;
                        private String description;
                        private Object area;
                        private String gender;
                        private long registDate;
                        private long releaseDate;
                        private String cover;
                        private String actionUrl;
                        private boolean followed;
                        private boolean limitVideoOpen;
                        private String library;
                        private long birthday;
                        private String country;
                        private String city;
                        private String university;
                        private String job;
                        private boolean expert;

                        public int getUid() {
                            return uid;
                        }

                        public void setUid(int uid) {
                            this.uid = uid;
                        }

                        public String getNickname() {
                            return nickname;
                        }

                        public void setNickname(String nickname) {
                            this.nickname = nickname;
                        }

                        public String getAvatar() {
                            return avatar;
                        }

                        public void setAvatar(String avatar) {
                            this.avatar = avatar;
                        }

                        public String getUserType() {
                            return userType;
                        }

                        public void setUserType(String userType) {
                            this.userType = userType;
                        }

                        public boolean isIfPgc() {
                            return ifPgc;
                        }

                        public void setIfPgc(boolean ifPgc) {
                            this.ifPgc = ifPgc;
                        }

                        public String getDescription() {
                            return description;
                        }

                        public void setDescription(String description) {
                            this.description = description;
                        }

                        public Object getArea() {
                            return area;
                        }

                        public void setArea(Object area) {
                            this.area = area;
                        }

                        public String getGender() {
                            return gender;
                        }

                        public void setGender(String gender) {
                            this.gender = gender;
                        }

                        public long getRegistDate() {
                            return registDate;
                        }

                        public void setRegistDate(long registDate) {
                            this.registDate = registDate;
                        }

                        public long getReleaseDate() {
                            return releaseDate;
                        }

                        public void setReleaseDate(long releaseDate) {
                            this.releaseDate = releaseDate;
                        }

                        public String getCover() {
                            return cover;
                        }

                        public void setCover(String cover) {
                            this.cover = cover;
                        }

                        public String getActionUrl() {
                            return actionUrl;
                        }

                        public void setActionUrl(String actionUrl) {
                            this.actionUrl = actionUrl;
                        }

                        public boolean isFollowed() {
                            return followed;
                        }

                        public void setFollowed(boolean followed) {
                            this.followed = followed;
                        }

                        public boolean isLimitVideoOpen() {
                            return limitVideoOpen;
                        }

                        public void setLimitVideoOpen(boolean limitVideoOpen) {
                            this.limitVideoOpen = limitVideoOpen;
                        }

                        public String getLibrary() {
                            return library;
                        }

                        public void setLibrary(String library) {
                            this.library = library;
                        }

                        public long getBirthday() {
                            return birthday;
                        }

                        public void setBirthday(long birthday) {
                            this.birthday = birthday;
                        }

                        public String getCountry() {
                            return country;
                        }

                        public void setCountry(String country) {
                            this.country = country;
                        }

                        public String getCity() {
                            return city;
                        }

                        public void setCity(String city) {
                            this.city = city;
                        }

                        public String getUniversity() {
                            return university;
                        }

                        public void setUniversity(String university) {
                            this.university = university;
                        }

                        public String getJob() {
                            return job;
                        }

                        public void setJob(String job) {
                            this.job = job;
                        }

                        public boolean isExpert() {
                            return expert;
                        }

                        public void setExpert(boolean expert) {
                            this.expert = expert;
                        }
                    }

                    public static class CoverBean {
                        /**
                         * feed : http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png?imageMogr2/quality/60/format/jpg
                         * detail : http://ali-img.kaiyanapp.com/c41ba8977bbc9f172fb9eb0f360e8aa8.png?imageMogr2/quality/60/format/jpg
                         * blurred : null
                         * sharing : null
                         * homepage : null
                         */

                        private String feed;
                        private String detail;
                        private Object blurred;
                        private Object sharing;
                        private Object homepage;

                        public String getFeed() {
                            return feed;
                        }

                        public void setFeed(String feed) {
                            this.feed = feed;
                        }

                        public String getDetail() {
                            return detail;
                        }

                        public void setDetail(String detail) {
                            this.detail = detail;
                        }

                        public Object getBlurred() {
                            return blurred;
                        }

                        public void setBlurred(Object blurred) {
                            this.blurred = blurred;
                        }

                        public Object getSharing() {
                            return sharing;
                        }

                        public void setSharing(Object sharing) {
                            this.sharing = sharing;
                        }

                        public Object getHomepage() {
                            return homepage;
                        }

                        public void setHomepage(Object homepage) {
                            this.homepage = homepage;
                        }
                    }

                    public static class TagsBean {
                        /**
                         * id : 930
                         * name : 摄影师日常
                         * actionUrl : eyepetizer://tag/930/?title=%E6%91%84%E5%BD%B1%E5%B8%88%E6%97%A5%E5%B8%B8
                         * adTrack : null
                         * desc : 透过镜头，我看到了更加真实的世界
                         * bgPicture : http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg
                         * headerImage : http://img.kaiyanapp.com/586d2cdc4a807eb84bed71fc523ed24b.jpeg?imageMogr2/quality/60/format/jpg
                         * tagRecType : NORMAL
                         * childTagList : null
                         * childTagIdList : null
                         * haveReward : false
                         * ifNewest : false
                         * newestEndTime : null
                         * communityIndex : 12
                         */

                        private int id;
                        private String name;
                        private String actionUrl;
                        private Object adTrack;
                        private String desc;
                        private String bgPicture;
                        private String headerImage;
                        private String tagRecType;
                        private Object childTagList;
                        private Object childTagIdList;
                        private boolean haveReward;
                        private boolean ifNewest;
                        private Object newestEndTime;
                        private int communityIndex;

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public String getName() {
                            return name;
                        }

                        public void setName(String name) {
                            this.name = name;
                        }

                        public String getActionUrl() {
                            return actionUrl;
                        }

                        public void setActionUrl(String actionUrl) {
                            this.actionUrl = actionUrl;
                        }

                        public Object getAdTrack() {
                            return adTrack;
                        }

                        public void setAdTrack(Object adTrack) {
                            this.adTrack = adTrack;
                        }

                        public String getDesc() {
                            return desc;
                        }

                        public void setDesc(String desc) {
                            this.desc = desc;
                        }

                        public String getBgPicture() {
                            return bgPicture;
                        }

                        public void setBgPicture(String bgPicture) {
                            this.bgPicture = bgPicture;
                        }

                        public String getHeaderImage() {
                            return headerImage;
                        }

                        public void setHeaderImage(String headerImage) {
                            this.headerImage = headerImage;
                        }

                        public String getTagRecType() {
                            return tagRecType;
                        }

                        public void setTagRecType(String tagRecType) {
                            this.tagRecType = tagRecType;
                        }

                        public Object getChildTagList() {
                            return childTagList;
                        }

                        public void setChildTagList(Object childTagList) {
                            this.childTagList = childTagList;
                        }

                        public Object getChildTagIdList() {
                            return childTagIdList;
                        }

                        public void setChildTagIdList(Object childTagIdList) {
                            this.childTagIdList = childTagIdList;
                        }

                        public boolean isHaveReward() {
                            return haveReward;
                        }

                        public void setHaveReward(boolean haveReward) {
                            this.haveReward = haveReward;
                        }

                        public boolean isIfNewest() {
                            return ifNewest;
                        }

                        public void setIfNewest(boolean ifNewest) {
                            this.ifNewest = ifNewest;
                        }

                        public Object getNewestEndTime() {
                            return newestEndTime;
                        }

                        public void setNewestEndTime(Object newestEndTime) {
                            this.newestEndTime = newestEndTime;
                        }

                        public int getCommunityIndex() {
                            return communityIndex;
                        }

                        public void setCommunityIndex(int communityIndex) {
                            this.communityIndex = communityIndex;
                        }
                    }
                }
            }

            public static class HeaderBean {

                @Override
                public String toString() {
                    return "HeaderBean{" +
                            "id=" + id +
                            ", actionUrl='" + actionUrl + '\'' +
                            ", labelList=" + labelList +
                            ", icon='" + icon + '\'' +
                            ", iconType='" + iconType + '\'' +
                            ", time=" + time +
                            ", showHateVideo=" + showHateVideo +
                            ", followType='" + followType + '\'' +
                            ", tagId=" + tagId +
                            ", tagName=" + tagName +
                            ", issuerName='" + issuerName + '\'' +
                            ", topShow=" + topShow +
                            '}';
                }

                /**
                 * id : 837358
                 * actionUrl : eyepetizer://pgc/detail/303420109/?title=LC-%E8%80%81%E4%B8%91&userType=NORMAL&tabIndex=0
                 * labelList : null
                 * icon : http://img.kaiyanapp.com/f3ec7a77a0281973b45be72f36033b89.png
                 * iconType : round
                 * time : 1661860116000
                 * showHateVideo : false
                 * followType : user
                 * tagId : 0
                 * tagName : null
                 * issuerName : LC-老丑
                 * topShow : false
                 */

                private int id;
                private String actionUrl;
                private Object labelList;
                private String icon;
                private String iconType;
                private long time;
                private boolean showHateVideo;
                private String followType;
                private int tagId;
                private Object tagName;
                private String issuerName;
                private boolean topShow;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getActionUrl() {
                    return actionUrl;
                }

                public void setActionUrl(String actionUrl) {
                    this.actionUrl = actionUrl;
                }

                public Object getLabelList() {
                    return labelList;
                }

                public void setLabelList(Object labelList) {
                    this.labelList = labelList;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getIconType() {
                    return iconType;
                }

                public void setIconType(String iconType) {
                    this.iconType = iconType;
                }

                public long getTime() {
                    return time;
                }

                public void setTime(long time) {
                    this.time = time;
                }

                public boolean isShowHateVideo() {
                    return showHateVideo;
                }

                public void setShowHateVideo(boolean showHateVideo) {
                    this.showHateVideo = showHateVideo;
                }

                public String getFollowType() {
                    return followType;
                }

                public void setFollowType(String followType) {
                    this.followType = followType;
                }

                public int getTagId() {
                    return tagId;
                }

                public void setTagId(int tagId) {
                    this.tagId = tagId;
                }

                public Object getTagName() {
                    return tagName;
                }

                public void setTagName(Object tagName) {
                    this.tagName = tagName;
                }

                public String getIssuerName() {
                    return issuerName;
                }

                public void setIssuerName(String issuerName) {
                    this.issuerName = issuerName;
                }

                public boolean isTopShow() {
                    return topShow;
                }

                public void setTopShow(boolean topShow) {
                    this.topShow = topShow;
                }
            }

            public static class ItemListBean {
                @Override
                public String toString() {
                    return "ItemListBean{" +
                            "type='" + type + '\'' +
                            ", data=" + data +
                            ", trackingData=" + trackingData +
                            ", tag=" + tag +
                            ", id=" + id +
                            ", adIndex=" + adIndex +
                            '}';
                }

                /**
                 * type : squareCardOfCommunityContent
                 * data : {"dataType":"SquareContentCard","title":"主题创作广场","subTitle":"发布你的作品和日常","bgPicture":"http://img.kaiyanapp.com/04eef7e9f3b14a597bd04a8d81a4c8f3.png?imageMogr2/quality/60/format/jpg","actionUrl":"eyepetizer://community/tagSquare?tabIndex=0"}
                 * trackingData : null
                 * tag : null
                 * id : 0
                 * adIndex : -1
                 */

                private String type;
                private DataBean data;
                private Object trackingData;
                private Object tag;
                private int id;
                private int adIndex;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public DataBean getData() {
                    return data;
                }

                public void setData(DataBean data) {
                    this.data = data;
                }

                public Object getTrackingData() {
                    return trackingData;
                }

                public void setTrackingData(Object trackingData) {
                    this.trackingData = trackingData;
                }

                public Object getTag() {
                    return tag;
                }

                public void setTag(Object tag) {
                    this.tag = tag;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getAdIndex() {
                    return adIndex;
                }

                public void setAdIndex(int adIndex) {
                    this.adIndex = adIndex;
                }

                public static class DataBean {
                    /**
                     * dataType : SquareContentCard
                     * title : 主题创作广场
                     * subTitle : 发布你的作品和日常
                     * bgPicture : http://img.kaiyanapp.com/04eef7e9f3b14a597bd04a8d81a4c8f3.png?imageMogr2/quality/60/format/jpg
                     * actionUrl : eyepetizer://community/tagSquare?tabIndex=0
                     */

                    private String dataType;
                    private String title;
                    private String subTitle;
                    private String bgPicture;
                    private String actionUrl;

                    public String getDataType() {
                        return dataType;
                    }

                    public void setDataType(String dataType) {
                        this.dataType = dataType;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getSubTitle() {
                        return subTitle;
                    }

                    public void setSubTitle(String subTitle) {
                        this.subTitle = subTitle;
                    }

                    public String getBgPicture() {
                        return bgPicture;
                    }

                    public void setBgPicture(String bgPicture) {
                        this.bgPicture = bgPicture;
                    }

                    public String getActionUrl() {
                        return actionUrl;
                    }

                    public void setActionUrl(String actionUrl) {
                        this.actionUrl = actionUrl;
                    }
                }
            }
        }
    }
}
