package part04_challenges;

public class Title implements Comparable<Title>{
    private String name;

    public Title(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.name.compareTo(otherTitle.name);
    }
}
