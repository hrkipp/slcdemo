$(document).ready(function(){
    loadDashboard();
});

function loadDashboard(){
    $.get("/dispatch",{
        action: actions.loadDashboard,
        data : "{email : test}"
    },function(data){
        var response = jQuery.parseJSON(data);
        console.log(data);
    });
}

