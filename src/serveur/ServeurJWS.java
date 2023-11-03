package serveur;

public class ServeurJWS {
	public static void main(String[] args) {
    // Créez une instance de la classe CalculatriceWS (le service web que nous avons créé précédemment).
    CalculatriceWS calculatrice = new CalculatriceWS();
    
    // Spécifiez l'URL où vous souhaitez publier le service.
    String url = "http://localhost:8084/calculatrice";

    // Publiez le service web à l'URL spécifiée.
    Endpoint.publish(url, calculatrice);

    System.out.println("Service web CalculatriceWS publié à l'URL : " + url);
}

}
