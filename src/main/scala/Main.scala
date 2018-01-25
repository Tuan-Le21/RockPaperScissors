object Main extends App {
  val playerInput = scala.io.StdIn.readLine("Rock, Papers or Scissors?")
  Player.input(playerInput)
  println(AI.moveAI(" "))
}
