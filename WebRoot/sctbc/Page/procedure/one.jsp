<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="<%=path%>/sctbc/stepBar/css/control.css"
	type="text/css" />
  </head>
  
  <body>
    <div id="stepBar" class="ui-stepBar-wrap">
								<div class="ui-stepBar">
									<div class="ui-stepProcess"></div>
								</div>
								<div class="ui-stepInfo-wrap">
									<table class="ui-stepLayout" border="0" cellpadding="0"
										cellspacing="0">
										<tr id="lc_tr">
											<td class="ui-stepInfo"><a class="ui-stepSequence">1</a>
												<p class="ui-stepName">开始</p></td>
												<c:forEach items="${Oneprocedure }" var="Oneprocedure" begin="1" varStatus="count">
											<td class="ui-stepInfo"><a class="ui-stepSequence">${count.count+1}</a>
												<p class="ui-stepName">${Oneprocedure.name }</p></td>
												</c:forEach>
											<td class="ui-stepInfo"><a class="ui-stepSequence" id="lc_end_num"></a>
												<p class="ui-stepName">结束</p></td>
										</tr>
									</table>
								</div>
							</div>
  </body>
  	<script src="<%=path%>/sctbc/assets/js/jquery-1.8.3.min.js"></script>
  	<script type="text/javascript"
		src="<%=path%>/sctbc/stepBar/js/jquery.easing.1.3.js"></script>
	<script type="text/javascript"
		src="<%=path%>/sctbc/stepBar/js/stepBar.js"></script>
	<script type="text/javascript">
		$(function() {
			var num = $("#lc_tr td").children('p').length;
			$("#lc_end_num").text(num);
			stepBar.init("stepBar", {
				step : num,
				change : true,
				animation : true
			});
		});
	</script>
</html>
