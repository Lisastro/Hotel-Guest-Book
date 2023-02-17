package dp_ChainofResponsibility;

public class SearchName extends SearchDemo{

        public void handleRequest(String searchQuery) {
            if (searchQuery.contains("Gast")) {
                System.out.println("Zoeken op naam: " + searchQuery);
            } else {
                System.out.println("Geen zoekopdracht gevonden voor: " + searchQuery);
            }
        }

}
