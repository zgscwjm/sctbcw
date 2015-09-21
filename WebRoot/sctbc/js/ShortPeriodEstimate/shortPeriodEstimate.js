function ShortPeriodEstimate(){
}
ShortPeriodEstimate.prototype={
		addIndex:function(path){
			window.location.href=path+"/ShortPeriodEstimate/addShortPeriodEstimateIndex";
		},
		editIndex:function(id,path){
			window.location.href=path+"/ShortPeriodEstimate/editShortPeriodEstimateIndex?id="+id;
		},
		see:function(id,path){
			window.location.href=path+"/ShortPeriodEstimate/seeShortPeriodEstimateByOne?id="+id;
		},
		add:function(path){
			$.ajax({
                cache: true,
                type: "post",
                url:path+"/ShortPeriodEstimate/addShortPeriodEstimate",
                data:$('#upload_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/ShortPeriodEstimate/getShortPeriodEstimateAll"}, "1000");
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
                url:path+"/ShortPeriodEstimate/editShortPeriodEstimate",
                data:$('#edit_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/ShortPeriodEstimate/getShortPeriodEstimateAll"}, "1000");
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
			url:path+"/ShortPeriodEstimate/delShortPeriodEstimate",
			data:{id:id},
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                if(data){
                	alert("操作成功！页面将自动跳转…………");
                	setTimeout(function(){window.location.href=path+"/ShortPeriodEstimate/getShortPeriodEstimateAll"}, "1000");
                }
                else{
                	alert("操作失败！");
                }
            }
			});
		},
		upload : function(path) {
			$("#upload_form").ajaxSubmit({
	            success: function(data) { // data 保存提交后返回的数据，一般为 json 数据
	            	alert("上传成功");
	                $("#memo1").val(data);
	                $("#upload_form").attr("enctype","application/x-www-form-urlencoded");
	            }
			});
		},
}