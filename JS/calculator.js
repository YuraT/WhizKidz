var main = function () {
    var usNum = "";
    var numbers = [];
    var oper = [];
    var answ = 0;
    $(".standard button").click(function () {
        var input = $(this).text();

        if (["1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "."].indexOf(input) !== -1) {
            console.log("number clicked");
            usNum = usNum + input;
        }
        else if (["+", "-", "*", "/"] !== -1) {
            console.log(input + " sign clicked");
            numbers.push(parseFloat(usNum));
            usNum = "";
            oper.push(input);
            if (numbers.length === 2) {
                var op1 = oper.shift();
                var num1 = numbers.shift();
                var num2 = numbers.shift();
                
                switch(op1) {
                    case "+" :
                        answ = num1 + num2;
                        console.log(answ);
                        oper = [];
                        $("#answ-h2").text(answ);
                        break;
                    case "-" :
                        answ = num1 - num2;
                        console.log(answ);
                        oper = [];
                        $("#answ-h2").text(answ);
                        break;
                    case "*" :
                        answ = num1 * num2;
                        console.log(answ);
                        oper = [];
                        $("#answ-h2").text(answ);
                        break;
                    case "/" :
                        answ = num1 / num2
                        console.log(answ);
                        oper = [];
                        $("#answ-h2").text(answ);
                        break;
                }
            }
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