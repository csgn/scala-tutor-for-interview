package core

object Main5 {
  def main(args: Array[String]): Unit = {
    // 1
    val salaries = Seq(20_000, 70_000, 40_000)
    val doubleSalary = (x: Int) => x * 2
    val newSalaries = salaries.map(doubleSalary)


    // 2
    val newSalariesCompact = salaries.map(x => x * 2)

    // 3
    val newSalariesMoreCompact = salaries.map(_ * 2)

    case class WeeklyWeatherForecast(temperatures: Seq[Double]):
      private def convertCtof(temp: Double) = temp * 1.8 + 32

      def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtof)



    object SalaryRaiser:
      private def promotion(salaries: List[Double], promotionFunc: Double => Double): List[Double] =
        salaries.map(promotionFunc)

      def smallPromotion(salaries: List[Double]): List[Double] =
        promotion(salaries, x => 1.1)

      def greatPromotion(salaries: List[Double]): List[Double] =
        promotion(salaries, x => math.log(x))

      def higherPromotion(salaries: List[Double]): List[Double] =
        promotion(salaries, x => x * x)



    def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String =
      val schema = if ssl then "https://" else "http://"
      (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"

    val domainName = "www.example.com"
    def getURL = urlBuilder(ssl=true, domainName)

    val endpoint = "users"
    val query = "id=1"

    val url = getURL(endpoint, query)
    println(url)
  }
}
