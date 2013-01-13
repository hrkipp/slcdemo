$(document).ready(function(){
    loadDashboard();
});

function loadDashboard(){
    $.post("/dispatch",{
        action: actions.loadDashboard,
        data : "{email : test}"
    },function(data){
        var response = jQuery.parseJSON(data);
        console.log(data);
    });
}

