# 2017118135_Android  
thie repository about Android
****
### -问题1：  
_当我第一次创建空白的Android工程时候，提示我  
ERROR: Unable to tunnel through proxy. Proxy returns "HTTP/1.1 400 Bad Request"_
  
#### -解决方法：  
-Setting->Gradle->Gradle home  
![my](https://github.com/nicewithgreat/2017118135_Android/blob/master/img/Gradle%20home.png)

 **** 
### -问题二  
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
### -问题三  
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
