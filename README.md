****
**_1.`工厂模式`_**  
**_refueltwo001-designpattern01-simplefactorypattern01_**  
`简单工厂模式` 
`简单工厂模式的特点：一个简单的工厂类(com.refueltwo.factory.SimpleFactory)可以创造出不同的实例对象`  
`不需要更改原来的代码`   
[参考网址01](https://blog.csdn.net/u012156116/article/details/80857255)  
[其他参考01](https://segmentfault.com/a/1190000016014855)
[其他参考02](http://c.biancheng.net/view/1348.html)  
**_refueltwo001-designpattern02-factorypattern01_**   
`工厂方法：把创建实例封装起来，创建实例推迟到创建时期，而不是代码编写时期`  
`工厂方法模式的缺点是每增加一个产品类，就需要增加一个对应的工厂类，增加了额外的开发量`  
[参考网址01](https://blog.csdn.net/u012156116/article/details/80857255)  
**_refueltwo001-designpattern03-abstractfactorypattern01_**  
`抽象工厂模式案例说明：user表分别在mysql和oracle数据库，他们的操作对应不同的连接`   
`抽象工厂模式可以和简单工厂模式工厂模式一起使用` 
[参考网址01](https://blog.csdn.net/u012156116/article/details/80857255)  
****  
**_2.`观察者模式`_**     
**_refueltwo002-designpattern01-observerpattern01_**  
`观察者模式`   
`observer：观察者包`   
`observerable:被观察者包`  
`client:为客户端包`  
[参考网址01](https://blog.csdn.net/ma598214297/article/details/80557821)
[参考网址02](https://blog.csdn.net/qq_32175491/article/details/79548644)
[参考网址03](https://www.cnblogs.com/luohanguo/p/7825656.html)
[参考网址04spring事件机制](https://blog.csdn.net/weixin_39035120/article/details/86225377)
****
**_3.`适配器模式`_**  
**_refueltwo003-designpattern01-adapterpattern01_**
`缺省适配器模式(Default Adapter Pattern)`  
`com.refueltwo.adaptee.Adaptee：被适配器类`  
`com.refueltwo.targets.Target:目标接口`  
`com.refueltwo.adapter.Adapter：适配器类`  
`一句话：就是适配器类继承被适配器类在实现目标接口-->实现类的合并增强`  
[参考网址01](https://blog.csdn.net/wwwdc1012/article/details/82780560)
[参考网址02](https://www.cnblogs.com/zhaoxinshanwei/p/8867521.html)  
**_refueltwo003-designpattern01-adapterpattern02_**
`对象适配器模式`  
`被适配器类是适配器类的成员变量`  
[参考网址01](https://blog.csdn.net/wwwdc1012/article/details/82780560)
[参考网址02](https://www.cnblogs.com/zhaoxinshanwei/p/8867521.html)  
**_refueltwo003-designpattern01-adapterpattern03_**
`接口适配器模式`  
`定义： 当不需要全部实现接口提供的方法时，可先设计一个抽象类实现接口，并为该接口中每个方法提供一个默认实现（空方法），`  
`那么该抽象类的子类可有选择地覆盖父类的某些方法来实现需求，它适用于一个接口不想使用其所有的方法的情况。`  
`com.refueltwo.adapter.AnimatorListenerAdapter：接口适配器类（是一个抽象类）`  
[参考网址01](https://blog.csdn.net/wwwdc1012/article/details/82780560)
[参考网址02](https://www.cnblogs.com/zhaoxinshanwei/p/8867521.html) 
****
**_4.`策略模式`_**  
**_refueltwo004-designpattern01-strategypattern01_**  
`com.refueltwo.strategy:所有策略包`  
`com.refueltwo.context：策略模板包`  
`策略模式可以减少ifelse的应用`  
[参考网址01](https://www.runoob.com/design-pattern/strategy-pattern.html)
[参考网址02](https://blog.csdn.net/m0_37602117/article/details/101756303)
[参考网址03](https://blog.csdn.net/zhi_fu/article/details/77688289)
[参考网址04](https://blog.csdn.net/weixin_42669205/article/details/88561734)
[参考网址05](https://www.cnblogs.com/cxyyh/p/10828994.html)  
****
**_5.`命令模式`_**  
**_refueltwo005-designpattern01-commandpattern01_**  
`com.refueltwo.abstractcommand：抽象命令类`
[参考网址01](https://blog.csdn.net/qq_40709468/article/details/82724371)
[参考网址02](https://www.jianshu.com/p/dcca3d559bab)
[参考网址03](https://blog.csdn.net/qq_40709468/article/details/82724371)
