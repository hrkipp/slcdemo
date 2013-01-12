$(document).ready(function(){
	$("#makeitso").click(function(){
		$.post("/dispatch",{
					action: actions.getUserInfo,
					data : "{email : test}"
				},function(data){
					var response = jQuery.parseJSON(data);
                    console.log(data);
					$("#result").html(response);
				});
	})

});