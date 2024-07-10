package part04_challenges;

public class Title implements Comparable<Title>{
    private String name;

    public Title(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }    

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
