function TrainApply(){
}
TrainApply.prototype={
		addIndex:function(path){
			window.location.href=path+"/TrainApply/addTrainApplyIndex";
		},
		editIndex:function(path){
			window.location.href=path+"/TrainApply/editTrainApplyIndex";
		},
		add:function(nowtime,userId,applyKind,projectID,depID,applyReason,appDownload,finalCheck,path){
			$.ajax({
                type: "post",
                url:path+"/TrainApply/addTrainApply",
                data:{
                	applyDate:nowtime,userId:userId,applyKind:applyKind,projectId:projectID,depId:depID,applyReason:applyReason,appDownload:appDownload,finalCheck:finalCheck,
                },
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                	 
                	if(data=='timeout')
                     {
                     	alert("申请时间已过");
                     }
                	 else
                	if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/TrainApply/getTrainApplyAll"}, "1000");
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
                url:path+"/TrainApply/editTrainApply",
                data:$('#edit_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/TrainApply/getTrainApplyAll"}, "1000");
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
			url:path+"/TrainApply/delTrainApply",
			data:{id:id},
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                if(data){
                	alert("操作成功！页面将自动跳转…………");
                	setTimeout(function(){window.location.href=path+"/TrainApply/getTrainApplyAll"}, "1000");
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
	                // 此处可对 data 作相关处理
	                $("#appDownload").val(data);
	                alert("资料上传成功！");
	            }
			});
		}
}