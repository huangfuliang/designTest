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

















