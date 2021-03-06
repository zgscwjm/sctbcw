function TrainInfo(){
}
TrainInfo.prototype={
		addIndex:function(path){
			window.location.href=path+"/TrainInfo/addTrainInfoIndex";
		},
		editIndex:function(path){
			window.location.href=path+"/TrainInfo/editTrainInfoIndex";
		},
		add:function(path){
			$.ajax({
                cache: true,
                type: "post",
                url:path+"/TrainInfo/addTrainInfo",
                data:$('#add_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/TrainInfo/getTrainInfoAll"}, "1000");
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
                url:path+"/TrainInfo/editTrainInfo",
                data:$('#edit_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/TrainInfo/getTrainInfoAll"}, "1000");
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
			url:path+"/TrainInfo/delTrainInfo",
			data:{id:id},
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                if(data){
                	alert("操作成功！页面将自动跳转…………");
                	setTimeout(function(){window.location.href=path+"/TrainInfo/getTrainInfoAll"}, "1000");
                }
                else{
                	alert("操作失败！");
                }
            }
			});
		}
}