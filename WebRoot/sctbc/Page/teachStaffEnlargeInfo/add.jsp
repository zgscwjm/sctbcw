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
					<i class="fa fa-angle-right"></i> 教职工扩展信息管理
				</h3>

				<!-- BASIC FORM ELELEMNTS -->
				<div class="row mt">
					<div class="col-lg-12">
						<div class="form-panel">
							 <h4 class="mb" id="title_h4"><i class="fa fa-angle-right"></i> 新增数据</h4>
                  	  <h4 class="mb" id="prompt_h4" style="height:50px;display:none;line-height:50px;"><i class="fa fa-angle-right"></i> <i id="prompt" style="left:20px;"></i></h4>
							<form class="form-horizontal style-form" id="add_form" method="POST">
								<div class="form-group">
								<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;">教工编号：</label>
									<div class="col-sm-10" style="width:200px;margin-left:10px;">
									<select class="form-control" name="userId" id="userID">
									<c:forEach items="${userList }" var="userdata">
									<option value="${userdata.userId }">${userdata.userId }</option>
									</c:forEach>
										</select>
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:80px;">部门编号：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-11px;">
										<input type="text" class="form-control" id="depID" name="depID">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:110px;margin-left:70px;">身份证号码：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-10px;">
										<input type="text" class="form-control" id="IDNumber" name="IDNumber">
									</div>
									
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:120px;">现任职时间：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-10px;">
										<input type="text" class="form-control" id="presentWorkTime" name="presentWorkTime">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:140px;margin-left:60px;">参加工作时间：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-30px;">
										<input type="text" class="form-control" id="startWorkTime" name="startWorkTime">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:120px;margin-left:80px;">毕业时间：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-30px;">
										<input type="text" class="form-control" id="graduateTime" name="graduateTime">
									</div>
									
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;">最后毕业学校：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="lastGraduateSchool" name="lastGraduateSchool">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:140px;margin-left:50px;">进入本单位形式：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="enterForm" name="enterForm">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:60px;">进入学院来源：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="enterSource" name="enterSource">
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;">人员状态：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="status" name="status">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:140px;margin-left:50px;">所学专业：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="schoolSpecialty" name="schoolSpecialty">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:60px;">现从事专业：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="workSpecialty" name="workSpecialty">
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;">主岗位类别：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="primaryPost" name="primaryPost">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:140px;margin-left:50px;">兼职岗位类别：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="secondaryPost" name="secondaryPost">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:60px;">岗位工资：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="postSalary" name="postSalary">
									</div>
								</div>
								
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;">薪级工资：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="gradeSalary" name="gradeSalary">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:140px;margin-left:50px;">婚姻状态：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="marriage" name="marriage">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:60px;">政治面貌：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="political" name="political">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;">最高学历：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="highestEducation" name="highestEducation">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:140px;margin-left:50px;">最高学位：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="highestGrade" name="highestGrade">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:60px;">现任专业技术职务（职称）：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="specialtyRank" name="specialtyRank">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;">兴趣爱好：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="interests" name="interests">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:140px;margin-left:50px;">身份类别：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="userType" name="userType">
									</div>
								</div>
								<!-- 妈蛋！！！终于加完了   好多玩意儿    复制都累！！ -->
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label">备注信息1：</label>
									<div class="col-sm-10" style="width:580px;margin-left:-105px;">
										<input class="form-control" id="memo1" name="memo1" type="text"
											value="">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label">备注信息2：</label>
									<div class="col-sm-10" style="width:580px;margin-left:-105px;">
										<input class="form-control" id="memo2" name="memo2" type="text"
											value="">
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
			style="left:15.5%;">
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

    <script src="<%=path%>/sctbc/js/TeachStaffEnlargeInfo/teachStaffEnlargeInfo.js"></script>
    <script src="<%=path%>/sctbc/js/TeachStaffEnlargeInfo/teachStaffEnlargeInfo_budle.js"></script>

</body>
</html>
