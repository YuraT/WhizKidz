var main = function () {
    var usNum = "", 
        numbers = [], 
        oper = [], 
        answ = 0, 
        output = "";
    $(".standard button").click(function () {
        var input = $(this).text();

        if (["1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "."].indexOf(input) !== -1) {
            console.log("number clicked");
            usNum = usNum + input;
            output = output + input;
            $("#answ-h2").text(output);
        }
        else if (["+", "-", "*", "/", "="].indexOf(input) !== -1) {
            console.log(input + " sign clicked");
            var parsedNum = parseFloat(usNum)
            if (isNaN(parsedNum) === false) {
                numbers.push(parsedNum)
            }
            usNum = "";
            
            if (numbers.length >= 1) {
                oper.push(input);
                output = output + input;
                $("#answ-h2").text(output);
            }
            
            if (numbers.length === 2) {
                var op1 = oper.shift();
                var num1 = numbers.shift();
                var num2 = numbers.shift();
                
                switch(op1) {
                    case "+" :
                        answ = num1 + num2;
                        console.log(answ);
                        oper = [];
                        $("#answ-h2").text(output + answ);
                        output = "";
                        break;
                    case "-" :
                        answ = num1 - num2;
                        console.log(answ);
                        oper = [];
                        $("#answ-h2").text(output + answ);
                        output = "";
                        break;
                    case "*" :
                        answ = num1 * num2;
                        console.log(answ);
                        oper = [];
                        $("#answ-h2").text(output + answ);
                        output = "";
                        break;
                    case "/" :
                        answ = num1 / num2
                        console.log(answ);
                        oper = [];
                        $("#answ-h2").text(output + answ);
                        output = "";
                        break;
                }
            }
        }
        console.log(usNum);
        console.log(numbers);
        console.log(oper);
    });
    
    $("#clear").click(function() {
        usNum = "";
        numbers = [];
        oper = [];
        answ = 0;
        output = "";
        
        $("#answ-h2").text(output);
    });
};

$(document).ready(main);