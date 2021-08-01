package Quiz;

public class Burger {
    private String burger_bun;
    private int no_of_chessSlice;
    private int no_of_pastrami;
    private int no_of_patty;

    public Burger() {
    }

    public Burger(String burger_bun, int no_of_chessSlice, int no_of_pastrami, int no_of_patty) {
        this.burger_bun = burger_bun;
        this.no_of_chessSlice = no_of_chessSlice;
        this.no_of_pastrami = no_of_pastrami;
        this.no_of_patty = no_of_patty;
    }

    public Burger(String burger_bun, int no_of_patty) {
        this.burger_bun = burger_bun;
        this.no_of_patty = no_of_patty;
    }

    public void setBurger_bun(String burger_bun) {
        this.burger_bun = burger_bun;
    }

    public void setNo_of_chessSlice(int no_of_chessSlice) {
        this.no_of_chessSlice = no_of_chessSlice;
    }

    public void setNo_of_pastrami(int no_of_pastrami) {
        this.no_of_pastrami = no_of_pastrami;
    }

    public void setNo_of_patty(int no_of_patty) {
        this.no_of_patty = no_of_patty;
    }

    public String getBurger_bun() {
        return burger_bun;
    }

    public int getNo_of_chessSlice() {
        return no_of_chessSlice;
    }

    public int getNo_of_pastrami() {
        return no_of_pastrami;
    }

    public int getNo_of_patty() {
        return no_of_patty;
    }

    public double calcCost() {
        double cost = 0;
        if (burger_bun.equals("Small") || burger_bun.equals("small") && no_of_chessSlice >= 0 && no_of_pastrami >= 0 && no_of_patty >= 0) {
            cost += 3 + (2 * no_of_chessSlice )+ (3 * no_of_pastrami) + (10 * no_of_patty);

        }
         else if (burger_bun.equals("Medium") || burger_bun.equals("medium") && no_of_chessSlice >= 0 && no_of_pastrami >= 0 && no_of_patty >= 0) {
            cost += 4 + (2 * no_of_chessSlice) + (3 * no_of_pastrami) + (10 * no_of_patty);

        }
          else if (burger_bun.equals("Large") || burger_bun.equals("large") && no_of_chessSlice >= 0 && no_of_pastrami >= 0 && no_of_patty >= 0) {
            cost += 5 + (2 * no_of_chessSlice) + (3 * no_of_pastrami) + (10 * no_of_patty);

        }
          else {
            System.out.println("Invalid Information Given!!");
        }
          return cost;


    }
    public String getDescription(){
        return "\n Burger Bun Size : "+burger_bun
                + "\n No of Patties : "+no_of_patty
                +"\n Cheese Slices : "+no_of_chessSlice
                +"\n Pastrami Slices : "+no_of_pastrami
                +"\n Burger cost : $"+calcCost();
    }
}