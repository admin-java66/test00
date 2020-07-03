<%--
  Created by IntelliJ IDEA.
  User: Windows10
  Date: 2020/7/3
  Time: 13:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script type="application/javascript" src="js/jquery-1.11.1-min.js"></script>
  </head>
  <script type="application/javascript">
      $.ajax({

            url:'${pageContext.request.contextPath}/test',
            data:{id:1,name:'哈哈'},
            type:'post',
            dataType:'json',
            contentType:'application/json',
            success:function (data) {
                alert(data);
            }
      })


  </script>
  <body>

  </body>
</html>
