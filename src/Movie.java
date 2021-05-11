public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    Price price;
    private String title;
    public Movie(String newtitle, int priceCode) {
        title = newtitle;
        setPriceCode(priceCode);
    }
    public Price getPriceCode() {
        return price;
    }
    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            default:
                throw new IllegalArgumentException("Invalid Price");
        }
    }
    public String getTitle (){
        return title;
    };

    int getFrequentRenterPoints(int daysRented) {
        return price.getPriceCode() == NEW_RELEASE && daysRented > 2 ? 2 : 1;
    }
}