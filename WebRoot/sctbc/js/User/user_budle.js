var curWwwPath = window.document.location.href;
var pathName = window.document.location.pathname;
var pos = curWwwPath.indexOf(pathName);
var localhostPaht = curWwwPath.substring(0, pos);
var projectName = pathName.substring(0, pathName.substr(1).indexOf('/') + 1);
var path = localhostPaht + projectName;

var user = new User();
var page = new Page();
//
jQuery(function() {
	var count = $("#count").val();
	var nowpage=$("#nowpage").val();
	
	page.apd(count,nowpage);
	
	$("#add_index_a").click(function() {
		user.addIndex(path);
	});

	$("#edit_btn").live("click", function() {
		var dataid = $(this).attr("dataid");
		user.editIndex(path, dataid);
	});

	$("#add_sub").click(function() {

		user.add(path);
	});
	$("#edit_sub").click(function() {
		user.edit(path);
	});

	$("#del_btn").live("click", function() {
		var id = $(this).attr("dataid");
		user.del(id, path);
	});

	$("#search_btn").click(function() {
		var searchvalue = $("#search").val();
		user.search(searchvalue, path);
	});
	$("#getuserinfo_btn").click(function() {
		var userid = $(this).attr("dataid");
		user.getuserinfo(userid, path);
	});
	
	$("#onepagenum").live("click",function(){
		var page = $(this).attr("value");
		user.list(page,path);
	});
	$("#on_Page").click(function(){
		var page=$("#nowpage").val();
		user.list(page-1,path);
	});
	$("#up_Page").click(function(){
		var page=parseInt($("#nowpage").val());
		user.list(page+1,path);
	});
	$("#go_Page").click(function(){
		var page=parseInt($("#go_value").val());
		if(page==""||page==null){
			alert("请输入要跳转的页数");
		}else{
			user.list(page,path);
		}
	});
	
	
	

	function returnprompt() {
		$("#prompt_h4").hide("300");
		$("#title_h4").fadeIn("300");
	}

	function prompt(testvalue) {
		$("#title_h4").hide();
		$("#prompt_h4").css("background-color", "#68DFF0");
		$("#prompt_h4 #prompt").text(testvalue + "，请重新输入!");
		$("#prompt_h4").slideDown();
		setTimeout(function() {
			returnprompt();
		}, 2000);
	}

	$("#first_next").click(function() {
		var userID = $("#userID").val();
		var roleID = $("#roleID").val();
		var RepeatPassword = $("#RepeatPassword").val();
		var password = $("#password").val();
		if (validate0_0(userID)) {
			if (roleID != -1) {
				if (validate0_0(password)) {
					if (validate_dataEqual(password, RepeatPassword)) {
						$("#USERID2").attr("value", userID);
						$("#USERID3").attr("value", userID);
						$("#first").hide();
						$("#second").fadeIn("500");
					} else {
						prompt("两次输入密码不一样");
					}
				} else {
					prompt("密码不能为空");
				}
			} else {
				prompt("请选择角色");
			}
		} else {
			prompt("用户名不能为空");
		}
	});
	$("#return_first").click(function() {
		$("#second").hide("200");
		$("#first").fadeIn("700");
	});

	$("#second_next").click(function() {
		var userID = $("#userID").val();
		var name = $("#name").val();
		if (validate0_0(userID)) {
			if (validate0_0(name)) {
				$("#second").hide();
				$("#three").fadeIn("500");
			} else {
				prompt("姓名不能为空");
			}
		} else {
			prompt("教工编号不能为空");
		}
	});
	$("#return_second").click(function() {
		$("#three").hide();
		$("#second").fadeIn("500");
	});

});