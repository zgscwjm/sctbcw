var curWwwPath = window.document.location.href;
var pathName = window.document.location.pathname;
var pos = curWwwPath.indexOf(pathName);
var localhostPaht = curWwwPath.substring(0, pos);
var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
var path = localhostPaht + projectName;

var sysLogin = new SysLogin();
var page = new Page();
 //
jQuery(function() {
	
	var count = $("#count").val();
	var nowpage=$("#nowpage").val();
	
	page.apd(count,nowpage);
	
	
	$("#del_btn").live("click",function(){
		var id=$(this).attr("dataid");
		sysLogin.del(id,path);
	});
	
	
	$("#search_btn").click(function(){
		var searchname=$("#seach").val();
		sysLogin.search(searchname,path);
	});
	$("#onepagenum").live("click",function(){
		var page = $(this).attr("value");
		sysLogin.list(page,path);
	});
	$("#on_Page").click(function(){
		var page=$("#nowpage").val();
		sysLogin.list(page-1,path);
	});
	$("#up_Page").click(function(){
		var page=parseInt($("#nowpage").val());
		sysLogin.list(page+1,path);
	});
	$("#go_Page").click(function(){
		var page=parseInt($("#go_value").val());
		if(page==""||page==null){
			alert("请输入要跳转的页数");
		}else{
			sysLogin.list(page,path);
		}
	});
});