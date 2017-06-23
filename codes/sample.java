public class Sample {

  public static void main(String args[]){
    Sample.panic();
  }
  
  private static void panic() {
    Bean bean = null;
    System.out.println(bean.toString());
  }
}
