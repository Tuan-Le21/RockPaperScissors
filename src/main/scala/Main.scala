


object Main extends App {
  val playerInput = scala.io.StdIn.readLine("Rock, Papers or Scissors?")
  Player.input(playerInput)

  var x =  (AI.moveAI(""))
  println("AI uses " + x)

  Game.result(playerInput,x)




}
