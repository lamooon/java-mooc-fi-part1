public class User {
    
    private String identifer;
    private String name;

    public User(String identifier, String name) {
        this.identifer = identifier;
        this.name = name;
    }

    public String getIdentifier() {
        return this.identifer;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals(Object compare) {
        if (this == compare) return true;

        if (!(compare instanceof User)) return false;

        User user = (User) compare;
        return this.identifer.equals(user.identifer);
    }
}
