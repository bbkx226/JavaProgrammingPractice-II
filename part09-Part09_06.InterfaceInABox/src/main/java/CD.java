public class CD implements Packable{
    private String artist, CD;
    private int publication;
    private double weight;

    public CD(String artist, String CD, int publication){
        this.artist = artist;
        this.CD = CD;
        this.publication = publication;
        this.weight = 0.1;
    }

    public double weight(){
        return this.weight;
    }

    public String toString(){
        return this.artist + ": " + this.CD + " (" + this.publication + ")";
    }
}
