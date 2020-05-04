package jogo_da_forca;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class jogoForca {

	private static Scanner s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cores = new ArrayList<String>();
		cores.add("ab�bora");
		cores.add("�gua");
		cores.add("�gua-marinha");
		cores.add("�gua-marinha m�dia");
		cores.add("alizarim");
		cores.add("amarelo");
		cores.add("amarelo claro");
		cores.add("amarelo esverdeado");
		cores.add("amarelo ouro claro");
		cores.add("amarelo queimado");
		cores.add("�mbar");
		cores.add("ameixa");
		cores.add("ametista");
		cores.add("am�ndoa");
		cores.add("aspargo");
		cores.add("azul");
		cores.add("azul alice");
		cores.add("azul ard�sia");
		cores.add("azul areado");
		cores.add("azul a�o");
		cores.add("azul cadete");
		cores.add("azul camarada");
		cores.add("azul celeste");
		cores.add("azul claro");
		cores.add("azul cobalto");
		cores.add("azul c�u");
		cores.add("azul escuro");
		cores.add("azul flor de milho");
		cores.add("azul furtivo");
		cores.add("azul manteiga");
		cores.add("azul marinho");
		cores.add("azul meia-noite");
		cores.add("azul m�dio");
		cores.add("azul petr�leo");
		cores.add("azul p�lvora");
		cores.add("azul real");
		cores.add("azul violeta");
		cores.add("a�afr�o");
		cores.add("bege");
		cores.add("bord�");
		cores.add("borgonha");
		cores.add("branco");
		cores.add("branco antigo");
		cores.add("branco fantasma");
		cores.add("branco floral");
		cores.add("branco fuma�a");
		cores.add("branco navajo");
		cores.add("bronze");
		cores.add("caqui");
		cores.add("cardo");
		cores.add("carmesim");
		cores.add("castanho avermelhado");
		cores.add("castanho claro");
		cores.add("cenoura");
		cores.add("cereja");
		cores.add("chocolate");
		cores.add("ciano claro");
		cores.add("ciano escuro");
		cores.add("cinza");
		cores.add("cinza ard�sia");
		cores.add("cinza ard�sia claro");
		cores.add("cinza ard�sia escuro");
		cores.add("cinza claro");
		cores.add("cinza escuro");
		cores.add("cinza fosco");
		cores.add("cinza m�dio");
		cores.add("cobre");
		cores.add("concha");
		cores.add("coral");
		cores.add("coral claro");
		cores.add("couro");
		cores.add("creme");
		cores.add("creme de marisco");
		cores.add("creme de menta");
		cores.add("caqui escuro");
		cores.add("damasco");
		cores.add("dourado");
		cores.add("dourado escuro");
		cores.add("dourado p�lido");
		cores.add("escarlate");
		cores.add("esmeralda");
		cores.add("feldspato");
		cores.add("ferrugem");
		cores.add("fuligem");
		cores.add("f�chsia");
		cores.add("gren�");
		cores.add("hortel�");
		cores.add("�ndigo");
		cores.add("jade");
		cores.add("jambo");
		cores.add("laranja");
		cores.add("laranja escuro");
		cores.add("lavanda");
		cores.add("lavanda avermelhada");
		cores.add("lil�s");
		cores.add("lima");
		cores.add("lim�o");
		cores.add("linho");
		cores.add("loiro");
		cores.add("madeira");
		cores.add("magenta");
		cores.add("magenta escuro");
		cores.add("malva");
		cores.add("mam�o batido");
		cores.add("man�");
		cores.add("marfim");
		cores.add("marrom");
		cores.add("marrom amarelado");
		cores.add("marrom claro");
		cores.add("marrom rosado");
		cores.add("marrom sela");
		cores.add("milho");
		cores.add("milho Claro");
		cores.add("mocassim");
		cores.add("mostarda");
		cores.add("naval");
		cores.add("neve");
		cores.add("ocre");
		cores.add("oliva");
		cores.add("oliva escura");
		cores.add("oliva parda");
		cores.add("orqu�dea");
		cores.add("orqu�dea escura");
		cores.add("orqu�dea m�dia");
		cores.add("ouro");
		cores.add("prata");
		cores.add("preto");
		cores.add("p�rpura");
		cores.add("rosa");
		cores.add("rosa claro");
		cores.add("rosa emba�ado");
		cores.add("roxo");
		cores.add("r�tilo");
		cores.add("salm�o");
		cores.add("salm�o claro");
		cores.add("salm�o escuro");
		cores.add("seda");
		cores.add("siena");
		cores.add("s�pia");
		cores.add("tan");
		cores.add("terracota");
		cores.add("tijolo refrat�rio");
		cores.add("tomate");
		cores.add("trigo");
		cores.add("tri�ssico");
		cores.add("turquesa");
		cores.add("turquesa escura");
		cores.add("turquesa m�dia");
		cores.add("turquesa p�lida");
		cores.add("irucum");
		cores.add("verde");
		cores.add("verde espectro");
		cores.add("verde amarelado");
		cores.add("verde claro");
		cores.add("verde escuro");
		cores.add("verde floresta");
		cores.add("verde fluorescente");
		cores.add("verde lima");
		cores.add("verde grama");
		cores.add("verde mar claro");
		cores.add("verde mar escuro");
		cores.add("verde mar m�dio");
		cores.add("verde militar");
		cores.add("verde Paris");
		cores.add("verde primavera");
		cores.add("verde p�lido");
		cores.add("verde-azulado");
		cores.add("vermelho");
		cores.add("vermelho escuro");
		cores.add("vermelho indiano");
		cores.add("vermelho violeta");
		cores.add("vermelho violeta p�lido");
		cores.add("violeta");
		cores.add("violeta escuro");
		
		Random rand = new Random();
	    String randomElement = cores.get(rand.nextInt(cores.size()));
	    s = new Scanner(System.in);
	   
	    for(int i = 0; i < randomElement.length(); i++) {
	    System.out.print("_ ");
	    }
	    
	    char[] chAux = new char[randomElement.length()];
	    char[] chAux2 = new char[(randomElement.length())*2];
	    
	    for (int i = 0; i < randomElement.length(); i++) { 
            chAux[i] = randomElement.charAt(i); 
        }
	    
	    int count = 0;
	    for (int i = 0; i < chAux.length; i++) {
    		chAux2[count] = "_".charAt(0);
    		chAux2[count+1] = " ".charAt(0);
    		count = count + 2;;
	    }
	    
	    while(true) {
		    System.out.println();
		    System.out.println("Entre com uma letra:");
		    
		    String letra = s.nextLine();
		    
		    int count2 = 0;
		    for (char c : chAux) {
		    	if (Character.toString(c).equals(letra)) {
		    		if(Character.toString(chAux2[count2]).equals("_")) {
			    		chAux2[count2] = letra.charAt(0);
			    		chAux2[count2+1] = " ".charAt(0);
		    		}
		    	}
		    	count2 = count2 + 2;
	        }
		    
	        for (char c : chAux2) { 
	            System.out.print(c); 
	        }
	    }
	}    

}
