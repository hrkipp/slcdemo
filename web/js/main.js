$(document).ready(function(){
    loadMockDashboard();
    //loadDashboard();
});
function loadMockDashboard(){
    var ret = {
        name: "Linda Kim",
        groups: [{
            name: "Math Intervention 1",
            id: "mi1",
            sessions: [[1,2,3,4,5],[1,1,2,2,3],[4,3,5,2,5],[3,3,3,2,1]]
        }]
    };
    renderDashboard(ret);
}
function loadDashboard(){
    console.log("loading dashboard");
    $.post("/dispatch",{
        action: actions.loadDashboard,
        data : ""
    },function(data){
        console.log(data);
        var response = jQuery.parseJSON(data);
        console.log(response);
        alert(response);
        renderDashboard(response);
    });
}function renderDashboard(d){
    $("#username").html(d.name);
    if(d.groups == null) return;
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
        $("#groups_container").append($groupWidget);
    }
}
