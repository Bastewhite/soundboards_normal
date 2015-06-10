package es.baste.otto.events;

import es.baste.Sound;

/**
 * Created by Fran on 29/09/2014.
 */
public class ChangeBackgroundEvent {

    private Sound mSound;

    public ChangeBackgroundEvent(Sound sound) {
        this.mSound = sound;
    }

    public Sound getSound() {
        return mSound;
    }
}
