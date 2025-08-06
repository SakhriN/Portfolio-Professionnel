import java.util.ArrayList;
import java.util.List;

public class Playlist implements Command {
    private List<Music> musicList = new ArrayList<>();

    public void addMusic(Music music) {
        this.musicList.add(music);
    }

    public void removeMusic(Music music) {
        this.musicList.remove(music);
    }

    public void execute(String command, Music music) {
        if(command.equals("add")){
            if(!musicList.contains(music)){
                System.out.println("La musique suivante : \""+ music.getName() + "\" n'existe pas dans la playlist, ajout en cours... ");
                addMusic(music);
                System.out.println("Ajout terminé.");
            }else {
                System.out.println("La musique \""+music.getName()+"\" existe deja dans la playlist.");
            }
        }else{
            if(command.equals("remove")){
                if(musicList.contains(music)){
                    System.out.println("La musique suivante : \""+ music.getName() + "\" existe dans la playlist, suppression en cours... ");
                    removeMusic(music);
                }else{
                    System.out.println("La musique \""+music.getName()+"\" n'existe pas dans la playlist.");
                }
            }
        }
    }
}
