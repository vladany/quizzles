$(document).ready(
  // check + quiz
  function checkLevel1() {
    $('.click').click(function () {
      var inhalt = $(this).text();
      var requestUrl = "http://localhost:9596/check?name=" + inhalt
      $.ajax({
        url: requestUrl,
        type: 'GET',
        success: function (result) {
          if (result == "Korrekt") {
            console.log(result + "Success");

            level2();

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

);