package projetovideo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProjetoVideo {
    public static void main(String[] args) {

       /* List<String> Video = new ArrayList<>();
        Video.add("Aula 1 de Poo");
        Video.add("Aula 12 de PHP");
        Video.add("Aula 10 de HTML");

       List<String> novoVideo = Video.stream()
                .filter(nome -> nome.startsWith("A"))
                .map(nome -> nome.toUpperCase())
                .collect(Collectors.toList());
               System.out.println(novoVideo);*/

     Video v[] = new Video[7];
     v[0] = new Video("Como Aprender Java em 7 dias");
     v[1] = new Video("Como Ficar Rico ");
     v[2] = new Video("Porque Java é tão dificil?");
     v[3] = new Video("Como Entra no Melhor dos Mundos");
     v[4] = new Video("Da onde surgiu a POO");
     v[5] = new Video("Programar é Difícil?");
     v[6] = new Video("Como ser Efetivado");

    Usuario u[] = new Usuario[5];
    u[0] = new Usuario("Goku",25,"M","GekiDama");
    u[1] = new Usuario("Kratos",40,"M","Esparta");
    u[2] = new Usuario("Pamela Voorhees",50,"F","FaçaIssoFilho");
    u[3] = new Usuario("Luffy", 22,"M","GomoGomo");
    u[4] = new Usuario("Bob Marley",45,"M","BaseadoEmPoo");



     System.out.println("Videos Disponivéis na FAKEFLIX\n------------------------------------------------------------");
     System.out.println(v[0].toString());
     System.out.println(v[1].toString());
     System.out.println(v[2].toString());
     System.out.println(v[3].toString());
     System.out.println(v[4].toString());
     System.out.println(v[5].toString());
     System.out.println(v[6].toString());

     System.out.println("\nUsuários Cadastrados na  FAKEFLIX\n----------------------------------------------------");
     System.out.println(u[0].toString());
     System.out.println(u[1].toString());
     System.out.println(u[2].toString());
     System.out.println(u[3].toString());
     System.out.println(u[4].toString());


     System.out.println("\nVisualição dos Usuários e suas Avaliações: ");
     Visualizacao visu[] = new Visualizacao[5];
     visu[0] = new Visualizacao(u[2], v[4]);
     visu[0].avaliar();

     visu[1] = new Visualizacao(u[0], v[2]);
     visu[0].avaliar(90.0F);
     System.out.println("--------------------------------------Informações----------------------------------------");
     System.out.println(visu[0].toString());
     System.out.println();
     System.out.println("--------------------------------------Informações----------------------------------------");
     visu[2] = new Visualizacao(u[1],v[3]);
     visu[2].avaliar(80.0F);
     System.out.println(visu[2]);
        System.out.println();
     System.out.println("---------------------------------------Informações---------------------------------------");
      visu[3] = new Visualizacao(u[3],v[6]);
      visu[3].avaliar(90.0F);
      System.out.println(visu[3]);





/*
     System.out.println(v[0].toString());
     System.out.println(u[0].toString());*/




    }
}
