$(document).ready(function(){
    var datepicker;

    $('#time_picker').timepicker(); 
    datepicker = $('#start_date_picker');
    datepicker.datepicker();
    datepicker = $('#end_date_picker');
    datepicker.datepicker();
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
