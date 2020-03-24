<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath() %>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<center>
	<font size="7">
	全国疫情情况分析报告<br>
	<table>
  <tr>
    <th>编号</th>
    <th>全国所列省市</th>
  </tr>
<c:forEach var="sss" items="${list}">
  <tr>
  	<td id="cid"></td>
    <td><a onclick="list()">${sss.cname}</a><br>
    </td>
   
  </tr>
</c:forEach>

</table>
</font>
</center>
</body>
<script type="text/javascript">
function list() {
	var cid = $(this).next().val();
		for (var x = 0; x <"${list}".length; x++) {
			
		}

} 
</script>
</html>