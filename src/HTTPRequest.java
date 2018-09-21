import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPRequest {

    public String executePost(String targetURL) throws IOException {

        URL obj = new URL(targetURL);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        return (response.toString());
    }
}
