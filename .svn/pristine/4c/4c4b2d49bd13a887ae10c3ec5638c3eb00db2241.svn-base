<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

  </head>
 
									<c:forEach items="${trainApplyList }" var="trainApplydata">
										<tr>
											<td class="hidden-phone">${trainApplydata.traininfo.projectId }</td>
											<td>${trainApplydata.traininfo.projectName}</td>
											<td>${trainApplydata.applyKind}</td>
											<td>${trainApplydata.user.userId}</td>
											
											 <td>
											<c:forEach var="item" items="${trainApplydata.user.teachstaffinfos}">
 													 
 													 ${item.name}
 													
 											</c:forEach>
 											 </td>
												
												 <td>${trainApplydata.user.teachstaffenlargeinfo.deptinfo.depName}</td>
											
											<td>
											<c:if test="${trainApplydata.appDownload!=''}">
											<a href="<%=path%>/${trainApplydata.appDownload}"
												download>下载申请表</a>
												</c:if>
													<c:if test="${trainApplydata.appDownload==''}">
											无申请表
												</c:if>
												</td>
												<td>
													${trainApplydata.finalCheck }
											
												</td>
											<td>
												<button class="btn btn-success btn-xs" type="button"
													id="see_btn">
													<i class="fa fa-check"></i>
												</button>
												<!-- <button class="btn btn-primary btn-xs" type="button"
													id="edit_btn">
													<i class="fa fa-pencil"></i>
												</button>
												<button class="btn btn-danger btn-xs" type="button"
													id="del_btn" dataid="">
													<i class="fa fa-trash-o "></i>
												</button> -->
											</td>
										</tr>
									</c:forEach>

</html>
