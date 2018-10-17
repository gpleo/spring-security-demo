说明
===================================

简单演示通过Spring Security保护contents内容，Web端的调用是通过Ajax调用API的方式，不使用Session而使用JWT Token。

入口
===================================

ApiLoginJwtDemoApplication

使用
===================================

启动后，通过Postman请求 http://localhost:8080/contents 时，会响应Unauthorized。

使用 http://localhost:8080/accounts/login登录
```
POST http://localhost:8080/accounts/login

{
	"username": "sa",
	"password": "sa"
}

```

登录后获取到JWT Token，该值放到contents请求的Header中可取到内容。

```
Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzYSIsImV4cCI6MTUzOTg0MzUyOX0.0f0h_LyDWWeAGbPpsng3co8DLu4GghABNqv3VVfK2ZKmwya_PMBKLzPLjQ_0ibmHdBwIb-PBT_OJD1WoIZ7cNg
```
