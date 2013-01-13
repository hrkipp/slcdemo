var group ="";
var activeWeek = 0;
$(document).ready(function(){
    group = window.location.search.substring(4,window.location.search.length);
    loadGroup();
//    loadMockGroup();
});
function loadMockGroup(){
    var mock = {
        name : "2nd Grade Subtraction Under 100",
        username : "L Kim",
        description : "Students will be able to subtract 2-digit numbers from 2-digit numbers under 100 using at least 2 strategies (jump back, jump up, expanded notation, traditional algorithm) and represent on a number line.",
        sections : [
            {
                name :  "Week 1",
                id : "id1",
                lessonObjective: "Students will be able to subtract one digit numbers from 2 digit numbers ( e.g. 71 - 3, 88 - 9) and multiples of 10 (e.g. 71 - 20, 84 - 50) using count back strategies and represent using a number line model.",
                data : [
                    {
                        name : "Felipe Cianciolo",
                        id : "id0",
                        score : "1",
                        observation : "unable to complete",
                        progress : "1"
                    },{
                        name : "Gerardo Rounsaville",
                        id : "id1",
                        score : "3",
                        observation : "average performance",
                        progress : "3"
                    },{
                        name : "Dominic Bavinon",
                        id : "id2",
                        score : "5",
                        observation : "Excellent",
                        progress : "5"
                    }
                ]
            },{
                name :  "Week 2",
                id : "id1",
                lessonObjective: "Students will be able to use addition to check accuracy of subtraction problems and use addition to solve subtraction problems (adding up to subtract.)",
                data : [
                    {
                        name : "Felipe Cianciolo",
                        id : "id0",
                        score : "1",
                        observation : "unable to complete 2",
                        progress : "2"
                    },{
                        name : "Gerardo Rounsaville",
                        id : "id1",
                        score : "3",
                        observation : "average performance 2",
                        progress : "4"
                    },{
                        name : "Dominic Bavinon",
                        id : "id2",
                        score : "5",
                        observation : "Excellent 2",
                        progress : "1"
                    }
                ]
            },{
                name :  "Week 3",
                id : "id1",
                lessonObjective: "Students will be able to subtract a 10 and some ones from any number under 100, model on a number line, and check using addition. (e.g. 83 - 14, 75 - 19)",
                data : [
                    {
                        name : "Felipe Cianciolo",
                        id : "id0",
                        score : "1",
                        observation : "unable to complete",
                        progress : "3"
                    },{
                        name : "Gerardo Rounsaville",
                        id : "id1",
                        score : "5",
                        observation : "average performance",
                        progress : "3"
                    },{
                        name : "Dominic Bavinon",
                        id : "id2",
                        score : "5",
                        observation : "Excellent",
                        progress : "2"
                    }
                ]
            },{
                name :  "Week 4",
                id : "id1",
                lessonObjective: "Students will be able to subtract 2-digit from 2-digit numbers under 100 using both count back and count up strategies, model on a number line diagram, and check with addition.",
                data : [
                    {
                        name : "Felipe Cianciolo",
                        id : "id0",
                        score : "1",
                        observation : "unable to complete",
                        progress : "3"
                    },{
                        name : "Gerardo Rounsaville",
                        id : "id1",
                        score : "5",
                        observation : "average performance",
                        progress : "3"
                    },{
                        name : "Dominic Bavinon",
                        id : "id2",
                        score : "5",
                        observation : "Excellent",
                        progress : "2"
                    }
                ]
            }
        ]
    }
    renderSessions(mock);
}
function loadGroup(){
    console.log(group);
    $.post("/dispatch",{
        action: actions.loadGroup,
        data : "{'id' : "+group+"}"
    },function(data){
        var response = jQuery.parseJSON(data);
        console.log(data);
        renderSessions(response);
    });
}
function renderSessions(m){
    $("#group_name").html(m.name);
    $("#group_description").html(m.description);
//    $("#lesson_objective").html(m.sections[0].lessonObjective);
    for(var i=0;i< m.sections.length;i++){
        addTab(m, i);
    }
    $(".nav_custom").children().eq(0).addClass("activetab");
    loadSession(m.sections[0]);

}

function addTab(m , index){
    console.log("adding tab "+index);
    var s = m.sections[index];
    var $tab = $("<div class='tab'><a href='#'>"+ s.name+"</a></div>");
    $(".lesson_objective").html(s.lessionObjective);
    $tab.click(function(){
        activeWeek = index;
        loadSession(s);
        $(".nav_custom").children().removeClass("activetab");
        $(this).addClass("activetab");
    });
    $(".nav_custom").append($tab);
}
function loadSession(s){
    console.log(s);
    var $body = $(".body").html("");
    for(var i=0; i< s.data.length; i++){
        var point = s.data[i];
        var $row = $("<li class='row' data-id='"+point.id+"'></li>");
        $row.append("<div class='name'>"+point.name+"</div>");
        $row.append(buildProgress(point, i));
        $row.append(buildScore(point, i));
        $row.append(buildObservation(point, i));
        $body.append($row);
    }
    $("#lesson_objective").html(s.lessonObjective);
}
function saveStudent(index){
    var $row = $(".row").eq(index);
    var id = $(".row").attr("data-id");
    var score = $row.find(".row_score").val();
        if(score.length == 0) score = null;
    var observation = $row.find(".row_observation").val();
    var progress = $row.find(".row_progress").val();
    var data = {
        cohort : group,
        student: id,
        score : score,
        observation : observation,
        progress: progress,
        week : activeWeek
    }
    console.log("saving");
    console.log(data);
    $.post("/dispatch",{
        action: actions.saveStudent,
        data : JSON.stringify(data)
    },function(data){
        var response = jQuery.parseJSON(data);
        console.log(data);
    });
}
function buildScore(point, student){
    var $score = $("<div class='score'><input type='number' class='row_score'></div>");
    $score.children().eq(0).val(point.score);
    $score.change(function(){
        saveStudent(student);
    })
    return $score;
}
function buildObservation(point, student){
    var $obs = $("<div class='observation'><textarea class='row_observation'>"+ point.observation+"</textarea></div>");
    $obs.change(function(){
        saveStudent(student);
    });
    return $obs;
}
function buildProgress(point, student){
    var $p = $("<select class='row_progress'></select>");
    for(var i=0; i<6; i++){
        $p.append("<option value='"+i+"'>"+i+"</option>");
    }
    if(point.progress > 0 ) $p.val(point.progress);
    $p.change(function(){
       saveStudent(student);
    });
    return $("<div class='student_progress'></div>").append($p);
}
