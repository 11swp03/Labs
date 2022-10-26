public class Cards {
    enum Rank {
        ace,
        two,
        three,
        four,
        five,
        six,
        seven,
        eight,
        nine,
        ten,
        jack,
        queen,
        king
    }
    public static void main(String[] args) {
        Rank highCard, faceCard, card1, card2;
        int Card1Val, Card2Val;

        highCard = Rank.ace;
        faceCard = Rank.queen;
        card1 = Rank.six;
        card2 = Rank.nine;
        Card1Val = card1.ordinal() + 1;
        Card2Val = card2.ordinal() + 1;

        System.out.println("A two card hand: " + card1 + " " + card2);
        System.out.println("Hand Value: " );
    }
}
