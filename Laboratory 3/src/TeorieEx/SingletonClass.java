package TeorieEx;

public class SingletonClass {
    // instanta este statica pentru a fi initializata o singura
    // data in memorie

    private static SingletonClass instance;
    // constructorul este privat pentru a nu putea sa facem
    // instante noi ale clasei din exteriorul clasei

    private SingletonClass(){}
    // metoda prin care returnam prima instanta existenta a clasei
    // de fiecare data cand avem nevoie de acest obiect

    public static SingletonClass getInstance(){
    //daca nu a fost instantiata niciodata clasa o instantiem
        if(instance == null){
            System.out.println("Initializare singleton");
            return instance = new SingletonClass();
        }

        // in caz contrar returnam prima instanta existenta
        System.out.println("Returnare isntanta initiala singleton");
        return instance;
    }
}