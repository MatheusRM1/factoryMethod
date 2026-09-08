package org.example;

public class RoupaFactory {

    public static Roupa obterRoupa(String roupa) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.Roupa" + roupa);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Roupa inexistente");
        }
        if (!(objeto instanceof Roupa)) {
            throw new IllegalArgumentException("Roupa invalida");
        }
        return (Roupa) objeto;
    }
}
