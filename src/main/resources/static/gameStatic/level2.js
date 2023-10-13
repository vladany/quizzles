
// check2 + quiz2 
function level2() {
  $.ajax({
    url: "http://localhost:9596/quiz2",
    method: "GET",
    dataType: "text",
    success: function (data) {

      console.log("2 request initialized");

      var json = jQuery.parseJSON(data);

      $("#question").empty();
      $("#question").prepend(json.quizText);

      $("#option1").empty();
      $("#option1").prepend(json.optionRight);

      $("#option2").empty();
      $("#option2").prepend(json.optionElse1);

      $("#option3").empty();
      $("#option3").prepend(json.optionElse2);

      $("#option4").empty();
      $("#option4").prepend(json.optionElse3);

    }
  })
  // check + quiz 
  function checkLevel1() {
    $('#option1').click(function () {
      var inhalt = $(this).text();
      var requestUrl = "http://localhost:9596/check2?name=" + inhalt
      $.ajax({
        url: requestUrl,
        type: 'GET',
        success: function (result) {
          if (result == "Korrekt") {
            console.log(result + "Success");

            level2();
            checkLevel2();
            // GET NEW QUSTION

          } else {
            console.log("That's the end.");
            var failure = $("#failure");
            var question = $("#question");
            var option1 = $("#option1")
            var option2 = $("#option2")
            var option3 = $("#option3");
            var option4 = $("#option4");

            question.remove();
            option1.remove();
            option2.remove();
            option3.remove();
            option4.remove();

            failure.append("YOU LOOSE !!")
          }
        }
      })
    }
    )
  }
}
