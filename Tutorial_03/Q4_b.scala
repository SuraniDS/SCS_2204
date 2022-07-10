object Q4_b {

  def attendeeCount(ticketPrice: Double) : Double = 120 + (15 - ticketPrice) / 5*20;

  def revenue (ticketPrice: Double) : Double = attendeeCount(ticketPrice) * ticketPrice;

  def cost (ticketPrice: Double) : Double = 500 + 3 * attendeeCount(ticketPrice: Double);

  def profit (ticketPrice: Double): Double =

    revenue(ticketPrice) - cost(ticketPrice);


  def main (args: Array[String]){

    println("Profit : " + profit(20));
    println("Profit : " + profit(25));
    println("Profit : " + profit(26));
    println("Profit : " + profit(25.5));

  }

}
