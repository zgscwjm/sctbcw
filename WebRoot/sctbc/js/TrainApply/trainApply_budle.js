var curWwwPath = window.document.location.href;
var pathName = window.document.location.pathname;
var pos = curWwwPath.indexOf(pathName);
var localhostPaht = curWwwPath.substring(0, pos);
var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
var path = localhostPaht + projectName;

var trainApply = new TrainApply();
 //
jQuery(function() {
	$("#add_index_a").click(function() {
		trainApply.addIndex(path);
	});

	$("#edit_btn").click(function() {
		trainApply.editIndex(path);
	});

	$("#add_sub").click(function() {
		var nowtime = CurentTime()+":00";
		var userId = $("#userId").val();
		var applyKind = $("#applyKind").val();
		var projectID = $("#projectID").val();
		var depID = $("#depID").val();
		var applyReason = $("#applyReason").val();
		var appDownload = $("#appDownload").val();
		var finalCheck="审核中";
		
		trainApply.add(nowtime,userId,applyKind,projectID,depID,applyReason,appDownload,finalCheck,path);
	});
	$("#edit_sub").click(function() {
		
		if(validate()){
			trainApply.edit(path);
		}
	});
	
	$("#del_btn").live("click",function(){
		var id=$(this).attr("dataid");
		trainApply.del(id,path);
	});
	
	$("#src").change(function(){
		if($(this).val()!=null){
			trainApply.upload(path);
		}
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
	
	function CurentTime()
    { 
        var now = new Date();
       
        var year = now.getFullYear();       //年
        var month = now.getMonth() + 1;     //月
        var day = now.getDate();            //日
       
        var hh = now.getHours();            //时
        var mm = now.getMinutes();          //分
       
        var clock = year + "-";
       
        if(month < 10)
            clock += "0";
       
        clock += month + "-";
       
        if(day < 10)
            clock += "0";
           
        clock += day + " ";
       
        if(hh < 10)
            clock += "0";
           
        clock += hh + ":";
        if (mm < 10) clock += '0'; 
        clock += mm; 
        return(clock); 
    }
});