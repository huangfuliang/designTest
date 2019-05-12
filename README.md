秦小波《设计模式之禅》

1.命令模式
com.design.pattern.command
(1).Receive 接受者角色
(2).Command 命令角色
(3).Invoker 调用者角色

优点
1.类间解耦，可拓展性好

缺点
类太多

可以和责任链模式结合使用，实现命令族解析任务。
结合模版方法模式，可以减少Command子类膨胀



2.责任链模式
com.design.pattern.chain

Handler 抽象处理者
1.定义一个请求的处理方法handlerMessage
2.链的编排方法setNext

优点：
1.请求者不用知道谁处理，解耦，提高灵活性

缺点：
1.性能问题，遍历所有的链
2.调试比较麻烦


策略模式
com.design.pattern.strategy
Context 封装角色
Strategy 策略角色
ConcreteStrategy 具体实现

优点：
1.算法可以自由的切换
2.避免使用多重条件判断
3.拓展性好

缺点
1.类数量多
2.所有的策略类对外暴露(违法LKP)

装饰者模式
com.design.pattern.decoration
1.ConcreteComponent具体构件
2.Decorator 装饰角色
3.ConcreteDecorator 具体的装饰类

优点：
1.装饰类和被装饰类可以独立发展，不会相互耦合。
2.继承的一种替换方式
3.动态的拓展实现类的功能

缺点：
1.多层装饰类比较复杂，调试比较困难


模版方法模式
com.design.pattern.templateMethod
模版方法由多个基本方法组成的
优点：
1.封装不变部门，拓展可变部分
2.提取公共部门代码，便于维护
3.行为由父类控制，子类实现

缺点：
代码阅读困难






















