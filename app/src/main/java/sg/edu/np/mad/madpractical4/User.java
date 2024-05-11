package sg.edu.np.mad.madpractical4;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    public User(String name, String description, int id, boolean followed) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }
    public void setName(String inputName) {
        name = inputName;

    }
    public void setDescription(String inputDesc) {
        description = inputDesc;

    }
    public void setFollowed(boolean inputFollowed) {
        followed = inputFollowed;
    }

    public String getName() {return name;}

    public String getDescription(){return description;}

    public boolean getFollowed() {return followed;}



}