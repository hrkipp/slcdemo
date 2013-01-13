$(document).ready(function(){
    loadDashboard();
    $("#newcohort").click(function(){
        window.location = "NewGroup.html";
    });
});
function loadMockDashboard(){
    var ret = {
        name: "Mrs Linda Kim",
        groups: [
            {
                name: "2nd Grade Subtraction Under 100",
                id: "mi1",
                startWeek: 2,
                students: ["Felipe Cianciolo","Gerardo Rounsaville","Dominic Bavinon"],
                sessions: [[1,2,3],[1,1,2],[4,3,5],[3,3,3]],
                duration: 15
            },
            {
                name: "Math Overachievers 1",
                id: "mo1",
                startWeek: 3,
                students: ["Student 1","Student 2","Student 3"],
                sessions: [[1,1,1],[1,2,3],[2,2,4],[2,2,5],[3,3,5],[4,4,5]],
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
        renderDashboard(response);
    });
}function renderDashboard(d){
    $("#username").html(d.name);
    if(d.groups == null) return;
    var $weeks = $(".weeks_adjust");
    for(var w=1;w<53;w++){
        $weeks.append("<div class='week_cell'>Week "+w+"</div>");
        $("body").append("<div style='width:1px;background:#eee;position:absolute;top:40px;bottom:0;left:"+((w*100 + w)+15)+"px;z-index:-1'></div>");
    }
    console.log(getWeekNumber(new Date()));
    $(".current_week").css("left",101*getWeekNumber(new Date()) + 16+"px");
    for( var i=0; i< d.groups.length; i++){
        var group = d.groups[i];
        var $groupWidget = $("<a class='group_widget'></a>").attr('href',"group.html?id="+group.id);
        $groupWidget.css("left",101*(group.startWeek-1)+"px");
        $groupWidget.append("<div class='group_widget_name'>"+group.name+"</div>");
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
function getWeekNumber(d) {
    // Copy date so don't modify original
    d = new Date(d);
    d.setHours(0,0,0);
    // Set to nearest Thursday: current date + 4 - current day number
    // Make Sunday's day number 7
    d.setDate(d.getDate() + 4 - (d.getDay()||7));
    // Get first day of year
    var yearStart = new Date(d.getFullYear(),0,1);
    // Calculate full weeks to nearest Thursday
    var weekNo = Math.ceil(( ( (d - yearStart) / 86400000) + 1)/7)
    // Return array of year and week number
    return weekNo;
}