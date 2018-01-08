单例模式: 确保一个类只有一个对象，并提供一个全局访问点

一、解决的问题或者使用场景
1）有些对象我们只要一个：如线程池、缓存。。。
2）多个实例会造成冲突、结果不一致等问题
3）是否可以用静态变量来实现？
4）程序员之间协商个全局变量



构造函数私有化；（保证外部无法用new创建对象）
提供一个static修饰的访问点

项目背景： 一个简单的巧克力生产工厂

first: 非单例实现

second： 实现单例

third:  多线程优化

synchronized：同步锁

1、方案一：完全解决了多线程下new多个实例     缺点：消耗资源   懒汉式   ChocolateFactory.class
    public static synchronized ChocolateFactory getInstance() {
        if(uniqeInstance == null) {
            uniqeInstance = new ChocolateFactory();
        }
        return uniqeInstance;
    }


2、急切创建实例   饿汉模式  弥补了同步锁耗资源的问题  缺点:耗内存  ChocolateFactoryHungry.class

3、双重检查加锁发法  volatilev  推荐   ChocolateFactoryCheck.class