import Main._

object Game {


  val win = "win"
  val lose = "lose"
  val draw = "draw"

  val winningScore = Int



  def result(m1: String, m2: String) = {
    var result1 : String = ""
    (m1, m2) match {
      case ("rock", "paper") => result1 = lose
      case  ("rock", "rock") => result1 = draw
      case  ("rock" ,"scissors") => result1 = win

      case  ("paper", "scissors") => result1 = lose
      case ("paper", "paper") => result1 = draw
      case  ("paper", "rock") => result1 = win

      case ("scissors", "paper") => result1 = lose
      case  ("scissors", "scissors") => result1 = draw
      case ("scissors","rock") => result1 = win
    }
    println(result1)
  }


}
