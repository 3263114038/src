package programming3.chatsys;

import java.sql.Timestamp;
import java.util.Objects;

public class ChatMessage {
    private int id;
    private String message;
    private String userName;
    private Timestamp timestamp;

    // Fill missing methods (constructor, getters, toString, equals, hashCode)

    public ChatMessage(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", userName='" + userName + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatMessage that = (ChatMessage) o;
        return id == that.id && Objects.equals(message, that.message) && Objects.equals(userName, that.userName) && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, message, userName, timestamp);
    }


}
