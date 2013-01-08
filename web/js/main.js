$(document).ready(function(){
	$("#makeitso").click(function(){
		$.post("/dispatch",{
					action: actions.getuserinfo;
					data:
				},function(data){
					var response = jQuery.parseJSON(data);
					$("#result").html(data);
				});
	}
});