ion average.
     *   6. Returns the average as double.
     * 
     */
 
     public static Double average(Path path, String category) {
         try {
            return Files.lines(path)
                .skip(1)
                .map((line) -> line.split(","))
                .filter((values) -> values[0].equals(category))
                .mapToDouble((values) -> Double.valueOf(values[1]) * Double.valueOf(values[2]))
                .average().getAsDouble();
         } catch (IOException e) {
             System.out.println(e.getMessage());
             return 0.0;
         }
     }
 
 
 
    /**
     * Function name: totalAverage
     * @param path (Path)
     * @return Double
     * 
     * Inside the function:
     *   1. Runs through every line from the CSV file as a stream.
     *   2. Maps every element in the stream to an array of three values.
     *   3. Maps every element in the stream to a double: (price * quantity).
     *   4. Applies the terminal operation average.
     *   5. Returns the average as double.
     */
 
     public static Double totalAverage(Path path) {
         try {
             return Files.lines(path)
                .skip(1)
                .map((line) -> line.split(","))
                .mapToDouble((values) -> Double.parseDouble(values[1]) * Double.parseDouble(values[2]))
                .average().getAsDouble();
         } catch (IOException e) {
             System.out.println(e.getMessage());
             return 0.0;
         }
     }
  
 
}