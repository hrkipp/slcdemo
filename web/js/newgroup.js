$(document).ready(function(){
    loadSections();
    $('#time_picker').timepicker({defaultTime: '09:00 AM'}); 
    $("#start_date_picker").datepicker();
    $("#end_date_picker").datepicker();
});

function loadStudents(s){
    $.post("/dispatch",{
        action: actions.loadStudents,
        data : "{session : "+s+"}"
    },function(data){
        var students = jQuery.parseJSON(data).students;
        for(var i=0; i<students.length; i++){

        }
    });
}
function saveGroup(){
    var name = $("#name").val();
    var description = $("#description").val();
    var success = $("#success_condition").val();
    var students = $("");
    var start = $("#start_date_picker").val();
    var num_wks = $("#num_weeks").val();
    var session_length = $("#session_length").val();
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
        action: actions.loadSessions,
        data : ""
    },function(r){
        var data = jQuery.parseJSON(r);
        console.log(data);
        $("#username").html(data.username);
        var $select = $("#section_select");
        for(var i=0; i<data.sessions.length; i++){
            var session = data.sessions[i];
            $select.append("<option value='"+session.id+"'>"+session.name+"</option>");
        }
        $select.change(function(){
            loadStudents($select.val());
        });
    });
}
