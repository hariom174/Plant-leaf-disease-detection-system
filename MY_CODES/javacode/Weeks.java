public class Weeks {
    public static void main(String[]args)
    {
        //convert day to year,weeks and days
        int year,weeks,days;
        days=1329;
        year=days/365;
        weeks=(days%365)/7;
        days=days-((year*365)+(weeks*7));

        System.out.println("Years ="+year);
        System.out.println("weeks ="+weeks);
        System.out.println("days ="+days);
    }
    
}
