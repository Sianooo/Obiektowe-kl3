import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Tank> Tank = new ArrayList<>();
        Tank tank = new Tank("T-26");
        Tank tank1 = new Tank("M4 Sherman");
        Tank tank2 = new Tank("T26 Super Pershing");
        Tank tank3 = new Tank("M1 Abrams ");

        Tank.add(tank);
        Tank.add(tank1);
        Tank.add(tank2);
        Tank.add(tank3);

//        System.out.println("Nowy dowodca: "+Tank.get(0));
//        Tank.set(0,"Piotr Kowalski");


        ArrayList<Soldier> Soldier = new ArrayList<>();
        Soldier soldiers = new Soldier("Maciek");
        Soldier soldiers1 = new Soldier("Rafal");
        Soldier soldiers2 = new Soldier("Patryk");
        Soldier soldiers3 = new Soldier("Igor");
        Soldier soldiers4 = new Soldier("Dawid");
        Soldier soldiers5 = new Soldier("Karol");
        Soldier soldiers6 = new Soldier("Natalia");
        Soldier soldiers7 = new Soldier("Magda");
        Soldier soldiers8 = new Soldier("Kamil");
        Soldier soldiers9 = new Soldier("Maciek");
        Soldier soldiers10 = new Soldier("Aleksander");
        Soldier soldiers11 = new Soldier("Kacper");


        tank.Team.add(soldiers);
        tank.Team.add(soldiers1);
        tank.Team.add(soldiers2);

        tank1.Team.add(soldiers3);
        tank1.Team.add(soldiers4);
        tank1.Team.add(soldiers5);

        tank2.Team.add(soldiers6);
        tank2.Team.add(soldiers7);
        tank2.Team.add(soldiers8);

        tank3.Team.add(soldiers9);
        tank3.Team.add(soldiers10);
        tank3.Team.add(soldiers11);


//        for (int i = 0; i < Tank.size(); i++) {
//            Tank tanks = Tank.get(i);
//            System.out.println("Tank: " + tanks.tankName);
//
//            for (int j = 0; j < tanks.Team.size(); j++) {
//                Soldier soldier = tanks.Team.get(j);
//                System.out.println("   Soldier: " + soldier.name);
//            }
//        }
//
//        System.out.println();
//        System.out.println();
//
//        for (Tank tanks : Tank) {
//           // tanks.Team.removeFirst();
//            System.out.println(tanks.tankName);
//
//            for (Soldier soldier : tanks.Team) {
//                System.out.println("   " + soldier.name);
//            }
//        }

        System.out.println();
        System.out.println();

        ArrayList<String> nowyDowodca = new ArrayList<>();
        nowyDowodca.add("Piotr Kowalski");
        nowyDowodca.add("Jan Nowak");
        nowyDowodca.add("Grzegorz Podolski");
        nowyDowodca.add("Stanislaw Skokolski");


        for (int i = 0; i < Tank.size(); i++) {
            Tank tanks = Tank.get(i);
            System.out.println("Tank: " + tanks.tankName);

            for (int j = 0; j < tanks.Team.size(); j++) {
                Soldier soldier = tanks.Team.get(j);
                System.out.println("   Soldier: " + soldier.name);
            }
        }

        System.out.println();
        System.out.println();

        for (Tank tanks : Tank) {
            // tanks.Team.removeFirst();
            System.out.println(tanks.tankName);
            System.out.println("Poprzedni dowodca: " + tanks.Team.get(0).name);
            tanks.Team.set(0, new Soldier(nowyDowodca.get(0)));
            nowyDowodca.removeFirst();
            System.out.println("Nowy dowodca: " + tanks.Team.get(0).name);
            for (int i = 1; i < tanks.Team.size(); i++) {
                System.out.println("   " + tanks.Team.get(i).name);
            }
        }

        Tank.clear();
        System.out.println(Tank);

        ArrayList<Pocisk> bullet = new ArrayList<>();
        bullet.ensureCapacity(100000);


        ArrayList<Pocisk> magazynAmunicji = new ArrayList<>();
        System.out.println("Czy magazyn masz pusty? "+magazynAmunicji.isEmpty());
        Pocisk pocisk= new Pocisk();
        for (int i = 0; i < 100000; i++) {
            System.out.println("Czy magazyn masz pusty? "+magazynAmunicji.isEmpty());
            magazynAmunicji.add(Pocisk);
            System.out.println("Czy magazyn masz pusty? "+magazynAmunicji.isEmpty());
            magazynAmunicji.add(Pocisk);
        }
    }
}




