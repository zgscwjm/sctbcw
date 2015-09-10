function Resource(){
}
Resource.prototype={
		addIndex:function(path){
			window.location.href=path+"/Resource/addResourceIndex";
		},
		editIndex:function(path){
			window.location.href=path+"/Resource/editResourceIndex";
		},
		add:function(path){
			$.ajax({
                cache: true,
                type: "post",
                url:path+"/Resource/addResource",
                data:$('#add_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/Resource/getResourceAll"}, "1000");
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
                url:path+"/Resource/editResource",
                data:$('#edit_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/Resource/getResourceAll"}, "1000");
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
			url:path+"/Resource/delResource",
			data:{id:id},
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                if(data){
                	alert("操作成功！页面将自动跳转…………");
                	setTimeout(function(){window.location.href=path+"/Resource/getResourceAll"}, "1000");
                }
                else{
                	alert("操作失败！");
                }
            }
			});
		}
}