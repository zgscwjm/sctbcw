function AuditingOpinion(){
}
AuditingOpinion.prototype={
		addIndex:function(path){
			window.location.href=path+"/AuditingOpinion/addAuditingOpinionIndex";
		},
		editIndex:function(path){
			window.location.href=path+"/AuditingOpinion/editAuditingOpinionIndex";
		},
		add:function(path){
			$.ajax({
                cache: true,
                type: "post",
                url:path+"/AuditingOpinion/addAuditingOpinion",
                data:$('#add_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/AuditingOpinion/getAuditingOpinionAll"}, "1000");
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
                url:path+"/AuditingOpinion/editAuditingOpinion",
                data:$('#edit_form').serialize(),
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
                    if(data){
                    	alert("操作成功！页面将自动跳转…………");
                    	setTimeout(function(){window.location.href=path+"/AuditingOpinion/getAuditingOpinionAll"}, "1000");
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
			url:path+"/AuditingOpinion/delAuditingOpinion",
			data:{id:id},
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                if(data){
                	alert("操作成功！页面将自动跳转…………");
                	setTimeout(function(){window.location.href=path+"/AuditingOpinion/getAuditingOpinionAll"}, "1000");
                }
                else{
                	alert("操作失败！");
                }
            }
			});
		},
		sh:function(id,val,reason,trainApplyId,path){
			$.ajax({
				type:"post",
			url:path+"/Review/SHAuditingOpinion",
			data:{id:id,val:val,reason:reason,trainApplyId:trainApplyId},
            error: function(request) {
                alert("Connection error");
            },
            success: function(data) {
                if(data){
                	alert("操作成功！页面将自动跳转…………");
                	setTimeout(function(){window.location.href=path+"/Review/getReviewTrainAll"}, "500");
                }
                else{
                	alert("操作失败！");
                }
            }
			});
		}
}