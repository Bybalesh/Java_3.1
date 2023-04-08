public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService(); //Объект
        int price = 10000;
        int miles = service.calculate(price); // должно получиться 500
        System.out.println(miles);
    }
}