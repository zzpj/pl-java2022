package java9.httpClient;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TodoRepository {

    String getTodo() throws URISyntaxException, IOException, InterruptedException {
        // implement here
        // target url: https://jsonplaceholder.typicode.com/todos/1
        // use HttpResponse.BodyHandlers.ofString() handler
        // return response body

        return "";
    }

}
