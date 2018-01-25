import Main.playerInput

object Player {


    val rock = "rock"
    val scissors = "scissors"
    val paper = "paper"


    def input(str: String): Any = {

      if (playerInput.equalsIgnoreCase("rock")) println("You use " + rock)
      if (playerInput.equalsIgnoreCase("scissors")) println("You use " + scissors)
      if (playerInput.equalsIgnoreCase("paper")) println("You use " + paper)

    }
}
