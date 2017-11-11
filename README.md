spring-session-data-redis
===

### 通过spring-session-data-redis来实现session共享


-  配置2个tomcat , 监听端口分别是8080 【tomcat-1】，8081 【tomcat-2】
-  配置nginx  `参考src/main/resources/nginx/nginx.conf` ，tomcat-1,tomcat-2负载均衡
-  修改 `session-redis.properties` 中的redis配置
-  编译项目 `mvn clean package`
-  **部署项目**
     1. 拷贝 target/test文件夹到 tomcat-1的webapp文件夹下
     2. 拷贝 target/test文件夹到 tomcat-2的webapp文件夹下，修改test\WEB-INF\views\index.jsp ，将其中的 _SERVER-A_ 改为 _SERVER_B_
- **测试**  访问 [localhost/test/login] ,点击submit按钮将跳转到index，然后刷新index页面，将发现在tomcat-1,tomcat-2交替访问，session中的内容可以正常取出。SESSIONID没有改变 。


[localhost/test/login]:http://localhost/test/login
