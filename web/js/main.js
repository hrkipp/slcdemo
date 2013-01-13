$(document).ready(function(){
    loadDashboard();
});

function loadDashboard(){
    $.post("/dispatch",{
        action: actions.loadSessions,
        data : ""
    },function(data){
        var response = jQuery.parseJSON(data);
        console.log(data);
    });
}

