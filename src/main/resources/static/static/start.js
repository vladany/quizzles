$(document).ready(

  function firstRequest() {
    $.ajax({
      url: "http://localhost:9596/quiz",
      method: "GET",
      dataType: "text",
      success: function (data) {

        console.log("first request initialized");

        var json = jQuery.parseJSON(data);


        $('#game').append('<p id="question"></p>');
        $("#question").empty();
        $("#question").prepend(json.quizText);


        $('#game').append('<button class="click" id="option1"></button>');
        $("#option1").empty();
        $("#option1").prepend(json.optionRight);


        $('#game').append('<button class="click" id="option2"></button>');
        $("#option2").empty();
        $("#option2").prepend(json.optionElse1);


        $('#game').append('<button class="click" id="option3"></button>');
        $("#option3").empty();
        $("#option3").prepend(json.optionElse2);


        $('#game').append('<button class="click" id="option4"></button>');
        $("#option4").empty();
        $("#option4").prepend(json.optionElse3);

        var score = $("#score");
        score.append("SCORE: 0 ");


        $(".click").on('click', function () {
          var inhalt = $(this).text();
          var requestUrl = "http://localhost:9596/check?name=" + inhalt
          $.ajax({
            url: requestUrl,
            type: 'GET',
            success: function (result) {
              if (result == "Korrekt") {
                console.log(result + "Success");

                //Question two initialization
                $.ajax({
                  url: "http://localhost:9596/quiz2",
                  method: "GET",
                  dataType: "text",
                  success: function (data) {

                    console.log("second request initialized");

                    var json = jQuery.parseJSON(data);



                    $('#game').append('<p id="question"></p>');
                    $("#question").empty();
                    $("#question").prepend(json.quizText);


                    $('#game').append('<button class="click1" id="option1"></button>');
                    $("#option1").remove();
                    $("#option1").prepend(json.optionRight);


                    $('#game').append('<button class="click1" id="option2"></button>');
                    $("#option2").remove();
                    $("#option2").prepend(json.optionElse1);


                    $('#game').append('<button class="click1" id="option3"></button>');
                    $("#option3").remove();
                    $("#option3").prepend(json.optionElse2);


                    $('#game').append('<button class="click1" id="option4"></button>');
                    $("#option4").remove();
                    $("#option4").prepend(json.optionElse3);
                    var score = $("#score");
                    score.empty();
                    score.append("SCORE: 5");

                    $(".click1").on('click', function () {
                      var inhalt = $(this).text();
                      var requestUrl = "http://localhost:9596/check2?name=" + inhalt
                      $.ajax({
                        url: requestUrl,
                        type: 'GET',
                        success: function (result) {
                          if (result == "Korrekt") {
                            console.log(result + "Success");
                            // third question initialized
                            $.ajax({
                              url: "http://localhost:9596/quiz3",
                              method: "GET",
                              dataType: "text",
                              success: function (data) {

                                console.log("third request initialized");

                                var json = jQuery.parseJSON(data);



                                $('#game').append('<p id="question"></p>');
                                $("#question").empty();
                                $("#question").prepend(json.quizText);


                                $('#game').append('<button class="click3" id="option1"></button>');
                                $("#option1").remove();
                                $("#option1").prepend(json.optionElse2);


                                $('#game').append('<button class="click3" id="option2"></button>');
                                $("#option2").remove();
                                $("#option2").prepend(json.optionElse1);


                                $('#game').append('<button class="click3" id="option3"></button>');
                                $("#option3").remove();
                                $("#option3").prepend(json.optionRight);


                                $('#game').append('<button class="click3" id="option4"></button>');
                                $("#option4").remove();
                                $("#option4").prepend(json.optionElse3);
                                var score = $("#score");
                                score.empty();
                                score.append("SCORE: 10");

                                $(".click3").on('click', function () {
                                  var inhalt = $(this).text();
                                  var requestUrl = "http://localhost:9596/check3?name=" + inhalt
                                  $.ajax({
                                    url: requestUrl,
                                    type: 'GET',
                                    success: function (result) {
                                      if (result == "Korrekt") {
                                        console.log(result + "Success");
                                        var score = $("#score");
                                        score.empty();
                                        score.append("SCORE: 15");
                                        score.append(" - Du bist ein Gewinner! Du hast die volle Score-Punktzahl erreicht!");
                                      }
                                      else {

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
                                        alert("Score: 10")

                                        failure.append("YOU LOOSE !!")
                                      }



                                    }
                                  })
                                })
                              }
                            })




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
                            alert("Score: 5")

                            failure.append("YOU LOOSE !!")
                          }
                        }
                      })
                    })
                  }
                })
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
                alert("Score: 0")

                failure.append("YOU LOOSE !!")
              }
            }
          })
        })
      }
    })
  })
