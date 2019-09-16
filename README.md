# 2017118135_Android  
thie repository about Android
>JUMP
>>[问题1](#question1) | 
>>[问题2](#question2) | 
>>[问题3](#question3) | 
>>[问题4](#question4) | 
>>[问题5](#question5) |
>>[问题6](#question6)  
>>[相关链接](#RelatedLink)


****
### <span id="question1">-问题一</span>
_当我第一次创建空白的Android工程时候，提示我  
ERROR: Unable to tunnel through proxy. Proxy returns "HTTP/1.1 400 Bad Request"_
  
#### -解决方法：  
-Setting->Gradle->Gradle home  
![my](https://github.com/nicewithgreat/2017118135_Android/blob/master/img/Gradle%20home.png)

**** 
### <span id="question2">-问题二</span> 
_ERROR: Could not GET 'https://dl.google.com/dl/android/maven2/com/android/tools/build/gradle/3.4.2/gradle-3.4.2.pom'. Received status code 400 from server: Bad Request  
Enable Gradle 'offline mode' and sync project_
  
#### -解决方法  
1. 在build.gradle文件中将
```
buildscript {
    repositories {
        google()
        jcenter()
    }
}
```
修改为：
```
buildscript {
    repositories {
        google()
        jcenter()
        maven {
            url 'http://maven.aliyun.com/nexus/content/groups/public/'
        }
    }
}
```
将maven url配置为国内可访问的（如果已翻墙可以配置为https://maven.google.com）  
  
2. -Setting->Gradle->Android Studio : 
  - [x] Enable embedded Maven repository  
![my](https://github.com/nicewithgreat/2017118135_Android/blob/master/img/Enable%20embedded%20Maven%20repository.png)

****
### <span id="question3">-问题三</span>
_Could not GET 'https://dl.google.com/dl/android/maven2/androidx/appcompat/appcompat/1.0.2/appcompat-1.0.2.pom'. Received status code 400 from server: Bad Request  
Enable Gradle 'offline mode' and sync project_
  
#### -解决方法  
在gradle.properties文件中将
```
systemProp.https.proxyPort=80  
systemProp.http.proxyHost=mirrors.neusoft.edu.cn  
systemProp.https.proxyHost=mirrors.neusoft.edu.cn  
systemProp.http.proxyPort=80
```
修改成：
```
systemProp.https.proxyPort=80
systemProp.http.proxyHost=mirrors.neusoft.edu.cn  
#systemProp.https.proxyHost=mirrors.neusoft.edu.cn  
#systemProp.http.proxyPort=80  
```

****
### <span id="question4">-问题四</span>
_创建虚拟设备时候，出现的问题_
![my](https://github.com/nicewithgreat/2017118135_Android/blob/master/img/No%20System%20images%20available.png)
 
#### -解决方案：
由于缺少SDK的部分包，需要安装
-Setting->Android SDK->SDK Tools中，安装Android Emulator

****
### <span id="question5">-问题五</span>
*0:17	Emulator: emulator: ERROR: Not enough space to create userdata partition. Available: 3068.519531 MB at C:\Users\nice_\.android\avd\Nexus_5X_API_24.avd, need 7372.800000 MB.*

_0:17	Emulator: Process finished with exit code 1_

#### -解决方法
由于内存不足
1.	默认的模拟器安装在C盘中,可以打开模拟器管理界面AVD Manager,右键查看(show ondisk)模拟器的安装目录,将模拟器放入空间足够的磁盘中,然后修改路径
2.	为了修改存储位置，需要在windows系统的环境变量中新建一个系统变量，名称为ANDROID_SDK_HOME，值为 .android文件夹的上一级目录
3.	修改你的avd配置文件的路径，打开avd文件夹，找到.ini文件，用记事本打开，将路径修改为你的文件路径

****

### <span id="question6">-问题六</span>
*加载HelloWorld项目出现
Failed to find Build Tools revision 24.0.2
Install Build Tools 24.0.2 and sync project
Upgrade plugin to version 3.4.2 and sync project_

#### -解决方法
项目的指定的版本不是android studio 已经存在的就会出现这个问题  
1.单击文字中的Install Build Tools 24.0.2 and sync project  
2.在build.gradle文件中
```
buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:2.2.0'

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        jcenter()
    }
}
```
改成
```
buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath 'com.android.tools.build:gradle:3.4.2'

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}
```
3.在gradle-wrapper.properties文件中
```
distributionUrl=https\://services.gradle.org/distributions/gradle-2.14.1-all.zip
```
改成
```
distributionUrl=https\://services.gradle.org/distributions/gradle-5.1.1-all.zip
```

****

### <span id="RelatedLink">-相关链接</span>
_android dev 概念 :_ https://www.cnblogs.com/kidsitcn/p/10221028.html
