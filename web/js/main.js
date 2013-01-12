$(document).ready(function(){
    loadDashboard();
    $("#login").click(function(){ login(); });
});

function login(){

}
function loadDashboard(){
    $.post("/dispatch",{
        action: actions.loadDashboard,
        data : "{email : test}"
    },function(data){
        var response = jQuery.parseJSON(data);
        console.log(data);
    });
}

