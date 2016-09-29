<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/12
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@page import="com.myigou.nitiy.MessageLei" %>
<%@ page import="java.util.List" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<link href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!-- 可选的Bootstrap主题文件（一般不使用） -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
<!--video-->
<link href="../../css/video-js.css" rel="stylesheet">
<!-- If you'd like tvideo-js.csso support IE8 --><%--<script src="http://vjs.zencdn.net/ie8/1.1.2/videojs-ie8.min.js"></script>--%><%--<script src="http://vjs.zencdn.net/5.11.6/video.js"></script>--%>
<html>
<style type="text/css">
    a:link {
        text-decoration: none;
        color: #000;
    }

    a:visited {
        text-decoration: none;
        color: #000;
    }

    a:hover {
        text-decoration: none;
        color: #FC3;
    }

    a:active {
        text-decoration: none;
    }
</style>
<head>
    <link rel="shortcut icon" href="images/bc.png">
    <title>My易狗</title>
    <style type="text/css">
        .daxiao {
            height: 558px;
            width: 690px;
            padding: 0px;
            margin-right: auto;
            margin-left: auto;
            position: static;
            left: auto;
            top: 5px;
            right: auto;
        }

        .you {
            height: 580px;
            width: 300px;
            border-radius: 5px;
            float: right;
            border: 1px solid #000;
        }

        #ss {
            height: 500px;
            width: 1000px;
            margin-top: 5px;
            position: relative;
            margin-right: auto;
            margin-left: auto;
        }

        .zuo {
            float: left;
            height: 500px;
            width: 690px;
            position: relative;
        }

        .piao {
            z-index: 2;
            position: relative;
            left: 40%;
            top: 0px;
            width: 600px;
            height: 23px;
            margin-right: auto;
            margin-left: auto;
            right: 40%;
            bottom: 0px;
            text-align: center;
            float: left;
        }

        .domw {
            float: right;
            height: 535px;
            width: 334px;
            z-index: 2;
            position: absolute;
            clear: right;
            top: 13px;
            left: 357px;
        }

        .stop {
            float: left;
            height: 535px;
            width: 351px;
            z-index: 2;
            top: 13px;
            position: absolute;
            left: 4px;
        }

        .tishi {
            position: absolute;
            background-color: #F39;
            /*<!--border: 1px solid #000;-->*/
            margin-top: -32px;
            height: 30px;
            width: 0px;
            text-align: center;
            border-radius: 8px;
            background-color: rgba(234, 104, 29, 0.9);
        }

        .fao {
            float: left;
        }

        .zhong {
            width: 1111px;
            margin-right: auto;
            margin-left: auto;
            height: 100%;
            background-color: rgba(255, 255, 255, 0.7); /*background-color: #00F;*/
        }

        .sb {
            clear: none;
            float: none;
        }

        .yuju {
            background-image: url(/img/tu.png);
            background-position: -2px center;
            background-repeat: no-repeat;
        }

        .yuju2 {
            background-image: url(/img/video.png);
            background-position: -2px center;
            background-repeat: no-repeat;
        }

        body {
            margin: 0px;
            padding: 0px;
        }

        .top {
            height: 40px;
            width: 100%;
            background-color: rgba(200, 221, 216, 0.25);
        }

        /*   !* 设置滚动条的样式 *!
        ::-webkit-scrollbar {
           width: 10px;}
           !* 滚动槽 *!
        ::-webkit-scrollbar-track {
           -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
           border-radius: 5px;
        }!* 滚动条滑块 *!
        ::-webkit-scrollbar-thumb {
           border-radius: 5px;
           background: rgba(0,0,0,0.1);
           <!---webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.5);-->
        }*/
        .chen {
            height: 535px;
            width: 300px;
            border-radius: 10px;
            margin-top: 0px;
            margin-right: auto;
            margin-bottom: auto;
            margin-left: auto;
            border-top-width: 1px;
            border-bottom-width: 1px;
            border-top-style: solid;
            border-bottom-style: solid;
            border-top-color: #000;
            border-bottom-color: #000;
        }

        .fanye {
            text-align: center;
        }

        .shuru {
            height: 97%;
            float: left;
            margin-left: 2px;
            margin-top: 1px;
            width: 81%;
            font-family: "微软雅黑";
            font-size: 14px;
        }

        .an {
            height: 100%;
            width: 50px;
        }

        .kuang {
            display: none;
        }

        .shuibian {
            position: absolute;
            z-index: 3;
            left: 706px;
            top: 461px;
            height: 87px;
            width: 282px;
            text-align: right;
            line-height: 30px;
        }

        .liuyank {
            width: 285px;
            border-radius: 5px;
            margin-right: auto;
            margin-left: auto;
            border: 1px solid #C93;
            margin-top: 5px;
            color: #000;
        }

        .kanshi {
            width: 100%;
            overflow: auto;
            height: 100px;
            float: left;
            clear: left;
        }

        #ss .you div {
            font-family: "微软雅黑";
            font-size: 14px;
        }

        #ss .you .chen div {
            color: #000;
        }

        .wank {
            border-radius: 5px;
            padding: 5px;
            border: 1px solid #000;
            height: 592px;
            width: 1010px;
            margin-right: auto;
            margin-left: auto;
            margin-top: 5px;
            background-color: rgba(255, 255, 255, 0.5);
        }

        .topp {
            width: 180px;
            background-color: rgba(255, 255, 255, 0.7);
            float: left;
        }

        .toptext {
            height: 100%;
            line-height: 40px;
            margin-left: 40px;
        }

        .toptext:hover {
            color: #FFF;
            font-size: 24px;
        }

        .sspan {
            color: #FFF;
            font-size: 24px;
        }

        .lou {
            float: right;
            margin-right: 5px
        }

        .sbb {
            font-size: 20px;
            height: 40px;
            line-height: 40px;
            margin-left: 1035px;
            margin-top: -40px;
            width: 76px;
            position: absolute;
            margin-right: auto;
        }

        .sbb:hover {
            font-size: 24px;
        }

        .inputt {
            height: 25px;
            width: 65px;
            line-height: 20px;
            margin-top: -5px;
            text-indent: 25px
        }

        .anniukuang {
            float: right;
        }

        /*图集*/
        .zhongjian {
            height: 550px;
            width: 690px;
            background-color: rgba(166, 219, 241, 0.2);
            position: absolute;
        }

        .topbufeng {
            position: absolute;
            border-radius: 10px;
            height: 65px;
            width: 200px;
            background-color: #9C9;
            margin-left: 230px;
            margin-top: -5px;
            text-indent: 55px;
            line-height: 65px;
            font-size: 36px;
            font-family: "华文彩云";
            top: -2px;
            background-image: url(../../img/231.jpg);
            background-position: -170px -9px;
            opacity: 0.5;
            color: #FFF;
        }

        .picture1 {
            position: absolute;
            width: 160px;
            height: 190px;
            float: right;
            margin-left: 530px;
            margin-top: 0px;
        }

        .tu1 {
            margin-left: 520px;
        }

        .picture2 {
            position: absolute;
            float: right;
            margin-right: 5px;
            margin-top: 98px;
            left: 370px;
            top: -1px;
        }

        .tu2 {
            margin-top: 88px;
            left: 360px;
        }

        .picture3 {
            position: absolute;
            margin-left: 165px;
            margin-top: 135px;
        }

        .tu3 {
            margin-left: 160px;
            margin-top: 128px;
        }

        .picture4 {
            position: absolute;
            margin-left: 370px;
            margin-top: 336px;
        }

        .tu4 {
            margin-left: 360px;
            margin-top: 326px;
        }

        .picture5 {
            position: absolute;
            margin-left: 0px;
            margin-top: 310px;
        }

        .tu5 {
            margin-left: 0px;
            margin-top: 300px;
        }

        .picture6 {
            position: absolute;
            margin-left: 165px;
            margin-top: 440px;
        }

        .tu6 {
            margin-left: 155px;
            margin-top: 430px;
        }

        .picture7 {
            position: absolute;
            margin-left: 0px;
            margin-top: 50px;
            top: -1px;
        }

        .tu7 {
            margin-left: -5px;
            margin-top: 56px;
        }

        .picture8 {
            position: absolute;
            margin-left: 530px;
            margin-top: 105px;
        }

        .tu8 {
            margin-left: 520px;
            margin-top: 95px;
        }

        .picture9 {
            position: absolute;
            margin-left: 0px;
            margin-top: 0px;
        }

        .z {
            z-index: 2;
        }

        /*<!--图集end-->*/
    </style>
</head>
<body>
<div id="Layer1" style="position:absolute; width:100%; height:100%; z-index:-1">
    <img src="http://sc.jb51.net/uploads/allimg/140511/10-140511223ZVX.jpg" height="100%" width="100%"/>
</div>
<div class="top">
    <div class="zhong">
        <div class="topp"><img src="/img/top.png" height="40px">
        </div><!--toptextend-->
        <a href="#" class="toptext"><span>主页</span></a>
        <a href="#" class="toptext"><span>留言板</span></a>
        <a href="${request.contextPath}/games/game.html" class="toptext"><span>小游戏</span></a>
        <div class="sbb">
            <div class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    ${sessionScope.user}
                    <b class="caret"></b></a>
                <ul class="dropdown-menu">
                    <li><a href="#">消息</a></li>
                    <li><a href="#">回复</a></li>
                    <li><a href="${request.contextPath}/Land">退出</a></li>
                    <li class="divider"></li>
                    <li><a href="http://www.baidu.com/s?wd=一个神奇的地方">一个神奇的地方</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>
<div class="wank">
    <div id="ss">
        <div class="zuo">
            <div class="daxiao">
                <div class="sb">
                    <a id="img1" href="JavaScript:xuanze_picture('below')" onClick="pages()" title="上一页">
                        <div class="stop"></div>
                    </a>
                    <img height="550px" width="100%" id="img" src=""/>
                    <a id="img2" href="JavaScript:xuanze_picture('top')" onClick="pages()" title="下一页">
                        <div class="domw"></div>
                    </a></div><!--video-->
                <video id="my-video" class="video-js" controls preload="auto" width="690px" height="550px"
                       poster="MY_VIDEO_POSTER.jpg" data-setup="{}">
                    <source src="http://www.myigou.top/video/002ZR6m1jx06WdBtC1QY05040102qC2B0k02.mp4" type='video/mp4'>
                    <p class="vjs-no-js">
                        你就用这个浏览器有出息吗？
                        <a href="http://videojs.com/html5-video-support/" target="_blank">supports HTML5video</a>
                    </p>
                </video>
                <%--videoend--%><%--图集--%>
                <div class="zhongjian" id="tujiid">
                    <div class="topbufeng">图&nbsp;集</div>
                    <div class="picture1" name="div1"><img name="picture1" width="160px"
                                                           onClick="tuji_index('ServletPm_categoryDaoImp')"
                                                           onMouseMove="pictureS1()"
                                                           onMouseOut="pictureS12()"
                                                           src="../../img/00e93901213fb80e0ee553d034d12f2eb9389484.jpg">
                    </div>
                    <div class="picture2" name="div1"><img name="picture1" width="155px"
                                                           onClick="tuji_index('ServletPm_content_picsDaoImp')"
                                                           onMouseMove="pictureS2()"
                                                           onMouseOut="pictureS22()"
                                                           src="../../img/1ad5ad6eddc451da95aff9cab2fd5266d01632b1.jpg">
                    </div>
                    <div class="picture3" name="div1"><img name="picture1" width="200px"
                                                           onClick="tuji_index('ServletPm_contentDaoImp')"
                                                           onMouseMove="pictureS3()"
                                                           onMouseOut="pictureS32()"
                                                           src="../../img/1e30e924b899a901f79e0e3a1f950a7b0208f517.jpg">
                    </div>
                    <div class="picture4" name="div1"><img name="picture1" width="320px"
                                                           onClick="tuji_index('ServletPm_categoryDaoImpBGURL')"
                                                           onMouseMove="pictureS4()"
                                                           onMouseOut="pictureS42()"
                                                           src="../../img/6c224f4a20a44623dc44f4659a22720e0cf3d72f.jpg">
                    </div>
                    <div class="picture5" name="div1"><img name="picture1" width="160px"
                                                           onClick="tuji_index('ServletPm_content_picsDaoImpBGURL')"
                                                           onMouseMove="pictureS5()"
                                                           onMouseOut="pictureS52()"
                                                           src="../../img/7c1ed21b0ef41bd55bb100fe53da81cb38db3dde.jpg">
                    </div>
                    <div class="picture6" name="div1"><img name="picture1" width="200px" height="110px" onClick=""
                                                           onMouseMove="pictureS6()" onMouseOut="pictureS62()"
                                                           src="../../img/31e652fe2d.jpg"></div>
                    <div class="picture7" name="div1"><img name="picture1" width="160px" height="255px" onClick=""
                                                           onMouseMove="pictureS7()" onMouseOut="pictureS72()"
                                                           src="../../img/79f0f736afc37931180c5620e9c4b74543a91156.jpg">
                    </div>
                    <div class="picture8" name="div1"><img name="picture1" width="160px" height="225px"
                                                           onClick="tuji_index('ServletPm_contentDaoImpBGURL')"
                                                           onMouseMove="pictureS8()" onMouseOut="pictureS82()"
                                                           src="../../img/b03533fa828ba61e0861f2264334970a304e592f.jpg">
                    </div>
                </div>
                <%--图集end--%>
            </div>
            <span id="time">当前${sessionScope.tuid}页 总共${sessionScope.zon}页</span>
            <span class="anniukuang"><input class="inputt yuju2" id="video" type="button" value="视频"
                                            onClick="video_show()">
    <input class="inputt yuju" id="picture" type="button" value="图集" onClick="tuji_show()"></span></div>
        <div class="you"><!--标题-->
            <div align="center">留言板</div><!--标题end-->
            <div class="chen"><!--内容-->
                <div id="topuo" class="liuyank">
                    <div>楼主:</div>
                    <div class="kanshi">&nbsp;&nbsp;谢谢能访问我的页面,我是第一次写自己的页面,没什么经验写的不好献丑了,O(∩_∩)O哈哈~</div>
                    <div align="right"><a href="#" title="回复"><span style="float:left">&nbsp;回复</span></a><a
                            href="#"><span>时间&nbsp;</span></a></div>
                </div><!--内容end -->
                <%
                    List<MessageLei> list = (List<MessageLei>) request.getAttribute("messageLeis");
                    for (int i = 0; i < list.size(); i++) {
                        MessageLei k = list.get(i);
                %>
                <%int r = 34;%><%--<c:forEach var="message" items="#{requestScope.messageLeis}">--%>
                <div class="liuyank">
                    <div>${message.messagename}<%=k.getMessagename()%>:<span class="lou">第<%=i + 1%>楼</span></div>
                    <div class="kanshi">&nbsp;&nbsp;${message.messagecontent}<%=k.getMessagecontent()%></div>
                    <div align="right"><a href="#"><span style="float:left">&nbsp;回复</span></a><span
                            style="color:#000">${message.messagetime}<%=k.getMessagetime()%>&nbsp;</span></div>
                </div><!--内容end --><%--</c:forEach>--%>
                <%}%>
            </div><!--翻页-->
            <div class="fanye">
                <a href="/do/ServletMessageLeiDaoImp?HomePage=HomePage" onClick="MessageBox_show()"><span>首页</span></a>&nbsp;
                <a href="/do/ServletMessageLeiDaoImp?HomePage=topPage"><span>上一页</span></a>
                <a name="dsao" href="/do/ServletMessageLeiDaoImp?HomePage=HomePage"
                   onClick="MessageBox_show()"><span>1</span></a>
                <c:forEach begin="2" end="${requestScope.pages+1}" var="i">
                    <a name="dsao" id="dsao${i}" href="/do/ServletMessageLeiDaoImp?page=${i}&HomePage=yepage"
                       onClick="MessageBox_hidden(this)"><span>${i}</span></a>
                </c:forEach>...
                &nbsp;<a href="/do/ServletMessageLeiDaoImp?HomePage=belowPage"><span>下一页</span></a>
                <a href="/do/ServletMessageLeiDaoImp?page=${requestScope.pages+1}&HomePage=yepage"
                   onClick="moye()"><span>末页</span></a>
                <span>共${requestScope.pages+1}页</span></div><!--翻页end-->
        </div><!--输入-->
        <div class="liuyank shuibian">
            <div>
                <div id="prompt" class="tishi z" onClick="press_prompt()"></div><!--提示文字-->
                <form action="/do/ServletMessageLeiDaoImp?tab=ins&HomePage=HomePage" method="post"
                      onClick="return submi()">
                    <textarea class="shuru" id="for" name="Message"></textarea>
                    <input name="提交" type="submit" class="an" value="留言">
                </form>
            </div>
        </div><!--输入end-->
    </div>
</div>
</body>
<script>
    var bji = null;
    var tis_k = 0;
    $(function () {
        MessageBox_hidden();
        if (1 ==${sessionScope.pag}) {
            MessageBox_show();
        }
        video_hidden();
        //xuanze_picture(null);
        pages_hidden();
        //Maxpicture_show();
        MaxPicture_hidden();//window.setInterval("pages()",100);
    })
    function tuji_index(index) {
        bji = index;
        Maxpicture_show();
        xuanze_picture(null);
        pages();
    }
    function xuanze_picture(stop) {
        $.post("/do/" + bji + "?xuanze=" + stop, function (date) {
            var imgs = document.getElementById("img").attributes.src;
            imgs.nodeValue = date;
        });
    }
    function pages() {
        $.get("/do/" + bji + "?xuanze=time", function (page) {
            document.getElementById("time").innerText = page;
        })
    }
    function submi() {
        tis_k += 5;
        var i = document.getElementById("for").value;
        var prompts = document.getElementById("prompt");
        if (i == "") {
            if (tis_k > 200) {
                return false;
            }
            if (tis_k > 60)
                prompts.innerText = "留点话呗!";
            prompts.style.width = tis_k + "px";
            setTimeout("submi()", 50);
        }
        if (i == "") {
            return false;
        }
        return true;
    }
    function press_prompt() {
        tis_k -= 5;
        var prompts = document.getElementById("prompt");
        if (tis_k < 0) {
            return;
        }
        if (tis_k < 70)
            prompts.innerText = "";
        prompts.style.width = tis_k + "px";
        setTimeout("press_prompt()", 50);
    }

    function MessageBox_hidden() {
        var clss = document.getElementById("topuo");
        clss.className = "kuang liuyank";
    }
    function MessageBox_show() {
        var clss = document.getElementById("topuo");
        clss.className = "liuyank";
    }
    function video_show() {
        MaxPicture_hidden();
        var video = document.getElementById("my-video");
        video.className = "video-js";//play();
        tuji_hidden();
    }
    function MaxPicture_hidden() {
        var img = document.getElementById("img");
        var below = document.getElementById("img1");
        var top = document.getElementById("img2");
        img.className = "kuang";
        below.className = "kuang";
        top.className = "kuang";
    }
    function Maxpicture_show() {<%--显示图片和上下蒙板--%>
        var img = document.getElementById("img");
        var below = document.getElementById("img1");
        var top = document.getElementById("img2");
        img.className = "";
        below.className = "";
        top.className = "";
        video_hidden();
        Pause_video();
        tuji_hidden();
    }
    function video_hidden() {
        var v = document.getElementById("my-video");
        v.className = "kuang";
    }
    function Pause_video() {
        var myVideo = document.getElementById("my-video");
        <%--if (myVideo.paused){myVideo.play();}else{--%>
        myVideo.pause();
        <%--}--%>
    }
    function play_video() {
        var myVideo = document.getElementById("my-video");
        myVideo.play();
    }
    function pages_hidden() {
        var a = document.getElementsByName("dsao");
        if (a.length > 4) {
            for (var i = 0; i < a.length; i++) {
                if (i > 4)a[i].className = "kuang";
            }
        }
    }
    function tuji_show() {
        var tuji = document.getElementById("tujiid");
        tuji.className = "zhongjian";
        video_hidden();
        <%--隐藏视频--%>
        Pause_video();
        <%--停止视频播放--%>
        MaxPicture_hidden();
        <%--隐藏图片框--%>
    }
    function tuji_hidden() {
        var tuji = document.getElementById("tujiid");
        tuji.className = "kuang";
    }
    <%--图集方法--%>
    var divImg = document.getElementsByName("div1");
    var jImg = document.getElementsByName("picture1")
    <!--1-->
    function pictureS1() {
        jImg[0].width = 170;
        divImg[0].className = "picture1 tu1 z";
    }
    function pictureS12() {
        jImg[0].width = 160;
        divImg[0].className = "picture1";
    }
    <!--1end--><!--2-->
    function pictureS2() {
        jImg[1].width = 170;
        divImg[1].className = "picture2 tu2 z";
    }
    function pictureS22() {
        jImg[1].width = 155;
        divImg[1].className = "picture2";
    }
    <!--2end--><!--3-->
    function pictureS3() {
        jImg[2].width = 210;
        divImg[2].className = "picture3 tu3 z";
    }
    function pictureS32() {
        jImg[2].width = 200;
        divImg[2].className = "picture3";
    }
    <!--3end--><!--4-->
    function pictureS4() {
        jImg[3].width = 340;
        divImg[3].className = "picture4 tu4 z";
    }
    function pictureS42() {
        jImg[3].width = 320;
        divImg[3].className = "picture4";
    }
    <!--4end--><!--5-->
    function pictureS5() {
        jImg[4].width = 180;
        divImg[4].className = "picture5 tu5 z";
    }
    function pictureS52() {
        jImg[4].width = 160;
        divImg[4].className = "picture5";
    }
    <!--5end--><!--6-->
    function pictureS6() {
        jImg[5].width = 220;
        jImg[5].height = 120;
        divImg[5].className = "picture6 tu6 z";
    }
    function pictureS62() {
        jImg[5].width = 200;
        jImg[5].height = 110;
        divImg[5].className = "picture6";
    }
    <!--6end--><!--7-->
    function pictureS7() {
        jImg[6].width = 180;
        jImg[6].height = 265;
        divImg[6].className = "picture7 tu7 z";
    }
    function pictureS72() {
        jImg[6].width = 160;
        jImg[6].height = 255;
        divImg[6].className = "picture7";
    }
    <!--7end--><!--8-->
    function pictureS8() {
        jImg[7].width = 180;
        jImg[7].height = 265;
        divImg[7].className = "picture8 tu8 z";
    }
    function pictureS82() {
        jImg[7].width = 160;
        jImg[7].height = 225;
        divImg[7].className = "picture8";
    }
    <!--8end--><%--图集end--%>
</script>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</html>
