装饰者模式:

项目背景: 咖啡亭订单系统项目
需求:
1) 咖啡种类:  Espresso / ShortBlack / LongBlack / Decaf    单品/浓缩/无糖
2) 调料： Milk Soy Chololate

要求：扩展性好、改动方便、维护方便

方案一: 维护量大
    定义抽象类Drink，description，getDescription() cost();
    子类重写cost()
    调料组合: 很多类继承Drink  类爆炸


方案二:  解决类多的爆炸  扩展性差  新功能的引入会影响原有代码


方案三: 装饰者模式  （动态的将新功能附加到对象上。在对象功能拓展方面、它比继承更有弹性）
类似打包快递
主体： 陶瓷 衣服
包装：报纸填充 泡沫塑料 纸板 木板






java 内置装饰者:

InputStream
FileInputStream/StringBufferInputStream/ByteArrayInputStream/FilterInputStream

FilterInputStream
BufferInputStream/DataInputStream/LineNumberInputStream