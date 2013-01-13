$(document).ready(function(){
//   loadGroup();
    loadMockGroup();
});
function loadMockGroup(){
    var mock = {
        name : "Math Intervention 1",
        username : "L Kim",
        description : "Have all students achieve an average or above profficency in multiplication",
        sections : [
            {
                name :  "Week 1",
                id : "id1",
                lessonObjective: "do better",
                data : [
                    {
                        name : "Student 1",
                        id : "id0",
                        score : "1",
                        observation : "unable to complete",
                        progress : "1"
                    },{
                        name : "Student 2",
                        id : "id1",
                        score : "3",
                        observation : "average performance",
                        progress : "3"
                    },{
                        name : "Student 3",
                        id : "id2",
                        score : "5",
                        observation : "Excellent",
                        progress : "5"
                    }
                ]
            },{
                name :  "Week 2",
                id : "id1",
                lessonObjective: "do better again",
                data : [
                    {
                        name : "Student 1",
                        id : "id0",
                        score : "1",
                        observation : "unable to complete 2",
                        progress : "2"
                    },{
                        name : "Student 2",
                        id : "id1",
                        score : "3",
                        observation : "average performance 2",
                        progress : "4"
                    },{
                        name : "Student 3",
                        id : "id2",
                        score : "5",
                        observation : "Excellent 2",
                        progress : "1"
                    }
                ]
            },{
                name :  "Week 3",
                id : "id1",
                lessonObjective: "do better yet again",
                data : [
                    {
                        name : "Student 1",
                        id : "id0",
                        score : "1",
                        observation : "unable to complete",
                        progress : "3"
                    },{
                        name : "Student 2",
                        id : "id1",
                        score : "5",
                        observation : "average performance",
                        progress : "3"
                    },{
                        name : "Student 3",
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
    $.post("/dispatch",{
        action: actions.loadGroup,
        data : "{email : test}"
    },function(data){
        var response = jQuery.parseJSON(data);
        console.log(data);
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
        console.log("click");
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
        var $row = $("<li class='row'></li>");
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
    var score = $row.find(".row_score").val();
    var observation = $row.find(".row_observation").val();
    var progress = $row.find(".row_progress").val();
    $.post("/dispatch",{
        action: actions.SaveStudent,
        data : "{score:"+score+",observation:"+observation+",progress:"+progress+"}"
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
