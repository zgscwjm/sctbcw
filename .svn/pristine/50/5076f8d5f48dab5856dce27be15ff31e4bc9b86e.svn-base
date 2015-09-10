function TeachStaffInfo(){
}
TeachStaffInfo.prototype={
		addIndex:function(path){
			window.location.href=path+"/TeachStaffInfo/addTeachStaffInfoIndex";
		},
		editIndex:function(path){
			window.location.href=path+"/TeachStaffInfo/editTeachStaffInfoIndex";
		},
		add:function(path){
			$.ajax({
                cache: true,
                type: "post",
                url:path+"/TeachStaffInfo/addTeachStaffInfo",
                data:$('#add_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/TeachStaffInfo/getTeachStaffInfoAll"}, "1000");
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
                url:path+"/TeachStaffInfo/editTeachStaffInfo",
                data:$('#edit_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/TeachStaffInfo/getTeachStaffInfoAll"}, "1000");
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
			url:path+"/TeachStaffInfo/delTeachStaffInfo",
			data:{id:id},
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                if(data){
                	alert("操作成功！页面将自动跳转…………");
                	setTimeout(function(){window.location.href=path+"/TeachStaffInfo/getTeachStaffInfoAll"}, "1000");
                }
                else{
                	alert("操作失败！");
                }
            }
			});
		}
}