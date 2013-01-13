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
        $row.append("<li class='progress'>"+buildProgress(point.progress)+"</li>");
        $row.append("<li class='score'>"+point.score+"</li>");
        $row.append("<li>"+point.observation+"</li>");

    }
}
function buildProgress(){

}