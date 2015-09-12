function Roles(){
}
Roles.prototype={
		addIndex:function(path){
			window.location.href=path+"/Roles/addRolesIndex";
		},
		editIndex:function(dataid,path){
			window.location.href=path+"/Roles/editRolesIndex?roleId="+dataid;
		},
		add:function(path){
			$.ajax({
                cache: true,
                type: "post",
                url:path+"/Roles/addRoles",
                data:$('#add_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/Roles/getRolesAll"}, "1000");
                    }
                    else{
                    	alert("操作失败！");
                    }
                }
            });
		},
		edit:function(path){
			$.ajax({
                cache: true,
                type: "post",
                url:path+"/Roles/editRoles",
                data:$('#edit_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/Roles/getRolesAll"}, "1000");
                    }
                    else{
                    	alert("操作失败！");
                    }
                }
            });
		},
		del:function(id,path){
			$.ajax({
				type:"get",
			url:path+"/Roles/delRoles",
			data:{id:id},
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                if(data){
                	alert("操作成功！页面将自动跳转…………");
                	setTimeout(function(){window.location.href=path+"/Roles/getRolesAll"}, "1000");
                }
                else{
                	alert("操作失败！");
                }
            }
			});
		},
		list:function(page,path){
			window.location.href=path+"/Roles/getRolesAll?page="+page;
		}
}