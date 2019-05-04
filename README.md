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
2.性能问题，遍历所有的链
3.调试比较麻烦















