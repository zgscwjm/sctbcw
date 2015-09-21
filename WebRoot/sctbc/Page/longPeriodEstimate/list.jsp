<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
					<i class="fa fa-angle-right"></i> 长期评价管理
				</h3>
				<div class="row mt">
					<div class="col-md-12">
						<div class="content-panel">
							<div class="form-panel">
								<form class="form-inline" id="search_form" role="form">
									<div class="form-group">
										<label class="sr-only" >搜索</label> <input type="text" class="form-control"
											id="seach" placeholder="搜索">
									</div>
							
									<button type="button" id="search_btn" class="btn btn-theme">搜索</button>
									<a class="btn btn-default btn-sm pull-right" href="javascript:;" id="add_index_a">新增数据</a>
								</form>
							</div>
							<table class="table table-striped table-advance table-hover">
								<thead>
									<tr>
										<th>编号</th>
										<th>培训项目</th>
										<th>培训教工</th>
										<th>参评教工</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
								<c:forEach items="${longPeriodEstimate }" var="longPeriodEstimate">
									<tr>
										<td>${longPeriodEstimate.id}</td>
										<td class="hidden-phone">${longPeriodEstimate.traininfo.projectName}</td>
										<c:forEach items="${longPeriodEstimate.userByTrainUserId.teachstaffinfos}" var="userinfo1">
										<td class="hidden-phone">${userinfo1.name}</td>
										</c:forEach>
											<c:forEach items="${longPeriodEstimate.userByEvaluateUserId.teachstaffinfos}" var="userinfo2">
										<td class="hidden-phone">${userinfo2.name}</td>
										</c:forEach>
										<td>
											<button class="btn btn-success btn-xs" type="button" id="see_btn" dataid="${longPeriodEstimate.id}">
												<i class="fa fa-check"></i>
											</button>
											<button class="btn btn-primary btn-xs" type="button" id="edit_btn" dataid="${longPeriodEstimate.id}">
												<i class="fa fa-pencil"></i>
											</button>
											<button class="btn btn-danger btn-xs" type="button" id="del_btn" dataid="${longPeriodEstimate.id}">
												<i class="fa fa-trash-o "></i>
											</button>
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

		<!--main content end-->
		<!--footer start-->
				<jsp:include page="../foot.jsp" />
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
		
<script src="<%=path%>/sctbc/js/LongPeriodEstimate/longPeriodEstimate.js"></script>
    <script src="<%=path%>/sctbc/js/LongPeriodEstimate/longPeriodEstimate_budle.js"></script>
</body>
</html>
