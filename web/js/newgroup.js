$(document).ready(function(){
    loadSections();
    $("#start_date_picker").datepicker();
    $("#end_date_picker").datepicker();
    $("#create_cohort").click(function(){
        saveGroup();
    });
    $("#num_weeks").change(function(){
        console.log("change");
        var $list = $(".learning_objectives").html("");
        var num_weeks = $(this).val();
        console.log(num_weeks);
        for(var i=1; i<=num_weeks; i++){
            var $lo = $("<div class='lo_row'><div class='lo_label'>Week "+i+"</div><input type='text'></div>")
            $list.append($lo);
        }
    });
});

function loadStudents(s){
    $.post("/dispatch",{
        action: actions.loadStudents,
        data : "{session : "+s+"}"
    },function(data){
        var students = jQuery.parseJSON(data).students;
        console.log(students);
        var list = $("#student_list").html("");
        for(var i=0; i<students.length; i++){
            var st = students[i];
           var $student = $("<div class='student_row'><input type='checkbox' data-id='"+st.id+"'><div class='student_name'>"+st.name+"</div></div>");
            list.append($student);
        }
    });
}
function saveGroup(){
    var los = new Array();
    $(".lo_row").find("input").each(function(){
        los.push($(this).val());
    });
    var students = new Array();
    $("#student_list").find("input:checked").each(function(){
        students.push($(this).attr('data-id'));
    });
    console.log(students);
    console.log(los);
    var data = {
        name : $("#name").val(),
        description : $("#description").val(),
        successCondition : $("#success_condition").val(),
        students : students,
        startDate : new Date($("#start_date_picker").val()).getTime(),
        numOfWeeks : $("#num_weeks").val(),
        learningObjectives : los
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
        $select.append("<option></option>");
        for(var i=0; i<data.sessions.length; i++){
            var session = data.sessions[i];
            $select.append("<option value='"+session.id+"'>"+session.name+"</option>");
        }
        $select.change(function(){
            loadStudents($select.val());
        });
    });
}
