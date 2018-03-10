package coleccion;

public class Cancion extends Coleccion {

    private int id;
    private int duracion;
    private String artista;
    private String album;
    private int año;
    private String genero;

    public Cancion(int id, String nombre, int duracion, String artista, String album, int año, String genero) {
        super(nombre);//para que no salga error hay que ponerlo en el parametro del constructor
        this.id = id;
        this.duracion = duracion;
        this.artista = artista;
        this.album = album;
        this.año = año;
        this.genero = genero;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getDuracion() {

    }

    @Override
    public int getCantidad() {

    }

    public String toString() {
        return "id: " + this.id + "nombre: " + super.nombre + "artista: "
                + this.artista + "album: " + this.album + "duracion: " + this.duracion;
    }

}
