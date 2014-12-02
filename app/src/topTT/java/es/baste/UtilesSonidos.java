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

        sonidos.add(new Sonido("A mi me la suda", R.raw.a_mi_me_la_suda));
        sonidos.add(new Sonido("A mi no me vas a hacer ninguna pregunta", R.raw.a_mi_no_me_vas_a_hacer_ninguna_pregunta));
        sonidos.add(new Sonido("A tomar por culo, uno menos", R.raw.a_tomar_por_culo_uno_menos));
        sonidos.add(new Sonido("A tu casa", R.raw.a_tu_casa));
        sonidos.add(new Sonido("Adios", R.raw.adios));
        sonidos.add(new Sonido("Ah, sutil", R.raw.ah_sutil));
        sonidos.add(new Sonido("Ahora si", R.raw.ahora_si));
        sonidos.add(new Sonido("Ansioso", R.raw.ansioso));
        sonidos.add(new Sonido("Ay que miedo", R.raw.ay_que_miedo));
        sonidos.add(new Sonido("Ay, nos han Pillao", R.raw.ay_nos_han_pillao));
        sonidos.add(new Sonido("Bendiciones y buenas noches", R.raw.bendiciones_y_buenas_noches));
        sonidos.add(new Sonido("Bingo", R.raw.bingo));
        sonidos.add(new Sonido("Bombero con su manguera", R.raw.bombero_con_su_manguera));
        sonidos.add(new Sonido("Buen rollo", R.raw.buen_rollo));
        sonidos.add(new Sonido("Bueno, no pasa nada", R.raw.bueno_no_pasa_nada));
        sonidos.add(new Sonido("Bueno, un Whisky y a dormir", R.raw.bueno_un_whisky_y_a_dormir));
        sonidos.add(new Sonido("Bye Bye", R.raw.bye_bye));
        sonidos.add(new Sonido("Cabra Chillona", R.raw.cabra_chillona));
        sonidos.add(new Sonido("Cabra", R.raw.cabra));
        sonidos.add(new Sonido("Caramba, no me digas", R.raw.caramba_no_me_digas));
        sonidos.add(new Sonido("Cerveza, cerveza", R.raw.cerveza_cerveza));
        sonidos.add(new Sonido("Chico, que vas a hacer", R.raw.chico_que_vas_a_hacer));
        sonidos.add(new Sonido("Cobarde", R.raw.cobarde));
        sonidos.add(new Sonido("Como te de una miasca y la pechusques, la roscas", R.raw.como_te_de_una_miasca_y_la_pechusques_la_roscas));
        sonidos.add(new Sonido("Con el aire", R.raw.con_el_aire));
        sonidos.add(new Sonido("Correcto", R.raw.correcto));
        sonidos.add(new Sonido("Cállate Niña", R.raw.callate_nina));
        sonidos.add(new Sonido("Cállate", R.raw.callate));
        sonidos.add(new Sonido("De que te Ries tu", R.raw.de_que_te_ries_tu));
        sonidos.add(new Sonido("Dime hijo", R.raw.dime_hijo));
        sonidos.add(new Sonido("Donde está", R.raw.donde_esta));
        sonidos.add(new Sonido("El Conejo de la Loles", R.raw.el_conejo_de_la_loles));
        sonidos.add(new Sonido("EL MICROOOOOOO", R.raw.el_microoooooo));
        sonidos.add(new Sonido("Encantadas y cachondas", R.raw.encantadas_y_cachondas));
        sonidos.add(new Sonido("Es un escándalo", R.raw.es_un_escandalo));
        sonidos.add(new Sonido("Esto es mu verde", R.raw.esto_es_mu_verde));
        sonidos.add(new Sonido("Esto es un infierno Dios mío", R.raw.esto_es_un_infierno_dios_mio));
        sonidos.add(new Sonido("Esto se pone interesante", R.raw.esto_se_pone_interesante));
        sonidos.add(new Sonido("Estos catalanes son la leche", R.raw.estos_catalanes_son_la_leche));
        sonidos.add(new Sonido("Está muy rico", R.raw.esta_muy_rico));
        sonidos.add(new Sonido("Está muy salida", R.raw.esta_muy_salida));
        sonidos.add(new Sonido("Grito Wyoming", R.raw.grito_wyoming));
        sonidos.add(new Sonido("Guaguagua", R.raw.guaguagua));
        sonidos.add(new Sonido("Happy to be nene", R.raw.happy_to_be_nene));
        sonidos.add(new Sonido("Hasta luego lucas", R.raw.hasta_luego_lucas));
        sonidos.add(new Sonido("Hiuston, tenemos un problema", R.raw.hiuston_tenemos_un_problema));
        sonidos.add(new Sonido("Hola everyone", R.raw.hola_everyone));
        sonidos.add(new Sonido("Hola, que tal", R.raw.hola_que_tal));
        sonidos.add(new Sonido("Huele a caca", R.raw.huele_a_caca));
        sonidos.add(new Sonido("Iaiaiaia", R.raw.iaiaiaia));
        sonidos.add(new Sonido("Jajaja, hasta mañana", R.raw.jajaja_hasta_manana));
        sonidos.add(new Sonido("La abuela fuma, la abuela bebe", R.raw.la_abuela_fuma_la_abuela_bebe));
        sonidos.add(new Sonido("La ironia la has pillao, eh", R.raw.la_ironia_la_has_pillao_eh));
        sonidos.add(new Sonido("La madre que os parió", R.raw.la_madre_que_os_pario));
        sonidos.add(new Sonido("La Vamos a liar", R.raw.la_vamos_a_liar));
        sonidos.add(new Sonido("La Vida sigue igual", R.raw.la_vida_sigue_igual));
        sonidos.add(new Sonido("Las chicas son guarrillas", R.raw.las_chicas_son_guarrillas));
        sonidos.add(new Sonido("Luego, cuando salgamos, si quieres, nos damos un beso en la boca", R.raw.luego_cuando_salgamos_si_quieres_nos_damos_un_beso_en_la_boca));
        sonidos.add(new Sonido("Mala suerte", R.raw.mala_suerte));
        sonidos.add(new Sonido("Marrón", R.raw.marron));
        sonidos.add(new Sonido("Me cago en la leche", R.raw.me_cago_en_la_leche));
        sonidos.add(new Sonido("Me estas rayando ya neng", R.raw.me_estas_rayando_ya_neng));
        sonidos.add(new Sonido("Me ha hecho la casa así, BRUUUMP", R.raw.me_ha_hecho_la_casa_asi_bruuump));
        sonidos.add(new Sonido("Me pone", R.raw.me_pone));
        sonidos.add(new Sonido("Mear y no ehcar gota", R.raw.mear_y_no_ehcar_gota));
        sonidos.add(new Sonido("Mono con Dos Pistolas", R.raw.mono_con_dos_pistolas));
        sonidos.add(new Sonido("Muy Mal", R.raw.muy_mal));
        sonidos.add(new Sonido("Niño, que te pasa", R.raw.nino_que_te_pasa));
        sonidos.add(new Sonido("No he visto un tío como este en mi puta vida", R.raw.no_he_visto_un_tio_como_este_en_mi_puta_vida));
        sonidos.add(new Sonido("No lo sabia", R.raw.no_lo_sabia));
        sonidos.add(new Sonido("No me Digas", R.raw.no_me_digas));
        sonidos.add(new Sonido("No metabolizo el alcohol", R.raw.no_metabolizo_el_alcohol));
        sonidos.add(new Sonido("No sé quien es pero sé que le conozco", R.raw.no_se_quien_es_pero_se_que_le_conozco));
        sonidos.add(new Sonido("No te hagas el chulito, vale", R.raw.no_te_hagas_el_chulito_vale));
        sonidos.add(new Sonido("No, No, NOOOO", R.raw.no_no_noooo));
        sonidos.add(new Sonido("Nombre de Rajoy", R.raw.nombre_de_rajoy));
        sonidos.add(new Sonido("Oh, my god", R.raw.oh_my_god));
        sonidos.add(new Sonido("Ola k Ase", R.raw.ola_k_ase));
        sonidos.add(new Sonido("Otra vez", R.raw.otra_vez));
        sonidos.add(new Sonido("Speak English Very Good, Vamos", R.raw.peak_english_very_good_vamos));
        sonidos.add(new Sonido("Pelame la banana", R.raw.pelame_la_banana));
        sonidos.add(new Sonido("Pero mujer, que haces", R.raw.pero_mujer_que_haces));
        sonidos.add(new Sonido("Pero, que estás diciendo tu", R.raw.pero_que_estas_diciendo_tu));
        sonidos.add(new Sonido("Pesada", R.raw.pesada));
        sonidos.add(new Sonido("Pillín", R.raw.pillin));
        sonidos.add(new Sonido("Poneros a trabajar de una vez, hombre", R.raw.poneros_a_trabajar_de_una_vez_hombre));
        sonidos.add(new Sonido("Por qué no te callas y cierras la boca", R.raw.por_que_no_te_callas_y_cierras_la_boca));
        sonidos.add(new Sonido("Profesional, muy Profesional", R.raw.profesional_muy_profesional));
        sonidos.add(new Sonido("Puñalada trapera, patada en los huevos y rencor", R.raw.punalada_trapera_patada_en_los_huevos_y_rencor));
        sonidos.add(new Sonido("Que arte y que podreío hijo de tu madre", R.raw.que_arte_y_que_podreio_hijo_de_tu_madre));
        sonidos.add(new Sonido("Que asco", R.raw.que_asco));
        sonidos.add(new Sonido("Que guay, como mola", R.raw.que_guay_como_mola));
        sonidos.add(new Sonido("Que haces tu", R.raw.que_haces_tu));
        sonidos.add(new Sonido("Que me dices", R.raw.que_me_dices));
        sonidos.add(new Sonido("Que me estás container", R.raw.que_me_estas_container));
        sonidos.add(new Sonido("Que no pare la fiesta", R.raw.que_no_pare_la_fiesta));
        sonidos.add(new Sonido("Que no te enteras", R.raw.que_no_te_enteras));
        sonidos.add(new Sonido("Que pasa", R.raw.que_pasa));
        sonidos.add(new Sonido("Que se cae", R.raw.que_se_cae));
        sonidos.add(new Sonido("Que se mea", R.raw.que_se_mea));
        sonidos.add(new Sonido("Que te pasa", R.raw.que_te_pasa));
        sonidos.add(new Sonido("Que te pasó, no se cuantos, esto, lo otro", R.raw.que_te_paso_no_se_cuantos_esto_lo_otro));
        sonidos.add(new Sonido("Queremos botellona", R.raw.queremos_botellona));
        sonidos.add(new Sonido("Quien es el eco", R.raw.quien_es_el_eco));
        sonidos.add(new Sonido("Quien sabe", R.raw.quien_sabe));
        sonidos.add(new Sonido("Quítate de ahí", R.raw.quitate_de_ahi));
        sonidos.add(new Sonido("Rebota, rebota y en tu culo explota", R.raw.rebota_rebota_y_en_tu_culo_explota));
        sonidos.add(new Sonido("Relaxing cup of cafe con leche", R.raw.relaxing_cup_of_cafe_con_leche));
        sonidos.add(new Sonido("Respóndeme bien respondio", R.raw.respondeme_bien_respondio));
        sonidos.add(new Sonido("Risa abuela", R.raw.risa_abuela));
        sonidos.add(new Sonido("Risa vergonzosa", R.raw.risa_vergonzosa));
        sonidos.add(new Sonido("Risa", R.raw.risa));
        sonidos.add(new Sonido("Seguro", R.raw.seguro));
        sonidos.add(new Sonido("Sentí asco, sentí rabia, no sé lo que sentí", R.raw.senti_asco_senti_rabia_no_se_lo_que_senti));
        sonidos.add(new Sonido("Señor, te piedad", R.raw.senor_te_piedad));
        sonidos.add(new Sonido("Si bebes no conduzcas", R.raw.si_bebes_no_conduzcas));
        sonidos.add(new Sonido("Si se puede", R.raw.si_se_puede));
        sonidos.add(new Sonido("Si tengo algo, se lo estampo en la cabeza y lo mato", R.raw.si_tengo_algo_se_lo_estampo_en_la_cabeza_y_lo_mato));
        sonidos.add(new Sonido("Tato", R.raw.tato));
        sonidos.add(new Sonido("Te doy dos ostias o que pasa", R.raw.te_doy_dos_ostias_o_que_pasa));
        sonidos.add(new Sonido("Te duele", R.raw.te_duele));
        sonidos.add(new Sonido("Te veo, te veo y me mareo", R.raw.te_veo_te_veo_y_me_mareo));
        sonidos.add(new Sonido("Tiene un Problema", R.raw.tiene_un_problema));
        sonidos.add(new Sonido("Tigre Ellaculator", R.raw.tigre_ellaculator));
        sonidos.add(new Sonido("Todo de cachondeo", R.raw.todo_de_cachondeo));
        sonidos.add(new Sonido("Toma liada", R.raw.toma_liada));
        sonidos.add(new Sonido("Trampa sin Escapatoria", R.raw.trampa_sin_escapatoria));
        sonidos.add(new Sonido("Tu crees, lo dudo", R.raw.tu_crees_lo_dudo));
        sonidos.add(new Sonido("Tu eres muy malo", R.raw.tu_eres_muy_malo));
        sonidos.add(new Sonido("Tu vas a llegar muy lejos", R.raw.tu_vas_a_llegar_muy_lejos));
        sonidos.add(new Sonido("Te has hecho daño, Lucy", R.raw.te_has_hecho_dano_lucy));
        sonidos.add(new Sonido("Un Beso", R.raw.un_beso));
        sonidos.add(new Sonido("Una mala tarde la tiene cualquiera", R.raw.una_mala_tarde_la_tiene_cualquiera));
        sonidos.add(new Sonido("Una mierda", R.raw.una_mierda));
        sonidos.add(new Sonido("Uyyy, madre", R.raw.uyyy_madre));
        sonidos.add(new Sonido("Va como un pepino", R.raw.va_como_un_pepino));
        sonidos.add(new Sonido("Vale, me alegro mucho", R.raw.vale_me_alegro_mucho));
        sonidos.add(new Sonido("Vaya lio, que follón", R.raw.vaya_lio_que_follon));
        sonidos.add(new Sonido("Vergüenza ajena", R.raw.verguenza_ajena));
        sonidos.add(new Sonido("Whatsapp, no", R.raw.whatsapp_no));
        sonidos.add(new Sonido("Y punto y se ha acabao", R.raw.y_punto_y_se_ha_acabao));
        sonidos.add(new Sonido("Y yo también", R.raw.y_yo_tambien));
        sonidos.add(new Sonido("Yo con sujetador, perderé mucho, pero tu con casco tienes que ganar un montón", R.raw.yo_con_sujetador_perdere_mucho_pero_tu_con_casco_tienes_que_ganar_un_monton));
        sonidos.add(new Sonido("Yo no se como no me han dado los ataques pelépticos que me dan", R.raw.yo_no_se_como_no_me_han_dado_los_ataques_pelepticos_que_me_dan));
        sonidos.add(new Sonido("Zas, en toda la boca", R.raw.zas_en_toda_la_boca));
        sonidos.add(new Sonido("Zasca", R.raw.zasca));
        sonidos.add(new Sonido("¿Que pesa más, un kilo de hierro o de paja?", R.raw.que_pesa_mas_un_kilo_de_hierro_o_de_paja));
        sonidos.add(new Sonido("Últimos 10 minutos", R.raw.ultimos_10_minutos));

        //1.1
        sonidos.add(new Sonido("Al final se casan", R.raw.al_final_se_casan));
        sonidos.add(new Sonido("Callaros, coño", R.raw.callaros_cono));
        sonidos.add(new Sonido("IMPOSIBLE", R.raw.imposible));
        sonidos.add(new Sonido("La película más mala", R.raw.la_pelicula_mas_mala));
        sonidos.add(new Sonido("Mi Aplauso", R.raw.mi_aplauso));
        sonidos.add(new Sonido("No se muera", R.raw.no_se_muera));
        sonidos.add(new Sonido("Pa chulo yo", R.raw.pa_chulo_yo));
        sonidos.add(new Sonido("Que Bien, que Guay", R.raw.que_bien_que_guay));
        sonidos.add(new Sonido("Que lico", R.raw.que_lico));
        sonidos.add(new Sonido("Que m'atraganto", R.raw.que_me_atraganto));
        sonidos.add(new Sonido("Unas cañas en Nazaret", R.raw.unas_canas_en_nazaret));
        sonidos.add(new Sonido("Vicio sexual", R.raw.vicio_sexual));
        sonidos.add(new Sonido("What's your name, please", R.raw.whats_your_name_please));
        sonidos.add(new Sonido("Ñaca Ñaca", R.raw.naca_naca));

        //1.2
        sonidos.add(new Sonido("Adios, que me voy para la otra vida", R.raw.adios_que_me_voy_para_la_otra_vida));
        sonidos.add(new Sonido("Adios-Bush", R.raw.adios_bush));
        sonidos.add(new Sonido("Animales y personas necesitamos sexo todas las horas", R.raw.animales_y_personas_necesitamos_sexo_todas_las_horas));
        sonidos.add(new Sonido("Arriba, venga", R.raw.arriba_venga));
        sonidos.add(new Sonido("Cansino", R.raw.cansino));
        sonidos.add(new Sonido("Como Tarzán por la selva", R.raw.como_tarzan_por_la_selva));
        sonidos.add(new Sonido("Coño, toma castaña", R.raw.cono_toma_castana));
        sonidos.add(new Sonido("El coche fantástico y un vater", R.raw.el_coche_fantastico_y_un_vater));
        sonidos.add(new Sonido("Es que es ricídulo, Joder", R.raw.es_que_es_ricidulo_joder));
        sonidos.add(new Sonido("Escribir un libro, plantar un árbol y...", R.raw.escribir_un_libro_plantar_un_arbol_y));
        sonidos.add(new Sonido("Ese és un bocazas", R.raw.ese_es_un_bocazas));
        sonidos.add(new Sonido("Hasta la vista, baby", R.raw.hasta_la_vista_baby));
        sonidos.add(new Sonido("Hay que ser tonto pa hacerlo", R.raw.hay_que_ser_tonto_pa_hacerlo));
        sonidos.add(new Sonido("Hija, disimula un poco, nena, que se te ve el plumón", R.raw.hija_disimula_un_poco_nena_que_se_te_ve_el_plumon));
        sonidos.add(new Sonido("Huevo en el microondas", R.raw.huevo_en_el_microondas));
        sonidos.add(new Sonido("Jódete", R.raw.jodete));
        sonidos.add(new Sonido("La he liado parda", R.raw.la_he_liado_parda));
        sonidos.add(new Sonido("La señora que más grita de España", R.raw.la_senora_que_mas_grita_de_espana));
        sonidos.add(new Sonido("Madre mía, Anna, que nervios tengo", R.raw.madre_mia_anna_que_nervios_tengo));
        sonidos.add(new Sonido("Manipuladores", R.raw.manipuladores));
        sonidos.add(new Sonido("Me cago en tus muelas españolas", R.raw.me_cago_en_tus_muelas_espanolas));
        sonidos.add(new Sonido("No hay más que jaleo, peleas, puñaladas y de tó", R.raw.no_hay_mas_que_jaleo_peleas_punaladas_y_de_to));
        sonidos.add(new Sonido("No puedes fumarte un porro y meterte el clase porqué no te vas a enterar de nada", R.raw.no_puedes_fumarte_un_porro_y_meterte_el_clase_porque_no_te_vas_a_enterar_de_nada));
        sonidos.add(new Sonido("No te rias, que es peor", R.raw.no_te_rias_que_es_peor));
        sonidos.add(new Sonido("Olé", R.raw.ole));
        sonidos.add(new Sonido("Ostia", R.raw.ostia));
        sonidos.add(new Sonido("Pero que listo es mi niño", R.raw.pero_que_listo_es_mi_nino));
        sonidos.add(new Sonido("Político en inglés", R.raw.politico_en_ingles));
        sonidos.add(new Sonido("Por qué, señor, por qué", R.raw.por_que_senor_por_que));
        sonidos.add(new Sonido("Que loco estoy", R.raw.que_loco_estoy));
        sonidos.add(new Sonido("Que mala leche hay en este programa", R.raw.que_mala_leche_hay_en_este_programa));
        sonidos.add(new Sonido("Que mente más sucia tienes", R.raw.que_mente_mas_sucia_tienes));
        sonidos.add(new Sonido("Que pedrà", R.raw.que_pedra));
        sonidos.add(new Sonido("Que poco cochina eres", R.raw.que_poco_cochina_eres));
        sonidos.add(new Sonido("Que risa, tia felisa", R.raw.que_risa_tia_felisa));
        sonidos.add(new Sonido("Quítate de ahí, que está la cámara", R.raw.quitate_de_ahi_que_esta_la_camara));
        sonidos.add(new Sonido("Rico, rico, de lo bueno lo mejor, de los mejor lo superior", R.raw.rico_rico_de_lo_bueno_lo_mejor_de_los_mejor_lo_superior));
        sonidos.add(new Sonido("Si te caes te pego", R.raw.si_te_caes_te_pego));
        sonidos.add(new Sonido("Tiene los huevos así de grandes", R.raw.tiene_los_huevos_asi_de_grandes));
        sonidos.add(new Sonido("Tienes 12 Tíos", R.raw.tienes_12_tios));
        sonidos.add(new Sonido("Toma moreno", R.raw.toma_moreno));
        sonidos.add(new Sonido("UN TERREMOTOOOOO", R.raw.un_terremotooooo));
        sonidos.add(new Sonido("Urgencias", R.raw.urgencias));
        sonidos.add(new Sonido("Vamos, esto ya tiene guasa", R.raw.vamos_esto_ya_tiene_guasa));
        sonidos.add(new Sonido("Vete a casa, porqué estás batiendo todas las marcas de la inutilidad", R.raw.vete_a_casa_porque_estas_batiendo_todas_las_marcas_de_la_inutilidad));
        sonidos.add(new Sonido("Viva el ejército", R.raw.viva_el_ejercito));
        sonidos.add(new Sonido("Volaré", R.raw.volare));
        sonidos.add(new Sonido("Ya me puedo morir tranquilamente", R.raw.ya_me_puedo_morir_tranquilamente));
        sonidos.add(new Sonido("¿Como se llama el presidente este negro...?", R.raw.como_se_llama_el_presidente_este_negro));
        sonidos.add(new Sonido("¿Cuando empieza y termina la guerra civil española?", R.raw.cuando_empieza_y_termina_la_guerra_civil_espanola));
        sonidos.add(new Sonido("¿Cuantos años tiene usted, Paula?", R.raw.cuantos_anos_tiene_usted_paula));
        sonidos.add(new Sonido("¿De donde han sacado estas horchatas?", R.raw.de_donde_han_sacado_estas_horchatas));
        sonidos.add(new Sonido("¿Por qué no te callas?", R.raw.por_que_no_te_callas));
        sonidos.add(new Sonido("Es usted Marisol", R.raw.es_usted_marisol));

        //1.3
        sonidos.add(new Sonido("A la mierda ya", R.raw.a_la_mierda_ya));
        sonidos.add(new Sonido("Ah, ah vale", R.raw.ah_ah_vale));
        sonidos.add(new Sonido("Al ataque", R.raw.al_ataque));
        sonidos.add(new Sonido("Aleluya", R.raw.aleluya));
        sonidos.add(new Sonido("Anda mi madre, pues yo no sabía eso", R.raw.anda_mi_madre_pues_yo_no_sabia_eso));
        sonidos.add(new Sonido("Anda", R.raw.anda));
        sonidos.add(new Sonido("Antonio, que no te enteras de nada", R.raw.antonio_que_no_te_enteras_de_nada));
        sonidos.add(new Sonido("Atención al pajarito", R.raw.atencion_al_pajarito));
        sonidos.add(new Sonido("Ay que pena, pobrecito", R.raw.ay_que_pena_pobrecito));
        sonidos.add(new Sonido("Ay, que me parto", R.raw.ay_que_me_parto));
        sonidos.add(new Sonido("Bravo bravo bravo", R.raw.bravo_bravo_bravo));
        sonidos.add(new Sonido("Bueno, adios cariño, te quiero, un beso fuerte, adios, ya está", R.raw.bueno_adios_carino_te_quiero_un_beso_fuerte_adios_ya_esta));
        sonidos.add(new Sonido("Casi", R.raw.casi));
        sonidos.add(new Sonido("Claro", R.raw.claro));
        sonidos.add(new Sonido("Con Franco esto no pasaba", R.raw.con_franco_esto_no_pasaba));
        sonidos.add(new Sonido("Cuanto talento desperdiciado hay por ahí", R.raw.cuanto_talento_desperdiciado_hay_por_ahi));
        sonidos.add(new Sonido("Dale, dale, dale", R.raw.dale_dale_dale));
        sonidos.add(new Sonido("Déjame hablar", R.raw.dejame_hablar));
        sonidos.add(new Sonido("El amor es lo más bonito del mundo", R.raw.el_amor_es_lo_mas_bonito_del_mundo));
        sonidos.add(new Sonido("El que haya dao permiso pa hacer esto, que de la cara", R.raw.el_que_haya_dao_permiso_pa_hacer_esto_que_de_la_cara));
        sonidos.add(new Sonido("En to la boca", R.raw.en_to_la_boca));
        sonidos.add(new Sonido("Es algo muy fuerte", R.raw.es_algo_muy_fuerte));
        sonidos.add(new Sonido("Es que hace un mes que no zumbo", R.raw.es_que_hace_un_mes_que_no_zumbo));
        sonidos.add(new Sonido("Eso está mu feo", R.raw.eso_esta_mu_feo));
        sonidos.add(new Sonido("Estado civil", R.raw.estado_civil));
        sonidos.add(new Sonido("Este tio es un campeón", R.raw.este_tio_es_un_campeon));
        sonidos.add(new Sonido("Estuve esperando hasta que se me incharon los huevos, vine y lo hice", R.raw.estuve_esperando_hasta_que_se_me_incharon_los_huevos_vine_y_lo_hice));
        sonidos.add(new Sonido("Fantasma", R.raw.fantasma));
        sonidos.add(new Sonido("Felicidades de corazón", R.raw.felicidades_de_corazon));
        sonidos.add(new Sonido("Frenar, párate, stop", R.raw.frenar_parate_stop));
        sonidos.add(new Sonido("Fuera de aquí", R.raw.fuera_de_aqui));
        sonidos.add(new Sonido("Gangnam Style", R.raw.gangnam_style));
        sonidos.add(new Sonido("Hasta mañana, hasta luego", R.raw.hasta_manana_hasta_luego));
        sonidos.add(new Sonido("Hazte un favor, guarad esas pastillas", R.raw.hazte_un_favor_guarad_esas_pastillas));
        sonidos.add(new Sonido("Hemos pasado un miedo que no te puedes imaginar", R.raw.hemos_pasado_un_miedo_que_no_te_puedes_imaginar));
        sonidos.add(new Sonido("Hombre llorando", R.raw.hombre_llorando));
        sonidos.add(new Sonido("Joder, que friki eres", R.raw.joder_que_friki_eres));
        sonidos.add(new Sonido("La coherencia escasea tanto en la política española como los libros en Gandía Shore", R.raw.la_coherencia_escasea_tanto_en_la_politica_espanola_como_los_libros_en_gandia_shore));
        sonidos.add(new Sonido("La Nancy O", R.raw.la_nancy_o));
        sonidos.add(new Sonido("La película esa ya la he visto, y al final siempre pone fin", R.raw.la_pelicula_esa_ya_la_he_visto_y_al_final_siempre_pone_fin));
        sonidos.add(new Sonido("La pregunta mamporrera", R.raw.la_pregunta_mamporrera));
        sonidos.add(new Sonido("Los jóvenes no leen porqué están con el internet", R.raw.los_jovenes_no_leen_porque_estan_con_el_internet));
        sonidos.add(new Sonido("Machista", R.raw.machista));
        sonidos.add(new Sonido("Marranote", R.raw.marranote));
        sonidos.add(new Sonido("Me cachis en Bruce Lee", R.raw.me_cachis_en_bruce_lee));
        sonidos.add(new Sonido("Me cago en diez, ahora me he cagao", R.raw.me_cago_en_diez_ahora_me_he_cagao));
        sonidos.add(new Sonido("Me canso de la postura del minero", R.raw.me_canso_de_la_postura_del_minero));
        sonidos.add(new Sonido("Me encanta", R.raw.me_encanta));
        sonidos.add(new Sonido("Me he meao de la alegria", R.raw.me_he_meao_de_la_alegria));
        sonidos.add(new Sonido("Me importa tres narices", R.raw.me_importa_tres_narices));
        sonidos.add(new Sonido("Me lo comería todo", R.raw.me_lo_comeria_todo));
        sonidos.add(new Sonido("Mente de mono", R.raw.mente_de_mono));
        sonidos.add(new Sonido("Menudos guionistas", R.raw.menudos_guionistas));
        sonidos.add(new Sonido("Mira la tijera", R.raw.mira_la_tijera));
        sonidos.add(new Sonido("Mucho miedo", R.raw.mucho_miedo));
        sonidos.add(new Sonido("Me han engañao", R.raw.me_han_enganao));
        sonidos.add(new Sonido("Más claro chorizo pamplona", R.raw.mas_claro_chorizo_pamplona));
        sonidos.add(new Sonido("Niño sorprendido", R.raw.nino_sorprendido));
        sonidos.add(new Sonido("No lloré porqué me daba vergüenza", R.raw.no_llore_porque_me_daba_verguenza));
        sonidos.add(new Sonido("No, otra vez no", R.raw.no_otra_vez_no));
        sonidos.add(new Sonido("Oatia, este tio ha estudio", R.raw.oatia_este_tio_ha_estudio));
        sonidos.add(new Sonido("Oh my goooooood", R.raw.oh_my_goooooood));
        sonidos.add(new Sonido("Ole los cojones", R.raw.ole_los_cojones));
        sonidos.add(new Sonido("Ole sus cataplines, así de claro", R.raw.ole_sus_cataplines_asi_de_claro));
        sonidos.add(new Sonido("Ole tu", R.raw.ole_tu));
        sonidos.add(new Sonido("Por el amor de Dios, solo pido ayuda", R.raw.por_el_amor_de_dios_solo_pido_ayuda));
        sonidos.add(new Sonido("Por favor, por favor", R.raw.por_favor_por_favor));
        sonidos.add(new Sonido("Por los coches rápidos y las tetas gordas", R.raw.por_los_coches_rapidos_y_las_tetas_gordas));
        sonidos.add(new Sonido("Pues jódete", R.raw.pues_jodete));
        sonidos.add(new Sonido("Que fuerte, se caga la perra", R.raw.que_fuerte_se_caga_la_perra));
        sonidos.add(new Sonido("Que lo sepa todo el mundo que es mentira", R.raw.que_lo_sepa_todo_el_mundo_que_es_mentira));
        sonidos.add(new Sonido("Que lástima", R.raw.que_lastima));
        sonidos.add(new Sonido("Que manera de hablar, que gusto", R.raw.que_manera_de_hablar_que_gusto));
        sonidos.add(new Sonido("Que me caso", R.raw.que_me_caso));
        sonidos.add(new Sonido("Que muerte más mala", R.raw.que_muerte_mas_mala));
        sonidos.add(new Sonido("Que nos cogen", R.raw.que_nos_cogen));
        sonidos.add(new Sonido("Quiero que se peleen", R.raw.quiero_que_se_peleen));
        sonidos.add(new Sonido("Risa burlona", R.raw.risa_burlona));
        sonidos.add(new Sonido("Sigue siendo aquel", R.raw.sigue_siendo_aquel));
        sonidos.add(new Sonido("Soy cinturón negro karateka", R.raw.soy_cinturon_negro_karateka));
        sonidos.add(new Sonido("Teatro y del bueno", R.raw.teatro_y_del_bueno));
        sonidos.add(new Sonido("Tiene mucho cuento chino, de verdad", R.raw.tiene_mucho_cuento_chino_de_verdad));
        sonidos.add(new Sonido("Tienen que llevarlo al psiquiatra", R.raw.tienen_que_llevarlo_al_psiquiatra));
        sonidos.add(new Sonido("Tierra trágame", R.raw.tierra_tragame));
        sonidos.add(new Sonido("Todo el mundo pierde la memoria para las cosas que no le interesan", R.raw.todo_el_mundo_pierde_la_memoria_para_las_cosas_que_no_le_interesan));
        sonidos.add(new Sonido("Toma escopeta, CORRE", R.raw.toma_escopeta_corre));
        sonidos.add(new Sonido("TOMAAA", R.raw.tomaaa));
        sonidos.add(new Sonido("Una fiesta de la leche, vamos", R.raw.una_fiesta_de_la_leche_vamos));
        sonidos.add(new Sonido("Vale", R.raw.vale));
        sonidos.add(new Sonido("Vaya mal rollito", R.raw.vaya_mal_rollito));
        sonidos.add(new Sonido("Vaya un personaje", R.raw.vaya_un_personaje));
        sonidos.add(new Sonido("Venga bonita, venga", R.raw.venga_bonita_venga));
        sonidos.add(new Sonido("Venga, gracias bonita", R.raw.venga_gracias_bonita));
        sonidos.add(new Sonido("Viva el semen español", R.raw.viva_el_semen_espanol));
        sonidos.add(new Sonido("Y a ver como compite usted con los chinos", R.raw.y_a_ver_como_compite_usted_con_los_chinos));
        sonidos.add(new Sonido("Yo es que soy abstemia", R.raw.yo_es_que_soy_abstemia));
        sonidos.add(new Sonido("Yo estoy preparado para ser un superhombre de esos", R.raw.yo_estoy_preparado_para_ser_un_superhombre_de_esos));
        sonidos.add(new Sonido("Yo lo noto un poco raro, no me lo creo del todo", R.raw.yo_lo_noto_un_poco_raro_no_me_lo_creo_del_todo));
        sonidos.add(new Sonido("Yo no soy chulo, soy claro", R.raw.yo_no_soy_chulo_soy_claro));
        sonidos.add(new Sonido("¿Con qué nervio del cuerpo humano es con el que mejor te lo pasas?", R.raw.con_que_nervio_del_cuerpo_humano_es_con_el_que_mejor_te_lo_pasas));
        sonidos.add(new Sonido("¿Cuanto es 1x1?", R.raw.cuanto_es_1x1));
        sonidos.add(new Sonido("¿Donde está la pelotita?", R.raw.donde_esta_la_pelotita));
        sonidos.add(new Sonido("¿Han visto que contencto está?", R.raw.han_visto_que_contencto_esta));
        sonidos.add(new Sonido("¿Pero este cabrón quien es?", R.raw.pero_este_cabron_quien_es));
        sonidos.add(new Sonido("¿Por qué no nos ejecutáis y acabamos con esto?", R.raw.por_que_no_nos_ejecutais_y_acabamos_con_esto));
        sonidos.add(new Sonido("¿Por qué toses tanto?", R.raw.por_que_toses_tanto));
        sonidos.add(new Sonido("¿Que tal, mi amor?", R.raw.que_tal_mi_amor));
        sonidos.add(new Sonido("¿Que te pasa, muchacho?", R.raw.que_te_pasa_muchacho));
        sonidos.add(new Sonido("¿Queréis intentarlo otra vez?", R.raw.quereis_intentarlo_otra_vez));
        sonidos.add(new Sonido("¿Te crees muy listo?", R.raw.te_crees_muy_listo));
        sonidos.add(new Sonido("¿Y este tío que hace aquí?", R.raw.y_este_tio_que_hace_aqui));

        //1.4
        sonidos.add(new Sonido("A cantar, a cantar y a beber", R.raw.a_cantar_a_cantar_y_a_beber));
        sonidos.add(new Sonido("Agárrense los machos", R.raw.agarrense_los_machos));
        sonidos.add(new Sonido("Asín de claro", R.raw.asin_de_claro));
        sonidos.add(new Sonido("Como yo", R.raw.como_yo));
        sonidos.add(new Sonido("Con la crisi, esto es demasiao, lo primero esta en comer", R.raw.con_la_crisi_esto_es_demasiao_lo_primero_esta_en_comer));
        sonidos.add(new Sonido("Dios mío, Dios está y Dios es grande", R.raw.dios_mio_dios_esta_y_dios_es_grande));
        sonidos.add(new Sonido("Dios mío, que horror", R.raw.dios_mio_qie_horror));
        sonidos.add(new Sonido("Droga mala", R.raw.droga_mala));
        sonidos.add(new Sonido("Efectivamente, subidón total", R.raw.efectivamente_subidon_total));
        sonidos.add(new Sonido("El mundo lo mueven dos cosas, el dinero y el sexo", R.raw.el_mundo_lo_mueven_dos_cosas_el_dinero_y_el_sexo));
        sonidos.add(new Sonido("Ella se queda con hambre", R.raw.ella_se_queda_con_hambre));
        sonidos.add(new Sonido("Equilicua", R.raw.equilicua));
        sonidos.add(new Sonido("Eso es cierto cierto", R.raw.eso_es_cierto_cierto));
        sonidos.add(new Sonido("España va bien", R.raw.espana_va_bien));
        sonidos.add(new Sonido("GUAPO", R.raw.guapo));
        sonidos.add(new Sonido("Hay, que me hago pipi", R.raw.hay_que_me_hago_pipi));
        sonidos.add(new Sonido("Lávate la boca con jabón ya, hombre", R.raw.lavate_la_boca_con_jabon_ya_hombre));
        sonidos.add(new Sonido("Me da mucha rabia", R.raw.me_da_mucha_rabia));
        sonidos.add(new Sonido("Me gusta tu pelo y tu acento", R.raw.me_gusta_tu_pelo_y_tu_acento));
        sonidos.add(new Sonido("Me la pela", R.raw.me_la_pela));
        sonidos.add(new Sonido("Mu bien, si que es verdad, un aplauso pa usted", R.raw.mu_bien_si_que_es_verdad_un_aplauso_pa_usted));
        sonidos.add(new Sonido("Muy bonito, si señor", R.raw.muy_bonito_si_senor));
        sonidos.add(new Sonido("No es que nos tomen por idiota, yo empiezo a pensar que soy idiota", R.raw.no_es_que_nos_tomen_por_idiota_yo_empiezo_a_pensar_que_soy_idiota));
        sonidos.add(new Sonido("No estoy preparado, señor", R.raw.no_estoy_preparado_senor));
        sonidos.add(new Sonido("No hay derecho, ¿quién manda aqui?. El rico podrido", R.raw.no_hay_derecho_quien_manda_aqui_el_rico_podrido));
        sonidos.add(new Sonido("No puede ser", R.raw.no_puede_ser));
        sonidos.add(new Sonido("No tendría que haberte visto, hoy voy a tener pesadillas", R.raw.no_tendria_que_haberte_visto_hoy_voy_a_tener_pesadillas));
        sonidos.add(new Sonido("Nunca se le ha subido los humos a la cabeza, como decimos vulgarmente", R.raw.nunca_se_le_ha_subido_los_humos_a_la_cabeza_como_decimos_vulgarmente));
        sonidos.add(new Sonido("Ole, que bonito eres", R.raw.ole_que_bonito_eres));
        sonidos.add(new Sonido("Que fuerte, que fuerte", R.raw.que_fuerte_que_fuerte));
        sonidos.add(new Sonido("Quita esto", R.raw.quita_esto));
        sonidos.add(new Sonido("Si, bueno, es posible", R.raw.si_bueno_es_posible));
        sonidos.add(new Sonido("Son ladrones, criminales, canallas", R.raw.son_ladrones_criminales_canallas));
        sonidos.add(new Sonido("SUBIDÓN", R.raw.subidon));
        sonidos.add(new Sonido("Toma tomate", R.raw.toma_tomate));
        sonidos.add(new Sonido("Venga, déjalo y vamos a empezar otra vez", R.raw.venga_dejalo_y_vamos_a_empezar_otra_vez));
        sonidos.add(new Sonido("¿Que has dicho?", R.raw.que_has_dicho));
        sonidos.add(new Sonido("¿Qué haces?", R.raw.que_haces));
        sonidos.add(new Sonido("¿Y esto que es?", R.raw.y_esto_que_es));

        //1.5
        sonidos.add(new Sonido("A lo que va es a ponerse cachondo", R.raw.a_lo_que_va_es_a_ponerse_cachondo, true));
        sonidos.add(new Sonido("Adios 2", R.raw.adios_2, true));
        sonidos.add(new Sonido("Cateto a babor", R.raw.cateto_a_babor, true));
        sonidos.add(new Sonido("Cuenta por esa boca", R.raw.cuenta_por_esa_boca, true));
        sonidos.add(new Sonido("Cuidao conmigo que soy karateka", R.raw.cuidao_conmigo_que_soy_karateka, true));
        sonidos.add(new Sonido("Esas cabezas no están bien", R.raw.esas_cabezas_no_estan_bien, true));
        sonidos.add(new Sonido("Joer, ¿que ha pasao aquí?", R.raw.joer_que_ha_pasao_aqui, true));
        sonidos.add(new Sonido("Lo teneis crudo", R.raw.lo_teneis_crudo, true));
        sonidos.add(new Sonido("Loco, párate", R.raw.loco_parate, true));
        sonidos.add(new Sonido("Mátenme", R.raw.matenme, true));
        sonidos.add(new Sonido("Niquelao...Chapó", R.raw.niquelao_chapo, true));
        sonidos.add(new Sonido("No siento las piernas", R.raw.no_siento_las_piernas, true));
        sonidos.add(new Sonido("No tengo vergüenza", R.raw.no_tengo_verguenza, true));
        sonidos.add(new Sonido("Que alegria, que bien", R.raw.que_alegria_que_bien, true));
        sonidos.add(new Sonido("QUEREMOS VER VIOLENCIA", R.raw.queremos_ver_violencia, true));
        sonidos.add(new Sonido("Raro, raro, raro", R.raw.raro_raro_raro, true));
        sonidos.add(new Sonido("Resignación y paciencia", R.raw.resignacion_y_paciencia, true));
        sonidos.add(new Sonido("Risa de rata", R.raw.risa_de_rata, true));
        sonidos.add(new Sonido("Se podría haber preparao una catástrofe de miedo", R.raw.se_podria_haber_preparao_una_catastrofe_de_miedo, true));
        sonidos.add(new Sonido("Si la han cagao, que lo arreglen", R.raw.si_la_han_cagao_que_lo_arreglen, true));
        sonidos.add(new Sonido("Si no bebieran, se irían a rezar el rosario, comprenderías que no les pasa nada", R.raw.si_no_bebieran_se_irian_a_rezar_el_rosario_comprenderias_que_no_les_pasa_nada, true));
        sonidos.add(new Sonido("Top Tripi", R.raw.top_tripi, true));
        sonidos.add(new Sonido("Va de listo", R.raw.va_de_listo, true));
        sonidos.add(new Sonido("What a fuck.", R.raw.what_a_fuck, true));
        sonidos.add(new Sonido("Y eso duele", R.raw.y_eso_duele, true));
        sonidos.add(new Sonido("¿Como t'has quedao?", R.raw.como_te_has_quedao, true));
        sonidos.add(new Sonido("¿Eso quien se lo cree?. Yo no", R.raw.eso_quien_se_lo_cree_yo_no, true));
        sonidos.add(new Sonido("¿Todo bien?. ¿Todo correcto?, Y yo que me alegro, hombre", R.raw.todo_bien_todo_correcto_y_yo_que_me_alegro_hombre, true));



        Collections.sort(sonidos, new Comparator<Sonido>() {
            public int compare(Sonido s1, Sonido s2) {
                return s1.getNombre().compareTo(s2.getNombre());
            }
        });
    }
}