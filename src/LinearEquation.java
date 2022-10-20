public class LinearEquation {
  private int x1;
  private int x2;
  private int y1;
  private int y2;

  LinearEquation(int x1, int x2, int y1, int y2){
      this.x1 = x1;
      this.x2 = x2;
      this.y1 = y1;
      this.y2 = y2;
  }

  public double slope() {
      double slope1 = (double)(y2-y1)/((x2-x1));
      return roundedToHundredth(slope1);
  }

  public double yIntercept() {
      double b = y1 - (slope()*x1);
      return roundedToHundredth(b);
  }

  public String equation() {
      return slope()+"x+"+yIntercept();
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
    public double roundedToHundredth(double toRound){
      return Math.round(toRound*100.0)/100.0;
    }


}
