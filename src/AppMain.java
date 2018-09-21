import java.io.IOException;

public class AppMain {
    public static void main(String[] args) throws IOException {
        String access_token = "62a79c483277a08ab620cefaf1d5aed2ff6740780b0f2690058e26165766b64a59006accf250098015460";
        VK vk = new VK(access_token);
        String[] friends = vk.getFriends("113950718");
        for (String friend : friends)
           System.out.println(friend);
    }
}
