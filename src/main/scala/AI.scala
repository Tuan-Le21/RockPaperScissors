

object AI {

  def moveAI( Str: String) : String = {
    val randomAI = new scala.util.Random
    val randomNum = randomAI.nextInt(2)
    var choiceAi  = " "
    if (randomNum == 0 )(choiceAi = "rock")
    if (randomNum == 1 ) (choiceAi = "scissors")
    if (randomNum == 2 ) (choiceAi = "paper")

    return choiceAi




  }
}




