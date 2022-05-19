# 软件设计原则
- 开闭原则：对扩展开放，对修改关闭 （热插拔效果）
- 里氏代换原则：子类尽量不要重写父类方法
- 依赖倒转原则 
  - 高层模块不应该依赖底层模块，两者都应该依赖其抽象
  - 抽象不应该依赖细节，细节应该依赖抽象(比如Controller依赖Service接口，而不直接依赖ServiceImpl)
  - 改进前存在问题
    - CPU、内存条、硬盘等不能进行更换，如需更换需要修改Computer类，违背了开闭原则
- 接口隔离原则
  - 客户端不应该被迫依赖于它不使用的方法，一个类对另一个类的依赖应该建立在最小的接口上(案例略)
- 迪米特法则(最小知识原则)
  - Talk only to your immediate friends and not to strangers.
  - 如果两个实体无需直接通信，那么就不应该发生直接的互相调用，可以通过第三方转发该调用(降低类之间的耦合度，提高模块的相对独立性)
  - 迪米特法则中的朋友是指：当前对象本身、当前对象的成员对象、当前对象所创建的对象、当前对象的方法参数等
- 合成复用原则
  - 尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现(案例略)
  

# 创建者模式
- 关注点：`怎样创建对象`
- 特点：`将对象的创建与使用分离`

## 单例设计模式(Singleton Pattern)
- 单例类：只能创建一个实例的类
- 访问类：使用单例类

### 单例模式实现
>单例模式分为两种
> - 饿汉式：类加载就会导致该单实例对象被创建(内存浪费)
> - 懒汉式：类加载不会导致该单实例对象被创建，而是首次使用该对象时才会创建

- 饿汉式-方式1（静态变量方式）
  - `com.ruochen.pattern.singleton.demo1`
- 饿汉式-方式2（静态代码块方式）
  - `com.ruochen.pattern.singleton.demo2`
- 懒汉式-方式1、2（线程不安全、线程安全）
  - `com.ruochen.pattern.singleton.demo3`
- 懒汉式-方式3（双重检查锁）
  - `com.ruochen.pattern.singleton.demo4`
  - 问题：空指针 使用 `volatile`
- 懒汉式-方式4（静态内部类）
  - `com.ruochen.pattern.singleton.demo5`
  - JVM 在加载外部类的过程中，不会加载静态内部类，只有内部类的属性/方法被调用时才会被加载
- 枚举方式(饿汉式-首选)
  - `com.ruochen.pattern.singleton.demo6`
  - 枚举类型线程安全，只会装载一次

### 单例模式存在问题
- 序列化破坏单例模式
  - `com.ruochen.pattern.singleton.demo7`
- 反射破坏单例模式
  - `com.ruochen.pattern.singleton.demo8`
    
### 单例模式案例
- Runtime类
  - `com.ruochen.pattern.singleton.demo9`
  
## 工厂模式
- 优点：解耦

### 简单工厂模式
- 抽象产品：定义了产品的规范，描述了产品的主要特征和功能（coffee类)
- 具体产品：实现或者继承抽象产品的子类（AmericanCoffee类和LatteCoffee类）
- 具体工厂：提供了创建产品的方法，调用者通过该方法来获取产品

