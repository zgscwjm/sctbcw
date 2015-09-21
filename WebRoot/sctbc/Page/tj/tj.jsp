<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Dashboard">
<meta name="keyword"
	content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

<title>四川工商职业技术学院</title>

<!-- Bootstrap core CSS -->
<link href="<%=path%>/sctbc/assets/css/bootstrap.css" rel="stylesheet">
<!--external css-->
<link href="<%=path%>/sctbc/assets/font-awesome/css/font-awesome.css"
	rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/sctbc/assets/css/zabuto_calendar.css">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/sctbc/assets/js/gritter/css/jquery.gritter.css" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/sctbc/assets/lineicons/style.css">

<!-- Custom styles for this template -->
<link href="<%=path%>/sctbc/assets/css/style.css" rel="stylesheet">
<link href="<%=path%>/sctbc/assets/css/style-responsive.css"
	rel="stylesheet">

<script src="<%=path%>/sctbc/assets/js/chart-master/Chart.js"></script>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<section id="container">
		<!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
		<!--header start-->
		<header class="header black-bg">
			<jsp:include page="../header.jsp" />
		</header>
		<!--header end-->

		<!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
		<!--sidebar start-->
		<aside>
			<jsp:include page="../left.jsp" />
		</aside>
		<!--sidebar end-->

		<!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
		<!--main content start-->
		<section id="main-content">
			<section class="wrapper">
				<h3>
					<i class="fa fa-angle-right"></i> 培训申请
				</h3>
				<div class="row mt">
					<div class="col-md-12">
						<div class="content-panel">
							<div class="form-panel">
								<form class="form-inline" action="<%=path%>/TrainInfo/traininfoTJ" method="post" role="form">
									<div class="form-group">
										<label class="sr-only">搜索</label>
											<select id="seachType" class="form-control">
											<option value="1">部门</option>
											<option value="2">时间</option>
											<option value="3">项目</option>
											</select>
											<select id="deptInId" name="deptInId" class="form-control">
											<c:forEach items="${deptInfoList }" var="deptInfodata">
											<option value="${deptInfodata.depId }">${deptInfodata.depName }</option>
											</c:forEach>
											</select>
											<select id="traininfo" name="traininfo" class="form-control" style="display:none;">
											<c:forEach items="${traininfoList }" var="traininfodata">
											<option value="${traininfodata.projectId }">${traininfodata.projectName }</option>
											</c:forEach>
											</select>
											<input type="text" class="form-control" id="time" name="time" style="display:none">
									</div>

									<button type="button" id="search_btn" class="btn btn-theme">搜索</button>
									<!-- <a class="btn btn-default btn-sm pull-right"
										href="javascript:;" id="add_index_a">新增数据</a> -->
								</form>
							</div>
							<table class="table table-striped table-advance table-hover" id="datatable">
								<thead>
									<tr>
										<th>项目编号</th>
										<th>项目名称</th>
										<th>申请类别</th>
										<th>教工编号</th>
										<th>教工姓名</th>
										<th>所属部门</th>
										<th>申请表下载地址</th>
										<th>状态</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody id="datatabody">
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
								</tbody>
							</table>
						</div>
						<!-- /content-panel -->
					</div>
					<!-- /col-md-12 -->
				</div>
				<!-- /row -->

			</section>
			<! --/wrapper -->
		</section>
		<!-- /MAIN CONTENT -->
<form action="<%=path%>/TrainInfo/traininfoTJLoad" method="post" id="seach_form_sub">
<input type="hidden" id="typevalue" name="type">
<input type="hidden" id="valuevalue" name="value">
</form>
		<!--main content end-->
		<!--footer start-->
		<footer class="site-footer"
			style="position:absolute;bottom:0px;left:15.5%;width:84%;">
			<div class="text-center">
				2014 - 2015 <a href="http://www.mycodes.net/" target="_blank">四川工商职业技术学院</a>
				<a href="http://www.mycodes.net/" target="_blank">人事管理系统</a> <a
					href="index.html#" class="go-top"> <i class="fa fa-angle-up"></i>
				</a>
			</div>
		</footer>
		<!--footer end-->
	</section>

	<!-- js placed at the end of the document so the pages load faster -->
	<script src="<%=path%>/sctbc/assets/js/jquery.js"></script>
	<script src="<%=path%>/sctbc/assets/js/jquery-1.8.3.min.js"></script>
	<script src="<%=path%>/sctbc/assets/js/bootstrap.min.js"></script>
	<script class="include" type="text/javascript"
		src="<%=path%>/sctbc/assets/js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="<%=path%>/sctbc/assets/js/jquery.scrollTo.min.js"></script>
	<script src="<%=path%>/sctbc/assets/js/jquery.nicescroll.js"
		type="text/javascript"></script>
	<script src="<%=path%>/sctbc/assets/js/jquery.sparkline.js"></script>


	<!--common script for all pages-->
	<script src="<%=path%>/sctbc/assets/js/common-scripts.js"></script>

	<script type="text/javascript"
		src="<%=path%>/sctbc/assets/js/gritter/js/jquery.gritter.js"></script>
	<script type="text/javascript"
		src="<%=path%>/sctbc/assets/js/gritter-conf.js"></script>
	<script type="text/javascript"
		src="<%=path%>/sctbc/js/tj/tj.js"></script>
<script type="text/javascript"
		src="<%=path%>/sctbc/js/plug-in/laydate/laydate.js"></script>
	<script type="text/javascript">
		!function() {
			laydate({
				elem : '#time'
			});
		}();
	</script>
</body>
</html>
