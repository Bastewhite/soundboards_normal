package es.baste.otto.events;

import es.baste.Sonido;

/**
 * Created by Fran on 29/09/2014.
 */
public class ChangeBackgroundEvent {

    private Sonido sonido;

    public ChangeBackgroundEvent(Sonido sonido) {
        this.sonido = sonido;
    }

    public Sonido getSonido() {
        return sonido;
    }
}
