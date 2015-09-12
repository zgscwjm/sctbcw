function NewsType(){
	
}
NewsType.prototype={
		addIndex:function(path){
			window.location.href=path+"/NewsType/addNewsTypeIndex";
		},
		editIndex:function(id,path){
			window.location.href=path+"/NewsType/editNewsTypeIndex?id="+id;
		},
		add:function(path){
			$.ajax({
				type:"POST",
				url:path+"/NewsType/addNewsType",
				data:$('#add_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/NewsType/getNewsTypeAll"}, "1000");
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
                url:path+"/NewsType/editNewsType",
                data:$('#edit_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/NewsType/getNewsTypeAll"}, "1000");
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
			url:path+"/NewsType/delNewsType",
			data:{id:id},
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                if(data){
                	alert("操作成功！页面将自动跳转…………");
                	setTimeout(function(){window.location.href=path+"/NewsType/getNewsTypeAll"}, "1000");
                }
                else{
                	alert("操作失败！");
                }
            }
			});
		},
		list:function(page,path){
			window.location.href=path+"/NewsType/getNewsTypeAll?page="+page;
		}
}