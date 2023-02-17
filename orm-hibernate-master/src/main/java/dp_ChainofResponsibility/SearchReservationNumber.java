package dp_ChainofResponsibility;

public class SearchReservationNumber extends SearchDemo{

        public void handleRequest(String searchQuery) {
            if (searchQuery.contains("reserveringen")) {
                System.out.println("Zoeken op reserveringsnummer: " + searchQuery);
            } else {
                successor.handleRequest(searchQuery);
            }
        }

}
