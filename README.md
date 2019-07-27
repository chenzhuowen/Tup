# Tup
Tup is a framework that integrates Spring boot and Vue and is managed using maven.

Tup是一个集成Spring boot和Vue的框架，使用maven进行管理。

框架介绍：

前端使用Vue进行开发，作为用户主入口，负责页面渲染并提供良好的用户体验。前端项目中，已集成Router、Vuex、Axios、vue-bus。

后端使用String boot开发，作为服务提供者，开放api供前端调用。后端项目中，提供了一套推荐的项目目录结构和一些简单的服务作为例子参考。


# tup-archetype
tup-archetype是该框架的maven原型工程。

使用它，你可以：

1、快速建起一个前后端分离的可运行的web项目。

2、使用maven命令管理整个项目。直接使用maven命令，即可编译、打包整个工程。

3、针对需要前后端合并部署的场景，提供tup-merger模块，可自动将前后端打包成一个jar、war文件，省去手工合并。


# 环境要求
必须:

maven  node.js  npm java  mysql

可选:

nginx  tomcat

# how to use
1、clone项目到本地

2、在tup-archetype目录下执行命令：

mvn clean install

3、在任意路径新建一个空目录，在空目录内执行命令：

mvn archetype:generate "-DarchetypeGroupId=com.chenzw" "-DarchetypeArtifactId=tup-archetype" "-DarchetypeVersion=1.0.0" "-DgroupId=com.host" "-DartifactId=demo" "-Dversion=1.0.0"

DgroupId、DartifactId、Dversion的值可以自己给定。

命令执行完后，生成frontend、backend、merger目录。front目录为前端工程目录，backend为后端工程目录，merger为合并打包模块。

4、进入到merger目录的target目录中，可以看到工程的合并jar包。

在jar包中找到application.properties文件，修改数据库数据源。

修改完后直接执行jar就可启动应用。

命令：

java -jar jar包名称

