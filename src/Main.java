import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static Date date = new Date();
    public static Calendar aux = Calendar.getInstance();
    public static Scanner sc = new Scanner(System.in);
    public static Car cars[] = new Car[100];
    public static Bike bikes[] = new Bike[200];

    public static void main(String[] args) {

        menu();

    }

    public static void menu() {
        int menu = 0;
        while (menu != 2) {
            System.out.println("Welcome to Unicentro, what do you want to do?" +
                    "\n1. Enter" +
                    "\n2. Exit menu");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    System.out.println("--------------------" +
                            "\nPlease insert your plate");
                    String plate = sc.nextLine();
                    if (Character.isDigit(plate.charAt(plate.length() - 1))) {
                        if (plate.charAt(0) == 'A' || plate.charAt(0) == 'M') {
                            if (aux.get(Calendar.HOUR_OF_DAY) <  14 && aux.get(Calendar.HOUR_OF_DAY) >= 7) {
                                System.out.println("--------------------" +
                                        "\nPlease insert your id");
                                String id = sc.nextLine();
                                if (id.charAt(id.length() - 1) == 0 || id.charAt(id.length() - 1) == 1) {
                                    if (aux.getMinimum(Calendar.DAY_OF_WEEK) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Car car = new Car(plate, id);
                                        for (int i = 0; i <= cars.length; i++) {
                                            if (cars[i] == null) {
                                                cars[i] = car;
                                                System.out.println("The car entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 2 || id.charAt(id.length() - 1) == 3) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 1) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Car car = new Car(plate, id);
                                        for (int i = 0; i <= cars.length; i++) {
                                            if (cars[i] == null) {
                                                cars[i] = car;
                                                System.out.println("The car entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 4 || id.charAt(id.length() - 1) == 5) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 2) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Car car = new Car(plate, id);
                                        for (int i = 0; i <= cars.length; i++) {
                                            if (cars[i] == null) {
                                                cars[i] = car;
                                                System.out.println("The car entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 6 || id.charAt(id.length() - 1) == 7) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 3) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Car car = new Car(plate, id);
                                        for (int i = 0; i <= cars.length; i++) {
                                            if (cars[i] == null) {
                                                cars[i] = car;
                                                System.out.println("The car entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 8 || id.charAt(id.length() - 1) == 9) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 4) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Car car = new Car(plate, id);
                                        for (int i = 0; i <= cars.length; i++) {
                                            if (cars[i] == null) {
                                                cars[i] = car;
                                                System.out.println("The car entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (plate.charAt(0) == 'N' || plate.charAt(0) == 'Z'){
                            if (aux.get(Calendar.HOUR_OF_DAY) <= 22 && aux.get(Calendar.HOUR_OF_DAY) >= 14) {
                                System.out.println("--------------------" +
                                        "\nPlease insert your id");
                                String id = sc.nextLine();
                                if (id.charAt(id.length() - 1) == 0 || id.charAt(id.length() - 1) == 1) {
                                    if (aux.getMinimum(Calendar.DAY_OF_WEEK) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Car car = new Car(plate, id);
                                        for (int i = 0; i <= cars.length; i++) {
                                            if (cars[i] == null) {
                                                cars[i] = car;
                                                System.out.println("The car entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 2 || id.charAt(id.length() - 1) == 3) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 1) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Car car = new Car(plate, id);
                                        for (int i = 0; i <= cars.length; i++) {
                                            if (cars[i] == null) {
                                                cars[i] = car;
                                                System.out.println("The car entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 4 || id.charAt(id.length() - 1) == 5) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 2) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Car car = new Car(plate, id);
                                        for (int i = 0; i <= cars.length; i++) {
                                            if (cars[i] == null) {
                                                cars[i] = car;
                                                System.out.println("The car entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 6 || id.charAt(id.length() - 1) == 7) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 3) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Car car = new Car(plate, id);
                                        for (int i = 0; i <= cars.length; i++) {
                                            if (cars[i] == null) {
                                                cars[i] = car;
                                                System.out.println("The car entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 8 || id.charAt(id.length() - 1) == 9) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 4) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Car car = new Car(plate, id);
                                        for (int i = 0; i <= cars.length; i++) {
                                            if (cars[i] == null) {
                                                cars[i] = car;
                                                System.out.println("The car entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println("The car do not entered");
                    } else {
                        char x = plate.charAt(3);
                        char y = plate.charAt(4);
                        String z = "" + x + "" + y;
                        if (z.equalsIgnoreCase("00") || z.equalsIgnoreCase("49")) {
                            if (aux.get(Calendar.HOUR_OF_DAY) >= 7 && aux.get(Calendar.HOUR_OF_DAY) < 14) {
                                System.out.println("--------------------" +
                                        "\nPlease insert your id");
                                String id = sc.nextLine();
                                if (id.charAt(id.length() - 1) == 0 || id.charAt(id.length() - 1) == 1) {
                                    if (aux.getMinimum(Calendar.DAY_OF_WEEK) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Bike bike = new Bike(plate, id);
                                        for (int i = 0; i <= bikes.length; i++) {
                                            if (bikes[i] == null) {
                                                bikes[i] = bike;
                                                System.out.println("The bike entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 2 || id.charAt(id.length() - 1) == 3) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 1) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Bike bike = new Bike(plate, id);
                                        for (int i = 0; i <= bikes.length; i++) {
                                            if (bikes[i] == null) {
                                                bikes[i] = bike;
                                                System.out.println("The bike entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 4 || id.charAt(id.length() - 1) == 5) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 2) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Bike bike = new Bike(plate, id);
                                        for (int i = 0; i <= bikes.length; i++) {
                                            if (bikes[i] == null) {
                                                bikes[i] = bike;
                                                System.out.println("The bike entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 6 || id.charAt(id.length() - 1) == 7) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 3) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Bike bike = new Bike(plate, id);
                                        for (int i = 0; i <= bikes.length; i++) {
                                            if (bikes[i] == null) {
                                                bikes[i] = bike;
                                                System.out.println("The bike entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 8 || id.charAt(id.length() - 1) == 9) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 4) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Bike bike = new Bike(plate, id);
                                        for (int i = 0; i <= bikes.length; i++) {
                                            if (bikes[i] == null) {
                                                bikes[i] = bike;
                                                System.out.println("The bike entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (z.equalsIgnoreCase("50") || z.equalsIgnoreCase("99")) {
                            if (aux.get(Calendar.HOUR_OF_DAY) >= 14 && aux.get(Calendar.HOUR_OF_DAY) <= 22) {
                                System.out.println("--------------------" +
                                        "\nPlease insert your id");
                                String id = sc.nextLine();
                                if (id.charAt(id.length() - 1) == 0 || id.charAt(id.length() - 1) == 1) {
                                    if (aux.getMinimum(Calendar.DAY_OF_WEEK) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Bike bike = new Bike(plate, id);
                                        for (int i = 0; i <= bikes.length; i++) {
                                            if (bikes[i] == null) {
                                                bikes[i] = bike;
                                                System.out.println("The bike entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 2 || id.charAt(id.length() - 1) == 3) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 1) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Bike bike = new Bike(plate, id);
                                        for (int i = 0; i <= bikes.length; i++) {
                                            if (bikes[i] == null) {
                                                bikes[i] = bike;
                                                System.out.println("The bike entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 4 || id.charAt(id.length() - 1) == 5) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 2) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Bike bike = new Bike(plate, id);
                                        for (int i = 0; i <= bikes.length; i++) {
                                            if (bikes[i] == null) {
                                                bikes[i] = bike;
                                                System.out.println("The bike entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 6 || id.charAt(id.length() - 1) == 7) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 3) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Bike bike = new Bike(plate, id);
                                        for (int i = 0; i <= bikes.length; i++) {
                                            if (bikes[i] == null) {
                                                bikes[i] = bike;
                                                System.out.println("The bike entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (id.charAt(id.length() - 1) == 8 || id.charAt(id.length() - 1) == 9) {
                                    if ((aux.getMinimum(Calendar.DAY_OF_WEEK) + 4) != aux.get(Calendar.DAY_OF_WEEK)) {
                                        Bike bike = new Bike(plate, id);
                                        for (int i = 0; i <= bikes.length; i++) {
                                            if (bikes[i] == null) {
                                                bikes[i] = bike;
                                                System.out.println("The bike entered");
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        System.out.println("The bike do not entered");
                    }
                    break;
                case 2:
                    System.out.println("Exiting...");
                    break;
            }
        }
    }
}