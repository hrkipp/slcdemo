$(document).ready(function(){
    loadMockDashboard();
    //loadDashboard();
});
function loadMockDashboard(){
    var ret = {
        name: "Linda Kim",
        groups: [
            {
                name: "Math Intervention 1",
                id: "mi1",
                students: ["Student 1","Student 2","Student 3","Student 4","Student 5"],
                sessions: [[1,2,3,4,5],[1,1,2,2,3],[4,3,5,2,5],[3,3,3,2,1]],
                duration: 15
            },
            {
                name: "Math Overachievers 1",
                id: "mo1",
                students: ["Student 1","Student 2","Student 3","Student 4","Student 5"],
                sessions: [[1,2,3,4,5],[1,1,2,2,3],[4,3,5,2,5],[3,3,3,2,1],[5,1,4,2,1],[2,3,4,1,5]],
                duration: 30
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
        var $students = $("<div class='student_col'></div>");
        for(var s=0; s<group.students.length; s++){
            $students.append("<div>"+group.students[s]+"</div>");
        }
        $groupWidget.append($students);
        for(var j=0; j<group.sessions.length; j++){
            var col = group.sessions[j];
            var $col = $("<div class='group_column'></div>").appendTo($groupWidget);
            for(var k=0; k<col.length; k++){
                var $cell = $("<div class='group_cell'><div class='progress' style='width:"+(col[k]/5.0)*100+"%'></div></div>");
                $col.append($cell)
            }
        }
        $("#groups_container").append($("<div></div>").append($groupWidget));
    }
}
