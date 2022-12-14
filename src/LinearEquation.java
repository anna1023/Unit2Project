public class LinearEquation {
  private int x1;
  private int x2;
  private int y1;
  private int y2;
  private double newx;

  LinearEquation(int x1, int y1, int x2, int y2){
      this.x1 = x1;
      this.x2 = x2;
      this.y1 = y1;
      this.y2 = y2;
  }

    public double roundedToHundredth(double toRound){
        return Math.round(toRound*100.0)/100.0;
    }
  public double slope() {
      double slope1 = (double)(y2-y1)/(x2-x1);
      return roundedToHundredth(slope1); //check??
  }

  public double yIntercept() {
      double b = y1 - (slope()*x1);
      return roundedToHundredth(b);
  }

  public String equation() {
      String result = "";
      int numerator = (y2-y1);
      int denominator = (x2-x1);
        if (y1 == y2) {
          return "y ="+y1;
      }
      if ((double) numerator/denominator == 1) {
          result += "x";
      }
      else if ((double)numerator/denominator == -1) {
          result += "-x";
      }
      else if (numerator%denominator == 0) {
          result += numerator / denominator+"x";
          }
      else {
          if ((double) numerator / denominator < 0){
              result += "-" + Math.abs(numerator) + "/" + Math.abs(denominator)+ "x";
          } else {
              result += Math.abs(numerator) + "/" + Math.abs(denominator) + "x";
          }
      }
      if (yIntercept() < 0) {
          result += yIntercept();
      }
      if (yIntercept() > 0) {
          result += "+"+yIntercept();
      }
      return result;
      }

  public double distance() {
      double x = Math.pow((x2-x1),2);
      double y = Math.pow((y2-y1),2);
      double dis = Math.sqrt(x+y);
      return roundedToHundredth(dis);
  }

  public String lineInfo() {
      return "The two points are: "+"(" +x1+", " + y1+")" + " and " + "("+x2 +", "+y2+")"+ "\n" +
              "The equation of the line between these points is: y = "+equation()+"\n"
     +"The slope of this line is: "+slope()+"\n"+
     "The y-intercept of the line is: "+yIntercept()+"\n"+
      "The distance between the two points is: "+distance();
  }

    public double coordinateForX (double newx){
      this.newx = newx;
      double y = slope()*newx+yIntercept();
      return roundedToHundredth(y);
    }

}
