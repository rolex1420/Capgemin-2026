class DeckOfCards {

    static String[] createDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck = new String[52];
        int index = 0;

        for (String s : suits)
            for (String r : ranks)
                deck[index++] = r + " of " + s;

        return deck;
    }

    static void shuffle(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public static void main(String[] args) {
        String[] deck = createDeck();
        shuffle(deck);
        for (String card : deck)
            System.out.println(card);
    }
}
