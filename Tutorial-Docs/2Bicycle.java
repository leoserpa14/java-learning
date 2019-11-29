

class Bike {

    int cadence = 0;
    int vel = 0;
    int gear = 1;

    // Criação dos métodos dentro da classe (funções)
    void trocarMarcha(int novaMarcha) {
        gear = novaMarcha;
    }

    void acelerar(int novaVel) {
        vel = vel + novaVel;
    }

    void trocarCadence(int novaCadence) {
        cadence = novaCadence;
    }

    void printStates() {
        System.out.println("Cadence: " + cadence + ", velocidade: " + vel + ", marcha: " + gear + ".");
    }


}



class BicycleApp{
    public static void main(String[] args) {
        
        // Criando novos objetos da classe Bike
        Bike bike1 = new Bike();
        Bike bike2 = new Bike();

        // Chamando os metodos (funções) de cada objeto
        bike1.trocarCadence(50);
        bike1.trocarMarcha(3);
        bike1.acelerar(15);
        bike1.printStates();

        bike2.trocarCadence(30);
        bike2.trocarMarcha(6);
        bike2.acelerar(55);
        bike2.printStates();
        
    }
}

/* You can create a 'Interface' for a class, the Interface may contain a set of methods that will
be required to be implemented inside the classes created with that interface, such as:

interface Bicycle {

    void changeCadence(int newValue);

    void changeGear(int newValue);
}

class ACMEBicycle implements Bicycle {

    int cadence = 0;
    int speed = 0;
    int gear = 1;

   // The compiler will now require that methods
   // changeCadence, changeGear, speedUp, and applyBrakes
   // all be implemented. Compilation will fail if those
   // methods are missing from this class.

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }
   }
}
Note: To actually compile the ACMEBicycle class, you'll need to add the public 
keyword to the beginning of the implemented interface methods */
 