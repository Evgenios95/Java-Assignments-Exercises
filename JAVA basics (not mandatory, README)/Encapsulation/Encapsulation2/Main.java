package Encapsulation2;

public class Main {
      public static void main(String[] args) {
          Printer printer = new Printer(50, true);
          System.out.println("Initial page count is " +printer.getPagePrinted());

          System.out.println("---------------------------");
          int pagesPrinted = printer.printPages(4);
          System.out.println("Pages printed was " +pagesPrinted+ " and the new total print count is " +printer.getPagePrinted() + " ");

          System.out.println("---------------------------");
          pagesPrinted = printer.printPages(4);
          System.out.println("Pages printed was " +pagesPrinted+ " and the new total print count is " +printer.getPagePrinted() + " ");

          Printer printer2 = new Printer(50, false);
          System.out.println("---------------------------");
          int pagePrinted = printer2.printPages(13);
          System.out.println("Pages printed was " +pagePrinted+ " and the new total print count is " +printer2.getPagePrinted() + " ");
          System.out.println("---------------------------");
          pagePrinted = printer2.printPages(19);
          System.out.println("Pages printed was " +pagePrinted+ " and the new total print count is " +printer2.getPagePrinted() + " ");
      } 
}
