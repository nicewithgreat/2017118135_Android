# 2017118135_Android
****
服务  
该主页为  
![my](https://github.com/nicewithgreat/2017118135_Android/blob/master/img/service_index.PNG)  
-1
1.单机服务开始后,LOG日志弹出显示  
![my](https://github.com/nicewithgreat/2017118135_Android/blob/master/img/service_start.PNG)  
```
D/MyService: OnCreate executed
D/MyService: onStartCommand executed
```
2.再单机停止服务,LOG日志弹出显示  
![my](https://github.com/nicewithgreat/2017118135_Android/blob/master/img/service_stop.PNG)
```
I/Choreographer: Skipped 59 frames!  The application may be doing too much work on its main thread.
D/MyService: onDestroy executed
```
-2
1.单机服务开始后,LOG日志弹出显示  
![my](https://github.com/nicewithgreat/2017118135_Android/blob/master/img/service_start.PNG)  
```
D/MyService: OnCreate executed
D/MyService: onStartCommand executed
```
2.单机绑定后,LOG日志弹出显示  
![my](https://github.com/nicewithgreat/2017118135_Android/blob/master/img/service_bind.PNG)
```
D/MyService: startDownload executed
    getProgress executed
```
3.单机解除绑定后   
![my](https://github.com/nicewithgreat/2017118135_Android/blob/master/img/service_unbind.PNG)  
4.然后再单机停止服务,LOG日志弹出显示  
![my](https://github.com/nicewithgreat/2017118135_Android/blob/master/img/service_stop.PNG)
```
D/MyService: onDestroy executed
```

