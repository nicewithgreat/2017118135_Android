# 2017118135_Android
thie repository about Android
-问题1：
当我第一次创建空白的Android工程时候，
提示我ERROR: Unable to tunnel through proxy. Proxy returns "HTTP/1.1 400 Bad Request"

-解决方法：
-Setting->Gradle->Gradle home
 

-问题二
ERROR: Could not GET 'https://dl.google.com/dl/android/maven2/com/android/tools/build/gradle/3.4.2/gradle-3.4.2.pom'. 
Received status code 400 from server: Bad Request
Enable Gradle 'offline mode' and sync project

-解决方法
在build.gradle文件中将
buildscript {
    repositories {
        google()
        jcenter()
    }
}
修改为：
buildscript {
    repositories {
        google()
        jcenter()
        maven {
            url 'http://maven.aliyun.com/nexus/content/groups/public/'
        }
    }
}
将maven url配置为国内可访问的（如果已翻墙可以配置为https://maven.google.com）

2. -Setting->Gradle->Android Studio : 勾选 Enable embedded Maven repository
 
-问题三
Could not GET 'https://dl.google.com/dl/android/maven2/androidx/appcompat/appcompat/1.0.2/appcompat-1.0.2.pom'. 
Received status code 400 from server: Bad Request
Enable Gradle 'offline mode' and sync project
-解决方法
在gradle.properties文件中将
systemProp.https.proxyPort=80
systemProp.http.proxyHost=mirrors.neusoft.edu.cn
systemProp.https.proxyHost=mirrors.neusoft.edu.cn
systemProp.http.proxyPort=80
修改成：
systemProp.https.proxyPort=80
systemProp.http.proxyHost=mirrors.neusoft.edu.cn
#systemProp.https.proxyHost=mirrors.neusoft.edu.cn
#systemProp.http.proxyPort=80

