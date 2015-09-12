var curWwwPath = window.document.location.href;
var pathName = window.document.location.pathname;
var pos = curWwwPath.indexOf(pathName);
var localhostPaht = curWwwPath.substring(0, pos);
var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
var path = localhostPaht + projectName;

var news = new News();
var page = new Page();

jQuery(function() {
	var count = $("#count").val();
	var nowpage=$("#nowpage").val();
	
	page.apd(count,nowpage);
	
	$("#add_index_a").click(function() {
		news.addIndex(path);
	});

	$("#edit_btn").live("click",function(){
		var id=$(this).attr("dataid");
		news.editIndex(id,path);
	});

	$("#add_sub").click(function() {
		news.add(path);
	});
	$("#edit_sub").click(function() {
		news.edit(path);
	});
	
	$("#del_btn").live("click",function(){
		var id=$(this).attr("dataid");
		news.del(id,path);
	});
	
	$("#onepagenum").live("click",function(){
		var page = $(this).attr("value");
		news.list(page,path);
	});
	$("#on_Page").click(function(){
		var page=$("#nowpage").val();
		news.list(page-1,path);
	});
	$("#up_Page").click(function(){
		var page=parseInt($("#nowpage").val());
		news.list(page+1,path);
	});
	$("#go_Page").click(function(){
		var page=parseInt($("#go_value").val());
		if(page==""||page==null){
			alert("请输入要跳转的页数");
		}else{
			news.list(page,path);
		}
	});
	
	
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