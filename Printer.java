public class Printer {

    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrint;

    public Printer(int tonerLevel, boolean duplexPrint) {
        if (tonerLevel  > - 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.numberOfPagesPrinted = 0;
        this.duplexPrint = duplexPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrint() {
        return duplexPrint;
    }

    public int addToner(int amount) {
        if (amount > 0 && amount < 100) {
            if (this.tonerLevel + amount > 100) {
                return -1;
            }
            this.tonerLevel += amount;
            return  this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int numOfPages) {
        System.out.println("printing...");
        this.numberOfPagesPrinted += numOfPages;
        return numOfPages;
    }




}
