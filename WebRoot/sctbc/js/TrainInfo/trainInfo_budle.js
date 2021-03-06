var curWwwPath = window.document.location.href;
var pathName = window.document.location.pathname;
var pos = curWwwPath.indexOf(pathName);
var localhostPaht = curWwwPath.substring(0, pos);
var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
var path = localhostPaht + projectName;

var trainInfo = new TrainInfo();
var page = new Page();
//
jQuery(function() {
	
	var count = $("#count").val();
	var nowpage=$("#nowpage").val();
	
	page.apd(count,nowpage);
	
	$("#add_index_a").click(function() {
		trainInfo.addIndex(path);
	});

	$("#edit_btn").click(function() {
		trainInfo.editIndex(path);
	});

	$("#see_btn").live("click", function() {
		var id = $(this).attr("dataid");
		trainInfo.seeByOne(id, path);
	});
	$("#sq").click(function(){
		var projectid =$(this).attr("dataid");
		trainInfo.sq(projectid,path);
	});

	$("#add_sub").click(
			function() {
				var releaseDep = $("#releaseDep").val();
				var projectID = $("#projectID").val();
				var projectName = $("#projectName").val();
				var trainYear = $("#trainYear").val();
				var trainStartTime = $("#trainStartTime").val() + " 00:00:00";
				var trainEndTime = $("#trainEndTime").val() + " 00:00:00";
				var trainWay = $("#trainWay").val();
				var trainCategory = $("#trainCategory").val();
				var numberOfPeople = $("#numberOfPeople").val();
				var trainPlace = $("#trainPlace").val();
				var trainContent = $("#trainContent").val();
				var trainPerson = $("#trainPerson").val();
				var trainResult = $("#trainResult").val();
				var borrowTime = $("#borrowTime").val() + " 00:00:00";
				var borrowBalance = $("#borrowBalance").val();
				var rbAmountTime = $("#rbAmountTime").val() + " 00:00:00";
				var rbAmount = $("#rbAmount").val();
				var costCompensated = $("#costCompensated").val();
				var memo = $("#memo").val();
				if (projectID != "" && projectName != "" && trainYear != ""
						&& trainStartTime != "" && trainEndTime != ""
						&& trainWay != "" && trainCategory != ""
						&& numberOfPeople != "" && trainPlace != ""
						&& trainContent != "" && trainPerson != "")
					{
					trainInfo.add(releaseDep, projectID, projectName,
							trainYear, trainStartTime, trainEndTime, trainWay,
							trainCategory, numberOfPeople, trainPlace,
							trainContent, trainPerson, trainResult, borrowTime,
							borrowBalance, rbAmountTime, rbAmount,
							costCompensated, memo, path);
					}else if(projectID == ""){
						alert("请填写培训项目编号!");
					}else if(projectName == ""){
						alert("请填写培训项目名称！");
					}else if(trainYear == ""){
						alert("请填写培训年份！");
					}else if(trainStartTime == ""){
						alert("请填写开始时间！");
					}else if(trainEndTime == ""){
						alert("请填写结束时间！");
					}else if(trainWay == ""){
						alert("请填写培训方式！");
					}else if(trainCategory == ""){
						alert("请填写培训类别！");
					}else if(numberOfPeople == ""){
						alert("请填写培训人数！");
					}else if(trainPlace == ""){
						alert("请填写培训地点！");
					}else if(trainContent == ""){
						alert("请填写培训内容！");
					}else if(trainPerson == ""){
						alert("请填写培训对象！");
					}
			});
	$("#src").change(function() {
		trainInfo.upload(path);
	});
	$("#edit_sub").click(function() {

		if (validate()) {
			trainInfo.edit(path);
		}
	});

	$("#del_btn").live("click", function() {
		var id = $(this).attr("dataid");
		trainInfo.del(id, path);
	});
	/*
	 * $("#src").change(function(){ var src=$(this).val();
	 * $("#datasrc").attr("value",src); trainInfo.upload(path); });
	 */
	$("#search_btn").click(function(){
		var searchname=$("#seach").val();
		trainInfo.search(searchname,path);
	});
	$("#onepagenum").live("click",function(){
		var page = $(this).attr("value");
		trainInfo.list(page,path);
	});
	$("#on_Page").click(function(){
		var page=$("#nowpage").val();
		trainInfo.list(page-1,path);
	});
	$("#up_Page").click(function(){
		var page=parseInt($("#nowpage").val());
		trainInfo.list(page+1,path);
	});
	$("#go_Page").click(function(){
		var page=parseInt($("#go_value").val());
		if(page==""||page==null){
			alert("请输入要跳转的页数");
		}else{
			trainInfo.list(page,path);
		}
	});
	
	
	

	function validate() {
		var result = 1;
		/*
		 * if (userID == null || userID == "") { prompt("教工编号不能为空"); } else
		 * if(name==null||name==""){ prompt("教工名称不能为空"); } else
		 * if(ethnicity==null||ethnicity==""){ prompt("民族不能为空"); } else{
		 * result=1; }
		 */
		return result;
	}

	function returnprompt() {
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