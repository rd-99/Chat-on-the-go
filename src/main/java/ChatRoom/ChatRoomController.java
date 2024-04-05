package ChatRoom;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatRoomController {

    @RequestMapping("/chatroom")
    // recieve a json with chatroom details and return a chatroom object
    public ChatRoom chatroom(@ResponseBody ChatRoom chatRoomDetails) {
        ChatRoom chatroom = new ChatRoom();
        return chatroom;
    }

}
