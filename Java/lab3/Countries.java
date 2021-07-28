
public class Countries {

    public static void main(String[] args) {

        Country Ukraine = new Country();
        Ukraine.title = "Україна";
        Ukraine.capital = "Київ";
        Ukraine.currency = "UAH";
        Ukraine.population = 37000000;
        
        Country England = new Country();
        England.title = "Англія";
        England.capital = "Лондон";
        England.currency = "Pound sterling";
        England.population = 56000000;


        
        if(England.population > Ukraine.population){
            System.out.println("Населення Англії більше");
        } else {
            System.out.println("Населення України більше");
        }

        Country Germany = new Country();
        Germany.title = "Німечинна";
        Germany.capital = "Берлін";
        Germany.currency = "Євро";
        Germany.population = 82000000;

        Ukraine = Germany;
        
        Ukraine.capital = "Варшава";

        System.out.println(
            "Країна: " + Ukraine.title    + '\n' + 
            "Столиця: " + Ukraine.capital + '\n' +      
            "Валюта: " + Ukraine.currency + '\n' + 
            "Населення: " + Ukraine.population + '\n');
    }
    
}
