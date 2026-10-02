public class UseDivision {

    public static void main(String[] args) {

        InternationalDivision international1 = new InternationalDivision(
                "European Division",
                1001,
                "Germany",
                "German");

        InternationalDivision international2 = new InternationalDivision(
                "Asian Division",
                1002,
                "Japan",
                "Japanese");

        DomesticDivision domestic1 = new DomesticDivision(
                "Eastern Division",
                2001,
                "Ohio");

        DomesticDivision domestic2 = new DomesticDivision(
                "Western Division",
                2002,
                "California");

        international1.display();
        international2.display();
        domestic1.display();
        domestic2.display();
    }
}