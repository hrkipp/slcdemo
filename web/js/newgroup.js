$(document).ready(function(){

    $('#time_picker').timepicker({defaultTime: '09:00 AM'}); 
    $("#start_date_picker").datepicker();
    $("#end_date_picker").datepicker();
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

function loadSections() {
    $.post("/dispatch",{
        action: actions.loadSections,
        data : "{email : test}"
    },function(data){
        var response = jQuery.parseJSON(data);
        console.log(data);
    });
}
