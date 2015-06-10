package es.baste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Fran on 31/07/2014.
 */
public class UtilesSonidos {

    private static List<Sound> sounds = new ArrayList<Sound>();

    public static List<Sound> getListaTodos() {
        return sounds;
    }

    public static void sonidos() {
        if (!sounds.isEmpty())
            return;

        sounds.add(new Sound("Abogada soltera", R.raw.abogada_soltera, false));
        sounds.add(new Sound("Por fin puedo pasarme al alcohol duro", R.raw.alcohol_duro, false));
        sounds.add(new Sound("Eso es como hacer el amor", R.raw.amor, false));
        sounds.add(new Sound("Apunta bien idiota", R.raw.apunta_bien, false));
        sounds.add(new Sound("Ay pillín", R.raw.ay_pillin, false));
        sounds.add(new Sound("No me cuentes batallitas", R.raw.batallitas, false));
        sounds.add(new Sound("Voy a beber hasta que robote", R.raw.beber_hasta, false));
        sounds.add(new Sound("Sírvame bebida grande, fuerte y barata", R.raw.bebida_fuerte, false));
        sounds.add(new Sound("Tu suenas cacho de carne", R.raw.cacho_carne, false));
        sounds.add(new Sound("Estaré en el casino", R.raw.casino, false));
        sounds.add(new Sound("Qué clase de fiesta es esta?", R.raw.clase_de_fiesta, false));
        sounds.add(new Sound("La comida no era nociva", R.raw.comida_nociva, false));
        sounds.add(new Sound("A una chica tan fina hay que cortejarla primero", R.raw.cortejarla, false));
        sounds.add(new Sound("Díselo a mi brillante culo metálico", R.raw.culo_metalico, false));
        sounds.add(new Sound("Danos caña tío", R.raw.danos_cana, false));
        sounds.add(new Sound("Puedo dejarlo en el momento que quiera", R.raw.dejarlo, false));
        sounds.add(new Sound("Era porno", R.raw.era_porno, false));
        sounds.add(new Sound("Eructo", R.raw.eructo, false));
        sounds.add(new Sound("Tío eso es tan feo como mi trabajo", R.raw.feo_trabajo, false));
        sounds.add(new Sound("Tengo gay-radar", R.raw.gay, false));
        sounds.add(new Sound("El humano medio", R.raw.humano_medio, false));
        sounds.add(new Sound("Jamás recuperare mi Martini", R.raw.martini, false));
        sounds.add(new Sound("Vamos mátame de una vez", R.raw.matame, false));
        sounds.add(new Sound("Te vienes a matar humanos?", R.raw.matar_humanos, false));
        sounds.add(new Sound("Diles que morí por robarle a un viejo", R.raw.mori_por_robar, false));
        sounds.add(new Sound("Muerte a los humanos!!", R.raw.muerte_humanos, false));
        sounds.add(new Sound("No hacen más que atormentarme con bailes y música ligera", R.raw.musica_ligera, false));
        sounds.add(new Sound("Eres una niña mala", R.raw.nina_mala, false));
        sounds.add(new Sound("Yo nunca le he facilitado la vida a nadie", R.raw.no_facilito, false));
        sounds.add(new Sound("Eres un ordenador malo", R.raw.ordenador_malo, false));
        sounds.add(new Sound("Podrías cerrar tu orificio sonoro?", R.raw.orificio_sonoro, false));
        sounds.add(new Sound("Me montare mi propio parque", R.raw.parque, false));
        sounds.add(new Sound("Fue ella quien me programo para el mal", R.raw.programo_mal, false));
        sounds.add(new Sound("Una ranita iba caminando", R.raw.ranita, false));
        sounds.add(new Sound("Robosexuales", R.raw.robosexuales, false));
        sounds.add(new Sound("Te sermoneo yo?", R.raw.sermoneo, false));
        sounds.add(new Sound("Estoy sobrio y loco", R.raw.sobrio_y_loco, false));
        // v1.0.1
        sounds.add(new Sound("Mi nombre completo", R.raw.nombre, false));
        sounds.add(new Sound("Eres un amigo de mierda", R.raw.amigo_de_mierda, false));
        sounds.add(new Sound("Aprender divierte", R.raw.aprender_divierte, false));
        sounds.add(new Sound("Bésame la carcase de atrás", R.raw.besame, false));
        sounds.add(new Sound("Chúpate esa", R.raw.chupate_esa, false));
        sounds.add(new Sound("A que no adivinan de que son complices?", R.raw.complices, false));
        sounds.add(new Sound("Hemos vuelto", R.raw.hemos_vuelto, false));
        sounds.add(new Sound("Aquí tenéis todo lo que necesitáis", R.raw.todo_lo_q_necesitais, false));
        sounds.add(new Sound("Tu madre", R.raw.tu_madre, false));
        sounds.add(new Sound("Tus muelas pringao", R.raw.tus_muelas_pringao, false));
        sounds.add(new Sound("Joder que frío", R.raw.joder_que_frio, false));
        // v1.0.2
        sounds.add(new Sound("Himno oficial de Robonia", R.raw.robonia, false));
        sounds.add(new Sound("De todos los amigos que he tenido, tu el único", R.raw.amigos, false));
        sounds.add(new Sound("Sigues trabajando de ampli por horas?", R.raw.ampli_x_horas, false));
        sounds.add(new Sound("Noto que estoy arto de robar", R.raw.arto_de_robar, false));
        sounds.add(new Sound("Esas chicas no llevan carcasa, llevan todos los circuitos al aire", R.raw.circuitos_al_aire, false));
        sounds.add(new Sound("Citas por ordenador", R.raw.citas_por_ordenador, false));
        sounds.add(new Sound("Conduciendo con el culo", R.raw.conduciendo_con_el_culo, false));
        sounds.add(new Sound("Demasiado extremista", R.raw.demasiado_extremista, false));
        sounds.add(new Sound("Esto esta que arde", R.raw.esto_esta_q_arde, false));
        sounds.add(new Sound("Eres un grano en el culo de la sociedad y jamás llegaras a nada", R.raw.grano_en_el_culo, false));
        sounds.add(new Sound("Guarra", R.raw.guarra, false));
        sounds.add(new Sound("Soy doblador", R.raw.soy_doblador, false));
        sounds.add(new Sound("Vine aquí con un sencillo sueño", R.raw.sueno, false));
        sounds.add(new Sound("Voy a robar", R.raw.voy_a_robar, false));
        // v2.0
        sounds.add(new Sound("Coleguilla", R.raw.coleguilla, false));
        sounds.add(new Sound("La crueldad ejercida por el anterior faraón ya es del pasado", R.raw.faraon, false));
        sounds.add(new Sound("Eso si que es un lametón", R.raw.lameton, false));
        sounds.add(new Sound("Yo también quiero ser popular", R.raw.popular, false));
        sounds.add(new Sound("Es tan rico que creo que yo voy a usar monoculo", R.raw.rico, false));
        sounds.add(new Sound("El logotipo Windows", R.raw.windows, false));
        // 2.1
        sounds.add(new Sound("Que jodíos... saben nadar", R.raw.jodios, false));
        sounds.add(new Sound("La prueba del jarrón", R.raw.prueba, false));
        sounds.add(new Sound("Pero que tonto eres",R.raw.tonto, false));
        // 2.2
        sounds.add(new Sound("A todos los tíos les gustan las zorras", R.raw.a_todos_los_tios_les_gustan_las_zorras, false));
        sounds.add(new Sound("Meneillos", R.raw.meneillos, false));
        sounds.add(new Sound("No podrías pagarlo, cielo", R.raw.no_podrias_pagarlo_cielo, false));
        sounds.add(new Sound("Eso se merece un solo de guitarra", R.raw.eso_se_merece_un_solo_de_guitarra, false));
        // 2.3
        sounds.add(new Sound("Intro", R.raw.intro, false));
        // 2.3.1
        sounds.add(new Sound("Aguanta mordisquitos el tío Bender va a rescatarte", R.raw.aguanta, false));
        sounds.add(new Sound("Ahora mismo tú me estás dando pena",R.raw.dandopena, false));
        sounds.add(new Sound("Bender intenta destruir el mundo con palabras que nunca dice", R.raw.destruirmundo, false));
        sounds.add(new Sound("Bender sisando a Don Bot", R.raw.sisando, false));
        sounds.add(new Sound("Bueno, la vida sigue", R.raw.lavidasigue, false));
        sounds.add(new Sound("Matar a todos los humanos", R.raw.mataratodosloshumanos, false));
        // 2.5
        sounds.add(new Sound("Selección de vinos", R.raw.selecciona_vinos, false));
        sounds.add(new Sound("Somos balleneros", R.raw.somos_balleneros, false));
        sounds.add(new Sound("Dios mio, estoy inundado de sentimientos",R.raw.inundado_sentimientos, false));
        sounds.add(new Sound("Así se hace", R.raw.asi_se_hace, false));
        sounds.add(new Sound("Cuantos caminos", R.raw.cuantos_caminos, false));
        sounds.add(new Sound("Infierno robot", R.raw.infierno_robot, false));
        sounds.add(new Sound("Mi amigo roto", R.raw.mi_amigo_roto, false));
        sounds.add(new Sound("Robahanukah", R.raw.robahanukah, false));
        sounds.add(new Sound("Como si usted no tuviera roña en el cuello", R.raw.rona_cuello, false));
        sounds.add(new Sound("Déjame probar con un 2x1", R.raw.probar_2x1, false));
        sounds.add(new Sound("Desde ahora soy imparable", R.raw.imparable, false));
        sounds.add(new Sound("Esto se merece un trago", R.raw.un_trago, false));
        sounds.add(new Sound("He descubierto la religión",R.raw.descubierto_religion, false));
        sounds.add(new Sound("Lo siento ha muerto", R.raw.ha_muerto, false));
        sounds.add(new Sound("No, gracias",R.raw.no_gracias, false));
        sounds.add(new Sound("Nos vamos de juerga", R.raw.vamos_de_juerga, false));
        sounds.add(new Sound("Podía doblar una viga a cualquier ángulo", R.raw.cualquier_angulo, false));
        sounds.add(new Sound("Si derribo a un jugador de un botellazo no creo que se levante", R.raw.botellazo, false));
        sounds.add(new Sound("Créditos", R.raw.creditos, false));
        sounds.add(new Sound("Sois tan amigos míos como de un tostador", R.raw.tostador, false));

        Collections.sort(sounds, new Comparator<Sound>() {
            public int compare(Sound s1, Sound s2) {
                return s1.getNombre().compareTo(s2.getNombre());
            }
        });
    }

}
