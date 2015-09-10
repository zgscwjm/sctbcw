function SysLogin(){
}
SysLogin.prototype={
		del:function(id,path){
			$.ajax({
				type:"get",
			url:path+"/SysLogin/delSysLogin",
			data:{id:id},
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                if(data){
                	alert("操作成功！页面将自动跳转…………");
                	setTimeout(function(){window.location.href=path+"/SysLogin/getSysLoginAll"}, "1000");
                }
                else{
                	alert("操作失败！");
                }
            }
			});
		}
}