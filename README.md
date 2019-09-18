### 步骤一：创建项目
1.参考：http://ityouknow.com/springcloud/2018/07/20/spring-cloud-consul.html

### 步骤二：使用 Feign 消费服务
1.参考：https://www.jianshu.com/p/562045489d9d

### 步骤三：Feign 使用 Hystrix
1. 访问 http://localhost:8505/add ，页面显示：30
2. 关闭所有服务后再访问 http://localhost:8505/add ，页面显示：error
3. 参考：http://blog.didispace.com/springcloud3/

### 注意点
1. 本Feign项目启动时报错：`The bean 'service-producer.FeignClientSpecification', defined in null, could not be registered. A
 bean
 with that name has already been defined in null and overriding is disabled.`，解决：https://www.cnblogs.com/cag2050/p/11539974.html

### 参考
参考资料 | 网址
--- | ---
四：服务消费（LoadBalancerClient、Ribbon、Feign）（4.3使用Feign）| https://www.jianshu.com/p/562045489d9d