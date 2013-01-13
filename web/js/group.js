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

function addSession(s){
    var $tab = $("<li><a href='#'>"+ s.name+"</a></li>");
    $(".lesson_objective").html(s.lessionObjective);
    $tab.click(function(){
        loadSession(s.data);
    });
    $(".nav-tabs").append($tab);
}
function loadSession(s){
    var $body = $(".body");
    for(var i=0; i< s.data.length; i++){
        var point = s.data[i];
        var $row = $("<ul class='row'></ul>");
        $row.append("<li class='name'>"+point.name+"</li>");
        $row.append(buildProgress(point, i));
        $row.append(buildScore(point, i));
        $row.append(buildObservation(point, i));

    }
}
function saveStudent(index){
    var $row = $(".row").eq(index);

}
function buildScore(point, student){
    var $score = $("<li class='score'><input type='number'></li>");
    $score.val(point.score);
    $score.change(function(){
        saveStudent(student);
    })
}
function buildObservation(point, student){
    var $obs = $("<li><textarea>"+ point.observation+"</textarea></li>");
    $obs.change(function(){
        saveStudent(student);
    });
    return $obs;
}
function buildProgress(point, student){
    var $p = $("<select></select>");
    for(var i=0; i<6; i++){
        $p.append("<option value='"+i+"'>"+i+"</option>");
    }
    if(point.progress > 0 ) $p.val(point.progress);
    $p.change(function(){
       saveStudent(student);
    });
    return "<li class='progress'>"+$p+"</li>";
}
