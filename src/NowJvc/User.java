package NowJvc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
    private final String name;
    List<String> friends=new ArrayList<>();
    public User(String name){
        this.name=name;
    }

    public void aadFriends(String name){
        friends.add(name);
    }

    public String getName() {
        return name;
    }

    public List<String> getFriends() {
       // return Collections.unmodifiableList(friends);
        return friends;
    }
}
