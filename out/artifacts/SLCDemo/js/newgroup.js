$(document).ready(function(){
    loadSections();
    $("#start_date_picker").datepicker();
    $("#end_date_picker").datepicker();
    $("#create_cohort").click(function(){
        saveGroup();
    });
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
    var data = {
        name : $("#name").val(),
        description : $("#description").val(),
        successCondition : $("#success_condition").val(),
        students : $(""),
        startDate : $("#start_date_picker").val(),
        numOfWeeks : $("#num_weeks").val()
    }
        $.post("/dispatch",{
            action: actions.saveGroup,
            data : JSON.stringify(data)
        },function(data){
            var response = jQuery.parseJSON(data);
            console.log(data);
        });
    var session_length = $("#session_length").val();
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
