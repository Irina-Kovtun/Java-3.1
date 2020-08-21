public class Main {
    public static void main(String[] args) {
        //копейки отделяются от целого числа нижним подчеркиванием
        int ticketPrice = 22387_00;
        int milesRate= 20;
        int miles = ticketPrice / milesRate / 100;
        System.out.println(miles);
    }
}
