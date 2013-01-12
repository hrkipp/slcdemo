$(document).ready(function(){

});

function loadGroup(){
    $.post("/dispatch",{
        action: actions.loadGroup,
        data : "{email : test}"
    },function(data){
        var response = jQuery.parseJSON(data);
        console.log(data);
    });
}