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

        sounds.add(new Sound(
                "Las tres mellizas", R.raw.las_tres_mellizas)
                .setUrlVideo("http://www.youtube.com/watch?v=E4OKM5VDAbM")
                .setImage(R.drawable.mellizas));
        sounds.add(new Sound(
                "Agallas, el perro cobarde", R.raw.agallas_el_perro_cobarde)
                .setUrlVideo("http://www.youtube.com/watch?v=al6wxL2UrO4")
                .setImage(R.drawable.agallas));
        sounds.add(new Sound(
                "Aladdín", R.raw.aladin)
                .setUrlVideo("http://www.youtube.com/watch?v=gXV5hbcHAQ0")
                .setImage(R.drawable.aladdin));
        sounds.add(new Sound(
                "Alfred J. Kwak", R.raw.alfred_j_kwak)
                .setUrlVideo("http://www.youtube.com/watch?v=gCwUCc88f20")
                .setImage(R.drawable.alfredjkwak));
        sounds.add(new Sound(
                "American dragon", R.raw.american_dragon)
                .setUrlVideo("http://www.youtube.com/watch?v=ot2zA8cx__o")
                .setImage(R.drawable.jakey_human));
        sounds.add(new Sound(
                "Bandolero", R.raw.bandolero)
                .setUrlVideo("http://www.youtube.com/watch?v=112FZf3xdOo")
                .setImage(R.drawable.bandolero));
        sounds.add(new Sound(
                "Batman", R.raw.batman)
                .setUrlVideo("http://www.youtube.com/watch?v=A71i0a5x-qA")
                .setImage(R.drawable.batman));
        sounds.add(new Sound(
                "Beetlejuice", R.raw.beetlejuice)
                .setUrlVideo("http://www.youtube.com/watch?v=dKAlWfjzRFU")
                .setImage(R.drawable.beetlejuice));
        sounds.add(new Sound(
                "Bob Esponja", R.raw.bob_esponja)
                .setUrlVideo("http://www.youtube.com/watch?v=ApLrwd1IlZM")
                .setImage(R.drawable.bob_esponja3));
        sounds.add(new Sound(
                "Bobobo", R.raw.bobobo)
                .setUrlVideo("http://www.youtube.com/watch?v=XNiZnlzX2c0")
                .setImage(R.drawable.bobobo1));
        sounds.add(new Sound(
                "Sakura cazadora de cartas", R.raw.card_captor_sakura)
                .setUrlVideo("http://www.youtube.com/watch?v=0PVRHRgmSb4")
                .setImage(R.drawable.sakura));
        sounds.add(new Sound(
                "Código Lyoko", R.raw.codigo_lyoko)
                .setUrlVideo("http://www.youtube.com/watch?v=UTVvgZyAyJE")
                .setImage(R.drawable.lyoko));
        sounds.add(new Sound(
                "Comando G", R.raw.comando_g)
                .setUrlVideo("http://www.youtube.com/watch?v=Zfx4X4JTzyw")
                .setImage(R.drawable.comandog));
        sounds.add(new Sound(
                "D'artacan y los tres mosqueperros", R.raw.d_artacan_y_los_tres_mosqueperros)
                .setUrlVideo("http://www.youtube.com/watch?v=0bRjnrODhzk")
                .setImage(R.drawable.dartacan));
        sounds.add(new Sound(
                "David El Gnomo", R.raw.david_el_gnomo)
                .setUrlVideo("http://www.youtube.com/watch?v=wnv_RZzCuzY")
                .setImage(R.drawable.davidgnomo));
        sounds.add(new Sound(
                "Detective Conan", R.raw.detective_conan)
                .setUrlVideo("http://www.youtube.com/watch?v=PxcB6QsZg7c")
                .setImage(R.drawable.detective_conan));
        sounds.add(new Sound(
                "Bola de Dan", R.raw.bola_de_dan)
                .setUrlVideo("http://www.youtube.com/watch?v=QD_VQEjwXuw")
                .setImage(R.drawable.bola_de_dan));
        sounds.add(new Sound(
                "Oliver & Benji", R.raw.oliver_benji)
                .setUrlVideo("http://www.youtube.com/watch?v=kCMfDbTOhQs")
                .setImage(R.drawable.oliverybengi));
        sounds.add(new Sound(
                "Digimon", R.raw.digimon_1)
                .setUrlVideo("http://www.youtube.com/watch?v=UXwunDD5Lm8")
                .setImage(R.drawable.digimon1));
        sounds.add(new Sound(
                "Digimon 02", R.raw.digimon_2)
                .setUrlVideo("http://www.youtube.com/watch?v=d5Bc16yQLcI")
                .setImage(R.drawable.digimon2));
        sounds.add(new Sound(
                "Digimon 3", R.raw.digimon_3)
                .setUrlVideo("http://www.youtube.com/watch?v=KwSQV_1FpHM")
                .setImage(R.drawable.digimon3));
        sounds.add(new Sound(
                "Digimon Frontier", R.raw.digimon_4)
                .setUrlVideo("http://www.youtube.com/watch?v=IQir2ihMXLQ")
                .setImage(R.drawable.digimon4));
        sounds.add(new Sound(
                "Don Quijote de la Mancha", R.raw.don_quijote_de_la_mancha)
                .setUrlVideo("http://www.youtube.com/watch?v=w4tFzD13hmc")
                .setImage(R.drawable.quijote));
        sounds.add(new Sound(
                "Dragones y Mazmorras", R.raw.dragones_y_mazmorras)
                .setUrlVideo("http://www.youtube.com/watch?v=wlX8gOW-m_I")
                .setImage(R.drawable.dym2));
        sounds.add(new Sound(
                "El Inspector Gadget", R.raw.el_inspector_gadget)
                .setUrlVideo("http://www.youtube.com/watch?v=qmNa7d_8V5k")
                .setImage(R.drawable.inspector_gadget));
        sounds.add(new Sound(
                "Fraggle Rock", R.raw.fraggle_rock)
                .setUrlVideo("http://www.youtube.com/watch?v=C9rRAnP8wWs")
                .setImage(R.drawable.fragglerock));
        sounds.add(new Sound(
                "Gargolas", R.raw.gargolas)
                .setUrlVideo("http://www.youtube.com/watch?v=t5m2pG7s1-g")
                .setImage(R.drawable.gargoyles1));
        sounds.add(new Sound(
                "HE-MAN", R.raw.he_man)
                .setUrlVideo("http://www.youtube.com/watch?v=YZLQ6zNxgKg")
                .setImage(R.drawable.heman));
        sounds.add(new Sound(
                "Pinky y Cerebro", R.raw.pinky_cerebro)
                .setUrlVideo("http://www.youtube.com/watch?v=olM6wZgIUHQ")
                .setImage(R.drawable.pinky_celebro));
        sounds.add(new Sound(
                "El gato Isidoro", R.raw.isidoro)
                .setUrlVideo("http://www.youtube.com/watch?v=Z1ZuXtRTy9Y")
                .setImage(R.drawable.isidoro));
        sounds.add(new Sound(
                "La abeja Maya", R.raw.la_abeja_maya)
                .setUrlVideo("http://www.youtube.com/watch?v=q_Wv-bHTRXM")
                .setImage(R.drawable.maya));
        sounds.add(new Sound(
                "La brigada de los sepultureros", R.raw.la_brigada_de_los_sepultureros)
                .setUrlVideo("http://www.youtube.com/watch?v=ydgLly986lI")
                .setImage(R.drawable.brigadasepultureros));
        sounds.add(new Sound(
                "La máscara", R.raw.la_mascara)
                .setUrlVideo("http://www.youtube.com/watch?v=woowZM07jXg")
                .setImage(R.drawable.mascara));
        sounds.add(new Sound(
                "Los cazafantasmas", R.raw.los_cazafantasmas)
                .setUrlVideo("http://www.youtube.com/watch?v=tTwnO2UnLpU")
                .setImage(R.drawable.los_autenticos_cazafantasmas));
        sounds.add(new Sound(
                "Los Fruittis", R.raw.los_fruittis)
                .setUrlVideo("http://www.youtube.com/watch?v=ie84eQmpg_U")
                .setImage(R.drawable.fruittis));
        sounds.add(new Sound(
                "Los Picapiedra", R.raw.los_picapiedra)
                .setUrlVideo("http://www.youtube.com/watch?v=ojuELFlb07c")
                .setImage(R.drawable.picapiedra));
        sounds.add(new Sound(
                "Los Trotamúsicos", R.raw.los_trotamusicos)
                .setUrlVideo("http://www.youtube.com/watch?v=kaVvHp9Q5X8")
                .setImage(R.drawable.t_trotamusicos1));
        sounds.add(new Sound(
                "Lucky Luke", R.raw.lucky_luke)
                .setUrlVideo("http://www.youtube.com/watch?v=3xrhNkjeQJE")
                .setImage(R.drawable.lucky_luke));
        sounds.add(new Sound(
                "Magical Doremi", R.raw.magical_doremi)
                .setUrlVideo("http://www.youtube.com/watch?v=AcYtFQT0ov4")
                .setImage(R.drawable.doremi));
        sounds.add(new Sound(
                "Marco", R.raw.marco)
                .setUrlVideo("http://www.youtube.com/watch?v=OPsQQFakmmA")
                .setImage(R.drawable.marcomono5tf));
        sounds.add(new Sound(
                "Mazinger Z", R.raw.mazinger_z)
                .setUrlVideo("http://www.youtube.com/watch?v=NCYznN1dhzA")
                .setImage(R.drawable.mazzinger));
        sounds.add(new Sound(
                "Montana", R.raw.montana)
                .setUrlVideo("http://www.youtube.com/watch?v=YCY7WeGMd8M")
                .setImage(R.drawable.montana));
        sounds.add(new Sound(
                "Motoratones de Marte", R.raw.motoratones_de_marte)
                .setUrlVideo("http://www.youtube.com/watch?v=x2Cq_VT0d7k")
                .setImage(R.drawable.motoratones));
        sounds.add(new Sound(
                "La pajarería de Transilvania", R.raw.la_pajareria_de_transilvania)
                .setUrlVideo("http://www.youtube.com/watch?v=vf3gwBzZZa4")
                .setImage(R.drawable.pajareria));
        sounds.add(new Sound(
                "Pingu", R.raw.pingu)
                .setUrlVideo("http://www.youtube.com/watch?v=aYNXqKaZWR4")
                .setImage(R.drawable.pingu));
        sounds.add(new Sound(
                "Pokémon", R.raw.pokemon)
                .setUrlVideo("http://www.youtube.com/watch?v=vYrSOdTrBzg")
                .setImage(R.drawable.animeash));
        sounds.add(new Sound(
                "Reena & Gaudy", R.raw.reena_gaudy)
                .setUrlVideo("http://www.youtube.com/watch?v=e05hJo1XbNQ")
                .setImage(R.drawable.slayers));
        sounds.add(new Sound(
                "Sailor Moon", R.raw.sailor_moon)
                .setUrlVideo("http://www.youtube.com/watch?v=GX3Ix6_yokM")
                .setImage(R.drawable.sailormoon1));
        sounds.add(new Sound(
                "Sherlock Holmes", R.raw.sherlock_holmes)
                .setUrlVideo("http://www.youtube.com/watch?v=W1ksMXKC6IE")
                .setImage(R.drawable.sherlok));
        sounds.add(new Sound(
                "Simba en los mundiales de fútbol", R.raw.simba_en_los_mundiales_de_futbol)
                .setUrlVideo("http://www.youtube.com/watch?v=Jm1pRzp4Ta4")
                .setImage(R.drawable.simba));
        sounds.add(new Sound(
                "Spiderman", R.raw.spiderman)
                .setUrlVideo("http://www.youtube.com/watch?v=KZw64rBswqc")
                .setImage(R.drawable.spiderman));
        sounds.add(new Sound(
                "Street Sharks", R.raw.street_sharks)
                .setUrlVideo("http://www.youtube.com/watch?v=Gf97nMHI5us")
                .setImage(R.drawable.street_sharks));
        sounds.add(new Sound(
                "Tazmania", R.raw.tazmania)
                .setUrlVideo("http://www.youtube.com/watch?v=0uSWbI8jr8A")
                .setImage(R.drawable.tazmania));
        sounds.add(new Sound(
                "Tiny Toons", R.raw.tiny_toons)
                .setUrlVideo("http://www.youtube.com/watch?v=qw0aAc0Z6Mo")
                .setImage(R.drawable.tiny_toon));
        sounds.add(new Sound(
                "Vaca y Pollo", R.raw.vaca_pollo)
                .setUrlVideo("https://dl.dropboxusercontent.com/u/31111602/dibus/videos/vaca-y-pollo-intro-spanish.3gp")
                .setImage(R.drawable.vacaypollo));
        sounds.add(new Sound(
                "Autos locos", R.raw.autos_locos)
                .setUrlVideo("http://www.youtube.com/watch?v=xWG5oteNwx4")
                .setImage(R.drawable.autos_locos1));
        sounds.add(new Sound(
                "Chicho Terremoto", R.raw.chicho_terremoto)
                .setUrlVideo("http://www.youtube.com/watch?v=1ZAJ1Bg55oU")
                .setImage(R.drawable.chicho));
        sounds.add(new Sound(
                "Johnny Bravo", R.raw.johnny_bravo)
                .setUrlVideo("https://dl.dropboxusercontent.com/u/31111602/dibus/videos/Johnny-Bravo-intro-spanish.3gp")
                .setImage(R.drawable.johnnybravo));
        sounds.add(new Sound(
                "Samurai Jack", R.raw.samurai_jack)
                .setUrlVideo("https://dl.dropboxusercontent.com/u/31111602/dibus/videos/Samurai-Jack-Intro-%5BHQ%5D.3gp")
                .setImage(R.drawable.samurai_jack));
        sounds.add(new Sound(
                "La vuelta al mundo de Willy Fog", R.raw.la_vuelta_al_mundo_de_willy_fog)
                .setUrlVideo("http://www.youtube.com/watch?v=NKtX8G6D-S8")
                .setImage(R.drawable.willy_fog));
        sounds.add(new Sound(
                "Érase una vez... la vida", R.raw.erase_una_vez_la_vida)
                .setUrlVideo("http://www.youtube.com/watch?v=tSXC052wNB4")
                .setImage(R.drawable.vida));
        sounds.add(new Sound(
                "Érase una vez... el hombre", R.raw.erase_una_vez_el_hombre)
                .setUrlVideo("http://www.youtube.com/watch?v=RjB9CLIdgBU")
                .setImage(R.drawable.hombre));
        sounds.add(new Sound(
                "Érase una vez... los inventores", R.raw.erase_una_vez_los_inventores)
                .setUrlVideo("http://www.youtube.com/watch?v=YLTfKTNjEa8")
                .setImage(R.drawable.inventores));
        sounds.add(new Sound(
                "Dragon Ball", R.raw.dragon_ball)
                .setUrlVideo("http://www.youtube.com/watch?v=uD7LKcXaqEU")
                .setImage(R.drawable.goku_pekeno));
        sounds.add(new Sound(
                "Dragon Ball Z", R.raw.dragon_ball_z)
                .setUrlVideo("http://www.youtube.com/watch?v=tzMUF7-nAdE")
                .setImage(R.drawable.dragon_ball_z));
        sounds.add(new Sound(
                "Dragon Ball GT", R.raw.dragon_ball_gt)
                .setUrlVideo("http://www.youtube.com/watch?v=6nrHvXxDxBo")
                .setImage(R.drawable.ssj4goku41));
        sounds.add(new Sound(
                "Heidi", R.raw.heidi)
                .setUrlVideo("http://www.youtube.com/watch?v=S-atH108Te0")
                .setImage(R.drawable.heidi));
        sounds.add(new Sound(
                "Barrio Sésamo", R.raw.barrio_sesamo)
                .setUrlVideo("http://www.youtube.com/watch?v=va7jsVHaDyU")
                .setImage(R.drawable.espinete));
        sounds.add(new Sound(
                "Los mundos de Yupi", R.raw.los_mundos_de_yupi)
                .setUrlVideo("http://www.youtube.com/watch?v=24SyZ6Ikoz8")
                .setImage(R.drawable.yupi));
        sounds.add(new Sound(
                "¿Qué Hay de Nuevo Scooby Doo?", R.raw.que_hay_de_nuevo_scooby_doo)
                .setUrlVideo("https://dl.dropboxusercontent.com/u/31111602/dibus/videos/Que%20Hay%20de%20Nuevo%20Scooby%20Doo.3gp")
                .setImage(R.drawable.scooby));
        sounds.add(new Sound(
                "Ranma", R.raw.ranma)
                .setUrlVideo("http://www.youtube.com/watch?v=TGb6UwPCif4")
                .setImage(R.drawable.ranma12));
        sounds.add(new Sound(
                "Lum, la Chica Invasora", R.raw.lum_la_chica_invasora)
                .setUrlVideo("http://www.youtube.com/watch?v=8Wh6c733wqc")
                .setImage(R.drawable.lum));
        sounds.add(new Sound(
                "Los caballeros del Zodiaco", R.raw.caballeros_del_zodiaco)
                .setUrlVideo("http://www.youtube.com/watch?v=Maai0Eh-nlI")
                .setImage(R.drawable.caballeros));
        sounds.add(new Sound(
                "Calimero & Priscilla", R.raw.calimero)
                .setUrlVideo("http://www.youtube.com/watch?v=Ju9hIlynVZw")
                .setImage(R.drawable.calimero));
        sounds.add(new Sound(
                "Tiranosaurius Rex", R.raw.tiranosaurius_rex)
                .setUrlVideo("http://www.youtube.com/watch?v=0g-D8Ksh2C8")
                .setImage(R.drawable.trex));
        sounds.add(new Sound(
                "Tortugas Ninja", R.raw.tortugas_ninja)
                .setUrlVideo("http://www.youtube.com/watch?v=G4UZPAwRtgc")
                .setImage(R.drawable.tortugasninja));
        sounds.add(new Sound(
                "Godzilla: The Series", R.raw.godzilla)
                .setUrlVideo("http://www.youtube.com/watch?v=1b2CtgkwJQA")
                .setImage(R.drawable.godzilla_the_series));
        sounds.add(new Sound(
                "Doraemon", R.raw.doraemon)
                .setUrlVideo("http://www.youtube.com/watch?v=ghW2bX7YNPI")
                .setImage(R.drawable.doraemon));
        sounds.add(new Sound(
                "Shin Chan", R.raw.shin_chan)
                .setUrlVideo("http://www.youtube.com/watch?v=I7A1AYrYTWI")
                .setImage(R.drawable.shin20chan2014br31));
        sounds.add(new Sound(
                "La aldea del Arce", R.raw.la_aldea_del_arce)
                .setUrlVideo("http://www.youtube.com/watch?v=HTvyAS5DNFY")
                .setImage(R.drawable.laaldeadelarce));
        sounds.add(new Sound(
                "Chip y Chop", R.raw.chip_y_chop)
                .setUrlVideo("http://www.youtube.com/watch?v=ZVLvNyLl6EY")
                .setImage(R.drawable.chipychop));
        sounds.add(new Sound(
                "La banda del patio", R.raw.la_banda_del_patio)
                .setUrlVideo("www.youtube.com/watch?v=EpxDCBIk-CE")
                .setImage(R.drawable.labandadelpatio));
        sounds.add(new Sound(
                "Caillou", R.raw.caillou)
                .setUrlVideo("http://dl.dropbox.com/u/31111602/dibus/videos/Caillou.3gp")
                .setImage(R.drawable.caillou));
        sounds.add(new Sound(
                "Candy Candy", R.raw.candy_candy)
                .setUrlVideo("http://www.youtube.com/watch?v=U2WW5ZiUeoc")
                .setImage(R.drawable.candy));
        sounds.add(new Sound(
                "Garfield y sus Amigos", R.raw.garfield)
                .setUrlVideo("http://www.youtube.com/watch?v=eX04Pwp_tlk")
                .setImage(R.drawable.garfield));
        sounds.add(new Sound(
                "Los Osos Gummi", R.raw.los_osos_gummi)
                .setUrlVideo("http://www.youtube.com/watch?v=6z2_JiFJZRY")
                .setImage(R.drawable.ososgummi));
        sounds.add(new Sound(
                "Marcelino pan y vino", R.raw.marcelino_pan_y_vino)
                .setUrlVideo("http://www.youtube.com/watch?v=tiqyGMjiWSw")
                .setImage(R.drawable.marcelino));
        sounds.add(new Sound(
                "Mofli, el último koala", R.raw.mofli_el_ultimo_koala)
                .setUrlVideo("http://www.youtube.com/watch?v=fWzeW3SeD2o")
                .setImage(R.drawable.mofli));
        sounds.add(new Sound(
                "Vickie el vikingo", R.raw.vickie_el_vikingo)
                .setUrlVideo("http://dl.dropbox.com/u/31111602/dibus/videos/Vickie%20el%20vikingo.3gp")
                .setImage(R.drawable.vickie));
        sounds.add(new Sound("Animaniacs", R.raw.animaniacs)
                .setUrlVideo("http://www.youtube.com/watch?v=9Qcq8cMaEBs")
                .setImage(R.drawable.animaniacs));
        sounds.add(new Sound(
                "Ben 10 Alien Force", R.raw.ben_10_alien_force)
                .setUrlVideo("http://www.youtube.com/watch?v=QyizoLNRYaY")
                .setImage(R.drawable.ben10af));
        sounds.add(new Sound(
                "Ben 10 Ultimate Alien", R.raw.ben_10_ultimate_alien)
                .setUrlVideo("http://www.youtube.com/watch?v=J8MgKCQ1cy8")
                .setImage(R.drawable.ben10ultimatealien));
        sounds.add(new Sound(
                "Ben 10", R.raw.ben_10)
                .setUrlVideo("http://www.youtube.com/watch?v=b4FDrioGZg0")
                .setImage(R.drawable.ben10));
        sounds.add(new Sound(
                "Hércules", R.raw.hercules)
                .setUrlVideo("http://www.youtube.com/watch?v=n4t5_vXCTEY")
                .setImage(R.drawable.hercules));
        sounds.add(new Sound(
                "Monster Rancher", R.raw.monster_rancher)
                .setUrlVideo("http://www.youtube.com/watch?v=M16hPgL2pO4")
                .setImage(R.drawable.monsterrancher));
        sounds.add(new Sound(
                "Timon y Pumba", R.raw.timon_pumba)
                .setUrlVideo("http://www.youtube.com/watch?v=BoFE0JpZroM")
                .setImage(R.drawable.timonypumba));
        sounds.add(new Sound(
                "Titeuf", R.raw.titeuf)
                .setUrlVideo("http://www.youtube.com/watch?v=vQztL2RafuA")
                .setImage(R.drawable.titeuf));
        //1.10
        sounds.add(new Sound(
                "BeyBlade", R.raw.beyblade)
                .setUrlVideo("http://www.youtube.com/watch?v=47JlsqmenKo")
                .setImage(R.drawable.beyblade));
        sounds.add(new Sound(
                "Bleach", R.raw.bleach)
                .setUrlVideo("http://dl.dropbox.com/u/31111602/dibus/videos/Bleach.3gp")
                .setImage(R.drawable.bleach));
        sounds.add(new Sound(
                "Don Gato", R.raw.don_gato)
                .setUrlVideo("http://www.youtube.com/watch?v=pFbkpGVne5k")
                .setImage(R.drawable.don_gato));
        sounds.add(new Sound(
                "Ed, Edd y Eddy", R.raw.ed_edd_eddy)
                .setUrlVideo("http://www.youtube.com/watch?v=BjZg1mMtz3g")
                .setImage(R.drawable.ededdyeddy));
        sounds.add(new Sound(
                "El laboratorio de Dexter", R.raw.el_laboratorio_de_dexter)
                .setUrlVideo("http://www.youtube.com/watch?v=_RQGcMvRlh8")
                .setImage(R.drawable.dexter));
        sounds.add(new Sound(
                "Evangelion", R.raw.evangelion)
                .setUrlVideo("http://www.youtube.com/watch?v=3nQNSLB3Lpk")
                .setImage(R.drawable.evangelion));
        sounds.add(new Sound(
                "Felix el gato", R.raw.felix_el_gato)
                .setUrlVideo("http://www.youtube.com/watch?v=uqcM-AQzyAE")
                .setImage(R.drawable.felixelgato));
        sounds.add(new Sound(
                "Los Pitufos", R.raw.los_pitufos)
                .setUrlVideo("http://www.youtube.com/watch?v=dWDqgIlhWic")
                .setImage(R.drawable.pitufos));
        sounds.add(new Sound(
                "Mortadelo y Filemón", R.raw.mortadelo_y_filemon)
                .setUrlVideo("http://www.youtube.com/watch?v=l-vEN3VmfVo")
                .setImage(R.drawable.mortadelo_y_filemon));
        sounds.add(new Sound(
                "Rugrats", R.raw.rugrats)
                .setUrlVideo("http://www.youtube.com/watch?v=R1NVdxGOW-Q")
                .setImage(R.drawable.rugrats));
        sounds.add(new Sound(
                "Sonic el Erizo", R.raw.sonic_el_erizo)
                .setUrlVideo("http://www.youtube.com/watch?v=9I9EbvXDgMM")
                .setImage(R.drawable.sonic_erizo));
        sounds.add(new Sound(
                "Sonic X", R.raw.sonic_x)
                .setUrlVideo("http://www.youtube.com/watch?v=Lc_bUPrtOr0")
                .setImage(R.drawable.sonicx));
        sounds.add(new Sound(
                "Sonic the Hedgehog", R.raw.sonic_the_hedgehog)
                .setUrlVideo("http://www.youtube.com/watch?v=HZ2RdImvSwg")
                .setImage(R.drawable.sonic));
        sounds.add(new Sound(
                "Teen Titans", R.raw.teen_titans)
                .setUrlVideo("http://www.youtube.com/watch?v=QWaWvQuIVMI")
                .setImage(R.drawable.teen_titans));
        sounds.add(new Sound("La familia Addams", R.raw.la_familia_addams)
                .setUrlVideo("http://www.youtube.com/watch?v=IokBKvFiCvM")
                .setImage(R.drawable.addams));
        sounds.add(new Sound("Transformers", R.raw.transformers)
                .setUrlVideo("http://www.youtube.com/watch?v=nLS2N9mHWaw")
                .setImage(R.drawable.transformers));

        //1.11
        sounds.add(new Sound("Yat", R.raw.yat)
                .setUrlVideo("http://www.youtube.com/watch?v=4u-9XGMfoFo")
                .setImage(R.drawable.yatanshinuchuuryokou));
        sounds.add(new Sound("Los Simpson", R.raw.the_simpsons)
                .setUrlVideo("http://www.youtube.com/watch?v=rb82TUYoa88")
                .setImage(R.drawable.simpson));
        sounds.add(new Sound("One Piece", R.raw.one_piece)
                .setUrlVideo("http://www.youtube.com/watch?v=Rneym8RSoKI")
                .setImage(R.drawable.one_piece));
        sounds.add(new Sound("Futurama", R.raw.futurama)
                .setUrlVideo("http://www.youtube.com/watch?v=n8xw9VLiYlU")
                .setImage(R.drawable.futurama));
        sounds.add(new Sound("Padre de familia", R.raw.family_guy)
                .setUrlVideo("http://www.youtube.com/watch?v=koGoQjXuovY")
                .setImage(R.drawable.family_guy));

        // 1.12
        sounds.add(new Sound("Pocoyo", R.raw.pocoyo)
                .setUrlVideo("https://www.youtube.com/watch?v=bkL1RnYrso4")
                .setImage(R.drawable.pocoyo)
                .setNuevo());
        sounds.add(new Sound("Dora la exploradora", R.raw.dora_la_exploradora)
                .setImage(R.drawable.dora)
                .setNuevo());
        sounds.add(new Sound("Peppa Pig", R.raw.peppa_pig)
                .setImage(R.drawable.peppa)
                .setNuevo());

        Collections.sort(sounds, new Comparator<Sound>() {
            public int compare(Sound s1, Sound s2) {
                return s1.getNombre().compareTo(s2.getNombre());
            }
        });
    }

}
