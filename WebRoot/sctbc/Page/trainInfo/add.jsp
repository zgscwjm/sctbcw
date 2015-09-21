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
					<i class="fa fa-angle-right"></i> 培训信息管理
				</h3>

				<!-- BASIC FORM ELELEMNTS -->
				<div class="row mt">
					<div class="col-lg-12">
						<div class="form-panel">
							<h4 class="mb" id="title_h4">
								<i class="fa fa-angle-right"></i> 发布培训信息
							</h4>
							<h4 class="mb" id="prompt_h4"
								style="height:50px;display:none;line-height:50px;">
								<i class="fa fa-angle-right"></i> <i id="prompt"
									style="left:20px;"></i>
							</h4>
							<form class="form-horizontal style-form" action="<%=path%>/Util/upLoadPXZL" id="upload_form"
								method="POST" enctype="multipart/form-data">
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;">发布部门：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<%-- <select class="form-control" id="releaseDep" name="releaseDep">
											<option value="-1">请选择部门</option>
											<c:forEach items="${deptInfolist }" var="deptInfodata">
												<option value="${deptInfodata.id }">${deptInfodata.depName }</option>
											</c:forEach>
										</select> --%>
										<input type="text" class="form-control" value="${USER.teachstaffenlargeinfo.deptinfo.depName }" disabled>
										<input type="hidden" name="releaseDep" id="releaseDep" value="${USER.teachstaffenlargeinfo.deptinfo.id }">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:50px;">培训项目编号：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-30px;">
										<input type="text" class="form-control" id="projectID"
											name="projectID">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:30px;">培训项目名称：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-30px;">
										<input type="text" class="form-control" id="projectName"
											name="projectName">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;">培训年份：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
									<select  class="form-control" id="trainYear"
											name="trainYear">
									<option value="2015">2015</option>
									</select>
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:50px;">培训开始时间：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-30px;">
										<input type="text" class="form-control" id="trainStartTime"
											name="trainStartTime" >
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:30px;">培训结束时间：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-30px;">
										<input type="text" class="form-control" id="trainEndTime"
											name="trainEndTime">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;">培训方式：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="trainWay"
											name="trainWay">
									</div>

									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:50px;">培训类别：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-30px;">
										<select class="form-control" id="trainCategory"
											name="trainCategory">
											<option value="">请选择培训类别</option>
											<c:forEach items="${trainTypelist }" var="trainTypedata">
												<option value="${trainTypedata.trainkindId }">${trainTypedata.kindName }</option>
											</c:forEach>
										</select>
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:30px;">培训人数：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-30px;">
										<input type="text" class="form-control" id="numberOfPeople"
											name="numberOfPeople">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;">培训地点：</label>
									<div class="col-sm-10" style="width:360px;margin-left:-20px;">
										<input type="text" class="form-control" id="trainPlace"
											name="trainPlace">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:80px;">培训内容：</label>
									<div class="col-sm-10" style="width:360px;margin-left:-20px;">
										<input type="text" class="form-control" id="trainContent"
											name="trainContent">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;">送培对象：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="trainPerson"
											name="trainPerson">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:50px;">文件资料：</label>
									<div class="col-sm-10" style="width:220px;margin-left:-20px;">
									<input class="form-control" type="file" name="src" id="src">
										<input type="hidden" class="form-control" id="trainResult"
											name="trainResult">
									</div>
									<p class="form-control-static">
										<font color="red" size="1">*多文件请以压缩包格式上传</font>
									</p>
								</div>

								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;">借款时间：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-50px;">
										<input type="text" class="form-control" id="borrowTime"
											name="borrowTime">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;margin-left:50px;">借款金额：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="borrowBalance"
											name="borrowBalance">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:100px;">报账时间：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-20px;">
										<input type="text" class="form-control" id="rbAmountTime"
											name="rbAmountTime">
									</div>
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:130px;margin-left:50px;">报账金额：</label>
									<div class="col-sm-10" style="width:200px;margin-left:-50px;">
										<input type="text" class="form-control" id="rbAmount"
											name="rbAmount">
									</div>

								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label"
										style="width:150px;">培训费用赔偿情况：</label>
									<div class="col-sm-10" style="width:580px;margin-left:-20px;">
										<input type="text" class="form-control" id="costCompensated"
											name="costCompensated">
									</div>
								</div>
								<div class="form-group">
									<label class="col-sm-2 col-sm-2 control-label">其他说明：</label>
									<div class="col-sm-10" style="width:580px;margin-left:-105px;">
										<input class="form-control" id="memo" name="memo" type="text"
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
		<footer class="site-footer" style="width:100%;">
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
	<script src="<%=path%>/sctbc/js/jquery-form.js"></script>
	<script src="<%=path%>/sctbc/js/plug-in/Page.js"></script>
	<script src="<%=path%>/sctbc/js/TrainInfo/trainInfo.js"></script>
	<script src="<%=path%>/sctbc/js/TrainInfo/trainInfo_budle.js"></script>

	<script type="text/javascript"
		src="<%=path%>/sctbc/js/plug-in/laydate/laydate.js"></script>
	<script type="text/javascript">
		!function() {
			laydate({
				elem : '#borrowTime'
			});//绑定元素
			laydate({
				elem : '#trainStartTime'
			});//绑定元素
			laydate({
				elem : '#trainEndTime'
			});//绑定元素
			laydate({
				elem : '#rbAmountTime'
			});//绑定元素
		}();
	</script>
</body>
</html>
