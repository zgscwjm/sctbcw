var curWwwPath = window.document.location.href;
var pathName = window.document.location.pathname;
var pos = curWwwPath.indexOf(pathName);
var localhostPaht = curWwwPath.substring(0, pos);
var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
var path = localhostPaht + projectName;

var sysLogin = new SysLogin();
 //
jQuery(function() {
	$("#del_btn").live("click",function(){
		var id=$(this).attr("dataid");
		sysLogin.del(id,path);
	});
});