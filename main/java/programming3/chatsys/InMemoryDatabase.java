package programming3.chatsys;

import java.util.LinkedList;
import java.util.List;

public class InMemoryDatabase implements Database {
    private List<User> users;

    public InMemoryDatabase() {
        users = new LinkedList<>();
    }

    public InMemoryDatabase(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "InMemoryDatabase{" +
                "users=" + users +
                '}';
    }

    @Override
    public boolean register(User user) {
        if (this.contains(user)) {
            return false;
        } else {
            this.users.add(user);
            return true;
        }
    }

    private boolean contains(User user) {
        try {
            return this.getUser(user.getUserName()) != null;
        } catch(IllegalArgumentException e) {
            return false;
        }
    }

    @Override
    public int getNumberUsers() {
        return this.users.size();
    }

    @Override
    public User getUser(String userName) {
        for (User u: this.users) {
            if (u.getUserName().equals(userName)) {
                return u;
            }
        }
        throw new IllegalArgumentException(userName + " is not a registered user");
    }

//    @Override
//    public boolean authenticate(String userName, String password) {
//        User user = this.getUser(userName);
//        if (user == null) {
//            return false;
//        } else {
//            return user.getPassword() == password;
//        }
//    }

    @Override
    public boolean authenticate(String userName, String password) {
        try {
            return this.getUser(userName).getPassword() == password;
        } catch(IllegalArgumentException e) {
            return false;
//        } catch(NullPointerException e) {
//            return false; // This will never be called -> this block is not needed!
        }
    }

    @Override
    public ChatMessage addMessage(String userName, String message) {
        return null;
    }

    @Override
    public int getNumberMessages() {
        return 0;
    }

    @Override
    public List<ChatMessage> getRecentMessages(int n) {
        return null;
    }

    @Override
    public List<ChatMessage> getUnreadMessages(String userName) {
        return null;
    }

    @Override
    public void close() {

    }
}
