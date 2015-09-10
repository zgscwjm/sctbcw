var curWwwPath = window.document.location.href;
var pathName = window.document.location.pathname;
var pos = curWwwPath.indexOf(pathName);
var localhostPaht = curWwwPath.substring(0, pos);
var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
var path = localhostPaht + projectName;

var deptInfo = new DeptInfo();

jQuery(function() {
	$("#add_index_a").click(function() {
		deptInfo.addIndex(path);
	});

	$("#edit_btn").live("click",function(){
		var id=$(this).attr("dataid");
		deptInfo.editIndex(id,path);
	});

	$("#add_sub").click(function() {
		var depID = $("#depID").val();
		var depName = $("#depName").val();
		var depLeaderID = $("#depLeaderID").val();
		var memo1 = $("#memo1").val();
		var memo2 = $("#memo2").val();
		if(validate(depID,depName,depLeaderID)){
			deptInfo.add(path);
		}
	});
	$("#edit_sub").click(function() {
		var depID = $("#depID").val();
		var depName = $("#depName").val();
		var depLeaderID = $("#depLeaderID").val();
		var memo1 = $("#memo1").val();
		var memo2 = $("#memo2").val();
		if(validate(depID,depName,depLeaderID)){
			deptInfo.edit(path);
		}
	});
	
	$("#del_btn").live("click",function(){
		var id=$(this).attr("dataid");
		deptInfo.del(id,path);
	});
	
	
	
	function validate(depID,depName,depLeaderID){
		var result = 0;
		if (depID == null || depID == "") {
			prompt("部门标号不能为空");
		}
		else if(depName==null||depName==""){
			prompt("部门名称不能为空");
		}
		else if(depLeaderID==null||depLeaderID==""){
			prompt("领导教工不能为空");
		}
		else{
			result=1;
		}
		return result;
	}
	
	function returnprompt(){
		$("#prompt_h4").hide("300");
		$("#title_h4").fadeIn("300");
	}

	function prompt(testvalue) {
		$("#title_h4").hide();
		$("#prompt_h4").css("background-color", "#68DFF0");
		$("#prompt_h4 #prompt").text(testvalue + "，请重新输入!");
		$("#prompt_h4").slideDown();
		setTimeout(function() {
			returnprompt();
		}, 2000);
	}
});