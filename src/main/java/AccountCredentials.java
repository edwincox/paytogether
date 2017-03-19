public class AccountCredentials {

    private String voornaam;
    private String achternaam;
    private String straatnaam;
    private String huisnummer;
    private String postcode;
    private String accountnaam;
    private String password;
    private String emailadres;

    public AccountCredentials(String voornaam, String achternaam, String straatnaam, String huisnummer, String postcode, String accountnaam, String password, String emailadres) {
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.straatnaam = straatnaam;
        this.huisnummer = huisnummer;
        this.postcode = postcode;
        this.accountnaam = accountnaam;
        this.password = password;
        this.emailadres = emailadres;
    }

    public AccountCredentials() {

    }

    public String getAchternaam() {
        return achternaam;
    }
}