function LongPeriodEstimate(){
}
LongPeriodEstimate.prototype={
		addIndex:function(path){
			window.location.href=path+"/LongPeriodEstimate/addLongPeriodEstimateIndex";
		},
		editIndex:function(path){
			window.location.href=path+"/LongPeriodEstimate/editLongPeriodEstimateIndex";
		},
		see:function(id,path){
			window.location.href=path+"/LongPeriodEstimate/seeLongPeriodEstimateByOne?id="+id;
		},
		add:function(path){
			$.ajax({
                cache: true,
                type: "post",
                url:path+"/LongPeriodEstimate/addLongPeriodEstimate",
                data:$('#add_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/LongPeriodEstimate/getLongPeriodEstimateAll"}, "1000");
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
                url:path+"/LongPeriodEstimate/editLongPeriodEstimate",
                data:$('#edit_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/LongPeriodEstimate/getLongPeriodEstimateAll"}, "1000");
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
			url:path+"/LongPeriodEstimate/delLongPeriodEstimate",
			data:{id:id},
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                if(data){
                	alert("操作成功！页面将自动跳转…………");
                	setTimeout(function(){window.location.href=path+"/LongPeriodEstimate/getLongPeriodEstimateAll"}, "1000");
                }
                else{
                	alert("操作失败！");
                }
            }
			});
		}
}