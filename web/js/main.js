$(document).ready(function(){
    loadDashboard();
});

function loadDashboard(){
    $.post("/dispatch",{
        action: actions.loadSessions,
        data : ""
    },function(data){
        var response = jQuery.parseJSON(data);
        renderDashboard(response);
    });
}function renderDashboard(d){
    $("#username").html(d.name);
    for( var i=0; i< d.groups.length; i++){
        var group = d.groups[i];
        var $groupWidget = $("<a class='group_widget'></a>").attr('href',"group.html?id="+group.id);
        for(var j=0; j<group.sessions.length; j++){
            var col = group.sessions[j];
            var $col = $("<div class='group_column'></div>").appendTo($groupWidget);
            $col.width(1/col.length+"%");
            for(var k=0; k<col.length; k++){
                var $cell = $("<div class='progress_"+col[k]+"'></div>");
                $cell.height(1/col.length+"%");
                $col.append($cell)
            }
        }
    }
}
