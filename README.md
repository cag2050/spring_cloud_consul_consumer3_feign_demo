### 步骤一：创建项目
1.参考：http://ityouknow.com/springcloud/2018/07/20/spring-cloud-consul.html

### 步骤二：使用 Feign 消费服务
1.参考：https://www.jianshu.com/p/562045489d9d

### 步骤三：Feign 使用 Hystrix
1. 访问 http://localhost:8505/add ，页面显示：30
2. 关闭所有服务后再访问 http://localhost:8505/add ，页面显示：error
3. 参考：http://blog.didispace.com/springcloud3/

### 步骤四：引入 Hystrix Dashboard
1. 引入依赖 spring-boot-starter-actuator、spring-cloud-starter-netflix-hystrix、spring-cloud-starter-netflix-hystrix-dashboard
2. src/main/resources/application.properties 中：1.配置 Actuator 监控；2.注释行`spring.cloud.consul.discovery.register=false
`，让应用注册到 consul
3. 启动类添加注解：@EnableHystrixDashboard
4. 打开 http://localhost:8505/actuator/hystrix.stream ，可以看到一些具体的数据；打开 http://localhost:8505/hystrix ，在界面Hystrix
 Dashboard文字下方输入框输入：http://localhost:8505/actuator/hystrix.stream ，可以看到良好的图形化界面
> 参考：https://www.fangzhipeng.com/springcloud/2018/08/13/sc-f13-turbine.html ，https://github.com/forezp/springcloud-book-greenwich

### 注意点
1. 本Feign项目启动时报错：`The bean 'service-producer.FeignClientSpecification', defined in null, could not be registered. A
 bean
 with that name has already been defined in null and overriding is disabled.`，解决：https://www.cnblogs.com/cag2050/p/11539974.html

### 参考
参考资料 | 网址
--- | ---
四：服务消费（LoadBalancerClient、Ribbon、Feign）（4.3使用Feign）| https://www.jianshu.com/p/562045489d9d
SpringCloud教程第13篇：Turbine(F版本) | https://www.fangzhipeng.com/springcloud/2018/08/13/sc-f13-turbine.html
深入理解SpringCloud与微服务构建（第2版）：第8章 熔断器Hystrix，书籍及源码 | https://github.com/forezp/springcloud-book-greenwich/tree/master/chapter8-8







