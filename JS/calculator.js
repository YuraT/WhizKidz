var main = function () {
    var usNum = "";
    var numbers = [];
    var oper = [];
    var all = [];
    $(".standard button").click(function () {
        var input = $(this).text();

        if (["1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "."].indexOf(input) !== -1) {
            console.log("number clicked");
            usNum = usNum + input;
            all = all + usNum;
        }
        else if (["+", "-", "*", "/"] !== -1) {
            console.log(input + " sign clicked");
            numbers.push(parseFloat(usNum));
            usNum = "";
            oper.push(input);
            all = usNum + input;
            console.log(all);
        }
        else if (input === "=") {
            console.log(input + " sign clicked");

        }

        console.log(usNum);
        console.log(numbers);
        console.log(oper);
    });
};

$(document).ready(main);