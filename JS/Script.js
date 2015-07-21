var surv = function() {
    var gog = prompt("Do you like CodeCademy?"); //yes or no
    if (gog === "yes")
    {
        $("#Tnx").show()
    }
    else
    {
        $("#TiO").show()
    }    
}

var main = function(){
    $("#surv").click(function() {
     surv()   
    })
    $(document).keypress(function(event) {
        console.log(event)
        if (event.which === 113)
        {
            $("#surv").toggle();
        }
     }
    )
}
$(document).ready(main)