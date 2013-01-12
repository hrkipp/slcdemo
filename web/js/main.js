
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
function loadStudents(){
    $.post("/dispatch",{
        action: actions.loadStudents,
        data : "{email : test}"
    },function(data){
        var response = jQuery.parseJSON(data);
        console.log(data);
    });
}
function loadGroup(){
    $.post("/dispatch",{
        action: actions.loadGroup,
        data : "{email : test}"
    },function(data){
        var response = jQuery.parseJSON(data);
        console.log(data);
    });
}
function saveGroup(){
    $.post("/dispatch",{
        action: actions.saveGroup,
        data : "{email : test}"
    },function(data){
        var response = jQuery.parseJSON(data);
        console.log(data);
    });
}