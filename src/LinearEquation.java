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
      double slope1 = (y2-y1)/((x2-x1));
      return Math.round(slope1*100.0)/100.0;
  }

  public double yinter() {
      double b = y1 - (slope()*x1);
      return Math.round(b*100.0)/100.0;
  }

  public String equation() {
      return slope()+"x+"+yinter();
  }

  public double distance() {
      double x = Math.pow((x2-x1),2);
      double y = Math.pow((y2-y1),2);
      double dis = Math.sqrt(x+y);
      return Math.round(dis*100)/100; //watever arden said
  }


}
