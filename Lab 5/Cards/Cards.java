public class Rank{
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
}

public class Cards {
    public static void main(String[] args) {
        Rank highCard, faceCard, card1, card2;
        highCard = Rank.ace;
        faceCard = Rank.queen;
        card1 = Rank.six;
        card2 = Rank.nine;

        System.out.println("A two card hand: " + card1 + card2);
    }
}
