function TeachStaffEnlargeInfo(){
}
TeachStaffEnlargeInfo.prototype={
		addIndex:function(path){
			window.location.href=path+"/TeachStaffEnlargeInfo/addTeachStaffEnlargeInfoIndex";
		},
		editIndex:function(userId,path){
			window.location.href=path+"/TeachStaffEnlargeInfo/editTeachStaffEnlargeInfoIndex?userId"+userId;
		},
		add:function(path){
			$.ajax({
                cache: true,
                type: "post",
                url:path+"/TeachStaffEnlargeInfo/addTeachStaffEnlargeInfo",
                data:$('#add_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/TeachStaffEnlargeInfo/getTeachStaffEnlargeInfoAll"}, "1000");
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
                url:path+"/TeachStaffEnlargeInfo/editTeachStaffEnlargeInfo",
                data:$('#edit_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/TeachStaffEnlargeInfo/getTeachStaffEnlargeInfoAll"}, "1000");
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
			url:path+"/TeachStaffEnlargeInfo/delTeachStaffEnlargeInfo",
			data:{id:id},
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                if(data){
                	alert("操作成功！页面将自动跳转…………");
                	setTimeout(function(){window.location.href=path+"/TeachStaffEnlargeInfo/getTeachStaffEnlargeInfoAll"}, "1000");
                }
                else{
                	alert("操作失败！");
                }
            }
			});
		}
}