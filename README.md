"# GradleBatchPackage" 

多渠道打包

第一步：添加渠道表示标签

<!-- UMeng 配置-->

<meta-data android:value="${UMENG_CHANNEL_VALUE}" android:name="UMENG_CHANNEL"/>

第二步：添加渠道
productFlavors {
       xiaomi {}
       qihu360 {}
       baidu {}
       wandoujia {}
   }

 productFlavors.all {
     flavor -> flavor.manifestPlaceholders = [UMENG_CHANNEL_VALUE: name]
 }
 
 
