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
  </head>
  
  <body>
	<a data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
		<i class="fa fa-envelope-o"></i> <span class="badge bg-theme">${reviewsize }</span>
	</a>
	<ul class="dropdown-menu extended inbox">
		<div class="notify-arrow notify-arrow-green"></div>
		
		<c:if test="${reviewsize=='' }">
		<li>
			<p class="green">您有${reviewsize }条需要审核的项目</p>
		</li>
		<c:forEach items="${reviewlist }" var="reviewdata">
			<li><a href="<%=path%>/Review/getReviewTrainAll"> <span
					class="subject"> <span class="from">申请项目:${reviewdata.trainapply.traininfo.projectName }</span>
						<span class="time">申请人： <c:forEach
								items="${reviewdata.trainapply.user.teachstaffinfos }"
								var="userinfo">
                                    ${userinfo.name }
                                    </c:forEach>
					</span>
				</span>
			</a></li>
		</c:forEach>
		<li><a href="<%=path%>/Review/getReviewTrainAll">查看更多</a></li>
		</c:if>
		<c:if test="${reviewsize!='' }">
		<li>
			<p class="green">暂无需要您审核的信息</p>
		</li>
		</c:if>
		
	</ul>
</body>
</html>
