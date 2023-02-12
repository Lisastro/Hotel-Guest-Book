import entity.Gast;
import entity.GastDetail;
import service.GastDetailService;
import service.GastService;
import service.LandService;

public class
Main {

    public static void main(String[] args) {

        GastService gastService = new GastService();
        GastDetailService gastDetailService = new GastDetailService();

        GastDetail gastDetail = new GastDetail();
        gastDetail.setGeboorteDatum ("5 februari 1969");
        gastDetail.setAdress ("Hendrikstraat 59");
        gastDetail.setTelefoonNummer ("+597 8734562");


        GastDetail detail = gastDetailService.createGastDetail(gastDetail);

        Gast createGast = new Gast();
        createGast.setVoornaam("Mary");
        createGast.setAchternaam("Ravenberg");
        createGast.setGeslacht("Vrouwlijk");

        gastService.createGast(createGast);


        LandService landService = new LandService();


        /*List<Gebruiker> gebruikers = gebruikerService.getGebruikers();
        gebruikers.forEach( gebruiker -> {
            System.out.println("Voornaam = " + gebruiker.getVoornaam() + "Achternaam = " + gebruiker.getAchternaam());
        });*/




    }
}
