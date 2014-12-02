package es.baste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Fran on 31/07/2014.
 */
public class UtilesSonidos {

    private static List<Sonido> sonidos = new ArrayList<Sonido>();

    public static List<Sonido> getListaTodos() {
        return sonidos;
    }

    public static void sonidos() {
        if (!sonidos.isEmpty())
            return;

        sonidos.add(new Sonido("Abogada soltera", R.raw.abogada_soltera, false));
        sonidos.add(new Sonido("Por fin puedo pasarme al alcohol duro", R.raw.alcohol_duro, false));
        sonidos.add(new Sonido("Eso es como hacer el amor", R.raw.amor, false));
        sonidos.add(new Sonido("Apunta bien idiota", R.raw.apunta_bien, false));
        sonidos.add(new Sonido("Ay pillín", R.raw.ay_pillin, false));
        sonidos.add(new Sonido("No me cuentes batallitas", R.raw.batallitas, false));
        sonidos.add(new Sonido("Voy a beber hasta que robote", R.raw.beber_hasta, false));
        sonidos.add(new Sonido("Sírvame bebida grande, fuerte y barata", R.raw.bebida_fuerte, false));
        sonidos.add(new Sonido("Tu suenas cacho de carne", R.raw.cacho_carne, false));
        sonidos.add(new Sonido("Estaré en el casino", R.raw.casino, false));
        sonidos.add(new Sonido("Qué clase de fiesta es esta?", R.raw.clase_de_fiesta, false));
        sonidos.add(new Sonido("La comida no era nociva", R.raw.comida_nociva, false));
        sonidos.add(new Sonido("A una chica tan fina hay que cortejarla primero", R.raw.cortejarla, false));
        sonidos.add(new Sonido("Díselo a mi brillante culo metálico", R.raw.culo_metalico, false));
        sonidos.add(new Sonido("Danos caña tío", R.raw.danos_cana, false));
        sonidos.add(new Sonido("Puedo dejarlo en el momento que quiera", R.raw.dejarlo, false));
        sonidos.add(new Sonido("Era porno", R.raw.era_porno, false));
        sonidos.add(new Sonido("Eructo", R.raw.eructo, false));
        sonidos.add(new Sonido("Tío eso es tan feo como mi trabajo", R.raw.feo_trabajo, false));
        sonidos.add(new Sonido("Tengo gay-radar", R.raw.gay, false));
        sonidos.add(new Sonido("El humano medio", R.raw.humano_medio, false));
        sonidos.add(new Sonido("Jamás recuperare mi Martini", R.raw.martini, false));
        sonidos.add(new Sonido("Vamos mátame de una vez", R.raw.matame, false));
        sonidos.add(new Sonido("Te vienes a matar humanos?", R.raw.matar_humanos, false));
        sonidos.add(new Sonido("Diles que morí por robarle a un viejo", R.raw.mori_por_robar, false));
        sonidos.add(new Sonido("Muerte a los humanos!!", R.raw.muerte_humanos, false));
        sonidos.add(new Sonido("No hacen más que atormentarme con bailes y música ligera", R.raw.musica_ligera, false));
        sonidos.add(new Sonido("Eres una niña mala", R.raw.nina_mala, false));
        sonidos.add(new Sonido("Yo nunca le he facilitado la vida a nadie", R.raw.no_facilito, false));
        sonidos.add(new Sonido("Eres un ordenador malo", R.raw.ordenador_malo, false));
        sonidos.add(new Sonido("Podrías cerrar tu orificio sonoro?", R.raw.orificio_sonoro, false));
        sonidos.add(new Sonido("Me montare mi propio parque", R.raw.parque, false));
        sonidos.add(new Sonido("Fue ella quien me programo para el mal", R.raw.programo_mal, false));
        sonidos.add(new Sonido("Una ranita iba caminando", R.raw.ranita, false));
        sonidos.add(new Sonido("Robosexuales", R.raw.robosexuales, false));
        sonidos.add(new Sonido("Te sermoneo yo?", R.raw.sermoneo, false));
        sonidos.add(new Sonido("Estoy sobrio y loco", R.raw.sobrio_y_loco, false));
        // v1.0.1
        sonidos.add(new Sonido("Mi nombre completo", R.raw.nombre, false));
        sonidos.add(new Sonido("Eres un amigo de mierda", R.raw.amigo_de_mierda, false));
        sonidos.add(new Sonido("Aprender divierte", R.raw.aprender_divierte, false));
        sonidos.add(new Sonido("Bésame la carcase de atrás", R.raw.besame, false));
        sonidos.add(new Sonido("Chúpate esa", R.raw.chupate_esa, false));
        sonidos.add(new Sonido("A que no adivinan de que son complices?", R.raw.complices, false));
        sonidos.add(new Sonido("Hemos vuelto", R.raw.hemos_vuelto, false));
        sonidos.add(new Sonido("Aquí tenéis todo lo que necesitáis", R.raw.todo_lo_q_necesitais, false));
        sonidos.add(new Sonido("Tu madre", R.raw.tu_madre, false));
        sonidos.add(new Sonido("Tus muelas pringao", R.raw.tus_muelas_pringao, false));
        sonidos.add(new Sonido("Joder que frío", R.raw.joder_que_frio, false));
        // v1.0.2
        sonidos.add(new Sonido("Himno oficial de Robonia", R.raw.robonia, false));
        sonidos.add(new Sonido("De todos los amigos que he tenido, tu el único", R.raw.amigos, false));
        sonidos.add(new Sonido("Sigues trabajando de ampli por horas?", R.raw.ampli_x_horas, false));
        sonidos.add(new Sonido("Noto que estoy arto de robar", R.raw.arto_de_robar, false));
        sonidos.add(new Sonido("Esas chicas no llevan carcasa, llevan todos los circuitos al aire", R.raw.circuitos_al_aire, false));
        sonidos.add(new Sonido("Citas por ordenador", R.raw.citas_por_ordenador, false));
        sonidos.add(new Sonido("Conduciendo con el culo", R.raw.conduciendo_con_el_culo, false));
        sonidos.add(new Sonido("Demasiado extremista", R.raw.demasiado_extremista, false));
        sonidos.add(new Sonido("Esto esta que arde", R.raw.esto_esta_q_arde, false));
        sonidos.add(new Sonido("Eres un grano en el culo de la sociedad y jamás llegaras a nada", R.raw.grano_en_el_culo, false));
        sonidos.add(new Sonido("Guarra", R.raw.guarra, false));
        sonidos.add(new Sonido("Soy doblador", R.raw.soy_doblador, false));
        sonidos.add(new Sonido("Vine aquí con un sencillo sueño", R.raw.sueno, false));
        sonidos.add(new Sonido("Voy a robar", R.raw.voy_a_robar, false));
        // v2.0
        sonidos.add(new Sonido("Coleguilla", R.raw.coleguilla, false));
        sonidos.add(new Sonido("La crueldad ejercida por el anterior faraón ya es del pasado", R.raw.faraon, false));
        sonidos.add(new Sonido("Eso si que es un lametón", R.raw.lameton, false));
        sonidos.add(new Sonido("Yo también quiero ser popular", R.raw.popular, false));
        sonidos.add(new Sonido("Es tan rico que creo que yo voy a usar monoculo", R.raw.rico, false));
        sonidos.add(new Sonido("El logotipo Windows", R.raw.windows, false));
        // 2.1
        sonidos.add(new Sonido("Que jodíos... saben nadar", R.raw.jodios, false));
        sonidos.add(new Sonido("La prueba del jarrón", R.raw.prueba, false));
        sonidos.add(new Sonido("Pero que tonto eres",R.raw.tonto, false));
        // 2.2
        sonidos.add(new Sonido("A todos los tíos les gustan las zorras", R.raw.a_todos_los_tios_les_gustan_las_zorras, false));
        sonidos.add(new Sonido("Meneillos", R.raw.meneillos, false));
        sonidos.add(new Sonido("No podrías pagarlo, cielo", R.raw.no_podrias_pagarlo_cielo, false));
        sonidos.add(new Sonido("Eso se merece un solo de guitarra", R.raw.eso_se_merece_un_solo_de_guitarra, false));
        // 2.3
        sonidos.add(new Sonido("Intro", R.raw.intro, false));
        // 2.3.1
        sonidos.add(new Sonido("Aguanta mordisquitos el tío Bender va a rescatarte", R.raw.aguanta, false));
        sonidos.add(new Sonido("Ahora mismo tú me estás dando pena",R.raw.dandopena, false));
        sonidos.add(new Sonido("Bender intenta destruir el mundo con palabras que nunca dice", R.raw.destruirmundo, false));
        sonidos.add(new Sonido("Bender sisando a Don Bot", R.raw.sisando, false));
        sonidos.add(new Sonido("Bueno, la vida sigue", R.raw.lavidasigue, false));
        sonidos.add(new Sonido("Matar a todos los humanos", R.raw.mataratodosloshumanos, false));
        // 2.5
        sonidos.add(new Sonido("Selección de vinos", R.raw.selecciona_vinos, false));
        sonidos.add(new Sonido("Somos balleneros", R.raw.somos_balleneros, false));
        sonidos.add(new Sonido("Dios mio, estoy inundado de sentimientos",R.raw.inundado_sentimientos, false));
        sonidos.add(new Sonido("Así se hace", R.raw.asi_se_hace, false));
        sonidos.add(new Sonido("Cuantos caminos", R.raw.cuantos_caminos, false));
        sonidos.add(new Sonido("Infierno robot", R.raw.infierno_robot, false));
        sonidos.add(new Sonido("Mi amigo roto", R.raw.mi_amigo_roto, false));
        sonidos.add(new Sonido("Robahanukah", R.raw.robahanukah, false));
        sonidos.add(new Sonido("Como si usted no tuviera roña en el cuello", R.raw.rona_cuello, false));
        sonidos.add(new Sonido("Déjame probar con un 2x1", R.raw.probar_2x1, false));
        sonidos.add(new Sonido("Desde ahora soy imparable", R.raw.imparable, false));
        sonidos.add(new Sonido("Esto se merece un trago", R.raw.un_trago, false));
        sonidos.add(new Sonido("He descubierto la religión",R.raw.descubierto_religion, false));
        sonidos.add(new Sonido("Lo siento ha muerto", R.raw.ha_muerto, false));
        sonidos.add(new Sonido("No, gracias",R.raw.no_gracias, false));
        sonidos.add(new Sonido("Nos vamos de juerga", R.raw.vamos_de_juerga, false));
        sonidos.add(new Sonido("Podía doblar una viga a cualquier ángulo", R.raw.cualquier_angulo, false));
        sonidos.add(new Sonido("Si derribo a un jugador de un botellazo no creo que se levante", R.raw.botellazo, false));
        sonidos.add(new Sonido("Créditos", R.raw.creditos, false));
        sonidos.add(new Sonido("Sois tan amigos míos como de un tostador", R.raw.tostador, false));

        Collections.sort(sonidos, new Comparator<Sonido>() {
            public int compare(Sonido s1, Sonido s2) {
                return s1.getNombre().compareTo(s2.getNombre());
            }
        });
    }

}
