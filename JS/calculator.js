var main = function() {
    var usNum = "";
    $(".standard button").click(function() {
        var number = $(this).text();
        usNum = usNum + number;
        console.log(usNum);
    });
};

$(document).ready(main)