package org.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Student {
    private int StudentID;
    private String FirstName;
    private String LastName;
    private int Age;
    private String Grade ;
    private String FavoriteSubject ;

    @Override
    public  String toString(){
        return "Alumno{" +
                "id = " + StudentID +
                ", Nombre = " + FirstName +
                ", Apeido = " + LastName +
                ", Edad = " + Age +
                ", Grado = " + Grade +
                ", Materia favorita = " + FavoriteSubject +
                '}';
    }

}
