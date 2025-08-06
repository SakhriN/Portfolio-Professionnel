
public class Main {
    public static void main(String[] args) {

        Music music2 = new Music("Nassim chante sous sa douche.");
        Music music3 = new Music("Clément Roelens - Les sardines.");
        Music music4 = new Music("Christophe Delory - Les blagues nulles");

        Playlist playlist = new Playlist();
        playlist.addMusic(music2);
        playlist.addMusic(music3);

        playlist.execute("add", music4);
        playlist.execute("add", music3);
        playlist.execute("remove", music4);
        playlist.execute("remove", music4);





    }
}