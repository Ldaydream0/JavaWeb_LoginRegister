# JavaWeb 用户-登录注册-信息管理项目

## 总述

这个项目使用 JavaWeb 相关的技术，摈弃了 JSP ，使用 HTML 配合 AJAX异步提交方式，完成了与后台的交互，前端界面主要依赖于Bootstrap 3 的前端框架，而后台部分使用的则是 Servlet 以及配合MySQL、Druid、 JDBCTemplate 完成数据的增删改查，对于数据的 json 格式处理 我们选择jackson技术

注意：在项目中UserServlet 继承 自定义BaseServlet 进行了抽取

## 说明

- 项目中使用了过滤器 进行权限的判断，不过由于时间仓促，可以说这部分还是有很大的问题，部署项目在本地后，你需要 使用 账号：admin 密码：admin888，进行管理员登录才可以访问其他页面

- sql 我放在了目录下 message.sql 

- 这个项目使用的是后端分页，admin_list_userInfo前端分页Demo.html 这个页面是应用了一个Boostrap的前端分页插件，仅供参考，可以删掉。

- 这个项目主要点在于 相对完整的用户注册登录功能 以及管理员对于用户信息的后台增删改查功能

- 数据格式校验我们使用了前端的JQuery插件，当然也可以手写

  
## 效果展示


![](https://github.com/ideal-20/JavaWeb_LoginRegister/blob/master/web/img/0.png)

![](https://github.com/ideal-20/JavaWeb_LoginRegister/blob/master/web/img/1.png)

![](https://github.com/ideal-20/JavaWeb_LoginRegister/blob/master/web/img/2.png)

![](https://github.com/ideal-20/JavaWeb_LoginRegister/blob/master/web/img/3.png)

![](https://github.com/ideal-20/JavaWeb_LoginRegister/blob/master/web/img/4.png)


## 结尾

  如果有什么不足，或者错误的地方，欢迎大家留言分享想法，感谢朋友们的支持！

  如果能帮到你的话，那就来关注我吧！如果您更喜欢微信文章的阅读方式，可以关注我的公众号

  > 在这里的我们素不相识，却都在为了自己的梦而努力 ❤
  >
  > 一个坚持推送原创开发技术文章的公众号：理想二旬不止

  ![](http://image.ideal-20.cn/img/QRcode-rectangle.png)

  
