import entity.Gast;
import entity.GastDetail;
import entity.Land;
import entity.Reserveringen;
import service.GastDetailService;
import service.GastService;
import service.LandService;
import service.ReserveringenService;

public class
Main {

    public static void main(String[] args) {

        GastService gastService = new GastService();
        GastDetailService gastDetailService = new GastDetailService();

        GastDetail gastDetail = new GastDetail();
        gastDetail.setGeboorteDatum("5 februari 1969");
        gastDetail.setAdress("Hendrikstraat 59");
        gastDetail.setTelefoonNummer("+597 8734562");


        GastDetail detail = gastDetailService.createGastDetail(gastDetail);

        Gast createGast = new Gast();
        createGast.setVoornaam("Mary");
        createGast.setAchternaam("Ravenberg");
        createGast.setGeslacht("Vrouwlijk");

        gastService.createGast(createGast);


        LandService landService = new LandService();

        Land createLand = new Land();
        createLand.setNaam("Suriname");

        ReserveringenService reserveringenService = new ReserveringenService();

        Reserveringen createReserveringen = new Reserveringen();
        createReserveringen.setReservering_nummer("100");
        createReserveringen.setCheck_in("22 februari 2023");
        createReserveringen.setCheck_out("28 februari 2023");
        createReserveringen.setAantal_kamers("2");
        createReserveringen.setAantal_personen("4");


        /*List<Gebruiker> gebruikers = gebruikerService.getGebruikers();
        gebruikers.forEach( gebruiker -> {
            System.out.println("Voornaam = " + gebruiker.getVoornaam() + "Achternaam = " + gebruiker.getAchternaam());
        });*/




    }
}
