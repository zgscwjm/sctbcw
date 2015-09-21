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
					<i class="fa fa-angle-right"></i> 短期评价管理
				</h3>

				<!-- BASIC FORM ELELEMNTS -->
				<div class="row mt">
					<div class="col-lg-12">
						<div class="form-panel">
							 <h4 class="mb" id="title_h4"><i class="fa fa-angle-right"></i> 新增数据</h4>
                  	  <h4 class="mb" id="prompt_h4" style="height:50px;display:none;line-height:50px;"><i class="fa fa-angle-right"></i> <i id="prompt" style="left:20px;"></i></h4>
							<form class="form-horizontal style-form" action="<%=path%>/Util/upLoadPXZL" id="upload_form" method="POST" enctype="multipart/form-data">
								<div class="form-group">
									
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:20px;">参培教工：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
									<c:if test="${userlevel==0}">
									<c:forEach  items="${USER.teachstaffinfos }" var="userinfoname1">
									  <input type="text" class="form-control" id="trainUserID" value="${userinfoname1.name }" disabled>
									  <input type="hidden" name="TrainUserId" value="${USER.userId }">
									  </c:forEach>
									</c:if>
									<c:if test="${userlevel==1}">
									<select class="form-control" name="TrainUserId">
									<c:forEach items="${teachstaffinfoList }" var="teachstaffinfodata">
									<option value="${teachstaffinfodata.user.userId }">${teachstaffinfodata.name }</option>
									</c:forEach>
									</select>
										</c:if>
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;">培训项目：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
									<select class="form-control" id="projectID" name="projectID" >
									   <c:forEach items="${TrainapplyList }" var="Trainapplydata">
									      <option value="${Trainapplydata.traininfo.projectId}">${Trainapplydata.traininfo.projectName}</option>
									   </c:forEach>
									</select>
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:60px;">参评教工：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
									<c:forEach  items="${USER.teachstaffinfos }" var="userinfoname2">
									<input type="test"class="form-control"  value="${userinfoname2.name }" disabled="disabled">
										<input type="hidden" class="form-control" id="evaluateUserID" name="EvaluateUserId" value="${USER.userId }">
									</c:forEach>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:30px;">必要性：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="necessity" name="necessity">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:30px;">满意度：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="satisfaction" name="satisfaction">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:60px;">费用合理性：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="costRationality" name="costRationality">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:30px;">收获程度：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="gainsDegree" name="gainsDegree">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;">培训成果评价：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="evaluate" name="evaluate">
									</div>
								</div>
								<div class="form-group">
								<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;">上传培训成果文件：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
									<input class="form-control" type="file" name="src" id="src">
										<input type="hidden" class="form-control" id="memo1" name="memo1">
									</div>
								</div>
								
								<div class="form-group">
									<div class="col-sm-10" style="width:200px;">
										<button class="btn btn-theme04" type="button" id="add_sub">提交</button>
										<button class="btn btn-theme03" onclick="history.go(-1)">返回</button>
									</div>
								</div>
							</form>
						</div>
					</div>
					<!-- col-lg-12-->
				</div>
				<!-- /row -->


			</section>
			<! --/wrapper -->
		</section>

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
<script src="<%=path%>/sctbc/js/jquery-form.js"></script>
	<script type="text/javascript"
		src="<%=path%>/sctbc/assets/js/gritter/js/jquery.gritter.js"></script>
	<script type="text/javascript"
		src="<%=path%>/sctbc/assets/js/gritter-conf.js"></script>

 <script src="<%=path%>/sctbc/js/ShortPeriodEstimate/shortPeriodEstimate.js"></script>
    <script src="<%=path%>/sctbc/js/ShortPeriodEstimate/shortPeriodEstimate_budle.js"></script>

</body>
</html>
