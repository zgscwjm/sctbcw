var curWwwPath = window.document.location.href;
var pathName = window.document.location.pathname;
var pos = curWwwPath.indexOf(pathName);
var localhostPaht = curWwwPath.substring(0, pos);
var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
var path = localhostPaht + projectName;

jQuery(function(){
	$("#seachType").change(function(){
		var type=$(this).val();
		if(type==1){
			$("#deptInId").show();
			$("#time").hide();
			$("#traininfo").hide();
		}else if(type==2){
			$("#deptInId").hide();
			$("#time").show();
			$("#traininfo").hide();
		}else if(type==3){
			$("#deptInId").hide();
			$("#time").hide();
			$("#traininfo").show();
		}
	});
	$("#search_btn").click(function(){
		var type= $("#seachType").val();
		if(type==1){
			var value=$("#deptInId").val();
		}else if(type==2){
			var value=$("#time").val();
		}else if(type==3){
			var value=$("#traininfo").val();
		}
		$("#typevalue").val(type);
		$("#valuevalue").val(value);
		$("#seach_form_sub").submit();
		//window.loacation.href=path+"/TrainInfo/traininfoTJLoad?type="+type+"&value="+value;
		//$("#datatabody").load(path+"/TrainInfo/traininfoTJLoad",{"type":type,"value":value});
	});
});