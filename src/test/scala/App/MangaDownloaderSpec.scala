//package mangaDownloader
//
//import org.scalatest.FunSuite
//
//class MangaDownloaderSpec extends FunSuite {
//
//  val firstChapterHtml =
//  """
//    |<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr" lang="en" xml:lang="en">
//    |<head>
//    |<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
//    |<meta name="description" content="Bleach 1 - Read Bleach 1 Manga Scans Page 1. Free and No Registration required for Bleach 1" />
//    |<meta name="keywords" content="bleach 1,bleach chapter 1,bleach,bleach manga,bleach 1 page 1" />
//    |<title>Bleach 1 - Read Bleach 1 Online - Page 1</title>
//    |<link rel="preconnect" href="//s6.mangareader.net" crossorigin="" />
//    |<!--[if lte IE 7]>
//    |        <link rel="stylesheet" type="text/css" href="/styles/ie.css">
//    |<![endif]-->
//    |<link rel="shortcut icon" href="https://s2.mangareader.net/favicon.ico" />
//    |<link href="https://s1.mangareader.net/sup/styles/1347525063_580ff37dbe39c01cb40a69409cfc2cde.css" rel="stylesheet" type="text/css" />
//    |<style type="text/css">
//    |
//    |	.content-r-ad,
//    |	.content-l-ad{
//    |		width: 160px;
//    |		height: auto;
//    |		float: right;
//    |		overflow: hidden;
//    |	}
//    |	.content-r-ad{float: left;}
//    |	@media all and (max-width: 1200px) {
//    |		.content-r-ad,
//    |		.content-l-ad{
//    |			display: none;
//    |		}
//    |	}
//    |	.episode-table{
//    |		width: 100%;
//    |	}
//    |	.episode-table tr td{
//    |		padding: 10px;
//    |		vertical-align:top
//    |	}
//    |</style>
//    |<script type="text/javascript">
//    |(function() {
//    |var s = document.createElement('script'); s.type = 'text/javascript'; s.async = true;
//    |s.src = 'https://s1.mangareader.net/sup/js/1347525063_051de8e9187f0fb581c3feb618897b0d.js';
//    |var x = document.getElementsByTagName('script')[0];
//    |x.parentNode.insertBefore(s, x);
//    |})();
//    |</script>
//    |<script type="text/javascript">
//    |
//    |(function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
//    |(i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
//    |m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
//    |})(window,document,'script','//www.google-analytics.com/analytics.js','ga');
//    |ga('create', 'UA-75338985-1', 'auto');
//    |ga('send', 'pageview');
//    |</script>
//    |<script type="text/javascript">
//    |    document['mangaid'] = 94;
//    |    document['chapterno'] = 1;
//    |    document['nl'] = '/bleach/1/2';
//    |    document['pl'] = '';
//    |    document['pu'] = 'https://i5.mangareader.net/bleach/1/bleach-1585769.jpg';
//    |
//    |function omvKeyPressed(e) {
//    |    var keyCode = 0;
//    |    if (navigator.appName == "Microsoft Internet Explorer") {
//    |        if (!e) {
//    |            var e = window.event;
//    |        }
//    |        if (e.keyCode) {
//    |            keyCode = e.keyCode;
//    |            if ((keyCode == 37) || (keyCode == 39)) {
//    |                window.event.keyCode = 0;
//    |            }
//    |        } else {
//    |            keyCode = e.which;
//    |        }
//    |    } else {
//    |        if (e.which) {
//    |            keyCode = e.which;
//    |        } else {
//    |            keyCode = e.keyCode;
//    |        }
//    |    }
//    |    switch (keyCode) {                        case 39:
//    |            window.location = "/bleach/1/2";
//    |            return false;
//    |
//    |        default:
//    |            return true;
//    |    }
//    |}
//    |document.onkeydown = omvKeyPressed;</script>
//    |</head>
//    |<body>
//    |<div id="container">
//    |<div id="wrapper_header">
//    |<div class="top">
//    |<div class="logo"><a href="/"></a>
//    |<div id="logoimg"></div>
//    |</div>
//    |<div id="top_navigation">
//    |<ul>
//    |<li class="topnav-first topnav-current"><a href="/"><span>Home</span></a></li>
//    |<li><a href="/search"><span>Advanced Search</span></a></li>
//    |<li><a href="/popular"><span>Popular Manga</span></a></li>
//    |<li><a href="/alphabetical"><span>A-Z List</span></a></li>
//    |<li><a href="https://eroges.com" alt="Hentai Games" target="_blank">Hentai Games</a><span class="c1">HOT</span></li>
//    |<li class="topnav-last"><a href="/latest"><span>Latest</span></a></li>
//    |</ul>
//    |</div>
//    |<div id="sec_navigation">
//    |<ul>
//    |<li class="aftersearch"><input type="text" id="searchbox" /></li>
//    |<li class="secnav"><a rel="nofollow" href="/random">Surprise Me!</a></li>
//    |<li class="secnav"><a href="http://www.animefreak.tv" target="_blank" title="Anime">Anime</a></li>
//    |<li class="secnav-last"><a href="mailto:&#105;&#110;&#102;&#111;&#064;&#109;&#097;&#110;&#103;&#097;&#114;&#101;&#097;&#100;&#101;&#114;&#046;&#110;&#101;&#116;" title="Contact">Contact Us</a></li>
//    |</ul>
//    |</div>
//    |</div>
//    |<div class="clear"></div>
//    |</div>
//    |<div id="adtop">
//    |<script type="text/javascript">
//    |  if(!window.BB_a) { BB_a = [];} if(!window.BB_ind) { BB_ind = 0; } if(!window.BB_vrsa) { BB_vrsa = 'v3'; }if(!window.BB_r) { BB_r = Math.floor(Math.random()*1000000000)} BB_ind++; BB_a.push({ "pl" : 42258, "index": BB_ind});
//    |</script>
//    |<script type="text/javascript">
//    |  document.write('<scr'+'ipt async id="BB_SLOT_'+BB_r+'_'+BB_ind+'" src="//st.bebi.com/bebi_'+BB_vrsa+'.js"></scr'+'ipt>');
//    |</script>
//    |</div>
//    |<div id="topchapter">
//    |<div id="mangainfo">
//    |<div class="c3">
//    |<h1>Bleach 1</h1>
//    |<span class='c2'>Page 1&nbsp;-&nbsp;</span></div>
//    |<div class="c3">
//    |<h2 class="c4"><a href="/bleach" title="Bleach Manga">Bleach Manga</a></h2>
//    |</div>
//    |<div class="clear"></div>
//    |</div>
//    |<div id="selectmanga"><select id="chapterMenu" name="chapterMenu"></select></div>
//    |<div id="navi">
//    |<div class="prevnext"><span class="prev"><a href="">Previous</a></span> <span class="next"><a href="/bleach/1/2">Next</a></span></div>
//    |<div id="selectpage"><select id="pageMenu" name="pageMenu"><option value="/bleach/1" selected="selected">1</option>
//    |<option value="/bleach/1/2">2</option>
//    |<option value="/bleach/1/3">3</option>
//    |<option value="/bleach/1/4">4</option>
//    |<option value="/bleach/1/5">5</option>
//    |<option value="/bleach/1/6">6</option>
//    |<option value="/bleach/1/7">7</option>
//    |<option value="/bleach/1/8">8</option>
//    |<option value="/bleach/1/9">9</option>
//    |<option value="/bleach/1/10">10</option>
//    |<option value="/bleach/1/11">11</option>
//    |<option value="/bleach/1/12">12</option>
//    |<option value="/bleach/1/13">13</option>
//    |<option value="/bleach/1/14">14</option>
//    |<option value="/bleach/1/15">15</option>
//    |<option value="/bleach/1/16">16</option>
//    |<option value="/bleach/1/17">17</option>
//    |<option value="/bleach/1/18">18</option>
//    |<option value="/bleach/1/19">19</option>
//    |<option value="/bleach/1/20">20</option>
//    |<option value="/bleach/1/21">21</option>
//    |<option value="/bleach/1/22">22</option>
//    |<option value="/bleach/1/23">23</option>
//    |<option value="/bleach/1/24">24</option>
//    |<option value="/bleach/1/25">25</option>
//    |<option value="/bleach/1/26">26</option>
//    |<option value="/bleach/1/27">27</option>
//    |<option value="/bleach/1/28">28</option>
//    |<option value="/bleach/1/29">29</option>
//    |<option value="/bleach/1/30">30</option>
//    |<option value="/bleach/1/31">31</option>
//    |<option value="/bleach/1/32">32</option>
//    |<option value="/bleach/1/33">33</option>
//    |<option value="/bleach/1/34">34</option>
//    |<option value="/bleach/1/35">35</option>
//    |<option value="/bleach/1/36">36</option>
//    |<option value="/bleach/1/37">37</option>
//    |<option value="/bleach/1/38">38</option>
//    |<option value="/bleach/1/39">39</option>
//    |<option value="/bleach/1/40">40</option>
//    |<option value="/bleach/1/41">41</option>
//    |<option value="/bleach/1/42">42</option>
//    |<option value="/bleach/1/43">43</option>
//    |<option value="/bleach/1/44">44</option>
//    |<option value="/bleach/1/45">45</option>
//    |<option value="/bleach/1/46">46</option>
//    |<option value="/bleach/1/47">47</option>
//    |<option value="/bleach/1/48">48</option>
//    |<option value="/bleach/1/49">49</option>
//    |<option value="/bleach/1/50">50</option>
//    |<option value="/bleach/1/51">51</option>
//    |<option value="/bleach/1/52">52</option>
//    |<option value="/bleach/1/53">53</option>
//    |<option value="/bleach/1/54">54</option>
//    |<option value="/bleach/1/55">55</option>
//    |<option value="/bleach/1/56">56</option>
//    |<option value="/bleach/1/57">57</option>
//    |</select> of 57</div>
//    |</div>
//    |<div class="c5"></div>
//    |</div>
//    |<table class="episode-table">
//    |<tr>
//    |<td>
//    |<div class="content-l-ad">
//    |<script type="text/javascript">
//    |  if(!window.BB_a) { BB_a = [];} if(!window.BB_ind) { BB_ind = 0; } if(!window.BB_vrsa) { BB_vrsa = 'v3'; }if(!window.BB_r) { BB_r = Math.floor(Math.random()*1000000000)} BB_ind++; BB_a.push({ "pl" : 42254, "index": BB_ind});
//    |</script>
//    |<script type="text/javascript">
//    |  document.write('<scr'+'ipt async id="BB_SLOT_'+BB_r+'_'+BB_ind+'" src="//st.bebi.com/bebi_'+BB_vrsa+'.js"></scr'+'ipt>');
//    |</script>
//    |</div>
//    |</td>
//    |<td width="100">
//    |<div id="imgholder"><a href="/bleach/1/2"><img id="img" width="800" height="1254" src="https://i7.mangareader.net/bleach/1/bleach-1585768.jpg" alt="Bleach 1 - Page 1" /></a> </div>
//    |</td>
//    |<td>
//    |<div class="content-r-ad">
//    |<script type="text/javascript">
//    |  if(!window.BB_a) { BB_a = [];} if(!window.BB_ind) { BB_ind = 0; } if(!window.BB_vrsa) { BB_vrsa = 'v3'; }if(!window.BB_r) { BB_r = Math.floor(Math.random()*1000000000)} BB_ind++; BB_a.push({ "pl" : 42255, "index": BB_ind});
//    |</script>
//    |<script type="text/javascript">
//    |  document.write('<scr'+'ipt async id="BB_SLOT_'+BB_r+'_'+BB_ind+'" src="//st.bebi.com/bebi_'+BB_vrsa+'.js"></scr'+'ipt>');
//    |</script>
//    |</div>
//    |</td>
//    |</tr>
//    |</table>
//    |<div id="bottomchapter">
//    |<div class="note">
//    |<p><b>Tip</b>: Click on the Bleach 1 manga image to go to the next page. You can use left and right keyboard keys to browse between pages.</p>
//    |<div class="shortcutkeys"></div>
//    |<div class="clear"></div>
//    |</div>
//    |<div id="mangainfofooter">
//    |<div class="prevnext"><span class="prev"><a href="">Previous</a></span> <span class="next"><a href="/bleach/1/2">Next</a></span></div>
//    |<div id="mangainfo_bas"><span class="chapternav">Bleach 1 Chapter Navigation:</span><br />
//    |<table class="c7"><tr>
//    |<td class="c6"><span class="chapternav_next">Next Chapter:</span></td>
//    |<td><a href="/bleach/2">Bleach 2</a>: Starter</td>
//    |</tr>
//    |</table>
//    |</div>
//    |<h2>Bleach 1 - Read Bleach Chapter 1</h2>
//    |<div id="mangainfo_son"><strong>Bleach 1</strong> <b>released!</b> You are now reading <a href="/bleach/1"><strong>Bleach 1</strong></a> online. If you are bored from <strong>Bleach</strong> manga, you can try surprise me link at top of page or select another manga like Bleach 1 from our huge <a href="/alphabetical">manga list</a>.<br />
//    |Bleach 1 released in manga panda fastest, recommend your friends to read <strong>Bleach 1</strong> now!<br />
//    |Best regards; <a href="/">mangareader</a>: #1 resource for <a href="/bleach"><strong>Bleach</strong></a> Scans Online.</div>
//    |Tags: read Bleach 1 english, Bleach 1 raw manga, Bleach 1 online, Bleach 1 chap, Bleach 1 chapter, Bleach 1 high quality, Bleach 1 manga scan</div>
//    |<div id="related">
//    |<h3>Bleach 1 Manga Relations</h3>
//    |<div id="related_inner"><span style="font-size:100%"><a href="https://www.mangareader.net/tate-no-yuusha-no-nariagari/57">Tate no Yuusha no Nariagari 57</a></span> <span style="font-size:100%"><a href="https://www.mangareader.net/l-dk/51">L-DK 51</a></span> <span style="font-size:108%"><a href="https://www.mangareader.net/sekirei">Sekirei</a></span> <span style="font-size:100%"><a href="https://www.mangareader.net/barajou-no-kiss">Barajou no Kiss</a></span> <span style="font-size:123.1%"><a href="https://www.mangareader.net/dengeki-daisy/75">Dengeki Daisy 75</a></span> <span style="font-size:93%"><a href="https://www.mangareader.net/yamada-kun-to-7-nin-no-majo">Yamada-kun to 7-nin no Majo Manga</a></span> <span style="font-size:108%"><a href="https://www.mangareader.net/hinomaru-zumou/248">Hinomaru Zumou 248</a></span> <span style="font-size:116%"><a href="https://www.mangareader.net/kuroshitsuji">Kuroshitsuji</a></span> <span style="font-size:123.1%"><a href="https://www.mangareader.net/rockin-heaven">Rockin Heaven</a></span> <span style="font-size:100%"><a href="https://www.mangareader.net/berserk/359">Berserk 359</a></span> <span style="font-size:108%"><a href="https://www.mangareader.net/103/one-piece.html">One Piece Manga</a></span> <span style="font-size:116%"><a href="https://www.mangareader.net/135/fairy-tail.html">Fairy Tail</a></span> <div class="clear"></div>
//    |</div>
//    |</div>
//    |</div>
//    |<div id="prefetchimg"></div>
//    |
//    |<script type="text/javascript">
//    |var images = [
//    |   'https://s1.mangareader.net/images/MR500_1.jpg',
//    |   'https://s1.mangareader.net/images/MR500_2.jpg'
//    |];
//    |if(document['mangaid'] && document['chapterno'])
//    |{
//    |var parts = window.location.pathname.split('/');
//    |if(parts.length === 4 && parts[parts.length-1] === '4')
//    |{
//    |document.querySelector('#imgholder a').style.display = 'none';
//    |var img = new Image();
//    |img.src = images[Math.floor(Math.random()*images.length)];
//    |img.style = 'cursor:pointer';
//    |img.width = 800;
//    |img.id = 'erogesimg778'
//    |img.onclick = function(){
//    |document.querySelector("#erogesimg778").parentNode.removeChild(document.querySelector("#erogesimg778"));
//    |document.querySelector('#imgholder a').style.display = 'block';
//    |};
//    |document.querySelector('#imgholder').appendChild(img);
//    |}
//    |}
//    |</script>
//    |<div class="clear"></div>
//    |<div id="adfooter">
//    |<div id="adbottomleft" name="adbottomleft">
//    |<script type="text/javascript">
//    |  if(!window.BB_a) { BB_a = [];} if(!window.BB_ind) { BB_ind = 0; } if(!window.BB_vrsa) { BB_vrsa = 'v3'; }if(!window.BB_r) { BB_r = Math.floor(Math.random()*1000000000)} BB_ind++; BB_a.push({ "pl" : 42259, "index": BB_ind});
//    |</script>
//    |<script type="text/javascript">
//    |  document.write('<scr'+'ipt async id="BB_SLOT_'+BB_r+'_'+BB_ind+'" src="//st.bebi.com/bebi_'+BB_vrsa+'.js"></scr'+'ipt>');
//    |</script>
//    |</div>
//    |<div id="adbottomright" name="adbottomright">
//    |<script type="text/javascript">
//    |  if(!window.BB_a) { BB_a = [];} if(!window.BB_ind) { BB_ind = 0; } if(!window.BB_vrsa) { BB_vrsa = 'v3'; }if(!window.BB_r) { BB_r = Math.floor(Math.random()*1000000000)} BB_ind++; BB_a.push({ "pl" : 42260, "index": BB_ind});
//    |</script>
//    |<script type="text/javascript">
//    |  document.write('<scr'+'ipt async id="BB_SLOT_'+BB_r+'_'+BB_ind+'" src="//st.bebi.com/bebi_'+BB_vrsa+'.js"></scr'+'ipt>');
//    |</script>
//    |</div>
//    |</div>
//    |<div id="wrapper_footer">
//    |<table cellspacing="0">
//    |<tbody>
//    |<tr>
//    |<td class="footer-column bold c8" align="left" valign="top">2016 AFTV Network</td>
//    |<td class="footer-column" valign="top" width="20%">
//    |<ul>
//    |<li><b>Network</b></li>
//    |<li><a href="http://www.animefreak.tv" target="_blank">Anime</a></li>
//    |<li><a href="http://www.animepremium.net" target="_blank">Anime Downloads</a></li>
//    |<li><a href="/">Manga</a></li>
//    |<li><a href="/privacy">Privacy Statements</a></li>
//    |</ul>
//    |</td>
//    |<td class="footer-column" align="left" valign="top" width="20%">
//    |<ul>
//    |<li><b>Partners</b></li>
//    |<li><a href="http://www.upload2.com" target="_blank">Free File Hosting</a></li>
//    |<li><a href="http://www.watchcartoons.com" target="_blank">Watch Cartoons Online</a></li>
//    |<li><a href="http://www.animemobile.com/MangaApp/" target="_blank">Android Manga App</a></li>
//    |<li><a href="http://www.animemobile.com/apk/" target="_blank">Android Anime App</a></li>
//    |<li><a href="https://www.memecenter.com" target="_blank">Memes</a></li>
//    |</ul>
//    |</td>
//    |<td class="footer-column" align="left" valign="top" width="1%"></td>
//    |</tr>
//    |</tbody>
//    |</table>
//    |</div>
//    |</div>
//    |
//    |<script type="text/javascript" src="//ad.mangareader.net/js/ads.js"></script>
//    |{comment}
//    |<script language="JavaScript" type="text/javascript">
//    |        var bebi_acc = '1';
//    |        var bebi_campaign = '150';
//    |    </script>
//    |    <script type="text/javascript" src="https://srv.aftv-serving.bid/public/js/aftv_v1.js"></script>
//    |<script language="JavaScript" type="text/javascript">
//    |        var bebi_acc = '1';
//    |        var bebi_campaign = '180';
//    |    </script>
//    |    <script type="text/javascript" src="https://srv.aftv-serving.bid/public/js/aftv_v1.js"></script>
//    |</body>
//    |</html>
//  """.stripMargin
//  test("empty list returns 0") {
//      assert(Cafex.totalBillWithServiceCharge(List()) == 0)
//  }
//
//}
////  test("non existent food returns 0") {
////    assert(Cafex.totalBillWithServiceCharge(List("dummy")) == 0)
////  }
////
////  test("filters bad values correctly") {
////    val orders = List("Cola", "Coffee", "Cheese Sandwich", "dummy", "Coffee2")
////    assert(Cafex.totalBillWithServiceCharge(orders) == 3.85)
////  }
////
////  test("only drinks, no charge") {
////    assert(Cafex.totalBillWithServiceCharge(List("Cola", "Coffee")) == 1.5)
////  }
////
////  test("cold food adds 10 pct") {
////    assert(Cafex.totalBillWithServiceCharge(List("Cheese Sandwich")) == 2.2)
////  }
////
////  test("hot food adds 20 pct") {
////    assert(Cafex.totalBillWithServiceCharge(List("Steak Sandwich")) == 5.4)
////  }
////
////  test("no more than 20 units to be added as service charge") {
////    val longList = List.fill(100)("Steak Sandwich")
////    assert(Cafex.totalBillWithServiceCharge(longList) == 470)
////  }
////}
