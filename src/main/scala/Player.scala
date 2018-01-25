import Main.playerInput

object Player {

    val rock = "rock"
    val scissors = "scissors"
    val paper = "paper"


    def input(str: String): Unit = {

      if (playerInput.equalsIgnoreCase("rock")) println(rock)
      if (playerInput.equalsIgnoreCase("scissors")) println(scissors)
      if (playerInput.equalsIgnoreCase("paper")) println(paper)

    }
}
