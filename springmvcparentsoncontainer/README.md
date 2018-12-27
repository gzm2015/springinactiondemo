```
测试spring mvc 父子容器的情况
ContextLoaderListener 是基于ServletContextListener的 会在Servlet初始化之前运行
作用主要是为生成一个ApplicationContext作为父容器 里面主要放一些通用配置 DataSource aop配置等
由于先于DispatcherServlet执行
ApplicationContext容器内的bean先实例化并进行di 
如果将aop放在父容器 同时使用的是DispatcherServlet中的service则会导致aop实例化的时候找不到或者
使用的不是DispatcherServlet中的service 这样aop就会失败


1. 从DispatcherServlet和ContextLoaderListener的初始化过程可以看出，二者分别会生成一个WebApplicationContext，且以不同的attrName注册到web容器中

2. 根据web.xml的加载顺序，listener总是先于servlet进行加载，因此虽然DispatcherServlet和ContextLoaderListener的WebApplicationContext不同，但是ContextLoaderListener的WebApplicationContext总是DispatcherServlet的父ApplicationContext

3. 同一个web容器中，只允许存在一个ContextLoaderListener，但可以存在多个DispatcherServlet

4. 由于二者生成的WebApplicationContext不同，因而这两个WebApplicationContext会分别去加载它们的配置，生成不同的BeanFactory；获取Spring Bean时，会先从DispatcherServlet的WebApplicationContext中查找，若不存在再通过父ApplicationContext，即ContextLoaderListener的WebApplicationContext，进行查找

5. 若二者的配置文件对Bean的定义存在交叉（即二者的配置文件中都定义了相同class且相同beanName的bean），则两个WebApplicationContext中都会保存一份该bean，但实际调用中只会用到DispatcherServlet中的bean，ContextLoaderListener中的bean无法调用到，成为内存泄漏

6. DispatcherServlet除了与ContextLoaderListener一样，会加载用户配置的bean以外，还会自动加载与web mvc相关的spring bean，如RequestMapping、ViewResolver、ExceptionHandler等
```