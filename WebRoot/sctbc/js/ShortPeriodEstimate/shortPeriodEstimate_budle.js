var curWwwPath = window.document.location.href;
var pathName = window.document.location.pathname;
var pos = curWwwPath.indexOf(pathName);
var localhostPaht = curWwwPath.substring(0, pos);
var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
var path = localhostPaht + projectName;

var shortPeriodEstimate = new ShortPeriodEstimate();
 //
jQuery(function() {
	$("#add_index_a").click(function() {
		shortPeriodEstimate.addIndex(path);
	});

	$("#edit_btn").click(function() {
		var id=$(this).attr("dataid");
		shortPeriodEstimate.editIndex(id,path);
	});
	$("#see_btn").live("click",function(){
		var id=$(this).attr("dataid");
		shortPeriodEstimate.see(id,path);
	});
	$("#src").change(function(){
		shortPeriodEstimate.upload(path);
	});

	$("#add_sub").click(function() {
			shortPeriodEstimate.add(path);
	});
	$("#edit_sub").click(function() {
		
		if(validate()){
			shortPeriodEstimate.edit(path);
		}
	});
	
	$("#del_btn").live("click",function(){
		var id=$(this).attr("dataid");
		shortPeriodEstimate.del(id,path);
	});
	
	
	
	function validate(){
		var result = 1;
		/*if (userID == null || userID == "") {
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
		}*/
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