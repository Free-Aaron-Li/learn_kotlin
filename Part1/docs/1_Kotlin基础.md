# Kotlin基础

- 简介

主要介绍：

1. 开发环境的搭建
2. Kotlin基本语法

> - Kotlin参考
> - Kotlin源代码网址：https://github.com/JetBrains/kotlin
> - Kotlin官网：https://kotlinlang.org
> - Kotlin官方参考文档：https://kotlinlang.org/docs/reference
> - kotlin标准库：https://kotlinlang.org/api/latest/jvm/stdlib/

## 开发环境搭建

Kotlin依赖于Java虚拟机，需要JDK。

Java程序运行过程大概为：

> Java源文件（*.java）-> 字节码文件（\*.class）-> 可执行程序

其中通过Java编译器javac和Java解释器java进行编译与解释。

Kotlin类似java编译解释过程：

> Kotlin源文件（*.kt）-> 字节码文件（\*Kt.class）-> 可执行程序

这里用到了Kotlin编译器kotlinc和Java解释器（通过java命令解释，但是需要Kotlin运行时库支持才能正常运行）

---

通过上述描述，我们大概知道需要JDK和Kotlin编译器才能运行Kotlin代码。

## Kotlin基本语法

> 练习：[basic.kt](https://github.com/Free-Aaron-Li/learn_kotlin/blob/master/Part1/src/com/basic.kt)

1. 标识符
   > Kotlin语言中标识符的命名规则：
   > > 1. 区分大小写
   > > 2. 首字符可以是下划线或字母，但是不能为数字
   > > 3. 除首字符外其他字符，可以是下划线、字母和数字
   > > 4. 硬关键字（Hard Keywords）不能为标识符，软关键字（Soft Keywords）、修饰符关键字（Modifier Keywords）在它们适用场景外可以作为标识符使用
   > > 5. 特定标识符field和it
   > > > field标识符用于属性访问器中访问属性支持字段；it标识符用于Lambda表达式中，在省略参数列表时作为隐式参数。
   
   **注意**：如果一定要使用关键字作为标识符，需要在关键词两侧添加“\`”符号，例如：\`while\`。
   
   > - 硬关键字：
   > > as,as?,break,class,continue,do,else,false,for,fun,if,in,!in,interface,is,!is,null,object,package,return,super,this,throw,true,try,typealias,val,var,when,while.
   > - 软关键字：
   > > by,catch,constructor,delegate,dynamic,field,file,finally,get,import,init,param,property,receiver,set,setparam,where
   > - 修饰符关键字
   > > abstract,annotation,companion,const,crossinline,data,enum,external,final,infix,inner,internal,lateinit,noinline,open,operator,out,override,private,protected,public,reified,sealed,suspend,tailrec,vararg.

2. 常量和变量
   > 1. 变量，在标识符前加关键字var
   > 2. 只读变量，在标识符前加关键字val
   > 3. 常量，在标识符前加const val
   >
   > 常量和只读变量一旦初始化都不能被修改，二者区别：
   > > 1. val声明的是运行期常量
   > > 2. const val声明的是编译器常量，其只能用于顶层常量或声明对象中的常量声明，而且只能是String类型和基本数据类型
   
   该如何选择使用var还是val？
   
   > 在使用var和val均能满足需求的情况下，原则上优先使用val，val可以确保程序运行过程中不会错误修改变量内容。同时如果声明类型使用val，则可以得到类似于C++中常量指针的效果，其引用的对象不会被修改，但其引用对象的内容可以被修改。

3. 注释
   > 1. 单行注释，//
   > 2. 多行注释，/* ... */

4. 表达式
   > Kotlin在对变量或常量赋值时，采用“冒号+数据类型”的方式：
   > > ```kotlin
   > > val a1:float=0.1f
   > > val a2:int=1
   > > ```
   > >
   > 同时为了代码更加简洁，Kotlin将一些常用语句进行简化，使之成为表达式形式。例如：控制结构表达式、try表达式、函数体等等。

5. 包
   > 为了防止类、接口、枚举、注释和函数等内容命名冲突，Kotlin引入包概念，本质上与C++的命名空间一样。
   >
   > 语法格式：package pkg1[.pkg2[.pkg3...]]
   >
   > 命名规范：全为小写
   
   包引入
   > 为了能够使用包中内容，需要通过import语句，import语句位于package语句之后，所有类的声明之前
   >
   > 语法格式：import pkg1[.pkg2...].(内容名|*)
   > 为了编程规范，建议明确引入特定内容名，而不是采用“包名.\*”方式以通配符将包下所有内容引入。


