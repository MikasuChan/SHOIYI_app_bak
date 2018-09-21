import java.io.IOException;

public class VK {
    private final String access_token;
    private final HTTPRequest aReq;

    public VK(String access_token){
        this.access_token = access_token;
        aReq = new HTTPRequest();
    }

    public String[] getFriends(String user_id){
        String URL = "https://api.vk.com/method/";
        String cmd = "friends.get";
        String answer = "";
        try {
            answer = (aReq.executePost(URL + cmd + "?user_id=" + user_id + "&access_token=" + access_token + "&v=3"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        answer = answer.substring(answer.indexOf("[") + 1, answer.indexOf("]"));
        String[] friends = answer.split(",");
        return friends;
    }

}
