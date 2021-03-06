<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
					<i class="fa fa-angle-right"></i> 教职工基本信息管理
				</h3>

				<!-- BASIC FORM ELELEMNTS -->
				<div class="row mt">
					<div class="col-lg-12">
						<div class="form-panel">
							 <h4 class="mb" id="title_h4"><i class="fa fa-angle-right"></i> 修改数据</h4>
                  	  <h4 class="mb" id="prompt_h4" style="height:50px;display:none;line-height:50px;"><i class="fa fa-angle-right"></i> <i id="prompt" style="left:20px;"></i></h4>
							<form class="form-horizontal style-form" id="edit_form">
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;">培训项目编号：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="projectID" name="projectID">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">参培教工编号：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="trainUserID" name="trainUserID">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">参评教工编号：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="evaluateUserID" name="evaluateUserID">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">必要性：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="necessity" name="necessity">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">满意度：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="satisfaction" name="satisfaction">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">观念的转变：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="viewChange" name="viewChange">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">教学能力的提高：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="teachAbilityEnhance" name="teachAbilityEnhance">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">教育能力的提高：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="eduAbilityEnhance" name="eduAbilityEnhance">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">科研能力的提高：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="sciAbilityEnhance" name="sciAbilityEnhance">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">管理能力的提高：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="manAbilityEnhance" name="manAbilityEnhance">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">专业实践能力的提高：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="speAbilityEnhance" name="speAbilityEnhance">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">思想作风：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="ideaStyle" name="ideaStyle">
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">工作业务能力的提高：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="workAbilityEnhance" name="workAbilityEnhance">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">专业建设能力：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="speBuildAbility" name="speBuildAbility">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">课程建设能力：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="courseBuildAbility" name="courseBuildAbility">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:100px;">培训绩效满意度：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="trainSatisfy" name="trainSatisfy">
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label">备注1：</label>
									<div class="col-sm-10" style="width:580px;margin-left:-105px;">
										<input class="form-control" id="denyReason" name="denyReason" type="text"
											value="">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label">备注2：</label>
									<div class="col-sm-10" style="width:580px;margin-left:-105px;">
										<input class="form-control" id="memo" name="memo" type="text"
											value="">
									</div>
								</div>
								<div class="form-group">
									<div class="col-sm-10" style="width:200px;">
										<button class="btn btn-theme04" type="button" id="edit_sub">提交</button>
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
