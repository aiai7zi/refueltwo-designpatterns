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
`com.refueltwo.concretecommand：命令包`  
`com.refueltwo.received：命令接受人`  
`com.refueltwo.invoker：命令的真正执行者`  
`命令模式是使一个类的多个方法（操作）分开，减少了依赖 `  
[参考网址01](https://blog.csdn.net/qq_40709468/article/details/82724371)
[参考网址02](https://www.jianshu.com/p/dcca3d559bab)
[参考网址03](https://blog.csdn.net/qq_40709468/article/details/82724371)
[参考网址04](http://c.biancheng.net/view/1380.html)
****
**_6.`装饰模式`_**  
**_refueltwo006-designpattern01-decoratorpattern01_**   
`装饰模式:对已经用实现的方法进行装饰增强`    
[参考网址01](http://c.biancheng.net/view/1366.html)
[参考网址02](https://blog.csdn.net/qq_29130945/article/details/81114052)
****
**_7.`责任链模式`_**  
**_refueltwo007-designpattern01-chainofresponsibilitypattern01_**  
`com.refueltwo.abshandler:抽象处理类`  
[参考网址01](https://blog.csdn.net/u011897062/article/details/89457070)
****
**_8.`状态模式`_**  
**_refueltwo008-designpattern01-statepattern01_**  
`以后再看，就是所有的装都有个实现，环境类执行`  
[参考网址01](https://blog.csdn.net/Peter_Changyb/article/details/82704480)  
[其他参考01](https://blog.csdn.net/WiKi_Su/article/details/80263967)
****
**_9.`中介者模式`_**  
**_refueltwo009-designpattern01-mediatorpattern01_**   
`角色：`  
`com.refueltwo.abstractmediator:抽象的中介者`  
`com.refueltwo.concretemediator:中介者实现`  
`com.refueltwo.abstractcolleague：抽象同事`  
`com.refueltwo.concretecolleague：同事实现`  
[参考网址01](https://blog.csdn.net/wwwdc1012/article/details/83389158)  
****
**_10.`迭代器模式`_**  
**_refueltwo010-designpattern01-iteratorpattern01_**  
`实际运用很少：主要提供容器的顺序访问，ArrayList和HashSet有很好的实现`  
[参考网址01](https://blog.csdn.net/u011889786/article/details/51461307)  
****
**_11.`访问者模式`_**  
**_refueltwo011-designpattern01-visitorpattern01_**  
`访问者模式主要用于程序设计中的开闭原则`  
`扫公园的列子` 
`角色`  
`abstractvisitor：抽象的访问者`  
`abstractelement：抽象的元素`   
`com.refueltwo.objectstructure：对象的结构，主要持有Element的引用`  
`主要注意角色：其他没什么`
****
**_12.`备忘录模式`_**  
**_refueltwo012-designpattern01-mementopattern01_**  
`角色`  
`originator:初始对象`  
`memento :备忘对象`  
`com.refueltwo.caretaker：管理类(保存的对象)`  
`备忘录模式主要是初始对象提供create(创建)Memento和restore(恢复)Memento两个方法，不要再使用的时候备份`  
`管理类中还可以有管理策略`   
****
**_13.`解释器模式`_**  
**_refueltwo013-designpattern01-interpreterpattern01_**  
`读取int的十六进制`  
`解释器模式难：但jdk有好多的实现可用`  
`终结和非终结的实现：但非终结一定调用了终结的interpret()方法`  
[参考网址01](https://blog.csdn.net/u010024991/article/details/53436073)  