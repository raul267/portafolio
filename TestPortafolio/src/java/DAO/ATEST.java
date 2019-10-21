
package DAO;

import model.Rubro;

public class ATEST {
    public static void main(String... args){
        new DaoRubro().insert(new Rubro(6, "hola"));
    }
}
