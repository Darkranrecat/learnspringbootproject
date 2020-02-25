# 社区demo  

## 资料  
[Spring 文档](http://spring.io/guides)  
[Spring web](http://spring.io/guides/gs/serving-web-content/)  
[es](http://elasticsearch.cn/explore)  
[Github deploy key](http://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)  
[Bootstrap](http://v3.bootcss.com/getting-started/)
[Github OAuth](http://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)  
[Spring database](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)  
## 工具  
[Git](http://git-scm.com/download)  
[Visual Paradigm](http://www.visual-paradigm.com)  
## 脚本
```sql
CREATE TABLE USER
(
  ID           INTEGER DEFAULT NEXT VALUE FOR PRIMARY KEY NOT NULL,
  ACCOUNT      VARCHAR(100),
  NAME         VARCHAR(50),
  TOKEN        VARCHAR(36),
  GMT_CREATE   BIGINT,
  GMT_MODIFIED BIGINT
)

```
