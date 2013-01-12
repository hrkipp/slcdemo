$(document).ready(function(){

});
function loadStudents(){
    $.post("/dispatch",{
        action: actions.loadStudents,
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