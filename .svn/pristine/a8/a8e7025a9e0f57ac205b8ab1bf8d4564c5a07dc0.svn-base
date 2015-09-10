var curWwwPath = window.document.location.href;
var pathName = window.document.location.pathname;
var pos = curWwwPath.indexOf(pathName);
var localhostPaht = curWwwPath.substring(0, pos);
var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
var path = localhostPaht + projectName;

var teachStaffEnlargeInfo = new TeachStaffEnlargeInfo();

jQuery(function() {
	$("#add_index_a").click(function() {
		teachStaffEnlargeInfo.addIndex(path);
	});

	$("#edit_btn").click(function() {
		var userId=$(this).attr("dataid");
		teachStaffEnlargeInfo.editIndex(userId,path);
	});

	$("#add_sub").click(function() {
		if(validate()){
			teachStaffEnlargeInfo.add(path);
		}
	});
	$("#edit_sub").click(function() {
		if(validate()){
			teachStaffEnlargeInfo.edit(path);
		}
	});
	
	$("#del_btn").live("click",function(){
		var id=$(this).attr("dataid");
		teachStaffEnlargeInfo.del(id,path);
	});
	
	
	
	function validate(userID,name,ethnicity){
		var result = 0;
		if (userID == null || userID == "") {
			prompt("教工编号不能为空");
		}
		else if(name==null||name==""){
			prompt("教工名称不能为空");
		}
		else if(ethnicity==null||ethnicity==""){
			prompt("民族不能为空");
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