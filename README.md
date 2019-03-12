## 物流卡片Demo

新版的京东和淘宝有一个交互感觉不错，  
待收货订单会有类似探探那样的卡片效果，  
滑动查看下一条物流的信息，  
近期UI部门说要做这个效果，  
于是我就写了一个Demo，  
现在分享出来和大家交流一下。
  
话不多说，  
看效果：  
![层叠效果](https://img-blog.csdnimg.cn/20190311172038920.gif)

当然，  
既然写了和京东一样的层叠效果，  
那何不顺便多写两个呢？  
  
缩放效果：  
![缩放效果](https://img-blog.csdnimg.cn/20190311172119996.gif)

风车效果：  
![风车效果](https://img-blog.csdnimg.cn/20190311172151865.gif)

经常用淘宝的同学可能发现了，    
最后的这个风车效果和淘宝的很像，  
但是我的效果露出了前后两张卡片的角角，  
这里就给同学们留个彩蛋，  
代码中某处我留下了一个判断，  
用于控制风车效果下是否显示前后两张卡片的角角，  
当关闭的时候，  
就和淘宝的效果一样咯。  
  
关于这三个效果的代码，  
在Demo中CardTransformer.java里。  
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190311184140597.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2JhbWJveV8=,size_16,color_FFFFFF,t_70)
  
从图片中大家也发现了，  
除了这三个切换效果之外，
我还写了三个出场动画效果，  
请大家过目：  
![出场动画](https://img-blog.csdnimg.cn/20190311171958933.gif)

感兴趣的同学把Demo下载下来之后，  
可以打开这个文件看一下。   
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190311174130772.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2JhbWJveV8=,size_16,color_FFFFFF,t_70)

代码很简单，  
注释我也写得很全，  
如果还是有疑问的地方，  
欢迎在文章下评论，  
或者加入QQ讨论群：569614530，  
群里找我，  
我是尘少。  
![扫码加入QQ讨论群](https://img-blog.csdnimg.cn/20190312095824708.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2JhbWJveV8=,size_16,color_FFFFFF,t_70)

本文github链接：  
https://github.com/Bamboy120315/ExpressCard

也可以先下载apk安装体验：
![扫码下载apk](https://img-blog.csdnimg.cn/2019031209591252.jpg?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2JhbWJveV8=,size_16,color_FFFFFF,t_70)
