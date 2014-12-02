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

        sonidos.add(new Sonido(
                "Las tres mellizas", R.raw.las_tres_mellizas)
                .setUrlVideo("http://www.youtube.com/watch?v=E4OKM5VDAbM")
                .setImage(R.drawable.mellizas));
        sonidos.add(new Sonido(
                "Agallas, el perro cobarde", R.raw.agallas_el_perro_cobarde)
                .setUrlVideo("http://www.youtube.com/watch?v=al6wxL2UrO4")
                .setImage(R.drawable.agallas));
        sonidos.add(new Sonido(
                "Aladdín", R.raw.aladin)
                .setUrlVideo("http://www.youtube.com/watch?v=gXV5hbcHAQ0")
                .setImage(R.drawable.aladdin));
        sonidos.add(new Sonido(
                "Alfred J. Kwak", R.raw.alfred_j_kwak)
                .setUrlVideo("http://www.youtube.com/watch?v=gCwUCc88f20")
                .setImage(R.drawable.alfredjkwak));
        sonidos.add(new Sonido(
                "American dragon", R.raw.american_dragon)
                .setUrlVideo("http://www.youtube.com/watch?v=ot2zA8cx__o")
                .setImage(R.drawable.jakey_human));
        sonidos.add(new Sonido(
                "Bandolero", R.raw.bandolero)
                .setUrlVideo("http://www.youtube.com/watch?v=112FZf3xdOo")
                .setImage(R.drawable.bandolero));
        sonidos.add(new Sonido(
                "Batman", R.raw.batman)
                .setUrlVideo("http://www.youtube.com/watch?v=A71i0a5x-qA")
                .setImage(R.drawable.batman));
        sonidos.add(new Sonido(
                "Beetlejuice", R.raw.beetlejuice)
                .setUrlVideo("http://www.youtube.com/watch?v=dKAlWfjzRFU")
                .setImage(R.drawable.beetlejuice));
        sonidos.add(new Sonido(
                "Bob Esponja", R.raw.bob_esponja)
                .setUrlVideo("http://www.youtube.com/watch?v=ApLrwd1IlZM")
                .setImage(R.drawable.bob_esponja3));
        sonidos.add(new Sonido(
                "Bobobo", R.raw.bobobo)
                .setUrlVideo("http://www.youtube.com/watch?v=XNiZnlzX2c0")
                .setImage(R.drawable.bobobo1));
        sonidos.add(new Sonido(
                "Sakura cazadora de cartas", R.raw.card_captor_sakura)
                .setUrlVideo("http://www.youtube.com/watch?v=0PVRHRgmSb4")
                .setImage(R.drawable.sakura));
        sonidos.add(new Sonido(
                "Código Lyoko", R.raw.codigo_lyoko)
                .setUrlVideo("http://www.youtube.com/watch?v=UTVvgZyAyJE")
                .setImage(R.drawable.lyoko));
        sonidos.add(new Sonido(
                "Comando G", R.raw.comando_g)
                .setUrlVideo("http://www.youtube.com/watch?v=Zfx4X4JTzyw")
                .setImage(R.drawable.comandog));
        sonidos.add(new Sonido(
                "D'artacan y los tres mosqueperros", R.raw.d_artacan_y_los_tres_mosqueperros)
                .setUrlVideo("http://www.youtube.com/watch?v=0bRjnrODhzk")
                .setImage(R.drawable.dartacan));
        sonidos.add(new Sonido(
                "David El Gnomo", R.raw.david_el_gnomo)
                .setUrlVideo("http://www.youtube.com/watch?v=wnv_RZzCuzY")
                .setImage(R.drawable.davidgnomo));
        sonidos.add(new Sonido(
                "Detective Conan", R.raw.detective_conan)
                .setUrlVideo("http://www.youtube.com/watch?v=PxcB6QsZg7c")
                .setImage(R.drawable.detective_conan));
        sonidos.add(new Sonido(
                "Bola de Dan", R.raw.bola_de_dan)
                .setUrlVideo("http://www.youtube.com/watch?v=QD_VQEjwXuw")
                .setImage(R.drawable.bola_de_dan));
        sonidos.add(new Sonido(
                "Oliver & Benji", R.raw.oliver_benji)
                .setUrlVideo("http://www.youtube.com/watch?v=kCMfDbTOhQs")
                .setImage(R.drawable.oliverybengi));
        sonidos.add(new Sonido(
                "Digimon", R.raw.digimon_1)
                .setUrlVideo("http://www.youtube.com/watch?v=UXwunDD5Lm8")
                .setImage(R.drawable.digimon1));
        sonidos.add(new Sonido(
                "Digimon 02", R.raw.digimon_2)
                .setUrlVideo("http://www.youtube.com/watch?v=d5Bc16yQLcI")
                .setImage(R.drawable.digimon2));
        sonidos.add(new Sonido(
                "Digimon 3", R.raw.digimon_3)
                .setUrlVideo("http://www.youtube.com/watch?v=KwSQV_1FpHM")
                .setImage(R.drawable.digimon3));
        sonidos.add(new Sonido(
                "Digimon Frontier", R.raw.digimon_4)
                .setUrlVideo("http://www.youtube.com/watch?v=IQir2ihMXLQ")
                .setImage(R.drawable.digimon4));
        sonidos.add(new Sonido(
                "Don Quijote de la Mancha", R.raw.don_quijote_de_la_mancha)
                .setUrlVideo("http://www.youtube.com/watch?v=w4tFzD13hmc")
                .setImage(R.drawable.quijote));
        sonidos.add(new Sonido(
                "Dragones y Mazmorras", R.raw.dragones_y_mazmorras)
                .setUrlVideo("http://www.youtube.com/watch?v=wlX8gOW-m_I")
                .setImage(R.drawable.dym2));
        sonidos.add(new Sonido(
                "El Inspector Gadget", R.raw.el_inspector_gadget)
                .setUrlVideo("http://www.youtube.com/watch?v=qmNa7d_8V5k")
                .setImage(R.drawable.inspector_gadget));
        sonidos.add(new Sonido(
                "Fraggle Rock", R.raw.fraggle_rock)
                .setUrlVideo("http://www.youtube.com/watch?v=C9rRAnP8wWs")
                .setImage(R.drawable.fragglerock));
        sonidos.add(new Sonido(
                "Gargolas", R.raw.gargolas)
                .setUrlVideo("http://www.youtube.com/watch?v=t5m2pG7s1-g")
                .setImage(R.drawable.gargoyles1));
        sonidos.add(new Sonido(
                "HE-MAN", R.raw.he_man)
                .setUrlVideo("http://www.youtube.com/watch?v=YZLQ6zNxgKg")
                .setImage(R.drawable.heman));
        sonidos.add(new Sonido(
                "Pinky y Cerebro", R.raw.pinky_cerebro)
                .setUrlVideo("http://www.youtube.com/watch?v=olM6wZgIUHQ")
                .setImage(R.drawable.pinky_celebro));
        sonidos.add(new Sonido(
                "El gato Isidoro", R.raw.isidoro)
                .setUrlVideo("http://www.youtube.com/watch?v=Z1ZuXtRTy9Y")
                .setImage(R.drawable.isidoro));
        sonidos.add(new Sonido(
                "La abeja Maya", R.raw.la_abeja_maya)
                .setUrlVideo("http://www.youtube.com/watch?v=q_Wv-bHTRXM")
                .setImage(R.drawable.maya));
        sonidos.add(new Sonido(
                "La brigada de los sepultureros", R.raw.la_brigada_de_los_sepultureros)
                .setUrlVideo("http://www.youtube.com/watch?v=ydgLly986lI")
                .setImage(R.drawable.brigadasepultureros));
        sonidos.add(new Sonido(
                "La máscara", R.raw.la_mascara)
                .setUrlVideo("http://www.youtube.com/watch?v=woowZM07jXg")
                .setImage(R.drawable.mascara));
        sonidos.add(new Sonido(
                "Los cazafantasmas", R.raw.los_cazafantasmas)
                .setUrlVideo("http://www.youtube.com/watch?v=tTwnO2UnLpU")
                .setImage(R.drawable.los_autenticos_cazafantasmas));
        sonidos.add(new Sonido(
                "Los Fruittis", R.raw.los_fruittis)
                .setUrlVideo("http://www.youtube.com/watch?v=ie84eQmpg_U")
                .setImage(R.drawable.fruittis));
        sonidos.add(new Sonido(
                "Los Picapiedra", R.raw.los_picapiedra)
                .setUrlVideo("http://www.youtube.com/watch?v=ojuELFlb07c")
                .setImage(R.drawable.picapiedra));
        sonidos.add(new Sonido(
                "Los Trotamúsicos", R.raw.los_trotamusicos)
                .setUrlVideo("http://www.youtube.com/watch?v=kaVvHp9Q5X8")
                .setImage(R.drawable.t_trotamusicos1));
        sonidos.add(new Sonido(
                "Lucky Luke", R.raw.lucky_luke)
                .setUrlVideo("http://www.youtube.com/watch?v=3xrhNkjeQJE")
                .setImage(R.drawable.lucky_luke));
        sonidos.add(new Sonido(
                "Magical Doremi", R.raw.magical_doremi)
                .setUrlVideo("http://www.youtube.com/watch?v=AcYtFQT0ov4")
                .setImage(R.drawable.doremi));
        sonidos.add(new Sonido(
                "Marco", R.raw.marco)
                .setUrlVideo("http://www.youtube.com/watch?v=OPsQQFakmmA")
                .setImage(R.drawable.marcomono5tf));
        sonidos.add(new Sonido(
                "Mazinger Z", R.raw.mazinger_z)
                .setUrlVideo("http://www.youtube.com/watch?v=NCYznN1dhzA")
                .setImage(R.drawable.mazzinger));
        sonidos.add(new Sonido(
                "Montana", R.raw.montana)
                .setUrlVideo("http://www.youtube.com/watch?v=YCY7WeGMd8M")
                .setImage(R.drawable.montana));
        sonidos.add(new Sonido(
                "Motoratones de Marte", R.raw.motoratones_de_marte)
                .setUrlVideo("http://www.youtube.com/watch?v=x2Cq_VT0d7k")
                .setImage(R.drawable.motoratones));
        sonidos.add(new Sonido(
                "La pajarería de Transilvania", R.raw.la_pajareria_de_transilvania)
                .setUrlVideo("http://www.youtube.com/watch?v=vf3gwBzZZa4")
                .setImage(R.drawable.pajareria));
        sonidos.add(new Sonido(
                "Pingu", R.raw.pingu)
                .setUrlVideo("http://www.youtube.com/watch?v=aYNXqKaZWR4")
                .setImage(R.drawable.pingu));
        sonidos.add(new Sonido(
                "Pokémon", R.raw.pokemon)
                .setUrlVideo("http://www.youtube.com/watch?v=vYrSOdTrBzg")
                .setImage(R.drawable.animeash));
        sonidos.add(new Sonido(
                "Reena & Gaudy", R.raw.reena_gaudy)
                .setUrlVideo("http://www.youtube.com/watch?v=e05hJo1XbNQ")
                .setImage(R.drawable.slayers));
        sonidos.add(new Sonido(
                "Sailor Moon", R.raw.sailor_moon)
                .setUrlVideo("http://www.youtube.com/watch?v=GX3Ix6_yokM")
                .setImage(R.drawable.sailormoon1));
        sonidos.add(new Sonido(
                "Sherlock Holmes", R.raw.sherlock_holmes)
                .setUrlVideo("http://www.youtube.com/watch?v=W1ksMXKC6IE")
                .setImage(R.drawable.sherlok));
        sonidos.add(new Sonido(
                "Simba en los mundiales de fútbol", R.raw.simba_en_los_mundiales_de_futbol)
                .setUrlVideo("http://www.youtube.com/watch?v=Jm1pRzp4Ta4")
                .setImage(R.drawable.simba));
        sonidos.add(new Sonido(
                "Spiderman", R.raw.spiderman)
                .setUrlVideo("http://www.youtube.com/watch?v=KZw64rBswqc")
                .setImage(R.drawable.spiderman));
        sonidos.add(new Sonido(
                "Street Sharks", R.raw.street_sharks)
                .setUrlVideo("http://www.youtube.com/watch?v=Gf97nMHI5us")
                .setImage(R.drawable.street_sharks));
        sonidos.add(new Sonido(
                "Tazmania", R.raw.tazmania)
                .setUrlVideo("http://www.youtube.com/watch?v=0uSWbI8jr8A")
                .setImage(R.drawable.tazmania));
        sonidos.add(new Sonido(
                "Tiny Toons", R.raw.tiny_toons)
                .setUrlVideo("http://www.youtube.com/watch?v=qw0aAc0Z6Mo")
                .setImage(R.drawable.tiny_toon));
        sonidos.add(new Sonido(
                "Vaca y Pollo", R.raw.vaca_pollo)
                .setUrlVideo("https://dl.dropboxusercontent.com/u/31111602/dibus/videos/vaca-y-pollo-intro-spanish.3gp")
                .setImage(R.drawable.vacaypollo));
        sonidos.add(new Sonido(
                "Autos locos", R.raw.autos_locos)
                .setUrlVideo("http://www.youtube.com/watch?v=xWG5oteNwx4")
                .setImage(R.drawable.autos_locos1));
        sonidos.add(new Sonido(
                "Chicho Terremoto", R.raw.chicho_terremoto)
                .setUrlVideo("http://www.youtube.com/watch?v=1ZAJ1Bg55oU")
                .setImage(R.drawable.chicho));
        sonidos.add(new Sonido(
                "Johnny Bravo", R.raw.johnny_bravo)
                .setUrlVideo("https://dl.dropboxusercontent.com/u/31111602/dibus/videos/Johnny-Bravo-intro-spanish.3gp")
                .setImage(R.drawable.johnnybravo));
        sonidos.add(new Sonido(
                "Samurai Jack", R.raw.samurai_jack)
                .setUrlVideo("https://dl.dropboxusercontent.com/u/31111602/dibus/videos/Samurai-Jack-Intro-%5BHQ%5D.3gp")
                .setImage(R.drawable.samurai_jack));
        sonidos.add(new Sonido(
                "La vuelta al mundo de Willy Fog", R.raw.la_vuelta_al_mundo_de_willy_fog)
                .setUrlVideo("http://www.youtube.com/watch?v=NKtX8G6D-S8")
                .setImage(R.drawable.willy_fog));
        sonidos.add(new Sonido(
                "Érase una vez... la vida", R.raw.erase_una_vez_la_vida)
                .setUrlVideo("http://www.youtube.com/watch?v=tSXC052wNB4")
                .setImage(R.drawable.vida));
        sonidos.add(new Sonido(
                "Érase una vez... el hombre", R.raw.erase_una_vez_el_hombre)
                .setUrlVideo("http://www.youtube.com/watch?v=RjB9CLIdgBU")
                .setImage(R.drawable.hombre));
        sonidos.add(new Sonido(
                "Érase una vez... los inventores", R.raw.erase_una_vez_los_inventores)
                .setUrlVideo("http://www.youtube.com/watch?v=YLTfKTNjEa8")
                .setImage(R.drawable.inventores));
        sonidos.add(new Sonido(
                "Dragon Ball", R.raw.dragon_ball)
                .setUrlVideo("http://www.youtube.com/watch?v=uD7LKcXaqEU")
                .setImage(R.drawable.goku_pekeno));
        sonidos.add(new Sonido(
                "Dragon Ball Z", R.raw.dragon_ball_z)
                .setUrlVideo("http://www.youtube.com/watch?v=tzMUF7-nAdE")
                .setImage(R.drawable.dragon_ball_z));
        sonidos.add(new Sonido(
                "Dragon Ball GT", R.raw.dragon_ball_gt)
                .setUrlVideo("http://www.youtube.com/watch?v=6nrHvXxDxBo")
                .setImage(R.drawable.ssj4goku41));
        sonidos.add(new Sonido(
                "Heidi", R.raw.heidi)
                .setUrlVideo("http://www.youtube.com/watch?v=S-atH108Te0")
                .setImage(R.drawable.heidi));
        sonidos.add(new Sonido(
                "Barrio Sésamo", R.raw.barrio_sesamo)
                .setUrlVideo("http://www.youtube.com/watch?v=va7jsVHaDyU")
                .setImage(R.drawable.espinete));
        sonidos.add(new Sonido(
                "Los mundos de Yupi", R.raw.los_mundos_de_yupi)
                .setUrlVideo("http://www.youtube.com/watch?v=24SyZ6Ikoz8")
                .setImage(R.drawable.yupi));
        sonidos.add(new Sonido(
                "¿Qué Hay de Nuevo Scooby Doo?", R.raw.que_hay_de_nuevo_scooby_doo)
                .setUrlVideo("https://dl.dropboxusercontent.com/u/31111602/dibus/videos/Que%20Hay%20de%20Nuevo%20Scooby%20Doo.3gp")
                .setImage(R.drawable.scooby));
        sonidos.add(new Sonido(
                "Ranma", R.raw.ranma)
                .setUrlVideo("http://www.youtube.com/watch?v=TGb6UwPCif4")
                .setImage(R.drawable.ranma12));
        sonidos.add(new Sonido(
                "Lum, la Chica Invasora", R.raw.lum_la_chica_invasora)
                .setUrlVideo("http://www.youtube.com/watch?v=8Wh6c733wqc")
                .setImage(R.drawable.lum));
        sonidos.add(new Sonido(
                "Los caballeros del Zodiaco", R.raw.caballeros_del_zodiaco)
                .setUrlVideo("http://www.youtube.com/watch?v=Maai0Eh-nlI")
                .setImage(R.drawable.caballeros));
        sonidos.add(new Sonido(
                "Calimero & Priscilla", R.raw.calimero)
                .setUrlVideo("http://www.youtube.com/watch?v=Ju9hIlynVZw")
                .setImage(R.drawable.calimero));
        sonidos.add(new Sonido(
                "Tiranosaurius Rex", R.raw.tiranosaurius_rex)
                .setUrlVideo("http://www.youtube.com/watch?v=0g-D8Ksh2C8")
                .setImage(R.drawable.trex));
        sonidos.add(new Sonido(
                "Tortugas Ninja", R.raw.tortugas_ninja)
                .setUrlVideo("http://www.youtube.com/watch?v=G4UZPAwRtgc")
                .setImage(R.drawable.tortugasninja));
        sonidos.add(new Sonido(
                "Godzilla: The Series", R.raw.godzilla)
                .setUrlVideo("http://www.youtube.com/watch?v=1b2CtgkwJQA")
                .setImage(R.drawable.godzilla_the_series));
        sonidos.add(new Sonido(
                "Doraemon", R.raw.doraemon)
                .setUrlVideo("http://www.youtube.com/watch?v=ghW2bX7YNPI")
                .setImage(R.drawable.doraemon));
        sonidos.add(new Sonido(
                "Shin Chan", R.raw.shin_chan)
                .setUrlVideo("http://www.youtube.com/watch?v=I7A1AYrYTWI")
                .setImage(R.drawable.shin20chan2014br31));
        sonidos.add(new Sonido(
                "La aldea del Arce", R.raw.la_aldea_del_arce)
                .setUrlVideo("http://www.youtube.com/watch?v=HTvyAS5DNFY")
                .setImage(R.drawable.laaldeadelarce));
        sonidos.add(new Sonido(
                "Chip y Chop", R.raw.chip_y_chop)
                .setUrlVideo("http://www.youtube.com/watch?v=ZVLvNyLl6EY")
                .setImage(R.drawable.chipychop));
        sonidos.add(new Sonido(
                "La banda del patio", R.raw.la_banda_del_patio)
                .setUrlVideo("www.youtube.com/watch?v=EpxDCBIk-CE")
                .setImage(R.drawable.labandadelpatio));
        sonidos.add(new Sonido(
                "Caillou", R.raw.caillou)
                .setUrlVideo("http://dl.dropbox.com/u/31111602/dibus/videos/Caillou.3gp")
                .setImage(R.drawable.caillou));
        sonidos.add(new Sonido(
                "Candy Candy", R.raw.candy_candy)
                .setUrlVideo("http://www.youtube.com/watch?v=U2WW5ZiUeoc")
                .setImage(R.drawable.candy));
        sonidos.add(new Sonido(
                "Garfield y sus Amigos", R.raw.garfield)
                .setUrlVideo("http://www.youtube.com/watch?v=eX04Pwp_tlk")
                .setImage(R.drawable.garfield));
        sonidos.add(new Sonido(
                "Los Osos Gummi", R.raw.los_osos_gummi)
                .setUrlVideo("http://www.youtube.com/watch?v=6z2_JiFJZRY")
                .setImage(R.drawable.ososgummi));
        sonidos.add(new Sonido(
                "Marcelino pan y vino", R.raw.marcelino_pan_y_vino)
                .setUrlVideo("http://www.youtube.com/watch?v=tiqyGMjiWSw")
                .setImage(R.drawable.marcelino));
        sonidos.add(new Sonido(
                "Mofli, el último koala", R.raw.mofli_el_ultimo_koala)
                .setUrlVideo("http://www.youtube.com/watch?v=fWzeW3SeD2o")
                .setImage(R.drawable.mofli));
        sonidos.add(new Sonido(
                "Vickie el vikingo", R.raw.vickie_el_vikingo)
                .setUrlVideo("http://dl.dropbox.com/u/31111602/dibus/videos/Vickie%20el%20vikingo.3gp")
                .setImage(R.drawable.vickie));
        sonidos.add(new Sonido("Animaniacs", R.raw.animaniacs)
                .setUrlVideo("http://www.youtube.com/watch?v=9Qcq8cMaEBs")
                .setImage(R.drawable.animaniacs));
        sonidos.add(new Sonido(
                "Ben 10 Alien Force", R.raw.ben_10_alien_force)
                .setUrlVideo("http://www.youtube.com/watch?v=QyizoLNRYaY")
                .setImage(R.drawable.ben10af));
        sonidos.add(new Sonido(
                "Ben 10 Ultimate Alien", R.raw.ben_10_ultimate_alien)
                .setUrlVideo("http://www.youtube.com/watch?v=J8MgKCQ1cy8")
                .setImage(R.drawable.ben10ultimatealien));
        sonidos.add(new Sonido(
                "Ben 10", R.raw.ben_10)
                .setUrlVideo("http://www.youtube.com/watch?v=b4FDrioGZg0")
                .setImage(R.drawable.ben10));
        sonidos.add(new Sonido(
                "Hércules", R.raw.hercules)
                .setUrlVideo("http://www.youtube.com/watch?v=n4t5_vXCTEY")
                .setImage(R.drawable.hercules));
        sonidos.add(new Sonido(
                "Monster Rancher", R.raw.monster_rancher)
                .setUrlVideo("http://www.youtube.com/watch?v=M16hPgL2pO4")
                .setImage(R.drawable.monsterrancher));
        sonidos.add(new Sonido(
                "Timon y Pumba", R.raw.timon_pumba)
                .setUrlVideo("http://www.youtube.com/watch?v=BoFE0JpZroM")
                .setImage(R.drawable.timonypumba));
        sonidos.add(new Sonido(
                "Titeuf", R.raw.titeuf)
                .setUrlVideo("http://www.youtube.com/watch?v=vQztL2RafuA")
                .setImage(R.drawable.titeuf));
        //1.10
        sonidos.add(new Sonido(
                "BeyBlade", R.raw.beyblade)
                .setUrlVideo("http://www.youtube.com/watch?v=47JlsqmenKo")
                .setImage(R.drawable.beyblade));
        sonidos.add(new Sonido(
                "Bleach", R.raw.bleach)
                .setUrlVideo("http://dl.dropbox.com/u/31111602/dibus/videos/Bleach.3gp")
                .setImage(R.drawable.bleach));
        sonidos.add(new Sonido(
                "Don Gato", R.raw.don_gato)
                .setUrlVideo("http://www.youtube.com/watch?v=pFbkpGVne5k")
                .setImage(R.drawable.don_gato));
        sonidos.add(new Sonido(
                "Ed, Edd y Eddy", R.raw.ed_edd_eddy)
                .setUrlVideo("http://www.youtube.com/watch?v=BjZg1mMtz3g")
                .setImage(R.drawable.ededdyeddy));
        sonidos.add(new Sonido(
                "El laboratorio de Dexter", R.raw.el_laboratorio_de_dexter)
                .setUrlVideo("http://www.youtube.com/watch?v=_RQGcMvRlh8")
                .setImage(R.drawable.dexter));
        sonidos.add(new Sonido(
                "Evangelion", R.raw.evangelion)
                .setUrlVideo("http://www.youtube.com/watch?v=3nQNSLB3Lpk")
                .setImage(R.drawable.evangelion));
        sonidos.add(new Sonido(
                "Felix el gato", R.raw.felix_el_gato)
                .setUrlVideo("http://www.youtube.com/watch?v=uqcM-AQzyAE")
                .setImage(R.drawable.felixelgato));
        sonidos.add(new Sonido(
                "Los Pitufos", R.raw.los_pitufos)
                .setUrlVideo("http://www.youtube.com/watch?v=dWDqgIlhWic")
                .setImage(R.drawable.pitufos));
        sonidos.add(new Sonido(
                "Mortadelo y Filemón", R.raw.mortadelo_y_filemon)
                .setUrlVideo("http://www.youtube.com/watch?v=l-vEN3VmfVo")
                .setImage(R.drawable.mortadelo_y_filemon));
        sonidos.add(new Sonido(
                "Rugrats", R.raw.rugrats)
                .setUrlVideo("http://www.youtube.com/watch?v=R1NVdxGOW-Q")
                .setImage(R.drawable.rugrats));
        sonidos.add(new Sonido(
                "Sonic el Erizo", R.raw.sonic_el_erizo)
                .setUrlVideo("http://www.youtube.com/watch?v=9I9EbvXDgMM")
                .setImage(R.drawable.sonic_erizo));
        sonidos.add(new Sonido(
                "Sonic X", R.raw.sonic_x)
                .setUrlVideo("http://www.youtube.com/watch?v=Lc_bUPrtOr0")
                .setImage(R.drawable.sonicx));
        sonidos.add(new Sonido(
                "Sonic the Hedgehog", R.raw.sonic_the_hedgehog)
                .setUrlVideo("http://www.youtube.com/watch?v=HZ2RdImvSwg")
                .setImage(R.drawable.sonic));
        sonidos.add(new Sonido(
                "Teen Titans", R.raw.teen_titans)
                .setUrlVideo("http://www.youtube.com/watch?v=QWaWvQuIVMI")
                .setImage(R.drawable.teen_titans));
        sonidos.add(new Sonido("La familia Addams", R.raw.la_familia_addams)
                .setUrlVideo("http://www.youtube.com/watch?v=IokBKvFiCvM")
                .setImage(R.drawable.addams));
        sonidos.add(new Sonido("Transformers", R.raw.transformers)
                .setUrlVideo("http://www.youtube.com/watch?v=nLS2N9mHWaw")
                .setImage(R.drawable.transformers));

        //1.11
        sonidos.add(new Sonido("Yat", R.raw.yat)
                .setUrlVideo("http://www.youtube.com/watch?v=4u-9XGMfoFo")
                .setImage(R.drawable.yatanshinuchuuryokou));
        sonidos.add(new Sonido("Los Simpson", R.raw.the_simpsons)
                .setUrlVideo("http://www.youtube.com/watch?v=rb82TUYoa88")
                .setImage(R.drawable.simpson));
        sonidos.add(new Sonido("One Piece", R.raw.one_piece)
                .setUrlVideo("http://www.youtube.com/watch?v=Rneym8RSoKI")
                .setImage(R.drawable.one_piece));
        sonidos.add(new Sonido("Futurama", R.raw.futurama)
                .setUrlVideo("http://www.youtube.com/watch?v=n8xw9VLiYlU")
                .setImage(R.drawable.futurama));
        sonidos.add(new Sonido("Padre de familia", R.raw.family_guy)
                .setUrlVideo("http://www.youtube.com/watch?v=koGoQjXuovY")
                .setImage(R.drawable.family_guy));

        // 1.12
        sonidos.add(new Sonido("Pocoyo", R.raw.pocoyo)
                .setUrlVideo("https://www.youtube.com/watch?v=bkL1RnYrso4")
                .setImage(R.drawable.pocoyo)
                .setNuevo());
        sonidos.add(new Sonido("Dora la exploradora", R.raw.dora_la_exploradora)
                .setImage(R.drawable.dora)
                .setNuevo());
        sonidos.add(new Sonido("Peppa Pig", R.raw.peppa_pig)
                .setImage(R.drawable.peppa)
                .setNuevo());

        Collections.sort(sonidos, new Comparator<Sonido>() {
            public int compare(Sonido s1, Sonido s2) {
                return s1.getNombre().compareTo(s2.getNombre());
            }
        });
    }

}
