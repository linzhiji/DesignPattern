# 设计模式代码
[文章地址](https://qu8ngvqvj8.feishu.cn/docs/doccnlSvOmz8BjVfmBmpRV6uBUb)

# 设计模式原则
## 开闭原则（open close principle)
对扩展开放，对修改关闭。在程序扩展的时候，不修改原来代码，而是实现热插拔的效果，比如增加接口
## 里式替换原则（Liskov Substitution principle)
任何基类出现的地方，子类都一定可以出现
## 依赖倒转原则（Dependence Inversion Principle)
这是开闭原则的基础，针对接口编程，依赖于抽象而不是具体
## 接口隔离原创（Inteface Segregation Principle)
使用多个接口相互隔离，而不是一个接口包打天下
## 迪米特法则（最少知道原则）（Demeter Principle)
一个实体类尽量少与其他实体类发送互相作用，使得系统功能相对独立
## 合成复用原则（Composite Reuse Principle)
尽量使用合成/聚合，而不是继承
## 单一职责（Single Responsibility Principle）
是指一个类的功能要单一，不能包罗万象。如同一个人一样，分配的工作不能太多，否则一天到晚虽然忙忙碌碌的，但效率却高不起来具体业务逻辑处理层


# 设计模式分类

## 创建型模式(5种)：
用于描述“怎样创建对象”，它的主要特点是“将对象的创建与使用分离”。
工厂方法、抽象工厂、单例、建造者、原型