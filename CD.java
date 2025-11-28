public class CD extends LibraryItem implements LoanItem {
    private String band;
    private String title;
    private int numTracks;

    public CD(String ID, String band, String title, int numTracks) {
        super("CD", ID);
        this.band = band;
        this.title = title;
        this.numTracks = numTracks;
    }

    public double calculatePrice() {
        // Example calculation: $1.00 per track
        return numTracks * 1.00;
    }

    public String toString() {
        return "CD ID: " + ID + ", Title: " + title + ", Band: " + band + ", Tracks: " + numTracks;
    }
}
