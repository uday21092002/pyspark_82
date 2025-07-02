import org.apache.spark.sql.SparkSession

object SimpleDataFrameExample {
  def main(args: Array[String]): Unit = {
    // Create a SparkSession
    val spark = SparkSession.builder()
      .appName("SimpleDataFrameExample")
      .master("local[*]") // Using local mode for simplicity
      .getOrCreate()

    // Import implicit conversions for DataFrame operations
    import spark.implicits._

    // Create a simple DataFrame
    val data = Seq(
      ("Alice", 25),
      ("Bob", 30),
      ("Charlie", 35)
    )
    

    val df = data.toDF("Name", "Age")
    df.show()

    // Stop the SparkSession
    spark.stop()
  }
}
