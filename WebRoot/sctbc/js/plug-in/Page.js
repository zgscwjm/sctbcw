function isPositiveNum(s) {// 是否为正整数
	var re = /^[0-9]*[1-9][0-9]*$/;
	return re.test(s)
}
function Page() {

}
Page.prototype = {
	apd : function(count, nowpage) {
		var html = "";
		var pagenum = 1;
		var firstpage=1;
		if(nowpage-6<=1){
			firstpage=1;
		}
		else{
			firstpage=nowpage-6;
		}
		
			pagenum = Math.ceil(count / 6);
		var datacount = pagenum;
		if(firstpage+5<datacount){
			datacount=firstpage+5;
		}
		html += '<a class="btn btn-default" style="margin-left:20%;">' + count
				+ '条记录&nbsp;'+nowpage+'/'+datacount+'页</a>';
		html += '<a class="btn btn-default" id="on_Page" >上一页</a>';
		html+='<span style="margin-left:1%;"></span>';
			for (var i = firstpage; i <= datacount; i++) {
				if(i>nowpage+1){
					break;
				}
					if (i == nowpage) {
						html += '<a href="javascript:;" class="btn btn-primary" id="onepagenum" value="'+i+'">'
								+ i + '</a>';
					}else if(nowpage==0&&i==1){
						html += '<a href="javascript:;" class="btn btn-primary" id="onepagenum" value="'+i+'">'
						+ i + '</a>';
					} 
					else {
						html += '<a href="javascript:;" class="btn btn-default" id="onepagenum" value="'+i+'">'
								+ i + '</a>';
					}
			}
			if(parseInt(nowpage)+5<datacount){
				html += '<a href="javascript:;" class="btn btn-default">...</a>';
			}
		html += '<a class="btn btn-default" id="up_Page">下一页</a>';
		html += '<input type="test" size="1" class="btn btn-default" id="go_value" placeholder="跳"/>';
		html += '<button class="btn btn-default" type="button" id="go_Page">GO</button>';
		$("#Page_div").html(html);
	}
}