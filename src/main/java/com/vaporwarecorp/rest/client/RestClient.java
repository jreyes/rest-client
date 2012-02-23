package com.vaporwarecorp.rest.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import javax.ws.rs.core.MediaType;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public final class RestClient
{
// --------------------------- main() method ---------------------------

    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
        System.out.println( "Buscar en Twitter: " );
        String busqueda = input.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat( "MM/dd/yy HH:mm" );

        // crea el cliente
        ClientConfig config = new DefaultClientConfig();
        Client client = Client.create( config );

        // donde se encuentra el servidor REST que queremos usar
        WebResource resource = client.resource( "http://search.twitter.com/search.json" );

        // ahora hacer la busqueda en twitter
        SearchResult result =
            resource.queryParam( "q", busqueda ).queryParam( "rpp", "5" ).accept( MediaType.APPLICATION_JSON ).get(
                SearchResult.class );

        // cojamos la lista de tweets y enseñemos el tweet en la consola
        for ( Tweet tweet : result.getTweets() )
        {
            String s = String.format( "[%s][%s] %s",
                                      dateFormat.format( tweet.getFechaDeCreacion() ),
                                      tweet.getNombreDelUsuario(),
                                      tweet.getTexto() );
            System.out.println( s );
        }
    }
}
