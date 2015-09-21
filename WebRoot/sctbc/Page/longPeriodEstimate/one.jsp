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
					<i class="fa fa-angle-right"></i> 长期评价管理
				</h3>

				<!-- BASIC FORM ELELEMNTS -->
				<div class="row mt">
					<div class="col-lg-12">
						<div class="form-panel">
							 <h4 class="mb" id="title_h4"><i class="fa fa-angle-right"></i> 查询</h4>
                  	  <h4 class="mb" id="prompt_h4" style="height:50px;display:none;line-height:50px;"><i class="fa fa-angle-right"></i> <i id="prompt" style="left:20px;"></i></h4>
							<form class="form-horizontal style-form" id="add_form" method="POST">
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;">培训项目编号：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
										<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;">${longPeriodEstimate.traininfo.projectName }</label>
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">参培教工编号：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
										<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">
										<c:forEach  items="${longPeriodEstimate.userByTrainUserId.teachstaffinfos }" var="usertrain">
										${usertrain.name }
										</c:forEach>
										</label>
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">参评教工编号：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
										<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">
										<c:forEach  items="${longPeriodEstimate.userByEvaluateUserId.teachstaffinfos }" var="userE">
										${userE.name}
										</c:forEach>
										</label>
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;">教学能力的提高：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
										<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">${longPeriodEstimate.teachAbilityEnhance }</label>
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">教育能力的提高：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
										<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">${longPeriodEstimate.eduAbilityEnhance }</label>
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">科研能力的提高：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
										<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">${longPeriodEstimate.sciAbilityEnhance }</label>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;">管理能力的提高：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
										<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">${longPeriodEstimate.manAbilityEnhance }</label>
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">专业实践能力的提高：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
										<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">${longPeriodEstimate.speAbilityEnhance }</label>
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">思想作风：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
										<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">${longPeriodEstimate.ideaStyle }</label>
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;">工作业务能力的提高：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
										<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">${longPeriodEstimate.workAbilityEnhance }</label>
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">专业建设能力：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
										<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">${longPeriodEstimate.speBuildAbility }</label>
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">课程建设能力：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
										<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">${longPeriodEstimate.courseBuildAbility }：</label>
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;">培训绩效满意度：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-40px;">
										<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;margin-left:50px;">${longPeriodEstimate.trainSatisfy }</label>
									</div>
								</div>
								
								
								<div class="form-group">
									<div class="col-sm-10" style="width:200px;">
										<!-- <button class="btn btn-theme04" type="button" id="add_sub">提交</button> -->
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
