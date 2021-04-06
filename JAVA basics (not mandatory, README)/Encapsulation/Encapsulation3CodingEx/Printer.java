package Encapsulation3CodingEx;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel>-1&&tonerLevel<=100) ? tonerLevel : -1;
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner (int tonerAmount) {
        if (tonerAmount>0 && tonerAmount <=100) {
            return (tonerLevel + tonerAmount > 100) ? - 1 : (tonerLevel += tonerAmount);
        } else {
            return -1;
        }
    }

    public int printPages (int pages){
        int pagesToPrint = (duplex) ? (Math.round((float) pages/2)) : pages;
        pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted () {
        return pagesPrinted;
    }
}
