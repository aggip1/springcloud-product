<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="app" value="${pageContext.request.contextPath}"></c:set>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>

    <link rel="stylesheet" href="${app}/css/bootstrap.min.css">
    <script src="${app}/jquery-3.1.1.min.js"></script>

    <script>

        $(function () {
            $.ajax({
                url: "${pageContext.request.contextPath}/product/list",
                datatype: "json",
                success: function (data) {
                    $.each(data.data, function (index, item2) {
                        $("#d").append("<h3>" + item2.name + "</h3>");
                        $.each(item2.foods, function (index, item) {
                            /* $("#d").append("<><h4>"+item.name+"</h4>"+"价格:"+item.price+item.description+item.icon+"</p>"
                             +"<div><button onclick='test1('"+item.id+"')'>购买</button></div>"

                             );*/
                            $("#d").append("<tr>" +
                                "<th>" + item.name + "</th>" +
                                "<th>" + item.price + "</th>" +
                                "<th>" + item.description + "</th>" +
                                "<th><img  class='img-circle' style=‘width: 140px; height: 140px;’ src='"+item.icon +"'/></th>" +
                                "<th><button onclick=test1('" + item.id + "')>购买</button></th>" +
                                "</tr>");
                        })
                    })
                }

            });
        });

        function test1(id) {
            //获取到当前菜的id 发送ajax请求
            $.ajax({
                url: "${app}/product/requestCart?id=" + id,
                datatype: "json",
                success: function (data) {
                    alert(data);
                }
            });


        }


    </script>

</head>
<body>
<script src="${app}/canvas-nest.min.js"></script>
<canvas height="926" width="1920" style="position: fixed; top: 0px; left: 0px; z-index: -1; opacity: 0.5;"
        id="c_n1"></canvas>
<div id="dd" style="align-content: center"></div>


<div class="row">
    <div class="col-sm-3"></div>
    <div class="col-sm-7">
        <div class="bs-example">
            <table class="table table-bordered table-hover">
                <thead>
                <tr>
                    <th>菜名</th>
                    <th>价格</th>
                    <th>简介</th>
                    <th>图片</th>
                    <th>操作</th>

                </tr>
                </thead>
                <tbody id="d">


                </tbody>
            </table>
            <a href="http://localhost:9002/cart.jsp">查看购物车</a>

        </div>

    </div>
</body>
</html>