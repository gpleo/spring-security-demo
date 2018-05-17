说明
===================================

简单演示通过Spring Security保护contents内容，Web端的调用是通过Ajax调用API的方式。

入口
===================================

ApiLoginDemoApplication

使用
===================================

启动后，通过Postman请求http://localhost:8080/contents时，会响应Unauthorized，使用http://localhost:8080/accounts/login登录后，再请求则响应Contents。

