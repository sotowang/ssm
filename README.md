 1. 首先浏览器上访问路径 /listCategory
 2. tomcat根据web.xml上的配置信息，拦截到了/listCategory，并将其交由DispatcherServlet处理。
 3. DispatcherServlet 根据springMVC的配置，将这次请求交由CategoryController类进行处理，所以需要进行这个类的实例化
 4. 在实例化CategoryController的时候，注入CategoryServiceImpl。 (自动装配实现了CategoryService接口的的实例，只有CategoryServiceImpl实现了CategoryService接口，所以就会注入CategoryServiceImpl)
 5. 在实例化CategoryServiceImpl的时候，又注入CategoryMapper
 6. 根据ApplicationContext.xml中的配置信息，将CategoryMapper和Category.xml关联起来了。
 7. 这样拿到了实例化好了的CategoryController,并调用listCategory方法
 8. 在listCategory方法中，访问CategoryService,并获取数据，并把数据放在"cs"上，接着服务端跳转到listCategory.jsp去
 9. 最后在listCategory.jsp 中显示数据
 http://stepimagewm.how2j.cn/4518.png
 
 
 