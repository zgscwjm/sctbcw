
var curWwwPath=window.document.location.href;
var pathName=window.document.location.pathname;
var pos=curWwwPath.indexOf(pathName);
var localhostPaht=curWwwPath.substring(0,pos);
var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
var path=localhostPaht+projectName;

var left = new Left();

jQuery(function($){
	//
	$("#user").click(function(){
		left.user(path);
	});
	$("#roles").click(function(){
		left.roles(path);
	});
	$("#privilege").click(function(){
		left.privilege(path);
	});
	$("#news").click(function(){
		left.news(path);
	});
	$("#newstype").click(function(){
		left.newstype(path);
	});
	$("#resource").click(function(){
		left.resource(path);
	});
	$("#sysLogin").click(function(){
		left.sysLogin(path);
	});
	
	
	//
	$("#deptinfo").click(function(){
		left.deptinfo(path);
	});
	$("#teachStaffInfo").click(function(){
		left.teachStaffInfo(path);
	});
	$("#teachStaffEnlargeInfo").click(function(){
		left.teachStaffEnlargeInfo(path);
	});
	
	
	
	
	
	//
	$("#addTrainInfo").click(function(){
		left.addTrainInfo(path);
	});
	$("#getTrainInfoAll").click(function(){
		left.getTrainInfoAll(path);
	});
	$("#teachStaffTrainInfo").click(function(){
		left.teachStaffTrainInfo(path);
	});
	$("#trainInfo").click(function(){
		left.trainInfo(path);
	});
	
	
	
	
	
	
	
	//
	$("#trainType").click(function(){
		left.trainType(path);
	});
	$("#trainApply_1").click(function(){
		left.addtrainApply(1,path);
	});
	$("#trainApply_0").click(function(){
		left.addtrainApply(0,path);
	});
	$("#auditingOpinion").click(function(){
		left.auditingOpinion(path);
	});
	$("#shortPeriodEstimate").click(function(){
		left.shortPeriodEstimate(path);
	});
	$("#longPeriodEstimate").click(function(){
		left.longPeriodEstimate(path);
	})
});