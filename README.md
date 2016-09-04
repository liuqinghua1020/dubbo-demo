这是一个dubbo的demo例子，是三个maven工程，采用了idea进行开发

其中
loginService-interface 是 服务接口的定义
LoginService：是服务提供者的源码
netcaweb： 是服务消费者的代码

需要运行该程序，还需要配置 zookeeper服务器，IP为127.0.0.1 端口为2181.

在导入 LoginService 和 netcaweb之前，需要先将loginService-interface打包并放入到本地的maven仓库使用命令 mvn clean install 即可
LoginService和netcaweb分别使用maven的tomcat插件运行，命令为 mvn clean tomcat7:run
