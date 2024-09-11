package Array.Number;

public class BuildingCardTent {

    public static int calNumberOfCards(int level) {
        int cards = 0;
        int hCard = 0;
        for(int i = 1 ; i <= level; i++) {
            cards += i * 2 + hCard;
            hCard++;
        }
        return cards;
    }

    public static void main(String[] args) {
        int level = 3;

        System.out.println(calNumberOfCards(level));
    }
}
