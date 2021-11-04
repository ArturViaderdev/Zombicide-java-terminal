/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombicide;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arturv
 */
public class Zombicide {

    private static ArrayList<Superviviente> supervivientes;
    private static ArrayList<Zombie> zombis;
    private static final int numataques = 3;
    static final int numzombiesarray = 8;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        // TODO code application logic here
        int nivel = 1, estado = 1, cont, opcion = 0, vidas, nivelp, skill, arma = 0, tiro = 0;
        String nombre;
        try {

            supervivientes = new ArrayList<>();
            zombis = new ArrayList<>();

            System.out.println("¿Quieres establecer los valores por defecto de supervivientes o asignarlos tu?");
            System.out.println("1-Por defecto.");
            System.out.println("2-Asignarlos.");
            do {
                opcion = entrada.nextInt();
            } while (opcion != 1 && opcion != 2);

            if (opcion == 1) {
                //Valores por defecto de supervivientes
                supervivientes.add(new Superviviente(3, 1, "Artur", SkillsPersonaje.ESCURRIDIZO));
                System.out.println("Añadido superviviente. Vidas:3 Nivel:1 Nombre:Artur Skills:Escurridizo");
                supervivientes.add(new Superviviente(2, 2, "Isain", SkillsPersonaje.BUSCADOR));
                System.out.println("Añadido superviviente. Vidas:2 Nivel:2 Nombre:Isain Skills:Buscador");
                supervivientes.add(new Superviviente(1, 2, "Alvaro", SkillsPersonaje.RAPIDO));
                System.out.println("Añadido superviviente. Vidas:1 Nivel:2 Nombre:Alavaro Skills:Rapido");
                supervivientes.add(new Superviviente(4, 2, "Dani", SkillsPersonaje.FORTACHON));
                System.out.println("Añadido superviviente. Vidas:4 Nivel:2 Nombre:Dani Skills:Fortachon");
                supervivientes.add(new Superviviente(4, 3, "Pedro", SkillsPersonaje.AMBIDIESTRO));
                System.out.println("Añadido superviviente. Vidas:4 Nivel:3 Nombre:Pedro, Skills:Ambidiestro");
                supervivientes.get(0).setarma(new Arma(1, 0, TipoArma.SARTEN));
                System.out.println("Superviviente 1. Añadida arma sartén daño 1.");
                supervivientes.get(1).setarma(new Arma(1, 0, TipoArma.SARTEN));
                System.out.println("Superviviente 2. Añadida arma sartén daño 1.");
                supervivientes.get(2).setarma(new Arma(3, 1, TipoArma.PISTOLA));
                System.out.println("Superviviente 3. Añadida arma pistola daño 3.");
                supervivientes.get(3).setarma(new Arma(7, 2, TipoArma.ESCOPETA));
                System.out.println("Superviviente 4. Añadida arma escopeta daño 7.");
                supervivientes.get(4).setarma(new Arma(4, 0, TipoArma.KATANA));
                System.out.println("Superviviente 5. Añadida arma katana daño 4.");
            } else {
                //Configurar supervivientes manualmente
                for (cont = 0; cont < 5; cont++) {
                    System.out.println("Superviviente " + (cont + 1));
                    System.out.println("Introduce el nombre del superviviente.");
                    nombre = lector.readLine();
                    System.out.println("Introduce el número de vidas.");
                    vidas = entrada.nextInt();
                    System.out.println("Introduce el nivel del personaje.");
                    nivelp = entrada.nextInt();
                    System.out.println("Introduce el skill del personaje.");
                    System.out.println("1-Escurridizo.");
                    System.out.println("2-Buscador.");
                    System.out.println("3-Rapido");
                    System.out.println("4-Fortachon");
                    System.out.println("5-Ambidiestro");
                    do {
                        skill = entrada.nextInt();
                    } while (!(skill >= 1 && skill <= 5));
                    //Se crea el superviviente en la ArrayList
                    switch (skill) {
                        case 1:
                            supervivientes.add(new Superviviente(vidas, nivelp, nombre, SkillsPersonaje.ESCURRIDIZO));
                            break;
                        case 2:
                            supervivientes.add(new Superviviente(vidas, nivelp, nombre, SkillsPersonaje.BUSCADOR));
                            break;
                        case 3:
                            supervivientes.add(new Superviviente(vidas, nivelp, nombre, SkillsPersonaje.RAPIDO));
                            break;
                        case 4:
                            supervivientes.add(new Superviviente(vidas, nivelp, nombre, SkillsPersonaje.FORTACHON));
                            break;
                        case 5:
                            supervivientes.add(new Superviviente(vidas, nivelp, nombre, SkillsPersonaje.AMBIDIESTRO));
                            break;
                    }

                }
                System.out.println("Selección de armas:");
                System.out.println("Información daño armas");
                System.out.println("Sarten - 1");
                System.out.println("Pistola - 3");
                System.out.println("Escopeta - 7");
                System.out.println("Katana - 4");

                for (cont = 0; cont < 5; cont++) {
                    System.out.println("Selecciona el arma para el superviviente " + cont + ".");
                    System.out.println("1-Sarten.");
                    System.out.println("2-Pistola.");
                    System.out.println("3-Escopeta");
                    System.out.println("4-Katana");
                    do {
                        arma = entrada.nextInt();
                    } while (!(arma >= 1 && arma <= 4));
                    switch (arma) {
                        //Se añade el arma al superviviente
                        case 1:
                            supervivientes.get(cont).setarma(new Arma(1, 0, TipoArma.SARTEN));
                            break;
                        case 2:
                            supervivientes.get(cont).setarma(new Arma(3, 1, TipoArma.PISTOLA));
                            break;
                        case 3:
                            supervivientes.get(cont).setarma(new Arma(7, 2, TipoArma.ESCOPETA));
                            break;
                        case 4:
                            supervivientes.get(cont).setarma(new Arma(4, 0, TipoArma.KATANA));
                            break;
                    }
                }

            }

            System.out.println("¿Deseas tiro de superviviente a zombie manual o automático aleatorio?");
            System.out.println("1-Manual.");
            System.out.println("2-Automático aleatorio.");
            System.out.println("3-Automático inteligente.");

            do {
                tiro = entrada.nextInt();
            } while (!(tiro >= 1 && tiro <= 3));

            while (estado == 1 && nivel < 4) {

                crearzombis(nivel);

                mostrarsupervivientesyarmas();

                mostrarzombis();

                estado = luchar(tiro);
                if (estado == 1) {
                    if (nivel == 3) {
                        System.out.println("Has superado el nivel " + nivel + ". Te has pasado el juego.");
                    } else {
                        System.out.println("Se ha superado el nivel " + nivel + ". Se procede al siguiente nivel.");
                    }
                } else {
                    System.out.println("Has llegado al nivel " + nivel + " y no lo has superado.");
                }
                nivel++;
            }
        } catch (Exception ex) {

        }

    }

    //Crea los zombies según el nivel
    private static void crearzombis(int nivel) {
        int dano, cont, contpon;

        if (nivel == 1) {
            //En el nivel 1 todo son caminantes
            for (cont = 0; cont < numzombiesarray; cont++) {
                dano = inventadano();
                System.out.println("Se crea un nuevo caminante con daño " + dano + ".");
                zombis.add(new Caminante(dano, 1));
            }
        } else if (nivel == 2) {
            //Nivel 2 tiene dos gordos y 6 caminantes.
            //Elijo dos posiciones aleatorias para poner los gordos
            //El gordo puede estar de la posicion 1 a la 6 porque tiene que tener un caminante a cada lado.
            //Debe haber mínimo dos caminantes entre los gordos
            int gordoa = ((int) (Math.random() * 6)) + 1;
            int gordob;
            contpon = 0;
            do {
                gordob = ((int) (Math.random() * 6)) + 1;
                contpon++;
                //El gordo 2 tiene que estar separado en dos posiciones del gordo 1 como mínimo.
            } while ((gordob == gordoa || gordoa + 1 == gordob || gordoa - 1 == gordob || gordoa + 2 == gordob || gordoa - 2 == gordob) && contpon < 100);
            if (contpon == 100) {
                System.out.println("No se han podido situar aleatoriamente los zombies. Distribución fija.");
                gordoa = 1;
                gordob = 4;
            }

            System.out.println("Distribución de los zombies.");
            for (cont = 0; cont < numzombiesarray; cont++) {
                dano = inventadano();
                if (cont == gordoa || cont == gordob) {
                    System.out.println("Se crea un nuevo gordo con daño " + dano + ".");
                    zombis.add(new Gordo(dano, 2));
                } else {
                    System.out.println("Se crea un nuevo caminante con daño " + dano + ".");
                    zombis.add(new Caminante(dano, 1));
                }
            }

        } else if (nivel == 3) {
            //En el nivel 3 hay dos gordos y un unknown
            int gordoa = ((int) (Math.random() * 6)) + 1;
            int gordob, unknown;

            contpon = 0;
            do {
                gordob = ((int) (Math.random() * 6)) + 1;
                contpon++;
            } while ((gordob == gordoa || gordoa + 1 == gordob || gordoa - 1 == gordob || gordoa + 2 == gordob || gordoa - 2 == gordob) && contpon < 100);
            if (contpon == 100) {
                System.out.println("No se han podido situar aleatoriamente los zombies. Distribución fija.");
                gordoa = 1;
                gordob = 4;
            }
            contpon = 0;
            do {
                unknown = (int) (Math.random() * 8);
                contpon++;
            } while ((unknown == gordoa || unknown == gordob || unknown == gordoa + 1 || unknown == gordoa - 1 || unknown == gordob + 1 || unknown == gordob - 1) && contpon < 100);
            if (contpon == 100) {
                System.out.println("No se ha podido situar el unknown, posición definida.");
                gordoa = 1;
                gordob = 4;
                unknown = 6;
            }

            System.out.println("Unknown" + unknown);
            System.out.println("Gordo a " + gordoa);
            System.out.println("Gordo b " + gordob);
            System.out.println("Distribución de los zombies.");
            for (cont = 0; cont < numzombiesarray; cont++) {
                dano = inventadano();
                if (cont == gordoa || cont == gordob) {
                    System.out.println("Se crea un nuevo gordo con daño " + dano + ".");
                    zombis.add(new Gordo(dano, 2));

                } else if (cont == unknown) {
                    System.out.println("Se crea un nuevo unknown con daño " + dano + ".");
                    zombis.add(new Unknown(dano, 3));
                } else {
                    System.out.println("Se crea un nuevo caminante con daño " + dano + ".");
                    zombis.add(new Caminante(dano, 1));
                }
            }
        }

    }

    //Genera un daño aleatorio
    private static int inventadano() {
        int dano = (int) (Math.random() * 2) + 1;
        return dano;
    }

    //Se hace la lucha distinta según el modo de tiro automático, automático inteligente o manual
    private static int luchar(int tiro) {
        //Primero atacan los supervivientes
        int vecesataque, zombieatacado, exito, cont, supervivienteatacado, numataque, contbusca;
        boolean repite = false;

        int contzombie;
        zombieatacado = 0;
        Scanner entrada = new Scanner(System.in);
        try {

            while (zombis.size() > 0) {

                for (cont = 0; cont < supervivientes.size(); cont++) {
                    System.out.println("Turno del superviviente " + (cont + 1));
                    //Cada superviviente ataca 3 veces.

                    //El ambidiestro debe tener el doble.
                    if (supervivientes.get(cont).getskills() == SkillsPersonaje.AMBIDIESTRO) {
                        numataque = numataques * 2;
                    } else {
                        numataque = numataques;
                    }
                    for (vecesataque = 0; vecesataque < numataque; vecesataque++) {
                        System.out.println("Tirada " + (vecesataque + 1) + " de " + numataques);
                        //Aleatorio para decidir a que zombie ataca.
                        if (tiro == 2) {
                            zombieatacado = (int) (Math.random() * zombis.size());
                        } else if (tiro == 1) {
                            System.out.println("Se va a hacer un tiro manual.");
                            System.out.println("El daño del arma es " + supervivientes.get(cont).getarma().getdanyo());
                            System.out.println("Hay los siguientes zombies:");
                            /*     for(contzombie=0;contzombie<zombis.size();contzombie++)
                            {
                                System.out.println("Zombie " + contzombie + " Muere " + zombis.get(contzombie).getMuere());
                                
                            }*/
                            mostrarzombis();
                            System.out.println("Selecciona a que zombie atacar");
                            do {
                                zombieatacado = entrada.nextInt() - 1;
                            } while (!(zombieatacado >= 0 && zombieatacado < zombis.size()));
                        } else if (tiro == 3) {
                            zombieatacado = -1;
                            for (contbusca = 0; contbusca < zombis.size(); contbusca++) {
                                if (zombieatacado == -1) {
                                    if (supervivientes.get(cont).getarma().getdanyo() >= zombis.get(contbusca).getMuere()) {
                                        zombieatacado = contbusca;
                                    }
                                } else {
                                    if (supervivientes.get(cont).getarma().getdanyo() >= zombis.get(contbusca).getMuere() && zombis.get(zombieatacado).getMuere() < zombis.get(contbusca).getMuere()) {
                                        zombieatacado = contbusca;
                                    }
                                }
                            }
                        }

                        System.out.println("Se va a atacar al zombie " + (zombieatacado + 1));
                        exito = (int) (Math.random() * 2);
                        if (exito > 0) {
                            System.out.println("Ha apuntado bien, ataca al zombie.");
                            System.out.println("El daño del arma es " + supervivientes.get(cont).getarma().getdanyo());
                            System.out.println("El muere del zombie es " + zombis.get(zombieatacado).getMuere());

                            if (supervivientes.get(cont).getarma().getdanyo() >= zombis.get(zombieatacado).getMuere()) {
                                System.out.println("El zombie " + (zombieatacado + 1) + " ha muerto.");
                                zombis.remove(zombieatacado);
                                if (zombis.size() == 0) {
                                    System.out.println("Todos los zombies han muerto.");
                                    return 1;
                                }
                            } else {
                                System.out.println("El tiro no ha tenido suficiente potencia, el zombie sigue vivo.");
                            }

                        } else {
                            System.out.println("Ha fallado el tiro.");

                        }

                    }
                }
                System.out.println("Turno de los zombies.");
                for (cont = 0; cont < zombis.size(); cont++) {
                    repite = false;
                    do {

                        System.out.println("Ataca el zombie " + (cont + 1));
                        System.out.println("Daño del zombie: " + zombis.get(cont).getDanyo());
                        supervivienteatacado = (int) (Math.random() * supervivientes.size());
                        System.out.println("Va a atacar al superviviente " + supervivienteatacado + ".");
                        supervivientes.get(supervivienteatacado).setvidas(supervivientes.get(supervivienteatacado).getvidas() - zombis.get(cont).getDanyo());
                        zombis.get(cont).CalcularGolpeo(supervivientes.get(supervivienteatacado).getskills());
                        if (supervivientes.get(supervivienteatacado).getvidas() <= 0) {
                            System.out.println("El superviviente " + (supervivienteatacado + 1) + " ha muerto.");
                            supervivientes.remove(supervivienteatacado);
                            if (supervivientes.size() == 0) {
                                System.out.println("Todos los supervivientes han muerto.");
                                return 0;
                            }
                        } else {
                            System.out.println("El superviviente " + (supervivienteatacado + 1) + " sigue vivo y posee todavía " + supervivientes.get(supervivienteatacado).getvidas() + " de vida.");
                        }
                        if (repite) {
                            repite = false;
                        } else {
                            if (zombis.get(cont) instanceof Unknown) {
                                System.out.println("El zombi es un Unknown por lo tanto realizará un zarpazo.");
                                if (zombis.get(cont).zarpazo()) {
                                    System.out.println("Zarpazo positivo, se realizará otro ataque.");
                                    repite = true;
                                } else {
                                    System.out.println("Zarpazo negativo.");
                                }
                            }
                        }

                    } while (repite);

                }
                System.out.println("Se han acabado las tiradas.");
            }

        } catch (Exception ex) {

        }
        return 1;
    }

    //Se muestran los supervivientes y armas
    private static void mostrarsupervivientesyarmas() {
        for (int cont = 0; cont < supervivientes.size(); cont++) {
            System.out.println("Superviviente " + (cont + 1) + ";");
            System.out.println("\t Nombre:" + supervivientes.get(cont).getnombre());
            System.out.println("\t Vidas:" + supervivientes.get(cont).getvidas());
            System.out.println("\t Nivel:" + supervivientes.get(cont).getnivel());
            System.out.println("\t Skills:" + supervivientes.get(cont).getskills().name());
            System.out.println("\t Arma:" + supervivientes.get(cont).getarma().gettipo().name());
            System.out.println("\t Daño:" + supervivientes.get(cont).getarma().getdanyo());
            System.out.println("\t Distancia:" + supervivientes.get(cont).getarma().getdistancia());
        }
    }

    //Se muestran los zombies
    private static void mostrarzombis() {
        for (int cont = 0; cont < zombis.size(); cont++) {
            System.out.println("Zombie " + (cont + 1) + ":");
            System.out.println("\t Daño:" + zombis.get(cont).getDanyo());
            System.out.println("\t TipoZombie:" + zombis.get(cont).getClass().getName());
            System.out.println("\t Movimiento:" + zombis.get(cont).getMovimiento());
            System.out.println("\t Horda:");
            System.out.println("\t \t Respawn:" + zombis.get(cont).getHorda().getRespawn());
        }
    }

}
