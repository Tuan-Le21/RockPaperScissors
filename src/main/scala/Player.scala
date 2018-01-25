class Player {
  import java.util.Scanner

  class Player {
    val playerInput = scala.io.StdIn.readLine("Rock, Papers or Scissors?")
    val s = new Scanner(System.in)
    val a = s.nextInt()
    val line = s.nextLine()

    val rock = "rock"
    val scissors = "scissors"
    val paper = "paper"


    def input(): Unit = {

      if (playerInput.equalsIgnoreCase("rock")) println(rock)
      else if (playerInput.equalsIgnoreCase("scissors")) println(scissors)
      else if (playerInput.equalsIgnoreCase("paper")) println(paper)
      else println("Please enter valid move. ")
    }
  }
}
