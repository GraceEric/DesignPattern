观察者模式：

项目背景需求： Internet气象站项目

1、提供温度/气压、湿度接口
2、测量数据更新时通知给第三方
3、需要设计开发型API，便于其他第三方公司也能接入气象站获取数据

气象站提供：
Class WeatherDate{
 getTemperature();
 getHumidity();
 getPressure();
 dataChange();   //气象站通知
}

通常的设计方案：

公告板:

update();  //直接使用dataChange()的数据
display()

----- frist 版本实现

问题： 没接入一个第三方公司都要改变很多地方，重新编译，无法再运行状态中添加第三方公司；



1、观察者模式类似订牛奶业务

1）奶站 subject
2）用户 Observer

2、Subject: 登记注册、移除和通知  （接口）
3、Observer 接收输入


观察者模式：对象之间多对一依赖的一种设计方案，被依赖的对象为subject，依赖的对象为observer，subject通知Observer变化

----- second 版本实现







