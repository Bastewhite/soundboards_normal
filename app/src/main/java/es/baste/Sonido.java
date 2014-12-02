package es.baste;

public class Sonido {

	private String nombre;
	private int archivo;
	private boolean nuevo;
    private String urlVideo;
    private int image;

    public Sonido(String nombre, int archivo) {
        super();
        this.nombre = nombre;
        this.archivo = archivo;
    }
	
	public Sonido(String nombre, int archivo, boolean nuevo) {
		super();
		this.nombre = nombre;
		this.archivo = archivo;
		this.nuevo = nuevo;
	}

	public String getNombre() {
		return nombre;
	}

	public int getArchivo() {
		return archivo;
	}

	public boolean isNuevo() {
		return nuevo;
	}

    public Sonido setNuevo() {
        this.nuevo = true;
        return this;
    }

    public String getVideoUrl() {
        return urlVideo;
    }

    public Sonido setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
        return this;
    }

    public int getImage() {
        return image;
    }

    public Sonido setImage(int image) {
        this.image = image;
        return this;
    }

    @Override
	public String toString() {
		return nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sonido other = (Sonido) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
}
